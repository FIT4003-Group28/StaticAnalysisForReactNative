package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alry  reason: default package */
/* loaded from: classes.dex */
public final class alry implements amfq {
    public final amgj b;
    @dzsi
    private final akpq f;
    public final List<alro> a = dchl.a();
    @dzsi
    private bnva g = null;
    public int e = 1;
    public final AtomicInteger c = new AtomicInteger(1);
    public boolean d = false;

    public alry(amgj amgjVar, @dzsi akpq akpqVar) {
        this.b = amgjVar;
        this.f = akpqVar;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        final Bitmap h;
        akpq akpqVar;
        if (!amfuVar.a() || (h = amfuVar.h()) == null || (akpqVar = this.f) == null) {
            dcqe dcqeVar = alrz.a;
            return;
        }
        akpqVar.e(new Runnable(this, h) { // from class: alrx
            private final alry a;
            private final Bitmap b;

            {
                this.a = this;
                this.b = h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList;
                alry alryVar = this.a;
                Bitmap bitmap = this.b;
                synchronized (alryVar) {
                    alryVar.d(bnrh.a(bitmap));
                    arrayList = new ArrayList(alryVar.a.size());
                    arrayList.addAll(alryVar.a);
                    alryVar.a.clear();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((alro) arrayList.get(i)).a();
                }
            }
        });
        this.f.d();
    }

    public final void b() {
        if (this.d) {
            dcqe dcqeVar = alrz.a;
            bvoo.h("Attempted to add a reference to a destroyed TextureNode", new Object[0]);
        }
        this.c.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(amfi amfiVar, String str) {
        amfu h = amfiVar.h(str, "", null);
        if (!h.a() || h.h() == null) {
            this.g = null;
            this.e = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(bnrd bnrdVar) {
        this.e = 3;
        bnuw b = bnrdVar.b();
        String a = this.b.a();
        int i = 1;
        if (true == this.b.b().c) {
            i = 4;
        }
        bnva bnvaVar = new bnva(a, 2, i);
        this.g = bnvaVar;
        bnvaVar.b(new bntv(bnrdVar, b.a(), b.b(), b.a(), b.b(), this.b.b().c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized bnva e() {
        return this.g;
    }
}
