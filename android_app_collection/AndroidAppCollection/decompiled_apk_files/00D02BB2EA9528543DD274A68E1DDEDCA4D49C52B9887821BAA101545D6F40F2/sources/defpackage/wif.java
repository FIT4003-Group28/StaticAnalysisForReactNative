package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wif  reason: default package */
/* loaded from: classes7.dex */
public final class wif implements wgj {
    public boolean a;
    final /* synthetic */ wig b;

    public wif(wig wigVar, boolean z) {
        this.b = wigVar;
        this.a = z;
    }

    private final degu<Void> f(boolean z) {
        return new wie(this, z);
    }

    @Override // defpackage.wgj
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.wgj
    public final String b() {
        return this.b.c.a();
    }

    @Override // defpackage.wgj
    public final dqvj c() {
        return this.b.c.b().c();
    }

    @Override // defpackage.wgj
    public final dehn<Void> d() {
        this.a = true;
        wig wigVar = this.b;
        dehn<Void> a = wigVar.a.a(wigVar.c);
        deha.q(a, f(false), this.b.b);
        return a;
    }

    @Override // defpackage.wgj
    public final dehn<Void> e() {
        this.a = false;
        wig wigVar = this.b;
        dehn<Void> b = wigVar.a.b(wigVar.c.a());
        deha.q(b, f(true), this.b.b);
        return b;
    }
}
