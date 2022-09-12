package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
/* compiled from: PG */
/* renamed from: hi  reason: default package */
/* loaded from: classes6.dex */
final class hi extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public hi(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
