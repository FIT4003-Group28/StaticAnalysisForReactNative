package com.google.android.apps.youtube.app.common.endpoint;

import android.net.Uri;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LoggingUrlsPingController implements f, ynl {
    public final xfd a;
    private final azqb b;
    private final exu c;
    private final afwu d;
    private final Executor e;
    private final yni f;
    private final airw g;
    private aypg h;
    private final aacz i;

    public LoggingUrlsPingController(azqb azqbVar, exu exuVar, xfd xfdVar, afwu afwuVar, Executor executor, yni yniVar, airw airwVar, aacz aaczVar) {
        this.b = azqbVar;
        this.c = exuVar;
        this.a = xfdVar;
        this.d = afwuVar;
        this.e = executor;
        this.f = yniVar;
        this.g = airwVar;
        this.i = aaczVar;
    }

    public final Uri g(String str, Map map) {
        Uri j = zgt.j(str);
        if (j == null) {
            return null;
        }
        afzn[] afznVarArr = (afzn[]) zew.K(map, "MacrosConverters.CustomConvertersKey", afzn[].class);
        try {
            return ((afzo) this.b.get()).a(j, afznVarArr != null ? (afzn[]) zew.O(afznVarArr, this.c) : new afzn[]{this.c});
        } catch (zhy unused) {
            String valueOf = String.valueOf(str);
            zep.l(valueOf.length() != 0 ? "Failed macro substitution for URI: ".concat(valueOf) : new String("Failed macro substitution for URI: "));
            return j;
        }
    }

    public final void h(ahhw ahhwVar) {
        this.c.a = ahhwVar.e();
    }

    public final void i(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final aswg aswgVar = (aswg) it.next();
            if (aswgVar != null && (aswgVar.b & 1) != 0) {
                final Uri g = g(aswgVar.c, map);
                if (this.a.b(g)) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        this.e.execute(new Runnable() { // from class: exx
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoggingUrlsPingController loggingUrlsPingController = LoggingUrlsPingController.this;
                                Uri uri = g;
                                loggingUrlsPingController.j(loggingUrlsPingController.a.a(uri), aswgVar);
                            }
                        });
                    } else {
                        j(this.a.a(g), aswgVar);
                    }
                } else {
                    j(g, aswgVar);
                }
            }
        }
    }

    public final void j(Uri uri, aswg aswgVar) {
        if (uri != null) {
            afwt d = afwu.d("appendpointlogging");
            d.b(uri);
            d.d = false;
            d.a(new acwk((aswf[]) aswgVar.d.toArray(new aswf[0])));
            this.d.a(d, afzr.b);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (eog.ap(this.i)) {
            this.h = this.g.G().b.aa(new ayqb() { // from class: exw
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    LoggingUrlsPingController.this.h((ahhw) obj);
                }
            }, dzq.j);
        } else {
            this.f.g(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        if (eog.ap(this.i)) {
            azof.f((AtomicReference) this.h);
            this.h = null;
            return;
        }
        this.f.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
