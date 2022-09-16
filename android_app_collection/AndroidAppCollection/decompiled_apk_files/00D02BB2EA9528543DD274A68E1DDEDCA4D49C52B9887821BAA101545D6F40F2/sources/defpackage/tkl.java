package defpackage;
/* renamed from: tkl  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class tkl {
    public static ardz a(dbsg<tlv> dbsgVar) {
        if (!dbsgVar.a() || !dbsgVar.b().f().a().equals(tlx.TRAVEL_MODE)) {
            return ardz.MAP;
        }
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = dbsgVar.b().f().b().b().ordinal();
        if (ordinal == 0) {
            return ardz.DIRECTIONS_DRIVE;
        }
        if (ordinal == 1) {
            return ardz.DIRECTIONS_BICYCLE;
        }
        if (ordinal == 2) {
            return ardz.DIRECTIONS_WALK;
        }
        if (ordinal == 5) {
            return ardz.DIRECTIONS_TWO_WHEELER;
        }
        if (ordinal == 7) {
            return ardz.DIRECTIONS_TAXI;
        }
        return ardz.MAP;
    }
}
