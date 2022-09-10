package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxo  reason: default package */
/* loaded from: classes.dex */
public final class azxo extends azxm<azvm> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.CONTACT;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azvm> c(byte[] bArr) {
        try {
            return new azvl((doga) dsqw.cq(doga.e, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        dogr dogrVar;
        if (doizVar.b == 10) {
            dogrVar = (dogr) doizVar.c;
        } else {
            dogrVar = dogr.b;
        }
        ArrayList arrayList = new ArrayList();
        for (dogq dogqVar : dogrVar.a) {
            azxm<azvm> azxmVar = azxm.a;
            doga dogaVar = dogqVar.b;
            if (dogaVar == null) {
                dogaVar = doga.e;
            }
            arrayList.add(azwj.a(azxmVar, Long.toString(dogaVar.a)));
            azxm<azvo> azxmVar2 = azxm.b;
            doga dogaVar2 = dogqVar.b;
            if (dogaVar2 == null) {
                dogaVar2 = doga.e;
            }
            arrayList.add(new azwj(azxmVar2, azwi.NUMERICAL_INDEX, null, Long.valueOf(dogaVar2.a)));
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azvm> e(doiz doizVar) {
        dogr dogrVar;
        if (doizVar.b == 10) {
            dogrVar = (dogr) doizVar.c;
        } else {
            dogrVar = dogr.b;
        }
        ArrayList arrayList = new ArrayList();
        for (dogq dogqVar : dogrVar.a) {
            int a = dogo.a(dogqVar.a);
            if (a != 0 && a == 2) {
                doga dogaVar = dogqVar.b;
                if (dogaVar == null) {
                    dogaVar = doga.e;
                }
                arrayList.add(new azvl(dogaVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azvm azvmVar) {
        return azvmVar.g().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.f;
    }
}
