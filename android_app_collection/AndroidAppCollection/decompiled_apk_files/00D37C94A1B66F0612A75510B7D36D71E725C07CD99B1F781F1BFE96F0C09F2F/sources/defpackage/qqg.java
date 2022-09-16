package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: qqg  reason: default package */
/* loaded from: classes4.dex */
public enum qqg {
    ZWIEBACK(2),
    ANDROID_ID(4),
    GAIA(8),
    ACCOUNT_NAME(16);
    
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public final int h;

    static {
        qqg qqgVar = ZWIEBACK;
        e = EnumSet.allOf(qqg.class);
        f = EnumSet.noneOf(qqg.class);
        g = EnumSet.of(qqgVar);
    }

    qqg(int i2) {
        this.h = i2;
    }
}
