package defpackage;

import android.view.View;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ivq  reason: default package */
/* loaded from: classes3.dex */
public final class ivq implements adlt, iwc {
    public final adma a;
    public final admj b;
    private final adij c;
    private final ems d;
    private final azqb e;
    private final akfo f;
    private akfq g;

    static {
        zep.a("MDX.CastTooltip");
    }

    public ivq(admj admjVar, adij adijVar, ems emsVar, azqb azqbVar, adma admaVar, akfo akfoVar) {
        this.b = admjVar;
        this.c = adijVar;
        emsVar.getClass();
        this.d = emsVar;
        this.e = azqbVar;
        this.a = admaVar;
        akfoVar.getClass();
        this.f = akfoVar;
    }

    @Override // defpackage.adlt
    public final adij a() {
        return this.c;
    }

    @Override // defpackage.adlt
    public final admj b() {
        return this.b;
    }

    @Override // defpackage.adlt
    public final void c() {
        this.f.b(this.g);
    }

    @Override // defpackage.adlt
    public final void d(Runnable runnable) {
        ylr.c();
        MediaRouteButton mediaRouteButton = (MediaRouteButton) this.e.get();
        if (mediaRouteButton == null) {
            return;
        }
        akfp a = this.f.a();
        a.a = mediaRouteButton;
        a.h(2);
        a.c(3);
        a.e(this.b.g);
        a.b = this.d.getString(R.string.cast_icon_tooltip_text);
        a.j(1);
        a.f(this.c == adij.WATCH ? 2900 : 9900);
        a.f = new ivp(this, runnable);
        a.g = new View.OnClickListener() { // from class: ivo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ivq ivqVar = ivq.this;
                ivqVar.a.a(ivqVar.b.h);
            }
        };
        akfq a2 = a.a();
        this.g = a2;
        this.f.c(a2);
    }

    @Override // defpackage.adlt
    public final boolean e() {
        return this.e.get() != null;
    }

    @Override // defpackage.iwc
    public final MediaRouteButton f() {
        return (MediaRouteButton) this.e.get();
    }
}
