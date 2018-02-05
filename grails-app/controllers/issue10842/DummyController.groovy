package issue10842

class DummyController {
    static allowedMethods = [
        bySession   : ['GET'],
        bySessionOld: ['GET']
    ]

    static responseFormats = ['json']

    def bySessionOld(String sessionId) {
        println "bySessionOld($sessionId)"

        respond incidentBySessieIdOld: sessionId
    }

    def bySession(String sessionId) {
        println "bySession($sessionId)"

        respond incidentBySessieId: sessionId
    }
}
