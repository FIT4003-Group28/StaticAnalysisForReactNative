package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cevx  reason: default package */
/* loaded from: classes4.dex */
final class cevx implements crzp<dqaw> {
    final /* synthetic */ cewc a;

    public cevx(cewc cewcVar) {
        this.a = cewcVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dqaw> crzmVar) {
        dqaw l = crzmVar.l();
        if (l != null) {
            dfqe b = dfqe.b(l.b);
            if (b == null) {
                b = dfqe.UNDEFINED_STATE;
            }
            if (b.equals(dfqe.UNDEFINED_STATE)) {
                return;
            }
            cewc cewcVar = this.a;
            dfqe dfqeVar = cewcVar.t;
            dfqe b2 = dfqe.b(l.b);
            if (b2 == null) {
                b2 = dfqe.UNDEFINED_STATE;
            }
            cewcVar.t = b2;
            if (dfqeVar.equals(dfqe.UNDEFINED_STATE)) {
                return;
            }
            dfqe dfqeVar2 = this.a.t;
            if ((dfqeVar2.equals(dfqe.FOLLOWING_PRIVATELY) && !axmq.a(dfqeVar)) || (dfqeVar.equals(dfqe.FOLLOWING_PRIVATELY) && !axmq.a(dfqeVar2))) {
                this.a.u();
            }
            if (!dfqeVar.equals(dfqe.NOT_FOLLOWING)) {
                return;
            }
            if (this.a.t.equals(dfqe.FOLLOWING_PUBLICLY)) {
                final cewc cewcVar2 = this.a;
                if (cewcVar2.d.f() && cewcVar2.p != null) {
                    dafk a = ckos.a(cewcVar2.a.findViewById(16908290), cewcVar2.a.getString(R.string.REFRESH_STREAM_TOAST_MESSAGE, new Object[]{cewcVar2.g.d()}), 0);
                    a.t(R.string.REFRESH_STREAM_TOAST_BROWSE_ACTION_TEXT, new View.OnClickListener(cewcVar2) { // from class: cevu
                        private final cewc a;

                        {
                            this.a = cewcVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cewc cewcVar3 = this.a;
                            if (cewcVar3.m.a()) {
                                cjot cjotVar = cewcVar3.l;
                                String str = cewcVar3.p;
                                dbsk.s(str);
                                cjotVar.d(dcdc.f(str));
                                return;
                            }
                            afzv afzvVar = cewcVar3.e;
                            String str2 = cewcVar3.p;
                            dbsk.s(str2);
                            afzvVar.o(dcdc.f(str2));
                        }
                    });
                    a.c();
                }
            }
            dfqe dfqeVar3 = this.a.t;
            if (!axmq.a(dfqeVar3) && !dfqeVar3.equals(dfqe.REQUESTED)) {
                return;
            }
            this.a.g.z();
        }
    }
}
