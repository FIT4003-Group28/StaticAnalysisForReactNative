package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ugm  reason: default package */
/* loaded from: classes4.dex */
public final class ugm extends ugt {
    private final ufs b;
    private final ucv c;

    public ugm(ufs ufsVar, ucv ucvVar) {
        this.b = ufsVar;
        this.c = ucvVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List b = this.c.b(string, 100);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            try {
                uiq uiqVar = (uiq) aopi.parseFrom(uiq.a, ((ucu) it.next()).b);
                aomr aomrVar = uiqVar.d;
                if (aomrVar == null) {
                    aomrVar = aomr.a;
                }
                String str = uiqVar.f;
                int d = aolu.d(uiqVar.e);
                if (d != 0) {
                    i = d;
                }
                ugl uglVar = new ugl(aomrVar, str, i);
                if (!linkedHashMap.containsKey(uglVar)) {
                    linkedHashMap.put(uglVar, new HashSet());
                }
                ((Set) linkedHashMap.get(uglVar)).addAll(uiqVar.c);
            } catch (aopx e) {
                uev.c("BatchUpdateThreadStateHandler", e, "Unable to parse SdkBatchedUpdate message", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ugl uglVar2 : linkedHashMap.keySet()) {
            aopa createBuilder = uiq.a.createBuilder();
            aomr aomrVar2 = uglVar2.a;
            createBuilder.copyOnWrite();
            uiq uiqVar2 = (uiq) createBuilder.instance;
            uiqVar2.d = aomrVar2;
            uiqVar2.b |= 1;
            String str2 = uglVar2.b;
            createBuilder.copyOnWrite();
            uiq uiqVar3 = (uiq) createBuilder.instance;
            uiqVar3.b |= 4;
            uiqVar3.f = str2;
            createBuilder.copyOnWrite();
            uiq uiqVar4 = (uiq) createBuilder.instance;
            uiqVar4.a();
            aonk.addAll((Iterable) linkedHashMap.get(uglVar2), (List) uiqVar4.c);
            int i2 = uglVar2.c;
            createBuilder.copyOnWrite();
            uiq uiqVar5 = (uiq) createBuilder.instance;
            uiqVar5.e = i2 - 1;
            uiqVar5.b |= 2;
            arrayList.add((uiq) createBuilder.mo39build());
        }
        ufr a = this.b.a(string, arrayList, aomkVar);
        if (!a.b() || !a.d) {
            this.c.d(string, b);
        }
        return a;
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "BatchUpdateThreadStateCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_BATCH_UPDATE_THREAD_STATE";
    }
}
