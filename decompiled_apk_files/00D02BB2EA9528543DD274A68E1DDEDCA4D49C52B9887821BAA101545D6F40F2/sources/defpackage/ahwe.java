package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: ahwe  reason: default package */
/* loaded from: classes2.dex */
public enum ahwe {
    SIDE_MENU(0),
    MAP_TAP(1),
    NOTIFICATION(2),
    OUTGOING_SHARE_TAP(3),
    AVATAR_CAROUSEL_TAP(4),
    SWIPING_BETWEEN_CARDS(5),
    STATE_RESTORATION(6),
    SHORTCUT(7),
    NEW_SHARE(8),
    BURSTING_NOTIFICATION(9),
    INCOGNITO_TURNED_OFF(13),
    PERSONAL_SAFETY_OUTLINK(14);
    
    public static final dcdn<Integer, ahwe> m = dcdn.s(dcft.o(EnumSet.allOf(ahwe.class), ahwd.a));
    public final int n;

    ahwe(int i) {
        this.n = i;
    }

    public static int a(ahwe ahweVar) {
        int ordinal = ahweVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 6;
            }
            if (ordinal == 3) {
                return 4;
            }
            if (ordinal == 4) {
                return 3;
            }
            return ordinal != 7 ? 1 : 5;
        }
        return 2;
    }
}
