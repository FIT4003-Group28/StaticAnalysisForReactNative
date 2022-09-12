package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moq  reason: default package */
/* loaded from: classes7.dex */
public final class moq extends moo {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moq(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moo
    public final int b() {
        return this.a.p();
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        return this.a.q();
    }

    @Override // defpackage.moo
    public final moo f() {
        mor morVar = this.a;
        if (!morVar.l || !morVar.o()) {
            if (this.a.o != kdk.NAVIGATE_IF_NOT_EV_CHARGING_STATION || !this.a.m.get(0).t()) {
                return new moi(this.a);
            }
            return new moj(this.a);
        }
        return new mom(this.a);
    }

    @Override // defpackage.moo
    public final void h() {
        this.a.r();
    }

    @Override // defpackage.moo
    public final boolean j() {
        return true;
    }

    @Override // defpackage.moo
    public final boolean k() {
        return true;
    }
}
