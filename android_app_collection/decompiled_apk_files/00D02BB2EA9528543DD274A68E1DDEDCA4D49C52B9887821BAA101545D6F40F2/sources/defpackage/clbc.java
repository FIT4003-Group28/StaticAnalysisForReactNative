package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: clbc  reason: default package */
/* loaded from: classes5.dex */
final class clbc {
    public final long a;
    public final int b;

    public clbc(MotionEvent motionEvent) {
        this.a = motionEvent.getEventTime();
        this.b = motionEvent.getActionMasked();
    }
}
