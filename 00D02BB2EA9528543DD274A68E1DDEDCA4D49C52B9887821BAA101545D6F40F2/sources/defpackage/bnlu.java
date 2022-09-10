package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
/* compiled from: PG */
/* renamed from: bnlu  reason: default package */
/* loaded from: classes3.dex */
final class bnlu extends OrientationEventListener {
    final /* synthetic */ bnlv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnlu(bnlv bnlvVar, Context context) {
        super(context);
        this.a = bnlvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        bnly bnlyVar = this.a.a;
        if (bnlyVar.r != bnlyVar.f.getResources().getConfiguration().orientation) {
            this.a.a.j();
        }
    }
}
