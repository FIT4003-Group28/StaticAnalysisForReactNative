package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tmx  reason: default package */
/* loaded from: classes4.dex */
public final class tmx implements tmr {
    final /* synthetic */ tmy a;

    public tmx(tmy tmyVar) {
        this.a = tmyVar;
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tmb tmbVar = (tmb) obj;
        aopc aopcVar = tmbVar.f;
        long c = this.a.c.c();
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        tmh tmhVar2 = tmh.a;
        tmhVar.b |= 4;
        tmhVar.f = c * 1000;
        tnb tnbVar = this.a.b;
        boolean z = tnbVar.g;
        Collection collection = (Collection) tnbVar.e.remove(obj);
        if (collection != null) {
            collection.clear();
            tnbVar.f = collection;
        }
        if (tmbVar.c()) {
            tmb b = ((tml) tmbVar.b).b();
            if (tmbVar.b.d() || (b != null && b.c())) {
                Collection collection2 = (Collection) tnbVar.e.get(b);
                if (collection2 != null) {
                    collection2.add(tmbVar.a());
                } else {
                    Collection collection3 = tnbVar.f;
                    if (collection3 != null) {
                        tnbVar.f = null;
                    } else {
                        collection3 = new ArrayList();
                    }
                    collection3.add(tmbVar.a());
                    tnbVar.e.put(b, collection3);
                }
            }
        }
        tnbVar.a.remove(obj);
        tnbVar.b.remove(obj);
        if (!tnbVar.e.isEmpty()) {
            this.a.b();
        }
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tmb tmbVar = (tmb) obj;
        aopc aopcVar = tmbVar.f;
        long c = this.a.c.c();
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        tmh tmhVar2 = tmh.a;
        tmhVar.b |= 4;
        tmhVar.f = c * 1000;
        tms tmsVar = tmbVar.b;
        int i = 1;
        if (tmsVar instanceof tml) {
            if (tmbVar.f.qn(too.a)) {
                if (!tmsVar.d()) {
                    ((tml) tmsVar).g(true);
                }
            } else {
                ((tml) tmsVar).g(false);
            }
        }
        tnb tnbVar = this.a.b;
        tms tmsVar2 = tmbVar.b;
        aopc aopcVar2 = tmbVar.f;
        angf angfVar = ((tmh) aopcVar2.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        if ((angfVar.b & 2048) == 0) {
            tnbVar.a.add(obj);
        } else {
            int h = ((tml) tmsVar2).h();
            int f = anhg.f(((tmh) aopcVar2.instance).e);
            if (f != 0) {
                i = f;
            }
            if (i == h) {
                return;
            }
            int i2 = ((tmh) aopcVar2.instance).e;
            if (!tnbVar.d(tmbVar, h)) {
                return;
            }
        }
        this.a.b();
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        uwp.f();
        tmy tmyVar = this.a;
        if (tmyVar.f != null) {
            if (tmyVar.e <= 0 && !((tmb) obj).b.d()) {
                return;
            }
            uwp.i(this.a.f);
            this.a.a();
        }
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        tmb tmbVar = (tmb) obj;
        tmt tmtVar = tmbVar.a;
        if (!tmtVar.a.isEmpty()) {
            for (tmr tmrVar : tmtVar.a) {
                tmrVar.a(obj);
            }
        }
        aopc aopcVar = tmbVar.f;
        angf angfVar = ((tmh) aopcVar.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        aopa mo52toBuilder = angfVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        angf angfVar2 = (angf) mo52toBuilder.instance;
        angfVar2.e = null;
        angfVar2.b &= -2049;
        mo52toBuilder.copyOnWrite();
        angf angfVar3 = (angf) mo52toBuilder.instance;
        angfVar3.b &= -2;
        angfVar3.c = -1;
        angf angfVar4 = (angf) mo52toBuilder.mo39build();
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        angfVar4.getClass();
        tmhVar.d = angfVar4;
        tmhVar.b |= 1;
    }

    @Override // defpackage.tmr
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void f() {
        uwp.f();
    }

    @Override // defpackage.tmr
    public final /* bridge */ /* synthetic */ void g(Object obj, int i) {
        tmb tmbVar = (tmb) obj;
        aopc aopcVar = tmbVar.f;
        long c = this.a.c.c();
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        tmh tmhVar2 = tmh.a;
        tmhVar.b |= 4;
        tmhVar.f = c * 1000;
        if (this.a.b.d(tmbVar, i)) {
            this.a.b();
        }
    }
}
