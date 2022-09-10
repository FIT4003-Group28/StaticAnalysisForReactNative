package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akqe  reason: default package */
/* loaded from: classes.dex */
public final class akqe implements akqd {
    public static final akrp c;
    public final List<akqd> a = dchl.a();
    public akrp b = c;

    static {
        akra akraVar = new akra(Integer.MIN_VALUE, Integer.MIN_VALUE);
        c = new akrp(akraVar, akraVar);
    }

    @Override // defpackage.akqd
    public final akrp i() {
        return this.b;
    }

    @Override // defpackage.akqd
    public final boolean j(akra akraVar) {
        if (this.b.j(akraVar)) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).j(akraVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akqd
    public final boolean k(akrq akrqVar) {
        if (this.b.k(akrqVar)) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).k(akrqVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
