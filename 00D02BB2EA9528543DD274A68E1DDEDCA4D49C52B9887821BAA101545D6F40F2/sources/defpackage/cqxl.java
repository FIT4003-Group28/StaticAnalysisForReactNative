package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cqxl  reason: default package */
/* loaded from: classes5.dex */
final class cqxl {
    public final cqww a;
    public final Map<dsyl, cqyv> b = new HashMap();
    public final Geller c;
    public final String d;
    public final ExecutorService e;
    public final ExecutorService f;

    public cqxl(String str, Geller geller, cqww cqwwVar, ExecutorService executorService, ExecutorService executorService2) {
        this.a = cqwwVar;
        this.c = geller;
        this.d = str;
        this.e = executorService;
        this.f = executorService2;
    }

    public static dsvx b(int i, List<cqzb> list) {
        dsvu bZ = dsvx.d.bZ();
        if (i == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsvx dsvxVar = (dsvx) bZ.b;
            dsvxVar.b = 1;
            dsvxVar.a |= 1;
        } else if (i == 3) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsvx dsvxVar2 = (dsvx) bZ.b;
            dsvxVar2.b = 2;
            dsvxVar2.a |= 1;
        }
        for (cqzb cqzbVar : list) {
            dsvg bZ2 = dsvh.d.bZ();
            String a = cqzbVar.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsvh dsvhVar = (dsvh) bZ2.b;
            a.getClass();
            dsvhVar.a |= 2;
            dsvhVar.c = a;
            long b = cqzbVar.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsvh dsvhVar2 = (dsvh) bZ2.b;
            dsvhVar2.a |= 1;
            dsvhVar2.b = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsvx dsvxVar3 = (dsvx) bZ.b;
            dsvh bK = bZ2.bK();
            bK.getClass();
            dsrj<dsvh> dsrjVar = dsvxVar3.c;
            if (!dsrjVar.a()) {
                dsvxVar3.c = dsqw.cl(dsrjVar);
            }
            dsvxVar3.c.add(bK);
        }
        return bZ.bK();
    }

    public final cqyv a(dsyl dsylVar) {
        if (!this.b.containsKey(dsylVar)) {
            this.b.put(dsylVar, cqyw.e());
        }
        return this.b.get(dsylVar);
    }
}
