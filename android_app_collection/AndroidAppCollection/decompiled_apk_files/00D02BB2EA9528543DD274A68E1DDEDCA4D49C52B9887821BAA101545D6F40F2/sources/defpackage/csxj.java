package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: csxj  reason: default package */
/* loaded from: classes5.dex */
public final class csxj implements csue {
    public static csxj a;
    public final ctgc b;
    public final csud c;
    public final csuk d;
    public final ctog e;
    public final Context h;
    public final ctsy i;
    private final ConcurrentMap<Long, Boolean> j = dcjz.j();
    final ConcurrentMap<Long, Long> g = dcjz.j();
    public final dehp f = cstu.b().a;

    public csxj(Context context, ctgc ctgcVar, ctsy ctsyVar, csud csudVar, csuk csukVar, ctog ctogVar) {
        this.h = context;
        this.b = ctgcVar;
        this.i = ctsyVar;
        this.c = csudVar;
        this.d = csukVar;
        this.e = ctogVar;
    }

    public static String c(ConversationId conversationId) {
        String h = h(conversationId.a());
        String h2 = h(conversationId.e());
        String name = conversationId.c().name();
        int length = String.valueOf(h).length();
        StringBuilder sb = new StringBuilder(length + 3 + String.valueOf(h2).length() + String.valueOf(name).length());
        sb.append(h);
        sb.append("_");
        sb.append(h2);
        sb.append("_");
        sb.append(name);
        sb.append("_");
        String sb2 = sb.toString();
        if (ConversationId.IdType.GROUP.equals(conversationId.c())) {
            String valueOf = String.valueOf(sb2);
            String b = conversationId.d().b();
            String a2 = conversationId.d().a();
            int length2 = String.valueOf(valueOf).length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + String.valueOf(b).length() + String.valueOf(a2).length());
            sb3.append(valueOf);
            sb3.append(b);
            sb3.append("_");
            sb3.append(a2);
            sb2 = sb3.toString();
        }
        String valueOf2 = String.valueOf(dczd.a.a(sb2, dbrc.c));
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
        sb4.append("BOOTSTRAP_DOWNLOAD_MESSAGES_TOKEN_KEY_PREFIX_");
        sb4.append(valueOf2);
        return sb4.toString();
    }

    private static String h(ContactId contactId) {
        String a2 = contactId.a();
        String b = contactId.b();
        String name = contactId.c().name();
        int length = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(b).length() + String.valueOf(name).length());
        sb.append(a2);
        sb.append("_");
        sb.append(b);
        sb.append("_");
        sb.append(name);
        String sb2 = sb.toString();
        if (contactId.d().a()) {
            String valueOf = String.valueOf(sb2);
            String b2 = contactId.d().b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(b2).length());
            sb3.append(valueOf);
            sb3.append("_");
            sb3.append(b2);
            return sb3.toString();
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(ctyy ctyyVar) {
        ctge c = this.b.c(ctyyVar);
        dbsg<byte[]> a2 = c.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
        if (this.g.containsKey(Long.valueOf(ctyyVar.a()))) {
            cstd.a();
            if (System.currentTimeMillis() - this.g.get(Long.valueOf(ctyyVar.a())).longValue() < dxzy.a.a().J() && !a2.a()) {
                cstl.a("LitBstrpCntrl");
                return false;
            }
        }
        long S = this.b.a(ctyyVar).S();
        if (!a2.a()) {
            c.c("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP", decn.e(S));
            StringBuilder sb = new StringBuilder(76);
            sb.append(" Saving latest message timestamp to kv store with value ");
            sb.append(S);
            sb.toString();
            cstl.a("LitBstrpCntrl");
        }
        ConcurrentMap<Long, Long> concurrentMap = this.g;
        Long valueOf = Long.valueOf(ctyyVar.a());
        cstd.a();
        concurrentMap.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<ctqi> b(final ctyy ctyyVar) {
        dbsg<byte[]> a2 = this.b.c(ctyyVar).a("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY");
        if (!a2.a() || "BOOTSTRAP_TOKEN_FINISH_VALUE".equals(new String(a2.b()))) {
            if (!a2.a()) {
                ctoh.a(ctyyVar, this.e, 10099, 403);
            }
            ctqh c = ctqi.c();
            c.c(true);
            c.b(0);
            return deha.a(c.a());
        }
        String str = new String(a2.b());
        ctoh.a(ctyyVar, this.e, 10099, true != str.isEmpty() ? 402 : 401);
        if ((true != str.isEmpty() ? str : "inital token").length() == 0) {
            new String("Start downloading conversation with token ");
        }
        cstl.a("LitBstrpCntrl");
        return deew.h(d(ctyyVar, str, true, 0), new dbrn(this, ctyyVar) { // from class: csxe
            private final csxj a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csxj csxjVar = this.a;
                ctyy ctyyVar2 = this.b;
                ctqi ctqiVar = (ctqi) obj;
                if (ctqiVar.a()) {
                    ctoh.a(ctyyVar2, csxjVar.e, 10099, 404);
                    cstl.a("LitBstrpCntrl");
                    csxjVar.c.a(ctyyVar2);
                }
                return ctqiVar;
            }
        }, this.f);
    }

    public final dehn<ctqi> d(final ctyy ctyyVar, String str, boolean z, final int i) {
        if ("BOOTSTRAP_TOKEN_FINISH_VALUE".equals(str) || (TextUtils.isEmpty(str) && !z)) {
            ctqh c = ctqi.c();
            c.b(i);
            c.c(true);
            return deha.a(c.a());
        }
        ctmm c2 = ctmn.c();
        ((ctmh) c2).a = "Bootstrap List Conversations";
        c2.b(ctmr.c);
        ctmn a2 = c2.a();
        ctsy ctsyVar = this.i;
        return deew.g(ctsyVar.a.a(UUID.randomUUID(), new ctwd(ctyyVar, (int) dxzy.a.a().G(), str, ctsyVar.b, ctsyVar.d, ctsyVar.c), ctsyVar.a.d.f(), ctyyVar, a2, true), new defg(this, ctyyVar, i) { // from class: csxg
            private final csxj a;
            private final ctyy b;
            private final int c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csxj csxjVar = this.a;
                final ctyy ctyyVar2 = this.b;
                int i2 = this.c;
                ctfl ctflVar = (ctfl) obj;
                cusm a3 = csxjVar.b.a(ctyyVar2);
                ctge c3 = csxjVar.b.c(ctyyVar2);
                dcdc<cufd> b = ctflVar.b();
                int size = b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cufd cufdVar = b.get(i3);
                    cufh[] cufhVarArr = new cufh[cufdVar.b().a().size()];
                    for (int i4 = 0; i4 < cufdVar.b().a().size(); i4++) {
                        cufhVarArr[i4] = cufdVar.b().a().get(i4);
                    }
                    a3.h(cufdVar.a(), cufhVarArr);
                    c3.c(csxj.c(cufdVar.a()), "".getBytes(dbrc.c));
                    csuk csukVar = csxjVar.d;
                    final ConversationId a4 = cufdVar.a();
                    final deig d = deig.d();
                    final ctct ctctVar = (ctct) csukVar;
                    deha.d(new Callable(ctctVar, ctyyVar2, a4, d) { // from class: ctak
                        private final ctct a;
                        private final ctyy b;
                        private final ConversationId c;
                        private final deig d;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                            this.c = a4;
                            this.d = d;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final ctct ctctVar2 = this.a;
                            final ctyy ctyyVar3 = this.b;
                            final ConversationId conversationId = this.c;
                            final deig deigVar = this.d;
                            ctctVar2.H(ctyyVar3).r(conversationId).k(new cusr(ctctVar2, deigVar, ctyyVar3, conversationId) { // from class: ctce
                                private final ctct a;
                                private final deig b;
                                private final ctyy c;
                                private final ConversationId d;

                                {
                                    this.a = ctctVar2;
                                    this.b = deigVar;
                                    this.c = ctyyVar3;
                                    this.d = conversationId;
                                }

                                @Override // defpackage.cusr
                                public final void a(Object obj2) {
                                    ctct ctctVar3 = this.a;
                                    deig deigVar2 = this.b;
                                    ctyy ctyyVar4 = this.c;
                                    ConversationId conversationId2 = this.d;
                                    dbsg dbsgVar = (dbsg) obj2;
                                    if (dbsgVar.a()) {
                                        cstd.a();
                                        if (System.currentTimeMillis() <= ((cufp) dbsgVar.b()).f().longValue()) {
                                            deigVar2.j((cufp) dbsgVar.b());
                                            return;
                                        }
                                    }
                                    cufo o = cufp.o();
                                    o.e(conversationId2);
                                    o.f(-1L);
                                    o.b(new HashMap());
                                    o.c(conversationId2.c() == ConversationId.IdType.ONE_TO_ONE);
                                    deigVar2.p(ctctVar3.D(ctyyVar4, o.a(), true));
                                }
                            });
                            return null;
                        }
                    }, dege.a);
                }
                String a5 = ctflVar.a();
                if (true == TextUtils.isEmpty(a5)) {
                    a5 = "BOOTSTRAP_TOKEN_FINISH_VALUE";
                }
                c3.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", a5.getBytes(dbrc.c));
                return csxjVar.d(ctyyVar2, ctflVar.a(), false, ctflVar.b().size() + i2);
            }
        }, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(ctyy ctyyVar) {
        if (!this.j.containsKey(Long.valueOf(ctyyVar.a())) || !this.j.get(Long.valueOf(ctyyVar.a())).booleanValue()) {
            this.j.put(Long.valueOf(ctyyVar.a()), true);
            return true;
        }
        return false;
    }

    public final synchronized void f(ctyy ctyyVar) {
        cstl.a("LitBstrpCntrl");
        this.j.put(Long.valueOf(ctyyVar.a()), false);
    }

    public final dehn<Boolean> g(final ctyy ctyyVar, final ConversationId conversationId, String str, boolean z) {
        if ((TextUtils.isEmpty(str) && !z) || "BOOTSTRAP_TOKEN_FINISH_VALUE".equals(str)) {
            ctoh.a(ctyyVar, this.e, 10100, 408);
            return deha.a(true);
        }
        ctmm c = ctmn.c();
        ((ctmh) c).a = "Bootstrap List Messages";
        c.b(ctmr.c);
        ctmn a2 = c.a();
        ctsy ctsyVar = this.i;
        long H = dxzy.a.a().H();
        return deew.g(ctsyVar.a.a(UUID.randomUUID(), new ctwg(ctyyVar, (int) H, str, dcdc.f(conversationId), ctsyVar.b, ctsyVar.d, ctsyVar.c), ctsyVar.a.d.f(), ctyyVar, a2, true), new defg(this, ctyyVar, conversationId) { // from class: csxh
            private final csxj a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csxj csxjVar = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                ctfn ctfnVar = (ctfn) obj;
                ctge c2 = csxjVar.b.c(ctyyVar2);
                int size = ctfnVar.b().size();
                cufh[] cufhVarArr = new cufh[size];
                for (int i = 0; i < ctfnVar.b().size(); i++) {
                    cufhVarArr[i] = ctfnVar.b().get(i);
                }
                csxjVar.b.a(ctyyVar2).h(conversationId2, cufhVarArr);
                StringBuilder sb = new StringBuilder(38);
                sb.append("saved ");
                sb.append(size);
                sb.append(" messages to database");
                sb.toString();
                cstl.a("LitBstrpCntrl");
                String a3 = ctfnVar.a();
                if (true == TextUtils.isEmpty(a3)) {
                    a3 = "BOOTSTRAP_TOKEN_FINISH_VALUE";
                }
                c2.c(csxj.c(conversationId2), a3.getBytes());
                return csxjVar.g(ctyyVar2, conversationId2, ctfnVar.a(), false);
            }
        }, this.f);
    }
}
