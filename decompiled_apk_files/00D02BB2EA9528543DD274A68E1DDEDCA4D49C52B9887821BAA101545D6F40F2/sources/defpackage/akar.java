package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akar  reason: default package */
/* loaded from: classes2.dex */
public final class akar implements akag {
    final /* synthetic */ akas a;

    public akar(akas akasVar) {
        this.a = akasVar;
    }

    @Override // defpackage.akag
    public final void a(final btlu btluVar) {
        this.a.i.execute(new Runnable(this, btluVar) { // from class: akaq
            private final akar a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dbsk.s(this.b);
                akas.a();
            }
        });
    }

    @Override // defpackage.akag
    public final void b() {
        if (this.a.c.D().k()) {
            this.a.i.execute(new Runnable(this) { // from class: akap
                private final akar a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    List<btlu> l = this.a.a.c.D().l();
                    dbsk.s(l);
                    akas.b(l);
                }
            });
        }
    }
}
