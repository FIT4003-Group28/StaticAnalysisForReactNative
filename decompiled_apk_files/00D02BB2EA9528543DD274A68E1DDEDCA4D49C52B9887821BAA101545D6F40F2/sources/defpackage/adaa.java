package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adaa  reason: default package */
/* loaded from: classes.dex */
public final class adaa {
    public static List<adab<?>> a(List<aczy<? extends aczr>> list) {
        ArrayList arrayList = new ArrayList();
        for (aczy<? extends aczr> aczyVar : list) {
            if (aczyVar instanceof adab) {
                arrayList.add((adab) aczyVar);
            }
        }
        return arrayList;
    }

    public static Set<awvv<?>> b(List<dxio<? extends aczy<? extends aczr>>> list) {
        aih aihVar = new aih();
        for (adab<?> adabVar : a(dchl.k(list, aczz.a))) {
            aihVar.addAll(adabVar.g());
            aihVar.addAll(adabVar.h());
        }
        return aihVar;
    }
}
