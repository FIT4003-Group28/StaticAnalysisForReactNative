package defpackage;
/* compiled from: PG */
/* renamed from: urz  reason: default package */
/* loaded from: classes4.dex */
public final class urz implements uqe {
    private final uqe a;
    private final usb b;
    private final usd c;

    public urz(uqe uqeVar, int i, upg upgVar, String str) {
        this.a = uqeVar;
        this.c = new usd(uqeVar, i, upgVar, str);
        this.b = new usb(uqeVar, i, upgVar, str);
    }

    @Override // defpackage.uqe
    public final ankt a() {
        return this.c.a(true);
    }

    @Override // defpackage.uqe
    public final ankt b() {
        return this.c.a(false);
    }

    @Override // defpackage.uqe
    public final void c(ukz ukzVar) {
        this.a.c(ukzVar);
    }

    @Override // defpackage.uqe
    public final void d(ukz ukzVar) {
        this.a.d(ukzVar);
    }

    @Override // defpackage.uqe
    public final ankt e(String str, int i) {
        return this.b.a(true, str, i);
    }

    @Override // defpackage.uqe
    public final ankt f(String str, int i) {
        return this.b.a(false, str, i);
    }
}
