package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdtn  reason: default package */
/* loaded from: classes3.dex */
public class bdtn implements bdtk {
    private final bdtm a;
    private final axru b;
    private final bcan c;
    private final bdrv d;
    private final dbsg<String> e;
    private final boolean f;
    private final Activity g;
    private boolean h = true;

    public bdtn(bdtm bdtmVar, boolean z, bbvb bbvbVar, bwrs<bcan> bwrsVar, bdrv bdrvVar, Activity activity, axru axruVar) {
        this.a = bdtmVar;
        this.g = activity;
        this.b = axruVar;
        bcan c = bwrsVar.c();
        dbsk.s(c);
        this.c = c;
        this.d = bdrvVar;
        this.f = z;
        this.e = bbvbVar.a();
    }

    @Override // defpackage.bdtk
    public Boolean b() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bdtk
    public cqkl c() {
        this.d.g();
        return cqkl.a;
    }

    @Override // defpackage.bdtk
    public Integer d() {
        if (!Boolean.valueOf(this.b.a("android.permission.READ_EXTERNAL_STORAGE")).booleanValue()) {
            return 0;
        }
        return Integer.valueOf(this.c.l().size());
    }

    @Override // defpackage.bdtk
    public cqkl e() {
        this.d.f();
        return cqkl.a;
    }

    @Override // defpackage.bdtk
    public Boolean f() {
        boolean z = false;
        if (d().intValue() > 0 && this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdtk
    public bdtm g() {
        return this.a;
    }

    @Override // defpackage.bdtk
    public cqkl h(cjqm cjqmVar) {
        this.h = this.d.h(cjqmVar);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bdtk
    public CharSequence a() {
        dbsg<String> dbsgVar = this.e;
        bbud f = this.c.f();
        return dbsgVar.d(f == null ? dbpy.a : ((bbsp) f).a.h(bdtl.a)).c(this.f ? this.g.getString(R.string.UGC_PHOTO_UPLOAD_SELECT_A_PLACE) : "");
    }
}
