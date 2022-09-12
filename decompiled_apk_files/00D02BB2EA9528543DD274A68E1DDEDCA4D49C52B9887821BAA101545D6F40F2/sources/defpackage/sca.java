package defpackage;
/* compiled from: PG */
/* renamed from: sca  reason: default package */
/* loaded from: classes7.dex */
public class sca implements sad {
    @dzsi
    public cqtd a;
    @dzsi
    public CharSequence c;
    @dzsi
    public CharSequence d;
    public boolean f;
    @dzsi
    private final cqkn<sad> g;
    private final CharSequence h;
    @dzsi
    private CharSequence i;
    @dzsi
    private CharSequence j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private cjtd p;
    public CharSequence b = "";
    public boolean e = true;

    public sca(@dzsi cqtd cqtdVar, CharSequence charSequence, @dzsi cqkn<sad> cqknVar, ddho ddhoVar) {
        this.a = cqtdVar;
        this.j = charSequence;
        this.h = charSequence;
        this.g = cqknVar;
        this.p = cjtd.a(ddhoVar);
    }

    public sca A(CharSequence charSequence) {
        this.j = "";
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(ddho ddhoVar) {
        this.p = cjtd.a(ddhoVar);
    }

    @Override // defpackage.sad
    @dzsi
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.sad
    @dzsi
    public CharSequence b() {
        return this.j;
    }

    @Override // defpackage.sad
    public CharSequence c() {
        return this.h;
    }

    @Override // defpackage.sad
    public CharSequence d() {
        return this.b;
    }

    @Override // defpackage.sad
    public CharSequence e() {
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            charSequence = d();
        }
        dbsk.s(charSequence);
        return charSequence;
    }

    @Override // defpackage.sad
    public CharSequence f() {
        CharSequence charSequence = this.d;
        if (charSequence == null) {
            charSequence = d();
        }
        dbsk.s(charSequence);
        return charSequence;
    }

    @Override // defpackage.sad
    public CharSequence g() {
        CharSequence f = f();
        dbsk.s(f);
        return f;
    }

    @Override // defpackage.sad
    @dzsi
    public cqkn<sad> h() {
        return this.g;
    }

    @Override // defpackage.sad
    public Boolean i() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.sad
    public Boolean j() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.sad
    public Boolean k() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.sad
    public CharSequence l() {
        CharSequence charSequence = this.i;
        if (charSequence == null) {
            charSequence = d();
        }
        dbsk.s(charSequence);
        return charSequence;
    }

    @Override // defpackage.sad
    public Boolean m() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.sad
    public cjtd n() {
        return this.p;
    }

    public Boolean r() {
        return Boolean.valueOf(this.k);
    }

    public Boolean s() {
        return Boolean.valueOf(this.n);
    }

    public Boolean t() {
        return Boolean.valueOf(this.o);
    }

    public sca u(boolean z) {
        this.k = z;
        return this;
    }

    public sca v(boolean z) {
        this.l = z;
        return this;
    }

    public sca w(boolean z) {
        this.m = z;
        return this;
    }

    public sca x(boolean z) {
        this.n = true;
        return this;
    }

    public sca y(boolean z) {
        this.o = true;
        return this;
    }

    public sca z(CharSequence charSequence) {
        this.i = charSequence;
        return this;
    }
}
