package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.Comparator;
/* renamed from: alby  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class alby implements Comparator {
    static final Comparator a = new alby();

    private alby() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        GmmNotice gmmNotice = (GmmNotice) obj2;
        Comparator c = alca.a.c();
        doza b = doza.b(((GmmNotice) obj).c().e);
        if (b == null) {
            b = doza.INFORMATION;
        }
        doza b2 = doza.b(gmmNotice.c().e);
        if (b2 == null) {
            b2 = doza.INFORMATION;
        }
        return c.compare(b, b2);
    }
}
