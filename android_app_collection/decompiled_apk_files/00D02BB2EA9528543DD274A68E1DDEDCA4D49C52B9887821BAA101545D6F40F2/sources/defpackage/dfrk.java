package defpackage;
/* compiled from: PG */
/* renamed from: dfrk  reason: default package */
/* loaded from: classes6.dex */
final class dfrk extends dfry {
    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public dfrk() {
    }

    public dfrk(dfrz dfrzVar) {
        dfrl dfrlVar = (dfrl) dfrzVar;
        this.a = Float.valueOf(dfrlVar.a);
        this.b = Float.valueOf(dfrlVar.b);
        this.c = Float.valueOf(dfrlVar.c);
        this.d = Float.valueOf(dfrlVar.d);
    }

    @Override // defpackage.dfry
    public final dfrz a() {
        String str = this.a == null ? " heading" : "";
        if (this.b == null) {
            str = str.concat(" tilt");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" fovX");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" fovY");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new dfrl(this.a.floatValue(), this.b.floatValue(), this.c.floatValue(), this.d.floatValue());
    }
}
