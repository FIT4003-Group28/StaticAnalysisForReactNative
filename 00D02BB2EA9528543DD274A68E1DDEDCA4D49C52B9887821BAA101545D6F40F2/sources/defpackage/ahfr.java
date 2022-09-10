package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahfr  reason: default package */
/* loaded from: classes2.dex */
final class ahfr implements degu<djzy> {
    final /* synthetic */ cjqp a;
    final /* synthetic */ ahfs b;

    public ahfr(ahfs ahfsVar, cjqp cjqpVar) {
        this.b = ahfsVar;
        this.a = cjqpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ahfs ahfsVar = this.b;
        this.a.d(cjtd.a(dtxu.bJ));
        ckos.b(ahfsVar.a.findViewById(16908290), R.string.LOCALSTREAM_PREFERENCE_SNACKBAR_SAVE_FAILED, 0).c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djzy djzyVar) {
        ahfs ahfsVar = this.b;
        ahfsVar.d.a(ahfsVar);
        final ahfs ahfsVar2 = this.b;
        cjqp cjqpVar = this.a;
        final cjtd a = cjtd.a(dtxu.bK);
        final cjql d = cjqpVar.d(a);
        dafk b = ckos.b(ahfsVar2.a.findViewById(16908290), R.string.LOCALSTREAM_PREFERENCE_SNACKBAR_SAVED, 0);
        b.t(R.string.LOCALSTREAM_PREFERENCE_SNACKBAR_OPEN_MANAGEMENT_PAGE, new View.OnClickListener(ahfsVar2, d, a) { // from class: ahfq
            private final ahfs a;
            private final cjql b;
            private final cjtd c;

            {
                this.a = ahfsVar2;
                this.b = d;
                this.c = a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahfs ahfsVar3 = this.a;
                ahfsVar3.c.j(this.b, this.c);
                ahfsVar3.b.a().B();
            }
        });
        b.c();
    }
}
