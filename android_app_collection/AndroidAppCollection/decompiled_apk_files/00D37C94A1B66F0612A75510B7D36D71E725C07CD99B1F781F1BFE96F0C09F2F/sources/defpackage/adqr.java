package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
/* compiled from: PG */
/* renamed from: adqr  reason: default package */
/* loaded from: classes.dex */
public final class adqr extends adqy {
    private final adif a;
    private final MdxSessionFactory b;
    private final acvg c;
    private final acvg d;

    public adqr(adif adifVar, MdxSessionFactory mdxSessionFactory, Context context, adrk adrkVar, adnu adnuVar, yzj yzjVar, acvg acvgVar, acvg acvgVar2, int i, ampq ampqVar, acwu acwuVar, atcw atcwVar) {
        super(context, adrkVar, adnuVar, yzjVar, acwuVar, atcwVar);
        this.a = adifVar;
        this.b = mdxSessionFactory;
        this.c = acvgVar;
        this.d = acvgVar2;
        adnv a = adnw.a();
        a.i(4);
        a.e(adifVar.b());
        a.f(i);
        a.d(adew.f(adifVar));
        if (ampqVar.h()) {
            a.g((String) ampqVar.c());
        }
        this.am = a.a();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void D(atcv atcvVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.D(atcvVar);
        } else {
            super.D(atcvVar);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ab() {
        adqy adqyVar = this.an;
        return adqyVar != null ? adqyVar.ab() : super.ab();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void aq(atcv atcvVar, int i, aifh aifhVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.aq(atcvVar, i, aifhVar);
        } else {
            super.aq(atcvVar, i, aifhVar);
        }
    }

    @Override // defpackage.adqy
    public final void as() {
    }

    @Override // defpackage.adqy
    public final boolean au() {
        return true;
    }

    @Override // defpackage.adqy
    public final void av(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void aw() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.aw();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void ax(adnl adnlVar) {
        super.ax(adnlVar);
        this.ak.c(10);
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.ax(adnlVar);
        }
    }

    @Override // defpackage.adnt
    public final adig k() {
        return this.a;
    }

    @Override // defpackage.adqy
    public final /* bridge */ /* synthetic */ int ro() {
        return 0;
    }

    @Override // defpackage.adqy
    public final void rr(atcv atcvVar, aifh aifhVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.rr(atcvVar, aifhVar);
        } else {
            super.rr(atcvVar, aifhVar);
        }
    }

    @Override // defpackage.adqy
    public final void rs(adnl adnlVar) {
        MdxSessionFactory mdxSessionFactory = this.b;
        adib adibVar = this.a.a;
        adrk aK = aK();
        adnu adnuVar = this.ak;
        acvg acvgVar = this.c;
        acvg acvgVar2 = this.d;
        adnw adnwVar = this.am;
        int i = adnwVar.h;
        ampq.j(adnwVar.g);
        this.an = mdxSessionFactory.h(adibVar, aK, adnuVar, this, acvgVar, acvgVar2, null);
        super.rs(adnlVar);
    }

    @Override // defpackage.adqy
    public final boolean rt() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.rt();
        }
        return super.rt();
    }
}
