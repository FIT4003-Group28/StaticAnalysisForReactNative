package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayes  reason: default package */
/* loaded from: classes3.dex */
final class ayes {
    public static List<akqq> a(akqq akqqVar, List<akqq> list) {
        ArrayList arrayList = new ArrayList();
        for (akqq akqqVar2 : list) {
            double d = akqo.d(akqqVar2, akqqVar);
            if (!akqqVar.equals(akqqVar2) && d <= 2.0d) {
                arrayList.add(akqqVar2);
            }
        }
        return arrayList;
    }
}
