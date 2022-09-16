package defpackage;

import android.util.Pair;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: svx  reason: default package */
/* loaded from: classes4.dex */
public final class svx implements aypg {
    public final teb a;
    public final tdr b;
    public volatile tda c;
    public final tdi d;
    public final aypf e;
    public svw f;
    public volatile ayoi g;
    private azpx h = azpm.e();

    public svx(teb tebVar, tdr tdrVar, tda tdaVar, tdi tdiVar, aypf aypfVar) {
        this.a = tebVar;
        this.b = tdrVar;
        this.c = tdaVar;
        this.d = tdiVar;
        this.e = aypfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized cyr a() {
        svw svwVar;
        cyr cyrVar;
        if (e() || (svwVar = this.f) == null) {
            return null;
        }
        synchronized (svwVar.b) {
            cyrVar = svwVar.c;
        }
        return cyrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        svw svwVar;
        if (e() || (svwVar = this.f) == null) {
            return;
        }
        synchronized (svwVar.b) {
            svwVar.d = true;
        }
    }

    public final synchronized void d(cyv cyvVar) {
        if (!e()) {
            if (cyvVar == null) {
                this.a.c(28, "Null componentContext from setContext()", this.c);
            } else {
                this.h.c(cyvVar);
            }
        }
    }

    @Override // defpackage.aypg
    public final synchronized boolean e() {
        boolean z;
        svw svwVar = this.f;
        if (svwVar != null) {
            if (!svwVar.e()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(ayoi ayoiVar, ayoi ayoiVar2, tda tdaVar, cyv cyvVar, suv suvVar) {
        if (azoq.g(((azpm) this.h).c.get())) {
            this.h = azpm.e();
        }
        this.h.c(cyvVar);
        this.c = tdaVar;
        this.g = ayoiVar;
        svw svwVar = new svw(suvVar);
        this.f = svwVar;
        ayoiVar2.ak(this.h, new aypx() { // from class: svv
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                cyr cyrVar;
                svx svxVar = svx.this;
                swr swrVar = (swr) obj;
                cyv cyvVar2 = (cyv) obj2;
                if (swrVar == null) {
                    svxVar.a.c(29, "Template produced null Element", svxVar.c);
                    cyrVar = djf.a(cyvVar2).a;
                } else {
                    cyr b = svxVar.b.b(cyvVar2, svxVar.c, swrVar.b, svxVar.d, svxVar.e);
                    if (swrVar.a != null) {
                        dfa a = dfb.a(cyvVar2);
                        a.e(b);
                        a.F(swrVar.a);
                        cyrVar = a.a();
                    } else {
                        cyrVar = b;
                    }
                }
                return Pair.create(cyrVar, cyvVar2);
            }
        }).az(svwVar);
    }

    @Override // defpackage.aypg
    public final synchronized void qr() {
        svw svwVar = this.f;
        if (svwVar != null) {
            svwVar.qr();
        }
        this.g = null;
        this.f = null;
        this.h.sm();
        Map map = this.c.i;
        if (map != null) {
            map.clear();
        }
    }
}
