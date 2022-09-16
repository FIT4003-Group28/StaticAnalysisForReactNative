package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: bve  reason: default package */
/* loaded from: classes2.dex */
public abstract class bve implements Runnable {
    public final bqw d = new bqw();

    public static bve b(String str, brq brqVar, boolean z) {
        return new bvd(brqVar, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(brq brqVar, String str) {
        WorkDatabase workDatabase = brqVar.d;
        bun n = workDatabase.n();
        btt p = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int h = n.h(str2);
            if (h != 3 && h != 4) {
                n.k(6, str2);
            }
            linkedList.addAll(p.a(str2));
        }
        bqy bqyVar = brqVar.f;
        synchronized (bqyVar.g) {
            bqf a = bqf.a();
            String.format("Processor cancelling %s", str);
            a.d(new Throwable[0]);
            bqyVar.f.add(str);
            bru bruVar = (bru) bqyVar.d.remove(str);
            bqy.e(str, bruVar == null ? (bru) bqyVar.e.remove(str) : bruVar);
            if (bruVar != null) {
                bqyVar.d();
            }
        }
        for (bqz bqzVar : brqVar.e) {
            bqzVar.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(brq brqVar) {
        bra.b(brqVar.d, brqVar.e);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
            this.d.a(bqk.a);
        } catch (Throwable th) {
            this.d.a(new bqh(th));
        }
    }
}
