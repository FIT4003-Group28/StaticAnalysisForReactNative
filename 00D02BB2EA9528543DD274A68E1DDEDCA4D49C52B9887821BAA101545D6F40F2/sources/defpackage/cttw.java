package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cttw  reason: default package */
/* loaded from: classes5.dex */
public final class cttw implements degu<Void> {
    final /* synthetic */ ctyy a;
    final /* synthetic */ ctxe b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ cttz d;

    public cttw(cttz cttzVar, ctyy ctyyVar, ctxe ctxeVar, ConversationId conversationId) {
        this.d = cttzVar;
        this.a = ctyyVar;
        this.b = ctxeVar;
        this.c = conversationId;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ctog ctogVar = this.d.c;
        ctxm r = ctxn.r();
        r.g(20);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(this.b.a);
        r.d(this.c);
        ctogVar.b(r.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        ctog ctogVar = this.d.c;
        ctxm r = ctxn.r();
        r.g(19);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(this.b.a);
        r.d(this.c);
        ctogVar.b(r.a());
    }
}
