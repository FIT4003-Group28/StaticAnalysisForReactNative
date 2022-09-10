package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: apza  reason: default package */
/* loaded from: classes2.dex */
public abstract class apza {
    public abstract apzc a();

    public abstract void b(ConversationId conversationId);

    public abstract void c(String str);

    public abstract void d(apzb apzbVar);

    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    public final apzc e() {
        apzc a = a();
        ?? a2 = a.b().a();
        int i = a2;
        if (!dbsj.d(a.c().f())) {
            i = a2 + 1;
        }
        int i2 = i;
        if (!dbsj.d(a.e().f())) {
            i2 = i + 1;
        }
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        dbsk.b(z, "Exactly one of conversationId or intentArg or gaiaId must be provided.");
        return a;
    }
}
