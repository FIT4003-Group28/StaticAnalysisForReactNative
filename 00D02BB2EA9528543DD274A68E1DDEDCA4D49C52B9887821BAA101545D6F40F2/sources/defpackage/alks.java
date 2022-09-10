package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: alks  reason: default package */
/* loaded from: classes2.dex */
public final class alks extends alkx implements aktc {
    public final amhf c;
    @dzsi
    private final dmlo f;
    private final dmpm g;

    public alks(aloi aloiVar, alkw alkwVar, amkk amkkVar, @dzsi dmlo dmloVar, akty aktyVar) {
        super(aloiVar, alkwVar, amkkVar, aktyVar, true, false);
        this.c = new amhf();
        this.f = dmloVar;
        dmpm b = dmpm.b(amkkVar.a().f);
        this.g = b == null ? dmpm.CENTER_LEFT_TO_CENTER_RIGHT : b;
    }

    @Override // defpackage.alkx
    public final boolean A() {
        boolean z;
        synchronized (this.c.b) {
            z = this.c.a != null;
        }
        return z;
    }

    @Override // defpackage.aktc
    public final void a(aktb aktbVar) {
        amhf amhfVar = this.c;
        synchronized (amhfVar.b) {
            amhfVar.d.a(aktbVar);
            amhfVar.c = true;
        }
        this.d.d();
    }

    @Override // defpackage.aktc
    @dzsi
    public final akra b() {
        amje i = this.e.i();
        if (i.f() || i.g()) {
            alvi a = this.e.i().a();
            dbsk.s(a);
            return a.a;
        }
        return null;
    }

    @Override // defpackage.aktc
    @dzsi
    public final dmlo c() {
        return this.f;
    }

    @Override // defpackage.aktc
    public final void d() {
        synchronized (this.c.b) {
            amhg amhgVar = this.c.a;
            if (amhgVar != null) {
                amhgVar.h();
            }
        }
    }

    @Override // defpackage.aktc
    public final void e(ardg ardgVar) {
        amhf amhfVar = this.c;
        synchronized (amhfVar.b) {
            amhg amhgVar = amhfVar.a;
            if (amhgVar != null) {
                amhgVar.o(ardgVar);
            } else {
                amhfVar.e = ardgVar;
            }
        }
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final /* bridge */ /* synthetic */ void v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void w(amix amixVar, float f, amky amkyVar) {
        Object b;
        if (this.b) {
            return;
        }
        int nextInt = dbsy.a.nextInt();
        amkk amkkVar = this.e;
        dmpm dmpmVar = this.g;
        dmlo dmloVar = this.f;
        amhe amheVar = amixVar.h;
        amkv amkvVar = amixVar.d;
        amlm amlmVar = amixVar.e;
        ammu ammuVar = amixVar.b;
        amfq amfqVar = amixVar.f;
        Resources resources = amixVar.a;
        bntn bntnVar = bntn.CALLOUT_LABEL;
        dmpn k = k();
        dsqv<dmpn, akuj> dsqvVar = akvj.b;
        k.f(dsqvVar);
        Object l = k.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        if (((akuj) b).d) {
            bntnVar = bntn.CALLOUT_LABEL_OVER_PLACEMARKS;
        }
        bntn bntnVar2 = bntnVar;
        amhg b2 = amheVar.b();
        b2.p(amkkVar, nextInt, f, amlmVar, ammuVar, amkvVar, amfqVar, bntnVar2, resources, dmloVar, dmpmVar, amkyVar, this);
        amhf amhfVar = this.c;
        synchronized (amhfVar.b) {
            if (b2 != null) {
                amhfVar.a = b2;
                amhfVar.a.w(64);
                amhfVar.a.o(amhfVar.e);
            }
        }
        s();
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final void x() {
        if (!B()) {
            this.d.c();
        }
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final synchronized void z() {
        this.d.a(this);
        this.c.a();
        super.z();
    }
}
