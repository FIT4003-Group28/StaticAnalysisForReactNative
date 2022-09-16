package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aeab  reason: default package */
/* loaded from: classes.dex */
public final class aeab implements amqo {
    public final azqb a;
    public pdi b;
    private final axnm c;
    private final SharedPreferences d;
    private final Map e = new HashMap();
    private final aacz f;

    public aeab(aacz aaczVar, azqb azqbVar, axnm axnmVar, SharedPreferences sharedPreferences) {
        this.f = aaczVar;
        this.a = azqbVar;
        this.c = axnmVar;
        this.d = sharedPreferences;
    }

    @Override // defpackage.amqo
    /* renamed from: a */
    public final synchronized pde get() {
        pdi aeacVar;
        atfw atfwVar = this.f.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        aqwq aqwqVar = atfwVar.n;
        if (aqwqVar == null) {
            aqwqVar = aqwq.a;
        }
        int d = aqxo.d(aqwqVar.c);
        byte[] bArr = null;
        if (d != 0 && d == 2) {
            return null;
        }
        azqb azqbVar = this.a;
        if (azqbVar == null) {
            return null;
        }
        File file = (File) azqbVar.get();
        if (file == null) {
            return null;
        }
        pde pdeVar = (pde) this.e.get(file);
        if (pdeVar == null) {
            afjw.a(new File(file, "exo"));
            File file2 = new File(file, "exo");
            atfw atfwVar2 = this.f.b().k;
            if (atfwVar2 == null) {
                atfwVar2 = atfw.a;
            }
            aqwq aqwqVar2 = atfwVar2.n;
            if (aqwqVar2 == null) {
                aqwqVar2 = aqwq.a;
            }
            int d2 = aqxo.d(aqwqVar2.c);
            if (d2 == 0) {
                d2 = 1;
            }
            if (d2 - 1 == 3) {
                azqb azqbVar2 = this.a;
                uvy uvyVar = azqbVar2 != null ? new uvy(azqbVar2, 7) : null;
                aqwp aqwpVar = aqwqVar2.d;
                if (aqwpVar == null) {
                    aqwpVar = aqwp.a;
                }
                aqwp aqwpVar2 = aqwqVar2.e;
                if (aqwpVar2 == null) {
                    aqwpVar2 = aqwp.a;
                }
                aeacVar = new aeac(uvyVar, aqwpVar, aqwpVar2);
                this.b = aeacVar;
            } else {
                long a = zgt.a(aqwqVar2.b, 67108864L);
                long a2 = zgt.a(aqwqVar2.b, 268435456L);
                double f = zew.f();
                Double.isNaN(f);
                if (f * 0.1d > a2) {
                    a = a2;
                }
                aeacVar = new pdu(a);
                this.b = aeacVar;
            }
            if (aqwqVar.f) {
                bArr = ((zdu) this.c.get()).b(this.d).getEncoded();
            }
            pdeVar = new pdx(file2, aeacVar, bArr, aqwqVar.g);
            this.e.put(file, pdeVar);
        }
        return pdeVar;
    }
}
