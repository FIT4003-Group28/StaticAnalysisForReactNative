package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqgc  reason: default package */
/* loaded from: classes2.dex */
public final class aqgc implements aqgn {
    private final btvo a;
    private final bvjj b;
    private final apyv c;

    public aqgc(btvo btvoVar, bvjj bvjjVar, apyv apyvVar) {
        this.a = btvoVar;
        this.b = bvjjVar;
        this.c = apyvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r3.contains(r0.b()) != false) goto L13;
     */
    @Override // defpackage.aqgn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.libraries.messaging.lighter.model.ConversationId r6) {
        /*
            r5 = this;
            bvjj r0 = r5.b
            bvjk r1 = defpackage.bvjk.bo
            r2 = 0
            boolean r0 = r0.m(r1, r2)
            r1 = 1
            if (r0 != 0) goto L4e
            com.google.android.libraries.messaging.lighter.model.ConversationId$IdType r0 = r6.c()     // Catch: java.lang.Exception -> L3c
            com.google.android.libraries.messaging.lighter.model.ConversationId$IdType r3 = com.google.android.libraries.messaging.lighter.model.ConversationId.IdType.ONE_TO_ONE     // Catch: java.lang.Exception -> L3c
            if (r0 == r3) goto L15
            goto L3d
        L15:
            com.google.android.libraries.messaging.lighter.model.ContactId r0 = r6.e()     // Catch: java.lang.Exception -> L3c
            dbsg r0 = r0.d()     // Catch: java.lang.Exception -> L3c
            boolean r3 = r0.a()     // Catch: java.lang.Exception -> L3c
            if (r3 == 0) goto L3d
            btvo r3 = r5.a     // Catch: java.lang.Exception -> L3c
            dkht r3 = r3.getBusinessMessagingParameters()     // Catch: java.lang.Exception -> L3c
            dsrj<java.lang.String> r3 = r3.h     // Catch: java.lang.Exception -> L3c
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L3c
            if (r4 != 0) goto L4b
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> L3c
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3d
            goto L4b
        L3c:
        L3d:
            apyv r0 = r5.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L4d
            boolean r6 = r5.c(r6)
            if (r6 == 0) goto L4d
        L4b:
            r2 = 1
        L4d:
            return r2
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgc.a(com.google.android.libraries.messaging.lighter.model.ConversationId):boolean");
    }

    @Override // defpackage.aqgn
    public final boolean b(@dzsi cufw cufwVar) {
        if (cufwVar == null) {
            return false;
        }
        return a(cufwVar.a());
    }

    @Override // defpackage.aqgn
    public final boolean c(ConversationId conversationId) {
        if (conversationId.c() != ConversationId.IdType.GROUP) {
            return false;
        }
        dsrj<String> dsrjVar = this.a.getBusinessMessagingParameters().P;
        return dsrjVar.isEmpty() || dsrjVar.contains(conversationId.d().b());
    }
}
