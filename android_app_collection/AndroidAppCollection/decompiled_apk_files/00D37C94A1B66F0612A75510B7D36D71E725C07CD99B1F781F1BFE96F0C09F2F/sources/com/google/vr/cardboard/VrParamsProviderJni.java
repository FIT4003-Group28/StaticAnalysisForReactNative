package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrParamsProviderJni {
    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        axfg d = awwd.d(context);
        CardboardDevice$DeviceParams b = d.b();
        d.f();
        if (b == null) {
            return null;
        }
        return b.toByteArray();
    }

    private static void readDisplayParams(Context context, long j) {
        int b;
        int c;
        int i = 0;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(j, Resources.getSystem().getDisplayMetrics(), axds.e(null), 0);
            return;
        }
        axfg d = awwd.d(context);
        Display$DisplayParams d2 = d.d();
        d.f();
        Display i2 = axds.i(context);
        DisplayMetrics h = axds.h(i2, d2);
        float e = axds.e(d2);
        axdr b2 = axds.b(i2);
        if (b2 != null) {
            if (context.getResources().getConfiguration().orientation == 1) {
                b = b2.d();
                c = b2.a();
            } else {
                b = b2.b();
                c = b2.c();
            }
            i = c + b;
        }
        a(j, h, e, i);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        return SdkConfigurationReader.getParams(context).toByteArray();
    }

    private static byte[] readUserPrefs(Context context) {
        axfg d = awwd.d(context);
        Preferences$UserPrefs e = d.e();
        d.f();
        if (e == null) {
            return null;
        }
        return e.toByteArray();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        CardboardDevice$DeviceParams parseFrom;
        axfg d = awwd.d(context);
        if (bArr != null) {
            try {
                try {
                    parseFrom = CardboardDevice$DeviceParams.parseFrom(bArr, aoos.b());
                } catch (aopx e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Error parsing protocol buffer: ");
                    sb.append(valueOf);
                    Log.w("VrParamsProviderJni", sb.toString());
                    d.f();
                    return false;
                }
            } catch (Throwable th) {
                d.f();
                throw th;
            }
        } else {
            parseFrom = null;
        }
        boolean g = d.g(parseFrom);
        d.f();
        return g;
    }
}
