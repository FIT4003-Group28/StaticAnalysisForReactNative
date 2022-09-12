package defpackage;
/* compiled from: PG */
/* renamed from: ddlg  reason: default package */
/* loaded from: classes5.dex */
public enum ddlg implements dsrb {
    UNKNOWN(0),
    ANDROID_AUTO_PROJECTED(1),
    ANDROID_AUTO_PHONE_SCREEN(2),
    EMBEDDED(3),
    APPLE_CARPLAY(4);
    
    public final int f;

    ddlg(int i) {
        this.f = i;
    }

    public static ddlg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANDROID_AUTO_PROJECTED;
            }
            if (i == 2) {
                return ANDROID_AUTO_PHONE_SCREEN;
            }
            if (i == 3) {
                return EMBEDDED;
            }
            if (i == 4) {
                return APPLE_CARPLAY;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return ddlf.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
