package defpackage;
/* compiled from: PG */
/* renamed from: lir  reason: default package */
/* loaded from: classes7.dex */
public final class lir implements lil {
    private final bvjj a;
    private boolean b;

    public lir(bvjj bvjjVar) {
        this.a = bvjjVar;
        this.b = bvjjVar.m(bvjk.ks, false);
    }

    @Override // defpackage.lil
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.lil
    public final boolean b() {
        return !this.b;
    }

    @Override // defpackage.lil
    public final void c() {
    }

    @Override // defpackage.lil
    public final void d(boolean z) {
    }

    @Override // defpackage.lil
    public final void e() {
        this.b = !this.b;
        this.a.S(bvjk.ks, this.b);
    }

    @Override // defpackage.lil
    public final void f() {
    }
}
