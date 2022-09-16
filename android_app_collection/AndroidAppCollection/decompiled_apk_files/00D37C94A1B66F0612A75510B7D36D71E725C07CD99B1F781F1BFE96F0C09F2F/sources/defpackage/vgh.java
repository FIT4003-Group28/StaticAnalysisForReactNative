package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vgh  reason: default package */
/* loaded from: classes4.dex */
public final class vgh {
    public static void a(Throwable th, StringBuilder sb, Set set, String str) {
        StackTraceElement[] stackTrace;
        if (th == null || set.contains(th)) {
            return;
        }
        set.add(th);
        if (str != null) {
            sb.append(str);
        }
        sb.append(th.getClass().getName());
        sb.append(':');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
        Throwable[] thArr = new Throwable[0];
        if (th.getCause() == null) {
            return;
        }
        a(th.getCause(), sb, set, "\nCaused by: ");
    }

    public static String b(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String c(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return b(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    public static uog d(Context context, Runnable runnable) {
        Runnable runnable2;
        uom uomVar = new uom();
        amuk r = amuk.r(context.getResources().getString(R.string.sign_in_cancel));
        if (r != null) {
            uomVar.a = r;
            if (runnable != null) {
                uomVar.b = runnable;
                amuk amukVar = uomVar.a;
                if (amukVar == null || (runnable2 = uomVar.b) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (uomVar.a == null) {
                        sb.append(" possibleCancelStringList");
                    }
                    if (uomVar.b == null) {
                        sb.append(" onCancel");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                return new uog(amukVar, runnable2);
            }
            throw new NullPointerException("Null onCancel");
        }
        throw new NullPointerException("Null possibleCancelStringList");
    }
}
