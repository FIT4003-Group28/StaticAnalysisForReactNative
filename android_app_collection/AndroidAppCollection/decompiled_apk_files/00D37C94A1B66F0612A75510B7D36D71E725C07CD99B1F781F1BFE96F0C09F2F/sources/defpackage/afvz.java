package defpackage;
/* compiled from: PG */
/* renamed from: afvz  reason: default package */
/* loaded from: classes.dex */
public final class afvz implements afwa {
    private final /* synthetic */ int a;

    public afvz() {
    }

    public afvz(int i) {
        this.a = i;
    }

    @Override // defpackage.afwa
    public final void a() {
        if (this.a != 0) {
            afus.b(1, 4, "sign in cancelled");
        }
    }

    @Override // defpackage.afwa
    public final void b() {
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        if (this.a == 0 || exc == null) {
            return;
        }
        afus.c(1, 4, "sign in failure", exc);
    }
}
