package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gfx  reason: default package */
/* loaded from: classes3.dex */
public final class gfx implements gfu {
    private final Context a;
    private final yve b;

    public gfx(Context context, yve yveVar) {
        this.a = context;
        this.b = yveVar;
    }

    @Override // defpackage.gfu
    public final gfs a() {
        String string;
        if (e()) {
            if ((((gft) this.b.c()).b & 8) == 0) {
                if (b() == gfs.DARK) {
                    string = this.a.getString(R.string.app_theme_appearance_dark);
                } else {
                    string = this.a.getString(R.string.app_theme_appearance_system);
                }
                ylx.m(this.b.b(new fct(string, 5)), dzl.p);
            } else {
                string = ((gft) this.b.c()).f;
            }
            if (akzj.f(string, this.a.getString(R.string.app_theme_appearance_light))) {
                return gfs.LIGHT;
            }
            if (akzj.f(string, this.a.getString(R.string.app_theme_appearance_dark))) {
                return gfs.DARK;
            }
            return c();
        }
        return b();
    }

    @Override // defpackage.gfu
    public final gfs b() {
        return ((gft) this.b.c()).e ? gfs.DARK : gfs.LIGHT;
    }

    @Override // defpackage.gfu
    public final gfs c() {
        if ((this.a.getResources().getConfiguration().uiMode & 48) == 32) {
            return gfs.DARK;
        }
        return gfs.LIGHT;
    }

    @Override // defpackage.gfu
    public final void d(final gfs gfsVar) {
        gfsVar.getClass();
        ylx.m(this.b.b(new ampg() { // from class: gfw
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                gfs gfsVar2 = gfs.this;
                aopa mo52toBuilder = ((gft) obj).mo52toBuilder();
                boolean z = gfsVar2 == gfs.DARK;
                mo52toBuilder.copyOnWrite();
                gft gftVar = (gft) mo52toBuilder.instance;
                gftVar.b |= 4;
                gftVar.e = z;
                return (gft) mo52toBuilder.mo39build();
            }
        }), dzl.q);
    }

    @Override // defpackage.gfu
    public final boolean e() {
        return Build.VERSION.SDK_INT > 28;
    }
}
