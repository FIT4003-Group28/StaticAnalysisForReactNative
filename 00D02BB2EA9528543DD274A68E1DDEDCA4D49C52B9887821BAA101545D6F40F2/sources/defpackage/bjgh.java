package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjgh  reason: default package */
/* loaded from: classes3.dex */
public final class bjgh {
    public final gdc a;
    private final dvxb b;
    private final cjtd c;

    public bjgh(gdc gdcVar, ilo iloVar) {
        this.a = gdcVar;
        dvxb dvxbVar = iloVar.h().V;
        this.b = dvxbVar == null ? dvxb.d : dvxbVar;
        this.c = iloVar.bZ();
    }

    public final cjtd a(ddho ddhoVar) {
        cjta c = cjtd.c(this.c);
        c.d = ddhoVar;
        dvxb dvxbVar = this.b;
        if ((dvxbVar.a & 2) != 0) {
            c.g(dvxbVar.c);
        }
        dvxb dvxbVar2 = this.b;
        if ((dvxbVar2.a & 1) != 0) {
            c.b = dvxbVar2.b;
        }
        return c.a();
    }

    public final void b(Runnable runnable) {
        c(runnable, bjgc.a);
    }

    public final void c(final Runnable runnable, final Runnable runnable2) {
        gcz a = this.a.a();
        a.j();
        a.i = a(dtxy.fW);
        a.d(R.string.PLACE_QA_ERROR_MESSAGE_GENERIC);
        a.h(R.string.GENERIC_TRY_AGAIN_BUTTON, a(dtxy.fY), new gdd(runnable) { // from class: bjgd
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        a.e(R.string.CANCEL_BUTTON, a(dtxy.fX), new gdd(runnable2) { // from class: bjge
            private final Runnable a;

            {
                this.a = runnable2;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        a.g(new gdd(runnable2) { // from class: bjgf
            private final Runnable a;

            {
                this.a = runnable2;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        a.b();
    }
}
