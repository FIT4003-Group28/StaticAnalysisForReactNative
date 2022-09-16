package defpackage;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wwg  reason: default package */
/* loaded from: classes4.dex */
public final class wwg {
    private final xcp a;
    private final wli b;
    private final xey c;
    private final xdu d;
    private final xci e;
    private final Set f = new HashSet();
    private final wnm g;

    public wwg(wnm wnmVar, wli wliVar, xey xeyVar, xcp xcpVar, xdu xduVar, xci xciVar) {
        this.g = wnmVar;
        this.b = wliVar;
        this.c = xeyVar;
        this.a = xcpVar;
        this.d = xduVar;
        this.e = xciVar;
    }

    private final void d(int i, int i2, boolean z, afzn... afznVarArr) {
        ArrayList<apae> arrayList;
        List<apae> list = (List) this.a.a.get(Integer.valueOf(i));
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (apae apaeVar : list) {
                if (i2 >= apaeVar.d && (!z || !this.f.contains(apaeVar))) {
                    arrayList2.add(apaeVar);
                }
            }
            arrayList = arrayList2;
        }
        for (apae apaeVar2 : arrayList) {
            this.f.add(apaeVar2);
            try {
                try {
                    try {
                        this.g.b(this.c, apaeVar2, this.b.a(zgt.i(apaeVar2.c), afznVarArr));
                    } catch (wup e) {
                        xdu xduVar = this.d;
                        xci xciVar = this.e;
                        String valueOf = String.valueOf(e.getMessage());
                        wwf.b(xduVar, xciVar, valueOf.length() != 0 ? "Failed to log the ping: ".concat(valueOf) : new String("Failed to log the ping: "));
                    }
                } catch (wlb e2) {
                    xdu xduVar2 = this.d;
                    xci xciVar2 = this.e;
                    String valueOf2 = String.valueOf(e2.getMessage());
                    wwf.b(xduVar2, xciVar2, valueOf2.length() != 0 ? "Failed to apply macro: ".concat(valueOf2) : new String("Failed to apply macro: "));
                }
            } catch (MalformedURLException unused) {
                wwf.b(this.d, this.e, String.format("Badly formed uri in ABR path: %s", apaeVar2.c));
            }
        }
    }

    public final void a(int i, afzn... afznVarArr) {
        d(i, Integer.MAX_VALUE, false, afznVarArr);
    }

    public final void b(int i, afzn... afznVarArr) {
        d(i, Integer.MAX_VALUE, true, afznVarArr);
    }

    public final void c(int i, afzn... afznVarArr) {
        d(14, i, true, afznVarArr);
    }
}
