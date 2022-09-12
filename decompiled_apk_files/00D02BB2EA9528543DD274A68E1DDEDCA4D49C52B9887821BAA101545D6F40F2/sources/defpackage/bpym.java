package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpym  reason: default package */
/* loaded from: classes4.dex */
public final class bpym extends bqab {
    private Double a;
    private Float b;

    @Override // defpackage.bqab
    public final void b(double d) {
        this.a = Double.valueOf(d);
    }

    @Override // defpackage.bqab
    public final void c(float f) {
        this.b = Float.valueOf(f);
    }

    @Override // defpackage.bqab
    public final bqac a() {
        String str = this.a == null ? " distanceMeters" : "";
        if (this.b == null) {
            str = str.concat(" zoomDifference");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bpyn(this.a.doubleValue(), this.b.floatValue());
    }
}
