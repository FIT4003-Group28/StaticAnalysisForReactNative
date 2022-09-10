package defpackage;

import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: abal  reason: default package */
/* loaded from: classes.dex */
public final class abal extends itb {
    public final dxio<abam> a;
    public final dxio<akgd> b;
    private final dxio<bvkx> c;
    private final aklz d;
    private final abaj e = new abaj(this);

    public abal(aklz aklzVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3) {
        this.d = aklzVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        aklz aklzVar = this.d;
        aklzVar.b.a().f(aklzVar.a);
        this.b.a().g(this.e);
        e();
        this.a.a().b();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.a.a().e();
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        aklz aklzVar = this.d;
        aklzVar.b.a().i(aklzVar.a);
        this.b.a().h(this.e);
        this.a.a().c();
        super.Po();
    }

    public final void e() {
        if (w()) {
            this.c.a().j(new Runnable(this) { // from class: abak
                private final abal a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    abal abalVar = this.a;
                    abam a = abalVar.a.a();
                    List<MajorEvent> a2 = abalVar.b.a().a();
                    dccx F = dcdc.F();
                    for (MajorEvent majorEvent : a2) {
                        ditt b = majorEvent.b();
                        if (b != null) {
                            F.g(b);
                        }
                    }
                    a.a(F.f());
                }
            }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.a.a().b();
        } else {
            this.a.a().c();
        }
    }

    public final boolean i() {
        return this.a.a().d();
    }
}
