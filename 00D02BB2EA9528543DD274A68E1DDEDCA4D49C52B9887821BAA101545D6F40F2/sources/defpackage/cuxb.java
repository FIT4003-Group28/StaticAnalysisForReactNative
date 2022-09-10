package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuxb  reason: default package */
/* loaded from: classes5.dex */
public final class cuxb implements cuwy {
    private static final cuwx h = cuxa.a;
    public final cuwz a;
    public cuuf c;
    private final csuy e;
    private final ctyy f;
    private final ConversationId g;
    public cuwx b = h;
    public boolean d = false;

    public cuxb(ctyy ctyyVar, ConversationId conversationId, csuy csuyVar, cuwz cuwzVar) {
        this.f = ctyyVar;
        this.g = conversationId;
        this.e = csuyVar;
        this.a = cuwzVar;
        cuwzVar.setPresenter(this);
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.d = false;
        cuuf cuufVar = this.c;
        if (cuufVar != null) {
            cuufVar.A();
        }
    }

    @Override // defpackage.cuvu
    public final void B() {
        this.d = false;
    }

    @Override // defpackage.cuwy
    public final void a(String str) {
        this.b.a(str);
    }

    @Override // defpackage.cuwy
    public final void b(boolean z) {
        if (!z) {
            this.e.f(this.f, this.g);
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.d = true;
        cuuf cuufVar = this.c;
        if (cuufVar != null) {
            cuufVar.z();
        }
    }
}
