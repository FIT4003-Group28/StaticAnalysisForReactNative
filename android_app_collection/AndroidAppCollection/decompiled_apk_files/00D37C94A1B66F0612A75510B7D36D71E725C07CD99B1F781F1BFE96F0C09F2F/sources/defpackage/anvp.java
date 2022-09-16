package defpackage;
/* compiled from: PG */
/* renamed from: anvp  reason: default package */
/* loaded from: classes.dex */
public enum anvp implements aopm {
    LEFT_BY_UNKNOWN(0),
    DISMISS_BUTTON(1),
    BACK(2),
    SHOP_BUTTON(3),
    CLIENT_APP_SENT_DISMISS(4),
    APP_TERMINATED(5);
    
    public final int g;

    anvp(int i) {
        this.g = i;
    }

    public static anvp a(int i) {
        if (i != 0) {
            if (i == 1) {
                return DISMISS_BUTTON;
            }
            if (i == 2) {
                return BACK;
            }
            if (i == 3) {
                return SHOP_BUTTON;
            }
            if (i == 4) {
                return CLIENT_APP_SENT_DISMISS;
            }
            if (i == 5) {
                return APP_TERMINATED;
            }
            return null;
        }
        return LEFT_BY_UNKNOWN;
    }

    public static aopo b() {
        return anfo.l;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
