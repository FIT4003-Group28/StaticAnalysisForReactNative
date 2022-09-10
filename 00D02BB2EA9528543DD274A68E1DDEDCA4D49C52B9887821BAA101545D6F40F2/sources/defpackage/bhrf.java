package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bhrf  reason: default package */
/* loaded from: classes3.dex */
final class bhrf extends cqiw<bhsb> {
    private final boolean a;
    private final boolean b;

    public bhrf(boolean z, boolean z2) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2));
        this.a = z;
        this.b = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhsb> a() {
        cqnf ce;
        if (this.b) {
            ce = cqgr.cd(-1);
        } else {
            ce = cqgr.ce(cqrp.d(290.0d));
        }
        cqmj<bhsb> a = WebImageView.a(cqgr.br(bhrg.f()), ce, cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.V(bhra.a), WebImageView.l(bhrb.a), cqgr.az(Boolean.valueOf(!this.a)));
        if (this.a) {
            return cqgr.fY(cqgr.br(bhrg.f()), ce, cqgr.cW(cqgr.q(bhrc.a)), itj.i(dtxx.H), a, cjmf.a(), cqgr.gq(bhrg.e()));
        }
        a.f(cqgr.cW(cqgr.q(bhrd.a)), iue.c(bhre.a));
        return a;
    }
}
