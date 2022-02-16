import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}



struct ContentView: View {
    var body: some View {
        Text(greet())
        Button("Click Me") {
            let task = Task {
                do {
                    print(try await Greeting().greetingAsync())
                } catch {
                    print(error)
                }
            }

            task.cancel()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
