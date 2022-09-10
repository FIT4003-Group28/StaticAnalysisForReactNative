package defpackage;
/* compiled from: PG */
/* renamed from: aez  reason: default package */
/* loaded from: classes2.dex */
final class aez extends ok {
    final /* synthetic */ int a;
    final /* synthetic */ afa b;
    private boolean c = false;

    public aez(afa afaVar, int i) {
        this.b = afaVar;
        this.a = i;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void b() {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    @Override // defpackage.ok, defpackage.oj
    public final void c() {
        this.b.a.setVisibility(0);
    }
}
