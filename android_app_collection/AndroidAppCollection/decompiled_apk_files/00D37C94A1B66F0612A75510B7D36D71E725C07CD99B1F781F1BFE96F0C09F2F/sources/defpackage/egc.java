package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: egc  reason: default package */
/* loaded from: classes3.dex */
public final class egc {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final azqb b;
    private final azqb c;
    private final Executor d;
    private final azqb e;
    private final aacz f;

    public egc(azqb azqbVar, aacz aaczVar, azqb azqbVar2, Executor executor, azqb azqbVar3) {
        this.b = azqbVar;
        this.f = aaczVar;
        this.c = azqbVar2;
        this.d = executor;
        this.e = azqbVar3;
    }

    public final Intent a(Context context) {
        Intent a;
        Intent intent = null;
        if (this.a.get()) {
            rdt rdtVar = new rdt(context);
            Uri parse = Uri.parse("https://m.youtube.com");
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
            intent2.addCategory("android.intent.category.BROWSABLE");
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (!packageName.equals(activityInfo.packageName)) {
                    intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    break;
                }
            }
            if (intent != null) {
                rdtVar.a = context.getString(R.string.redirect_to_mobile_web);
                rdtVar.b = intent;
                a = rdtVar.a();
                a.putExtra("ShowMwebButton", true);
            } else {
                afus.b(1, 27, "No Browser to handle MWEB url");
                c(ardw.GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER);
                a = rdtVar.a();
                a.putExtra("ShowMwebButton", false);
            }
            a.setFlags(268435456);
            return a;
        }
        return null;
    }

    public final void b() {
        if (!((zen) this.e.get()).e("failsafe_enable_gms_device_compliance_check", true)) {
            return;
        }
        aveq aveqVar = this.f.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        if (!aveqVar.p) {
            return;
        }
        final rdj rdjVar = (rdj) this.b.get();
        final rvh rvhVar = new rvh();
        rdjVar.b.execute(new Runnable() { // from class: rdi
            @Override // java.lang.Runnable
            public final void run() {
                final rdj rdjVar2 = rdj.this;
                rvh rvhVar2 = rvhVar;
                System.nanoTime();
                rde a = rdj.a(rdjVar2.c.a());
                System.nanoTime();
                if (a.a()) {
                    rvhVar2.d(a);
                }
                rdb rdbVar = rdjVar2.a;
                qvx b = qvy.b();
                b.a = new qjn(4);
                b.b = new Feature[]{rda.a};
                b.b();
                b.c = 13801;
                rve e = ((qst) rdbVar).s(b.a()).e(rdjVar2.b, new rvd() { // from class: rdh
                    @Override // defpackage.rvd
                    public final rve a(Object obj) {
                        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) obj;
                        rdj.this.c.b(gmsDeviceComplianceResponse);
                        return rwd.c(rdj.a(gmsDeviceComplianceResponse));
                    }
                });
                e.p(rdjVar2.b, new rdg(rvhVar2));
                e.o(rdjVar2.b, new rdf(rvhVar2));
            }
        });
        rvj rvjVar = rvhVar.a;
        rvjVar.o(this.d, new ruw() { // from class: ega
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                egc egcVar = egc.this;
                afus.c(2, 27, "Failed GmsDeviceCompliance check", exc);
                egcVar.c(ardw.GMS_DEVICE_CHECK_TYPE_FAILED);
            }
        });
        rvjVar.p(this.d, new ruz() { // from class: egb
            @Override // defpackage.ruz
            public final void d(Object obj) {
                egc egcVar = egc.this;
                rde rdeVar = (rde) obj;
                egcVar.a.set(rdeVar.a());
                if (rdeVar.a()) {
                    egcVar.c(ardw.GMS_DEVICE_CHECK_TYPE_SUCCESS);
                }
            }
        });
    }

    public final void c(ardw ardwVar) {
        ardx a = ardy.a();
        a.copyOnWrite();
        ardy.c((ardy) a.instance, ardwVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).cB((ardy) a.mo39build());
        ((acrr) this.c.get()).c((arrh) a2.mo39build());
    }
}
