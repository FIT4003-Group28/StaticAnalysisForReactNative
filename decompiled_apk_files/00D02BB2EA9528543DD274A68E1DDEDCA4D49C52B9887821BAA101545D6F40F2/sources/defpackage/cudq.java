package defpackage;
/* compiled from: PG */
/* renamed from: cudq  reason: default package */
/* loaded from: classes5.dex */
final class cudq extends cugg {
    private Integer a;
    private Integer b;

    @Override // defpackage.cugg
    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cugg
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cugg
    public final cugh a() {
        String str = this.a == null ? " badge" : "";
        if (this.b == null) {
            str = str.concat(" profileLabelStyle");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudr(this.a.intValue(), this.b.intValue());
    }
}
