package defpackage;

import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjbf  reason: default package */
/* loaded from: classes4.dex */
final class cjbf {
    static final dspd a = dgmr.d(234);
    public static final int e = R.styleable.AppCompatTheme_windowFixedHeightMinor;
    public static final int f = 7;
    public final Executor b;
    public final buqz c;
    public final bvax d;

    public cjbf(buqz buqzVar, bvax bvaxVar, Executor executor) {
        this.c = buqzVar;
        this.d = bvaxVar;
        this.b = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dddi a(dspd dspdVar) {
        dddh bZ = dddi.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar = (dddi) bZ.b;
        dspdVar.getClass();
        dddiVar.a |= 2;
        dddiVar.c = dspdVar;
        dspd c = dgmr.c(e, f);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar2 = (dddi) bZ.b;
        c.getClass();
        dddiVar2.a |= 4;
        dddiVar2.d = c;
        dspd dspdVar2 = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar3 = (dddi) bZ.b;
        dspdVar2.getClass();
        dddiVar3.a |= 8;
        dddiVar3.e = dspdVar2;
        return bZ.bK();
    }
}
