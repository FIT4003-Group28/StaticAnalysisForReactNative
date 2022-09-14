package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: astr  reason: default package */
/* loaded from: classes2.dex */
public class astr implements asun {
    private final Context a;
    public int b;
    private final btrm c;
    @dzsi
    private final dzsj<ckrp> d;
    private final csao e;
    private final boolean f;
    private final boolean g;
    private boolean h;

    public astr(Context context, cqhn cqhnVar, btrm btrmVar, @dzsi dzsj<ckrp> dzsjVar, boolean z) {
        this(context, cqhnVar, btrmVar, dzsjVar, z, false);
    }

    public astr(Context context, cqhn cqhnVar, btrm btrmVar, @dzsi dzsj<ckrp> dzsjVar, boolean z, boolean z2) {
        this.a = context;
        this.c = btrmVar;
        this.d = dzsjVar;
        this.b = 1;
        this.f = z;
        this.g = z2;
        this.e = new astq();
    }

    public void a() {
        btrm btrmVar = this.c;
        dceq a = dcet.a();
        a.b(creu.class, new asts(creu.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    public void b() {
        this.c.a(this);
    }

    @Override // defpackage.asun
    public Boolean c() {
        int i = this.b;
        boolean z = true;
        if (i == 1 || i == 8 || i == 6) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asun
    public cqkl d() {
        dbsk.s(this.d);
        this.d.a().b();
        return cqkl.a;
    }

    @Override // defpackage.asun
    public Integer e() {
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 4;
            }
            if (i2 == 4) {
                return 3;
            }
            return Integer.valueOf(i2 != 6 ? 7 : 5);
        }
        throw null;
    }

    @Override // defpackage.asun
    public csao g() {
        return this.e;
    }

    @Override // defpackage.asun
    public csao h() {
        return this.e;
    }

    public void i(creu creuVar) {
        int i = this.b;
        int i2 = creuVar.a;
        this.b = i2;
        if (i2 != i) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.asun
    public Boolean j() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.asun
    public cqkl k() {
        if (this.h) {
            this.h = false;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.asun
    public cqkl l() {
        if (!this.h) {
            this.h = true;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.asun
    public Boolean m() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.asun
    public Boolean n() {
        boolean z = false;
        if (this.g && this.a.getResources().getConfiguration().smallestScreenWidthDp <= 360) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
