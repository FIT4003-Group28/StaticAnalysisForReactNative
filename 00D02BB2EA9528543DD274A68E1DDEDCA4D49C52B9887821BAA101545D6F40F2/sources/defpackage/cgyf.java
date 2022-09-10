package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgyf  reason: default package */
/* loaded from: classes4.dex */
public class cgyf implements cgvs {
    private final LinkedHashMap<String, cgvu> a = new LinkedHashMap<>();

    public cgyf(bmcn bmcnVar, bmcm bmcmVar, Resources resources, boolean z, String str) {
        for (dgls dglsVar : bmcnVar.a.a) {
            for (dglo dgloVar : dglsVar.d) {
                dglu dgluVar = dgloVar.d;
                int a = dglw.a((dgluVar == null ? dglu.e : dgluVar).d);
                if (a != 0 && a == 2) {
                    LinkedHashMap<String, cgvu> linkedHashMap = this.a;
                    String str2 = dgloVar.b;
                    linkedHashMap.put(str2, new cgyg(dgloVar, bmcnVar.b(str2), bmcmVar, resources, z, str));
                }
            }
        }
    }

    @Override // defpackage.cgvs
    public List<cgvu> a() {
        return new ArrayList(this.a.values());
    }

    public cgvu b(String str) {
        return this.a.get(str);
    }
}
