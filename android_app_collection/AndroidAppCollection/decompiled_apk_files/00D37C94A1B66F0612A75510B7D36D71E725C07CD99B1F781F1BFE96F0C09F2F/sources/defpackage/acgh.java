package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: acgh  reason: default package */
/* loaded from: classes.dex */
public class acgh extends oa implements axoo {
    private volatile axnv a;
    private final Object b = new Object();
    private boolean c = false;

    public acgh() {
        addOnContextAvailableListener(new acgg(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (!this.c) {
            this.c = true;
            LiveCreationActivity liveCreationActivity = (LiveCreationActivity) this;
            dwq dwqVar = (dwq) lI();
            liveCreationActivity.f = (Handler) dwqVar.a.an.get();
            liveCreationActivity.g = (Executor) dwqVar.a.h.get();
            liveCreationActivity.h = (yni) dwqVar.a.y.get();
            liveCreationActivity.i = (achh) dwqVar.kb();
            liveCreationActivity.j = (achd) dwqVar.hT.get();
            liveCreationActivity.k = (afvn) dwqVar.a.au.get();
            liveCreationActivity.l = (afwc) dwqVar.a.vo.get();
            liveCreationActivity.m = (acti) dwqVar.je.get();
            liveCreationActivity.n = (vxc) dwqVar.jf.get();
            liveCreationActivity.o = (vxk) dwqVar.ga.get();
            liveCreationActivity.p = (wal) dwqVar.a.au.get();
            achj.c(liveCreationActivity, dwqVar.jg.get());
            liveCreationActivity.q = (abzn) dwqVar.ht.get();
            liveCreationActivity.r = (snc) dwqVar.a.v.get();
            liveCreationActivity.s = acsv.b();
            liveCreationActivity.t = dwqVar.i();
            liveCreationActivity.u = dwqVar.hz();
            liveCreationActivity.v = (aazu) dwqVar.a.wn.get();
            liveCreationActivity.w = (ScheduledExecutorService) dwqVar.a.h.get();
            liveCreationActivity.x = (acrr) dwqVar.a.aw.get();
            liveCreationActivity.z = axot.a(dwqVar.jj);
            liveCreationActivity.A = dwqVar.gw();
            acly aclyVar = (acly) dwqVar.a.yO.get();
            liveCreationActivity.B = (akys) dwqVar.a.mY.get();
            dwqVar.hD();
            liveCreationActivity.C = (SharedPreferences) dwqVar.a.t.get();
            liveCreationActivity.D = (akdr) dwqVar.a.yY.get();
            wig wigVar = (wig) dwqVar.a.xc.get();
            liveCreationActivity.Y = new akdy();
            liveCreationActivity.E = (acgf) dwqVar.a.a.F.get();
            liveCreationActivity.aa = (vne) dwqVar.a.a.E.get();
            aacz aaczVar = (aacz) dwqVar.a.D.get();
            liveCreationActivity.ar((vxk) dwqVar.ga.get());
        }
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.axoo
    /* renamed from: p */
    public final axnv lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axnv(this);
                }
            }
        }
        return this.a;
    }
}
