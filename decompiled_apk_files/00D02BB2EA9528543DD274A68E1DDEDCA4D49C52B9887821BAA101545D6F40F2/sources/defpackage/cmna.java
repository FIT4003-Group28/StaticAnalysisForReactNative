package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
/* compiled from: PG */
/* renamed from: cmna  reason: default package */
/* loaded from: classes5.dex */
public final class cmna {
    public static void a(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    replace = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            replace = null;
        }
        if (!TextUtils.isEmpty(replace)) {
            String valueOf = String.valueOf(str);
            String replace2 = replace.replace("\n", "\n  ");
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace2).length());
            sb.append(valueOf);
            sb.append("\n  ");
            sb.append(replace2);
            sb.append('\n');
            sb.toString();
        }
    }
}
