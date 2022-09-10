package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxn  reason: default package */
/* loaded from: classes.dex */
public final class azxn extends azxm<azxa> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.PLACE_ALIAS;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azxa> c(byte[] bArr) {
        try {
            return new azwz((dofy) dsqw.cq(dofy.i, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        doht dohtVar;
        if (doizVar.b == 16) {
            dohtVar = (doht) doizVar.c;
        } else {
            dohtVar = doht.b;
        }
        ArrayList arrayList = new ArrayList();
        for (dohs dohsVar : dohtVar.a) {
            int a = dohq.a(dohsVar.a);
            if (a != 0 && a == 3) {
                azxm<azxa> azxmVar = azxm.h;
                dofy dofyVar = dohsVar.b;
                if (dofyVar == null) {
                    dofyVar = dofy.i;
                }
                arrayList.add(azwj.a(azxmVar, azxa.l(dofyVar)));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azxa> e(doiz doizVar) {
        doht dohtVar;
        if (doizVar.b == 16) {
            dohtVar = (doht) doizVar.c;
        } else {
            dohtVar = doht.b;
        }
        ArrayList arrayList = new ArrayList();
        for (dohs dohsVar : dohtVar.a) {
            int a = dohq.a(dohsVar.a);
            if (a != 0 && a == 2) {
                dofy dofyVar = dohsVar.b;
                if (dofyVar == null) {
                    dofyVar = dofy.i;
                }
                arrayList.add(new azwz(dofyVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azxa azxaVar) {
        return azxaVar.k().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.l;
    }
}
