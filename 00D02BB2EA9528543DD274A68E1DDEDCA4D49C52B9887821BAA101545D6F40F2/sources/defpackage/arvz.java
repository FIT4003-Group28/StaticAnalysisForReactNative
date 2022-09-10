package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arvz  reason: default package */
/* loaded from: classes2.dex */
public final class arvz extends arwb<arxx> {
    private final arxy c;
    private final aryb d;
    private final cqkn<aryj> e;

    public arvz(arxy arxyVar, aryb arybVar, cqkn<aryj> cqknVar, arvo arvoVar, arvw arvwVar) {
        super(arvoVar, arvwVar, false);
        this.c = arxyVar;
        this.d = arybVar;
        this.e = cqknVar;
    }

    @Override // defpackage.arxl
    public final /* bridge */ /* synthetic */ cqkp b() {
        return this.c.a(this.e, "com.spotify.music", this.a.a.getString(R.string.MEDIA_SPOTIFY_FALLBACK_NAME), this.a.a(), this.d);
    }
}
