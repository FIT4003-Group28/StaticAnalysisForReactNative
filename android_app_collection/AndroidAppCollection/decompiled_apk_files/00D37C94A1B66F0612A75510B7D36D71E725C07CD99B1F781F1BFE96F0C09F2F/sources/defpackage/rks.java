package defpackage;

import android.text.TextUtils;
import android.util.Log;
/* compiled from: PG */
/* renamed from: rks  reason: default package */
/* loaded from: classes4.dex */
public final class rks extends rmk {
    public char a;
    public long b;
    public final rkq c;
    public final rkq d;
    public final rkq e;
    public final rkq f;
    public final rkq g;
    public final rkq h;
    public final rkq i;
    public final rkq j;
    public final rkq k;
    private String l;

    public rks(rlx rlxVar) {
        super(rlxVar);
        this.a = (char) 0;
        this.b = -1L;
        this.c = new rkq(this, 6, false, false);
        this.d = new rkq(this, 6, true, false);
        this.e = new rkq(this, 6, false, true);
        this.f = new rkq(this, 5, false, false);
        this.g = new rkq(this, 5, true, false);
        this.h = new rkq(this, 5, false, true);
        this.i = new rkq(this, 4, false, false);
        this.j = new rkq(this, 3, false, false);
        this.k = new rkq(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new rkr(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String c = c(z, obj);
        String c2 = c(z, obj2);
        String c3 = c(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(c)) {
            sb.append(str2);
            sb.append(c);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(c2)) {
            sb.append(str2);
            sb.append(c2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(c3)) {
            sb.append(str3);
            sb.append(c3);
        }
        return sb.toString();
    }

    static String c(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
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
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String o = o(rlx.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && o(className).equals(o)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof rkr) {
                return ((rkr) obj).a;
            } else {
                return z ? "-" : String.valueOf(obj);
            }
        }
    }

    private static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    protected final String d() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                String str2 = this.w.d;
                if (str2 != null) {
                    this.l = str2;
                } else {
                    this.l = J().l();
                }
            }
            qnm.b(this.l);
            str = this.l;
        }
        return str;
    }

    public final void e(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && h(i)) {
            g(i, b(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        qnm.b(str);
        rlu rluVar = this.w.j;
        if (rluVar == null) {
            g(6, "Scheduler not set. Not logging error/warn");
        } else if (!rluVar.m()) {
            g(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            rluVar.g(new rkp(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    @Override // defpackage.rmk
    protected final boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i, String str) {
        Log.println(i, d(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(int i) {
        return Log.isLoggable(d(), i);
    }
}
