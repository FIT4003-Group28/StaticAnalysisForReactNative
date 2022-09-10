package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cuec  reason: default package */
/* loaded from: classes5.dex */
final class cuec extends cuhc {
    private Long a;
    private dcdc<Integer> b;

    @Override // defpackage.cuhc
    public final void b(Long l) {
        if (l != null) {
            this.a = l;
            return;
        }
        throw new NullPointerException("Null lastCapabilitiesReportTimeMs");
    }

    @Override // defpackage.cuhc
    public final void c(List<Integer> list) {
        this.b = dcdc.r(list);
    }

    @Override // defpackage.cuhc
    public final cuhd a() {
        String str = this.a == null ? " lastCapabilitiesReportTimeMs" : "";
        if (this.b == null) {
            str = str.concat(" lastReportedCapabilities");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cued(this.a, this.b);
    }
}
