package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxz  reason: default package */
/* loaded from: classes.dex */
public final class azxz extends azxm<azxi> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.SAVES_LIST;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azxi> c(byte[] bArr) {
        try {
            return new azxh((dolo) dsqw.cq(dolo.d, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        doiq doiqVar;
        if (doizVar.b == 18) {
            doiqVar = (doiq) doizVar.c;
        } else {
            doiqVar = doiq.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doip doipVar : doiqVar.a) {
            int a = doin.a(doipVar.a);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            int a2 = doin.a(doipVar.a);
            if (a2 == 0 || a2 != 2 || !doipVar.c) {
                z = false;
            }
            if (a == 3 || z) {
                dolo doloVar = doipVar.b;
                if (doloVar == null) {
                    doloVar = dolo.d;
                }
                dpot dpotVar = doloVar.b;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                dpov dpovVar = dpotVar.b;
                if (dpovVar == null) {
                    dpovVar = dpov.f;
                }
                String str = dpovVar.b;
                azwj b = azwj.b(azxm.k, str);
                b.e();
                arrayList.add(b);
                azwj a3 = azwj.a(azxm.j, str);
                a3.e();
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azxi> e(doiz doizVar) {
        doiq doiqVar;
        if (doizVar.b == 18) {
            doiqVar = (doiq) doizVar.c;
        } else {
            doiqVar = doiq.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doip doipVar : doiqVar.a) {
            int a = doin.a(doipVar.a);
            if (a != 0 && a == 2) {
                dolo doloVar = doipVar.b;
                if (doloVar == null) {
                    doloVar = dolo.d;
                }
                arrayList.add(new azxh(doloVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azxi azxiVar) {
        return azxiVar.j().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.m;
    }
}
