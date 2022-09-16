package defpackage;
/* compiled from: PG */
/* renamed from: akun  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akun implements ynj {
    public final /* synthetic */ akus a;
    private final /* synthetic */ int b;

    public /* synthetic */ akun(akus akusVar, int i) {
        this.b = i;
        this.a = akusVar;
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((akut) this.a.d.get()).a(((akub) obj).a());
        } else if (i == 1) {
            akua akuaVar = (akua) obj;
            akuaVar.b();
            ((akut) this.a.d.get()).b(akuaVar.a());
        } else {
            this.a.c((akuc) obj);
        }
    }
}
