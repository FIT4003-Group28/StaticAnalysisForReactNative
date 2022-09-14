package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuzx  reason: default package */
/* loaded from: classes5.dex */
final class cuzx extends AsyncTask<Void, Void, Void> {
    private final ctyy a;
    private final ConversationId b;
    private final csuk c;

    public cuzx(ctyy ctyyVar, ConversationId conversationId, csuk csukVar) {
        this.a = ctyyVar;
        this.b = conversationId;
        this.c = csukVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        csuk csukVar = this.c;
        final ctyy ctyyVar = this.a;
        final ConversationId conversationId = this.b;
        final ctct ctctVar = (ctct) csukVar;
        ctctVar.d.a(new Runnable(ctctVar, ctyyVar, conversationId) { // from class: ctax
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = ctctVar;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctct ctctVar2 = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                ctog ctogVar = ctctVar2.f;
                ctxm r = ctxn.r();
                r.g(10017);
                r.n(ctyyVar2.b().e());
                r.d(conversationId2);
                ctogVar.b(r.a());
                ctctVar2.H(ctyyVar2).t(conversationId2);
                ctog ctogVar2 = ctctVar2.f;
                ctxm r2 = ctxn.r();
                r2.g(10018);
                r2.n(ctyyVar2.b().e());
                r2.d(conversationId2);
                ctogVar2.b(r2.a());
                aqak aqakVar = (aqak) ctctVar2.c;
                auon a = aqakVar.k.a();
                a.d(a.h(4, aqakVar.b.a().f(conversationId2)));
                ctog ctogVar3 = ctctVar2.f;
                ctxm r3 = ctxn.r();
                r3.g(10019);
                r3.n(ctyyVar2.b().e());
                r3.d(conversationId2);
                ctogVar3.b(r3.a());
            }
        });
        for (ctuk ctukVar : ctctVar.s.values()) {
            ctukVar.g(conversationId);
        }
        return null;
    }
}
