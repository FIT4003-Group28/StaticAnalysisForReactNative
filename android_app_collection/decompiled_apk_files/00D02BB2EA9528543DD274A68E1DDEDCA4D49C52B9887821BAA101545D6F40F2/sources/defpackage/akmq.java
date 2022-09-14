package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: akmq  reason: default package */
/* loaded from: classes.dex */
public final class akmq extends afhx {
    public static final dcdc<String> a = dcdc.f("/maps/majorevent");
    public static final dcdc<String> b = dcdc.f("/majorevent");
    public static final dbsl<afga> c = akmp.a;
    private final dxio<aagc> d;

    public akmq(Intent intent, @dzsi String str, dxio<aagc> dxioVar) {
        super(intent, str, afid.MAJOR_EVENT);
        this.d = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String queryParameter = this.f.getData().getQueryParameter("mid");
        if (!dbsj.d(queryParameter)) {
            this.d.a().a(queryParameter, 2);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
