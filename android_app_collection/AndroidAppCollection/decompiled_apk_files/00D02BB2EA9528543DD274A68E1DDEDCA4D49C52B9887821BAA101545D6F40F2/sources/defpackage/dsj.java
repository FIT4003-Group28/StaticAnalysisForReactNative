package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: dsj  reason: default package */
/* loaded from: classes6.dex */
public final class dsj {
    private static final cjtd i = cjtd.a(dtxj.bK);
    public final akox a;
    public final dgb b;
    public final btrm c;
    public final arbu d;
    private final cqat j;
    private final dbsg<cjqp> k;
    private final ViewGroup l;
    private long o;
    private int m = 0;
    private int n = 0;
    public final Object e = new Object();
    @dzsi
    public akqq f = null;
    @dzsi
    public akzy g = null;
    public boolean h = false;
    private int p = 1;

    public dsj(cqat cqatVar, akox akoxVar, dgc dgcVar, btrm btrmVar, araj arajVar, ViewGroup viewGroup, ViewGroup viewGroup2, dbsg<cjqp> dbsgVar, dmv dmvVar) {
        this.j = cqatVar;
        this.a = akoxVar;
        this.l = viewGroup2;
        this.k = dbsgVar;
        this.c = btrmVar;
        this.d = arajVar.m();
        dfw f = dfy.f();
        f.e(dfx.a(dmvVar));
        f.d(true);
        f.c(false);
        f.b(false);
        this.b = dgcVar.b(viewGroup, viewGroup2, f.a());
    }

    public final void a(int i2, int i3) {
        this.m = i2;
        this.n = i3;
    }

    public final void b(String str, boolean z) {
        this.b.d(str);
        this.b.e(z);
    }

    public final void c() {
        akqq akqqVar;
        synchronized (this.e) {
            akqqVar = this.f;
        }
        alrh ak = this.a.ak();
        if (this.h || ak == null || akqqVar == null) {
            this.b.b(false);
            return;
        }
        Point b = ak.b(akqqVar);
        float f = 0.0f;
        if (b == null) {
            akzh l = this.a.l();
            alaa b2 = alad.b(l.p());
            b2.d = 0.0f;
            l.o(b2.a());
            b = new alrh(l).b(akqqVar);
            if (b == null) {
                this.b.b(false);
                return;
            }
        }
        int i2 = 2;
        int[] iArr = new int[2];
        this.l.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        boolean contains = new Rect(i3, iArr[1] + this.m, this.l.getWidth() + i3, (iArr[1] + this.l.getHeight()) - this.n).contains(b.x, b.y);
        int i4 = 3;
        if (true != contains) {
            i2 = 3;
        }
        this.b.b(true);
        dgb dgbVar = this.b;
        long g = this.j.g();
        long j = this.o;
        if (((float) j) > 0.0f) {
            f = ((float) (g - j)) / 1000.0f;
        }
        this.o = g;
        dgbVar.f(f, i2, b.x, b.y);
        if (i2 == 3) {
            int i5 = this.p;
        } else {
            i4 = i2;
        }
        this.p = i4;
    }
}
