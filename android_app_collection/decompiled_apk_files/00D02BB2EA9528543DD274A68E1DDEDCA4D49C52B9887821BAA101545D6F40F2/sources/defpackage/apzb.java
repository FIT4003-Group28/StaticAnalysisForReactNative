package defpackage;
/* compiled from: PG */
/* renamed from: apzb  reason: default package */
/* loaded from: classes2.dex */
public enum apzb {
    UNRESOLVED(0, 1, 2),
    INBOX(1, 2, 3),
    NOTIFICATION(2, 3, 4),
    PLACEPAGE(3, 4, 8),
    START_CONVERSATION_INTENT(4, 5, 5),
    PLACEPAGE_TOAST_PROMO(5, 6, 10),
    PLACECARD(6, 7, 6),
    PLACEPAGE_TOAST_QUOTE(9, 10, 11),
    MAPS_ONLY_INTENT(10, 11, 5),
    INBOX_IN_UPDATES_TAB(11, 12, 3),
    PLACE_MISSED_CALL_BOTTOM_SHEET(12, 13, 14),
    CHATTY_POST(13, 14, 15),
    REVIEW_PRIVATE_REPLY(14, 15, 16),
    PLACE_AFTER_HOURS_OPTIONS_BEFORE_CALLING_DIALOG(15, 16, 75),
    COMMUNITY_FEED(16, 17, 77),
    UNRESPONSIVE_MERCHANT_DAILY_SUMMARY_NOTIFICATION(17, 18, 79);
    
    private static final ain<apzb> t;
    public final int q;
    public final int r;
    public final int s;

    static {
        apzb[] values = values();
        t = new ain<>(values.length);
        for (apzb apzbVar : values) {
            t.e(apzbVar.q, apzbVar);
        }
    }

    apzb(int i, int i2, int i3) {
        this.q = i;
        this.r = i2;
        this.s = i3;
    }

    public static apzb a(int i) {
        apzb b = t.b(i);
        dbsk.s(b);
        return b;
    }
}
