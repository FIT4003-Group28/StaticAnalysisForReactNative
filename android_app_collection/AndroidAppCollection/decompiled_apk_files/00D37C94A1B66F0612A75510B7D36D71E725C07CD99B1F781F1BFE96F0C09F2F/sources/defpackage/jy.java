package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
/* compiled from: PG */
/* renamed from: jy  reason: default package */
/* loaded from: classes3.dex */
public final class jy {
    public final GestureDetector a;

    public jy(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }
}
