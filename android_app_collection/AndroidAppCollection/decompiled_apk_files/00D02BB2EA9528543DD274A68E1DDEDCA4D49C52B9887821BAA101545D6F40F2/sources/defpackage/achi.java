package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: achi  reason: default package */
/* loaded from: classes.dex */
public final class achi extends afhx {
    public static final dbsl<afga> a = achh.a;
    private final dxio<ache> b;

    public achi(Intent intent, @dzsi String str, dxio<ache> dxioVar) {
        super(intent, str, afid.FEEDBACK);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.b.a().m(this.f.getExtras().getString("feedbackIntentExtra", "unknown-feature"));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_FEEDBACK;
    }
}
