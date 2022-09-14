package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cryg  reason: default package */
/* loaded from: classes5.dex */
public final class cryg extends cryn {
    private dcdc<crym> a;
    private dbsg<Long> b = dbpy.a;

    @Override // defpackage.cryn
    public final void b(dbsg<Long> dbsgVar) {
        if (dbsgVar != null) {
            this.b = dbsgVar;
            return;
        }
        throw new NullPointerException("Null sourceDataTimestamp");
    }

    @Override // defpackage.cryn
    public final void c(dcdc<crym> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }

    @Override // defpackage.cryn
    public final cryo a() {
        String str = this.a == null ? " suggestions" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cryh(this.a, this.b);
    }
}
