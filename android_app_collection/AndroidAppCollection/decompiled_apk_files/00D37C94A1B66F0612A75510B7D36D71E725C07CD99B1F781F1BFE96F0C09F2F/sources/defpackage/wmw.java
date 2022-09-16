package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wmw  reason: default package */
/* loaded from: classes4.dex */
public final class wmw implements wlk {
    public final yni a;
    public zgz b;

    public wmw(yni yniVar) {
        this.a = yniVar;
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        zgz zgzVar;
        if (aikaVar != aika.INTERSTITIAL_REQUESTED || (zgzVar = this.b) == null || zgzVar.a() == null) {
            return;
        }
        aopa createBuilder = asno.a.createBuilder();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnoVar.b |= 65536;
        asnoVar.m = true;
        ((acvg) this.b.a()).a((asno) createBuilder.mo39build());
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
