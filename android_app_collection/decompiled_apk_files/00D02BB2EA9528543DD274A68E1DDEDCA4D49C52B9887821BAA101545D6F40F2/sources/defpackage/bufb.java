package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: bufb  reason: default package */
/* loaded from: classes.dex */
public abstract class bufb {
    public abstract Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls);

    public abstract Set<Class<? extends dssj>> b();

    public final String toString() {
        dbsb b = dbsc.b(this);
        for (Class<? extends dssj> cls : b()) {
            String simpleName = cls.getSimpleName();
            Set<dyib<? extends dssj, ? extends dssj>> a = a(cls);
            StringBuilder sb = new StringBuilder("[");
            String str = "";
            for (dyib<? extends dssj, ? extends dssj> dyibVar : a) {
                sb.append(str);
                String str2 = dyibVar.b;
                sb.append(str2.substring(str2.lastIndexOf(46) + 1));
                str = ", ";
            }
            sb.append("]");
            b.b(simpleName, sb.toString());
        }
        return b.toString();
    }
}
