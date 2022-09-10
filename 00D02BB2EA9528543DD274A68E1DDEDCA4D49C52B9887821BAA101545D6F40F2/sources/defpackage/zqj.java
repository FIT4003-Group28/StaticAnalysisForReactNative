package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zqj  reason: default package */
/* loaded from: classes7.dex */
public class zqj implements zfm {
    @dzsi
    public final zfw a;
    final bzgj b;
    private final zqo c;
    @dzsi
    private final zqa d;
    @dzsi
    private final xzp e;
    @dzsi
    private final uma f;
    @dzsi
    private final zkt g;
    @dzsi
    private final xkl h;
    private final zfl i;
    private final int j;
    private final qbv k;
    private final bzgf l;

    public zqj(zqo zqoVar, @dzsi zqa zqaVar, @dzsi xzp xzpVar, @dzsi uma umaVar, @dzsi zfw zfwVar, int i, zfl zflVar, zkt zktVar, Executor executor, @dzsi xkl xklVar, qbv qbvVar) {
        bzgj bzgjVar = new bzgj();
        this.b = bzgjVar;
        bzgf bzgfVar = new bzgf(this) { // from class: zqh
            private final zqj a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                zqj zqjVar = this.a;
                zqjVar.s();
                cqkx.p(zqjVar);
            }
        };
        this.l = bzgfVar;
        this.c = zqoVar;
        this.d = zqaVar;
        this.e = xzpVar;
        this.f = umaVar;
        this.a = zfwVar;
        this.j = i;
        this.i = zflVar;
        this.g = zktVar;
        this.h = xklVar;
        if (xklVar != null) {
            bzgg.b(bzgfVar, xklVar, bzgjVar, executor);
            s();
        }
        this.k = qbvVar;
    }

    @Override // defpackage.zfm
    public zfp a() {
        return this.c;
    }

    @Override // defpackage.zfm
    @dzsi
    public xzp b() {
        return this.e;
    }

    @Override // defpackage.zfm
    @dzsi
    public uma d() {
        return this.f;
    }

    @Override // defpackage.zfm
    @dzsi
    public zfg e() {
        zqa zqaVar = this.d;
        if (zqaVar != null) {
            return zqaVar.c();
        }
        return null;
    }

    @Override // defpackage.zfm
    @dzsi
    public zcl f() {
        return this.g;
    }

    @Override // defpackage.zfm
    @dzsi
    public zbe g() {
        return this.a;
    }

    @Override // defpackage.zfm
    public cqkl h() {
        zfl zflVar = this.i;
        if (zflVar != null) {
            ((pvk) zflVar).u();
        }
        return cqkl.a;
    }

    @Override // defpackage.zfm
    public cjtd i(@dzsi ddho ddhoVar) {
        return this.c.Z(ddhoVar);
    }

    @Override // defpackage.zfm
    public Boolean j() {
        zfn M = this.c.M();
        boolean z = true;
        if (M != zfn.INFO_SHEET_HEADER_EXPANDED && M != zfn.INFO_SHEET_HEADER_FULLY_EXPANDED) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zfm
    public Boolean k() {
        xkl xklVar = this.h;
        boolean z = false;
        if (xklVar != null && xklVar.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zfm
    public Boolean l() {
        return Boolean.valueOf(this.k.a());
    }

    @Override // defpackage.zfm
    @dzsi
    /* renamed from: m */
    public zqa c() {
        return this.d;
    }

    public void n(zfn zfnVar, boolean z) {
        if (this.c.M() != zfnVar) {
            this.c.OU(zfnVar);
            zqa zqaVar = this.d;
            if (zqaVar != null) {
                zqaVar.t();
                this.d.q();
                if (j().booleanValue()) {
                    this.d.r();
                }
            }
            zkt zktVar = this.g;
            if (zktVar != null) {
                zktVar.e(zfnVar);
            }
            cqkx.p(this);
            cqkx.p(this.c);
            zqa zqaVar2 = this.d;
            if (zqaVar2 != null) {
                cqkx.p(zqaVar2);
            }
            zkt zktVar2 = this.g;
            if (zktVar2 == null) {
                return;
            }
            cqkx.p(zktVar2);
        }
    }

    public void o(int i, boolean z) {
        zqa zqaVar = this.d;
        if (zqaVar != null) {
            zqaVar.s(i, true);
        }
    }

    public void p(Context context) {
        xzp xzpVar = this.e;
        if (xzpVar != null) {
            xzpVar.d(context);
        }
        this.c.m(context);
    }

    public boolean q() {
        xzp xzpVar = this.e;
        return (xzpVar != null && xzpVar.e().booleanValue()) || this.c.l();
    }

    public int r() {
        return this.j;
    }

    public final void s() {
        xkl xklVar;
        zkt zktVar = this.g;
        if (zktVar == null || (xklVar = this.h) == null) {
            return;
        }
        zktVar.f(xklVar.a());
    }
}
