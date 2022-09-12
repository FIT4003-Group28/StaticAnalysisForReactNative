package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ckgn  reason: default package */
/* loaded from: classes4.dex */
public enum ckgn {
    ARE_YOU_HERE_NOW_QUESTION(0),
    YOU_ARE_HERE_NOW(1),
    LAST_VISITED_TITLE(2),
    CHECKIN_YES(4),
    CHECKIN_NO(5),
    COLLAPSE_TOGGLE_CHEVRON(6),
    LOCK_ICON(7),
    SHOW_PLACE_TIMELINE(8),
    MINI_TIMELINE_TODAY(9),
    MINI_TIMELINE_VISIT1(10),
    MINI_TIMELINE_VISIT2(11),
    MINI_TIMELINE_VISIT3(12),
    MINI_TIMELINE_VISIT4(13),
    NO_MARK_AS_NOT_BEEN_HERE(14),
    YOU_HAVE_VISITED_THIS_PLACE(15),
    YOU_HAVE_NOT_VISITED_THIS_PLACE(16),
    YES_MARK_AS_VISITED(17),
    EDIT_MARK_AS_VISITED(18),
    EDIT_MARK_AS_NOT_BEEN_HERE(19),
    EDIT_REMOVE_ALL_VISITS(20),
    YES_BEEN_HERE(21),
    NO_NOT_BEEN_HERE(22),
    REMOVE_ALL_VISITS(23),
    CANCEL_REMOVE_ALL_VISITS(24),
    ARE_YOU_HERE_NOW_QUESTION_LH_UNKNOWN_DEFAULT_EXPANDED(25),
    ARE_YOU_HERE_NOW_QUESTION_LH_UNKNOWN_DEFAULT_COLLAPSED(26),
    ARE_YOU_HERE_NOW_QUESTION_LH_OFF_DEFAULT_EXPANDED(27),
    ARE_YOU_HERE_NOW_QUESTION_LH_OFF_DEFAULT_COLLAPSED(28),
    ARE_YOU_HERE_NOW_QUESTION_LH_ON_DEFAULT_EXPANDED(29),
    ARE_YOU_HERE_NOW_QUESTION_LH_ON_DEFAULT_COLLAPSED(30),
    I_AM_HERE_PLACEHSEET_FOOTER(31),
    VIEW_IN_VISITED_PLACES(32),
    VISIBLE_ONLY_TO_YOU(33);
    
    private static final Map<Integer, ckgn> I = new HashMap();
    public final int H;

    static {
        Iterator it = EnumSet.allOf(ckgn.class).iterator();
        while (it.hasNext()) {
            ckgn ckgnVar = (ckgn) it.next();
            I.put(Integer.valueOf(ckgnVar.H), ckgnVar);
        }
    }

    ckgn(int i) {
        this.H = i;
    }

    public static dbsg<ckgn> a(int i) {
        return dbsg.j(I.get(Integer.valueOf(i)));
    }
}
