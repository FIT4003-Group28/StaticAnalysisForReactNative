package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuun  reason: default package */
/* loaded from: classes5.dex */
public final class cuun extends cuuh {
    private ConversationId a;
    private Integer b;
    private Boolean c;

    @Override // defpackage.cuuh
    public final void b(ConversationId conversationId) {
        if (conversationId != null) {
            this.a = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.cuuh
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cuuh
    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cuuh
    public final cuui a() {
        String str = this.a == null ? " conversationId" : "";
        if (this.b == null) {
            str = str.concat(" sizeInPx");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" darkMode");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuuo(this.a, this.b.intValue(), this.c.booleanValue());
    }
}
