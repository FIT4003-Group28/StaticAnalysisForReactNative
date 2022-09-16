package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;
import java.util.Observable;
/* compiled from: PG */
/* renamed from: iwa  reason: default package */
/* loaded from: classes3.dex */
public final class iwa extends Observable implements fry, frx {
    public MenuItem a;
    final boolean b;
    public final aypf c = new aypf();
    aypg d;
    private final boolean e;
    private final aadd f;
    private final adfl g;
    private yzh h;
    private int i;
    private final ayor j;

    public iwa(acwu acwuVar, aadd aaddVar, aacz aaczVar, ypf ypfVar, ayor ayorVar, adfl adflVar) {
        this.e = acwuVar.q;
        this.f = aaddVar;
        this.j = ayorVar;
        boolean be = eog.be(aaczVar);
        this.b = be;
        this.g = adflVar;
        if (be) {
            ypfVar.a().R(new aypv() { // from class: ivy
                @Override // defpackage.aypv
                public final void a() {
                    iwa iwaVar = iwa.this;
                    iwaVar.c.c();
                    iwaVar.c();
                }
            });
        }
    }

    @Override // defpackage.frx
    public final void a(yzh yzhVar, int i) {
        this.h = yzhVar;
        this.i = i;
        MediaRouteButton b = b();
        if (b != null) {
            if (this.e) {
                b.c(true);
            }
            atdn atdnVar = this.f.a().l;
            if (atdnVar == null) {
                atdnVar = atdn.a;
            }
            e(atdnVar.g);
        }
        this.c.d(this.f.a.V(inl.u).B().X(this.j).as(new ayqb() { // from class: ivz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                iwa.this.e(((Boolean) obj).booleanValue());
            }
        }));
    }

    public final MediaRouteButton b() {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            return (MediaRouteButton) iy.c(menuItem);
        }
        return null;
    }

    public final void c() {
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            aypgVar.qr();
            this.d = null;
        }
    }

    public final void d(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem == null) {
            return;
        }
        menuItem.setVisible(z);
        this.a.setEnabled(z);
    }

    public final void e(boolean z) {
        yzh yzhVar;
        MediaRouteButton b = b();
        if (b == null || (yzhVar = this.h) == null) {
            return;
        }
        b.e(yzhVar.b(b.getContext().getResources().getDrawable(true != z ? R.drawable.ic_outlined_media_route : R.drawable.ic_outlined_media_route_outline_checked), this.i));
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_cast;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_cast;
    }

    @Override // defpackage.fry
    public final frx i() {
        return this;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        if (this.a == menuItem) {
            return;
        }
        this.a = menuItem;
        if (this.b) {
            c();
            MediaRouteButton b = b();
            if (b != null) {
                this.d = this.g.a(b);
            }
        }
        setChanged();
        notifyObservers();
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return true;
    }
}
