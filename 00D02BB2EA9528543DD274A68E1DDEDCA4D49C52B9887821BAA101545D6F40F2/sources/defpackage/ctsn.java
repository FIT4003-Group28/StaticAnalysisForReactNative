package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctsn  reason: default package */
/* loaded from: classes5.dex */
public final class ctsn implements ctml<Void> {
    final /* synthetic */ ctmn a;
    final /* synthetic */ UUID b;
    final /* synthetic */ ctfw c;
    final /* synthetic */ dehn d;
    final /* synthetic */ ContactId e;
    final /* synthetic */ ctyy f;
    final /* synthetic */ ctss g;
    final /* synthetic */ ctwo h;

    public ctsn(ctss ctssVar, ctmn ctmnVar, UUID uuid, ctfw ctfwVar, ctwo ctwoVar, dehn dehnVar, ContactId contactId, ctyy ctyyVar) {
        this.g = ctssVar;
        this.a = ctmnVar;
        this.b = uuid;
        this.c = ctfwVar;
        this.h = ctwoVar;
        this.d = dehnVar;
        this.e = contactId;
        this.f = ctyyVar;
    }

    @Override // defpackage.ctml
    public final ctmn a() {
        return this.a;
    }

    @Override // defpackage.ctml
    public final dehn<Void> b() {
        ctss ctssVar = this.g;
        return ctssVar.k(this.b, this.c, this.h, ctssVar.e(this.d, this.e), this.f);
    }
}
