package defpackage;
/* compiled from: PG */
/* renamed from: bcrj  reason: default package */
/* loaded from: classes3.dex */
public final class bcrj implements akey {
    final /* synthetic */ dwfl a;
    final /* synthetic */ int b;
    final /* synthetic */ dqjh c;
    final /* synthetic */ bcrl d;

    public bcrj(bcrl bcrlVar, dwfl dwflVar, int i, dqjh dqjhVar) {
        this.d = bcrlVar;
        this.a = dwflVar;
        this.b = i;
        this.c = dqjhVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        this.d.b(this.a, this.b, this.c);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
