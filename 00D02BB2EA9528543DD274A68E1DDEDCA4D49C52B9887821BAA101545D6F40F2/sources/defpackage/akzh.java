package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akzh  reason: default package */
/* loaded from: classes.dex */
public class akzh extends bnrr {
    public int a;
    @dzsi
    public final akyy b;
    public final akza c;
    @dzsi
    public akyz d;
    @dzsi
    public akya e;
    @dzsi
    public alaj f;
    private final akzc k;

    private akzh(akzh akzhVar) {
        super(akzhVar);
        this.b = akzhVar.b;
        this.k = new akzc();
        this.a = akzhVar.a;
        this.f = akzhVar.f;
        this.c = akzhVar.c;
    }

    @Override // defpackage.bnrr
    public final void a(int i, int i2) {
        Runnable runnable;
        akzb akzbVar;
        alad aladVar;
        super.a(i, i2);
        D();
        akya akyaVar = this.e;
        if (akyaVar != null) {
            c(akyaVar.a());
            ammx ammxVar = (ammx) akyaVar;
            this.f = ammxVar.e ? new alaj(ammxVar.c.a(), ammxVar.d) : null;
        }
        akzc akzcVar = this.k;
        akzb akzbVar2 = akzcVar.c;
        akzcVar.c = akzcVar.d;
        akzcVar.d = akzbVar2;
        akzb akzbVar3 = akzcVar.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        akzbVar3.a = p();
        akzbVar3.b = y();
        akzbVar3.c = z();
        akzbVar3.d = f();
        akzbVar3.e = this.a;
        akzbVar3.f = elapsedRealtime;
        akzb akzbVar4 = akzcVar.c;
        alad aladVar2 = akzbVar4.a;
        if (aladVar2 == null || (aladVar = (akzbVar = akzcVar.d).a) == null) {
            akzcVar.j = false;
        } else {
            akzcVar.j = akzbVar4.b == akzbVar.b && akzbVar4.c == akzbVar.c && aladVar2.l < 0.001f && aladVar.l < 0.001f && Math.abs(aladVar2.k - aladVar.k) < 0.001f && Math.abs(aladVar2.m - aladVar.m) < 0.001f && Math.abs(aladVar2.n.b - aladVar.n.b) < 1.0E-4f && Math.abs(aladVar2.n.c - aladVar.n.c) < 1.0E-4f;
            boolean o = akyx.o(this, akzcVar.c.a.j, akzcVar.a);
            float[] fArr = akzcVar.a;
            float f = fArr[0];
            float f2 = fArr[1];
            boolean o2 = akyx.o(this, akzcVar.d.a.j, fArr);
            float[] fArr2 = akzcVar.a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            akzcVar.e = f3 - f;
            akzcVar.f = f4 - f2;
            akzb akzbVar5 = akzcVar.d;
            float f5 = akzbVar5.a.k;
            akzb akzbVar6 = akzcVar.c;
            float f6 = f5 - akzbVar6.a.k;
            long j = akzbVar5.f - akzbVar6.f;
            if (!o || !o2 || akzbVar5.e == 0 || akzbVar6.e == 0 || j <= 0) {
                akzcVar.i = 0.0f;
                akzcVar.h = 0.0f;
                akzcVar.g = 0.0f;
            } else {
                float millis = (float) (TimeUnit.SECONDS.toMillis(1L) / j);
                float f7 = akzcVar.e;
                float f8 = akzcVar.f;
                akzcVar.g = akzc.c(f7 * millis, akzcVar.g);
                akzcVar.h = akzc.c(f8 * millis, akzcVar.h);
                akzcVar.i = akzc.c(f6 * millis, akzcVar.i);
            }
        }
        bnrs bnrsVar = this.g.get();
        this.g.set(u(bnrsVar.a, i, i2, bnrsVar.d, bnrsVar.e, bnrsVar.f, bnrsVar.g));
        if ((this.a & 4) == 0 || (runnable = this.h) == null) {
            return;
        }
        runnable.run();
    }

    public final akzh b() {
        return new akzh(this);
    }

    public final void c(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Runnable runnable = this.h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void d(float[] fArr) {
        D();
        akzc akzcVar = this.k;
        fArr[0] = akzcVar.g;
        fArr[1] = akzcVar.h;
        fArr[2] = akzcVar.i;
    }

    public final akzc e() {
        D();
        return this.k;
    }

    public akzh(alad aladVar, int i, int i2, float f) {
        this(aladVar, i, i2, f, null, new akza(null, 65.0f), null);
    }

    public akzh(alad aladVar, int i, int i2, float f, @dzsi Runnable runnable, akza akzaVar, @dzsi akyy akyyVar) {
        super(aladVar, i, i2, f, 0.1f, 20.0f, 30.0f, runnable);
        this.k = new akzc();
        this.c = akzaVar;
        this.b = akyyVar;
    }
}
