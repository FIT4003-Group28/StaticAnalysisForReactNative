package defpackage;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.util.Rational;
/* compiled from: PG */
/* renamed from: bvrl  reason: default package */
/* loaded from: classes4.dex */
public class bvrl {
    public static boolean a(Activity activity, int i, int i2) {
        return activity.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(3, 4)).build());
    }

    public static boolean b(Activity activity) {
        return activity.isInPictureInPictureMode();
    }
}
