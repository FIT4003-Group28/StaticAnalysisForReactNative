package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cnkj  reason: default package */
/* loaded from: classes5.dex */
public final class cnkj implements cnjx {
    final byte[] a;
    final Integer b;
    final /* synthetic */ cnkr c;

    public cnkj(cnkr cnkrVar, byte[] bArr, Integer num) {
        this.c = cnkrVar;
        this.a = bArr;
        this.b = num;
    }

    @Override // defpackage.cnjx
    public final byte[] a() {
        return b().bS();
    }

    public final dujp b() {
        ArrayList arrayList = new ArrayList(this.c.k.size());
        for (cnkb cnkbVar : this.c.k.values()) {
            ain<aik<long[]>> ainVar = cnkbVar.c;
            int intValue = this.b.intValue();
            if (ainVar.b) {
                ainVar.d();
            }
            if (aii.e(ainVar.c, ainVar.e, intValue) >= 0) {
                arrayList.add(cnkbVar);
            }
        }
        dujo bZ = dujp.e.bZ();
        long j = this.c.j;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dujp dujpVar = (dujp) bZ.b;
        dujpVar.a |= 1;
        dujpVar.b = j;
        byte[] bArr = this.a;
        if (bArr.length != 0) {
            dspd x = dspd.x(bArr);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dujp dujpVar2 = (dujp) bZ.b;
            x.getClass();
            dujpVar2.a |= 4;
            dujpVar2.d = x;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cnkb cnkbVar2 = (cnkb) arrayList.get(i);
            aik<long[]> b = cnkbVar2.c.b(this.b.intValue());
            cnwc.a(b);
            dujm bZ2 = dujn.d.bZ();
            long a = cnkr.a(cnkbVar2.a);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dujn dujnVar = (dujn) bZ2.b;
            dujnVar.a = 1;
            dujnVar.b = Long.valueOf(a);
            b.e();
            ArrayList arrayList2 = new ArrayList(b.e());
            for (int i2 = 0; i2 < b.e(); i2++) {
                dujk bZ3 = dujl.d.bZ();
                long f = b.f(i2);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dujl dujlVar = (dujl) bZ3.b;
                dujlVar.a |= 1;
                dujlVar.b = f;
                long j2 = b.g(i2)[0];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dujl dujlVar2 = (dujl) bZ3.b;
                dujlVar2.a |= 2;
                dujlVar2.c = j2;
                arrayList2.add(bZ3.bK());
            }
            Collections.sort(arrayList2, cnki.a);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dujn dujnVar2 = (dujn) bZ2.b;
            dsrj<dujl> dsrjVar = dujnVar2.c;
            if (!dsrjVar.a()) {
                dujnVar2.c = dsqw.cl(dsrjVar);
            }
            dsod.bv(arrayList2, dujnVar2.c);
            dujn bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dujp dujpVar3 = (dujp) bZ.b;
            bK.getClass();
            dsrj<dujn> dsrjVar2 = dujpVar3.c;
            if (!dsrjVar2.a()) {
                dujpVar3.c = dsqw.cl(dsrjVar2);
            }
            dujpVar3.c.add(bK);
        }
        return bZ.bK();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cnkj) {
            return b().equals(((cnkj) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return b().toString();
    }
}
