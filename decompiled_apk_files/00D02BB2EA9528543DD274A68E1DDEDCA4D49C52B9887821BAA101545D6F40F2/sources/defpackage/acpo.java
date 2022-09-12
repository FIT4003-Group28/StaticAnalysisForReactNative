package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: acpo  reason: default package */
/* loaded from: classes2.dex */
public final class acpo extends dsna<String> implements acpj {
    public static final acpo a = new acpo();

    @Override // defpackage.acpj
    public final String a(String str, acpl acplVar) {
        dsnh dsnhVar = new dsnh();
        dsnhVar.l(acplVar.getWidth());
        dsnhVar.f(acplVar.getHeight());
        int i = acpn.a[acplVar.getScaleType().ordinal()];
        if (i == 1 || i == 2) {
            dsnhVar.d();
        } else if (i == 3) {
            dsnhVar.k();
        }
        try {
            return m(dsnhVar, b(Uri.parse(str)));
        } catch (dsmx unused) {
            return str;
        }
    }

    public final dsmz<String> b(Uri uri) {
        return new acpm(this, uri);
    }
}
