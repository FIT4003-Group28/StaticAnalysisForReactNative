package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aluv  reason: default package */
/* loaded from: classes.dex */
public final class aluv {
    public static int a(Resources resources) {
        return (((int) Math.floor(resources.getDisplayMetrics().widthPixels / 128.0f)) + 2) * (((int) Math.floor(resources.getDisplayMetrics().heightPixels / 128.0f)) + 2);
    }

    public static int b(Resources resources) {
        int i = resources.getDisplayMetrics().widthPixels * resources.getDisplayMetrics().heightPixels;
        if (i < 409920) {
            i = 409920;
        }
        return (i * 24) / 409920;
    }
}
