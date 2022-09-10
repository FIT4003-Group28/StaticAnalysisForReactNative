package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azwo  reason: default package */
/* loaded from: classes3.dex */
public final class azwo extends azwm<azwo> {
    private static final dcqe a = dcqe.c("azwo");
    private final bvrt<dpzm> b;

    public azwo(azwn azwnVar) {
        super(azwnVar);
        this.b = bvrt.b(azwnVar.a);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        bvoo.h("Parking Location names are not implemented and should not be used.", new Object[0]);
        return "";
    }

    public final dpzm g() {
        return this.b.e((dssr) dpzm.j.cu(7), dpzm.j);
    }

    @Override // defpackage.azwm
    public final azxm<azwo> h() {
        return azxm.c;
    }

    @Override // defpackage.azwm
    public final azwh<azwo> i() {
        return new azwn(this);
    }
}
