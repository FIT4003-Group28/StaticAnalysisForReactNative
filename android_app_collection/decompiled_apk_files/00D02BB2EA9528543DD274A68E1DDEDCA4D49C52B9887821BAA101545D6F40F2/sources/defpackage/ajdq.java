package defpackage;
/* compiled from: PG */
/* renamed from: ajdq  reason: default package */
/* loaded from: classes2.dex */
class ajdq implements ajbm {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ ajdr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dbsg d;

    public ajdq(CharSequence charSequence, ajdr ajdrVar, boolean z, dbsg dbsgVar) {
        this.a = charSequence;
        this.b = ajdrVar;
        this.c = z;
        this.d = dbsgVar;
    }

    @Override // defpackage.ajbm
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ajbm
    public cqkl b() {
        this.b.q();
        return cqkl.a;
    }

    @Override // defpackage.ajbm
    public cjtd c() {
        if (this.c) {
            return cjtd.a(dtxu.fE);
        }
        return cjtd.a(this.d.a() ? dtxu.eM : dtxu.dz);
    }
}
