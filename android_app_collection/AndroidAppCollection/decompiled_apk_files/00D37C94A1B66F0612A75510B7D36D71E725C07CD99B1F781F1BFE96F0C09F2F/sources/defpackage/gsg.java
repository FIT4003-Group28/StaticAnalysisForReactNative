package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: gsg  reason: default package */
/* loaded from: classes3.dex */
public class gsg extends LiveCreationActivity {
    private boolean a = false;

    public gsg() {
        addOnContextAvailableListener(new gsf(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acgh
    public final void f() {
        if (!this.a) {
            this.a = true;
            MainLiveCreationActivity mainLiveCreationActivity = (MainLiveCreationActivity) this;
            dwq dwqVar = (dwq) lI();
            mainLiveCreationActivity.f = (Handler) dwqVar.a.an.get();
            mainLiveCreationActivity.g = (Executor) dwqVar.a.h.get();
            mainLiveCreationActivity.h = (yni) dwqVar.a.y.get();
            mainLiveCreationActivity.i = (achh) dwqVar.kb();
            mainLiveCreationActivity.j = (achd) dwqVar.hT.get();
            mainLiveCreationActivity.k = (afvn) dwqVar.a.au.get();
            mainLiveCreationActivity.l = (afwc) dwqVar.a.vo.get();
            mainLiveCreationActivity.m = (acti) dwqVar.je.get();
            mainLiveCreationActivity.n = (vxc) dwqVar.jf.get();
            mainLiveCreationActivity.o = (vxk) dwqVar.ga.get();
            mainLiveCreationActivity.p = (wal) dwqVar.a.au.get();
            achj.c(mainLiveCreationActivity, dwqVar.jg.get());
            mainLiveCreationActivity.q = (abzn) dwqVar.ht.get();
            mainLiveCreationActivity.r = (snc) dwqVar.a.v.get();
            mainLiveCreationActivity.s = acsv.b();
            mainLiveCreationActivity.t = dwqVar.i();
            mainLiveCreationActivity.u = dwqVar.hz();
            mainLiveCreationActivity.v = (aazu) dwqVar.a.wn.get();
            mainLiveCreationActivity.w = (ScheduledExecutorService) dwqVar.a.h.get();
            mainLiveCreationActivity.x = (acrr) dwqVar.a.aw.get();
            mainLiveCreationActivity.z = axot.a(dwqVar.jj);
            mainLiveCreationActivity.A = dwqVar.gw();
            acly aclyVar = (acly) dwqVar.a.yO.get();
            mainLiveCreationActivity.B = (akys) dwqVar.a.mY.get();
            dwqVar.hD();
            mainLiveCreationActivity.C = (SharedPreferences) dwqVar.a.t.get();
            mainLiveCreationActivity.D = (akdr) dwqVar.a.yY.get();
            wig wigVar = (wig) dwqVar.a.xc.get();
            mainLiveCreationActivity.Y = new akdy();
            mainLiveCreationActivity.E = (acgf) dwqVar.a.a.F.get();
            mainLiveCreationActivity.aa = (vne) dwqVar.a.a.E.get();
            aacz aaczVar = (aacz) dwqVar.a.D.get();
            mainLiveCreationActivity.ar((vxk) dwqVar.ga.get());
            mainLiveCreationActivity.a = dwqVar.aB();
            mainLiveCreationActivity.b = (akge) dwqVar.af.get();
        }
    }
}
