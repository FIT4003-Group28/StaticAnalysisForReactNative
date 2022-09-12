package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clku  reason: default package */
/* loaded from: classes5.dex */
public abstract class clku {
    public static clkt e() {
        cliy cliyVar = new cliy();
        cliyVar.c(0);
        cliyVar.a = "";
        cliyVar.b(-1);
        cliyVar.d(false);
        return cliyVar;
    }

    public static clku f(@dzsi String str) {
        clkt e = e();
        ((cliy) e).a = dbsj.e(str);
        return e.a();
    }

    public static clku g(int i, Map<String, List<String>> map, @dzsi String str) {
        clkt e = e();
        ((cliy) e).a = dbsj.e(str);
        boolean z = true;
        if (i != 408) {
            if (i == 413) {
                z = map.containsKey("Retry-After");
            } else if (i != 429) {
                if (i == 503) {
                    z = map.containsKey("Retry-After");
                } else if (i != 504) {
                    z = false;
                }
            }
        }
        e.d(z);
        e.b(i);
        e.c(i);
        return e.a();
    }

    public abstract int a();

    public abstract String b();

    public abstract int c();

    public abstract boolean d();
}
