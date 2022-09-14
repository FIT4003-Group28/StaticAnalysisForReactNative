package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azvm  reason: default package */
/* loaded from: classes3.dex */
public final class azvm extends azwm<azvm> {
    private final bvrt<doga> a;

    public azvm(azvl azvlVar) {
        super(azvlVar);
        this.a = bvrt.b(azvlVar.a);
    }

    public final long a() {
        return g().a;
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        return g().b;
    }

    public final doga g() {
        return this.a.e((dssr) doga.e.cu(7), doga.e);
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azvm> h() {
        return azxm.a;
    }

    @Override // defpackage.azwm
    public final azwh<azvm> i() {
        return new azvl(this);
    }
}
