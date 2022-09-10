package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zir  reason: default package */
/* loaded from: classes7.dex */
public final class zir implements bbb {
    final /* synthetic */ ziv a;
    private boolean b = false;

    public zir(ziv zivVar) {
        this.a = zivVar;
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        int i3;
        ziv zivVar;
        this.a.c.a(i, f, i2);
        ziv zivVar2 = this.a;
        float f2 = zivVar2.f;
        zivVar2.f = i + f;
        double d = f2;
        if (Math.ceil(d) == Math.ceil(this.a.f) && Math.floor(d) == i) {
            return;
        }
        this.a.n(true);
        btpf c = btpf.c(this.a.b);
        if ((c.e && c.f) || (i3 = i + 1) >= this.a.d.size()) {
            return;
        }
        int i4 = this.a.e;
        if (i4 != i && i4 != i3) {
            return;
        }
        double ceil = i4 == i ? Math.ceil(zivVar.f) : Math.floor(zivVar.f);
        ziv zivVar3 = this.a;
        zit zitVar = zivVar3.d.get(zivVar3.e);
        zit zitVar2 = this.a.d.get((int) ceil);
        if (zitVar.j().booleanValue()) {
            return;
        }
        if (zitVar2.j().booleanValue()) {
            this.a.g.g(zitVar.b.s(), zitVar2.b.s(), this.b);
        } else {
            this.a.g.d(zitVar.b.s(), this.b);
        }
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        this.a.c.b(i);
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        this.a.c.c(i);
        if (i == 0) {
            this.b = false;
        } else if (i != 1) {
        } else {
            this.b = true;
        }
    }
}
