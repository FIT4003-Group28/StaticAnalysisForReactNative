package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cftc  reason: default package */
/* loaded from: classes4.dex */
public class cftc implements cfta {
    private final dxio<chnm> a;
    private final Resources b;
    private final int c;
    private final ddho d;

    public cftc(dxio<chnm> dxioVar, Resources resources, int i, ddho ddhoVar) {
        this.a = dxioVar;
        this.b = resources;
        this.c = i;
        this.d = ddhoVar;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        this.a.a().f();
        return cqkl.a;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.cfta
    public CharSequence d() {
        return this.b.getString(this.c);
    }

    @Override // defpackage.cfta
    public CharSequence e() {
        return "";
    }

    @Override // defpackage.cfta
    public final ddho f(cfsz cfszVar) {
        return this.d;
    }

    @Override // defpackage.cfta
    public Boolean g() {
        return cfsy.c();
    }

    @Override // defpackage.cfta
    public cjtd h() {
        return cfsy.a(this);
    }

    @Override // defpackage.cfta
    public cjtd i(cfsz cfszVar) {
        return cfsy.b(this, cfszVar);
    }

    @Override // defpackage.cfta
    public cqtd j() {
        return null;
    }
}
