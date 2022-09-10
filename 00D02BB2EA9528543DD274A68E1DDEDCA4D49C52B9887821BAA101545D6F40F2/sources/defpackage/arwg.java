package defpackage;

import com.spotify.protocol.types.Capabilities;
import com.spotify.protocol.types.PlayerContext;
import com.spotify.protocol.types.PlayerState;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arwg  reason: default package */
/* loaded from: classes2.dex */
public final class arwg implements arvv {
    final /* synthetic */ arwp a;

    public arwg(arwp arwpVar) {
        this.a = arwpVar;
    }

    @Override // defpackage.arvv
    public final void a(dxfd dxfdVar) {
        arwp arwpVar = this.a;
        arwpVar.l = dxfdVar.f;
        arwpVar.m = dxfdVar.d;
        arwpVar.n = dxfdVar.c;
        dxfu dxfuVar = arwpVar.n;
        dbsk.s(dxfuVar);
        dxfuVar.a.c("com.spotify.current_context", PlayerContext.class).a(this.a.i);
        dxfu dxfuVar2 = this.a.n;
        dbsk.s(dxfuVar2);
        dxfuVar2.a.c("com.spotify.player_state", PlayerState.class).a(this.a.j);
        dxfdVar.e.a.c("com.spotify.capabilities", Capabilities.class).a(this.a.k);
        this.a.aj(arwy.CONNECTED);
        cqkx.p(this.a);
    }

    @Override // defpackage.arvv
    public final void b(Throwable th) {
        this.a.G();
        if (th instanceof dxfn) {
            arwp arwpVar = this.a;
            arwpVar.g = true;
            arwpVar.aj(arwy.CONNECTION_ERROR);
        } else if ((th instanceof dxfh) || (th instanceof dxfg)) {
            this.a.aj(arwy.NOT_LOGGED_IN);
        } else if (th instanceof dxfj) {
            synchronized (this.a) {
                this.a.aj(arwy.DISCONNECTED);
                arwp arwpVar2 = this.a;
                if (arwpVar2.h) {
                    arwpVar2.ah();
                }
            }
        } else if (th instanceof dxfk) {
            this.a.aj(arwy.DISCONNECTED);
        } else {
            this.a.aj(arwy.CONNECTION_ERROR);
        }
        cqkx.p(this.a);
    }
}
