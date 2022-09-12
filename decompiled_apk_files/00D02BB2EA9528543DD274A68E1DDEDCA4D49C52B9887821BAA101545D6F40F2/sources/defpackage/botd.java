package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: botd  reason: default package */
/* loaded from: classes3.dex */
public final class botd implements aket {
    public transient akzh a = null;
    private final dnqb b;

    public botd(dnqb dnqbVar) {
        this.b = dnqbVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ((botc) btsq.b(botc.class, ggaVar)).xr(this);
        akzh akzhVar = this.a;
        dbsk.s(akzhVar);
        akqq akqqVar = akzhVar.p().i;
        dnqb dnqbVar = this.b;
        botf botfVar = new botf();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_send_button_enabled_key", false);
        bvrs.k(bundle, "building_latlng_key", akqqVar.i());
        bundle.putInt("entry_point_type_key", dnqbVar.ah);
        botfVar.B(bundle);
        ggaVar.D(botfVar);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
