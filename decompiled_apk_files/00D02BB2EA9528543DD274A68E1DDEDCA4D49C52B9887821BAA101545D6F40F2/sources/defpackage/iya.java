package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iya  reason: default package */
/* loaded from: classes7.dex */
public abstract class iya implements jbf {
    protected final CharSequence a;
    protected final CharSequence b;
    protected final cqtd c;
    protected final Boolean d;
    protected final Runnable e;
    protected final cjtd f;

    public iya(cqtd cqtdVar, cqkp cqkpVar, CharSequence charSequence, CharSequence charSequence2, Runnable runnable, Boolean bool, cjtd cjtdVar) {
        this.c = cqtdVar;
        this.b = charSequence;
        this.a = charSequence2;
        this.e = runnable;
        this.d = bool;
        this.f = cjtdVar;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return this.c;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        Boolean bool = this.d;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.e.run();
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.f;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return this.b;
    }

    @dzsi
    public CharSequence m() {
        return this.a;
    }
}
