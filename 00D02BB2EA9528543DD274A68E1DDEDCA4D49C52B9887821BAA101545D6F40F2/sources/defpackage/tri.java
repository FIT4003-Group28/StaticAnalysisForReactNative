package defpackage;
/* compiled from: PG */
/* renamed from: tri  reason: default package */
/* loaded from: classes7.dex */
public class tri<T> implements trc {
    private final T a;
    private boolean b;
    private final CharSequence c;
    @dzsi
    private final CharSequence d;
    @dzsi
    private final cqtd e;
    @dzsi
    private final cjtd f;
    @dzsi
    private final trh<T> g;

    public tri(cqhn cqhnVar, T t, boolean z, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi cqtd cqtdVar, @dzsi cjtd cjtdVar, @dzsi trh<T> trhVar) {
        this.a = t;
        this.b = z;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = cqtdVar;
        this.f = cjtdVar;
        this.g = trhVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return this.e;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.c;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        boolean z = !this.b;
        this.b = z;
        trh<T> trhVar = this.g;
        if (trhVar != null) {
            trhVar.a(this.a, Boolean.valueOf(z));
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        return this.f;
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        return "";
    }

    @Override // defpackage.trc
    @dzsi
    public CharSequence j() {
        return this.d;
    }
}
