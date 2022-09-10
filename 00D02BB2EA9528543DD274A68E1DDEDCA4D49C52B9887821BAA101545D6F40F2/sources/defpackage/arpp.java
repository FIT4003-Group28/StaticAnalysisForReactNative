package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arpp  reason: default package */
/* loaded from: classes.dex */
public final class arpp implements dbsl<afga> {
    private final btvo a;
    private final dxio<ascb> b;
    private final ita c;

    public arpp(btvo btvoVar, dxio<ascb> dxioVar, ita itaVar) {
        this.a = btvoVar;
        this.b = dxioVar;
        this.c = itaVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        Intent intent;
        afga afgaVar2 = afgaVar;
        if (this.a.getEnrouteParameters().a && (intent = afgaVar2.a) != null && intent.getData() != null && this.c.a(43) && this.b.a().g() && vxx.d(this.b.a().h(), this.a)) {
            afin afinVar = new afin();
            if (!afinVar.a(afgaVar2.a)) {
                return false;
            }
            afia b = afinVar.b(afgaVar2.a, null);
            return b.a == afib.SEARCH && b.x == ddjr.ENROUTE;
        }
        return false;
    }
}
