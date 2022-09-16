package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apgd  reason: default package */
/* loaded from: classes2.dex */
public class apgd implements bskm {
    private final Resources a;
    private final aoxq b;
    private final apgu c;
    private final apgf d;
    private final aoxp e;

    public apgd(Resources resources, aoxq aoxqVar, apgu apguVar, apgf apgfVar, aoxp aoxpVar) {
        this.a = resources;
        this.c = apguVar;
        this.d = apgfVar;
        this.b = aoxqVar;
        this.e = aoxpVar;
    }

    @Override // defpackage.bskm
    public String a() {
        return this.b.b(this.e);
    }

    @Override // defpackage.bskm
    public String b() {
        String string;
        if (c().booleanValue()) {
            string = this.a.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.a.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.a.getString(R.string.BINARY_STATE_PIVOT_DESCRIPTION, a(), string);
    }

    @Override // defpackage.bskm
    public Boolean c() {
        boolean z = false;
        if (this.c.e().a() && this.c.e().b().a().equals(this.e.a())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bskm
    public Boolean d() {
        return false;
    }

    @Override // defpackage.bskm
    public cqkl e(cjqm cjqmVar) {
        if (c().booleanValue()) {
            this.c.f(dbpy.a);
        } else {
            this.c.f(dbsg.i(this.e));
        }
        this.d.a.b();
        return cqkl.a;
    }

    @Override // defpackage.bskm
    @dzsi
    public cjtd f() {
        ddho c = this.b.c(this.e, aoxl.a);
        if (c == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = c;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = c().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    @Override // defpackage.bskm
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.bskm
    public View.OnClickListener h() {
        return bskj.a(this);
    }

    @Override // defpackage.bskm
    public Boolean i() {
        return bskj.b();
    }

    @Override // defpackage.bskm
    public cqfc j() {
        return bskl.a;
    }
}
