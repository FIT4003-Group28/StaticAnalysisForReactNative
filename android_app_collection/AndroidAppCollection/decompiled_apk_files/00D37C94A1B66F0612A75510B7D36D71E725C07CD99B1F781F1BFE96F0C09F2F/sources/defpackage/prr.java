package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: prr  reason: default package */
/* loaded from: classes4.dex */
public final class prr implements prv {
    public final prh[] a;
    private final int[] b;

    public prr(int[] iArr, prh[] prhVarArr) {
        this.b = iArr;
        this.a = prhVarArr;
    }

    @Override // defpackage.prv
    public final bab a(int i, int i2) {
        char c = 0;
        while (true) {
            int[] iArr = this.b;
            if (c > 0) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new azd();
            } else if (i2 == iArr[0]) {
                return this.a[0];
            } else {
                c = 1;
            }
        }
    }

    public final void b(long j) {
        prh prhVar = this.a[0];
        if (prhVar.f != j) {
            prhVar.f = j;
            prhVar.d = true;
        }
    }
}
