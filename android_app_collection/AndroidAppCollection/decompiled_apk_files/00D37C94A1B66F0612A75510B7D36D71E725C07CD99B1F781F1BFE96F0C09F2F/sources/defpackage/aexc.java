package defpackage;
/* compiled from: PG */
/* renamed from: aexc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aexc implements Runnable {
    public final /* synthetic */ aewx a;
    private final /* synthetic */ int b;

    public /* synthetic */ aexc(aewx aewxVar) {
        this.a = aewxVar;
    }

    public /* synthetic */ aexc(aewx aewxVar, int i) {
        this.b = i;
        this.a = aewxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.aa();
                return;
            } else {
                this.a.s.c(null);
                return;
            }
        }
        aewx aewxVar = this.a;
        long g = aewxVar.g();
        long f = aewxVar.f() - g;
        afbi afbiVar = aewxVar.i.n;
        if (afbiVar == null || !afbiVar.g().k(g, f)) {
            return;
        }
        aewxVar.X(afbiVar);
    }
}
