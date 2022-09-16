package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: hpb  reason: default package */
/* loaded from: classes3.dex */
final class hpb extends AsyncTask {
    public final hoz a;
    public final Handler b;
    public final AtomicBoolean c;
    private final abbr d;
    private final zsm e;
    private final afvn f;
    private final aopa g;

    public hpb(hoz hozVar, Handler handler, abbr abbrVar, zsm zsmVar, afvn afvnVar, AtomicBoolean atomicBoolean, apzg apzgVar) {
        aopa createBuilder = arts.a.createBuilder();
        this.g = createBuilder;
        this.a = hozVar;
        this.b = handler;
        this.d = abbrVar;
        this.e = zsmVar;
        this.f = afvnVar;
        this.c = atomicBoolean;
        if (apzgVar == null || !apzgVar.qn(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint) || (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apzgVar.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).b & 16) == 0) {
            return;
        }
        String str = ((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apzgVar.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).f;
        createBuilder.copyOnWrite();
        arts artsVar = (arts) createBuilder.instance;
        str.getClass();
        artsVar.b |= 4;
        artsVar.e = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        avxr b = ((hmg) this.e).a.b();
        if (b != null) {
            aopa aopaVar = this.g;
            aopaVar.copyOnWrite();
            arts artsVar = (arts) aopaVar.instance;
            arts artsVar2 = arts.a;
            artsVar.d = b;
            artsVar.b |= 2;
        } else {
            aopa aopaVar2 = this.g;
            aopaVar2.copyOnWrite();
            arts artsVar3 = (arts) aopaVar2.instance;
            arts artsVar4 = arts.a;
            artsVar3.d = null;
            artsVar3.b &= -3;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void r5 = (Void) obj;
        try {
            abbr abbrVar = this.d;
            aopa aopaVar = this.g;
            abbq abbqVar = new abbq(abbrVar.e, this.f.c(), aopaVar);
            abbqVar.i();
            abbqVar.i = aadf.b(abbrVar.g);
            abbrVar.c.e(abbqVar, new hpa(this));
        } catch (aart e) {
            zep.d("Failed to get camera info", e);
        }
    }
}
