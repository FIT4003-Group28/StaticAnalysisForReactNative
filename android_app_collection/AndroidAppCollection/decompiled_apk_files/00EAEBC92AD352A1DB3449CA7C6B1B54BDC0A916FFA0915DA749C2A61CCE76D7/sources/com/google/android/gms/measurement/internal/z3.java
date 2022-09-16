package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
/* loaded from: classes.dex */
public final class z3 extends b6 {

    /* renamed from: c  reason: collision with root package name */
    private char f7826c;

    /* renamed from: d  reason: collision with root package name */
    private long f7827d;

    /* renamed from: e  reason: collision with root package name */
    private String f7828e;

    /* renamed from: f  reason: collision with root package name */
    private final b4 f7829f;

    /* renamed from: g  reason: collision with root package name */
    private final b4 f7830g;

    /* renamed from: h  reason: collision with root package name */
    private final b4 f7831h;
    private final b4 i;
    private final b4 j;
    private final b4 k;
    private final b4 l;
    private final b4 m;
    private final b4 n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(d5 d5Var) {
        super(d5Var);
        this.f7826c = (char) 0;
        this.f7827d = -1L;
        this.f7829f = new b4(this, 6, false, false);
        this.f7830g = new b4(this, 6, true, false);
        this.f7831h = new b4(this, 6, false, true);
        this.i = new b4(this, 5, false, false);
        this.j = new b4(this, 5, true, false);
        this.k = new b4(this, 5, false, true);
        this.l = new b4(this, 4, false, false);
        this.m = new b4(this, 3, false, false);
        this.n = new b4(this, 2, false, false);
    }

    private final String D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f7828e == null) {
                if (this.f7802a.B() != null) {
                    str2 = this.f7802a.B();
                } else {
                    l().w();
                    str2 = "FA";
                }
                this.f7828e = str2;
            }
            str = this.f7828e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new e4(str);
    }

    private static String a(boolean z, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof e4)) {
                    return z ? "-" : String.valueOf(obj);
                }
                str = ((e4) obj).f7267a;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b2 = b(d5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b2)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str2);
            sb.append(a4);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final b4 A() {
        return this.m;
    }

    public final b4 B() {
        return this.n;
    }

    public final String C() {
        Pair<String, Long> a2 = k().f7485d.a();
        if (a2 == null || a2 == m4.D) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        String str = (String) a2.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, String str) {
        Log.println(i, D(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && a(i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.s.a(str);
        a5 s = this.f7802a.s();
        if (s == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else if (s.r()) {
            if (i < 0) {
                i = 0;
            }
            s.a(new c4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            return;
        } else {
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        a(6, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i) {
        return Log.isLoggable(D(), i);
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        return false;
    }

    public final b4 s() {
        return this.f7829f;
    }

    public final b4 t() {
        return this.f7830g;
    }

    public final b4 u() {
        return this.f7831h;
    }

    public final b4 v() {
        return this.i;
    }

    public final b4 x() {
        return this.j;
    }

    public final b4 y() {
        return this.k;
    }

    public final b4 z() {
        return this.l;
    }
}
