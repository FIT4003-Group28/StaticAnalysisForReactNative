package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aafn {
    public static final /* synthetic */ int a = 0;

    static {
        aafo aafoVar = aafo.j;
    }

    public static void a(aafo aafoVar, apzg apzgVar) {
        aafoVar.c(apzgVar, amyc.b);
    }

    public static void b(aafo aafoVar, List list) {
        aafoVar.d(list, amyc.b);
    }

    @Deprecated
    public static void c(aafo aafoVar, List list, Map map) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aafoVar.c((apzg) it.next(), map);
        }
    }

    @Deprecated
    public static void d(aafo aafoVar, List list, Object obj) {
        aafoVar.d(list, obj != null ? amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : amyc.b);
    }
}
