package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhhh  reason: default package */
/* loaded from: classes3.dex */
public class bhhh implements iib {
    private final iib a;

    public bhhh(dcdc<String> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bhhj(), new bhhl(dcdcVar.get(i))));
        }
        iic j = iid.j();
        j.e(F.f());
        this.a = j.f();
    }

    @Override // defpackage.iib
    public List<cqix<? extends igw>> a() {
        return this.a.a();
    }

    @Override // defpackage.iib
    @dzsi
    public cqix<?> b() {
        return this.a.b();
    }

    @Override // defpackage.iib
    @dzsi
    public iif c() {
        return this.a.c();
    }

    @Override // defpackage.iib
    @dzsi
    public igq d() {
        return this.a.d();
    }

    @Override // defpackage.iib
    @dzsi
    public ihz e() {
        return this.a.e();
    }

    @Override // defpackage.iib
    @dzsi
    public cqqw f() {
        return this.a.f();
    }

    @Override // defpackage.iib
    @dzsi
    public View.OnAttachStateChangeListener g() {
        return this.a.g();
    }

    @Override // defpackage.iib
    @dzsi
    public cjtd h() {
        return this.a.h();
    }

    @Override // defpackage.iib
    @dzsi
    public zc i() {
        return this.a.i();
    }
}
