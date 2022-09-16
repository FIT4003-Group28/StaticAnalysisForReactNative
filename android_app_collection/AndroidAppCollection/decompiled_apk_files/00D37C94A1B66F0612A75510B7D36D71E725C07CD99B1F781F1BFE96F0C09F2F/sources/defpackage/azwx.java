package defpackage;
/* compiled from: PG */
/* renamed from: azwx  reason: default package */
/* loaded from: classes2.dex */
public final class azwx extends azxw implements azwz {
    public final azwn a;
    public final azua b;

    public azwx(azwn azwnVar, azua azuaVar) {
        this.a = azwnVar;
        this.b = azuaVar;
    }

    @Override // defpackage.azwz
    public final /* bridge */ /* synthetic */ Object a() {
        return azwq.b;
    }

    @Override // defpackage.azwz
    public final void b(Object obj) {
        this.a.b = obj;
        this.b.a();
    }

    public final void c(azxa azxaVar) {
        if (((azub) this.b).o(false) != null) {
            this.a.b = azxaVar;
            this.b.a();
        }
    }

    @Override // defpackage.azwz
    public final azyg d() {
        azua azuaVar = this.b;
        azwp azwpVar = this.a.a;
        if (((azub) azuaVar).o(true) == null) {
            return null;
        }
        boolean z = azuy.a;
        return azuc.a;
    }

    @Override // defpackage.azxw
    public final String toString() {
        return azst.a("ReceiveHasNext@", banl.k(this));
    }

    public azwx() {
    }
}
