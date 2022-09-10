package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rkv  reason: default package */
/* loaded from: classes7.dex */
class rkv implements rka {
    public final domy a;
    final /* synthetic */ rkw b;
    private final String c;
    private final cqtd d;
    private final cjtd e;

    public rkv(rkw rkwVar, domy domyVar, String str, cqtd cqtdVar, cjtd cjtdVar) {
        this.b = rkwVar;
        this.a = domyVar;
        this.c = str;
        this.d = cqtdVar;
        this.e = cjtdVar;
    }

    @Override // defpackage.rka
    public cqtd a() {
        return cqrt.i(this.d, ibm.x());
    }

    @Override // defpackage.rka
    public String b() {
        return this.c;
    }

    @Override // defpackage.rka
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.rka
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: rku
            private final rkv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rkv rkvVar = this.a;
                rkw rkwVar = rkvVar.b;
                domy domyVar = rkvVar.a;
                if (domyVar.equals(domy.UNKNOWN_TRAVEL_MODE)) {
                    rkwVar.e.a().l();
                    return;
                }
                rkwVar.d.a().i(domyVar).Pk(new Runnable(rkwVar, domyVar) { // from class: rkt
                    private final rkw a;
                    private final domy b;

                    {
                        this.a = rkwVar;
                        this.b = domyVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        rkw rkwVar2 = this.a;
                        domy domyVar2 = this.b;
                        Activity activity = rkwVar2.a;
                        cjxu.i(activity, activity.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_CONFIRMATION_TOAST));
                        if (domyVar2.equals(domy.TRANSIT)) {
                            dktt dkttVar = rkwVar2.c.getPassiveAssistParameters().a().am;
                            if (dkttVar == null) {
                                dkttVar = dktt.z;
                            }
                            if (dkttVar.h) {
                                rkwVar2.e.a().k();
                            }
                        }
                        quz quzVar = rkwVar2.f;
                        if (quzVar != null) {
                            quzVar.a();
                        }
                        rkwVar2.h = true;
                        Runnable runnable = rkwVar2.g;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }, rkwVar.b);
            }
        };
    }
}
