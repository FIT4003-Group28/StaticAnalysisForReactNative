package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: alrz  reason: default package */
/* loaded from: classes.dex */
public final class alrz {
    public final String a;

    public alrz(String str, String str2) {
        str.getClass();
        this.a = str;
        str2.getClass();
    }

    private static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", str2.length() != 0 ? "Unable to format ".concat(str2) : new String("Unable to format "), e);
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
        return sb2.toString();
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.a, str, objArr));
        }
    }

    public final void b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.a, str, objArr), th);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", d(this.a, str, objArr));
        }
    }

    public alrz(String str) {
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
}
