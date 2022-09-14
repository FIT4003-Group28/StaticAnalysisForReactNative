package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yg  reason: default package */
/* loaded from: classes7.dex */
public final class yg extends jx {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ yh d;

    public yg(yh yhVar, int i, int i2, WeakReference weakReference) {
        this.d = yhVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.jx
    public final void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        yh yhVar = this.d;
        WeakReference weakReference = this.c;
        if (yhVar.c) {
            yhVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface, yhVar.a);
        }
    }

    @Override // defpackage.jx
    public final void b(int i) {
    }
}
