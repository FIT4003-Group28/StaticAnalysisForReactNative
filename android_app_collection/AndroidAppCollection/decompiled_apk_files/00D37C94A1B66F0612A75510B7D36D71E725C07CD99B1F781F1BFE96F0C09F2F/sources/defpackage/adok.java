package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: adok  reason: default package */
/* loaded from: classes.dex */
public final class adok {
    final /* synthetic */ adol a;

    public adok(adol adolVar) {
        this.a = adolVar;
    }

    public final void a(adom adomVar) {
        this.a.e = ampq.j(adomVar);
        adol adolVar = this.a;
        adolVar.e(adolVar.c.toMillis());
    }

    public final void b(adis adisVar) {
        if (!TextUtils.equals(adisVar.c, this.a.d.c)) {
            zep.h(adol.a, String.format("Setting new short lived lounge token to be used: %s", adisVar));
            adol adolVar = this.a;
            adolVar.d = adisVar;
            adolVar.f = false;
            adolVar.e(adisVar.b.toMillis());
            return;
        }
        zep.h(adol.a, String.format("Found a short lived lounge token, but it is stale: %s", adisVar));
        this.a.e = ampq.j(adom.STALE_LOUNGE_TOKEN);
        adol adolVar2 = this.a;
        adolVar2.e(adolVar2.c.toMillis());
    }
}
