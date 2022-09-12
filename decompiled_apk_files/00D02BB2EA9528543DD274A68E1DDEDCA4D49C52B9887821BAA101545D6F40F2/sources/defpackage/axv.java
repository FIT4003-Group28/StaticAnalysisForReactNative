package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: axv  reason: default package */
/* loaded from: classes3.dex */
final class axv extends ayl {
    final /* synthetic */ Rect a;

    public axv(Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.ayl
    public final Rect a() {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
