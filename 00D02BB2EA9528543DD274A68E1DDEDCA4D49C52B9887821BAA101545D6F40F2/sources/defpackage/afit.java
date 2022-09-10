package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
/* compiled from: PG */
/* renamed from: afit  reason: default package */
/* loaded from: classes.dex */
public final class afit implements afip {
    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        return "google.streetview".equalsIgnoreCase(intent.getData().getScheme());
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        dggg dgggVar;
        dbsk.l(a(intent));
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();
        afiu afiuVar = new afiu();
        afiuVar.parseQuery(data.getEncodedSchemeSpecificPart());
        String value = afiuVar.getValue("title");
        akqq a = afhi.a(afiuVar, "cbll");
        if (afiuVar.hasParameter("panoid")) {
            dgge w = afhi.w(afiuVar);
            if (w == null) {
                w = dgge.IMAGE_ALLEYCAT;
            }
            dggf bZ = dggg.d.bZ();
            String value2 = afiuVar.getValue("panoid");
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar2 = (dggg) bZ.b;
            value2.getClass();
            int i = dgggVar2.a | 2;
            dgggVar2.a = i;
            dgggVar2.c = value2;
            dgggVar2.b = w.l;
            dgggVar2.a = i | 1;
            dgggVar = bZ.bK();
        } else {
            dgggVar = null;
        }
        UserOrientation v = afhi.v(afiuVar);
        if (a != null || dgggVar != null) {
            afhz afhzVar = new afhz();
            afhzVar.a = afib.STREET_VIEW;
            afhzVar.w = a;
            afhzVar.x = dgggVar;
            afhzVar.y = v;
            afhzVar.b = value;
            afhzVar.G = str;
            if (extras != null) {
                afhzVar.N = extras.getBoolean("GMM_ENABLE_ONE_BACK_TAP", false);
            }
            return afhzVar.a();
        }
        return afia.R;
    }
}
