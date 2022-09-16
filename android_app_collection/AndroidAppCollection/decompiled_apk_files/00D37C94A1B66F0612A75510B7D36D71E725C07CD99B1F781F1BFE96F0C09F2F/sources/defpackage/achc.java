package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: achc  reason: default package */
/* loaded from: classes.dex */
public final class achc {
    private static achc a;

    private achc() {
    }

    public static final Intent a(Context context, int i, athj athjVar, String str, arag aragVar, boolean z) {
        Intent putExtra = new Intent(context, LiveCreationActivity.class).addFlags(268435456).putExtra("statusCode", i).putExtra("didStream", z);
        if (athjVar != null) {
            putExtra.putExtra("endScreenRenderer", athjVar.toByteArray());
        }
        if (str != null) {
            putExtra.putExtra("errorMessage", str);
        }
        if (aragVar != null) {
            putExtra.putExtra("errorMessageFormatted", aragVar.toByteArray());
        }
        return putExtra;
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 262312, -3);
        layoutParams.gravity = 83;
        return layoutParams;
    }

    public static void c(Bundle bundle, int i) {
        aqxo.p(i > 0);
        bundle.putInt("extras-key-min-bitrate", i);
    }

    public static final accj d(Context context, MediaFormat mediaFormat, acbw acbwVar, Bundle bundle) {
        mediaFormat.getClass();
        if (!abxb.d(mediaFormat)) {
            Log.e("VideoEncoderFactory", "Not a video format");
            return null;
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("extras-key-enable-cbr", false)) {
            mediaFormat.setInteger("bitrate-mode", 2);
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean("extras-key-enable-bitrate-bounce", false)) {
                    z = true;
                }
            } catch (Exception e) {
                Log.e("VideoEncoderFactory", "Could not create video encoder", e);
                return null;
            }
        }
        return new accj(context, mediaFormat, acbwVar, z);
    }

    public static void e(Bundle bundle) {
        bundle.putBoolean("extras-key-enable-cbr", true);
    }

    public static void f() {
        if (a == null) {
            a = new achc();
        }
    }
}
