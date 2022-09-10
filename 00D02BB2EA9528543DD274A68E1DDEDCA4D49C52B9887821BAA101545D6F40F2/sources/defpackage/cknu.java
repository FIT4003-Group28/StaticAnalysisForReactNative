package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cknu  reason: default package */
/* loaded from: classes4.dex */
public final class cknu {
    public static Uri a(btvo btvoVar, String str, UserOrientation userOrientation, boolean z) {
        boolean z2 = btvoVar.getEnableFeatureParameters().x;
        String str2 = btvoVar.getServerSettingParameters().b;
        String str3 = btvoVar.getImageryViewerParameters().a;
        if (!z2 || dbsj.d(str3)) {
            str3 = "an_mobile";
        }
        Uri.Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("cb_client", str3).appendQueryParameter("output", "report").appendQueryParameter("panoid", str).appendQueryParameter("cbp", userOrientation.e()).appendQueryParameter("hl", Locale.getDefault().toString());
        if (z) {
            appendQueryParameter.appendQueryParameter("has_annotation", "1");
        }
        return appendQueryParameter.build();
    }
}
