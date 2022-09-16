package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iqv  reason: default package */
/* loaded from: classes3.dex */
public final class iqv implements yiw {
    final /* synthetic */ iqw a;
    private final /* synthetic */ int b;

    public iqv(iqw iqwVar) {
        this.a = iqwVar;
    }

    public iqv(iqw iqwVar, int i) {
        this.b = i;
        this.a = iqwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            Void r2 = (Void) obj;
            this.a.aH((PlayerResponseModel) obj2);
            return;
        }
        Void r22 = (Void) obj;
        iqw iqwVar = this.a;
        iqwVar.az = (PlayerResponseModel) obj2;
        if (iqwVar.az == null) {
            return;
        }
        iqwVar.aL();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            Void r3 = (Void) obj;
            yzj yzjVar = this.a.aA;
            yzjVar.d(yzjVar.b(exc));
            this.a.an.m(this);
            return;
        }
        Void r32 = (Void) obj;
        iqw iqwVar = this.a;
        iqwVar.az = null;
        iqwVar.ae.setVisibility(8);
        iqwVar.af.setVisibility(0);
        iqwVar.ag.setVisibility(8);
    }
}
