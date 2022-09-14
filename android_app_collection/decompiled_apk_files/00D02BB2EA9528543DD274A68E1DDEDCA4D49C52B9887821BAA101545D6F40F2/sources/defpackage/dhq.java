package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.View;
/* compiled from: PG */
/* renamed from: dhq  reason: default package */
/* loaded from: classes6.dex */
public final class dhq {
    public static Picture a(View view) {
        Picture picture = new Picture();
        view.measure(0, 0);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Canvas beginRecording = picture.beginRecording(view.getMeasuredWidth(), view.getMeasuredHeight());
        beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
        view.draw(beginRecording);
        picture.endRecording();
        return picture;
    }
}
