package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmzs  reason: default package */
/* loaded from: classes3.dex */
public class bmzs extends bmzp {
    private final awnl c;
    private final Activity d;
    private final dxio<akfa> e;
    private final cjxd f;
    private final awnm g;
    private final axwy h;
    private final boolean i;
    private final dxio<btvo> j;
    private final dxio<bzpz> k;
    private final cjtd l;
    private final cjtd m;
    private final cjtd n;

    public bmzs(awnl awnlVar, Activity activity, dxio<akfa> dxioVar, cjxd cjxdVar, awnm awnmVar, axwy axwyVar, dxio<btvo> dxioVar2, dxio<bzpz> dxioVar3) {
        this(awnlVar, activity, dxioVar, cjxdVar, awnmVar, axwyVar, dxioVar2, dxioVar3, false);
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd a() {
        return this.l;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd b() {
        return this.m;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd c() {
        return this.n;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cqkl d() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        new bzpr(this.d, this.e, this.f, this.g, this.h, this.j, this.k).b(this.c).a("geo_personal_place_label_or_contact");
        return cqkl.a;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence g() {
        if (this.i) {
            return this.d.getString(R.string.ALIASING_NEW_PLACE_FOR_CONTACTS_DIALOG_TITLE);
        }
        return this.d.getString(R.string.ALIASING_NEW_PLACE_DIALOG_TITLE);
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence h() {
        if (this.i) {
            return this.d.getString(R.string.ALIASING_NEW_PLACE_FOR_CONTACTS_SEARCH_HISTORY_PROMPT);
        }
        return this.d.getString(R.string.ALIASING_NEW_PLACE_SEARCH_HISTORY_PROMPT);
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence i() {
        return this.d.getString(R.string.ALIAS_SETTING_GET_STARTED);
    }

    public bmzs(awnl awnlVar, Activity activity, dxio<akfa> dxioVar, cjxd cjxdVar, awnm awnmVar, axwy axwyVar, dxio<btvo> dxioVar2, dxio<bzpz> dxioVar3, boolean z) {
        this.c = awnlVar;
        this.d = activity;
        this.e = dxioVar;
        this.f = cjxdVar;
        this.g = awnmVar;
        this.h = axwyVar;
        this.i = z;
        this.j = dxioVar2;
        this.k = dxioVar3;
        this.l = cjtd.a(dtxj.aK);
        this.m = cjtd.a(dtxj.aL);
        this.n = cjtd.a(dtxj.aM);
    }
}
