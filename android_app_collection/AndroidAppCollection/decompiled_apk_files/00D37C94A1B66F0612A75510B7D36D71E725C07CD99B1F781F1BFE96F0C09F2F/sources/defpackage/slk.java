package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: slk  reason: default package */
/* loaded from: classes4.dex */
public final class slk implements ankb {
    final /* synthetic */ String a;

    public slk(String str) {
        this.a = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((amzw) ((amzw) ((amzw) sll.a.g()).h(th)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$2", "onFailure", 198, "AssistantConnector.java")).s("Future [%s] FAILED", this.a);
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        ((amzw) ((amzw) sll.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$2", "onSuccess", 193, "AssistantConnector.java")).s("Future [%s] SUCCESS", this.a);
    }
}
