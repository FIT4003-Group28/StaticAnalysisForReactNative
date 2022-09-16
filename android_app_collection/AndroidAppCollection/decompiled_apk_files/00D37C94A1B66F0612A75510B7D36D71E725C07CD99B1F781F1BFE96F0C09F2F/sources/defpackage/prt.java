package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: prt  reason: default package */
/* loaded from: classes4.dex */
public final class prt implements azh {
    private static final azv c = new azv();
    public Format[] b;
    private final aze d;
    private final int e;
    private final Format f;
    private final SparseArray g = new SparseArray();
    private boolean h;
    private prv i;
    private long j;
    private azy k;

    public prt(aze azeVar, int i, Format format) {
        this.d = azeVar;
        this.e = i;
        this.f = format;
    }

    @Override // defpackage.azh
    public final void b() {
        Format[] formatArr = new Format[this.g.size()];
        for (int i = 0; i < this.g.size(); i++) {
            Format format = ((prs) this.g.valueAt(i)).a;
            ptx.b(format);
            formatArr[i] = format;
        }
        this.b = formatArr;
    }

    public final ayy d() {
        azy azyVar = this.k;
        if (azyVar instanceof ayy) {
            return (ayy) azyVar;
        }
        return null;
    }

    public final void e(prv prvVar, long j, long j2) {
        this.i = prvVar;
        this.j = j2;
        if (!this.h) {
            this.d.e(this);
            if (j != -9223372036854775807L) {
                this.d.g(0L, j);
            }
            this.h = true;
            return;
        }
        aze azeVar = this.d;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        azeVar.g(0L, j);
        for (int i = 0; i < this.g.size(); i++) {
            ((prs) this.g.valueAt(i)).g(prvVar, j2);
        }
    }

    public final void f() {
        this.d.f();
    }

    public final boolean g(azf azfVar) {
        int d = this.d.d(azfVar, c);
        ptx.e(d != 1);
        return d == 0;
    }

    @Override // defpackage.azh
    public final bab pT(int i, int i2) {
        prs prsVar = (prs) this.g.get(i);
        if (prsVar == null) {
            ptx.e(this.b == null);
            prsVar = new prs(i, i2, i2 == this.e ? this.f : null);
            prsVar.g(this.i, this.j);
            this.g.put(i, prsVar);
        }
        return prsVar;
    }

    @Override // defpackage.azh
    public final void ry(azy azyVar) {
        this.k = azyVar;
    }
}
