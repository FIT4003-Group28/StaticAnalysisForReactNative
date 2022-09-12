package defpackage;
/* compiled from: PG */
/* renamed from: dfri  reason: default package */
/* loaded from: classes6.dex */
final class dfri extends dfrs {
    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public dfri() {
    }

    public dfri(dfrt dfrtVar) {
        dfrj dfrjVar = (dfrj) dfrtVar;
        this.a = Float.valueOf(dfrjVar.a);
        this.b = Float.valueOf(dfrjVar.b);
        this.c = Float.valueOf(dfrjVar.c);
        this.d = Float.valueOf(dfrjVar.d);
    }

    @Override // defpackage.dfrs
    public final dfrt a() {
        String str = this.a == null ? " heading" : "";
        if (this.b == null) {
            str = str.concat(" headingHalfRange");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" tilt");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" tiltHalfRange");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new dfrj(this.a.floatValue(), this.b.floatValue(), this.c.floatValue(), this.d.floatValue());
    }
}
