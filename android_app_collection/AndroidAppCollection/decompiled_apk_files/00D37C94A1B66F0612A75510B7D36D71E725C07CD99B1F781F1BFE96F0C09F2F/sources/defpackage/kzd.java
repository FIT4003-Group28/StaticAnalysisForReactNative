package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzd  reason: default package */
/* loaded from: classes3.dex */
final class kzd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ avxc a;
    final /* synthetic */ kzg b;

    public kzd(kzg kzgVar, avxc avxcVar) {
        this.b = kzgVar;
        this.a = avxcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        arag aragVar;
        avxc avxcVar = this.a;
        if ((avxcVar.b & 8) != 0) {
            aragVar = avxcVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if (!TextUtils.isEmpty(b)) {
            int lineCount = this.b.j.getLineCount();
            kzg kzgVar = this.b;
            kzgVar.d.a(b, R.id.author).setLines(kzgVar.c - lineCount);
        }
        this.b.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
