package defpackage;

import android.net.Uri;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zip  reason: default package */
/* loaded from: classes4.dex */
public final class zip implements afzf {
    final /* synthetic */ ziq a;
    private final Collection b;
    private final zis c;

    public zip(ziq ziqVar, Collection collection, zis zisVar) {
        this.a = ziqVar;
        this.b = collection;
        this.c = zisVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.b(String.format(Locale.US, "GetDataSyncNodesResponse: %s", cffVar.getMessage()));
        zis zisVar = this.c;
        if (zisVar == null || this.b == null) {
            return;
        }
        new zir(true);
        zisVar.a();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aqkf aqkfVar;
        arqm arqmVar = (arqm) obj;
        boolean z = (this.b == null || this.c == null) ? false : true;
        ziq ziqVar = this.a;
        HashMap hashMap = null;
        if ((arqmVar.b & 2) != 0) {
            aqkfVar = arqmVar.d;
            if (aqkfVar == null) {
                aqkfVar = aqkf.a;
            }
        } else {
            aqkfVar = null;
        }
        ziqVar.a(aqkfVar);
        if (z) {
            hashMap = new HashMap();
        }
        for (arqk arqkVar : arqmVar.e) {
            zep.b(String.format(Locale.US, "GetDataSyncNodesResponse: path=%s,  error=%s", arqkVar.b, arqkVar.c));
            if (hashMap != null) {
                hashMap.put(Uri.parse(arqkVar.b), arqkVar.c);
            }
        }
        if (!z) {
            return;
        }
        zis zisVar = this.c;
        new zir(false);
        zisVar.a();
    }
}
