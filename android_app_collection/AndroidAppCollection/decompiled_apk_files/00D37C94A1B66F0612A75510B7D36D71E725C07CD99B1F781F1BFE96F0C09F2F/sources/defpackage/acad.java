package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: acad  reason: default package */
/* loaded from: classes.dex */
final class acad implements afzf {
    final /* synthetic */ boolean a;
    final /* synthetic */ acay b;
    final /* synthetic */ abxt c;

    public acad(acay acayVar, boolean z, abxt abxtVar) {
        this.b = acayVar;
        this.a = z;
        this.c = abxtVar;
    }

    final void d() {
        Handler handler = this.b.n;
        final abxt abxtVar = this.c;
        handler.post(new Runnable() { // from class: acab
            @Override // java.lang.Runnable
            public final void run() {
                abxt abxtVar2 = abxt.this;
                if (!abxtVar2.a.d.d()) {
                    return;
                }
                zep.b("Create ingestion error: 1");
                abxtVar2.a.j.m();
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(acay.n(cffVar));
        zep.b(valueOf.length() != 0 ? "Error creating ingestion: ".concat(valueOf) : new String("Error creating ingestion: "));
        abxa.b().n(5, 1, cffVar);
        d();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        String str;
        arag aragVar;
        arps arpsVar = (arps) obj;
        if (arpsVar != null) {
            this.b.a.D(new acte(arpsVar.g.I()));
        }
        if (arpsVar == null) {
            zep.b("Create ingestion: missing response");
            abxa.b().n(5, 1, null);
            d();
            return;
        }
        int i = 2;
        if (arpsVar.c.size() > 0) {
            for (arpq arpqVar : arpsVar.c) {
                apdx apdxVar = arpqVar.b == 58057493 ? (apdx) arpqVar.c : null;
                int a = apdw.a(apdxVar.c);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                int i3 = apdxVar.b & 2;
                if (i3 != 0) {
                    if (i3 != 0) {
                        aragVar = apdxVar.d;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    str = ajgl.b(aragVar).toString();
                } else {
                    str = null;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 67);
                sb.append("Create ingestion: got an error response: type=");
                sb.append(i2);
                sb.append(", message=");
                sb.append(str);
                zep.b(sb.toString());
            }
            abxa.b().n(5, 1, null);
            d();
            return;
        }
        arpv arpvVar = arpsVar.d;
        if (arpvVar == null) {
            arpvVar = arpv.a;
        }
        arpw arpwVar = arpsVar.e;
        if (arpwVar == null) {
            arpwVar = arpw.a;
        }
        final arpw arpwVar2 = arpwVar;
        final aopu aopuVar = arpsVar.f;
        if (arpvVar.b == 85479539) {
            asuh asuhVar = (asuh) arpvVar.c;
            final String str2 = asuhVar.b;
            final String str3 = asuhVar.c;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                zep.b("Create ingestion: empty ingestion settings");
                abxa.b().n(5, 1, null);
                d();
                return;
            }
            String.valueOf(str2).length();
            String.valueOf(str3).length();
            abxa b = abxa.b();
            if (true == this.a) {
                i = 4;
            }
            b.k = i;
            b.m(8);
            Handler handler = this.b.n;
            final abxt abxtVar = this.c;
            handler.post(new Runnable() { // from class: acac
                @Override // java.lang.Runnable
                public final void run() {
                    arpw arpwVar3 = arpw.this;
                    abxt abxtVar2 = abxtVar;
                    String str4 = str2;
                    String str5 = str3;
                    List list = aopuVar;
                    aths athsVar = arpwVar3.b == 141258672 ? (aths) arpwVar3.c : null;
                    if (!abxtVar2.a.d.d()) {
                        return;
                    }
                    String.valueOf(str4).length();
                    String.valueOf(str5).length();
                    abyk abykVar = abxtVar2.a;
                    abykVar.F = str4;
                    abykVar.G = str5;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            apzg apzgVar = (apzg) it.next();
                            if (apzgVar.qn(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand)) {
                                abxtVar2.a.k.d((RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand) apzgVar.qm(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand));
                                break;
                            }
                        }
                    }
                    abyk abykVar2 = abxtVar2.a;
                    abykVar2.c.s(abykVar2.M, abykVar2.F, abykVar2.G, athsVar);
                    if (TextUtils.isEmpty(abxtVar2.a.F) || TextUtils.isEmpty(abxtVar2.a.G)) {
                        zep.b("Ingestion stream information was returned invalid");
                        abxtVar2.a.j.m();
                        return;
                    }
                    abxtVar2.a.j.f(2);
                }
            });
            return;
        }
        zep.b("Create ingestion: missing ingestion/renderer settings");
        abxa.b().n(5, 1, null);
        d();
    }
}
