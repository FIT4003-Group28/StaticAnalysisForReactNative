package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import com.google.android.youtube.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajgo  reason: default package */
/* loaded from: classes.dex */
public enum ajgo {
    ROBOTO_REGULAR(14, "sans-serif", 0),
    ROBOTO_LIGHT(16, "sans-serif-light", 1),
    ROBOTO_CONDENSED(16, "sans-serif-condensed", 2),
    ROBOTO_THIN(17, "sans-serif-thin", 3),
    ROBOTO_CONDENSED_LIGHT(20, "sans-serif-condensed-light", 4),
    ROBOTO_BLACK(21, "sans-serif-black", 5),
    ROBOTO_MEDIUM(21, "sans-serif-medium", 6),
    ROBOTO_MONOSPACE(21, "sans-serif-monospace", 7),
    ROBOTO_SMALLCAPS(21, "sans-serif-smallcaps", 8),
    YTSANS_MEDIUM("sans-serif-medium", 0, "YTSans-Medium.otf"),
    YTSANS_BOLD("sans-serif-bold", 1, "YTSans-Bold.otf"),
    YOUTUBE_SANS_LIGHT("sans-serif-light", 300),
    YOUTUBE_SANS_REGULAR("sans-serif", 400),
    YOUTUBE_SANS_MEDIUM("sans-serif-medium", 500),
    YOUTUBE_SANS_SEMIBOLD("sans-serif-semibold", 600),
    YOUTUBE_SANS_BOLD("sans-serif-bold", 700),
    YOUTUBE_SANS_EXTRABOLD("sans-serif-extrabold", 800),
    YOUTUBE_SANS_BLACK("sans-serif-black", 900);
    
    public static final Map s = DesugarCollections.synchronizedMap(new HashMap());
    private static final Object w = new Object();
    private final String A;
    final int t;
    final int u;
    public final int v;
    private final int y;
    private final String z;

    ajgo(int i, String str, int i2) {
        this.y = i;
        this.z = str;
        this.t = i2;
        this.A = null;
        this.u = -1;
        this.v = -1;
    }

    public static int a(ajgn ajgnVar) {
        return ajgnVar.ordinal() != 4 ? 0 : 1;
    }

    public static Typeface b(Typeface typeface, int i) {
        Typeface create;
        synchronized (w) {
            create = Typeface.create(typeface, i);
        }
        return create;
    }

    public static ajgo e(int i) {
        ajgo[] values;
        for (ajgo ajgoVar : values()) {
            if (ajgoVar.t == i) {
                return ajgoVar;
            }
        }
        return null;
    }

    public static ajgo f(int i) {
        ajgo[] values;
        for (ajgo ajgoVar : values()) {
            if (ajgoVar.u == i) {
                return ajgoVar;
            }
        }
        return null;
    }

    private static int g(ajgn ajgnVar) {
        switch (ajgnVar.ordinal()) {
            case 0:
                return R.font.youtube_sans_light;
            case 1:
                return R.font.youtube_sans;
            case 2:
                return R.font.youtube_sans_medium;
            case 3:
                return R.font.youtube_sans_semibold;
            case 4:
                return R.font.youtube_sans_bold;
            case 5:
                return R.font.youtube_sans_extrabold;
            case 6:
                return R.font.youtube_sans_black;
            default:
                return 0;
        }
    }

    private static Typeface h(int i) {
        return b(Typeface.SANS_SERIF, i);
    }

    private static void i(Context context, ajgn ajgnVar) {
        int g = g(ajgnVar);
        if (g == 0) {
            return;
        }
        String str = ajgnVar.i;
        Map map = s;
        synchronized (map) {
            if (((Typeface) map.get(str)) != null) {
                return;
            }
            try {
                gw.g(context, g, new ajgm(str, ajgnVar));
            } catch (Resources.NotFoundException e) {
                if (!Log.isLoggable("Typefaces", 6)) {
                    return;
                }
                String valueOf = String.valueOf(str);
                Log.e("Typefaces", valueOf.length() != 0 ? "Font not found: ".concat(valueOf) : new String("Font not found: "), e);
            } catch (RuntimeException e2) {
                if (!Log.isLoggable("Typefaces", 6)) {
                    return;
                }
                String valueOf2 = String.valueOf(str);
                Log.e("Typefaces", valueOf2.length() != 0 ? "Failed to load font: ".concat(valueOf2) : new String("Failed to load font: "), e2);
            }
        }
    }

    public final Typeface c(Context context) {
        return d(context, 0);
    }

    ajgo(String str, int i) {
        this.z = str;
        this.u = -1;
        this.t = -1;
        this.y = Integer.MAX_VALUE;
        this.v = i;
        this.A = i == ajgn.BOLD.h ? "youtube_sans_bold_font.ttf" : null;
    }

    ajgo(String str, int i, String str2) {
        this.z = str;
        this.u = i;
        this.A = str2;
        this.t = -1;
        this.y = Integer.MAX_VALUE;
        this.v = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface d(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgo.d(android.content.Context, int):android.graphics.Typeface");
    }
}
