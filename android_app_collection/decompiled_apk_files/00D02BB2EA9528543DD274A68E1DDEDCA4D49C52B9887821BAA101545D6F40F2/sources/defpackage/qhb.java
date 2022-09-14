package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qhb  reason: default package */
/* loaded from: classes7.dex */
public final class qhb extends ckqk {
    final /* synthetic */ deig a;
    final /* synthetic */ qhc b;

    public qhb(qhc qhcVar, deig deigVar) {
        this.b = qhcVar;
        this.a = deigVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        deig deigVar = this.a;
        qhc qhcVar = this.b;
        if (qhcVar.d == null) {
            qhcVar.d = BitmapFactory.decodeResource(qhcVar.a.getResources(), 2131230922);
        }
        Bitmap bitmap2 = qhcVar.d;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap2, new Matrix(), null);
        int a = jmj.a(qhcVar.a, 7);
        int a2 = jmj.a(qhcVar.a, 1);
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(a, a + a2, createBitmap.getWidth() - a, (createBitmap.getWidth() - a) + a2), new Paint(3));
        deigVar.j(createBitmap);
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.a.k(new RuntimeException("Unable to load image"));
    }
}
