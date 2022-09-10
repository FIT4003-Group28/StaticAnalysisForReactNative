package defpackage;
/* compiled from: PG */
/* renamed from: xkp  reason: default package */
/* loaded from: classes7.dex */
final class xkp extends xkx {
    public akqq a;
    public dbsg<Float> b = dbpy.a;
    public dbsg<Integer> c = dbpy.a;
    private Long d;
    private Long e;

    @Override // defpackage.xkx
    public final void b(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.xkx
    public final void c(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // defpackage.xkx
    public final xky a() {
        String str = this.a == null ? " latLng" : "";
        if (this.d == null) {
            str = str.concat(" timestampMs");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" dataUpdateTimestampSec");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new xkq(this.a, this.d.longValue(), this.e.longValue(), this.b, this.c);
    }
}
