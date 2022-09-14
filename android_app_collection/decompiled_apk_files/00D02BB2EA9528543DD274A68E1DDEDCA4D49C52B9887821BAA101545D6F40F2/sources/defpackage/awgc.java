package defpackage;
/* compiled from: PG */
/* renamed from: awgc  reason: default package */
/* loaded from: classes3.dex */
public abstract class awgc implements awgq {
    private final awgb a;
    private final int b;
    private boolean c;

    public awgc(awgb awgbVar, int i) {
        this.a = awgbVar;
        this.b = i;
    }

    @Override // defpackage.awgq
    public Boolean a() {
        return false;
    }

    @Override // defpackage.awgq
    public String b() {
        return "";
    }

    @Override // defpackage.awgq
    public cqkl c() {
        this.c = true;
        this.a.g(this.b);
        return cqkl.a;
    }

    @Override // defpackage.awgq
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.awgq
    public void e(Boolean bool) {
        this.c = bool.booleanValue();
    }

    @Override // defpackage.awgq
    public Boolean f() {
        return true;
    }

    @Override // defpackage.awgq
    public Boolean g() {
        return true;
    }

    @Override // defpackage.awgq
    public Integer h() {
        return Integer.valueOf(this.b);
    }
}
