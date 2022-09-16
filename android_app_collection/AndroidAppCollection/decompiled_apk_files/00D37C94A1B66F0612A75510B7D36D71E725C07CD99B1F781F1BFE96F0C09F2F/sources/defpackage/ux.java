package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ux  reason: default package */
/* loaded from: classes4.dex */
public final class ux extends gt {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ uz d;

    public ux(uz uzVar, int i, int i2, WeakReference weakReference) {
        this.d = uzVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.gt
    public final void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        uz uzVar = this.d;
        WeakReference weakReference = this.c;
        if (uzVar.d) {
            uzVar.c = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (lj.aj(textView)) {
                textView.post(new uy(textView, typeface, uzVar.b));
            } else {
                textView.setTypeface(typeface, uzVar.b);
            }
        }
    }

    @Override // defpackage.gt
    public final void e() {
    }
}
