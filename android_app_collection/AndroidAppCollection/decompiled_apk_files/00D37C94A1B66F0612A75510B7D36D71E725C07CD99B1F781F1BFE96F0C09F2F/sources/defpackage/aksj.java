package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aksj  reason: default package */
/* loaded from: classes.dex */
public final class aksj {
    public final akst a;
    public final azpa b = azpa.ar();
    public final Executor c;
    public ankt d;
    private final Executor e;

    public aksj(akst akstVar, Executor executor, Executor executor2) {
        this.a = akstVar;
        this.c = executor;
        this.e = executor2;
    }

    public final ayoi a() {
        return this.b.A().W();
    }

    public final void b() {
        ankt anktVar = this.d;
        if (anktVar == null || anktVar.isCancelled() || this.d.isDone()) {
            return;
        }
        this.d.cancel(true);
    }

    public final void c(final String str) {
        this.e.execute(new Runnable() { // from class: aksi
            @Override // java.lang.Runnable
            public final void run() {
                final aksj aksjVar = aksj.this;
                String str2 = str;
                ankt anktVar = aksjVar.d;
                if (anktVar != null && !anktVar.isCancelled() && !aksjVar.d.isDone()) {
                    aksjVar.d.cancel(true);
                }
                akst akstVar = aksjVar.a;
                final ArrayList arrayList = new ArrayList();
                aksr aksrVar = (aksr) akstVar;
                for (aksg aksgVar : aksrVar.b) {
                    arrayList.add(aksgVar.a(str2));
                }
                aksjVar.d = anii.i(anlz.j(arrayList).a(new Callable() { // from class: akso
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            aksu aksuVar = (aksu) anlz.y((ankt) arrayList2.get(i));
                            i++;
                            if (aksuVar != null) {
                                return aksuVar;
                            }
                        }
                        return null;
                    }
                }, aksrVar.a), new aksp(aksrVar, str2), aksrVar.a);
                ylx.k(aksjVar.d, aksjVar.c, new aiuv(7), new ylw() { // from class: aksh
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        aksj aksjVar2 = aksj.this;
                        aksjVar2.b.c((aksu) obj);
                        aksjVar2.d = null;
                    }
                });
            }
        });
    }
}
