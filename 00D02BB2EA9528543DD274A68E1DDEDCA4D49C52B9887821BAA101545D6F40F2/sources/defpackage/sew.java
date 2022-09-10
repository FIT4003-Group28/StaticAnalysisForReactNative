package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sew  reason: default package */
/* loaded from: classes7.dex */
public class sew implements sat {
    private static final eaol a = new eaol(0, eaou.b);
    @dzsi
    private final View.AccessibilityDelegate b;
    private final eapi c;
    private final cqkn<sat> d;
    private final cjtd e;
    private boolean f = false;

    public sew(eapi eapiVar, cqkn<sat> cqknVar, @dzsi View.AccessibilityDelegate accessibilityDelegate, cjtd cjtdVar) {
        this.c = eapiVar;
        this.d = cqknVar;
        this.b = accessibilityDelegate;
        this.e = cjtdVar;
    }

    @Override // defpackage.sat
    public eapr a() {
        return this.c.A(a);
    }

    @Override // defpackage.sat
    public eapi b() {
        return this.c;
    }

    @Override // defpackage.sat
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.sat
    public void d(Boolean bool) {
        this.f = bool.booleanValue();
    }

    @Override // defpackage.sat
    public cqkn<sat> e() {
        return this.d;
    }

    @Override // defpackage.sat
    @dzsi
    public View.AccessibilityDelegate f() {
        return this.b;
    }

    @Override // defpackage.sat
    public cjtd g() {
        return this.e;
    }
}
