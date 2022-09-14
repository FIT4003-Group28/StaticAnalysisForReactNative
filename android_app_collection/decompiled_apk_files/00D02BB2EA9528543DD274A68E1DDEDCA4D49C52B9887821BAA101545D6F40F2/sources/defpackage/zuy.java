package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
/* compiled from: PG */
/* renamed from: zuy  reason: default package */
/* loaded from: classes7.dex */
public final class zuy extends LevelListDrawable {
    private static final int[] b = {2131231726, 2131231725, 2131231726, 2131231727};
    private static final int[] c = {0, 500, 1000, 1500, 10000};
    final Runnable a = new zux(this);
    private final bvnx d;

    public zuy(bvnx bvnxVar, Resources resources) {
        this.d = bvnxVar;
        int i = 0;
        while (true) {
            int[] iArr = b;
            int length = iArr.length;
            if (i < 4) {
                Drawable drawable = resources.getDrawable(iArr[i]);
                int i2 = i + 1;
                int[] iArr2 = c;
                addLevel(iArr2[i], iArr2[i2], drawable);
                i = i2;
            } else {
                setEnterFadeDuration(cpnx.a);
                setExitFadeDuration(cpnx.a);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        setLevel((int) (this.d.a() % 10000));
        super.draw(canvas);
        Runnable runnable = this.a;
        long a = this.d.a();
        scheduleSelf(runnable, (a - (a % 500)) + 550);
    }
}
