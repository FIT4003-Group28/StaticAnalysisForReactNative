package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajfj  reason: default package */
/* loaded from: classes.dex */
public final class ajfj implements ajbv {
    public PlaybackStartDescriptor a;
    public aijp b;
    public PlayerResponseModel c;
    public long e;
    public long h;
    public long i;
    public long j;
    public aikd l;
    private final snc m;
    public float d = 1.0f;
    public long f = -1;
    public long g = 0;
    public int k = 4;

    public ajfj(snc sncVar) {
        this.m = sncVar;
    }

    @Override // defpackage.ajbv
    public final long a() {
        return this.i;
    }

    @Override // defpackage.ajbv
    public final long b() {
        return this.f;
    }

    @Override // defpackage.ajbv
    public final long c() {
        return this.m.d();
    }

    @Override // defpackage.ajbv
    public final long d() {
        return this.j;
    }

    public final void e(PlayerResponseModel playerResponseModel) {
        this.c = playerResponseModel;
        if (playerResponseModel != null) {
            this.h = TimeUnit.SECONDS.toMillis(playerResponseModel.a());
        }
    }

    @Override // defpackage.ajbv
    public final long f() {
        return this.h;
    }

    @Override // defpackage.ajbv
    public final long g() {
        return this.e;
    }

    @Override // defpackage.ajbv
    public final long h() {
        return this.g;
    }
}
