package defpackage;

import java.lang.Enum;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bvit  reason: default package */
/* loaded from: classes.dex */
public final class bvit<T extends Enum<T>> implements bviw {
    private final Class<T> a;

    public bvit(Class<T> cls) {
        this.a = cls;
    }

    private final boolean c(String str) {
        try {
            Enum.valueOf(this.a, str);
            return true;
        } catch (ClassCastException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.bviw
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bviw
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (dbsj.d(str) || c(str)) {
                return str;
            }
            return null;
        }
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (dcft.k(set, dbst.d(String.class))) {
                for (String str2 : set) {
                    if (!c(str2) && !dbsj.d(str2)) {
                        return null;
                    }
                }
                return set;
            }
        }
        obj.getClass();
        return obj;
    }
}
