package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqqp  reason: default package */
/* loaded from: classes.dex */
public final class aqqp extends afhx {
    public static final dbsl<afga> a = aqqo.a;
    private final aqqn b;
    private final apzy c;

    public aqqp(Intent intent, @dzsi String str, aqqn aqqnVar, apzy apzyVar) {
        super(intent, str, afid.BUSINESS_MESSAGING_MAPS_ONLY);
        this.b = aqqnVar;
        this.c = apzyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        if (!this.c.d()) {
            return;
        }
        apzy apzyVar = this.c;
        if (!apzyVar.d() || !apzyVar.a.a().getBusinessMessagingParameters().r) {
            this.b.a();
            return;
        }
        dbsg<String> c = aqqn.c(this.f, "com.google.business.ACTION_MAPS_MESSAGE");
        if (c.a()) {
            this.b.b(c.b(), apzb.MAPS_ONLY_INTENT, aqqn.d(this.f, "com.google.business.ACTION_MAPS_MESSAGE"));
            return;
        }
        this.b.a();
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_BUSINESS_MESSAGING_MAPS_ONLY;
    }
}
