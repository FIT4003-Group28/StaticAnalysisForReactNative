package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bgst  reason: default package */
/* loaded from: classes3.dex */
public class bgst implements bgsh {
    private final Activity e;
    private final cqhn f;
    private final bgqw g;
    private final dehq h;
    private final Executor i;
    private final cqhu j;
    private ddho n = dtxn.ex;
    private dcdc<qjg> k = dcdc.e();
    public dhnl c = dhnl.b;
    public final List<bgsg> b = new ArrayList();
    public boolean d = false;
    private int l = -1;
    private int m = -1;

    public bgst(Activity activity, cqhn cqhnVar, bgqw bgqwVar, dehq dehqVar, Executor executor, cqhu cqhuVar) {
        this.e = activity;
        this.f = cqhnVar;
        this.g = bgqwVar;
        this.h = dehqVar;
        this.i = executor;
        this.j = cqhuVar;
    }

    @Override // defpackage.qje
    public List<qjg> a() {
        int i = this.l;
        if (i != -1 && i != this.m) {
            l(i);
        }
        return this.k;
    }

    @Override // defpackage.qje
    public Boolean b() {
        return qjd.a();
    }

    @Override // defpackage.bgsh
    public void c(dhnl dhnlVar) {
        this.c = dhnlVar;
    }

    @Override // defpackage.bgsh
    public void d(bgsg bgsgVar) {
        if (!this.b.contains(bgsgVar)) {
            this.b.add(bgsgVar);
        }
    }

    @Override // defpackage.bgsh
    public void e(boolean z) {
        this.d = true;
    }

    @Override // defpackage.bgsh
    public dhnk f(@dzsi String str) {
        if (this.c.equals(dhnl.b)) {
            return dhnk.c;
        }
        for (dhnk dhnkVar : this.c.a) {
            if (dhnkVar.a.equals(str)) {
                return dhnkVar;
            }
        }
        return dhnk.c;
    }

    @Override // defpackage.bgsh
    public void g(String str) {
        boolean z = false;
        for (int i = 0; i < this.k.size(); i++) {
            qjg qjgVar = this.k.get(i);
            qjgVar.OQ(qjgVar.a().equals(str));
            cqkx.p(qjgVar);
            if (qjgVar.b().booleanValue()) {
                l(i);
                this.l = i;
                z = true;
            }
        }
        if (!z) {
            this.l = -1;
        }
    }

    @Override // defpackage.bgsh
    public void h(ddho ddhoVar) {
        this.n = ddhoVar;
    }

    @Override // defpackage.bgsj
    public boolean i() {
        return true;
    }

    @Override // defpackage.bgsj
    public void j(bwrs<ilo> bwrsVar) {
        final ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        if (!this.c.equals(dhnl.b)) {
            m();
            return;
        }
        bgqw bgqwVar = this.g;
        String o = iloVar.ai().o();
        final deig d = deig.d();
        dhne bZ = dhnf.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhnf dhnfVar = (dhnf) bZ.b;
        o.getClass();
        dhnfVar.a |= 2;
        dhnfVar.b = o;
        dhnf bK = bZ.bK();
        bgqz bgqzVar = (bgqz) bgqwVar;
        if (!bgqzVar.a.i()) {
            d.k(new btzz(btzy.k));
        } else {
            final btzc b = bgqzVar.c.b(bK, new bgqy(d), bgqzVar.b);
            d.Pk(new Runnable(d, b) { // from class: bgqx
                private final deig a;
                private final btzc b;

                {
                    this.a = d;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    deig deigVar = this.a;
                    btzc btzcVar = this.b;
                    if (deigVar.isCancelled()) {
                        btzcVar.a();
                    }
                }
            }, bgqzVar.b);
        }
        d.Pk(new Runnable(this, d, iloVar) { // from class: bgsq
            private final bgst a;
            private final dehn b;
            private final ilo c;

            {
                this.a = this;
                this.b = d;
                this.c = iloVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bgst bgstVar = this.a;
                dehn dehnVar = this.b;
                ilo iloVar2 = this.c;
                try {
                    bgstVar.c = (dhnl) dehnVar.get();
                    bgstVar.m();
                } catch (InterruptedException | ExecutionException unused) {
                    iloVar2.ai().o();
                }
            }
        }, this.h);
    }

    @Override // defpackage.bgsj
    public void k() {
        this.k = dcdc.e();
        this.l = -1;
        this.m = -1;
    }

    protected final void l(int i) {
        View childAt;
        dcdc<View> e = cqhu.e(this.e.findViewById(16908290), a);
        if (e.size() == 2) {
            this.m = i;
        }
        int size = e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = e.get(i2);
            HorizontalScrollView horizontalScrollView = view instanceof HorizontalScrollView ? (HorizontalScrollView) view : null;
            if (horizontalScrollView != null && (horizontalScrollView.getChildAt(0) instanceof LinearLayout) && (childAt = ((LinearLayout) horizontalScrollView.getChildAt(0)).getChildAt(i)) != null) {
                Rect rect = new Rect();
                horizontalScrollView.getDrawingRect(rect);
                if (rect.left >= childAt.getX() || rect.right <= childAt.getX() + childAt.getWidth()) {
                    horizontalScrollView.scrollTo((int) childAt.getX(), (int) childAt.getY());
                }
            }
        }
    }

    public final void m() {
        dccx F = dcdc.F();
        int i = 0;
        while (i < this.c.a.size()) {
            F.g(new qjg(this.f, this.c.a.get(i).a, Boolean.valueOf(i == this.l), new cqkn(this) { // from class: bgsr
                private final bgst a;

                {
                    this.a = this;
                }

                @Override // defpackage.cqkn
                public final void a(cqkp cqkpVar, View view) {
                    bgst bgstVar = this.a;
                    qjc qjcVar = (qjc) cqkpVar;
                    for (bgsg bgsgVar : bgstVar.b) {
                        bgsgVar.a(qjcVar, bgstVar.d ? bgstVar.c : dhnl.b);
                    }
                }
            }, null, this.n));
            i++;
        }
        this.k = F.f();
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            cqkx.p(this);
        } else {
            this.i.execute(new Runnable(this) { // from class: bgss
                private final bgst a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a);
                }
            });
        }
    }
}
