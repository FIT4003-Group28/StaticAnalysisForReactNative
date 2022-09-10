package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: cyty  reason: default package */
/* loaded from: classes5.dex */
final class cyty extends cyvd<czcl, czfo> {
    final /* synthetic */ cytq a;
    final /* synthetic */ cywa b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cyem d;
    final /* synthetic */ cyua e;

    public cyty(cyua cyuaVar, cytq cytqVar, cywa cywaVar, boolean z, cyem cyemVar) {
        this.e = cyuaVar;
        this.a = cytqVar;
        this.b = cywaVar;
        this.c = z;
        this.d = cyemVar;
    }

    @Override // defpackage.cyvd
    protected final /* bridge */ /* synthetic */ void a(czcl czclVar, czfo czfoVar) {
        AutocompletionCallbackMetadata a;
        dcdc<cywi> dcdcVar;
        boolean c;
        czcl czclVar2 = czclVar;
        czfo czfoVar2 = czfoVar;
        cydx c2 = cydx.c(cyer.PEOPLE_API_AUTOCOMPLETE, czclVar2.b());
        int i = 1;
        boolean z = czclVar2.a().isEmpty() && (!dyaq.b() ? this.b.a() != cygp.COALESCED : !this.a.b.isEmpty());
        if (z) {
            dcdc<cywi> c3 = czfoVar2.c();
            cydr b = czfoVar2.g().b();
            b.b(cyds.WAITED_FOR_RESULTS);
            a = b.a();
            c = czfoVar2.h();
            dcdcVar = c3;
        } else {
            dcdc<cywi> a2 = czclVar2.a();
            cydr e = AutocompletionCallbackMetadata.e();
            cybv cybvVar = (cybv) e;
            cybvVar.a = 5;
            if (czclVar2.b() == cyes.FAILED_NETWORK) {
                i = 2;
            }
            cybvVar.b = i;
            e.b(cyds.WAITED_FOR_RESULTS);
            a = e.a();
            dcdcVar = a2;
            c = czclVar2.c();
        }
        dcdc<cyvs> g = this.e.g(dcdcVar, this.a, this.b, z, false, cyer.PEOPLE_API_AUTOCOMPLETE);
        cytn i2 = cyto.i();
        i2.e(g);
        cyte cyteVar = (cyte) i2;
        cyteVar.b = c2;
        i2.f(this.c);
        cyteVar.d = a;
        i2.d(c);
        i2.g(5);
        this.d.a(i2.h());
    }
}
