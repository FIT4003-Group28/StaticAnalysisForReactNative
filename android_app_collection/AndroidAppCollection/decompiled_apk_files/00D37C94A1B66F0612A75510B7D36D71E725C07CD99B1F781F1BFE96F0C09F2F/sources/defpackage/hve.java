package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorConstantActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorIntActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ThemedActionBarColor;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: hve  reason: default package */
/* loaded from: classes3.dex */
public final class hve {
    public static Uri b(aunb aunbVar) {
        aunbVar.getClass();
        if (!aunbVar.qn(StickerCatalogRendererOuterClass.stickerRenderer)) {
            return null;
        }
        auzi auziVar = (auzi) aunbVar.qm(StickerCatalogRendererOuterClass.stickerRenderer);
        if ((auziVar.b & 1) != 0) {
            avhn avhnVar = auziVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            return akel.q(avhnVar);
        } else if (auziVar.d.size() == 0) {
            return null;
        } else {
            return akel.q((avhn) auziVar.d.get(0));
        }
    }

    public static String c(Uri uri) {
        return zny.b(uri.getLastPathSegment());
    }

    public static List d(aunb aunbVar) {
        aunbVar.getClass();
        aqxo.y(aunbVar.qn(StickerCatalogRendererOuterClass.stickerRenderer));
        ArrayList arrayList = new ArrayList();
        for (avhn avhnVar : ((auzi) aunbVar.qm(StickerCatalogRendererOuterClass.stickerRenderer)).d) {
            Uri q = akel.q(avhnVar);
            if (q != null) {
                arrayList.add(q.toString());
            }
        }
        return arrayList;
    }

    public static aoob e(aoqu aoquVar) {
        asvv b = acun.b(aoquVar);
        return b != null ? b.d : aoob.b;
    }

    public static ActionBarColor g(int i) {
        return new AutoValue_ActionBarColor_ColorConstantActionBarColor(i);
    }

    public static ActionBarColor h(int i) {
        return new AutoValue_ActionBarColor_ColorIntActionBarColor(i);
    }

    public static ActionBarColor i(int i) {
        return new AutoValue_ActionBarColor_ThemedActionBarColor(i);
    }

    public static ActionBarColor j() {
        return h(0);
    }

    public static String k(avhn avhnVar) {
        if (avhnVar != null) {
            aovs aovsVar = avhnVar.d;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            if ((aovrVar.b & 2) == 0) {
                return null;
            }
            aovs aovsVar2 = avhnVar.d;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            return aovrVar2.c;
        }
        return null;
    }

    public static boolean l(List list, Class cls) {
        if (list != null) {
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static acte a(auzh auzhVar) {
        int e = aqvb.e(auzhVar.c);
        if (e == 0 || e != 4) {
            asvv b = acun.b(auzhVar);
            return new acte(b != null ? b.d : aoob.b);
        }
        return new acte(actj.EDIT_STICKER_EMOJI_RENDERER);
    }

    public static hqt f(dp dpVar) {
        if (dpVar == null) {
            throw new IllegalStateException("Could not find VideoEffectsComponent from a parent fragment. Make sure the current fragment is a child of VideoEffectsComponentSupplier.");
        }
        if (!(dpVar instanceof hqu)) {
            return f(dpVar.C);
        }
        return ((hqu) dpVar).h();
    }
}
