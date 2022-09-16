package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akez  reason: default package */
/* loaded from: classes.dex */
public final class akez implements akev {
    final /* synthetic */ akev a;
    final /* synthetic */ argj b;
    final /* synthetic */ Object c;
    final /* synthetic */ acti d;
    final /* synthetic */ boolean e;
    final /* synthetic */ akfb f;

    public akez(akfb akfbVar, akev akevVar, argj argjVar, Object obj, acti actiVar, boolean z) {
        this.f = akfbVar;
        this.a = akevVar;
        this.b = argjVar;
        this.c = obj;
        this.d = actiVar;
        this.e = z;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        akev akevVar = this.a;
        if (akevVar != null) {
            akevVar.le(akfqVar, i);
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        byte[] bArr;
        argc argcVar;
        akfq akfqVar = (akfq) obj;
        akev akevVar = this.a;
        if (akevVar != null) {
            akevVar.lf(akfqVar);
        }
        akfb akfbVar = this.f;
        argj argjVar = this.b;
        Object obj2 = this.c;
        acti actiVar = this.d;
        if (!this.e) {
            akfbVar.c.add(new Pair(argjVar, obj2));
            gfz gfzVar = akfbVar.f;
            String b = gfz.b(argjVar);
            SharedPreferences.Editor putLong = gfzVar.a.edit().putLong(b, gfzVar.a.getLong(b, 0L) + 1).putLong(gfz.a(argjVar), gfzVar.b.c());
            if ((argjVar.b & 64) != 0) {
                argf argfVar = argjVar.i;
                if (argfVar == null) {
                    argfVar = argf.a;
                }
                int ab = akel.ab(argfVar.b);
                if (ab != 0 && ab == 4) {
                    putLong.remove("add_to_long_press_hint_trigger_video_id");
                }
            }
            putLong.apply();
            if (argjVar.j.size() != 0) {
                for (apzg apzgVar : argjVar.j) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", argjVar);
                    akfbVar.a.c(apzgVar, hashMap);
                }
            }
        }
        if ((argjVar.b & 2) != 0) {
            argg arggVar = argjVar.d;
            if (arggVar == null) {
                arggVar = argg.a;
            }
            if (arggVar.b == 106514900) {
                argg arggVar2 = argjVar.d;
                if (arggVar2 == null) {
                    arggVar2 = argg.a;
                }
                if (arggVar2.b == 106514900) {
                    argcVar = (argc) arggVar2.c;
                } else {
                    argcVar = argc.a;
                }
                bArr = argcVar.h.I();
                if (actiVar != null || bArr == null) {
                }
                actiVar.u(new acte(bArr), null);
                return;
            }
        }
        bArr = null;
        if (actiVar != null) {
        }
    }
}
