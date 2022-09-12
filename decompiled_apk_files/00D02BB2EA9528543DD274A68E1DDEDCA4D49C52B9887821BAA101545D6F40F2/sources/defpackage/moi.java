package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moi  reason: default package */
/* loaded from: classes7.dex */
public final class moi extends moj {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moi(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moj, defpackage.moo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.moj, defpackage.moo
    public final moo g() {
        return this;
    }

    @Override // defpackage.moj, defpackage.moo
    public final void h() {
        mor morVar = this.a;
        if (morVar.s == 0) {
            morVar.s = morVar.s();
        }
        this.a.b.h();
        mor morVar2 = this.a;
        lzf lzfVar = morVar2.c;
        dcdc<ldm> dcdcVar = morVar2.m;
        int m = morVar2.e.m();
        mor morVar3 = this.a;
        lze lzeVar = morVar3.f;
        lyx c = lyy.c(morVar3.p);
        c.b(this.a.n.b());
        lzfVar.d(dcdcVar, m, lzeVar, c.a());
    }

    @Override // defpackage.moo
    public final int i() {
        return R.string.CAR_LOADING_DISABLED_ACTION_BUTTON;
    }

    @Override // defpackage.moo
    public final boolean j() {
        return true;
    }

    @Override // defpackage.moo
    public final boolean k() {
        return true;
    }

    @Override // defpackage.moo
    public final moo l() {
        return new mon(this.a);
    }
}
