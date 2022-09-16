package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxAssistedTvSignInDialogFragmentController;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ixr  reason: default package */
/* loaded from: classes3.dex */
public final class ixr implements ynl {
    public final axnm a;
    public final axnm b;
    public final axnm c;
    public final axnm d;
    public final axnm e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public boolean g;
    public boolean h;
    public boolean i;
    private final axnm j;
    private final axnm k;

    public ixr(axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5, axnm axnmVar6, axnm axnmVar7, acwn acwnVar) {
        this.a = axnmVar;
        this.c = axnmVar2;
        this.j = axnmVar3;
        this.k = axnmVar4;
        this.b = axnmVar5;
        this.d = axnmVar6;
        this.e = axnmVar7;
        acwnVar.m().az(new ixq(this, 1));
        acwnVar.n().az(new ixq(this));
        acwnVar.g().az(new ixq(this, 2));
    }

    public final void a(String str, boolean z, boolean z2, boolean z3) {
        ((adty) this.j.get()).a((oa) this.k.get(), ((oa) this.k.get()).getString(R.string.mdx_seamless_tv_sign_in_drawer_fragment_title, new Object[]{str}), ampq.j(((oa) this.k.get()).getString(R.string.mdx_seamless_tv_sign_in_drawer_fragment_subtitle)), z, z2, z3);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            final adva advaVar = (adva) obj;
            if (!advaVar.d()) {
                return null;
            }
            ezx g = ((ezh) this.c.get()).g();
            if (advaVar.a() == 0 || advaVar.a() == 1) {
                final boolean z = (g == ezx.NONE && (((adoa) this.b.get()).e() == null || ((adoa) this.b.get()).e().x() == null)) ? false : true;
                if (advaVar.a() == 1 && this.g) {
                    this.f.postDelayed(new Runnable() { // from class: ixo
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ixr ixrVar = ixr.this;
                            final adva advaVar2 = advaVar;
                            final boolean z2 = z;
                            if (((fud) ixrVar.e.get()).b() != null) {
                                return;
                            }
                            final ankt anktVar = ((amfg) ixrVar.d.get()).a;
                            final ankt anktVar2 = ((amfg) ixrVar.d.get()).a;
                            anlz.k(anktVar, anktVar2).a(new Callable() { // from class: ixp
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ixr ixrVar2 = ixr.this;
                                    adva advaVar3 = advaVar2;
                                    ixrVar2.a(advaVar3.b(), z2, ((Boolean) ((ankq) anktVar).b).booleanValue(), ((Boolean) ((ankq) anktVar2).b).booleanValue());
                                    return null;
                                }
                            }, anjk.a);
                        }
                    }, TimeUnit.SECONDS.toMillis(2L));
                    return null;
                } else if (advaVar.a() == 0 && this.h) {
                    ((fud) this.e.get()).c(true);
                    a(advaVar.b(), z, true, true);
                    return null;
                }
            }
            if ((g.i() || g == ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || g == ezx.WATCH_WHILE_FULLSCREEN) && advaVar.a() == 2) {
                ((MdxAssistedTvSignInDialogFragmentController) this.a.get()).g();
                return null;
            } else if (advaVar.a() != 2 || !this.i) {
                return null;
            } else {
                MdxAssistedTvSignInDialogFragmentController mdxAssistedTvSignInDialogFragmentController = (MdxAssistedTvSignInDialogFragmentController) this.a.get();
                if (!mdxAssistedTvSignInDialogFragmentController.b.getBoolean("MdxDisableMdxAssistedSignInTvDenylist", false)) {
                    String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(advaVar.c());
                    long millis = TimeUnit.DAYS.toMillis(mdxAssistedTvSignInDialogFragmentController.d);
                    if (mdxAssistedTvSignInDialogFragmentController.b.contains(concat)) {
                        long j = mdxAssistedTvSignInDialogFragmentController.b.getLong(concat, 0L);
                        if (j != 0 && mdxAssistedTvSignInDialogFragmentController.c.c() - j < millis) {
                            mdxAssistedTvSignInDialogFragmentController.g();
                            return null;
                        }
                    }
                    mdxAssistedTvSignInDialogFragmentController.b.edit().putLong(concat, mdxAssistedTvSignInDialogFragmentController.c.c()).apply();
                }
                mdxAssistedTvSignInDialogFragmentController.k();
                if (mdxAssistedTvSignInDialogFragmentController.i() != null) {
                    return null;
                }
                adux aduxVar = mdxAssistedTvSignInDialogFragmentController.a;
                ixn ixnVar = new ixn();
                ixnVar.ag = aduxVar;
                mdxAssistedTvSignInDialogFragmentController.j(ixnVar);
                return null;
            }
        }
        return new Class[]{adva.class};
    }
}
