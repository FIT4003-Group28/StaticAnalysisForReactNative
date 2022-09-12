package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cyxv  reason: default package */
/* loaded from: classes5.dex */
public final class cyxv {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/util/Set<TT;>;Ljava/util/Set<TT;>;)Lcyxv; */
    public static int a(Set set, Set set2) {
        Set set3 = set.size() >= set2.size() ? set : set2;
        if (set.size() < set2.size()) {
            set2 = set;
        }
        if (!set3.containsAll(set2)) {
            return 1;
        }
        if (set2.size() == set3.size()) {
            return 3;
        }
        return set3 == set ? 4 : 2;
    }
}
