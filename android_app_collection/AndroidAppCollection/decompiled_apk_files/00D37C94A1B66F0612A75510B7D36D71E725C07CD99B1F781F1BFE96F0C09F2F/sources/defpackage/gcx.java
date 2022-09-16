package defpackage;
/* compiled from: PG */
/* renamed from: gcx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gcx implements Runnable {
    public final /* synthetic */ gde a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcx(gde gdeVar) {
        this.a = gdeVar;
    }

    public /* synthetic */ gcx(gde gdeVar, int i) {
        this.b = i;
        this.a = gdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            gde gdeVar = this.a;
            if (!elk.h(gdeVar.k)) {
                return;
            }
            gdeVar.k.b().d(-1, -1);
            return;
        }
        gde gdeVar2 = this.a;
        gcs gcsVar = gdeVar2.p;
        if (gcsVar != null) {
            gcsVar.a.r = true;
        }
        gdeVar2.a.moveTaskToBack(false);
    }
}
