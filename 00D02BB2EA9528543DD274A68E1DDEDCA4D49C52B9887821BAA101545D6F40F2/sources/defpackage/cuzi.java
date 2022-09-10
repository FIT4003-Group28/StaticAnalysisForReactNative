package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuzi  reason: default package */
/* loaded from: classes5.dex */
final class cuzi implements cuvj {
    final /* synthetic */ cuzo a;

    public cuzi(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // defpackage.cuvj
    public final void a(boolean z) {
        dehn<Void> b;
        this.a.j.j(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
        cuzo cuzoVar = this.a;
        cuzoVar.I = z;
        cuzoVar.a.k();
        if (z) {
            csud csudVar = cuzoVar.f;
            final ctyy ctyyVar = cuzoVar.i;
            final ConversationId conversationId = cuzoVar.b;
            ctmm c = ctmn.c();
            ((ctmh) c).a = "block conversation and mark spam";
            c.b(ctmr.c);
            final ctmn a = c.a();
            final csxc csxcVar = (csxc) csudVar;
            dehn<Void> f = deha.f(new deff(csxcVar, ctyyVar, conversationId, a) { // from class: cswt
                private final csxc a;
                private final ctyy b;
                private final ConversationId c;
                private final ctmn d;

                {
                    this.a = csxcVar;
                    this.b = ctyyVar;
                    this.c = conversationId;
                    this.d = a;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    csxc csxcVar2 = this.a;
                    return csxcVar2.g.a(this.b, this.c, this.d, true);
                }
            }, csxcVar.c);
            csxcVar.e.d(conversationId);
            b = csxcVar.b(f, ctyyVar, conversationId);
        } else {
            csud csudVar2 = cuzoVar.f;
            final ctyy ctyyVar2 = cuzoVar.i;
            final ConversationId conversationId2 = cuzoVar.b;
            ctmm c2 = ctmn.c();
            ((ctmh) c2).a = "block conversation";
            c2.b(ctmr.c);
            final ctmn a2 = c2.a();
            final csxc csxcVar2 = (csxc) csudVar2;
            dehn<Void> f2 = deha.f(new deff(csxcVar2, ctyyVar2, conversationId2, a2) { // from class: cswl
                private final csxc a;
                private final ctyy b;
                private final ConversationId c;
                private final ctmn d;

                {
                    this.a = csxcVar2;
                    this.b = ctyyVar2;
                    this.c = conversationId2;
                    this.d = a2;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    csxc csxcVar3 = this.a;
                    return csxcVar3.g.a(this.b, this.c, this.d, false);
                }
            }, csxcVar2.c);
            csxcVar2.e.d(conversationId2);
            b = csxcVar2.b(f2, ctyyVar2, conversationId2);
        }
        deha.q(b, new cuzh(cuzoVar), cstm.a());
        this.a.m();
    }

    @Override // defpackage.cuvj
    public final void b() {
        this.a.m();
    }
}
