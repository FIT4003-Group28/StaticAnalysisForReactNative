package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajqz  reason: default package */
/* loaded from: classes2.dex */
public final class ajqz {
    public final Executor a;
    public final ajri b;
    private final bvrb c;

    public ajqz(Executor executor, bvrb bvrbVar, ajri ajriVar) {
        this.a = executor;
        this.c = bvrbVar;
        this.b = ajriVar;
    }

    public final dehn<Void> a(final btlu btluVar, final Activity activity, final cqkj cqkjVar) {
        dbsk.m(true, "Appropriate flags not enabled");
        final deig d = deig.d();
        this.c.b(new Runnable(this, d, btluVar, activity, cqkjVar) { // from class: ajqt
            private final ajqz a;
            private final deig b;
            private final btlu c;
            private final Activity d;
            private final cqkj e;

            {
                this.a = this;
                this.b = d;
                this.c = btluVar;
                this.d = activity;
                this.e = cqkjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajqz ajqzVar = this.a;
                final deig deigVar = this.b;
                final btlu btluVar2 = this.c;
                Activity activity2 = this.d;
                cqkj cqkjVar2 = this.e;
                final Runnable runnable = new Runnable(ajqzVar, deigVar, btluVar2) { // from class: ajqu
                    private final ajqz a;
                    private final deig b;
                    private final btlu c;

                    {
                        this.a = ajqzVar;
                        this.b = deigVar;
                        this.c = btluVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajqz ajqzVar2 = this.a;
                        deig deigVar2 = this.b;
                        final btlu btluVar3 = this.c;
                        final ajri ajriVar = ajqzVar2.b;
                        dita bZ = ditc.c.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ditc ditcVar = (ditc) bZ.b;
                        ditcVar.b = 1;
                        ditcVar.a |= 4;
                        final deig d2 = deig.d();
                        ajriVar.b.a().e = btluVar3;
                        ajriVar.b.c().b(bZ.bK(), new ajrg(ajriVar, 2, btluVar3, d2), ajriVar.d.h());
                        d2.Pk(new Runnable(ajriVar, d2, btluVar3) { // from class: ajre
                            private final ajri a;
                            private final dehn b;
                            private final btlu c;

                            {
                                this.a = ajriVar;
                                this.b = d2;
                                this.c = btluVar3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ajri ajriVar2 = this.a;
                                dehn dehnVar = this.b;
                                ajriVar2.f.add(new ajqd(this.c, ajriVar2.e.b(), dehnVar.isCancelled() ? 2 : ((Integer) deha.s(dehnVar)).intValue()));
                            }
                        }, ajriVar.d.h());
                        deigVar2.p(deew.g(degp.q(d2), ajqy.a, ajqzVar2.a));
                    }
                };
                iii iiiVar = new iii();
                iiiVar.b = activity2.getString(R.string.LH_NOT_NEEDED_SHORT_EXPLANATORY_TEXT);
                iiiVar.d(activity2.getString(17039370), new View.OnClickListener(runnable) { // from class: ajqv
                    private final Runnable a;

                    {
                        this.a = runnable;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.run();
                    }
                }, cjtd.a(dtxu.df));
                iiiVar.c(activity2.getString(R.string.LH_NOT_NEEDED_CANCEL_BUTTON), new View.OnClickListener(deigVar) { // from class: ajqw
                    private final deig a;

                    {
                        this.a = deigVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.p(deha.b(new ahwp()));
                    }
                }, cjtd.a(dtxu.de));
                iiiVar.c = new DialogInterface.OnCancelListener(deigVar) { // from class: ajqx
                    private final deig a;

                    {
                        this.a = deigVar;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.a.p(deha.b(new ahwp()));
                    }
                };
                iiiVar.a(activity2, cqkjVar2).k();
            }
        }, bvrj.UI_THREAD);
        return d;
    }
}
