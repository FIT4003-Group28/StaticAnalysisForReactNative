package defpackage;
/* compiled from: PG */
/* renamed from: jyv  reason: default package */
/* loaded from: classes7.dex */
public class jyv implements jyo {
    private final CharSequence a;
    private final CharSequence b;
    @dzsi
    private final jic c;
    private final ddho d;
    private final Runnable e;
    private ddho f;
    private int g;

    public jyv(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable, ddho ddhoVar, ddho ddhoVar2) {
        jic ao = nqu.ao(str);
        this.g = -1;
        dbsk.s(charSequence);
        this.a = charSequence;
        this.b = charSequence2;
        this.e = runnable;
        this.c = ao;
        this.f = ddhoVar;
        this.d = ddhoVar2;
    }

    @Override // defpackage.jyo
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.jyo
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.jyo
    public cqkl c() {
        this.e.run();
        return cqkl.a;
    }

    @Override // defpackage.jyo
    @dzsi
    public jic d() {
        return this.c;
    }

    @Override // defpackage.jyo
    @dzsi
    public cqtd e() {
        return null;
    }

    @Override // defpackage.jyo
    @dzsi
    public cqtd f() {
        return null;
    }

    @Override // defpackage.jyo
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = this.f;
        b.i(this.g);
        return b.a();
    }

    @Override // defpackage.jyo
    public void h(int i) {
        if (this.g != -1) {
            this.f = this.d;
        }
        this.g = i;
        cqkx.p(this);
    }
}
