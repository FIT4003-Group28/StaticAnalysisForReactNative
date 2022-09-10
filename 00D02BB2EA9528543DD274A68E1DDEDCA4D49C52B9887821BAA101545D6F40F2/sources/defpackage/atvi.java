package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atvi  reason: default package */
/* loaded from: classes2.dex */
public class atvi extends atss<crrb> {
    public atvi(crrb crrbVar, Context context, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crrbVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, 6000L);
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Oa() {
        super.Oa();
        cjta b = cjtd.b();
        b.b = ((crrb) this.e).a.j();
        b.g(((crrb) this.e).a.k());
        b.f = dvnp.DIRECTIONS;
        b.d = dtxw.aM;
        this.v = b.a();
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean af() {
        return true;
    }

    @Override // defpackage.atss
    protected final crfj u() {
        if (!this.h.getNavigationParameters().O().e || ((crrb) this.e).a.C() != 2) {
            crfe q = this.i.q();
            dotj dotjVar = (dotj) bvrt.f(((crrb) this.e).a.y(), (dssr) dotj.c.cu(7), dotj.c);
            dbsk.s(dotjVar);
            return q.i(R.raw.da_traffic_report_ding_dong, dcdc.f(dotjVar), -1, null);
        }
        return crfj.b(crfi.PREROLL_SOUND_ONLY, "", R.raw.da_traffic_report_ding_dong);
    }
}
