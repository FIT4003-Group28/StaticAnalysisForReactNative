package defpackage;

import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: cqul  reason: default package */
/* loaded from: classes5.dex */
final class cqul extends cqun {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqul(Object[] objArr, int i) {
        super(objArr);
        this.a = i;
    }

    @Override // defpackage.cqun
    public final void Ss(LayerDrawable layerDrawable, int i) {
        layerDrawable.setId(i, this.a);
    }
}
