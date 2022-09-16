package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
import com.google.protos.youtube.api.innertube.UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
import com.google.protos.youtube.api.innertube.UpdateViewershipActionOuterClass$UpdateViewershipAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: frm  reason: default package */
/* loaded from: classes3.dex */
public final class frm implements Runnable, fqc {
    public final Handler a;
    public final String b;
    public boolean i;
    public boolean j;
    private final Executor k;
    private final fqd l;
    private final azqb m;
    private final snc n;
    private long o = 0;
    public List h = amuk.q();
    public ampq g = amon.a;
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public frm(Handler handler, snc sncVar, fqd fqdVar, azqb azqbVar, String str, Executor executor) {
        this.a = handler;
        this.n = sncVar;
        this.l = fqdVar;
        this.m = azqbVar;
        this.b = str;
        this.k = executor;
    }

    public static final void d(List list, List list2, List list3, List list4, List list5, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apzg apzgVar = (apzg) it.next();
            if (apzgVar.qn(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction)) {
                UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = (UpdateViewershipActionOuterClass$UpdateViewershipAction) apzgVar.qm(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction);
                if (!updateViewershipActionOuterClass$UpdateViewershipAction.c) {
                    avzm avzmVar = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                    if (avzmVar == null) {
                        avzmVar = avzm.a;
                    }
                    if ((avzmVar.b & 1) != 0) {
                        avzm avzmVar2 = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                        if (avzmVar2 == null) {
                            avzmVar2 = avzm.a;
                        }
                        awbf awbfVar = avzmVar2.c;
                        if (awbfVar == null) {
                            awbfVar = awbf.a;
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            frq frqVar = (frq) ((WeakReference) it2.next()).get();
                            if (frqVar != null) {
                                frqVar.d(str, awbfVar);
                            }
                        }
                    }
                }
            } else if (apzgVar.qn(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)) {
                aunb aunbVar = ((UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand) apzgVar.qm(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)).b;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aqnb aqnbVar = (aqnb) aunbVar.qm(aqnc.a);
                if (aqnbVar != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        frp frpVar = (frp) ((WeakReference) it3.next()).get();
                        if (frpVar != null) {
                            frpVar.f(str, aqnbVar);
                        }
                    }
                }
            } else if (apzgVar.qn(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction)) {
                UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction = (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction) apzgVar.qm(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction);
                if ((updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.b & 4) != 0) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        fro froVar = (fro) ((WeakReference) it4.next()).get();
                        if (froVar != null) {
                            int as = awwc.as(updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.e);
                            if (as == 0) {
                                as = 1;
                            }
                            arag aragVar = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.c;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                            arag aragVar2 = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.d;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                            froVar.a(str, as, aragVar, aragVar2);
                        }
                    }
                }
            } else if (apzgVar.qn(avst.b)) {
                avst avstVar = (avst) apzgVar.qm(avst.b);
                aunb aunbVar2 = avstVar.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apjj apjjVar = (apjj) aunbVar2.qm(AutoplayRendererOuterClass.a);
                aunb aunbVar3 = avstVar.d;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                auaz auazVar = (auaz) aunbVar3.qm(aubn.a);
                if (apjjVar != null && auazVar != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        frn frnVar = (frn) ((WeakReference) it5.next()).get();
                        if (frnVar != null) {
                            frnVar.a(auazVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fqc
    public final void a() {
        this.a.removeCallbacks(this);
    }

    @Override // defpackage.fqc
    public final void b() {
        this.a.post(this);
    }

    public final void c() {
        String str = frr.a;
        String valueOf = String.valueOf(this.b);
        if (valueOf.length() != 0) {
            "Cancelling ".concat(valueOf);
        }
        this.a.removeCallbacks(this);
        this.l.i(this);
        this.g = amon.a;
        this.h = amuk.q();
        this.o = 0L;
        this.j = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long c = this.n.c();
        long j = this.o;
        if (j != 0 && c - j < 15000) {
            String str = frr.a;
            this.a.postDelayed(this, 15000L);
            return;
        }
        this.o = c;
        this.l.g(this);
        abds abdsVar = (abds) this.m.get();
        String str2 = this.g.h() ? null : this.b;
        abdr abdrVar = new abdr(abdsVar.e, abdsVar.a.c());
        abdrVar.a = str2;
        abdrVar.b = (String) this.g.f();
        ylx.l(abdsVar.c(aset.a, abdsVar.b, abcj.m, abbc.u).a(abdrVar), this.k, new ylv() { // from class: frk
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                frm frmVar = frm.this;
                zep.o(frr.a, "Could not load updated metadata", th.getCause());
                frmVar.a.postDelayed(frmVar, 30000L);
            }
        }, new ylw() { // from class: frl
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                avia aviaVar;
                frm frmVar = frm.this;
                aset asetVar = (aset) obj;
                if (frmVar.j) {
                    return;
                }
                frm.d(asetVar.e, frmVar.c, frmVar.d, frmVar.e, frmVar.f, frmVar.b);
                if ((asetVar.b & 2) != 0) {
                    aseu aseuVar = asetVar.d;
                    if (aseuVar == null) {
                        aseuVar = aseu.a;
                    }
                    aviaVar = aseuVar.b;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                } else {
                    aviaVar = null;
                }
                if (aviaVar == null) {
                    frmVar.g = amon.a;
                    frmVar.c();
                } else {
                    frmVar.g = ampq.j(aviaVar.d);
                    int i = aviaVar.c;
                    frmVar.a.postDelayed(frmVar, i != 0 ? i : 30000L);
                    String str3 = frr.a;
                }
                frmVar.h = asetVar.e;
            }
        }, anlf.a);
    }
}
