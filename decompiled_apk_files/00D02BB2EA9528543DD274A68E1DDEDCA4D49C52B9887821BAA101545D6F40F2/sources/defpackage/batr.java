package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: batr  reason: default package */
/* loaded from: classes3.dex */
public class batr implements jad {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ ddho c;

    public batr(CharSequence charSequence, Runnable runnable, ddho ddhoVar) {
        this.a = charSequence;
        this.b = runnable;
        this.c = ddhoVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(this.c);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a;
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
