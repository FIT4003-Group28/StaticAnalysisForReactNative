package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfrh  reason: default package */
/* loaded from: classes3.dex */
class bfrh implements aeqj {
    private final Resources a;
    private final dnhi b;
    private final cjtd c;

    public bfrh(Resources resources, dnhi dnhiVar, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnhiVar;
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxr.cq;
        this.c = c.a();
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
        return this.c;
    }
}
