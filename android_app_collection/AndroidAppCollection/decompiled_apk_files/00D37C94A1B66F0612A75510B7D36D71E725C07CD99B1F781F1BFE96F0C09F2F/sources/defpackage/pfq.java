package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pfq  reason: default package */
/* loaded from: classes4.dex */
public final class pfq extends pfp {
    public pfq(List list) {
        super(list);
    }

    @Override // defpackage.pfp
    protected final pft b(pft pftVar) {
        long[] jArr;
        long[] jArr2;
        if (pftVar == null || pftVar.b != 1 || (jArr = pftVar.h) == null || jArr.length != 1 || jArr[0] <= 0 || (jArr2 = pftVar.i) == null || jArr2.length != 1 || jArr2[0] < 0) {
            return pftVar;
        }
        return new pft(pftVar.a, pftVar.b, pftVar.c, pftVar.d, pftVar.e, pftVar.f.d((int) pxi.n(jArr2[0], pftVar.f.z, pftVar.c), (int) (1024 - (pxi.n(pftVar.i[0] + pftVar.h[0], pftVar.f.z, pftVar.c) % 1024))), pftVar.g, pftVar.k, pftVar.j, pftVar.h, pftVar.i);
    }
}
