package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: qlx  reason: default package */
/* loaded from: classes4.dex */
public final class qlx implements qlt {
    final /* synthetic */ qly a;

    public qlx(qly qlyVar) {
        this.a = qlyVar;
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void a(qlr qlrVar, int i) {
        this.a.e((qku) qlrVar, i);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void b(qlr qlrVar) {
        qku qkuVar = (qku) qlrVar;
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void c(qlr qlrVar, int i) {
        this.a.e((qku) qlrVar, i);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void d(qlr qlrVar, boolean z) {
        this.a.c((qku) qlrVar);
        qnm.b(this.a.e);
        qly qlyVar = this.a;
        angb a = qlyVar.c.a(qlyVar.e);
        qma.d(a, z);
        this.a.b.a((angc) a.mo39build(), 227);
        this.a.f();
        this.a.g();
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void e(qlr qlrVar, String str) {
        qku qkuVar = (qku) qlrVar;
        qly qlyVar = this.a;
        SharedPreferences sharedPreferences = qlyVar.d;
        if (qlyVar.h(str)) {
            qnm.b(qlyVar.e);
        } else {
            qlyVar.e = qlz.b(sharedPreferences);
            if (!qlyVar.h(str)) {
                qlyVar.e = qlz.a();
                qlyVar.e.b = qly.a();
                qlyVar.e.f = str;
            } else {
                qnm.b(qlyVar.e);
                qlz.a = qlyVar.e.d + 1;
            }
        }
        qnm.b(this.a.e);
        qly qlyVar2 = this.a;
        angb a = qlyVar2.c.a(qlyVar2.e);
        aopa createBuilder = anga.a.createBuilder(((angc) a.instance).a());
        createBuilder.copyOnWrite();
        anga angaVar = (anga) createBuilder.instance;
        angaVar.b |= 64;
        angaVar.f = 10;
        a.copyOnWrite();
        ((angc) a.instance).p((anga) createBuilder.mo39build());
        qma.d(a, true);
        this.a.b.a((angc) a.mo39build(), 226);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void f(qlr qlrVar, int i) {
        this.a.e((qku) qlrVar, i);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void g(qlr qlrVar, String str) {
        this.a.c((qku) qlrVar);
        qly qlyVar = this.a;
        qlz qlzVar = qlyVar.e;
        qlzVar.f = str;
        this.a.b.a(qlyVar.c.b(qlzVar), 222);
        this.a.f();
        this.a.g();
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void h(qlr qlrVar) {
        qku qkuVar = (qku) qlrVar;
        if (this.a.e != null) {
            qly.a.d("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.a.d(qkuVar);
        qly qlyVar = this.a;
        qma qmaVar = qlyVar.c;
        qlz qlzVar = qlyVar.e;
        angb a = qmaVar.a(qlzVar);
        if (qlzVar.i == 1) {
            aopa createBuilder = anga.a.createBuilder(((angc) a.instance).a());
            createBuilder.copyOnWrite();
            anga angaVar = (anga) createBuilder.instance;
            angaVar.b |= 64;
            angaVar.f = 17;
            a.copyOnWrite();
            ((angc) a.instance).p((anga) createBuilder.mo39build());
        }
        this.a.b.a((angc) a.mo39build(), 221);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void i(qlr qlrVar, int i) {
        this.a.c((qku) qlrVar);
        qnm.b(this.a.e);
        qly qlyVar = this.a;
        this.a.b.a(qlyVar.c.c(qlyVar.e, i), 225);
        this.a.f();
        this.a.b();
    }
}
