package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctso  reason: default package */
/* loaded from: classes5.dex */
public final class ctso implements ctml {
    final /* synthetic */ ctmn a;
    final /* synthetic */ UUID b;
    final /* synthetic */ int c;
    final /* synthetic */ ctxf d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dehn f;
    final /* synthetic */ ContactId g;
    final /* synthetic */ ctyy h;
    final /* synthetic */ ctzp i;
    final /* synthetic */ ctss j;

    public ctso(ctss ctssVar, ctmn ctmnVar, UUID uuid, int i, ctxf ctxfVar, boolean z, dehn dehnVar, ContactId contactId, ctyy ctyyVar, ctzp ctzpVar) {
        this.j = ctssVar;
        this.a = ctmnVar;
        this.b = uuid;
        this.c = i;
        this.d = ctxfVar;
        this.e = z;
        this.f = dehnVar;
        this.g = contactId;
        this.h = ctyyVar;
        this.i = ctzpVar;
    }

    @Override // defpackage.ctml
    public final ctmn a() {
        return this.a;
    }

    @Override // defpackage.ctml
    public final dehn b() {
        dehn dehnVar;
        ctss ctssVar = this.j;
        UUID uuid = this.b;
        int i = this.c;
        ctxf ctxfVar = this.d;
        if (this.e) {
            dehnVar = ctssVar.e(this.f, this.g);
        } else {
            dehnVar = this.f;
        }
        return ctssVar.d(uuid, i, ctxfVar, dehnVar, this.h, this.i);
    }
}
