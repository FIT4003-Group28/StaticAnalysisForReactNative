package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class d extends a implements afzf {
    final /* synthetic */ e c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str) {
        super(eVar);
        this.c = eVar;
        this.d = str;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void e() {
        aqvb.l("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void h() {
        abdn a = this.c.b.a();
        a.a = this.d;
        this.a = new afzc(this);
        this.c.b.b(a, this.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean k() {
        return false;
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
        i(e.a((asea) obj), this.d);
    }
}
