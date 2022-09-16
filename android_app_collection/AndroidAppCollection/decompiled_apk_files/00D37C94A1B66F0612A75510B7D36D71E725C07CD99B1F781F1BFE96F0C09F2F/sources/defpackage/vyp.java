package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vyp  reason: default package */
/* loaded from: classes4.dex */
public final class vyp {
    public static String a(int i) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("incognito_session_");
        sb.append(i);
        sb.append("||");
        return sb.toString();
    }

    public static int b(PlayerConfigModel playerConfigModel) {
        int i;
        atzv atzvVar = playerConfigModel.c;
        int i2 = -1;
        if ((atzvVar.b & 16777216) != 0) {
            apam apamVar = atzvVar.q;
            if (apamVar == null) {
                apamVar = apam.a;
            }
            i = apamVar.b;
        } else {
            i = -1;
        }
        if (i >= 0) {
            i2 = (int) TimeUnit.SECONDS.convert(i, TimeUnit.MILLISECONDS);
        }
        if (i2 < 0) {
            return 5000;
        }
        return (int) TimeUnit.MILLISECONDS.convert(i2, TimeUnit.SECONDS);
    }

    public static void c(xgt xgtVar, wzx wzxVar, auwo auwoVar, wzr wzrVar, PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2, xdb xdbVar, boolean z, int i) {
        xhh b = xhi.b();
        if (auwoVar != null) {
            b.l(auwoVar);
        }
        b.b(wzrVar);
        b.d(xho.a(playerResponseModel.A(), playerResponseModel.b()));
        boolean z2 = z && i > 7;
        b.m(true != z2 ? 2 : 0);
        if (z2) {
            b.p(b(playerResponseModel.c()));
        }
        b.o((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS));
        if (playerResponseModel2 != null) {
            b.g((playerResponseModel2.a.b & 536870912) != 0);
        }
        b.c(xdbVar);
        if (z2) {
            if (wzxVar.c) {
                float f = wzxVar.d;
                int i2 = wzxVar.e;
                if (f == 0.0f || i2 == 0) {
                    afus.b(2, 1, String.format(Locale.ENGLISH, "Unexpected custom dimensions: scaling factor %f, padding %d", Float.valueOf(f), Integer.valueOf(i2)));
                } else {
                    b.e(true);
                    b.k(f);
                    b.j(i2);
                }
            } else if (wzxVar.b) {
                b.f(true);
            }
        }
        xgtVar.a = b.a();
    }

    public static boolean d(xgt xgtVar, boolean z) {
        if (xgtVar.f().d == 2 || xgtVar.f().e == z) {
            return false;
        }
        xhh a = xgtVar.f().a();
        a.i(z);
        xgtVar.a = a.a();
        return true;
    }

    public static boolean e(xgt xgtVar, PlayerConfigModel playerConfigModel, int i, int i2) {
        xhi f = xgtVar.f();
        xhh a = f.a();
        a.o(((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS)) - i2);
        boolean z = false;
        if (f.d != 0) {
            xgtVar.a = a.a();
            return false;
        }
        int b = b(playerConfigModel) - i2;
        if (b > 0) {
            a.p(b);
        } else if (f.d == 0) {
            a.m(1);
            a.p(0);
            z = true;
        }
        xgtVar.a = a.a();
        return z;
    }

    public static boolean f(xgt xgtVar, aozt aoztVar, Uri uri, apzg apzgVar) {
        arag aragVar;
        boolean z;
        arag aragVar2 = null;
        if ((aoztVar.b & 8) != 0) {
            aragVar = aoztVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        CharSequence charSequence = "<NONE>";
        if (TextUtils.isEmpty(ajgl.b(aragVar)) || (uri == null && apzgVar == null)) {
            z = false;
        } else {
            if ((aoztVar.b & 8) != 0 && (aragVar2 = aoztVar.e) == null) {
                aragVar2 = arag.a;
            }
            charSequence = ajgl.b(aragVar2);
            z = true;
        }
        if (!z) {
            return false;
        }
        xhd a = xhe.a();
        a.b(true);
        a.d(charSequence);
        xgtVar.d = a.a();
        return true;
    }
}
