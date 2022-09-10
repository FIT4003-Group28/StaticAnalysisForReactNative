package defpackage;
/* compiled from: PG */
/* renamed from: pmq  reason: default package */
/* loaded from: classes7.dex */
class pmq implements iao {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public pmq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.iao
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.iao
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtxl.ik;
        b.g(this.b);
        return b.a();
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }
}
