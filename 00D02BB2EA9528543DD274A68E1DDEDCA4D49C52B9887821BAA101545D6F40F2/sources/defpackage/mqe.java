package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: mqe  reason: default package */
/* loaded from: classes7.dex */
public final class mqe implements mpd {
    private static final cqfc a = new mqd();
    private final Context b;
    @dzsi
    private CharSequence c;

    public mqe(Context context, @dzsi ilo iloVar) {
        this.b = context;
        c(iloVar);
    }

    @Override // defpackage.mpd
    @dzsi
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.mpd
    public cqfc b() {
        return a;
    }

    public void c(@dzsi ilo iloVar) {
        String str = null;
        if (iloVar == null) {
            this.c = null;
            return;
        }
        List<dnoj> bz = iloVar.bz();
        if (!bz.isEmpty()) {
            TreeSet k = dcnm.k(String.CASE_INSENSITIVE_ORDER);
            for (dnoj dnojVar : bz) {
                dnpq dnpqVar = dnojVar.b;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                String str2 = dnpqVar.d;
                String str3 = dnpqVar.c;
                if (true == dbsj.d(str2)) {
                    str2 = str3;
                }
                if (!dbsj.d(str2)) {
                    k.add(alp.a().b(str2));
                }
            }
            if (!k.isEmpty()) {
                str = bqq.c(this.b, R.string.CAR_BUSINESS_ATTRIBUTION, "attribution_count", Integer.valueOf(k.size()), "business_name", bvsm.a(dcdc.r(k), this.b.getResources())).trim();
            }
        }
        this.c = str;
    }
}
