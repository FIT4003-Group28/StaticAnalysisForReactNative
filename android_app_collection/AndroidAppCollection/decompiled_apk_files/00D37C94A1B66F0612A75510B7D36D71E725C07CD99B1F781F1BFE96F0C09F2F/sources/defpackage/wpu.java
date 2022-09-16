package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wpu  reason: default package */
/* loaded from: classes4.dex */
public final class wpu {
    public static void a(xgt xgtVar) {
        xgtVar.g(true);
    }

    public static Context b(Context context) {
        return new ContextThemeWrapper(context, (int) R.style.VerificationTheme);
    }

    public static afxq c(Context context, afsm afsmVar, afvy afvyVar) {
        return new afyb(context, afsmVar, afvyVar);
    }

    public static afxq d(Context context, afsm afsmVar, afvy afvyVar) {
        return new afyb(context, afsmVar, afvyVar);
    }

    public static final void e(eo eoVar, afve afveVar, apzg apzgVar) {
        vwx vwxVar = (vwx) eoVar.f("INCOGNITO_BOTTOM_SHEET_FRAGMENT");
        if (vwxVar != null) {
            vwxVar.ah = apzgVar;
            if (vwxVar.ap()) {
                return;
            }
            vwxVar.qw(eoVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
            return;
        }
        vwx vwxVar2 = new vwx();
        Bundle bundle = new Bundle();
        if (apzgVar != null) {
            bundle.putByteArray("endpoint", apzgVar.toByteArray());
        }
        vwxVar2.ae(bundle);
        vwxVar2.ag = afveVar;
        vwxVar2.qw(eoVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
    }
}
