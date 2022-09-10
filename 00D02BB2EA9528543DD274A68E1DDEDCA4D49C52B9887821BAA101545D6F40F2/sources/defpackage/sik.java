package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: sik  reason: default package */
/* loaded from: classes7.dex */
final class sik implements degu<amte> {
    final /* synthetic */ shr a;
    final /* synthetic */ degu b;
    final /* synthetic */ qsm c;
    final /* synthetic */ sim d;

    public sik(sim simVar, shr shrVar, degu deguVar, qsm qsmVar) {
        this.d = simVar;
        this.a = shrVar;
        this.b = deguVar;
        this.c = qsmVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.a(th);
        this.c.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi amte amteVar) {
        String str;
        amub amubVar;
        sil silVar;
        amte amteVar2 = amteVar;
        try {
            sim simVar = this.d;
            int d = this.a.d();
            dspd a = this.a.a();
            degu deguVar = this.b;
            if (amteVar2 == null) {
                silVar = new sil();
            } else {
                Iterator<amub> it = amteVar2.a(simVar.a).iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        amubVar = null;
                        break;
                    }
                    amubVar = it.next();
                    if (amubVar.am()) {
                        break;
                    }
                }
                if (amubVar != null) {
                    str = amug.e(dcdc.f(amubVar), simVar.a.getString(R.string.TRANSIT_ROUTE_STEP_SEPARATOR));
                }
                if (!TextUtils.isEmpty(str)) {
                    simVar.c.a(d, a, str);
                    deguVar.b(str);
                }
                silVar = new sil();
            }
            deguVar.a(silVar);
        } finally {
            this.c.f();
        }
    }
}
