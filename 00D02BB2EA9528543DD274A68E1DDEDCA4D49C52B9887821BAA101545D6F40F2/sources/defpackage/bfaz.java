package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: bfaz  reason: default package */
/* loaded from: classes3.dex */
final class bfaz implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ bfba b;

    public bfaz(bfba bfbaVar, View view) {
        this.b = bfbaVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dbsg i;
        View view = this.a;
        cqjg cqjgVar = bezr.a;
        bvrj.UI_THREAD.c();
        View a = cqhu.a(view, cqjgVar);
        if (a == null) {
            i = dbpy.a;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
            a.draw(new Canvas(createBitmap));
            i = dbsg.i(createBitmap.copy(createBitmap.getConfig(), true));
        }
        if (i.a()) {
            this.b.a.a = (Bitmap) i.b();
        }
    }
}
