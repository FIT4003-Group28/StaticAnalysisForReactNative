package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ajhg  reason: default package */
/* loaded from: classes.dex */
public final class ajhg extends teb {
    private final tec a;

    public ajhg(tec tecVar) {
        this.a = tecVar;
    }

    static String e(String str) {
        if (str == null) {
            return "Unknown Template";
        }
        for (String str2 : amqf.d("[ '\"(),;|]").f(str)) {
            if (str2.endsWith(".eml")) {
                return str2;
            }
        }
        return "Unknown Template";
    }

    private static int f(int i) {
        return i + (-1) != 11 ? 2 : 1;
    }

    @Override // defpackage.teb
    public final void a(int i, String str, tda tdaVar, Throwable th) {
        String str2;
        if (tdaVar != null) {
            StringBuilder sb = tdaVar.m;
            str2 = sb != null ? sb.toString() : "Unknown Template";
        } else {
            str2 = null;
        }
        if (th == null) {
            if (amqn.a(str2)) {
                str2 = e(str);
            }
            afus.b(f(i), 23, str);
            this.a.a(i, str, str2);
            return;
        }
        String G = awwc.G(i);
        StringBuilder sb2 = new StringBuilder(G.length() + 1 + String.valueOf(str).length());
        sb2.append(G);
        sb2.append(" ");
        sb2.append(str);
        afus.c(f(i), 23, sb2.toString(), th);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(": ");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            sb3.append(th2);
            sb3.append(" ");
        }
        Log.getStackTraceString(th);
        String sb4 = sb3.toString();
        if (amqn.a(str2)) {
            str2 = e(sb4);
        }
        this.a.a(i, sb4, str2);
    }
}
