package defpackage;
/* compiled from: PG */
/* renamed from: wpw  reason: default package */
/* loaded from: classes7.dex */
public class wpw implements jad {
    private final Runnable a;

    public wpw(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtyc.bW);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return "Remove reminder";
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
