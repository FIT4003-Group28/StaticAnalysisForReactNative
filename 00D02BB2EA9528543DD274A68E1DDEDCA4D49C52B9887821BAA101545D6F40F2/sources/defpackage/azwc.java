package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azwc  reason: default package */
/* loaded from: classes3.dex */
public final class azwc extends azwm<azwc> {
    private static final dcqe a = dcqe.c("azwc");
    private final bvrt<dokh> b;

    public azwc(azwb azwbVar) {
        super(azwbVar);
        this.b = bvrt.b(azwbVar.a);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        bvoo.h("getDisplayName() is intentionally not implemented and should never be called.", new Object[0]);
        return "";
    }

    public final String g() {
        dnls dnlsVar = j().b;
        if (dnlsVar == null) {
            dnlsVar = dnls.g;
        }
        return dnlsVar.c;
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azwc> h() {
        return azxm.g;
    }

    public final dokh j() {
        return this.b.e((dssr) dokh.d.cu(7), dokh.d);
    }

    @Override // defpackage.azwm
    /* renamed from: k */
    public final azwb i() {
        return new azwb(j());
    }
}
