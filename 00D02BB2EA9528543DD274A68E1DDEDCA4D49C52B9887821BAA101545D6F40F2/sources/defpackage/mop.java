package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mop  reason: default package */
/* loaded from: classes7.dex */
final class mop extends moo {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mop(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moo
    @dzsi
    public final cqtd a() {
        return nqu.B();
    }

    @Override // defpackage.moo
    public final int b() {
        return R.string.CAR_ERROR_FETCHING_DIRECTIONS;
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        return dtxm.dd;
    }

    @Override // defpackage.moo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.moo
    public final moo f() {
        return new moj(this.a);
    }

    @Override // defpackage.moo
    public final moo g() {
        this.a.m.get(0).k();
        mor morVar = this.a;
        morVar.d.d(morVar.m, morVar.g, null);
        return new moh(this.a);
    }

    @Override // defpackage.moo
    public final void h() {
        this.a.s = 301;
    }

    @Override // defpackage.moo
    public final int i() {
        return 0;
    }

    @Override // defpackage.moo
    public final boolean s() {
        return true;
    }

    @Override // defpackage.moo
    public final int t() {
        return R.string.CAR_ERROR_FETCHING_DIRECTIONS_SHORT;
    }
}
