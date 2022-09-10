package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhiw  reason: default package */
/* loaded from: classes3.dex */
final class bhiw implements degu<apzn> {
    final /* synthetic */ bhix a;

    public bhiw(bhix bhixVar) {
        this.a = bhixVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bhix bhixVar = this.a;
        bhixVar.f();
        ckos.a(bhixVar.c.findViewById(16908290), bhixVar.c.getString(R.string.MERCHANT_MODE_MESSAGING_PROMO_TURN_ON_FAILED), 0).c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi apzn apznVar) {
        apzn apznVar2 = apznVar;
        bhix bhixVar = this.a;
        bhixVar.f();
        if (bhixVar.e == null || apznVar2 == null || !apznVar2.e()) {
            return;
        }
        bhixVar.b.a().j(bhixVar.e);
    }
}
