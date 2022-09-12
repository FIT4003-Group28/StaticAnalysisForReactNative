package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bloi  reason: default package */
/* loaded from: classes3.dex */
public final class bloi implements blij {
    final /* synthetic */ blik a;
    public final /* synthetic */ blon b;

    public bloi(blon blonVar, blik blikVar) {
        this.b = blonVar;
        this.a = blikVar;
    }

    @Override // defpackage.blij
    public final void a(RecyclerView recyclerView, int i) {
        this.a.b(recyclerView, 0, i);
        recyclerView.post(new Runnable(this) { // from class: blog
            private final bloi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bksv bksvVar = this.a.b.c;
                dbsk.s(bksvVar);
                bksvVar.A();
            }
        });
    }

    @Override // defpackage.blij
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.a.b(recyclerView, i, i2);
        recyclerView.post(new Runnable(this) { // from class: bloh
            private final bloi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bksv bksvVar = this.a.b.c;
                dbsk.s(bksvVar);
                bksvVar.A();
            }
        });
    }

    @Override // defpackage.blij
    public final void c(RecyclerView recyclerView, int i) {
        recyclerView.scrollBy(0, i);
    }
}
