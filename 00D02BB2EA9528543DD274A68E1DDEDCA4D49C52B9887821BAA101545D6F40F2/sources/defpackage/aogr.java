package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aogr  reason: default package */
/* loaded from: classes2.dex */
public final class aogr implements dbty<dcdn<aoha, aogt>> {
    final /* synthetic */ aogu a;

    public aogr(aogu aoguVar) {
        this.a = aoguVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dcdn<aoha, aogt> a() {
        HashMap hashMap = new HashMap();
        dcdc<aogt> dcdcVar = this.a.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aogt aogtVar = dcdcVar.get(i);
            if (aogtVar.b().a()) {
                dvap dvapVar = aogtVar.b().b().e;
                if (dvapVar == null) {
                    dvapVar = dvap.d;
                }
                hashMap.put(aoha.d(dvapVar), aogtVar);
            }
        }
        return dcdn.r(hashMap);
    }
}
