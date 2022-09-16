package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdn  reason: default package */
/* loaded from: classes.dex */
public final class afdn implements afng {
    final /* synthetic */ afdv a;

    public afdn(afdv afdvVar) {
        this.a = afdvVar;
    }

    @Override // defpackage.afng
    public final void a() {
        c();
    }

    @Override // defpackage.afng
    public final void b() {
        this.a.W();
    }

    @Override // defpackage.afng
    public final void c() {
        this.a.e.k(afte.ANDROID_EXOPLAYER);
        ylr.c();
        this.a.R();
        afdv afdvVar = this.a;
        if (afdvVar.u != null) {
            afdvVar.j.post(new Runnable() { // from class: afdm
                @Override // java.lang.Runnable
                public final void run() {
                    afdn afdnVar = afdn.this;
                    afdv afdvVar2 = afdnVar.a;
                    afdp afdpVar = afdvVar2.u;
                    afdvVar2.u = null;
                    if (afdpVar != null) {
                        afdnVar.a.U(afdpVar.a, afdpVar.c, afdpVar.b, afdpVar.d, afdpVar.e);
                    }
                }
            });
        }
        if (!this.a.ab()) {
            this.a.P();
        } else {
            this.a.Q(true);
        }
        afdv afdvVar2 = this.a;
        afdvVar2.p.v(afdvVar2.v, afdvVar2.w);
    }

    @Override // defpackage.afng
    public final void d() {
        PlayerConfigModel playerConfigModel;
        this.a.e.l(afte.ANDROID_EXOPLAYER);
        zep.g("EXO surface destroyed");
        afdv afdvVar = this.a;
        if (afdvVar.u != null) {
            return;
        }
        if (afdvVar.t == null || (playerConfigModel = afdvVar.x) == null || !playerConfigModel.aR()) {
            this.a.X();
            return;
        }
        this.a.S();
        afdv afdvVar2 = this.a;
        afdvVar2.Y(afdvVar2.x.C(), "src.dest");
    }

    @Override // defpackage.afng
    public final void e() {
        this.a.e.m(afte.ANDROID_EXOPLAYER);
        afdv afdvVar = this.a;
        afdvVar.V(new afkn("gl", afdvVar.g()));
    }
}
