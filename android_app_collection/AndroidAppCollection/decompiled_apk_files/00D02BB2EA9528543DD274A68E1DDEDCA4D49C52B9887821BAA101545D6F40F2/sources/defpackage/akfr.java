package defpackage;
/* compiled from: PG */
/* renamed from: akfr  reason: default package */
/* loaded from: classes2.dex */
public class akfr implements akfw {
    final /* synthetic */ akfs a;
    private final String b;

    public akfr(akfs akfsVar, String str) {
        this.a = akfsVar;
        this.b = str;
    }

    @Override // defpackage.akfw
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.akfw
    public jic b() {
        return new jic(this.a.d.f(this.b), ckqc.FIFE, 2131232998);
    }

    @Override // defpackage.akfw
    public cqkl c() {
        akfs akfsVar = this.a;
        akfsVar.e.e(this.b, akfsVar.a);
        this.a.b.run();
        return cqkl.a;
    }
}
