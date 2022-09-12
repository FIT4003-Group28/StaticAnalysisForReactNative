package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aezs  reason: default package */
/* loaded from: classes.dex */
public final class aezs extends afhx {
    public static final dbsl<afga> a = aezr.a;
    private final dxio<aezk> b;

    public aezs(Intent intent, @dzsi String str, dxio<aezk> dxioVar) {
        super(intent, str, afid.IN_APP_SURVEY_NOTIFICATION);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        aezk a2 = this.b.a();
        a2.e(a2.m(this.f));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_IN_APP_SURVEY_NOTIFICATION;
    }
}
