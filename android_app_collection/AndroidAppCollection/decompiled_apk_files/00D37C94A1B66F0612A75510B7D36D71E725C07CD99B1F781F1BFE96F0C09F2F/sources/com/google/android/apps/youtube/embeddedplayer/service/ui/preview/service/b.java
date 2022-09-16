package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class b extends a implements afzf {
    final /* synthetic */ e c;
    private final String d;
    private int e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, int i) {
        super(eVar);
        this.c = eVar;
        this.f = -1;
        this.d = str;
        this.e = i;
    }

    private final void l(int i) {
        d();
        this.e = i;
        h();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void e() {
        l(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void f() {
        l(this.e + 1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void g() {
        l(this.e - 1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void h() {
        abdn a = this.c.b.a();
        a.b = this.d;
        a.c = this.e;
        this.a = new afzc(this);
        this.c.b.b(a, this.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean j() {
        return this.e < this.f + (-1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean k() {
        return this.e > 0;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error loading ApiThumbnailLoader", cffVar);
        this.c.c();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asec asecVar;
        asea aseaVar = (asea) obj;
        asdx asdxVar = aseaVar.d;
        if (asdxVar == null) {
            asdxVar = asdx.a;
        }
        aseb asebVar = asdxVar.b;
        if (asebVar == null) {
            asebVar = aseb.a;
        }
        this.f = (int) asebVar.b;
        avhn a = e.a(aseaVar);
        asdy asdyVar = aseaVar.c;
        if (asdyVar == null) {
            asdyVar = asdy.a;
        }
        if (asdyVar.b == 87079103) {
            asecVar = (asec) asdyVar.c;
        } else {
            asecVar = asec.a;
        }
        i(a, asecVar.c);
    }
}
