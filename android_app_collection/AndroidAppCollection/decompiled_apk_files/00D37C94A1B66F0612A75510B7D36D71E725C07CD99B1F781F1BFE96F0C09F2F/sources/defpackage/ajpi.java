package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajpi  reason: default package */
/* loaded from: classes.dex */
public final class ajpi extends ajoy {
    private final ajpg b;

    public ajpi(ajmy ajmyVar, akcq akcqVar, int i, int i2, int i3, boolean z, boolean z2, akvm akvmVar, acvh acvhVar) {
        super(ajmyVar, akcqVar, i, i2, i3, z, z2, akvmVar);
        asny asnyVar;
        if (i == 2) {
            asnyVar = asny.LATENCY_ACTION_SEARCH_THUMBNAILS;
        } else {
            asnyVar = asny.LATENCY_ACTION_FIRST_THUMBNAIL_LOAD;
        }
        this.b = new ajpg(ajmyVar, akcqVar, akvmVar, i, i2, i3, z, z2, acvhVar.c(asnyVar));
    }

    @Override // defpackage.ajoy
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.ajoy
    public final void f(ajpu ajpuVar) {
        this.b.f(ajpuVar);
    }

    @Override // defpackage.ajoy
    public final void g(ajpv ajpvVar) {
        this.b.g(ajpvVar);
    }

    @Override // defpackage.ajoy
    public final void h(ajpw ajpwVar) {
        this.b.h(ajpwVar);
    }

    @Override // defpackage.ajoy
    public final void i(ajpx ajpxVar) {
        this.b.i(ajpxVar);
    }

    @Override // defpackage.ajoy
    public final void j() {
        this.b.j();
    }
}
