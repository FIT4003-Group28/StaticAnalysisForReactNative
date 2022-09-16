package com.google.android.libraries.youtube.mdx.player;

import android.content.res.Resources;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxVideoQualitySelectorPresenter extends aicj implements adny, f, ynl {
    private final adoa b;

    public MdxVideoQualitySelectorPresenter(Resources resources, airr airrVar, aich aichVar, adoa adoaVar) {
        super(resources, airrVar, aichVar);
        adoaVar.getClass();
        this.b = adoaVar;
    }

    @Override // defpackage.aicj
    public final void h(aesr aesrVar) {
        if (this.b.d() == 1) {
            this.a.pG(false);
        } else {
            super.h(aesrVar);
        }
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        this.a.pG(false);
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        this.a.pG(true);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.aicj, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == MdxVideoQualitySelectorPresenter.class) {
            if (i == -1) {
                return new Class[]{aesr.class};
            }
            if (i == 0) {
                h((aesr) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return ahfe.b(this, obj, i);
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.b.g(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.b.i(this);
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
