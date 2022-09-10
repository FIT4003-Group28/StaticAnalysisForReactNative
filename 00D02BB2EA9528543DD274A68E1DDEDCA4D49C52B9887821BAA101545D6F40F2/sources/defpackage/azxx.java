package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxx  reason: default package */
/* loaded from: classes.dex */
public final class azxx extends azxm<azxe> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.RESERVATION;
    }

    @Override // defpackage.azxm
    public final azwh<azxe> c(byte[] bArr) {
        try {
            return new azxd((drjs) dsqw.cq(drjs.h, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        doie doieVar;
        if (doizVar.b == 21) {
            doieVar = (doie) doizVar.c;
        } else {
            doieVar = doie.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doid doidVar : doieVar.a) {
            int a = doib.a(doidVar.a);
            if (a != 0 && a == 3) {
                azxm<azxe> azxmVar = azxm.m;
                drjs drjsVar = doidVar.b;
                if (drjsVar == null) {
                    drjsVar = drjs.h;
                }
                arrayList.add(azwj.a(azxmVar, drjsVar.c));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azxe> e(doiz doizVar) {
        doie doieVar;
        if (doizVar.b == 21) {
            doieVar = (doie) doizVar.c;
        } else {
            doieVar = doie.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doid doidVar : doieVar.a) {
            int a = doib.a(doidVar.a);
            if (a != 0 && a == 2) {
                drjs drjsVar = doidVar.b;
                if (drjsVar == null) {
                    drjsVar = drjs.h;
                }
                arrayList.add(new azxd(drjsVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azxe azxeVar) {
        return azxeVar.g().bS();
    }
}
