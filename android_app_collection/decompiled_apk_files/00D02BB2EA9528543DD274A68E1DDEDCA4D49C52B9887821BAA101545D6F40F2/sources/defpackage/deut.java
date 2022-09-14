package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: deut  reason: default package */
/* loaded from: classes6.dex */
final class deut implements deqn<deuw> {
    @Override // defpackage.deql
    public final /* bridge */ /* synthetic */ void a(Object obj, deqo deqoVar) {
        deuw deuwVar = (deuw) obj;
        Intent intent = deuwVar.b;
        deqoVar.a("ttl", deuz.b(intent));
        deqw deqwVar = (deqw) deqoVar;
        deqwVar.f("event", deuwVar.a);
        deqwVar.f("instanceId", deuz.h());
        deqoVar.a("priority", deuz.k(intent));
        deqwVar.f("packageName", deuz.g());
        deqwVar.f("sdkPlatform", "ANDROID");
        deqwVar.f("messageType", deuz.i(intent));
        String f = deuz.f(intent);
        if (f != null) {
            deqwVar.f("messageId", f);
        }
        String j = deuz.j(intent);
        if (j != null) {
            deqwVar.f("topic", j);
        }
        String c = deuz.c(intent);
        if (c != null) {
            deqwVar.f("collapseKey", c);
        }
        if (deuz.e(intent) != null) {
            deqwVar.f("analyticsLabel", deuz.e(intent));
        }
        if (deuz.d(intent) != null) {
            deqwVar.f("composerLabel", deuz.d(intent));
        }
        String l = deuz.l();
        if (l != null) {
            deqwVar.f("projectNumber", l);
        }
    }
}
