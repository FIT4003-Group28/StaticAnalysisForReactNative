package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqn  reason: default package */
/* loaded from: classes2.dex */
class aeqn implements aeqj {
    private final Resources a;
    private final dnhi b;
    private final cjtd c;

    public aeqn(Resources resources, dnhi dnhiVar, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnhiVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.aeqj
    public Integer a() {
        return 0;
    }

    @Override // defpackage.aeqj
    @dzsi
    public String b() {
        dnhi dnhiVar = this.b;
        if ((dnhiVar.a & 128) == 0 || dnhiVar.e == 0) {
            return null;
        }
        return String.format(this.a.getString(R.string.HOTEL_OFFER_TIP), Integer.valueOf(this.b.e));
    }

    @Override // defpackage.aeqj
    @dzsi
    public String c() {
        return this.b.c;
    }

    @Override // defpackage.aeqj
    public cjtd d() {
        cjta c = cjtd.c(this.c);
        c.d = dtxr.cn;
        return c.a();
    }
}
