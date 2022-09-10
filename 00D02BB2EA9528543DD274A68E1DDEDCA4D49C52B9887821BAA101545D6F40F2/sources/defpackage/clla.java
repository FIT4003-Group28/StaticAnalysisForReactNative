package defpackage;
/* compiled from: PG */
/* renamed from: clla  reason: default package */
/* loaded from: classes5.dex */
final class clla implements cllg {
    final /* synthetic */ clld a;
    private final String b;
    private final dcdz<String, String> c = new dcdz<>();

    public clla(clld clldVar, String str) {
        this.a = clldVar;
        this.b = str;
    }

    @Override // defpackage.cllg
    public final cllh a() {
        return new clkz(this.a, this.b, this.c.f());
    }

    @Override // defpackage.cllg
    public final void b(String str, String str2) {
        this.c.h(str, str2);
    }
}
