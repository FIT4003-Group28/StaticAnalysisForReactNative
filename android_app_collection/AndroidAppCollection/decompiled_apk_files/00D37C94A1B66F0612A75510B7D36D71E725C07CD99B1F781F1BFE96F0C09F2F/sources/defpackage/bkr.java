package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bkr  reason: default package */
/* loaded from: classes2.dex */
public final class bkr {
    public final HashMap a = new HashMap();

    public final void a(bla... blaVarArr) {
        for (int i = 0; i <= 0; i++) {
            bla blaVar = blaVarArr[i];
            int i2 = blaVar.a;
            int i3 = blaVar.b;
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(i2);
            TreeMap treeMap = (TreeMap) hashMap.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.a.put(valueOf, treeMap);
            }
            Integer valueOf2 = Integer.valueOf(i3);
            bla blaVar2 = (bla) treeMap.get(valueOf2);
            if (blaVar2 != null) {
                Log.w("ROOM", "Overriding migration " + blaVar2 + " with " + blaVar);
            }
            treeMap.put(valueOf2, blaVar);
        }
    }
}
