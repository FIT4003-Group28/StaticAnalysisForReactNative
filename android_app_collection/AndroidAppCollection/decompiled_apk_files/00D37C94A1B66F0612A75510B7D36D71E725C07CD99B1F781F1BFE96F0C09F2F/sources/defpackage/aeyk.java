package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aeyk  reason: default package */
/* loaded from: classes.dex */
public final class aeyk extends bbw {
    public aeyk(List list) {
        super(list, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbw
    public final bcc a(bcc bccVar) {
        long[] jArr;
        long[] jArr2;
        if (bccVar == null || bccVar.b != 1 || (jArr = bccVar.h) == null || jArr.length != 1 || jArr[0] <= 0 || (jArr2 = bccVar.i) == null || jArr2.length != 1 || jArr2[0] < 0) {
            return bccVar;
        }
        afms.a(jArr2);
        afms.a(bccVar.h);
        return new bcc(bccVar.a, bccVar.b, bccVar.c, bccVar.d, bccVar.e, bccVar.f.d((int) pxi.n(bccVar.i[0], bccVar.f.z, bccVar.c), (int) (1024 - (pxi.n(bccVar.i[0] + bccVar.h[0], bccVar.f.z, bccVar.c) % 1024))), bccVar.g, bccVar.k, bccVar.j, bccVar.h, bccVar.i);
    }
}
