package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctcu  reason: default package */
/* loaded from: classes5.dex */
public final class ctcu {
    private final Map<ConversationId, cusy<dcdc<cugb>>> a;
    private final Map<ConversationId, Map<String, cugb>> b;

    public ctcu() {
        dchm dchmVar = new dchm();
        dchmVar.j();
        this.a = dchmVar.e();
        this.b = new HashMap();
    }

    public final synchronized cuss<dcdc<cugb>> a(ConversationId conversationId) {
        Collection<cugb> e;
        if (!this.a.containsKey(conversationId)) {
            if (this.b.containsKey(conversationId)) {
                e = this.b.get(conversationId).values();
            } else {
                e = dcdc.e();
            }
            cusy<dcdc<cugb>> cusyVar = new cusy<>(dcdc.r(e));
            this.a.put(conversationId, cusyVar);
            return cusyVar;
        }
        return this.a.get(conversationId);
    }

    public final synchronized void b(ConversationId conversationId, cugb cugbVar) {
        if (!this.b.containsKey(conversationId)) {
            this.b.put(conversationId, new LinkedHashMap());
        }
        this.b.get(conversationId).put(((cudl) cugbVar).a.a(), cugbVar);
        if (this.a.containsKey(conversationId)) {
            this.a.get(conversationId).a(dcdc.r(this.b.get(conversationId).values()));
        }
    }

    public final synchronized void c(ConversationId conversationId, String str) {
        if (this.b.containsKey(conversationId)) {
            this.b.get(conversationId).remove(str);
            if (this.a.containsKey(conversationId)) {
                this.a.get(conversationId).a(dcdc.r(this.b.get(conversationId).values()));
            }
            if (this.b.get(conversationId).isEmpty()) {
                this.b.remove(conversationId);
            }
        }
    }

    public final synchronized void d(ConversationId conversationId) {
        if (!this.b.containsKey(conversationId)) {
            return;
        }
        this.b.remove(conversationId);
        if (!this.a.containsKey(conversationId)) {
            return;
        }
        this.a.get(conversationId).a(dcdc.e());
    }
}
