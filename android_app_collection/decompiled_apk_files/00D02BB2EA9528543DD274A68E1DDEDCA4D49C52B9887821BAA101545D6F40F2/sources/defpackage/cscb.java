package defpackage;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: cscb  reason: default package */
/* loaded from: classes5.dex */
public final class cscb implements TimeAnimator.TimeListener {
    public final TimeAnimator a;
    public final csci b;
    public final cscc c;
    public csca e;
    public cscd f;
    public long g;
    public long h;
    public csbz i;
    public int l;
    public boolean m;
    public final ArrayDeque<csbz> d = new ArrayDeque<>();
    private final float[] n = new float[4];
    public final SparseArray<csao> j = new SparseArray<>();
    public int k = 0;

    public cscb(csci csciVar, TimeAnimator timeAnimator, csca cscaVar, cscc csccVar) {
        this.i = csbz.b;
        this.b = csciVar;
        this.a = timeAnimator;
        this.e = cscaVar;
        this.c = csccVar;
        this.i = cscc.c(0);
        timeAnimator.setTimeListener(this);
    }

    public final void a() {
        this.a.pause();
    }

    public final void b() {
        if (this.a.isStarted()) {
            this.a.resume();
        } else {
            this.a.start();
        }
    }

    public final void c() {
        this.m = true;
        if (!this.a.isStarted()) {
            this.g = 0L;
            this.a.start();
        }
    }

    public final void d(csbz csbzVar) {
        csau csauVar;
        csca cscaVar;
        this.i.c(this.b);
        if (csbzVar != null && this.f != null) {
            int d = cscc.d(this.k);
            if (d != cscc.d(this.l)) {
                if (this.i == cscc.b(d)) {
                    this.f.a();
                } else if (this.i == cscc.a(d)) {
                    this.f.c();
                }
            } else {
                this.f.b();
                this.f.a();
            }
        }
        if (csbzVar == null) {
            this.a.end();
            csca cscaVar2 = this.e;
            if (cscaVar2 != null) {
                cscaVar2.d();
            }
        } else {
            this.i = csbzVar;
            int i = this.l;
            if (i != 0 && i != this.k) {
                csbz a = cscc.a(cscc.d(i));
                csbz c = cscc.c(this.l);
                csbz csbzVar2 = this.i;
                if (csbzVar2 == a || csbzVar2 == c) {
                    if (this.a.isStarted() && (cscaVar = this.e) != null) {
                        cscaVar.d();
                    }
                    this.k = this.l;
                    this.l = 0;
                    csca cscaVar3 = this.e;
                    if (cscaVar3 != null && (csauVar = ((csaw) cscaVar3).b) != null) {
                        csauVar.b();
                    }
                    csao csaoVar = this.j.get(this.k);
                    if (csaoVar != null) {
                        csaoVar.b();
                    }
                }
            }
            this.i.a(this.b);
            if (this.f != null) {
                int d2 = cscc.d(this.k);
                if (d2 != cscc.d(this.l)) {
                    if (this.i == cscc.b(d2)) {
                        this.f.b();
                    } else if (this.i == cscc.a(d2)) {
                        this.f.d();
                    }
                } else {
                    this.f.d();
                    this.f.c();
                }
            }
            this.h = this.g;
        }
        csca cscaVar4 = this.e;
        if (cscaVar4 != null) {
            cscaVar4.b();
        }
    }

    public final Deque<Integer> e(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.m) {
            this.m = false;
            d(this.d.pollFirst());
        }
        if (this.a.isStarted()) {
            this.g = j;
            csao csaoVar = this.j.get(this.k);
            if (csaoVar != null) {
                csaoVar.a(this.g, this.n);
                csci csciVar = this.b;
                float[] fArr = this.n;
                while (i < 4 && i < csciVar.a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? csciVar.j ? csciVar.f : csciVar.e : csciVar.d : csciVar.c : csciVar.b).k = fArr[i];
                    i++;
                }
            }
            boolean b = this.i.b(this.h, this.g, this.b);
            csca cscaVar = this.e;
            if (cscaVar != null) {
                cscaVar.b();
            }
            if (b) {
                return;
            }
            c();
        }
    }
}
