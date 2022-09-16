package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
/* compiled from: PG */
/* renamed from: acap  reason: default package */
/* loaded from: classes.dex */
final class acap implements afzf {
    final /* synthetic */ abzk a;
    final /* synthetic */ acay b;

    public acap(acay acayVar, abzk abzkVar) {
        this.b = acayVar;
        this.a = abzkVar;
    }

    private final void d(final int i, final String str) {
        Handler handler = this.b.n;
        final abzk abzkVar = this.a;
        handler.post(new Runnable() { // from class: acan
            @Override // java.lang.Runnable
            public final void run() {
                abzk.this.b(i, str);
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(acay.n(cffVar));
        zep.b(valueOf.length() != 0 ? "Error stopping broadcast: ".concat(valueOf) : new String("Error stopping broadcast: "));
        abxa.b().n(9, 1, cffVar);
        d(1, null);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final athj athjVar;
        String str;
        final asdb asdbVar = (asdb) obj;
        if (asdbVar != null) {
            this.b.a.D(new acte(asdbVar.f));
        }
        int i = 1;
        if (asdbVar != null && asdbVar.d.size() != 0) {
            for (int i2 = 0; i2 < asdbVar.d.size(); i2++) {
                asue asueVar = ((ascz) asdbVar.d.get(i2)).b;
                if (asueVar == null) {
                    asueVar = asue.a;
                }
                int x = akzj.x(asueVar.d);
                if (x != 0 && x == 7) {
                    int i3 = asueVar.b;
                    if (i3 == 5) {
                        str = ajgl.b((arag) asueVar.c).toString();
                    } else {
                        if (i3 == 6) {
                            aqft aqftVar = (aqft) ((aunb) asueVar.c).qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                        }
                        str = null;
                    }
                    abxa b = abxa.b();
                    int x2 = akzj.x(asueVar.d);
                    if (x2 == 0) {
                        x2 = 1;
                    }
                    b.n(9, acay.o(x2), null);
                    int x3 = akzj.x(asueVar.d);
                    if (x3 != 0) {
                        i = x3;
                    }
                    d(acay.p(i), str);
                    return;
                }
            }
        }
        if (asdbVar != null) {
            ascy ascyVar = asdbVar.c;
            if (ascyVar == null) {
                ascyVar = ascy.a;
            }
            if (ascyVar.b == 122079382) {
                abxa.b().m(11);
                ascy ascyVar2 = asdbVar.c;
                if (ascyVar2 == null) {
                    ascyVar2 = ascy.a;
                }
                if (ascyVar2.b == 122079382) {
                    athjVar = (athj) ascyVar2.c;
                } else {
                    athjVar = athj.a;
                }
                Handler handler = this.b.n;
                final abzk abzkVar = this.a;
                handler.post(new Runnable() { // from class: acao
                    @Override // java.lang.Runnable
                    public final void run() {
                        abzk.this.a(athjVar, asdbVar.e);
                    }
                });
                return;
            }
        }
        zep.b("Stop broadcast: missing response");
        abxa.b().n(9, 1, null);
        d(1, null);
    }
}
