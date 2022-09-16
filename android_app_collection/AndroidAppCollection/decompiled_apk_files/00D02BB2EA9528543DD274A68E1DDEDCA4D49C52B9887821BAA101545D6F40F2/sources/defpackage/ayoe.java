package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayoe  reason: default package */
/* loaded from: classes3.dex */
public final class ayoe implements degu<baad> {
    final /* synthetic */ baad a;
    final /* synthetic */ ayoi b;

    public ayoe(ayoi ayoiVar, baad baadVar) {
        this.b = ayoiVar;
        this.a = baadVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = ayoi.r;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        ayoi ayoiVar = this.b;
        ayfk ayfkVar = ayoiVar.m;
        if (ayfkVar != null) {
            ayfkVar.d.n(ayoiVar.n.a());
        }
        batm batmVar = this.b.g;
        final baad baadVar2 = this.a;
        batmVar.a(new Runnable(this, baadVar2) { // from class: ayoc
            private final ayoe a;
            private final baad b;

            {
                this.a = this;
                this.b = baadVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ayoe ayoeVar = this.a;
                final baad baadVar3 = this.b;
                cztq a = cztt.a(ayoeVar.b.f);
                ayoi ayoiVar2 = ayoeVar.b;
                a.c = ayoiVar2.c.getString(R.string.REMOVED_FROM_LIST, new Object[]{ayoiVar2.h});
                a.f(ayoeVar.b.c.getString(R.string.UNDO), new View.OnClickListener(ayoeVar, baadVar3) { // from class: ayod
                    private final ayoe a;
                    private final baad b;

                    {
                        this.a = ayoeVar;
                        this.b = baadVar3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ayoe ayoeVar2 = this.a;
                        baad baadVar4 = this.b;
                        baadVar4.c(ayoeVar2.b.n);
                        ayoeVar2.b.e.j(baadVar4);
                    }
                });
                a.d(cztr.LONG);
                a.c();
            }
        });
    }
}
