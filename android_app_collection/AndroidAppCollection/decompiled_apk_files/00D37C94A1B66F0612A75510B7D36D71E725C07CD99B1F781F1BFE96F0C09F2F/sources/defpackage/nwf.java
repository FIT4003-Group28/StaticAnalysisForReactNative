package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* compiled from: PG */
/* renamed from: nwf  reason: default package */
/* loaded from: classes3.dex */
public final class nwf extends ffj implements airt, ynl {
    public final airw h;
    public final aypf i;
    public final yni j;
    public final aacz k;

    public nwf(Context context, aacz aaczVar, airw airwVar, yni yniVar, ffo ffoVar) {
        super(context, ffoVar, new ffq());
        this.k = aaczVar;
        this.h = airwVar;
        this.j = yniVar;
        this.i = new aypf();
        i(ControlsOverlayStyle.a);
        ffoVar.u(0);
        ffoVar.s(true);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().e.aa(new ayqb() { // from class: nwe
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nwf.this.u((ahhx) obj);
            }
        }, npy.k)};
    }

    @Override // defpackage.ffj, defpackage.fev
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        aibt aibtVar = this.b;
        aibtVar.m = false;
        aibtVar.k = false;
        aibtVar.l = false;
        aibtVar.o = false;
        aibtVar.e = 17170445;
        this.a.y(aibtVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                u((ahhx) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhx.class};
    }

    public final void u(ahhx ahhxVar) {
        long e = ahhxVar.e();
        long h = ahhxVar.h();
        long f = ahhxVar.f();
        long a = ahhxVar.a();
        nX(false);
        nS(e, h, f, a);
    }
}
