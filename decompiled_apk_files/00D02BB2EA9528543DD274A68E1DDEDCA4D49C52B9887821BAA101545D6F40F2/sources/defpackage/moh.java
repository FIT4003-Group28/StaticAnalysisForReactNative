package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moh  reason: default package */
/* loaded from: classes7.dex */
public final class moh extends moo {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moh(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moo
    @dzsi
    public final cqtd a() {
        return this.a.i;
    }

    @Override // defpackage.moo
    public final int b() {
        mor morVar = this.a;
        return morVar.q ? R.string.CAR_RESTART_NAVIGATION : morVar.p();
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        mor morVar = this.a;
        return morVar.q ? dtxm.dc : morVar.q();
    }

    @Override // defpackage.moo
    public final boolean d() {
        return this.a.q;
    }

    @Override // defpackage.moo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.moo
    public final moo f() {
        mor morVar = this.a;
        if (!morVar.l || !morVar.o()) {
            return new moj(this.a);
        }
        return new mom(this.a);
    }

    @Override // defpackage.moo
    public final moo g() {
        return new moq(this.a);
    }

    @Override // defpackage.moo
    public final void h() {
        this.a.r();
    }
}
