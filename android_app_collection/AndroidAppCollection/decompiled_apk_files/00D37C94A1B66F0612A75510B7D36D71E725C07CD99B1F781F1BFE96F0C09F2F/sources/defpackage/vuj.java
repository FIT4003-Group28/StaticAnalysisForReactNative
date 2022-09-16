package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: vuj  reason: default package */
/* loaded from: classes4.dex */
final class vuj implements ota {
    final /* synthetic */ otb a;
    final /* synthetic */ otb b;
    final /* synthetic */ Looper c;
    final /* synthetic */ vuk d;
    private final /* synthetic */ int e;

    public vuj(vuk vukVar, otb otbVar, otb otbVar2, Looper looper) {
        this.d = vukVar;
        this.a = otbVar;
        this.b = otbVar2;
        this.c = looper;
    }

    public vuj(vuk vukVar, otb otbVar, otb otbVar2, Looper looper, int i) {
        this.e = i;
        this.d = vukVar;
        this.b = otbVar;
        this.a = otbVar2;
        this.c = looper;
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
    }

    @Override // defpackage.ota
    public final void rM(osx osxVar) {
        if (this.e != 0) {
            this.d.a = osxVar;
            String valueOf = String.valueOf(osxVar.toString());
            vqy.b(valueOf.length() != 0 ? "primaryAudioPlayer triggered onPlayerError: ".concat(valueOf) : new String("primaryAudioPlayer triggered onPlayerError: "));
            this.b.n();
            this.a.h();
            this.b.h();
            this.c.quit();
            return;
        }
        this.d.a = osxVar;
        String valueOf2 = String.valueOf(osxVar.toString());
        vqy.b(valueOf2.length() != 0 ? "audioSwapPlayer triggered onPlayerError: ".concat(valueOf2) : new String("audioSwapPlayer triggered onPlayerError: "));
        this.a.n();
        this.a.h();
        this.b.h();
        this.c.quit();
    }
}
