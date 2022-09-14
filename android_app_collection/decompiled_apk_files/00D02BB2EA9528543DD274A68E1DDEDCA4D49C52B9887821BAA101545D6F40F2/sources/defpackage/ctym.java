package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId_GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctym  reason: default package */
/* loaded from: classes5.dex */
public final class ctym extends cufr {
    private String a;
    private String b;

    @Override // defpackage.cufr
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null appName");
    }

    @Override // defpackage.cufr
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cufr
    public final ConversationId.GroupId a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" appName");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ConversationId_GroupId(this.a, this.b);
    }
}
