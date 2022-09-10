package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjyw  reason: default package */
/* loaded from: classes3.dex */
public abstract class bjyw implements bjwo {
    private final gga a;
    private final bjgo b;
    private final String c;
    private final cjtd d;
    public final Boolean e;
    List<jho> f;
    private final String g;
    private final jic h;
    private final bkaj i;
    private final cjtd j;
    private final Runnable k;
    private final Boolean l;
    private final String m;
    private final bjwm n;
    private jht o;
    @dzsi
    private final bjyk p;
    private boolean q = false;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bjyw(final defpackage.gga r18, defpackage.bjgo r19, final defpackage.afgy r20, final defpackage.dxio<defpackage.afha> r21, defpackage.btvo r22, final defpackage.bjgy r23, defpackage.bjyl r24, defpackage.bkaj r25, final defpackage.djam r26, defpackage.bwrs<defpackage.ilo> r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjyw.<init>(gga, bjgo, afgy, dxio, btvo, bjgy, bjyl, bkaj, djam, bwrs, boolean):void");
    }

    public void QW() {
        this.i.QW();
        bjyk bjykVar = this.p;
        if (bjykVar != null) {
            bjykVar.QW();
        }
    }

    @Override // defpackage.bjwo
    public String a() {
        return this.c;
    }

    @Override // defpackage.bjwo
    public String b() {
        return a();
    }

    @Override // defpackage.bjwo
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.bjwo
    public Boolean d() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.bjwo
    public cqkl e() {
        this.q = !this.q;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bjwo
    public Boolean f() {
        return Boolean.valueOf(!cpv.a.e(this.a));
    }

    @Override // defpackage.bjwo
    public View.OnTouchListener h() {
        bjgo bjgoVar = this.b;
        final ni niVar = new ni(bjgoVar.a, new bjgn(bjgoVar, this.d));
        return new View.OnTouchListener(niVar) { // from class: bjgm
            private final ni a;

            {
                this.a = niVar;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.a.a(motionEvent);
                return false;
            }
        };
    }

    @Override // defpackage.bjwo
    public Boolean i() {
        boolean z = false;
        if (!this.l.booleanValue() && this.m.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bjwo
    public bjwm j() {
        return this.n;
    }

    @Override // defpackage.bjwo
    public String k() {
        return this.g;
    }

    @Override // defpackage.bjwo
    public jic l() {
        return this.h;
    }

    @Override // defpackage.bjwo
    public Boolean m() {
        return this.e;
    }

    @Override // defpackage.bjwo
    public cqkl n() {
        this.k.run();
        return cqkl.a;
    }

    @Override // defpackage.bjwo
    public cjtd o() {
        return this.j;
    }

    @Override // defpackage.bjwo
    public Boolean p() {
        return this.l;
    }

    @Override // defpackage.bjwo
    public String q() {
        return this.m;
    }

    @Override // defpackage.bjwo
    public jbj s() {
        return this.i;
    }

    @Override // defpackage.bjwo
    @dzsi
    public bjwl t() {
        return this.p;
    }

    @Override // defpackage.bjwo
    public jht v() {
        if (this.o == null) {
            jhu h = jhv.h();
            ((jhi) h).e = x();
            h.e(w());
            this.o = h.b();
        }
        return this.o;
    }

    protected abstract List<jho> w();

    protected abstract String x();
}
