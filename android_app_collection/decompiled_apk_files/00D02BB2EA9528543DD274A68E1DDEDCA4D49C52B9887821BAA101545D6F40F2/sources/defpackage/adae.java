package defpackage;

import defpackage.aczr;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adae  reason: default package */
/* loaded from: classes.dex */
public abstract class adae<T extends aczr> implements adab<T> {
    public static final /* synthetic */ int a = 0;
    private static final dktp b;
    private static final dktp c;
    private static final dcqe d;
    private final dbty<dktp> e;

    static {
        dktm bZ = dktp.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dktp dktpVar = (dktp) bZ.b;
        dktpVar.b = 3;
        dktpVar.a |= 1;
        b = bZ.bK();
        dktm bZ2 = dktp.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dktp dktpVar2 = (dktp) bZ2.b;
        dktpVar2.b = 1;
        dktpVar2.a |= 1;
        c = bZ2.bK();
        d = dcqe.c("adae");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public adae(dbty<dktp> dbtyVar) {
        this.e = dbtyVar;
    }

    static dbty<dktp> n(final dbty<dktp> dbtyVar, final dktp dktpVar) {
        int a2 = dkto.a(dktpVar.b);
        if (a2 == 0 || a2 == 1) {
            bvoo.h("Default CardProviderSettings has unknown state", new Object[0]);
        }
        return dbud.a(new dbty(dbtyVar, dktpVar) { // from class: adad
            private final dbty a;
            private final dktp b;

            {
                this.a = dbtyVar;
                this.b = dktpVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dbty dbtyVar2 = this.a;
                dktp dktpVar2 = this.b;
                int i = adae.a;
                dktp dktpVar3 = (dktp) dbtyVar2.a();
                int a3 = dkto.a(dktpVar3.b);
                return (a3 == 0 || a3 == 1) ? dktpVar2 : dktpVar3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static dbty<dktp> o(dbty<dktp> dbtyVar) {
        return n(dbtyVar, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static dbty<dktp> p(dbty<dktp> dbtyVar) {
        return n(dbtyVar, c);
    }

    private final boolean q() {
        int a2;
        int a3 = dkto.a(this.e.a().b);
        if (a3 == 0 || a3 == 1) {
            bvoo.h("Provider %s has unknown state", this);
            return false;
        }
        int a4 = dkto.a(this.e.a().b);
        return (a4 != 0 && a4 == 4) || ((a2 = dkto.a(this.e.a().b)) != 0 && a2 == 3);
    }

    @Override // defpackage.aczy
    public final List<cqix<T>> a(List<cqix<?>> list) {
        if (q()) {
            return k(list);
        }
        return dcdc.e();
    }

    @Override // defpackage.aczy
    public boolean b() {
        return this.e.a().c;
    }

    @Override // defpackage.aczy
    public boolean c() {
        return this.e.a().d;
    }

    @Override // defpackage.aczy
    public final boolean d() {
        int a2 = dkto.a(this.e.a().b);
        return a2 != 0 && a2 == 3;
    }

    @Override // defpackage.aczy
    public boolean e() {
        return false;
    }

    @Override // defpackage.aczy
    public boolean f() {
        return false;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> g() {
        return q() ? l() : dcmr.a;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> h() {
        return q() ? m() : dcmr.a;
    }

    protected abstract List<cqix<T>> k(List<cqix<?>> list);

    protected abstract Set<awvv<?>> l();

    protected abstract Set<awvv<?>> m();
}
