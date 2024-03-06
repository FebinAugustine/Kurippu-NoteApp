# KurippuTheNoteApp
This is a Note App repository. This app repo will help you learn Room DB. This is an Android Kotlin Jetpack Compose Material 3. based project.

This is how the process went:
# Kurippu The Note App.

# Stage 1: 
Dependencies added.

# Stage 2: 
MVVM based Clean Architecture Project structure created.

# Stage 3:
    •	Part 1
      a.	Data class Model Entity created for db.
      b.	Dao interface created. Defined DB queries.
      c.	Abstract class for defining Database created. 
      
    •	Part 2: NoteRepository.kt and NoteRepositoryImpl.kt added in domain/repository and data/repository respectively.
    
    •	Part 3: Created use case, which contains business logics, along with utility files to sort.
    
    •	Part 4: Dagger Hilt Dependency Injection implementation. Application class created. Added App name to manifest file. Created note module as object.
    
    •	Part 5: View model creation. Unlike in plain MVVM the role now is to take the results from use cases in states and display it in UI. View model class created. NoteState and NoteEvents files created. Defined UI events. Add new AddNoteUseCase file. Also added a class inside Note model. Now Data and domain layer almost finished. We will go to Stage 4.

# Stage 4: 
  UI STARTING

