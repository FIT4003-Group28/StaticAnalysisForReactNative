package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistEditToastController implements f, ynl {
    Context a;
    private final akfg c;
    private final aadd d;
    private final yni e;
    private String g;
    public boolean b = false;
    private final Set f = new HashSet();

    public PlaylistEditToastController(Context context, akfg akfgVar, aadd aaddVar, yni yniVar) {
        this.a = context;
        this.c = akfgVar;
        this.d = aaddVar;
        this.e = yniVar;
    }

    public final void g() {
        this.f.clear();
        this.b = false;
        this.g = null;
    }

    public final void h() {
        if (this.f.isEmpty() || !this.b) {
            return;
        }
        int size = this.f.size();
        g();
        fvg e = fvl.e(this.a.getResources().getQuantityString(R.plurals.playlist_picker_dialog_done, size));
        e.e(!eog.y(this.d));
        this.c.n(e.b());
    }

    public final void i(String str, String str2, asat asatVar) {
        if (asatVar.f.size() > 0 || (asatVar.b & 256) != 0) {
            return;
        }
        if (!str2.equals(this.g)) {
            this.f.clear();
            this.g = str2;
        }
        this.f.add(str);
        h();
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.e.g(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((ipz) obj).a) {
                    g();
                    return null;
                }
                this.b = true;
                h();
                return null;
            } else if (i == 1) {
                abbk abbkVar = (abbk) obj;
                i(abbkVar.a, abbkVar.b, abbkVar.c);
                return null;
            } else if (i == 2) {
                abbn abbnVar = (abbn) obj;
                i(abbnVar.a, abbnVar.d, abbnVar.c);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ipz.class, abbk.class, abbn.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.e.m(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
