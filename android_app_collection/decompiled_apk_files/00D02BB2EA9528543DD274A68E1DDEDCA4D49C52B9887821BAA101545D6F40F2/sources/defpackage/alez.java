package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: alez  reason: default package */
/* loaded from: classes2.dex */
public final class alez extends algj {
    public alez(amub amubVar, akrk akrkVar) {
        super(amubVar, akrkVar);
    }

    public static alez a(amub amubVar, akrk akrkVar) {
        return new alez(amubVar, akrkVar);
    }

    public static String b(Resources resources, int i) {
        String[] stringArray = resources.getStringArray(R.array.CALLOUT_ALPHABETIC_LABELS);
        return stringArray[i % stringArray.length];
    }
}
