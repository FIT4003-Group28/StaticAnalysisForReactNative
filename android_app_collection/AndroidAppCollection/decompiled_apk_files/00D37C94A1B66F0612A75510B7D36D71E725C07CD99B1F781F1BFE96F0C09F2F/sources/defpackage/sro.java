package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: sro  reason: default package */
/* loaded from: classes4.dex */
public final class sro extends teb {
    @Override // defpackage.teb
    public final void a(int i, String str, tda tdaVar, Throwable th) {
        int i2 = i + (-1) != 11 ? 6 : 5;
        String G = awwc.G(i);
        String stackTraceString = Log.getStackTraceString(th);
        StringBuilder sb = new StringBuilder(G.length() + 2 + String.valueOf(str).length() + String.valueOf(stackTraceString).length());
        sb.append(G);
        sb.append(" ");
        sb.append(str);
        sb.append('\n');
        sb.append(stackTraceString);
        Log.println(i2, "ElementsErrorLogger", sb.toString());
    }
}
