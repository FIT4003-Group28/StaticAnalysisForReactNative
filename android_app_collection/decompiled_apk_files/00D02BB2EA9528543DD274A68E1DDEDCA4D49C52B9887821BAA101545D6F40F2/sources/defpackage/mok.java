package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mok  reason: default package */
/* loaded from: classes7.dex */
final class mok extends moo {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mok(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moo
    @dzsi
    public final cqtd a() {
        return nqu.aG(R.raw.car_only_ic_warning_36dp);
    }

    @Override // defpackage.moo
    public final int b() {
        return R.string.NO_ROUTE_FOUND;
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        return dtxm.db;
    }

    @Override // defpackage.moo
    public final void h() {
        mor morVar = this.a;
        morVar.s = morVar.s == 301 ? 402 : 401;
    }

    @Override // defpackage.moo
    public final boolean s() {
        return true;
    }
}
