package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfri  reason: default package */
/* loaded from: classes3.dex */
class bfri implements bfrb {
    public final Resources a;
    public final dnnr b;
    public final cjtd c;
    private final boolean d;
    private final dbty<dbsg<aeqj>> e = dbud.a(new bfrf(this));

    public bfri(Resources resources, dnnr dnnrVar, boolean z, cjtd cjtdVar) {
        this.a = resources;
        this.b = dnnrVar;
        this.d = z;
        this.c = cjtdVar;
    }

    @Override // defpackage.aeqk
    public String a() {
        return b();
    }

    @Override // defpackage.aeqk
    public String b() {
        return this.d ? this.b.c : this.b.d;
    }

    @Override // defpackage.aeqk
    public cqss c() {
        return this.e.a().a() ? ibm.M() : ibm.c();
    }

    @Override // defpackage.aeqk
    @dzsi
    public aeqj d() {
        return this.e.a().f();
    }

    @Override // defpackage.bfrb
    public String e() {
        if (this.d) {
            return this.a.getString(R.string.TOTAL_PRICE);
        }
        return this.a.getString(R.string.PRICE_WITH_TAXES, this.b.c);
    }
}
