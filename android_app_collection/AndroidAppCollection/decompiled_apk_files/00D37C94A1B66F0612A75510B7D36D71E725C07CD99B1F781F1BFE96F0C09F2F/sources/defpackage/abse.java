package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Bundle;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;
/* compiled from: PG */
/* renamed from: abse  reason: default package */
/* loaded from: classes.dex */
public final class abse {
    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": EGL error 0x");
        sb.append(hexString);
        String sb2 = sb.toString();
        zep.b(sb2);
        throw new absd(sb2);
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": glError 0x");
        sb.append(hexString);
        String sb2 = sb.toString();
        zep.b(sb2);
        throw new absd(sb2);
    }

    public static void c(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Unable to locate '");
        sb.append(str);
        sb.append("' in program");
        throw new absd(sb.toString());
    }

    public static boolean d(assn assnVar) {
        return (assnVar == null || assnVar.d.size() == 0 || (((assp) assnVar.d.get(0)).b & 1) == 0) ? false : true;
    }

    public static final dh e(apzg apzgVar, assu assuVar, SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        ablp ablpVar = new ablp();
        ablpVar.ae(f(apzgVar, assuVar, supportedPickerPanelWrapper));
        return ablpVar;
    }

    public static Bundle f(apzg apzgVar, assu assuVar, SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        Bundle bundle = new Bundle();
        if (apzgVar != null) {
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
            if (assuVar != null) {
                bundle.putByteArray("ARG_CHAT_MESSAGE", assuVar.toByteArray());
            }
        }
        if (supportedPickerPanelWrapper != null) {
            bundle.putParcelable("picker_panel", supportedPickerPanelWrapper);
        }
        return bundle;
    }
}
