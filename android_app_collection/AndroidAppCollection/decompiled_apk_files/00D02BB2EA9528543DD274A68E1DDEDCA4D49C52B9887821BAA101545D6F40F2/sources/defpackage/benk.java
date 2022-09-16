package defpackage;

import android.app.Activity;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: benk  reason: default package */
/* loaded from: classes3.dex */
public class benk extends beol implements cqkp {
    public final apnx a;
    public final List b;
    public final beni c;
    private boolean k;
    private final crzp<apsi<dbsg<Pair<dfzs, List<dqoh>>>>> l;
    private final beis m;

    public benk(ff ffVar, apny apnyVar, cqhn cqhnVar, bgyb bgybVar, bepv bepvVar, beid beidVar, beis beisVar, beni beniVar, Executor executor, long j, String str, bwrs bwrsVar, bwrs bwrsVar2) {
        super(ffVar, cqhnVar, bgybVar, bepvVar, bwrsVar, beidVar, bwrsVar2, executor);
        this.l = new crzp(this) { // from class: benj
            private final benk a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                benk benkVar = this.a;
                apsi apsiVar = (apsi) crzmVar.l();
                if (apsiVar == null || benkVar.e == null || benkVar.f == null) {
                    return;
                }
                int b = apsiVar.b();
                int i = b - 1;
                if (b == 0) {
                    throw null;
                }
                if (i != 1) {
                    if (i == 2 && ((dbsg) apsiVar.a()).a() && benkVar.h != null && benkVar.b != null && benkVar.c != null && benkVar.a != null) {
                        dfzs dfzsVar = (dfzs) ((Pair) ((dbsg) apsiVar.a()).b()).first;
                        List<dqoh> list = (List) ((Pair) ((dbsg) apsiVar.a()).b()).second;
                        ilo c = benkVar.h.c();
                        String q = c != null ? c.q() : "";
                        String str2 = dfzsVar.g;
                        for (dqoh dqohVar : list) {
                            String str3 = true != dqohVar.a ? str2 : q;
                            List list2 = benkVar.b;
                            beni beniVar2 = benkVar.c;
                            apnx apnxVar = benkVar.a;
                            beni.a(beniVar2.a.a(), 1);
                            beni.a(apnxVar, 2);
                            beni.a(str3, 3);
                            beni.a(dqohVar, 5);
                            list2.add(new benh());
                        }
                    }
                } else {
                    ckos.a(benkVar.e.findViewById(16908290), benkVar.e.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
                }
                cqkx.p(benkVar);
            }
        };
        this.b = new ArrayList();
        this.c = beniVar;
        long millis = TimeUnit.SECONDS.toMillis(j);
        Activity activity = (Activity) ((dxjd) apnyVar.a).a;
        apny.a(activity, 1);
        cqhn a = apnyVar.b.a();
        apny.a(a, 2);
        apny.a(((dxjh) apnyVar.c).a(), 3);
        apny.a(((dxjh) apnyVar.d).a(), 4);
        dxio a2 = ((dxjh) apnyVar.e).a();
        apny.a(a2, 5);
        apny.a(apnyVar.f.a(), 6);
        apny.a(str, 7);
        this.a = new apnx(activity, a, a2, millis);
        this.m = beisVar;
    }

    @Override // defpackage.beol
    public void a() {
        super.a();
        this.m.a().a(this.l, this.i);
        ilo c = this.h.c();
        if (!this.k && c != null) {
            this.k = true;
        }
        q();
    }

    @Override // defpackage.beol
    public void b() {
        super.b();
        this.m.a().c(this.l);
    }
}
