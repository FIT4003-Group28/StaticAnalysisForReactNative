package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aekp  reason: default package */
/* loaded from: classes2.dex */
public class aekp implements aekh {
    private dqtl a;
    private final gfq b;
    private final gga c;

    public aekp(cqhn cqhnVar, gfq gfqVar, gga ggaVar, dqtl dqtlVar) {
        this.a = dqtlVar;
        this.b = gfqVar;
        this.c = ggaVar;
    }

    @Override // defpackage.aekh
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.aekh
    public String b() {
        return this.c.getString(R.string.CURRENCY_SELECTOR_CONTENT_DESCRIPTION, new Object[]{a()});
    }

    @Override // defpackage.aekh
    @dzsi
    public cjtd c() {
        return cjtd.a(dtxy.hT);
    }

    @Override // defpackage.aekh
    public void d(dqtl dqtlVar) {
        this.a = dqtlVar;
        cqkx.p(this);
    }

    @Override // defpackage.aekh
    public cqkl e(cjqm cjqmVar) {
        dqtl dqtlVar = this.a;
        aejh aejhVar = new aejh();
        Bundle bundle = new Bundle();
        bvrs.l(bundle, dqtlVar);
        aejhVar.B(bundle);
        fd d = this.b.d();
        if (d instanceof gfw) {
            aejhVar.aJ(this.c.g(), (gfw) d);
        }
        return cqkl.a;
    }
}
