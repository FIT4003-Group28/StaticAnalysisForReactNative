package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvgb  reason: default package */
/* loaded from: classes5.dex */
public final class cvgb implements cvfy, cusr {
    public final cvfz b;
    private final csuf c;
    private final ctyy d;
    private final cuss<dcdc<ContactId>> e;
    private cusr<cusv> g;
    public dcdc<ContactId> a = null;
    private cusw f = null;

    public cvgb(cvfz cvfzVar, ctyy ctyyVar, ConversationId conversationId, csuf csufVar, csuy csuyVar) {
        this.b = cvfzVar;
        cvfzVar.setPresenter(this);
        this.d = ctyyVar;
        this.c = csufVar;
        this.e = csuyVar.a(conversationId);
    }

    private final void b() {
        cusw cuswVar = this.f;
        if (cuswVar != null) {
            cuswVar.g(this.g);
            this.f = null;
            this.g = null;
        }
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.e.g(this);
        b();
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cusr
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dcdc<ContactId> dcdcVar = (dcdc) obj;
        b();
        this.a = dcdcVar;
        final ArrayList arrayList = new ArrayList();
        if (dcdcVar.isEmpty()) {
            this.b.a(Arrays.asList(new cufj[0]));
        }
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.c.b(this.d, dcdcVar.get(i)));
        }
        this.g = new cusr(this, dcdcVar, arrayList) { // from class: cvga
            private final cvgb a;
            private final dcdc b;
            private final List c;

            {
                this.a = this;
                this.b = dcdcVar;
                this.c = arrayList;
            }

            @Override // defpackage.cusr
            public final void a(Object obj2) {
                cvgb cvgbVar = this.a;
                dcdc dcdcVar2 = this.b;
                List<cuss> list = this.c;
                cusv cusvVar = (cusv) obj2;
                if (dbsd.a(dcdcVar2, cvgbVar.a)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (cuss cussVar : list) {
                        arrayList2.add((cufj) cusvVar.a(cussVar));
                    }
                    cvgbVar.b.a(arrayList2);
                }
            }
        };
        cusw e = cusw.e(arrayList);
        this.f = e;
        e.q(this.g);
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.e.q(this);
        this.b.setMaxAvatars((int) dxzv.a.a().b());
    }
}
