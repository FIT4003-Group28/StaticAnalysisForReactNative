package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wrs  reason: default package */
/* loaded from: classes4.dex */
public final class wrs implements wsg, wlk {
    private boolean a;
    private boolean b;

    @Override // defpackage.wsg
    public final String a() {
        return null;
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        return this.a ? this.b ? "playing" : "pause" : "";
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final void h(int i, String str) {
        this.b = i == 2;
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
    public final void qK(String str, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
