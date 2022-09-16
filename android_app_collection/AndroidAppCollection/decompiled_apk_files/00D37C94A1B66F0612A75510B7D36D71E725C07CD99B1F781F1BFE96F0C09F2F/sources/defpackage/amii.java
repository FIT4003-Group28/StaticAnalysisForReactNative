package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: amii  reason: default package */
/* loaded from: classes.dex */
public final class amii {
    public final amid a;
    private final azqb b;

    public amii(azqb azqbVar, amid amidVar) {
        this.b = azqbVar;
        this.a = amidVar;
    }

    public final vne a(final amig amigVar, vjb vjbVar) {
        aqxo.z(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        ankw ankwVar = amigVar.g;
        if (ankwVar == null) {
            ankwVar = (ankw) this.b.get();
        }
        ankt qp = ankwVar.qp(ammo.g(new Callable() { // from class: amih
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amii amiiVar = amii.this;
                amig amigVar2 = amigVar;
                amid amidVar = amiiVar.a;
                amie amieVar = amigVar2.c;
                String concat = String.valueOf(amigVar2.a).concat(".pb");
                int i = amieVar.a;
                String concat2 = ((amieVar.b != 1 || Build.VERSION.SDK_INT < 24) ? "" : "directboot-").concat("files");
                String d = amps.d(concat);
                if (d.startsWith("/")) {
                    d = d.substring(1);
                }
                Uri.Builder authority = new Uri.Builder().scheme("android").authority(amidVar.a.getPackageName());
                StringBuilder sb = new StringBuilder(String.valueOf(concat2).length() + 2 + String.valueOf(d).length());
                sb.append("/");
                sb.append(concat2);
                sb.append("/");
                sb.append(d);
                return authority.path(sb.toString()).build();
            }
        }));
        String str = amigVar.a;
        aoqu aoquVar = amigVar.b;
        vkt vktVar = amigVar.e;
        vne vneVar = new vne(new vmq(str, qp, vnl.a(aoquVar, aoos.b()), ankwVar, vjbVar, vktVar, amlc.d()), anlz.q(""), amigVar.f, true);
        if (!amigVar.d.isEmpty()) {
            vneVar.c(vlh.b(amigVar.d, ankwVar));
        }
        return vneVar;
    }
}
