package hometasks.task4;

public class DocumentWorker {

    void openDocument(){
        System.out.println("Документ открыт");
    }
    void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }
    void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");
    }

}

class ProDocumentWorker extends DocumentWorker{

    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        super.editDocument();
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
