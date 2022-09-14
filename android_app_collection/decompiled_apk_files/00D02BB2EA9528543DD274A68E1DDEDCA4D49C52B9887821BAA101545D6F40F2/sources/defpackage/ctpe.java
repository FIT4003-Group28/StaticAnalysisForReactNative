package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctpe  reason: default package */
/* loaded from: classes5.dex */
public final class ctpe extends ctqf {
    public dbsg<ConversationId> a = dbpy.a;
    public dbsg<ctqu> b = dbpy.a;
    private Boolean c;

    @Override // defpackage.ctqf
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.ctqf
    public final ctqg a() {
        String str = this.c == null ? " syncBlockStatus" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ctpf(this.a, this.c.booleanValue(), this.b);
    }
}
