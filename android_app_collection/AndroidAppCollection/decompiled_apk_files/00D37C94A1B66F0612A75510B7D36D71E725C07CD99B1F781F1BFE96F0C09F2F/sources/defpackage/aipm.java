package defpackage;
/* compiled from: PG */
/* renamed from: aipm  reason: default package */
/* loaded from: classes.dex */
final class aipm extends Thread {
    final /* synthetic */ aipo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aipm(aipo aipoVar) {
        super("playerProxyUnregister");
        this.a = aipoVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        pwx pwxVar;
        try {
            Thread.sleep(500L);
            pwxVar = this.a.a;
        } catch (InterruptedException unused) {
            pwxVar = this.a.a;
        } catch (Throwable th) {
            this.a.a.c(0);
            throw th;
        }
        pwxVar.c(0);
    }
}
