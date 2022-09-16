package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wzo  reason: default package */
/* loaded from: classes4.dex */
public final class wzo extends wzm {
    private final wka i;
    private final PlayerAd j;

    public wzo(xci xciVar, PlayerAd playerAd, wme wmeVar, boolean z, boolean z2, wka wkaVar) {
        super(xciVar, 1000 * playerAd.c(), z, z2, wmeVar);
        this.j = playerAd;
        this.i = wkaVar;
        wkaVar.b = this;
    }

    @Override // defpackage.tkz
    public final Set b(tla tlaVar) {
        return afzo.d(xeu.b(this.j, tlaVar), a);
    }

    @Override // defpackage.wzm
    public final tjt f(int i) {
        this.e = this.i.h(i);
        return this.e;
    }

    @Override // defpackage.wzm
    public final void h() {
        this.e = this.i.a();
    }

    @Override // defpackage.wzm
    public final void i() {
        this.e = this.i.b();
    }

    @Override // defpackage.wzm
    public final void j() {
        this.e = this.i.e();
    }

    @Override // defpackage.wzm
    public final void k() {
        this.e = this.i.f();
    }

    @Override // defpackage.wzm
    public final void l() {
        this.e = this.i.g();
    }

    @Override // defpackage.wzm
    public final void m() {
        this.e = this.i.i();
    }

    @Override // defpackage.wzm
    public final void n() {
        this.i.k();
    }

    @Override // defpackage.wzm
    public final void o(VisibilityChangeEventData visibilityChangeEventData) {
        this.i.l(visibilityChangeEventData);
    }

    @Override // defpackage.wzm
    public final void p() {
        this.i.m();
        this.e = this.i.a();
    }

    @Override // defpackage.wzm
    public final void q(aijs aijsVar) {
        if (!this.g && aijsVar == aijs.BACKGROUND) {
            this.g = true;
        } else if (this.g && aijsVar != aijs.BACKGROUND) {
            this.g = false;
        }
        if (this.f || aijsVar != aijs.FULLSCREEN) {
            if (!this.f || aijsVar == aijs.FULLSCREEN) {
                return;
            }
            this.e = this.i.c();
            this.f = false;
            return;
        }
        this.e = this.i.d();
        this.f = true;
    }

    @Override // defpackage.wzm
    public final void r(int i, int i2, int i3, int i4) {
        this.i.n(i, i2, i3, i4);
    }
}
