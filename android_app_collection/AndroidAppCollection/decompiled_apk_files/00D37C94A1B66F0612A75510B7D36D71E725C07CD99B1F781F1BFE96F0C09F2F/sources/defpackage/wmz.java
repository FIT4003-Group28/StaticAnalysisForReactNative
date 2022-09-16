package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wmz  reason: default package */
/* loaded from: classes4.dex */
final class wmz implements afzn {
    final /* synthetic */ xdu a;
    final /* synthetic */ xci b;
    final /* synthetic */ wna c;

    public wmz(wna wnaVar, xdu xduVar, xci xciVar) {
        this.c = wnaVar;
        this.a = xduVar;
        this.b = xciVar;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        xac xacVar = null;
        if (!((Map) this.c.a.get()).containsKey(str)) {
            return null;
        }
        wsg wsgVar = (wsg) ((Map) this.c.a.get()).get(str);
        xdu xduVar = this.a;
        xci xciVar = this.b;
        wsf wsfVar = (wsf) wsgVar.getClass().getAnnotation(wsf.class);
        if (wsfVar == null) {
            xacVar = xac.a;
        } else {
            Class a = wsfVar.a();
            if (xciVar.k.d(a)) {
                xacVar = xciVar.k;
            } else if (xduVar.g.d(a)) {
                xacVar = xduVar.g;
            }
        }
        if (xacVar != null) {
            return wsgVar.b(xacVar);
        }
        return wsgVar.a();
    }

    @Override // defpackage.afzn
    public final String b() {
        return "AdsConverterForExternalPings";
    }
}
