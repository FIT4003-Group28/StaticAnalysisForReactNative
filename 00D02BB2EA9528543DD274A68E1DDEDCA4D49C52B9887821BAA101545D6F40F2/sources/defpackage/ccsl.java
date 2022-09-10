package defpackage;

import com.google.android.gms.vision.label.internal.client.LabelOptions;
/* compiled from: PG */
/* renamed from: ccsl  reason: default package */
/* loaded from: classes4.dex */
public final class ccsl {
    static {
        new LabelOptions(3);
    }

    public ccsl(btvo btvoVar) {
        dwoy f = btvoVar.getUgcOfferingsParameters().f();
        dcdg p = dcdn.p();
        for (dwox dwoxVar : f.a) {
            dcdg p2 = dcdn.p();
            for (dwow dwowVar : dwoxVar.b) {
                p2.f(dwowVar.a, Float.valueOf(dwowVar.b));
            }
            dgfb b = dgfb.b(dwoxVar.a);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            p.f(b, p2.b());
        }
        p.b();
    }
}
