package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajpb  reason: default package */
/* loaded from: classes.dex */
public final class ajpb extends ajoy {
    private final int b;
    private final yni c;

    public ajpb(ajmy ajmyVar, akcq akcqVar, int i, int i2, int i3, boolean z, boolean z2, akvm akvmVar, yni yniVar) {
        super(ajmyVar, akcqVar, i, i2, i3, z, z2, akvmVar);
        this.b = i;
        this.c = yniVar;
    }

    private final void m(ymg ymgVar) {
        this.c.d(ymgVar);
    }

    @Override // defpackage.ajoy
    public final void f(ajpu ajpuVar) {
        m(ajpuVar);
    }

    @Override // defpackage.ajoy
    public final void g(ajpv ajpvVar) {
        m(ajpvVar);
    }

    @Override // defpackage.ajoy
    public final void h(ajpw ajpwVar) {
        m(ajpwVar);
    }

    @Override // defpackage.ajoy
    public final void i(ajpx ajpxVar) {
        m(ajpxVar);
    }

    @Override // defpackage.ajoy
    public final void a() {
        ymg ajpqVar;
        if (this.b == 2) {
            ajpqVar = new ajpq();
        } else {
            ajpqVar = new ajps();
        }
        m(ajpqVar);
    }

    @Override // defpackage.ajoy
    public final void j() {
        ymg ajprVar;
        if (this.b == 2) {
            ajprVar = new ajpr();
        } else {
            ajprVar = new ajpt();
        }
        m(ajprVar);
    }
}
