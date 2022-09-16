package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: anay  reason: default package */
/* loaded from: classes.dex */
public final class anay extends anaw {
    public anay(anbf anbfVar) {
        super(anbfVar);
    }

    public static anay m(String str) {
        return new anay(ancd.d(str));
    }

    public static anay n(String str) {
        return new anay(new ancu(str, Level.ALL));
    }

    public static anay o() {
        return new anay(ancd.d(ancd.g().b(anay.class)));
    }

    @Override // defpackage.amzu
    /* renamed from: l */
    public final anav a(Level level) {
        boolean j = j(level);
        ancd.n(h(), level, j);
        return !j ? b : new anax(this, level);
    }
}
