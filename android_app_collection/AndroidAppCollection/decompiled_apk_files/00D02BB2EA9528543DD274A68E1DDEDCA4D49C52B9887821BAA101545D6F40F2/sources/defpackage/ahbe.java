package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahbe  reason: default package */
/* loaded from: classes2.dex */
public final class ahbe {
    private final ahbd a;
    private final ahbg b;
    private final ahfk c;

    public ahbe(ahbd ahbdVar, ahbg ahbgVar, ahfk ahfkVar) {
        this.a = ahbdVar;
        this.b = ahbgVar;
        this.c = ahfkVar;
    }

    @dzsi
    public final ahbf a(dlcv dlcvVar, int i, agyh agyhVar) {
        dkzu dkzuVar;
        if (dlcvVar.b == 24) {
            dkzuVar = (dkzu) dlcvVar.c;
        } else {
            dkzuVar = dkzu.d;
        }
        if (dkzuVar.c.size() == 0) {
            return null;
        }
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        ddyuVar.a = i3 | 8;
        ddyuVar.d = i;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        int i4 = 1;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        cjta z2 = ahhv.z(dkzuVar.a, i, bK2, agyhVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (i5 < dkzuVar.c.size()) {
            ahfk ahfkVar = this.c;
            dkzt dkztVar = dkzuVar.c.get(i5);
            gga a = ahfkVar.a.a();
            ahfk.a(a, i4);
            beqf a2 = ahfkVar.b.a();
            ahfk.a(a2, 2);
            ahfo a3 = ahfkVar.c.a();
            ahfk.a(a3, 3);
            ahfk.a(dkztVar, 4);
            ahfk.a(bK2, 5);
            ahfj ahfjVar = new ahfj(a, a2, a3, dkztVar, bK2);
            arrayList.add(ahfjVar);
            arrayList2.add(ahfjVar.e());
            i5++;
            i4 = 1;
        }
        agci agciVar = new agci();
        agciVar.a(false);
        agciVar.a(arrayList.size() != 1);
        String str = agciVar.a == null ? " useFixedLayoutHeight" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        agnd agndVar = new agnd(new agcj(agciVar.a.booleanValue()));
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList3.add(cqgr.fT(agndVar, (ahfj) arrayList.get(i6)));
        }
        ArrayList arrayList4 = new ArrayList();
        aged agedVar = new aged();
        ahbd ahbdVar = this.a;
        z2.d = dtxu.bL;
        arrayList4.add(agxa.a(agedVar, new ahat(ahbdVar.a(arrayList3, z2.a()).a())));
        ahbg ahbgVar = this.b;
        String str2 = dkzuVar.b;
        ahdc a4 = ahbgVar.a.a();
        ahbg.a(a4, 1);
        ahht a5 = ahbgVar.b.a();
        ahbg.a(a5, 2);
        ahbg.a(dlcvVar, 3);
        ahbg.a(agyhVar, 4);
        ahbg.a(str2, 5);
        ahbg.a(arrayList4, 6);
        ahbg.a(arrayList2, 7);
        ahbg.a(z2, 8);
        return new ahbf(a4, a5, dlcvVar, agyhVar, str2, arrayList4, arrayList2, z2);
    }
}
