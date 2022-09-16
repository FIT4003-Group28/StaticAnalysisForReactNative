package defpackage;
/* compiled from: PG */
/* renamed from: bjas  reason: default package */
/* loaded from: classes3.dex */
class bjas extends bkaj {
    final /* synthetic */ gga a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjas(bkaj bkajVar, gga ggaVar, String str) {
        super(bkajVar);
        this.a = ggaVar;
        this.b = str;
    }

    @Override // defpackage.bkaj, defpackage.jbj
    public CharSequence e() {
        return bjat.m(this.a, super.e(), this.b);
    }
}
