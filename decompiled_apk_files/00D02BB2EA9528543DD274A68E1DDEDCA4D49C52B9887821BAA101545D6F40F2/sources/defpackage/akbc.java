package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: akbc  reason: default package */
/* loaded from: classes2.dex */
public class akbc implements akbb {
    private final dcdc<? extends akbi> a;
    private final Activity b;
    private final dxio<afha> c;
    private final View.OnClickListener d;

    public akbc(dcdc<? extends akbi> dcdcVar, Activity activity, dxio<afha> dxioVar, View.OnClickListener onClickListener) {
        this.a = dcdcVar;
        this.b = activity;
        this.c = dxioVar;
        this.d = onClickListener;
    }

    @Override // defpackage.akbb
    public jib b() {
        String string;
        jhz jhzVar = new jhz();
        jhzVar.q = ibm.x();
        if (c().booleanValue()) {
            string = this.b.getString(R.string.SHORTCUT_CONFIG_MENU_TITLE);
        } else {
            string = this.b.getString(R.string.LOCATION_SHARING_FEATURE_TITLE);
        }
        jhzVar.a = string;
        jhzVar.x = false;
        jhzVar.g = ibm.b();
        jhzVar.f(this.d);
        jhzVar.o = cjtd.a(dtxu.fr);
        return jhzVar.b();
    }

    @Override // defpackage.akbb
    public Boolean c() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.akbb
    public cqkl d() {
        this.c.a().f(this.b, ahyr.l(this.b, dbpy.a, ahwe.SHORTCUT), 2);
        return cqkl.a;
    }

    @Override // defpackage.akbb
    /* renamed from: e */
    public dcdc<? extends akbi> a() {
        return this.a;
    }
}
