package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqp  reason: default package */
/* loaded from: classes2.dex */
public class aeqp implements aeqk {
    public final Resources a;
    public final dnng b;
    public final cjtd c;
    dbty<dbsg<aeqj>> d = dbud.a(new aeql(this));
    private final String e;

    public aeqp(Resources resources, dnng dnngVar, cjtd cjtdVar, String str) {
        this.a = resources;
        this.b = dnngVar;
        this.c = cjtdVar;
        this.e = str;
    }

    @Override // defpackage.aeqk
    public String a() {
        if (!this.e.isEmpty()) {
            return this.a.getString(R.string.HOTEL_PRICE_TAG_ACCESSIBILITY_DESCRIPTION, b(), this.e);
        }
        return b();
    }

    @Override // defpackage.aeqk
    public String b() {
        return this.b.d;
    }

    @Override // defpackage.aeqk
    public cqss c() {
        return this.d.a().a() ? ibm.M() : ibm.c();
    }

    @Override // defpackage.aeqk
    @dzsi
    public aeqj d() {
        return this.d.a().f();
    }
}
