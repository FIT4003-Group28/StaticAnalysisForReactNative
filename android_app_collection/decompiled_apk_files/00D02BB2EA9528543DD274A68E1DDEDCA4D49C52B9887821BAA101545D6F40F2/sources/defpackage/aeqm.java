package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqm  reason: default package */
/* loaded from: classes2.dex */
class aeqm implements aeqj {
    private final Resources a;
    private final dnhi b;
    private final cjtd c;

    public aeqm(Resources resources, dnhi dnhiVar, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnhiVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.aeqj
    public Integer a() {
        return 2;
    }

    @Override // defpackage.aeqj
    public String b() {
        return String.format(this.a.getString(R.string.HOTEL_GOOGLE_ONE_OFFER_TIP), this.b.d);
    }

    @Override // defpackage.aeqj
    @dzsi
    public String c() {
        return this.b.c;
    }

    @Override // defpackage.aeqj
    public cjtd d() {
        cjta c = cjtd.c(this.c);
        c.d = dtxr.cq;
        return c.a();
    }
}
