package defpackage;
/* compiled from: PG */
/* renamed from: qws  reason: default package */
/* loaded from: classes7.dex */
public class qws implements qwp {
    private final boolean a;
    private final Runnable b;
    private final Runnable c;
    private final CharSequence d;
    @dzsi
    private final cjtd e;
    @dzsi
    private final cjtd f;
    private final CharSequence g;

    public qws(Runnable runnable, boolean z, Runnable runnable2, CharSequence charSequence, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, CharSequence charSequence2) {
        this.a = z;
        this.d = charSequence;
        this.c = runnable;
        this.b = runnable2;
        this.e = cjtdVar;
        this.f = cjtdVar2;
        this.g = charSequence2;
    }

    @Override // defpackage.qwp
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.qwp
    public cqkl b() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.qwp
    @dzsi
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.qwp
    @dzsi
    public cjtd d() {
        return this.a ? this.f : this.e;
    }

    @Override // defpackage.qwp
    public Boolean e() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.qwp
    public cqtd f() {
        if (this.a) {
            return cqrt.f(2131232249);
        }
        return cqrt.f(2131232137);
    }

    @Override // defpackage.qwp
    public cqkl g() {
        if (this.a) {
            this.b.run();
            return cqkl.a;
        }
        return b();
    }

    @Override // defpackage.qwp
    @dzsi
    public CharSequence h() {
        if (this.a) {
            return this.g;
        }
        return null;
    }
}
