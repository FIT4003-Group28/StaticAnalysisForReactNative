package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.TimerTask;
/* compiled from: PG */
/* renamed from: cszt  reason: default package */
/* loaded from: classes5.dex */
final class cszt extends TimerTask {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ ContactId b;
    final /* synthetic */ cszw c;

    public cszt(cszw cszwVar, ConversationId conversationId, ContactId contactId) {
        this.c = cszwVar;
        this.a = conversationId;
        this.b = contactId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r4 < r1.u.get(r2).get(r3).longValue()) goto L11;
     */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            cszw r0 = r9.c
            java.lang.Object r0 = r0.t
            monitor-enter(r0)
            cszw r1 = r9.c     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ConversationId r2 = r9.a     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ContactId r3 = r9.b     // Catch: java.lang.Throwable -> L65
            defpackage.cstd.a()     // Catch: java.lang.Throwable -> L65
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            java.util.Map<com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.Map<com.google.android.libraries.messaging.lighter.model.ContactId, java.lang.Long>> r6 = r1.u     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.containsKey(r2)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L3f
            java.util.Map<com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.Map<com.google.android.libraries.messaging.lighter.model.ContactId, java.lang.Long>> r6 = r1.u     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Throwable -> L65
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.containsKey(r3)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L29
            goto L3f
        L29:
            java.util.Map<com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.Map<com.google.android.libraries.messaging.lighter.model.ContactId, java.lang.Long>> r1 = r1.u     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L65
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L65
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L65
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 < 0) goto L63
        L3f:
            cszw r1 = r9.c     // Catch: java.lang.Throwable -> L65
            csuy r1 = r1.g     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ConversationId r2 = r9.a     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ContactId r3 = r9.b     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L65
            defpackage.cstd.a()     // Catch: java.lang.Throwable -> L65
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            long r7 = defpackage.cszw.a     // Catch: java.lang.Throwable -> L65
            long r5 = r5 - r7
            long r4 = r4.toMicros(r5)     // Catch: java.lang.Throwable -> L65
            r1.c(r2, r3, r4)     // Catch: java.lang.Throwable -> L65
            cszw r1 = r9.c     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ConversationId r2 = r9.a     // Catch: java.lang.Throwable -> L65
            com.google.android.libraries.messaging.lighter.model.ContactId r3 = r9.b     // Catch: java.lang.Throwable -> L65
            r1.n(r2, r3)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            return
        L65:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cszt.run():void");
    }
}
