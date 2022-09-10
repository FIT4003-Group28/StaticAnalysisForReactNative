package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfn  reason: default package */
/* loaded from: classes4.dex */
public final class cfn {
    public final bsl a;
    public final List<cfl> b;
    final bsa c;
    public boolean d;
    public cfk e;
    public boolean f;
    public cfk g;
    public Bitmap h;
    public cfk i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final bxn n;
    private boolean o;
    private brw<Bitmap> p;

    public cfn(brc brcVar, bsl bslVar, int i, int i2, bue<Bitmap> bueVar, Bitmap bitmap) {
        bxn bxnVar = brcVar.a;
        bsa d = brc.d(brcVar.b());
        brw<Bitmap> e = brc.d(brcVar.b()).g().e(chw.a(bwe.a).F().q(true).r(i, i2));
        this.b = new ArrayList();
        this.c = d;
        Handler handler = new Handler(Looper.getMainLooper(), new cfm(this));
        this.n = bxnVar;
        this.m = handler;
        this.p = e;
        this.a = bslVar;
        a(bueVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bue<Bitmap> bueVar, Bitmap bitmap) {
        cjn.b(bueVar);
        cjn.b(bitmap);
        this.h = bitmap;
        this.p = this.p.e(new chw().B(bueVar));
        this.j = cjp.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return ((bsp) this.a).f.c;
    }

    public final void c() {
        this.d = false;
    }

    public final void d() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        cfk cfkVar = this.i;
        if (cfkVar != null) {
            this.i = null;
            f(cfkVar);
            return;
        }
        this.o = true;
        bsp bspVar = (bsp) this.a;
        bsn bsnVar = bspVar.f;
        int i2 = bsnVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = bspVar.e) >= 0) {
            i3 = i < i2 ? bsnVar.e.get(i).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.a.a();
        this.g = new cfk(this.m, ((bsp) this.a).e, uptimeMillis + i3);
        brw<Bitmap> e = this.p.e(chw.c(new ciy(Double.valueOf(Math.random()))));
        e.j(this.a);
        e.i(this.g);
    }

    public final void e() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.a(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(cfk cfkVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, cfkVar).sendToTarget();
        } else if (!this.d) {
            this.i = cfkVar;
        } else {
            if (cfkVar.b != null) {
                e();
                cfk cfkVar2 = this.e;
                this.e = cfkVar;
                int size = this.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.b.get(size).c();
                }
                if (cfkVar2 != null) {
                    this.m.obtainMessage(2, cfkVar2).sendToTarget();
                }
            }
            d();
        }
    }
}
