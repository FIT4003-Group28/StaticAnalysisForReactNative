package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: vvc  reason: default package */
/* loaded from: classes4.dex */
public final class vvc extends vvb implements vvs {
    public final vvq c;
    public final vuv d;
    private final AtomicBoolean e;
    private final List f;
    private final VideoMetaData g;
    private vvg h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        throw new java.lang.AssertionError("An existing thumbnail was already stored");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vvc(int[] r10, defpackage.vuu r11, defpackage.vvi r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvc.<init>(int[], vuu, vvi, java.lang.String, int):void");
    }

    private final vvg n() {
        if (!this.b) {
            while (this.d.hasNext()) {
                vvg b = this.c.b(((Integer) this.d.next()).intValue());
                b.getClass();
                if (b.f() == 1) {
                    return b;
                }
                if (b.f() == 2) {
                    for (vvr vvrVar : this.f) {
                        vvrVar.I(b);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.vvb
    public final int a() {
        vvg vvgVar = this.h;
        if (vvgVar != null) {
            return vvgVar.a;
        }
        return -1;
    }

    @Override // defpackage.vvb
    public final void b() {
        synchronized (this.e) {
            this.e.set(true);
        }
        for (vvr vvrVar : this.f) {
            vvrVar.q(this);
        }
    }

    @Override // defpackage.vvb
    public final void c(Exception exc) {
        synchronized (this.f) {
            for (vvr vvrVar : this.f) {
                vvrVar.G(exc);
            }
        }
    }

    @Override // defpackage.vvb
    public final int d() {
        vvg vvgVar = this.h;
        if (vvgVar != null && vvgVar.f() == 2) {
            this.h = n();
        }
        vvg vvgVar2 = this.h;
        if (vvgVar2 != null) {
            return vvgVar2.a;
        }
        return -1;
    }

    @Override // defpackage.vvb
    public final void e(int i, Bitmap bitmap) {
        vvg vvgVar = this.h;
        boolean z = false;
        if (vvgVar != null && vvgVar.a == i) {
            z = true;
        }
        viu.d(z);
        this.h.e(bitmap);
        for (vvr vvrVar : this.f) {
            vvrVar.I(this.h);
        }
    }

    @Override // defpackage.vvb
    public final boolean f(int i) {
        vvg vvgVar = this.h;
        if (vvgVar != null) {
            return vvgVar.a == i;
        }
        vqy.d("Thumbnails are being extracted even though all requests are already completed");
        return false;
    }

    @Override // defpackage.vvs
    public final vvg g(long j, boolean z) {
        synchronized (this.c) {
            vvg a = this.c.a(j, z);
            if (a != null) {
                return a.c();
            }
            return null;
        }
    }

    public final vvg h() {
        vvg c;
        synchronized (this.c) {
            Map.Entry firstEntry = this.c.a.firstEntry();
            c = (firstEntry != null ? (vvg) firstEntry.getValue() : null).c();
        }
        return c;
    }

    @Override // defpackage.vvs
    public final vvg i(long j) {
        vvg b;
        synchronized (this.c) {
            int g = this.g.g(j);
            if (g == -1 || (b = this.c.b(g)) == null) {
                return null;
            }
            return b.c();
        }
    }

    @Override // defpackage.vvs
    public final void j() {
        this.b = true;
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((vvg) it.next()).d();
            }
            this.c.d();
            this.h = null;
        }
        this.f.clear();
    }

    @Override // defpackage.vvs
    public final void k(vvr vvrVar) {
        boolean z;
        vvrVar.getClass();
        synchronized (this.e) {
            this.f.add(vvrVar);
            z = this.e.get();
        }
        if (z) {
            vvrVar.q(this);
        }
    }

    @Override // defpackage.vvs
    public final void l(vvr vvrVar) {
        this.f.remove(vvrVar);
    }

    @Override // defpackage.vvs
    public final boolean m() {
        if (this.e.get()) {
            return true;
        }
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                if (((vvg) it.next()).f() == 1) {
                    return false;
                }
            }
            synchronized (this.e) {
                this.e.set(true);
            }
            return true;
        }
    }

    public vvc(int[] iArr, vvi vviVar, String str, int i) {
        this(iArr, vuu.a, vviVar, str, i);
    }
}
