package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvbh  reason: default package */
/* loaded from: classes5.dex */
public final class cvbh {
    final Set<ContactId> a;
    final cuss<dcdc<cufj>> b;
    final cuss<dcdc<cugu>> c;
    final cuss<Integer> d;
    final cuss<cufp> e;
    final cusy<dcdc<cufj>> f;
    final cusw g;
    final /* synthetic */ cvbi h;
    private cusr<cusv> i;
    private final cusr<dcdc<cufj>> j;
    private final cusr<dcdc<cugu>> k;

    public cvbh(cvbi cvbiVar, final ConversationId conversationId, cuss<dcdc<cufj>> cussVar, cuss<dcdc<cugu>> cussVar2, cuss<Integer> cussVar3, cuss<cufp> cussVar4) {
        this.h = cvbiVar;
        this.b = cussVar;
        this.c = cussVar2;
        this.d = cussVar3;
        this.e = cussVar4;
        cusy<dcdc<cufj>> cusyVar = new cusy<>();
        this.f = cusyVar;
        this.a = new HashSet();
        this.g = cusw.d(cusyVar, cussVar2, cussVar3, cussVar4);
        this.j = new cusr(this, conversationId) { // from class: cvbe
            private final cvbh a;
            private final ConversationId b;

            {
                this.a = this;
                this.b = conversationId;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.a(this.b, (dcdc) obj);
            }
        };
        this.k = new cusr(this, conversationId) { // from class: cvbf
            private final cvbh a;
            private final ConversationId b;

            {
                this.a = this;
                this.b = conversationId;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                final cvbh cvbhVar = this.a;
                final ConversationId conversationId2 = this.b;
                dcdc dcdcVar = (dcdc) obj;
                if (dcdcVar.isEmpty() || cvbhVar.h.f.containsKey(((cugu) dcdcVar.get(0)).b())) {
                    return;
                }
                cvbi cvbiVar2 = cvbhVar.h;
                cvbiVar2.b.b(cvbiVar2.c, ((cugu) dcdcVar.get(0)).b()).k(new cusr(cvbhVar, conversationId2) { // from class: cvbg
                    private final cvbh a;
                    private final ConversationId b;

                    {
                        this.a = cvbhVar;
                        this.b = conversationId2;
                    }

                    @Override // defpackage.cusr
                    public final void a(Object obj2) {
                        this.a.a(this.b, dcdc.f((cufj) obj2));
                    }
                });
            }
        };
    }

    public final void a(ConversationId conversationId, dcdc<cufj> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.a.add(dcdcVar.get(i).a());
        }
        this.h.d(conversationId, dcdcVar);
        this.h.f(this.f, dcep.K(this.a));
    }

    public final void b(cusr<cusv> cusrVar) {
        if (this.i != null) {
            this.c.g(this.k);
            this.b.g(this.j);
            this.g.g(this.i);
        }
        this.i = cusrVar;
        if (cusrVar != null) {
            this.c.q(this.k);
            this.b.q(this.j);
            this.g.q(this.i);
        }
    }
}
