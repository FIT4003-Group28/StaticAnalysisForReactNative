package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dyq  reason: default package */
/* loaded from: classes6.dex */
public final class dyq {
    private static final dcdn<dfmf, Integer> a = dcdn.m(dfmf.STAIRCASE, Integer.valueOf((int) R.raw.stairs_white), dfmf.ESCALATOR, Integer.valueOf((int) R.raw.escalator_white), dfmf.ELEVATOR, Integer.valueOf((int) R.raw.elevator_white));
    private static final dcdn<dfmf, Integer> b = dcdn.m(dfmf.STAIRCASE, Integer.valueOf((int) R.string.LEVEL_CHANGE_POINT_STAIRCASE), dfmf.ESCALATOR, Integer.valueOf((int) R.string.LEVEL_CHANGE_POINT_ESCALATOR), dfmf.ELEVATOR, Integer.valueOf((int) R.string.LEVEL_CHANGE_POINT_ELEVATOR));
    private final Activity c;
    private final dxio<dhp> d;
    private final dxio<dhm> e;
    private final int f;

    public dyq(Activity activity, dxio<dhp> dxioVar, dxio<dhm> dxioVar2) {
        this.c = activity;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = activity.getResources().getDimensionPixelSize(R.dimen.level_change_point_marker_size);
    }

    public final dehn<Picture> a(dfmf dfmfVar) {
        dcdn<dfmf, Integer> dcdnVar = a;
        dbsk.a(dcdnVar.containsKey(dfmfVar));
        final cqss H = ibl.H();
        Integer num = dcdnVar.get(dfmfVar);
        dbsk.s(num);
        final int intValue = num.intValue();
        final dhp a2 = this.d.a();
        final int i = this.f;
        final Picture picture = new Picture();
        return deha.d(new Callable(a2, intValue, picture, i, H) { // from class: dho
            private final dhp a;
            private final int b;
            private final Picture c;
            private final int d;
            private final cqss e;

            {
                this.a = a2;
                this.b = intValue;
                this.c = picture;
                this.d = i;
                this.e = H;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhp dhpVar = this.a;
                int i2 = this.b;
                Picture picture2 = this.c;
                int i3 = this.d;
                cqss cqssVar = this.e;
                Drawable b2 = dhpVar.c.b(dhpVar.a.getResources(), i2, bvlw.a);
                Canvas beginRecording = picture2.beginRecording(i3, i3);
                beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                dhpVar.a(beginRecording, cqssVar.b(dhpVar.a));
                Rect rect = new Rect(0, 0, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
                int width = picture2.getWidth();
                int height = picture2.getHeight();
                float min = Math.min(width / rect.width(), height / rect.height());
                int round = Math.round(rect.width() * min);
                int round2 = Math.round(min * rect.height());
                int i4 = (width - round) / 2;
                int i5 = (height - round2) / 2;
                Rect rect2 = new Rect(i4, i5, round + i4, round2 + i5);
                int i6 = dhpVar.e;
                rect2.inset(i6, i6);
                b2.setBounds(rect2);
                b2.draw(beginRecording);
                dhpVar.b(beginRecording, dhpVar.d);
                picture2.endRecording();
                return picture2;
            }
        }, a2.b);
    }

    public final String b(dfmf dfmfVar) {
        dcdn<dfmf, Integer> dcdnVar = b;
        dbsk.a(dcdnVar.containsKey(dfmfVar));
        Activity activity = this.c;
        Integer num = dcdnVar.get(dfmfVar);
        dbsk.s(num);
        return activity.getString(num.intValue());
    }

    public final Picture c(dfmf dfmfVar, float f) {
        if (f < 20.0f) {
            return this.e.a().a(b(dfmfVar));
        }
        return this.e.a().b(b(dfmfVar), this.e.a().c(f));
    }
}
