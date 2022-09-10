package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxp  reason: default package */
/* loaded from: classes.dex */
public final class azxp extends azxm<azvo> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.CONTACT_ADDRESS;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azvo> c(byte[] bArr) {
        try {
            return new azvn((dogc) dsqw.cq(dogc.e, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        return dcdc.e();
    }

    @Override // defpackage.azxm
    public final List<azvo> e(doiz doizVar) {
        dogi dogiVar;
        if (doizVar.b == 2) {
            dogiVar = (dogi) doizVar.c;
        } else {
            dogiVar = dogi.b;
        }
        ArrayList arrayList = new ArrayList();
        for (dogh doghVar : dogiVar.a) {
            int a = dogf.a(doghVar.a);
            if (a != 0 && a == 2) {
                dogc dogcVar = doghVar.b;
                if (dogcVar == null) {
                    dogcVar = dogc.e;
                }
                arrayList.add(new azvn(dogcVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azvo azvoVar) {
        return azvoVar.m().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.g;
    }
}
