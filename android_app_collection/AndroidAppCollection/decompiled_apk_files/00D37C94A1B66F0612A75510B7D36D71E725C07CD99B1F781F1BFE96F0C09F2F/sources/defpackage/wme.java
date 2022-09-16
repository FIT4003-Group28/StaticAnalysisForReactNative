package defpackage;

import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
/* compiled from: PG */
/* renamed from: wme  reason: default package */
/* loaded from: classes4.dex */
public final class wme {
    public final azqb a;
    public final aiji b;
    public final azqb c;
    public final azqb d;
    public final azqb e;

    public wme(azqb azqbVar, aiji aijiVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = aijiVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
    }

    public static final int a(xdu xduVar, xci xciVar) {
        if (!xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xbh.class) || !(xciVar.e(xbh.class) instanceof LocalVideoAd)) {
            return (!xciVar.g(apcb.LAYOUT_TYPE_MEDIA, xbl.class, xbn.class) || xduVar.c() != apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) ? 0 : 2;
        }
        return 1;
    }
}
