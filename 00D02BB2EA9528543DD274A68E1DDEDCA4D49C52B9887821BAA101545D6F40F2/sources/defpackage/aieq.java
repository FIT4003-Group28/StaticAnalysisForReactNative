package defpackage;
/* compiled from: PG */
/* renamed from: aieq  reason: default package */
/* loaded from: classes2.dex */
final class aieq extends aifq {
    private final akqp a;
    private final float b;
    private final float c;
    private final akwd d;
    private final float e;
    private final dcdn<Class<?>, aifx> f;

    public aieq(akqp akqpVar, float f, float f2, akwd akwdVar, float f3, dcdn<Class<?>, aifx> dcdnVar) {
        this.a = akqpVar;
        this.b = f;
        this.c = f2;
        this.d = akwdVar;
        this.e = f3;
        this.f = dcdnVar;
    }

    @Override // defpackage.aifq
    public final akqp a() {
        return this.a;
    }

    @Override // defpackage.aifq
    public final float b() {
        return this.b;
    }

    @Override // defpackage.aifq
    public final float c() {
        return this.c;
    }

    @Override // defpackage.aifq
    public final akwd d() {
        return this.d;
    }

    @Override // defpackage.aifq
    public final float e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aifq
    public final dcdn<Class<?>, aifx> f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        float f2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        float f3 = this.e;
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 133 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RenderableState{position=");
        sb.append(valueOf);
        sb.append(", scale=");
        sb.append(f);
        sb.append(", opacity=");
        sb.append(f2);
        sb.append(", rotationMode=");
        sb.append(valueOf2);
        sb.append(", rotation=");
        sb.append(f3);
        sb.append(", secondaryStates=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
