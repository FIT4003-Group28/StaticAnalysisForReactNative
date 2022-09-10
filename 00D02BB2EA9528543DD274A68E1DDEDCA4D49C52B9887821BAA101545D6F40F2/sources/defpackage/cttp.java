package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cttp  reason: default package */
/* loaded from: classes5.dex */
public final class cttp {
    public final ctss a;

    public cttp(ctss ctssVar) {
        this.a = ctssVar;
    }

    public final dehn<Void> a(ctyy ctyyVar, ConversationId conversationId, ctmn ctmnVar, boolean z) {
        return this.a.a(UUID.randomUUID(), new ctvn(ctyyVar, conversationId, z), this.a.d.c(), ctyyVar, ctmnVar, true);
    }
}
