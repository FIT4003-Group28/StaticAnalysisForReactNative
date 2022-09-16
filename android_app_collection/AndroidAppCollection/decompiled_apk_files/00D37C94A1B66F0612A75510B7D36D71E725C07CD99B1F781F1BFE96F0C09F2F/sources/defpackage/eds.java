package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: eds  reason: default package */
/* loaded from: classes3.dex */
public final class eds extends wtu implements ecz {
    private boolean j;

    public eds(azqb azqbVar, edd eddVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, wwf wwfVar) {
        super(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10);
        eddVar.a(this);
    }

    @Override // defpackage.wtu, defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (!this.j) {
            super.f(aikaVar, playerResponseModel, ajbfVar, str, str2);
        }
    }

    @Override // defpackage.wtu, defpackage.wlo
    public final void i(PlayerResponseModel playerResponseModel) {
        if (!this.j) {
            super.i(playerResponseModel);
        }
    }

    @Override // defpackage.ecz
    public final void n(ecy ecyVar) {
    }

    @Override // defpackage.ecz
    public final void o(eda edaVar) {
        this.j = true;
    }

    @Override // defpackage.ecz
    public final void s() {
        this.j = false;
    }
}
