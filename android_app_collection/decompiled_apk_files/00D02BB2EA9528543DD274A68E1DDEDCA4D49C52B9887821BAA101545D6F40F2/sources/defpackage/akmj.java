package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: akmj  reason: default package */
/* loaded from: classes.dex */
public final class akmj implements dbsz<aknx> {
    final /* synthetic */ akmk a;

    public akmj(akmk akmkVar) {
        this.a = akmkVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi aknx aknxVar) {
        aknx aknxVar2 = aknxVar;
        if (aknxVar2 == null) {
            aknxVar2 = aknx.b;
        }
        HashMap hashMap = new HashMap();
        for (aknw aknwVar : aknxVar2.a) {
            if (this.a.d.b() - aknwVar.c < akmk.a.b) {
                hashMap.put(aknwVar.b, new eapd(aknwVar.c));
            }
        }
        synchronized (this.a.e) {
            this.a.g = hashMap;
        }
    }
}
