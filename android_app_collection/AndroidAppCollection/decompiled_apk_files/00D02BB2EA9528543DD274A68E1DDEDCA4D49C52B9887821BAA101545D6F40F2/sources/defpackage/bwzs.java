package defpackage;
/* compiled from: PG */
/* renamed from: bwzs  reason: default package */
/* loaded from: classes4.dex */
public final class bwzs extends bwzu {
    public ilo a;
    public dcde<bwzv, dwfl> b;
    public Boolean c;
    private dcdc<dwfl> d;

    @Override // defpackage.bwzu
    public final void b(dcdc<dwfl> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null photos");
    }

    @Override // defpackage.bwzu
    public final bwzw a() {
        String str = this.d == null ? " photos" : "";
        if (this.b == null) {
            str = str.concat(" photosByCategory");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" showPlaceInfo");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bwzt(this.a, this.d, this.b, this.c.booleanValue());
    }
}
