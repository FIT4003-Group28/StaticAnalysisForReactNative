package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqo  reason: default package */
/* loaded from: classes2.dex */
class aeqo implements aeqj {
    private final Resources a;
    private final dnob b;
    private final cjtd c;

    public aeqo(Resources resources, dnob dnobVar, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnobVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.aeqj
    public Integer a() {
        return 1;
    }

    @Override // defpackage.aeqj
    public String b() {
        return String.format(this.a.getString(R.string.HOTEL_VALUE_TIP), Integer.valueOf(this.b.f));
    }

    @Override // defpackage.aeqj
    @dzsi
    public String c() {
        return null;
    }

    @Override // defpackage.aeqj
    public cjtd d() {
        cjta c = cjtd.c(this.c);
        c.d = dtxr.co;
        return c.a();
    }
}
