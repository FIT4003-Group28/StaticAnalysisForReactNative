package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bst  reason: default package */
/* loaded from: classes2.dex */
public abstract class bst implements bsm {
    public final List a = new ArrayList();
    public Object b;
    public final bte c;
    public bss d;

    public bst(bte bteVar) {
        this.c = bteVar;
    }

    @Override // defpackage.bsm
    public final void a(Object obj) {
        this.b = obj;
        e(this.d, obj);
    }

    public abstract boolean b(bum bumVar);

    public abstract boolean c(Object obj);

    public final void d(bss bssVar) {
        if (this.d != bssVar) {
            this.d = bssVar;
            e(bssVar, this.b);
        }
    }

    public final void e(bss bssVar, Object obj) {
        if (this.a.isEmpty() || bssVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            List list = this.a;
            synchronized (((bsp) bssVar).b) {
                bso bsoVar = ((bsp) bssVar).a;
                if (bsoVar != null) {
                    bsoVar.f(list);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        synchronized (((bsp) bssVar).b) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (((bsp) bssVar).c(str)) {
                    bqf a = bqf.a();
                    String.format("Constraints met for %s", str);
                    a.d(new Throwable[0]);
                    arrayList.add(str);
                }
            }
            bso bsoVar2 = ((bsp) bssVar).a;
            if (bsoVar2 != null) {
                bsoVar2.e(arrayList);
            }
        }
    }
}
