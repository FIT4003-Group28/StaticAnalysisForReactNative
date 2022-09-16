package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vvt  reason: default package */
/* loaded from: classes4.dex */
public final class vvt implements vvs, vvr {
    private final vvl a;
    private final List b = new CopyOnWriteArrayList();
    private final List c = new ArrayList();

    public vvt(vvl vvlVar) {
        vvlVar.getClass();
        this.a = vvlVar;
    }

    private final long c(long j) {
        VideoMetaData videoMetaData = ((vvm) this.a).a;
        int c = videoMetaData.c(j);
        return c != -1 ? videoMetaData.l(c) : videoMetaData.g;
    }

    private final long d(long j) {
        VideoMetaData videoMetaData = ((vvm) this.a).a;
        int e = videoMetaData.e(j);
        if (e != -1) {
            return videoMetaData.l(e);
        }
        return 0L;
    }

    private final void e(long j, long j2, long j3, Map map) {
        long j4 = j;
        while (j4 < j2) {
            long c = c(1 + j4);
            vvc vvcVar = (vvc) map.remove(Long.valueOf(j4));
            if (vvcVar == null) {
                String format = String.format("Subsequence: %d - %d", Long.valueOf(j4 / 1000), Long.valueOf(c / 1000));
                vvl vvlVar = this.a;
                long j5 = (-1) + c;
                aqxo.p(j4 <= j5);
                vvm vvmVar = (vvm) vvlVar;
                int g = vvmVar.a.g(j4);
                if (g != -1) {
                    int g2 = vvmVar.a.g(j5);
                    if (g2 != -1) {
                        int g3 = vvmVar.a.g(j3);
                        if (g3 == -1 || g3 <= 0) {
                            g3 = 1;
                        }
                        int i = ((g2 - g) / g3) + 1;
                        int[] iArr = new int[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr[i2] = (i2 * g3) + g;
                        }
                        vvc vvcVar2 = new vvc(iArr, vvmVar.c(), format, 10);
                        vvmVar.d(vvcVar2);
                        vvcVar2.k(this);
                        vvcVar = vvcVar2;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.c.add(vvcVar);
            j4 = c;
        }
    }

    private final void f(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        for (vvc vvcVar : this.c) {
            hashMap.put(Long.valueOf(vvcVar.h().a()), vvcVar);
        }
        this.c.clear();
        long d = d(j);
        long c = c(j2);
        e(d, c, j3, hashMap);
        long j4 = j - 1000000;
        if (j4 < d) {
            e(d(j4), d, j3, hashMap);
        }
        long j5 = 1000000 + j2;
        if (j5 > c) {
            e(c, c(j5), j3, hashMap);
        }
        for (vvc vvcVar2 : hashMap.values()) {
            vvcVar2.j();
        }
    }

    @Override // defpackage.vvr
    public final void G(Exception exc) {
        for (vvr vvrVar : this.b) {
            vvrVar.G(exc);
        }
    }

    @Override // defpackage.vvr
    public final void I(vvg vvgVar) {
        for (vvr vvrVar : this.b) {
            vvrVar.I(vvgVar);
        }
    }

    public final void a(long j, long j2) {
        f(j, j2, 0L);
    }

    public final void b(long j, long j2) {
        f(j, j2, 1000000L);
    }

    @Override // defpackage.vvs
    public final vvg g(long j, boolean z) {
        vvg vvgVar = null;
        for (vvc vvcVar : this.c) {
            vvg g = vvcVar.g(j, z);
            if (g != null) {
                if (vvgVar != null) {
                    if (Math.abs(g.a() - j) < Math.abs(vvgVar.a() - j)) {
                        vvgVar.d();
                    }
                }
                vvgVar = g;
            }
        }
        return vvgVar;
    }

    @Override // defpackage.vvs
    public final vvg i(long j) {
        vvg c;
        Iterator it = this.c.iterator();
        while (true) {
            vvg vvgVar = null;
            if (it.hasNext()) {
                vvc vvcVar = (vvc) it.next();
                if (vvcVar.h().a() <= j) {
                    synchronized (vvcVar.c) {
                        Map.Entry lastEntry = vvcVar.c.a.lastEntry();
                        if (lastEntry != null) {
                            vvgVar = (vvg) lastEntry.getValue();
                        }
                        c = vvgVar.c();
                    }
                    if (c.a() >= j) {
                        return vvcVar.i(j);
                    }
                }
            } else {
                return null;
            }
        }
    }

    @Override // defpackage.vvs
    public final void j() {
        for (vvc vvcVar : this.c) {
            vvcVar.j();
        }
        this.b.clear();
    }

    @Override // defpackage.vvs
    public final void k(vvr vvrVar) {
        this.b.add(vvrVar);
        if (m()) {
            vvrVar.q(this);
        }
    }

    @Override // defpackage.vvs
    public final void l(vvr vvrVar) {
        this.b.remove(vvrVar);
    }

    @Override // defpackage.vvs
    public final boolean m() {
        for (vvc vvcVar : this.c) {
            if (!vvcVar.m()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vvr
    public final void q(vvs vvsVar) {
        if (m()) {
            for (vvr vvrVar : this.b) {
                vvrVar.q(this);
            }
        }
    }
}
