package com.google.android.libraries.social.jni.crashreporter;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NativeCrashHandler {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"android.graphics"};

    private static void reportCrash(int i, int i2, long j) {
        String hexString = Long.toHexString(j);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 62);
        sb.append("Native crash signal: ");
        sb.append(i);
        sb.append(" code: ");
        sb.append(i2);
        sb.append(" address: 0x");
        sb.append(hexString);
        String sb2 = sb.toString();
        cxoj cxojVar = new cxoj(sb2);
        StackTraceElement[] stackTrace = cxojVar.getStackTrace();
        int length = stackTrace.length;
        if (length > 1) {
            int i3 = length - 1;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
            System.arraycopy(stackTrace, 1, stackTraceElementArr, 0, i3);
            cxojVar.setStackTrace(stackTraceElementArr);
        }
        Intent intent = new Intent((Context) null, NativeCrashReporterActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("exception", cxojVar);
        StackTraceElement[] stackTrace2 = cxojVar.getStackTrace();
        if (stackTrace2 != null) {
            int i4 = 0;
            while (true) {
                if (i4 < stackTrace2.length) {
                    String className = stackTrace2[i4].getClassName();
                    if (className != null && className.contains(b[0])) {
                        intent.putExtra("knownCrash", true);
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        intent.putExtra("description", sb2);
        throw null;
    }
}
