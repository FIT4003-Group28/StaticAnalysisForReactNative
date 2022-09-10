package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfrg  reason: default package */
/* loaded from: classes3.dex */
class bfrg implements aeqj {
    private final Resources a;
    private final dnhi b;
    private final cjtd c;

    public bfrg(Resources resources, dnhi dnhiVar, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnhiVar;
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxr.cn;
        this.c = c.a();
    }

    @Override // defpackage.aeqj
    public Integer a() {
        return 0;
    }

    @Override // defpackage.aeqj
    public String b() {
        return String.format(this.a.getString(R.string.HOTEL_OFFER_TIP), Integer.valueOf(this.b.e));
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
