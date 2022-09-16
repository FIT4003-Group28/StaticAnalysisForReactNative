package defpackage;
/* compiled from: PG */
/* renamed from: aimj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aimj implements Runnable {
    public final /* synthetic */ aiml a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ aimj(aiml aimlVar, Exception exc) {
        this.a = aimlVar;
        this.b = exc;
    }

    public /* synthetic */ aimj(aiml aimlVar, Exception exc, int i) {
        this.c = i;
        this.a = aimlVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            aiml aimlVar = this.a;
            Exception exc = this.b;
            if (aimlVar.e) {
                return;
            }
            aimlVar.c.b(new aikd(4, true, 1, aimlVar.d.b(exc), exc, aimlVar.a.l()));
            return;
        }
        aiml aimlVar2 = this.a;
        Exception exc2 = this.b;
        if (aimlVar2.e) {
            return;
        }
        aimlVar2.c.f(new aikd(12, true, aimlVar2.d.b(exc2), exc2));
    }
}
