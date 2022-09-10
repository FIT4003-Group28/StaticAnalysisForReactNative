package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctyp  reason: default package */
/* loaded from: classes5.dex */
public final class ctyp extends cuhe {
    private dcdc<cuhg> a;

    @Override // defpackage.cuhe
    public final void b(dcdc<cuhg> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null lines");
    }

    @Override // defpackage.cuhe
    public final cuhv a() {
        String str = this.a == null ? " lines" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cuee(this.a);
    }
}
