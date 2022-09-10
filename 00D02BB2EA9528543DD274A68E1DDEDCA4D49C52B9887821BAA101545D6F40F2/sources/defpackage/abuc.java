package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: abuc  reason: default package */
/* loaded from: classes.dex */
public class abuc implements abkn {
    private final ddho a;
    private final View.OnAttachStateChangeListener b;
    private final abvz c;
    private cjtd d;
    private final abse e;
    @dzsi
    private final acwt f;
    private dcep<String> h = k(null);
    private dcdc<cqix<? extends igw>> g = dcdc.e();

    public abuc(huc hucVar, abvz abvzVar, bvpe bvpeVar, @dzsi djrs djrsVar, ddho ddhoVar, ddho ddhoVar2, @dzsi acwt acwtVar, abse abseVar) {
        this.f = acwtVar;
        this.a = ddhoVar2;
        this.d = cjtd.a(ddhoVar);
        this.e = abseVar;
        this.c = abvzVar;
        this.b = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: abua
            private final abuc a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.h();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
    }

    @Override // defpackage.iib
    public List<cqix<? extends igw>> a() {
        return this.g;
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
        return this.b;
    }

    @Override // defpackage.iib
    public cjtd h() {
        return this.d;
    }

    @Override // defpackage.iib
    @dzsi
    public zc i() {
        return null;
    }

    @Override // defpackage.abkn
    public void j(@dzsi djrs djrsVar, @dzsi String str) {
        cjta c = cjtd.c(this.d);
        c.g(str);
        this.d = c.a();
        if (djrsVar != null) {
            dcep<String> k = k(djrsVar);
            if (!this.g.isEmpty() && this.h.equals(k)) {
                return;
            }
            dccx F = dcdc.F();
            for (djrm djrmVar : djrsVar.a) {
                abpw abpwVar = new abpw();
                abvz abvzVar = this.c;
                ddho ddhoVar = this.a;
                acwt acwtVar = this.f;
                abse abseVar = this.e;
                btvo a = abvzVar.a.a();
                abvz.a(a, 1);
                akpm a2 = abvzVar.b.a();
                abvz.a(a2, 2);
                bsmd a3 = abvzVar.c.a();
                abvz.a(a3, 3);
                gga a4 = abvzVar.d.a();
                abvz.a(a4, 4);
                efg a5 = abvzVar.e.a();
                abvz.a(a5, 5);
                abvz.a(djrmVar, 6);
                abvz.a(ddhoVar, 7);
                abvz.a(abseVar, 9);
                F.g(cqgr.fT(abpwVar, new abvy(a, a2, a3, a4, a5, djrmVar, ddhoVar, acwtVar, abseVar)));
            }
            this.g = F.f();
            this.h = k;
            return;
        }
        this.g = dcdc.e();
    }

    private static dcep<String> k(@dzsi djrs djrsVar) {
        if (djrsVar == null) {
            return dcmr.a;
        }
        return dcbg.b(djrsVar.a).s(abub.a).B();
    }
}
