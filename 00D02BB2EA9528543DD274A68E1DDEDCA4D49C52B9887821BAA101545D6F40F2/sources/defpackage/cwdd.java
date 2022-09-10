package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cwdd  reason: default package */
/* loaded from: classes.dex */
public class cwdd {
    public final CopyOnWriteArrayList<cvzo> a = new CopyOnWriteArrayList<>();
    public boolean b;

    public void b() {
        czhz.b();
    }

    public void c() {
        czhz.b();
    }

    public final void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            Iterator<cvzo> it = this.a.iterator();
            while (it.hasNext()) {
                cvzo next = it.next();
                final boolean z2 = this.b;
                final cvzt cvztVar = next.a;
                final cvzs cvzsVar = next.b;
                cwjf.a(new Runnable(cvztVar, cvzsVar, z2) { // from class: cvzq
                    private final cvzt a;
                    private final cvzs b;
                    private final boolean c;

                    {
                        this.a = cvztVar;
                        this.b = cvzsVar;
                        this.c = z2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cvzt cvztVar2 = this.a;
                        cvzs cvzsVar2 = this.b;
                        boolean z3 = this.c;
                        int indexOf = cvztVar2.a.indexOf(cvzsVar2);
                        if (z3) {
                            cvztVar2.e.c(Integer.valueOf(indexOf));
                        } else {
                            cvztVar2.e.e(Integer.valueOf(indexOf));
                        }
                    }
                });
            }
        }
    }
}
