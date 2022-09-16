package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acyy  reason: default package */
/* loaded from: classes.dex */
public final class acyy {
    public final Activity a;
    public final dxio<akfa> b;
    public final aczd c;
    public final dbty<Boolean> d;
    public final dbty<Boolean> e;
    @dzsi
    public amvh f;
    @dzsi
    public cqkf<jbn> g;
    private final cqkj h;

    static {
        TimeUnit.MINUTES.toMillis(1L);
    }

    public acyy(Activity activity, final acyr acyrVar, dxio<akfa> dxioVar, cqkj cqkjVar, aczd aczdVar) {
        this.a = activity;
        this.b = dxioVar;
        this.h = cqkjVar;
        this.c = aczdVar;
        acyrVar.getClass();
        this.d = dbud.a(new dbty(acyrVar) { // from class: acyw
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.d());
            }
        });
        acyrVar.getClass();
        this.e = dbud.a(new dbty(acyrVar) { // from class: acyx
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.e());
            }
        });
    }

    public final dcep<awvv<?>> a(dktk dktkVar) {
        dcen N = dcep.N();
        if (this.d.a().booleanValue()) {
            N.i(this.c.e());
        }
        if (this.e.a().booleanValue() && dktkVar == dktk.EXPLORE) {
            N.b(awvv.j);
        }
        return N.f();
    }

    public final boolean b() {
        if (this.d.a().booleanValue()) {
            cqkf<jbn> e = this.h.e(new gtc());
            this.g = e;
            this.c.f(e.c());
            cqkf<jbn> cqkfVar = this.g;
            dbsk.s(cqkfVar);
            cqkfVar.e(this.c);
            return true;
        }
        return false;
    }
}
