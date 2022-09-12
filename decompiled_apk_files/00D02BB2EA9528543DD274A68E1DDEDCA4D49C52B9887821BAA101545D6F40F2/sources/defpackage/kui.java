package defpackage;
/* compiled from: PG */
/* renamed from: kui  reason: default package */
/* loaded from: classes7.dex */
class kui extends dbrh<ddlg, dhmo> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddlg b(dhmo dhmoVar) {
        dhmo dhmoVar2 = dhmoVar;
        ddlg ddlgVar = ddlg.UNKNOWN;
        int ordinal = dhmoVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ddlg.ANDROID_AUTO_PROJECTED;
            }
            if (ordinal == 2) {
                return ddlg.ANDROID_AUTO_PHONE_SCREEN;
            }
            if (ordinal == 3) {
                return ddlg.EMBEDDED;
            }
            if (ordinal == 4) {
                return ddlg.APPLE_CARPLAY;
            }
            String valueOf = String.valueOf(dhmoVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return ddlg.UNKNOWN;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmo c(ddlg ddlgVar) {
        ddlg ddlgVar2 = ddlgVar;
        dhmo dhmoVar = dhmo.UNKNOWN_PLATFORM;
        int ordinal = ddlgVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dhmo.ANDROID_AUTO_PROJECTED;
            }
            if (ordinal == 2) {
                return dhmo.ANDROID_AUTO_PHONE_SCREEN;
            }
            if (ordinal == 3) {
                return dhmo.EMBEDDED;
            }
            if (ordinal == 4) {
                return dhmo.APPLE_CARPLAY;
            }
            String valueOf = String.valueOf(ddlgVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dhmo.UNKNOWN_PLATFORM;
    }
}
