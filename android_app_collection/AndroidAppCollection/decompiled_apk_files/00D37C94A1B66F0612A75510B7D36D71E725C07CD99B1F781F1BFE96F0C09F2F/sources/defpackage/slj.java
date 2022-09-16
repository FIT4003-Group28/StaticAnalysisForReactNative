package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: slj  reason: default package */
/* loaded from: classes4.dex */
public final class slj implements ankb {
    final /* synthetic */ amqo a;
    final /* synthetic */ amqo b;
    final /* synthetic */ sll c;

    public slj(sll sllVar, amqo amqoVar, amqo amqoVar2) {
        this.c = sllVar;
        this.a = amqoVar;
        this.b = amqoVar2;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((amzw) ((amzw) ((amzw) sll.a.f()).h(th)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onFailure", '9', "AssistantConnector.java")).q("Couldn't read whether gRPC is supported from public value");
        ((amzw) ((amzw) sll.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onFailure", 59, "AssistantConnector.java")).q("Fallback to Maestro connector");
        this.c.c.o(this.b.get());
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((amzw) ((amzw) sll.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onSuccess", 46, "AssistantConnector.java")).q("Use gRPC connector");
            this.c.c.o(this.a.get());
            this.c.b = dwg.APP_INTEGRATION_GRPC_MIC_TAP;
            return;
        }
        ((amzw) ((amzw) sll.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onSuccess", 50, "AssistantConnector.java")).q("Use Maestro connector");
        this.c.c.o(this.b.get());
    }
}
