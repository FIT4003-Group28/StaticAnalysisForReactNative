package defpackage;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bgpl  reason: default package */
/* loaded from: classes3.dex */
public class bgpl implements bgny {
    public final bhhf a;
    @dzsi
    private ilo b = null;
    private Set<dboe> c = EnumSet.noneOf(dboe.class);
    private boolean d = true;
    private final apup e;

    public bgpl(apup apupVar, bhhf bhhfVar) {
        this.e = apupVar;
        this.a = bhhfVar;
    }

    @Override // defpackage.bgny
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bgny
    public Boolean b() {
        return Boolean.valueOf(this.c.contains(dboe.EVENT));
    }

    @Override // defpackage.bgny
    public Boolean c() {
        return Boolean.valueOf(this.c.contains(dboe.OFFER));
    }

    @Override // defpackage.bgny
    public Boolean d() {
        return Boolean.valueOf(this.c.contains(dboe.PRODUCT));
    }

    @Override // defpackage.bgny
    public Boolean e() {
        return Boolean.valueOf(this.c.contains(dboe.STANDARD));
    }

    @Override // defpackage.bgny
    public cqkl f() {
        this.e.e(bwrs.a(this.b), dboe.EVENT);
        return cqkl.a;
    }

    @Override // defpackage.bgny
    public cqkl g() {
        this.e.e(bwrs.a(this.b), dboe.OFFER);
        return cqkl.a;
    }

    @Override // defpackage.bgny
    public cqkl h() {
        this.e.e(bwrs.a(this.b), dboe.PRODUCT);
        return cqkl.a;
    }

    @Override // defpackage.bgny
    public cqkl i() {
        this.e.e(bwrs.a(this.b), dboe.STANDARD);
        return cqkl.a;
    }

    @Override // defpackage.bgny
    public cjtd j(ddho ddhoVar) {
        ilo iloVar = this.b;
        dbsk.s(iloVar);
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        return c.a();
    }

    public bgpl k(final ilo iloVar) {
        this.b = iloVar;
        HashSet d = dcnm.d(dboe.values());
        this.c = d;
        dcft.y(d, new dbsl(this, iloVar) { // from class: bgpk
            private final bgpl a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.a.j(bwrs.a(this.b), (dboe) obj);
            }
        });
        boolean z = false;
        if (iloVar != null) {
            dipo dipoVar = iloVar.h().bb;
            if (dipoVar == null) {
                dipoVar = dipo.e;
            }
            if (dipoVar.c.size() == 0) {
                z = true;
            }
        }
        this.d = z;
        return this;
    }

    public void l(boolean z) {
        this.d = z;
    }
}
