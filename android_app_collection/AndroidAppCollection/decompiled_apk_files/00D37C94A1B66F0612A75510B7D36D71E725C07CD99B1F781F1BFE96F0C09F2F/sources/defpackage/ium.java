package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
/* compiled from: PG */
/* renamed from: ium  reason: default package */
/* loaded from: classes3.dex */
final class ium extends OrientationEventListener {
    final /* synthetic */ iuq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ium(iuq iuqVar, Context context) {
        super(context);
        this.a = iuqVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        this.a.e();
    }
}
