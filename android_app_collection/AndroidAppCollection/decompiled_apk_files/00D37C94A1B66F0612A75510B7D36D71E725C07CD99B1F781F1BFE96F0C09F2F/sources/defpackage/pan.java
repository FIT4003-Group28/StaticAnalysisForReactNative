package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: pan  reason: default package */
/* loaded from: classes4.dex */
public final class pan implements oxq {
    private boolean d;
    private boolean e;
    private boolean f;
    private oxr g;
    private final pao a = new pao();
    private final pct c = new pct(4096);
    private final SparseArray b = new SparseArray();

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.g = oxrVar;
        oxrVar.pS(oye.f);
    }

    @Override // defpackage.oxq
    public final void d() {
        this.a.b();
        for (int i = 0; i < this.b.size(); i++) {
            pam pamVar = (pam) this.b.valueAt(i);
            pamVar.f = false;
            pamVar.a.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.oxn r16, defpackage.oxz r17) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pan.e(oxn, oxz):int");
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        byte[] bArr = new byte[14];
        oxnVar.g(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            oxnVar.e(bArr[13] & 7);
            oxnVar.g(bArr, 0, 3);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }
}
