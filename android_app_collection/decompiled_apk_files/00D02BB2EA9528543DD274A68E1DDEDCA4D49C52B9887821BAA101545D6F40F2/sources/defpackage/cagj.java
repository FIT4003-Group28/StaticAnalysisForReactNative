package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cagj  reason: default package */
/* loaded from: classes4.dex */
public class cagj extends bzym {
    private final Activity b;
    private final cklf c;
    private final bzyv d;

    public cagj(amfi amfiVar, Activity activity, cklf cklfVar, boolean z, bzyv bzyvVar) {
        super(null, ibm.x(), z, null, amfiVar);
        this.b = activity;
        this.c = cklfVar;
        this.d = bzyvVar;
    }

    @Override // defpackage.bzym, defpackage.bzyw
    public cqss c() {
        return irg.e();
    }

    @Override // defpackage.bzym, defpackage.bzyw
    public cqss d() {
        return irg.H();
    }

    @Override // defpackage.bzym, defpackage.bzyw
    public cqss e() {
        return ibm.x();
    }

    @Override // defpackage.bzym, defpackage.bzyw
    public cqss g() {
        return irg.H();
    }

    @Override // defpackage.bzym, defpackage.bzyw
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bzyw
    public cqkl i() {
        this.d.a();
        return cqkl.a;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cqtd j() {
        return null;
    }

    @Override // defpackage.bzyw
    public cqkl k() {
        this.c.a("contributions_edits_android");
        return cqkl.a;
    }

    @Override // defpackage.bzyw
    public Boolean l() {
        return true;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cjtd m() {
        return null;
    }

    @Override // defpackage.bzyw
    public String n() {
        return this.b.getString(R.string.EDIT_CONTRIBUTIONS_NOTICE_BANNER_TEXT);
    }

    @Override // defpackage.bzyw
    public String o() {
        return this.b.getString(R.string.LEARN_MORE);
    }

    @Override // defpackage.bzyw
    public Boolean p() {
        return false;
    }

    @Override // defpackage.bzyw
    public Boolean q() {
        return true;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cjtd r() {
        return null;
    }
}
