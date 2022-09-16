package defpackage;
/* compiled from: PG */
/* renamed from: whm  reason: default package */
/* loaded from: classes4.dex */
public final class whm implements amca {
    final /* synthetic */ ankw a;
    final /* synthetic */ vzv b;
    private final /* synthetic */ int c;

    public whm(ankw ankwVar, vzv vzvVar) {
        this.a = ankwVar;
        this.b = vzvVar;
    }

    public whm(ankw ankwVar, vzv vzvVar, int i) {
        this.c = i;
        this.a = ankwVar;
        this.b = vzvVar;
    }

    @Override // defpackage.amca
    public final ankt a() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return this.a.qp(ammo.g(new whl(this.b, 1)));
            }
            return this.a.qp(ammo.g(new whl(this.b, 2)));
        }
        return this.a.qp(ammo.g(new whl(this.b)));
    }
}
