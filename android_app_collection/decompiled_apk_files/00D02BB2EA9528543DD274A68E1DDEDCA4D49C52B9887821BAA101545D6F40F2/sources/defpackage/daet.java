package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daet  reason: default package */
/* loaded from: classes5.dex */
public final class daet implements Runnable {
    final /* synthetic */ daff a;

    public daet(daff daffVar) {
        this.a = daffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        daff daffVar = this.a;
        if (daffVar.e == null || (context = daffVar.d) == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        daff daffVar2 = this.a;
        int[] iArr = new int[2];
        daffVar2.e.getLocationOnScreen(iArr);
        int height = (i - (iArr[1] + daffVar2.e.getHeight())) + ((int) this.a.e.getTranslationY());
        daff daffVar3 = this.a;
        if (height >= daffVar3.k) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = daffVar3.e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.a.k - height;
        this.a.e.requestLayout();
    }
}
