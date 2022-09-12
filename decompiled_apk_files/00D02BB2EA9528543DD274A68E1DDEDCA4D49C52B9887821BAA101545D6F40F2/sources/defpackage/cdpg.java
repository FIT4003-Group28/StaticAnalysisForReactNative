package defpackage;
/* compiled from: PG */
/* renamed from: cdpg  reason: default package */
/* loaded from: classes4.dex */
public enum cdpg implements dsrb {
    UNKNOWN_METHOD(0),
    REVIEW_EDITOR_PAGE_SEND_REVIEW_BUTTON_CLICK(1),
    NOTIFICATION_STAR_CLICK(2),
    NOTIFICATION_SEND_REVIEW_BUTTON_CLICK(3);
    
    public final int e;

    cdpg(int i) {
        this.e = i;
    }

    public static cdpg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REVIEW_EDITOR_PAGE_SEND_REVIEW_BUTTON_CLICK;
            }
            if (i == 2) {
                return NOTIFICATION_STAR_CLICK;
            }
            if (i == 3) {
                return NOTIFICATION_SEND_REVIEW_BUTTON_CLICK;
            }
            return null;
        }
        return UNKNOWN_METHOD;
    }

    public static dsrd c() {
        return cdpf.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
