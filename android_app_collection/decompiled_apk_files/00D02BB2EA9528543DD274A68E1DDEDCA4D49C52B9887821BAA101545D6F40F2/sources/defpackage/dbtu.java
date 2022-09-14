package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dbtu  reason: default package */
/* loaded from: classes.dex */
final class dbtu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dbtv a(Set set) {
        return new dbtv(set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(dbtv dbtvVar, Set set) {
        for (Integer num : dbtvVar.b) {
            set.add(Integer.valueOf(num.intValue()));
        }
    }
}
