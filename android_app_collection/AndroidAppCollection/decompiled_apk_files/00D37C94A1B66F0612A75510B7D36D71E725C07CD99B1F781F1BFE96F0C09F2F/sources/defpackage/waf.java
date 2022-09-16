package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: waf  reason: default package */
/* loaded from: classes4.dex */
public final class waf implements yiw {
    final /* synthetic */ wai a;

    public waf(wai waiVar) {
        this.a = waiVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        aarw aarwVar = (aarw) obj2;
        this.a.a.o(AccountIdentity.n(aarwVar.i(), aarwVar.g(), aarwVar.j(), aarwVar.h()));
        this.a.b.q(new waj(aarwVar.g(), aarwVar));
    }
}
