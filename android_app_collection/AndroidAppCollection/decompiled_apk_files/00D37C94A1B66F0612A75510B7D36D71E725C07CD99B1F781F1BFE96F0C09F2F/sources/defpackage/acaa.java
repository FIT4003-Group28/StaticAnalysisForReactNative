package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
/* compiled from: PG */
/* renamed from: acaa  reason: default package */
/* loaded from: classes.dex */
final class acaa implements afzf {
    final /* synthetic */ abze a;
    final /* synthetic */ acay b;

    public acaa(acay acayVar, abze abzeVar) {
        this.b = acayVar;
        this.a = abzeVar;
    }

    private final void d(final int i, final String str, final aqft aqftVar) {
        Handler handler = this.b.n;
        final abze abzeVar = this.a;
        handler.post(new Runnable() { // from class: abzy
            @Override // java.lang.Runnable
            public final void run() {
                abze.this.a(i, str, aqftVar);
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(acay.n(cffVar));
        zep.b(valueOf.length() != 0 ? "Error creating broadcast: ".concat(valueOf) : new String("Error creating broadcast: "));
        abxa.b().n(4, 1, cffVar);
        d(1, null, null);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        String str;
        aqft aqftVar;
        int i;
        asue asueVar;
        final arpi arpiVar = (arpi) obj;
        int i2 = 1;
        final athc athcVar = null;
        if (arpiVar == null) {
            zep.b("Create broadcast: missing response");
            abxa.b().n(4, 1, null);
            d(1, null, null);
        } else if (arpiVar.e.size() <= 0) {
            if (!arpiVar.d.isEmpty()) {
                if ((arpiVar.b & 32) != 0) {
                    arpj arpjVar = arpiVar.f;
                    if (arpjVar == null) {
                        arpjVar = arpj.a;
                    }
                    if (arpjVar.b == 124974497) {
                        athcVar = (athc) arpjVar.c;
                    }
                }
                abxa.b().e = arpiVar.d;
                abxa.b().m(7);
                Handler handler = this.b.n;
                final abze abzeVar = this.a;
                handler.post(new Runnable() { // from class: abzz
                    @Override // java.lang.Runnable
                    public final void run() {
                        abze abzeVar2 = abze.this;
                        arpi arpiVar2 = arpiVar;
                        abzeVar2.b(arpiVar2.d, athcVar);
                    }
                });
                return;
            }
            zep.b("Create broadcast: missing video ID");
            abxa.b().n(4, 1, null);
            d(1, null, null);
        } else {
            for (arpg arpgVar : arpiVar.e) {
                if (arpgVar.b == 124003698) {
                    int x = akzj.x(((asue) arpgVar.c).d);
                    if (x == 0) {
                        x = 1;
                    }
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("Create broadcast: got an error response: type=");
                    sb.append(x - 1);
                    zep.b(sb.toString());
                }
            }
            if (((arpg) arpiVar.e.get(0)).b == 124003698) {
                arpg arpgVar2 = (arpg) arpiVar.e.get(0);
                if (arpgVar2.b == 124003698) {
                    asueVar = (asue) arpgVar2.c;
                } else {
                    asueVar = asue.a;
                }
                int x2 = akzj.x(asueVar.d);
                if (x2 != 0) {
                    i2 = x2;
                }
                int i3 = asueVar.b;
                if (i3 == 5) {
                    str = ajgl.b((arag) asueVar.c).toString();
                    i = i2;
                    aqftVar = null;
                } else if (i3 == 6) {
                    i = i2;
                    aqftVar = (aqft) ((aunb) asueVar.c).qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                    str = null;
                } else {
                    i = i2;
                    str = null;
                    aqftVar = null;
                }
            } else {
                str = null;
                aqftVar = null;
                i = 1;
            }
            abxa.b().n(4, acay.o(i), null);
            d(acay.p(i), str, aqftVar);
        }
    }
}
