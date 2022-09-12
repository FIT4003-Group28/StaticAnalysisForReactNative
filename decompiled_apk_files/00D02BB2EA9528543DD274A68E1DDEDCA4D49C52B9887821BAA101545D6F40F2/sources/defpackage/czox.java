package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: czox  reason: default package */
/* loaded from: classes5.dex */
public final class czox {
    public static void a(ImageView imageView, Integer num) {
        if (num != null) {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    public static void b(final View view, final View view2, final int i, final int i2) {
        view.post(new Runnable(view2, i, i2, view) { // from class: czow
            private final View a;
            private final int b;
            private final int c;
            private final View d;

            {
                this.a = view2;
                this.b = i;
                this.c = i2;
                this.d = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view3 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                View view4 = this.d;
                Rect rect = new Rect();
                view3.getHitRect(rect);
                rect.top -= 2131166618;
                rect.left = rect.left;
                rect.right += i3;
                rect.bottom += i4;
                view4.setTouchDelegate(new TouchDelegate(rect, view3));
            }
        });
    }
}
