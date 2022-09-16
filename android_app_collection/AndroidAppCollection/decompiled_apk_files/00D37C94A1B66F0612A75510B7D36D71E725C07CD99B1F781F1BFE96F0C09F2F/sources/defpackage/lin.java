package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lin  reason: default package */
/* loaded from: classes3.dex */
public abstract class lin extends bjr implements gcl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aL(final bjr bjrVar, final int i) {
        new ypf(bjrVar.X).c().as(new ayqb() { // from class: lim
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                bjr bjrVar2 = bjr.this;
                int i2 = i;
                if (((Boolean) obj).booleanValue()) {
                    bjrVar2.b.setPadding(i2, 0, i2, 0);
                    bjrVar2.b.setScrollBarStyle(50331648);
                    bjrVar2.s(new InsetDrawable((Drawable) new ColorDrawable(zhn.d(bjrVar2.rb(), R.attr.ytSeparator)), i2, 0, i2, 0));
                }
            }
        });
    }

    @Override // defpackage.gcl
    public final void aS(int i) {
        aL(this, i);
    }
}
