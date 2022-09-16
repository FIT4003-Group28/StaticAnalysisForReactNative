package defpackage;
/* compiled from: PG */
/* renamed from: bvld  reason: default package */
/* loaded from: classes.dex */
public final class bvld extends bvlv {
    public Integer a;
    public Integer b;
    public Boolean c;
    public ggt d;
    private Boolean e;

    @Override // defpackage.bvlv
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bvlv
    public final bvlw a() {
        String str = this.c == null ? " isOpaque" : "";
        if (this.e == null) {
            str = str.concat(" isAlphaMask");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bvle(this.a, this.b, this.c.booleanValue(), this.e.booleanValue(), this.d);
    }
}
