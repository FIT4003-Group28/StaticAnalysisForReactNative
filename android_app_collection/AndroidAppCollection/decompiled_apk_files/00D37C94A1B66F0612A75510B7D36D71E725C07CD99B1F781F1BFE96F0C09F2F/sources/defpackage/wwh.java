package defpackage;
/* compiled from: PG */
/* renamed from: wwh  reason: default package */
/* loaded from: classes4.dex */
public final class wwh {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final wwf d;

    public wwh(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, wwf wwfVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = wwfVar;
    }

    public final wwg a(xdu xduVar, xci xciVar) {
        if (xciVar.j.h()) {
            if (xciVar.b == apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER) {
                return new wwg((wnm) this.a.get(), (wli) this.b.get(), (xey) this.c.get(), (xcp) xciVar.j.c(), xduVar, xciVar);
            }
            if (xduVar.c() != apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM || xciVar.b != apcb.LAYOUT_TYPE_MEDIA) {
                throw new wuo("Unrecognized PingTracker requirements");
            }
            return new wwg((wnm) this.a.get(), (wli) this.b.get(), (xey) this.c.get(), (xcp) xciVar.j.c(), xduVar, xciVar);
        }
        throw new wuo("No layoutTracking map available");
    }
}
