package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: abvm  reason: default package */
/* loaded from: classes2.dex */
class abvm implements abpm {
    final /* synthetic */ abvn a;

    public abvm(abvn abvnVar) {
        this.a = abvnVar;
    }

    private final List<abom> m() {
        return dcdc.r(this.a.d);
    }

    @Override // defpackage.iib
    @dzsi
    public cqix<?> b() {
        return null;
    }

    @Override // defpackage.iib
    @dzsi
    public iif c() {
        return null;
    }

    @Override // defpackage.iib
    @dzsi
    public igq d() {
        return null;
    }

    @Override // defpackage.iib
    @dzsi
    public ihz e() {
        return null;
    }

    @Override // defpackage.iib
    @dzsi
    public cqqw f() {
        return null;
    }

    @Override // defpackage.iib
    @dzsi
    public View.OnAttachStateChangeListener g() {
        return null;
    }

    @Override // defpackage.iib
    public cjtd h() {
        return cjtd.a(this.a.c == absg.AREA_EXPLORE ? dtxj.cM : dtxo.cH);
    }

    @Override // defpackage.iib
    @dzsi
    public zc i() {
        return null;
    }

    @Override // defpackage.abpm
    public Boolean j() {
        boolean z = false;
        if (!m().isEmpty() && !m().get(0).m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.abpm
    public Boolean k() {
        boolean z = false;
        if (!m().isEmpty() && m().get(0).m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.iib
    /* renamed from: l */
    public dcdc<cqix<? extends igw>> a() {
        dccx F = dcdc.F();
        for (abom abomVar : m()) {
            F.g(cqgr.fT(abomVar.m().booleanValue() ? new abrx() : new abrl(), abomVar));
        }
        return F.f();
    }
}
