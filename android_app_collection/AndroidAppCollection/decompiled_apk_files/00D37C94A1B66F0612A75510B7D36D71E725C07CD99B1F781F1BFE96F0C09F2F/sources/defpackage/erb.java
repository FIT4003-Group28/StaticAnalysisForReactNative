package defpackage;

import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: erb  reason: default package */
/* loaded from: classes3.dex */
public final class erb implements afzf {
    final /* synthetic */ erc a;
    private final String b;
    private final List c;
    private final Object d;

    public erb(erc ercVar, String str, List list, Object obj) {
        this.a = ercVar;
        zgh.m(str);
        this.b = str;
        this.c = list;
        this.d = obj;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error editing the playlist", cffVar);
        this.a.b.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        jor jorVar;
        asat asatVar = (asat) obj;
        if (asatVar.f.size() > 0) {
            ((aafo) this.a.a.get()).e(asatVar.f, this.d);
        }
        boolean z = false;
        for (auci auciVar : this.c) {
            int cf = awwc.cf(auciVar.c);
            if (cf == 0) {
                cf = 1;
            }
            int i = cf - 1;
            if (i == 1 || i == 2 || i == 14) {
                z = true;
            }
        }
        if (z && (jorVar = this.a.c) != null) {
            String str = this.b;
            zgh.m(str);
            if (((ahdn) jorVar.a.get()).c() && ((agrf) jorVar.b.get()).a().i().e(str) != null) {
                jorVar.a(str);
            }
        }
        if ((asatVar.b & 256) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
            aafo aafoVar = (aafo) this.a.a.get();
            apzg apzgVar = asatVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
    }
}
