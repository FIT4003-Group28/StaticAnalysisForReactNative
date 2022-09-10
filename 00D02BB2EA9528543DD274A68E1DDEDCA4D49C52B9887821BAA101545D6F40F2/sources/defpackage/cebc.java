package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cebc  reason: default package */
/* loaded from: classes4.dex */
public final class cebc {
    private static final dcqe a = dcqe.c("cebc");
    private final View b;
    private final cjqy c;
    private final itg d;

    public cebc(View view, cjqy cjqyVar, itg itgVar) {
        this.b = view;
        this.c = cjqyVar;
        this.d = itgVar;
    }

    public final void a(Runnable runnable) {
        cjql e = cjqg.e(this.b);
        cjtd k = cjqg.k(this.b);
        if (e == null || k == null) {
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Boolean.valueOf(e != null);
            if (k != null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            bvoo.h("Could not log click. [i:%b] [p:%b]", objArr);
            return;
        }
        runnable.run();
        this.c.j(e, k);
    }

    public final void b(final Runnable runnable) {
        this.b.setOnClickListener(new View.OnClickListener(this, runnable) { // from class: cebb
            private final cebc a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a(this.b);
            }
        });
    }

    public final void c(cjtd cjtdVar) {
        cjqg.h(this.b, cjtdVar);
        this.d.a(this.b);
    }

    public final void d(ddho ddhoVar, ilo iloVar) {
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        c(c.a());
    }
}
