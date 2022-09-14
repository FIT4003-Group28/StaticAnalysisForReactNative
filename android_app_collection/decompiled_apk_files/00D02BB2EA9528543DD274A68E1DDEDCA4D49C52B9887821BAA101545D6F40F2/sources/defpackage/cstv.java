package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cstv  reason: default package */
/* loaded from: classes5.dex */
final class cstv extends csub {
    private String a;
    private dcdc<ConversationId> b;

    @Override // defpackage.csub
    public final void b(dcdc<ConversationId> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null conversationIds");
    }

    @Override // defpackage.csub
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null nextPageToken");
    }

    @Override // defpackage.csub
    public final csuc a() {
        String str = this.a == null ? " nextPageToken" : "";
        if (this.b == null) {
            str = str.concat(" conversationIds");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cstw(this.a, this.b);
    }
}
