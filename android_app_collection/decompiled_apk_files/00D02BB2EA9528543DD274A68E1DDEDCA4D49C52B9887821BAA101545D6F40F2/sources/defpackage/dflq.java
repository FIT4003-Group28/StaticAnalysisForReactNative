package defpackage;

import com.google.ar.core.EarthNetworkCallResult;
import com.google.ar.core.EarthNetworkCallbackInterface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dflq  reason: default package */
/* loaded from: classes6.dex */
final class dflq implements degu {
    final /* synthetic */ EarthNetworkCallbackInterface a;
    final /* synthetic */ dssj b;

    public dflq(EarthNetworkCallbackInterface earthNetworkCallbackInterface, dssj dssjVar) {
        this.a = earthNetworkCallbackInterface;
        this.b = dssjVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dyiy dyiyVar;
        ByteBuffer byteBuffer = dflr.a;
        this.b.getClass();
        if (this.a == null) {
            return;
        }
        if (th instanceof dyjd) {
            dyjd dyjdVar = (dyjd) th;
            dyhw dyhwVar = dyjdVar.b;
            dyiyVar = dyjdVar.a.p;
        } else {
            dyiyVar = dyiy.INTERNAL;
        }
        this.a.run(new EarthNetworkCallResult(dflr.a, dyiyVar.r));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dssj dssjVar = (dssj) obj;
        if (this.a == null) {
            return;
        }
        dspd bR = dssjVar.bR();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bR.c());
        bR.j(allocateDirect);
        allocateDirect.flip();
        this.a.run(new EarthNetworkCallResult(allocateDirect, dyiy.OK.r));
    }
}
