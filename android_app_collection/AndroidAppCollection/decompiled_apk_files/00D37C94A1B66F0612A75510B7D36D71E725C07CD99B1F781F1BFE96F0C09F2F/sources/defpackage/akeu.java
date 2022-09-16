package defpackage;

import android.content.Context;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: akeu  reason: default package */
/* loaded from: classes.dex */
public final class akeu implements tfj {
    private static Typeface c(Context context, ampq ampqVar) {
        aket aketVar;
        if (ampqVar.h()) {
            aketVar = (aket) ampqVar.c();
        } else {
            aketVar = aket.MEDIUM;
        }
        if (aketVar.ordinal() == 4) {
            return ajgo.YOUTUBE_SANS_BOLD.d(context, 1);
        }
        return ajgo.YTSANS_MEDIUM.c(context);
    }

    private static boolean d(String str) {
        return str.startsWith("YouTubeSans");
    }

    private static boolean e(String str) {
        return str.startsWith("YTSans");
    }

    private static final Typeface f(Context context, ampq ampqVar) {
        switch (((aket) ampqVar.e(aket.BOLD)).ordinal()) {
            case 0:
                return ajgo.YOUTUBE_SANS_LIGHT.c(context);
            case 1:
                return ajgo.YOUTUBE_SANS_REGULAR.c(context);
            case 2:
                return ajgo.YOUTUBE_SANS_MEDIUM.c(context);
            case 3:
                return ajgo.YOUTUBE_SANS_SEMIBOLD.c(context);
            case 4:
                return ajgo.YOUTUBE_SANS_BOLD.c(context);
            case 5:
                return ajgo.YOUTUBE_SANS_EXTRABOLD.c(context);
            case 6:
                return ajgo.YOUTUBE_SANS_BLACK.c(context);
            default:
                return null;
        }
    }

    @Override // defpackage.tfj
    public final Typeface a(Context context, String str) {
        if (d(str)) {
            return f(context, aket.a(str, "YouTubeSans"));
        }
        if (!e(str)) {
            return null;
        }
        return c(context, aket.a(str, "YTSans"));
    }

    @Override // defpackage.tfj
    public final Typeface b(Context context, String str, int i) {
        ampq ampqVar;
        aket[] values = aket.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                aket aketVar = values[i2];
                if (i == aketVar.i) {
                    ampqVar = ampq.j(aketVar);
                    break;
                }
                i2++;
            } else {
                ampqVar = amon.a;
                break;
            }
        }
        if (d(str)) {
            return f(context, ampqVar);
        }
        if (!e(str)) {
            return null;
        }
        return c(context, ampqVar);
    }
}
