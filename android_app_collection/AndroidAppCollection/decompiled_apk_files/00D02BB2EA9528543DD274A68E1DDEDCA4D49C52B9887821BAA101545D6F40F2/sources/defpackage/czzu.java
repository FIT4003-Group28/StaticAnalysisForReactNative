package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: czzu  reason: default package */
/* loaded from: classes5.dex */
final class czzu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ daaa a;

    public czzu(daaa daaaVar) {
        this.a = daaaVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        daaa daaaVar = this.a;
        float rotation = daaaVar.B.getRotation();
        if (daaaVar.r != rotation) {
            daaaVar.r = rotation;
            return true;
        }
        return true;
    }
}
