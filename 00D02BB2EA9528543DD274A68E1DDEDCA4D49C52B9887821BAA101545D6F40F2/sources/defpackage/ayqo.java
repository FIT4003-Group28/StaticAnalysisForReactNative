package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayqo  reason: default package */
/* loaded from: classes3.dex */
public final class ayqo implements bwrr<ilo> {
    final /* synthetic */ ilo a;
    final /* synthetic */ bwrs b;
    final /* synthetic */ ayqp c;

    public ayqo(ayqp ayqpVar, ilo iloVar, bwrs bwrsVar) {
        this.c = ayqpVar;
        this.a = iloVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ayqp ayqpVar = this.c;
        if (!ayqpVar.a.aZ) {
            return;
        }
        batm batmVar = ayqpVar.e;
        final ilo iloVar2 = this.a;
        batmVar.a(new Runnable(this, iloVar2) { // from class: ayqm
            private final ayqo a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ayqo ayqoVar = this.a;
                final ilo iloVar3 = this.b;
                cztq a = cztt.a(ayqoVar.c.d);
                ayqp ayqpVar2 = ayqoVar.c;
                a.c = ayqpVar2.a.getString(R.string.REMOVED_FROM_LIST, new Object[]{ayqpVar2.f});
                a.f(ayqoVar.c.a.getString(R.string.UNDO), new View.OnClickListener(ayqoVar, iloVar3) { // from class: ayqn
                    private final ayqo a;
                    private final ilo b;

                    {
                        this.a = ayqoVar;
                        this.b = iloVar3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ayqo ayqoVar2 = this.a;
                        ilo iloVar4 = this.b;
                        axwy axwyVar = ayqoVar2.c.c;
                        ily g = iloVar4.g();
                        g.C(false);
                        axwyVar.f(bwrs.a(g.d()));
                    }
                });
                a.d(cztr.LONG);
                a.c();
            }
        });
        bwqv.t(this.b, this);
    }
}
