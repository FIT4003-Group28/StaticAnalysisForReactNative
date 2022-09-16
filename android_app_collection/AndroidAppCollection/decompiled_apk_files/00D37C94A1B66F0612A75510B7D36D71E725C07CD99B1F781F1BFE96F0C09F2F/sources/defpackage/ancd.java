package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancd  reason: default package */
/* loaded from: classes.dex */
public abstract class ancd {
    private static String a = "ancn";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"ancn", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ((andr) andr.a.get()).b;
    }

    public static long b() {
        return ancb.a.c();
    }

    public static anbf d(String str) {
        return ancb.a.e(str);
    }

    public static anbj f() {
        return i().a();
    }

    public static ancc g() {
        return ancb.a.h();
    }

    public static ancv i() {
        return ancb.a.j();
    }

    public static andd k() {
        return i().b();
    }

    public static String l() {
        return ancb.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract anbf e(String str);

    protected abstract ancc h();

    protected ancv j() {
        return ancx.a;
    }

    protected abstract String m();
}
