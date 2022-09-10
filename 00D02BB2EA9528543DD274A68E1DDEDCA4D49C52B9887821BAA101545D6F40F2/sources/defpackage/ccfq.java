package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccfq  reason: default package */
/* loaded from: classes.dex */
public final class ccfq extends afhx {
    public static final dbsl<afga> a = ccfp.a;
    private final dxio<cfpk> b;

    public ccfq(Intent intent, @dzsi String str, dxio<cfpk> dxioVar) {
        super(intent, str, afid.SERVICE_RECOMMENDATION);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("webview_url");
        dbsk.s(stringExtra);
        this.b.a().e(stringExtra, cfpl.SERVICE_RECOMMENDATION_NOTIFICATION);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_SERVICE_RECOMMENDATION;
    }
}
