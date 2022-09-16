package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
/* compiled from: PG */
/* renamed from: wae  reason: default package */
/* loaded from: classes4.dex */
public final class wae implements yiw {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ wai b;

    public wae(wai waiVar, AccountIdentity accountIdentity) {
        this.b = waiVar;
        this.a = accountIdentity;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        afvm afvmVar = (afvm) obj;
        this.b.a.r(false);
        this.b.d.d(new afwd());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        afvm afvmVar = (afvm) obj;
        aarw aarwVar = (aarw) obj2;
        String i = aarwVar.i();
        C$AutoValue_AccountIdentity c$AutoValue_AccountIdentity = (C$AutoValue_AccountIdentity) this.a;
        AccountIdentity n = AccountIdentity.n(i, c$AutoValue_AccountIdentity.b, c$AutoValue_AccountIdentity.c, aarwVar.h());
        this.b.a.o(n);
        this.b.d.d(new afwb(n));
        this.b.b.q(new waj(((C$AutoValue_AccountIdentity) this.a).b, aarwVar));
        this.b.d.d(new wak());
    }
}
