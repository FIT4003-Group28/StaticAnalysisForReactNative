package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ckuk  reason: default package */
/* loaded from: classes4.dex */
final class ckuk implements cnon<cood> {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ ckum c;

    public ckuk(ckum ckumVar, String str, long j) {
        this.c = ckumVar;
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(cood coodVar) {
        cood coodVar2 = coodVar;
        try {
            if (!coodVar2.b.d()) {
                this.c.a(this.a, this.b, null);
                return;
            }
            ArrayList<ckwb> arrayList = new ArrayList<>();
            Iterator<cooc> it = coodVar2.iterator();
            while (it.hasNext()) {
                cooc next = it.next();
                LatLng d = next.d();
                ckwa bZ = ckwb.f.bZ();
                String charSequence = next.c().toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ckwb ckwbVar = (ckwb) bZ.b;
                charSequence.getClass();
                ckwbVar.a |= 2;
                ckwbVar.c = charSequence;
                String charSequence2 = next.b().toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ckwb ckwbVar2 = (ckwb) bZ.b;
                charSequence2.getClass();
                ckwbVar2.a |= 4;
                ckwbVar2.d = charSequence2;
                ckvy bZ2 = ckvz.d.bZ();
                double d2 = d.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ckvz ckvzVar = (ckvz) bZ2.b;
                int i = ckvzVar.a | 1;
                ckvzVar.a = i;
                ckvzVar.b = d2;
                double d3 = d.b;
                ckvzVar.a = i | 2;
                ckvzVar.c = d3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ckwb ckwbVar3 = (ckwb) bZ.b;
                ckvz bK = bZ2.bK();
                bK.getClass();
                ckwbVar3.e = bK;
                ckwbVar3.a |= 8;
                arrayList.add(bZ.bK());
            }
            this.c.a(this.a, this.b, arrayList);
        } finally {
            coodVar2.b();
        }
    }
}
