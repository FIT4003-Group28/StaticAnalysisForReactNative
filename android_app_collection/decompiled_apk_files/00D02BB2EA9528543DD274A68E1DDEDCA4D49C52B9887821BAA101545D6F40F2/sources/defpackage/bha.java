package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: bha  reason: default package */
/* loaded from: classes3.dex */
public abstract class bha implements Runnable {
    public final bcu d = new bcu();

    public static bha b(String str, bdn bdnVar, boolean z) {
        return new bgz(bdnVar, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(bdn bdnVar, String str) {
        WorkDatabase workDatabase = bdnVar.c;
        bgi t = workDatabase.t();
        bfq u = workDatabase.u();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int o = t.o(str2);
            if (o != 3 && o != 4) {
                t.u(6, str2);
            }
            linkedList.addAll(u.a(str2));
        }
        bcw bcwVar = bdnVar.e;
        synchronized (bcwVar.d) {
            bbz.e().a(new Throwable[0]);
            bcwVar.c.add(str);
            bdr remove = bcwVar.a.remove(str);
            bcw.g(remove == null ? bcwVar.b.remove(str) : remove);
            if (remove != null) {
                bcwVar.f();
            }
        }
        for (bcx bcxVar : bdnVar.d) {
            bcxVar.c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(bdn bdnVar) {
        bcy.a(bdnVar.b, bdnVar.c, bdnVar.d);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
            this.d.b(bcg.a);
        } catch (Throwable th) {
            this.d.b(new bcc(th));
        }
    }
}
