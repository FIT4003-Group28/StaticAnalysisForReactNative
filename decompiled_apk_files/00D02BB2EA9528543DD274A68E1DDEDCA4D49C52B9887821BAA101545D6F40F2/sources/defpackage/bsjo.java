package defpackage;
/* compiled from: PG */
/* renamed from: bsjo  reason: default package */
/* loaded from: classes4.dex */
public final class bsjo extends bskp {
    public ddho a;
    public ddho b;
    public ddho c;
    public ddho d;
    public ddho e;

    @Override // defpackage.bskp
    public final bskq a() {
        String str = this.a == null ? " togglableVeType" : "";
        if (this.b == null) {
            str = str.concat(" valueSelectorVeType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" hotelDatepickersVeType");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" hotelPriceVeType");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" hotelAmenityVeType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bsjp(this.a, this.b, this.c, this.d, this.e);
    }
}
