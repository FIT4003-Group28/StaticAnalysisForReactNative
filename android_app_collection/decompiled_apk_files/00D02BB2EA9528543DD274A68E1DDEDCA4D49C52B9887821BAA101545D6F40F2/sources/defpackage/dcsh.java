package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcsh  reason: default package */
/* loaded from: classes.dex */
public abstract class dcsh {
    private static String a = "dcsu";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "dcth";
    private static final String[] d = {"dcsu", "com.google.common.flogger.backend.google.GooglePlatform", "dcth"};

    public static dcsg a() {
        return dcsf.a.b();
    }

    public static dcrl c(String str) {
        return dcsf.a.d(str);
    }

    public static dctn e() {
        return dcsf.a.f();
    }

    public static boolean g(String str, Level level, boolean z) {
        return dcsf.a.h(str, level, z);
    }

    public static dctw i() {
        return dcsf.a.j();
    }

    public static dcrp k() {
        e();
        return dcro.a;
    }

    public static long l() {
        return dcsf.a.m();
    }

    public static String n() {
        return dcsf.a.o();
    }

    protected abstract dcsg b();

    protected abstract dcrl d(String str);

    protected dctn f() {
        return dcse.a;
    }

    protected boolean h(String str, Level level, boolean z) {
        return false;
    }

    protected dctw j() {
        return dctw.b;
    }

    protected long m() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract String o();
}
