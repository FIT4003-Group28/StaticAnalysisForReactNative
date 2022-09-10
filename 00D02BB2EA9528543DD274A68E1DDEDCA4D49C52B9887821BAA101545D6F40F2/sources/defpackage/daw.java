package defpackage;

import android.graphics.Canvas;
import android.view.Surface;
import com.google.geo.ar.arlo.api.jni.HulaMapJniImpl;
/* compiled from: PG */
/* renamed from: daw  reason: default package */
/* loaded from: classes5.dex */
public final class daw implements daf {
    private final dae a;
    @dzsi
    private dfgo b = null;
    @dzsi
    private dtk c;
    private final dfjc d;

    public daw(dfjc dfjcVar) {
        this.d = dfjcVar;
        dav davVar = new dav(dfjcVar.d);
        this.a = davVar;
        Surface a = davVar.a();
        if (a == null || !a.isValid()) {
            return;
        }
        Canvas lockHardwareCanvas = a.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(-1118482);
        } finally {
            a.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    @Override // defpackage.czg
    public final void a() {
        this.d.b();
    }

    @Override // defpackage.daf
    public final void b(@dzsi dtk dtkVar) {
        if (!dbsd.a(this.c, dtkVar)) {
            this.c = dtkVar;
            if (dtkVar == null || !dtkVar.b) {
                this.d.b();
                return;
            }
            dfgo dfgoVar = null;
            dtj dtjVar = null;
            for (dtj dtjVar2 : dtkVar.d) {
                dgau b = dgau.b(dtjVar2.f);
                if (b == null) {
                    b = dgau.MANEUVER_UNKNOWN;
                }
                if (b == dgau.DESTINATION) {
                    dtjVar = dtjVar2;
                }
            }
            if (dtjVar != null) {
                duhe duheVar = dtjVar.b;
                if (duheVar == null) {
                    duheVar = duhe.c;
                }
                dfgn bZ = dfgo.d.bZ();
                double d = duheVar.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfgo dfgoVar2 = (dfgo) bZ.b;
                int i = dfgoVar2.a | 1;
                dfgoVar2.a = i;
                dfgoVar2.b = d;
                double d2 = duheVar.b;
                dfgoVar2.a = i | 2;
                dfgoVar2.c = d2;
                dfgoVar = bZ.bK();
            }
            if (dfgoVar == null) {
                this.d.a(dfgg.c);
                return;
            }
            dfgo dfgoVar3 = this.b;
            if (dfgoVar3 != null && ((float) akqo.e(new akqq(dfgoVar.b, dfgoVar.c), new akqq(dfgoVar3.b, dfgoVar3.c))) < 2.0f) {
                return;
            }
            dfjc dfjcVar = this.d;
            dfgf bZ2 = dfgg.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfgg dfggVar = (dfgg) bZ2.b;
            dfgoVar.getClass();
            dfggVar.b = dfgoVar;
            dfggVar.a |= 1;
            dfjcVar.a(bZ2.bK());
            this.b = dfgoVar;
        }
    }

    @Override // defpackage.daf
    public final dae c() {
        return this.a;
    }

    @Override // defpackage.dah
    public final void d(akqq akqqVar, float f) {
        dfgn bZ = dfgo.d.bZ();
        double d = akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar = (dfgo) bZ.b;
        int i = dfgoVar.a | 1;
        dfgoVar.a = i;
        dfgoVar.b = d;
        double d2 = akqqVar.b;
        dfgoVar.a = i | 2;
        dfgoVar.c = d2;
        dfgo bK = bZ.bK();
        dfjc dfjcVar = this.d;
        dfgh bZ2 = dfgi.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfgi dfgiVar = (dfgi) bZ2.b;
        int i2 = dfgiVar.a | 1;
        dfgiVar.a = i2;
        dfgiVar.b = f;
        bK.getClass();
        dfgiVar.c = bK;
        dfgiVar.a = i2 | 2;
        byte[] bS = bZ2.bK().bS();
        synchronized (dfjcVar.a) {
            if (!dfjcVar.b.c()) {
                dffe dffeVar = dfjcVar.c;
                HulaMapJniImpl.nativeUpdateSnapshotParams(dfjcVar.b.b(), bS);
            }
        }
    }
}
