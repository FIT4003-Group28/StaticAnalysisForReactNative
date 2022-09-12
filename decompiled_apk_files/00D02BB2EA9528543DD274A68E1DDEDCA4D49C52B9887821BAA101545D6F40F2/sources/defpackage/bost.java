package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bost  reason: default package */
/* loaded from: classes3.dex */
public class bost implements bosx {
    private final Activity a;
    private final boqa b;
    private final ddho c;
    private final ddho d;
    private final bosv e;
    private boolean f = false;

    public bost(cqhn cqhnVar, Activity activity, boqa boqaVar, ddho ddhoVar, ddho ddhoVar2, bosv bosvVar) {
        this.a = activity;
        this.b = boqaVar;
        this.c = ddhoVar;
        this.d = ddhoVar2;
        this.e = bosvVar;
    }

    @Override // defpackage.bosx
    public boqa a() {
        return this.b;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bosx
    public cjtd c() {
        return cjtd.a(this.c);
    }

    @Override // defpackage.bosx
    public cjtd d() {
        return cjtd.a(this.d);
    }

    @Override // defpackage.bosx
    public cqkl e(cjqm cjqmVar) {
        this.f = true;
        this.e.g(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.bosx
    public cqkl f() {
        this.e.f();
        cqkx.p(this);
        cqkx.p(this.e);
        return cqkl.a;
    }

    @Override // defpackage.bosx
    public CharSequence g() {
        return this.a.getString(R.string.BUSINESS_HOURS_VERIFY_HOURS_LABEL);
    }

    @Override // defpackage.bosx
    public CharSequence h() {
        return this.a.getString(R.string.BUSINESS_HOURS_VERIFY_HOURS);
    }

    @Override // defpackage.bosx
    public CharSequence i() {
        return this.a.getString(R.string.BUSINESS_HOURS_EDIT_HOURS);
    }
}
