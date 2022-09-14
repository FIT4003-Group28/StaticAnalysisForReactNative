package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.apps.gmm.locationsharing.widget.SelectedPersonCreateShortcutActivity;
/* compiled from: PG */
/* renamed from: akbt  reason: default package */
/* loaded from: classes2.dex */
public final class akbt extends ckqk {
    final /* synthetic */ Canvas a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ Bitmap d;
    final /* synthetic */ Context e;
    final /* synthetic */ float f;
    final /* synthetic */ akbu g;

    public akbt(Canvas canvas, float f, float f2, Bitmap bitmap, Context context, float f3, akbu akbuVar) {
        this.a = canvas;
        this.b = f;
        this.c = f2;
        this.d = bitmap;
        this.e = context;
        this.f = f3;
        this.g = akbuVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        Canvas canvas = this.a;
        float f = this.b;
        canvas.drawBitmap(bitmap, (Rect) null, new RectF(f, f - this.c, this.d.getWidth() - this.b, (this.d.getHeight() - this.b) - this.c), SelectedPersonCreateShortcutActivity.u);
        if (Build.VERSION.SDK_INT < 26) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.e.getResources(), 2131231883);
            float f2 = this.f * 5.0f;
            this.a.drawBitmap(decodeResource, (Rect) null, new RectF(this.d.getWidth() - decodeResource.getWidth(), (this.d.getHeight() - decodeResource.getWidth()) - f2, this.d.getWidth(), this.d.getHeight() - f2), SelectedPersonCreateShortcutActivity.u);
        }
        this.g.a(this.d);
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.g.a(null);
    }
}
