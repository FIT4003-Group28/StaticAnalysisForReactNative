package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abig  reason: default package */
/* loaded from: classes.dex */
public final class abig implements ajql {
    final /* synthetic */ ajsm a;
    final /* synthetic */ abiq b;

    public abig(abiq abiqVar, ajsm ajsmVar) {
        this.b = abiqVar;
        this.a = ajsmVar;
    }

    private final void f() {
        abip abipVar = this.b.i;
        if (abipVar != null) {
            noy noyVar = (noy) abipVar;
            noyVar.j = this.a.size() > 0;
            noyVar.D();
        }
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        f();
    }

    @Override // defpackage.ajql
    public final void pi() {
        f();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        f();
        abhb abhbVar = this.b.g;
        if (abhbVar != null) {
            for (abko abkoVar : ((abhz) abhbVar).a) {
                abkoVar.b();
            }
        }
    }
}
