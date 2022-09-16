package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: vgo  reason: default package */
/* loaded from: classes4.dex */
public final class vgo extends vgn {
    public vgo() {
        super(Arrays.asList(vgm.COLLAPSED, vgm.FULLY_EXPANDED));
    }

    @Override // defpackage.vgn
    public final vgm a(vgm vgmVar) {
        return vgmVar == vgm.EXPANDED ? vgm.FULLY_EXPANDED : vgmVar;
    }

    @Override // defpackage.vgn
    public final vgm b(vgm vgmVar) {
        vgm vgmVar2 = vgmVar.e;
        return vgmVar2 == vgm.EXPANDED ? vgm.COLLAPSED : vgmVar2;
    }
}
