package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: daii  reason: default package */
/* loaded from: classes5.dex */
public final class daii {
    private final String a;

    public daii(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final void f(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            g(this.a, str, objArr);
        }
    }

    public final void a(String str, Object... objArr) {
        f(3, str, objArr);
    }

    public final void b(String str, Object... objArr) {
        f(6, str, objArr);
    }

    public final void c(String str, Object... objArr) {
        f(4, str, objArr);
    }

    public final void d(String str, Object... objArr) {
        f(5, str, objArr);
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            g(this.a, str, objArr);
        }
    }

    private static void g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                if (str2.length() == 0) {
                    new String("Unable to format ");
                }
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        sb2.toString();
    }
}
