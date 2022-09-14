package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aztx  reason: default package */
/* loaded from: classes3.dex */
final class aztx implements akey {
    final /* synthetic */ dndr a;
    final /* synthetic */ String b;
    final /* synthetic */ akqq c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ azty g;

    public aztx(azty aztyVar, dndr dndrVar, String str, akqq akqqVar, boolean z, boolean z2, String str2) {
        this.g = aztyVar;
        this.a = dndrVar;
        this.b = str;
        this.c = akqqVar;
        this.d = z;
        this.e = z2;
        this.f = str2;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        azty aztyVar = this.g;
        dndr dndrVar = this.a;
        String str = this.b;
        akqq akqqVar = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        String str2 = this.f;
        aztyVar.b.a().o();
        if (akqqVar == null) {
            axwv n = axww.n();
            n.b(dndrVar);
            n.c(str);
            n.d(false);
            axvv axvvVar = (axvv) n;
            axvvVar.a = dtxr.bY;
            axvvVar.b = str2;
            axvvVar.g = dpyv.SET_ALIAS;
            aztyVar.b.a().L(n.h());
        } else if (z2) {
            axwv n2 = axww.n();
            n2.b(dndrVar);
            n2.c(str);
            n2.d(true);
            axvv axvvVar2 = (axvv) n2;
            axvvVar2.a = dtxr.bY;
            axvvVar2.b = str2;
            axvvVar2.e = akqqVar;
            n2.f(z3);
            axvvVar2.g = dpyv.SET_ALIAS;
            aztyVar.b.a().L(n2.h());
        } else {
            aztyVar.b.a().O(dndrVar, akqqVar, aztyVar.a.getString(R.string.BASED_ON_YOUR_LOCATION_HISTORY), dtxr.bY, str2, dpyv.SET_ALIAS);
        }
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
