package defpackage;

import android.content.Context;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bsp  reason: default package */
/* loaded from: classes2.dex */
public final class bsp implements bss {
    public final bso a;
    public final Object b;
    private final bst[] c;

    static {
        bqf.b("WorkConstraintsTracker");
    }

    public bsp(Context context, bwn bwnVar, bso bsoVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = bsoVar;
        this.c = new bst[]{new bsq(applicationContext, bwnVar), new bsr(applicationContext, bwnVar), new bsy(applicationContext, bwnVar), new bsu(applicationContext, bwnVar), new bsx(applicationContext, bwnVar), new bsw(applicationContext, bwnVar), new bsv(applicationContext, bwnVar)};
        this.b = new Object();
    }

    public final void a(Iterable iterable) {
        synchronized (this.b) {
            bst[] bstVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                bstVarArr[i].d(null);
            }
            bst[] bstVarArr2 = this.c;
            for (int i2 = 0; i2 < 7; i2++) {
                bst bstVar = bstVarArr2[i2];
                bstVar.a.clear();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    bum bumVar = (bum) it.next();
                    if (bstVar.b(bumVar)) {
                        bstVar.a.add(bumVar.c);
                    }
                }
                if (bstVar.a.isEmpty()) {
                    bstVar.c.f(bstVar);
                } else {
                    bte bteVar = bstVar.c;
                    synchronized (bteVar.b) {
                        if (bteVar.c.add(bstVar)) {
                            if (bteVar.c.size() == 1) {
                                bteVar.d = bteVar.b();
                                bqf a = bqf.a();
                                String.format("%s: initial state = %s", bteVar.getClass().getSimpleName(), bteVar.d);
                                a.d(new Throwable[0]);
                                bteVar.d();
                            }
                            bstVar.a(bteVar.d);
                        }
                    }
                }
                bstVar.e(bstVar.d, bstVar.b);
            }
            bst[] bstVarArr3 = this.c;
            for (int i3 = 0; i3 < 7; i3++) {
                bstVarArr3[i3].d(this);
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            bst[] bstVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                bst bstVar = bstVarArr[i];
                if (!bstVar.a.isEmpty()) {
                    bstVar.a.clear();
                    bstVar.c.f(bstVar);
                }
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this.b) {
            bst[] bstVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                bst bstVar = bstVarArr[i];
                Object obj = bstVar.b;
                if (obj != null && bstVar.c(obj) && bstVar.a.contains(str)) {
                    bqf a = bqf.a();
                    String.format("Work %s constrained by %s", str, bstVar.getClass().getSimpleName());
                    a.d(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
