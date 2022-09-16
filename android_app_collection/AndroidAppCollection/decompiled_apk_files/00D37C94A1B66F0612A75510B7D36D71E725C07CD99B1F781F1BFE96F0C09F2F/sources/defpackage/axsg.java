package defpackage;
/* compiled from: PG */
/* renamed from: axsg  reason: default package */
/* loaded from: classes2.dex */
public final class axsg implements axsf {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        vbrVar.f("measurement.client.consent_state_v1", true);
        vbrVar.f("measurement.client.3p_consent_state_v1", true);
        vbrVar.f("measurement.service.consent_state_v1_W36", true);
        a = vbrVar.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.axsf
    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
