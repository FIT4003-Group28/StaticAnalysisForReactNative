package com.google.android.apps.youtube.app.mdx.watch;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxConnectingSnackbarController;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxConnectingSnackbarController implements adny, f {
    public final acth a;
    Optional b;
    private final Context c;
    private final akfg d;
    private final nxh e;
    private final adoa f;

    public MdxConnectingSnackbarController(Context context, akfg akfgVar, nxh nxhVar, adoa adoaVar, acth acthVar) {
        this.c = context;
        akfgVar.getClass();
        this.d = akfgVar;
        this.e = nxhVar;
        this.f = adoaVar;
        this.a = acthVar;
        this.b = Optional.empty();
    }

    private final void g() {
        if (this.b.isPresent()) {
            this.d.m((akfi) this.b.get());
            this.b = Optional.empty();
        }
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        g();
        if (!this.e.e()) {
            akfg akfgVar = this.d;
            fvg d = fvl.d();
            d.i(-1);
            d.k(this.c.getString(R.string.mdx_next_gen_fiji_connected_to_confirm_text, adntVar.k().b()));
            akfgVar.n(d.b());
        }
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        g();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.adny
    public final void l(final adnt adntVar) {
        if (this.e.e() || adntVar.k() == null || adntVar.k().b().isEmpty()) {
            return;
        }
        final acte acteVar = new acte(actj.CAST_SNACKBAR_DISMISS_BUTTON);
        this.a.oi().D(acteVar);
        fvg d = fvl.d();
        d.e(true);
        d.i(-2);
        d.k(this.c.getString(R.string.mdx_next_gen_fiji_connecting_toast_text, adntVar.k().b()));
        d.m(this.c.getString(R.string.mdx_next_gen_fiji_connecting_toast_cancel_button_text), new View.OnClickListener() { // from class: iya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MdxConnectingSnackbarController mdxConnectingSnackbarController = MdxConnectingSnackbarController.this;
                acum acumVar = acteVar;
                adnt adntVar2 = adntVar;
                mdxConnectingSnackbarController.a.oi().H(3, acumVar, null);
                adntVar2.C();
            }
        });
        d.b = null;
        Optional of = Optional.of(d.b());
        this.b = of;
        this.d.n((akfi) of.get());
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.f.g(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.f.i(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
