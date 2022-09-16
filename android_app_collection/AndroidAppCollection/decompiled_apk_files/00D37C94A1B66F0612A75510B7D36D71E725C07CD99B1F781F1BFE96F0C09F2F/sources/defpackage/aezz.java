package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: aezz  reason: default package */
/* loaded from: classes.dex */
public final class aezz implements piv {
    private final amqo a;

    public aezz(amqo amqoVar) {
        this.a = amqoVar;
    }

    @Override // defpackage.piv
    public final long a() {
        return 0L;
    }

    @Override // defpackage.piv
    public final boolean b(long j, long j2, float f) {
        return false;
    }

    @Override // defpackage.piv
    public final boolean c(long j, float f, boolean z, long j2) {
        PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.a.get();
        long c = phk.c(z ? playerConfigModel.x() : playerConfigModel.t());
        return c <= 0 || j >= c;
    }

    @Override // defpackage.piv
    public final void d() {
    }

    @Override // defpackage.piv
    public final void e() {
    }

    @Override // defpackage.piv
    public final void f() {
    }

    @Override // defpackage.piv
    public final void g(pkd[] pkdVarArr, TrackGroupArray trackGroupArray, pvf[] pvfVarArr) {
    }

    @Override // defpackage.piv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.piv
    public final /* bridge */ /* synthetic */ axf i() {
        return null;
    }
}
