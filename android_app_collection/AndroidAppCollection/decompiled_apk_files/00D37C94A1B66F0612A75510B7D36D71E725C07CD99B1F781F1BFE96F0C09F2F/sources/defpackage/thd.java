package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: thd  reason: default package */
/* loaded from: classes4.dex */
public final class thd implements tcn {
    public final thu a;
    public final Executor b;
    public final String c;
    public final ajiy d;

    public thd(thu thuVar, Executor executor, ajiy ajiyVar) {
        this.a = thuVar;
        this.b = executor;
        String b = thuVar.b();
        this.c = b;
        this.d = ajiyVar;
        thuVar.d(b);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jj jjVar = (jj) it.next();
            if (jjVar.a != null && jjVar.b != null) {
                thn a = thr.a();
                a.b(thq.NATIVE_LIBRARY_CHECK.m);
                a.c = Long.valueOf(((Long) jjVar.b).longValue() / 1000);
                tho a2 = thp.a();
                a2.c(amyg.a);
                a2.a = (String) jjVar.a;
                a2.h = new akvy(false, 0L);
                a.e = a2.a();
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
