package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: actu  reason: default package */
/* loaded from: classes2.dex */
public class actu extends acts implements actl {
    private final Resources a;

    public actu(Resources resources, btvo btvoVar, cjqy cjqyVar) {
        super(cjqyVar);
        this.a = resources;
    }

    private final Boolean c() {
        boolean z = false;
        if (z().booleanValue() && j().size() < 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.actl
    public acli d() {
        return f();
    }

    @Override // defpackage.actl
    public acli e() {
        return acli.a(c().booleanValue() ? dtxy.iZ : dtxy.iY);
    }

    @Override // defpackage.actl
    public acli f() {
        return acli.a(c().booleanValue() ? dtxy.jc : dtxy.iX);
    }

    @Override // defpackage.actl
    public String g() {
        return this.a.getString(R.string.IN_STORE_PHOTOS_CAROUSEL_TITLE);
    }

    @Override // defpackage.actl
    public acli h() {
        return acli.a(dtxy.jb);
    }

    @Override // defpackage.actl
    public acli i() {
        return acli.a(dtxy.jd);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean o() {
        boolean z = false;
        if (a().booleanValue() && !c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
