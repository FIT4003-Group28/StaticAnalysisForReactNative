package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: apyl  reason: default package */
/* loaded from: classes2.dex */
public final class apyl extends apza {
    private apzb e;
    private dbsg<ConversationId> f = dbpy.a;
    private dbsg<String> g = dbpy.a;
    public dbsg<String> a = dbpy.a;
    private final dbsg<String> h = dbpy.a;
    public dbsg<Long> b = dbpy.a;
    public dbsg<apys> c = dbpy.a;
    public dbsg<dcep<String>> d = dbpy.a;

    @Override // defpackage.apza
    public final void b(ConversationId conversationId) {
        this.f = dbsg.i(conversationId);
    }

    @Override // defpackage.apza
    public final void c(String str) {
        this.g = dbsg.i(str);
    }

    @Override // defpackage.apza
    public final void d(apzb apzbVar) {
        if (apzbVar != null) {
            this.e = apzbVar;
            return;
        }
        throw new NullPointerException("Null openConversationEntryPointType");
    }

    @Override // defpackage.apza
    public final apzc a() {
        String str = this.e == null ? " openConversationEntryPointType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new apym(this.e, this.f, this.g, this.a, this.h, this.b, this.c, this.d);
    }
}
