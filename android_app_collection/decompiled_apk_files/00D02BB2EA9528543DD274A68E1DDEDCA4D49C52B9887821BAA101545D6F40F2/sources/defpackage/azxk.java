package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azxk  reason: default package */
/* loaded from: classes3.dex */
public final class azxk extends azwm<azxk> {
    private final bvrt<dolq> a;

    public azxk(azxj azxjVar) {
        super(azxjVar);
        this.a = bvrt.b(azxjVar.a);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        dolk dolkVar = g().c;
        if (dolkVar == null) {
            dolkVar = dolk.h;
        }
        return dolkVar.b;
    }

    public final dolq g() {
        return this.a.e((dssr) dolq.e.cu(7), dolq.e);
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azxk> h() {
        return azxm.e;
    }

    @Override // defpackage.azwm
    public final azwh<azxk> i() {
        return new azxj(this);
    }

    public final long j() {
        dojz dojzVar = g().d;
        if (dojzVar == null) {
            dojzVar = dojz.c;
        }
        return dojzVar.b;
    }
}
