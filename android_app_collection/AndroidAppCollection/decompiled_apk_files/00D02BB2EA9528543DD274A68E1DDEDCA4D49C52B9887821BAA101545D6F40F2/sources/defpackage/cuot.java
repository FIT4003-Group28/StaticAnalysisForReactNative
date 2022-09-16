package defpackage;
/* compiled from: PG */
/* renamed from: cuot  reason: default package */
/* loaded from: classes5.dex */
final class cuot extends cupr {
    private Integer a;
    private Float b;

    @Override // defpackage.cupr
    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cupr
    public final void c(float f) {
        this.b = Float.valueOf(f);
    }

    @Override // defpackage.cupr
    public final cups a() {
        String str = this.a == null ? " lineColor" : "";
        if (this.b == null) {
            str = str.concat(" lineWidth");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuou(this.a.intValue(), this.b.floatValue());
    }
}
