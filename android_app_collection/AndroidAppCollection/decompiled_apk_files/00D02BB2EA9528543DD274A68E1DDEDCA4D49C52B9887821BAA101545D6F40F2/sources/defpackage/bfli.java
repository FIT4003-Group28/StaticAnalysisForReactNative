package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfli  reason: default package */
/* loaded from: classes3.dex */
public class bfli {
    private final gga a;
    private final brba b;

    public bfli(brba brbaVar, gga ggaVar) {
        this.b = brbaVar;
        this.a = ggaVar;
    }

    public static List<dwcg> b(ilo iloVar) {
        ArrayList arrayList = new ArrayList();
        for (dwca dwcaVar : iloVar.h().aD) {
            int a = dwck.a(dwcaVar.b);
            if (a != 0 && a == 3) {
                arrayList.addAll(dwcaVar.a);
            }
        }
        return arrayList;
    }

    public final void a(List<dwcg> list) {
        ArrayList arrayList = new ArrayList();
        for (dwcg dwcgVar : list) {
            arrayList.add(dwcgVar.e);
        }
        brba brbaVar = this.b;
        String string = this.a.getString(R.string.DEPARTMENTS_HEADER);
        bray d = braz.d();
        begh beghVar = new begh();
        beghVar.a = true;
        ((braj) d).a = beghVar;
        d.b(cjqm.a);
        d.c(true);
        brbaVar.t(string, arrayList, d.a());
    }
}
