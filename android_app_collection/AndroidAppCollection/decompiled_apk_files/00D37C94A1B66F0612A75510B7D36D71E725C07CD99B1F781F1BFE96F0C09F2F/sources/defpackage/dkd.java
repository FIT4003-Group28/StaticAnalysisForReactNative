package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkd  reason: default package */
/* loaded from: classes3.dex */
public final class dkd {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dlc d;

    public dkd(dlc dlcVar, int i, int i2, int i3) {
        this.d = dlcVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean a(int i) {
        dlc dlcVar = this.d;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        synchronized (dlcVar) {
            if (i4 != dlcVar.b.size()) {
                return false;
            }
            diz dizVar = (diz) dlcVar.b.get(i);
            if (dizVar.d().k()) {
                return true;
            }
            int o = dlcVar.o(dizVar);
            int n = dlcVar.n(dizVar);
            if ((i < i2 && !dizVar.d().i()) || i > i3) {
                if (czu.y()) {
                    dlc.x(dizVar);
                    return true;
                }
                dlcVar.g.post(new dke(dizVar));
                return true;
            } else if (dizVar.r(o, n)) {
                return true;
            } else {
                dizVar.g(dlcVar.f, o, n);
                return true;
            }
        }
    }
}
