package com.google.android.apps.youtube.embeddedplayer.service.innertube;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements axou {
    private final azqb a;
    private final azqb b;

    public h(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static h a(azqb azqbVar, azqb azqbVar2) {
        return new h(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final aarl get() {
        return new aarl((aaqj) this.a.get(), (yqw) this.b.get(), arrb.a, lto.e, iho.d);
    }
}
