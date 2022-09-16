package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.SaveImageToDeviceEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gmx  reason: default package */
/* loaded from: classes3.dex */
public final class gmx implements aafl {
    private static final atvp c;
    public final aafo a;
    public final Executor b;
    private final Context d;
    private final azqb e;
    private final Handler f;
    private final akkm g;
    private final akdr h;
    private final Activity i;

    static {
        aopa createBuilder = atvp.a.createBuilder();
        atvo atvoVar = atvo.WRITE_EXTERNAL_STORAGE;
        createBuilder.copyOnWrite();
        atvp atvpVar = (atvp) createBuilder.instance;
        atvpVar.c = atvoVar.m;
        atvpVar.b |= 1;
        c = (atvp) createBuilder.mo39build();
    }

    public gmx(Context context, azqb azqbVar, aafo aafoVar, Executor executor, Handler handler, akkm akkmVar, akdr akdrVar, Activity activity) {
        this.d = context;
        this.e = azqbVar;
        aafoVar.getClass();
        this.a = aafoVar;
        executor.getClass();
        this.b = executor;
        this.f = handler;
        akkmVar.getClass();
        this.g = akkmVar;
        akdrVar.getClass();
        this.h = akdrVar;
        this.i = activity;
    }

    public final void b(boolean z, final apzg apzgVar, final Map map) {
        if (z) {
            this.f.post(new Runnable() { // from class: gmt
                @Override // java.lang.Runnable
                public final void run() {
                    gmx gmxVar = gmx.this;
                    gmxVar.a.c(apzgVar, map);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.auod r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmx.c(auod, java.util.Map):void");
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        if (!apzgVar.qn(SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint)) {
            return;
        }
        final auod auodVar = (auod) apzgVar.qm(SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint);
        akkm akkmVar = this.g;
        atvp atvpVar = c;
        if (akkmVar.c(atvpVar)) {
            this.b.execute(new Runnable() { // from class: gmu
                @Override // java.lang.Runnable
                public final void run() {
                    gmx.this.c(auodVar, map);
                }
            });
            return;
        }
        boolean z = false;
        if (!this.h.i(this.i, 0)) {
            this.h.d(akdr.l(0));
            this.g.d(atvpVar, new gmw(this, auodVar, map));
            return;
        }
        if ((auodVar.b & 64) != 0) {
            z = true;
        }
        apzg apzgVar2 = auodVar.i;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        b(z, apzgVar2, map);
    }
}
