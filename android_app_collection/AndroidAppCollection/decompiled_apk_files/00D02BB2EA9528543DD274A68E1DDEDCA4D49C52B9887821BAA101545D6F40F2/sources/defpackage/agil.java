package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: agil  reason: default package */
/* loaded from: classes2.dex */
final class agil extends cqiw<agwt> {
    private final float a;
    private final int b;

    public agil(float f, int i) {
        super(Float.valueOf(f), Integer.valueOf(i));
        this.a = f;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agwt> a() {
        return WebImageView.a(cqgr.bp(-1), cqgr.cd(0), cqgr.ca(Float.valueOf(this.a)), cqgr.bG(cqrp.d(this.b)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(agik.a));
    }
}
