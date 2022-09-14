package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: kok  reason: default package */
/* loaded from: classes7.dex */
public class kok implements kof {
    private dcdc<bevj> a;
    private cjtd b;
    @dzsi
    private cjtd c;
    @dzsi
    private String d;

    public kok() {
        this(dcdc.e(), cjtd.b);
    }

    public kok(dcdc<bevj> dcdcVar, cjtd cjtdVar) {
        this.c = null;
        this.d = null;
        this.a = dcdcVar;
        this.b = cjtdVar;
    }

    public void Od(dcdc<bevj> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.kof
    public bevj a(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.kof
    public int b() {
        return this.a.size();
    }

    @Override // defpackage.kof
    public cjtd c() {
        return this.b;
    }

    @Override // defpackage.kof
    @dzsi
    public String d() {
        return this.d;
    }

    @Override // defpackage.kof
    @dzsi
    public cjtd e() {
        return this.c;
    }

    public void g(cjtd cjtdVar) {
        this.b = cjtdVar;
    }

    public kok(dcdc<bevj> dcdcVar, cjtd cjtdVar, Context context, dbsg<dnin> dbsgVar) {
        this(dcdcVar, cjtdVar);
        String str;
        bvsz bvszVar;
        if (dbsgVar.a()) {
            dnin b = dbsgVar.b();
            dgas dgasVar = b.a;
            int i = (dgasVar == null ? dgas.e : dgasVar).b;
            if (i > 0) {
                int max = Math.max(i, 60);
                Resources resources = context.getResources();
                if (max < TimeUnit.HOURS.toSeconds(1L)) {
                    bvszVar = bvsz.ABBREVIATED;
                } else {
                    bvszVar = bvsz.ABBREVIATED_SHORT;
                }
                str = context.getString(R.string.CAR_RECOMMENDED_CHARGE_TIME, bvtb.e(resources, max, bvszVar));
            } else {
                str = null;
            }
            this.d = str;
            cjta b2 = cjtd.b();
            b2.g(b.b);
            b2.d = dtxm.dL;
            this.c = b2.a();
        }
    }
}
