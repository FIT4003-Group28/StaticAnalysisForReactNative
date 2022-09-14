package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqrh  reason: default package */
/* loaded from: classes.dex */
public final class aqrh extends afhx {
    public static final dbsl<afga> a = aqrg.a;
    private final aqqn b;

    public aqrh(Intent intent, @dzsi String str, aqqn aqqnVar) {
        super(intent, str, afid.BUSINESS_MESSAGING_START_CONVERSATION);
        this.b = aqqnVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dbsg<String> c = aqqn.c(this.f, "com.google.business.ACTION_MESSAGE");
        if (!c.a()) {
            this.b.a();
            return;
        }
        this.b.b(c.b(), apzb.START_CONVERSATION_INTENT, aqqn.d(this.f, "com.google.business.ACTION_MESSAGE"));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_BUSINESS_MESSAGING_START_CONVERSATION;
    }
}
