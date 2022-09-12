package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bean  reason: default package */
/* loaded from: classes3.dex */
public class bean extends bruj {
    private final Activity e;
    private final dxio<begg> f;
    private final jba g;
    private final brsc h;
    private final bmdk i;

    public bean(Activity activity, dxio<begg> dxioVar, brsc brscVar, bmdk bmdkVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dxioVar;
        this.g = jbaVar;
        this.h = brscVar;
        this.i = bmdkVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.h.d(bege.MENU);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.g.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.TAB_TITLE_MENU);
        }
        return this.e.getString(R.string.MENU_PAGE_TITLE, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar == null || !this.i.a(bwrsVar)) {
            return this.e.getString(R.string.TAB_TITLE_MENU);
        }
        return this.e.getString(R.string.TAB_TITLE_SERVICES);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        boolean z = false;
        if (r() != null && this.f.a().i(bege.MENU)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232315, ibm.w());
    }
}
