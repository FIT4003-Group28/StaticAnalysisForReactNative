package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aevs  reason: default package */
/* loaded from: classes.dex */
public final class aevs extends puw implements pkb {
    private final afev d;
    private final afer e;
    private final afbl f;
    private final aenf g;
    private final aevr[] h;
    private final boolean i;
    private List j;
    private long k;
    private boolean l;
    private final long m;

    public aevs(afev afevVar, TrackGroup trackGroup, afbl afblVar, aenf aenfVar, afjz afjzVar, long j, int... iArr) {
        super(trackGroup, iArr);
        this.j = amuk.q();
        this.k = -9223372036854775807L;
        this.d = afevVar;
        this.e = new afer();
        this.f = afblVar;
        this.g = aenfVar;
        this.m = j;
        int[] iArr2 = this.c;
        boolean F = afjzVar.F();
        aevr[] aevrVarArr = new aevr[iArr2.length];
        for (int i = 0; i < iArr2.length; i++) {
            if (trackGroup.a(iArr2[i]) != null) {
                aevrVarArr[i] = new aevr(trackGroup.a(iArr2[i]));
            }
        }
        if (F) {
            Arrays.sort(aevrVarArr, new wd(20));
        }
        this.h = aevrVarArr;
        this.i = afjzVar.Q();
    }

    private static long e(psb psbVar) {
        if (psbVar instanceof aeyj) {
            return ((aeyj) psbVar).g();
        }
        return psbVar.l;
    }

    private static long t(psb psbVar) {
        if (psbVar instanceof aeyj) {
            return ((aeyj) psbVar).j();
        }
        return psbVar.k;
    }

    private static Format u(afes afesVar) {
        if (afesVar instanceof aevr) {
            aevr aevrVar = (aevr) afesVar;
            return aevrVar.b != null ? aevrVar.b : aevrVar.a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r6 != ((defpackage.afet) r4.get(r4.size() - 1)).c) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0 A[EDGE_INSN: B:70:0x00d0->B:36:0x00d0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(long r16, long r18, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevs.v(long, long, java.util.List):void");
    }

    @Override // defpackage.puw, defpackage.pvf
    public final int a(long j, List list) {
        long j2 = 0;
        if (!list.isEmpty()) {
            j2 = Math.max(0L, e((psb) list.get(list.size() - 1)) - Math.max(j, t((psb) list.get(0))));
        }
        v(j, j2, list);
        return this.e.a;
    }

    @Override // defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 10004) {
            this.d.c();
        } else if (obj == null) {
        } else {
            if (i == 10001) {
                this.d.g((afmv) obj);
            } else if (i == 10002) {
                this.d.f((aegx) obj);
            } else if (i != 10003) {
            } else {
                this.d.d(((Float) obj).floatValue());
            }
        }
    }

    @Override // defpackage.pvf
    public final int b() {
        Format u = u(this.e.c);
        if (u != null) {
            return l(u);
        }
        return 0;
    }

    @Override // defpackage.pvf
    public final int c() {
        return this.e.b;
    }

    @Override // defpackage.pvf
    public final Object d() {
        afbl afblVar = this.f;
        aepk aepkVar = this.e.d;
        if (aepkVar == null) {
            aepkVar = aepk.a;
        }
        return afblVar.a(aepkVar);
    }

    @Override // defpackage.pvf
    public final void i(long j, long j2, long j3, List list, psd[] psdVarArr) {
        v(j, j2, list);
    }
}
