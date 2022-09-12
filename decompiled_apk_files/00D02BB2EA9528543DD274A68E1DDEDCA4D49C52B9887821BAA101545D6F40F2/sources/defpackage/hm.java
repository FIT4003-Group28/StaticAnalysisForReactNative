package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
/* compiled from: PG */
/* renamed from: hm  reason: default package */
/* loaded from: classes6.dex */
final class hm extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public hm(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
