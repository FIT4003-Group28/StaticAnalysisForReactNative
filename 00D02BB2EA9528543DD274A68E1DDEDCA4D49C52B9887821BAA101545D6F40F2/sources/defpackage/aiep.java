package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiep  reason: default package */
/* loaded from: classes2.dex */
public final class aiep extends aifp {
    public Float a;
    public Float b;
    public akwd c;
    public Float d;
    private akqp g;
    private dcdn<Class<?>, aifx> h;

    @Override // defpackage.aifp
    public final void b(float f) {
        this.b = Float.valueOf(f);
    }

    @Override // defpackage.aifp
    protected final void c(akqp akqpVar) {
        this.g = akqpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aifp
    public final void d(float f) {
        this.d = Float.valueOf(f);
    }

    @Override // defpackage.aifp
    protected final void e(akwd akwdVar) {
        if (akwdVar != null) {
            this.c = akwdVar;
            return;
        }
        throw new NullPointerException("Null rotationMode");
    }

    @Override // defpackage.aifp
    public final void f(float f) {
        this.a = Float.valueOf(f);
    }

    @Override // defpackage.aifp
    protected final void g(dcdn<Class<?>, aifx> dcdnVar) {
        if (dcdnVar != null) {
            this.h = dcdnVar;
            return;
        }
        throw new NullPointerException("Null secondaryStates");
    }

    @Override // defpackage.aifp
    public final aifq a() {
        String str = this.g == null ? " position" : "";
        if (this.a == null) {
            str = str.concat(" scale");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" opacity");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" rotationMode");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" rotation");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" secondaryStates");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aieq(this.g, this.a.floatValue(), this.b.floatValue(), this.c, this.d.floatValue(), this.h);
    }
}
