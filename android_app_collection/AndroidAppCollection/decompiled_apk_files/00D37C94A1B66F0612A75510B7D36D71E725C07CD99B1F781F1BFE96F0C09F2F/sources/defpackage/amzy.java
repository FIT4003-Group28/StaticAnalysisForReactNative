package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: amzy  reason: default package */
/* loaded from: classes.dex */
public final class amzy extends amzu {
    private static final anao b = new anao((byte[]) null);

    public amzy(anbf anbfVar) {
        super(anbfVar);
    }

    @Deprecated
    public static amzy l(String str) {
        anha.d(!str.isEmpty(), "injected class name is empty");
        return new amzy(ancd.d(str.replace('/', '.')));
    }

    @Override // defpackage.amzu
    /* renamed from: k */
    public final amzw a(Level level) {
        boolean j = j(level);
        ancd.n(h(), level, j);
        return !j ? b : new amzx(this, level);
    }
}
