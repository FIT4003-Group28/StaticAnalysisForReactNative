package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
/* compiled from: PG */
/* renamed from: xjc  reason: default package */
/* loaded from: classes4.dex */
public final class xjc extends xip {
    private final xew a;
    private final InstreamAdBreak b;
    private final PlayerAd c;
    private boolean d;
    private boolean e;

    public xjc(xew xewVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        this.a = xewVar;
        instreamAdBreak.getClass();
        this.b = instreamAdBreak;
        playerAd.getClass();
        this.c = playerAd;
    }

    private final void e(long j, String str) {
        if (!this.d) {
            this.a.f(this.b.e());
            this.d = true;
        }
        if (this.e || !TextUtils.equals(str, this.c.l)) {
            return;
        }
        long c = this.c.c() * 1000;
        if (j < (-1000) + c || j > c || this.e) {
            return;
        }
        this.a.f(this.b.d());
        this.e = true;
    }

    @Override // defpackage.xip
    public final void a() {
    }

    @Override // defpackage.xip
    public final void b() {
    }

    @Override // defpackage.xip
    public final void c(long j, String str) {
        e(j, str);
    }

    @Override // defpackage.xip
    public final void d(ahhx ahhxVar) {
        if (!ahhxVar.j()) {
            return;
        }
        e(ahhxVar.e(), ahhxVar.i());
    }
}
