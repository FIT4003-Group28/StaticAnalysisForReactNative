package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eapd  reason: default package */
/* loaded from: classes.dex */
public final class eapd extends eaqc implements Serializable, eapr {
    private static final long serialVersionUID = 3299096530934209741L;
    public final long a;

    public eapd() {
        this.a = eaor.a();
    }

    public eapd(long j) {
        this.a = j;
    }

    public static eapd a() {
        return new eapd();
    }

    @Override // defpackage.eapr
    public final long Tf() {
        return this.a;
    }

    @Override // defpackage.eapr
    public final eaok Tg() {
        return earp.E;
    }

    @Override // defpackage.eaqc, defpackage.eapr
    public final eapd Ti() {
        return this;
    }

    @Override // defpackage.eaqc
    public final eaol c() {
        return new eaol(this.a, earp.W());
    }

    public final eapd d(eapq eapqVar, int i) {
        if (eapqVar == null || i == 0) {
            return this;
        }
        long o = eapqVar.o();
        if (o != 0 && i != 0) {
            long k = earp.E.k(this.a, o, i);
            if (k != this.a) {
                return new eapd(k);
            }
        }
        return this;
    }

    public final eapd e(eapq eapqVar) {
        return d(eapqVar, 1);
    }

    public final eapd f(eapq eapqVar) {
        return d(eapqVar, -1);
    }

    public eapd(Object obj) {
        this.a = easc.a().b(obj).a(obj, earp.E);
    }
}
