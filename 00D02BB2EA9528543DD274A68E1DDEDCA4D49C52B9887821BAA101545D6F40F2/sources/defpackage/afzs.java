package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: afzs  reason: default package */
/* loaded from: classes.dex */
public class afzs {
    public final dbty<duwm> a;
    private final Application b;
    private final dbty<Boolean> c;
    private final dbty<Boolean> d;
    private final acyp e;

    public afzs(Application application, final btvo btvoVar, final akfa akfaVar, final agwp agwpVar, acyp acypVar) {
        this.b = application;
        btvoVar.getClass();
        this.a = dbud.a(new dbty(btvoVar) { // from class: afzp
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getLocalStreamParameters();
            }
        });
        this.c = dbud.a(new dbty(agwpVar, akfaVar) { // from class: afzq
            private final agwp a;
            private final akfa b;

            {
                this.a = agwpVar;
                this.b = akfaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.a(this.b.j()));
            }
        });
        this.d = dbud.a(new dbty(btvoVar) { // from class: afzr
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.getEnableFeatureParameters().aM);
            }
        });
        this.e = acypVar;
    }

    public final boolean a() {
        return (this.e.a() || !btpf.b(this.b)) && this.a.a().a() && (this.a.a().b() || this.c.a().booleanValue());
    }

    public final boolean b() {
        return a() && (this.a.a().e() || this.a.a().f());
    }

    public final boolean c() {
        return this.a.a().l();
    }

    public final boolean d() {
        return this.a.a().o();
    }

    public final boolean e() {
        return this.d.a().booleanValue();
    }

    public final boolean f() {
        return this.a.a().i();
    }

    @dzsi
    public final int g() {
        return this.a.a().p();
    }
}
