package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: czxk  reason: default package */
/* loaded from: classes5.dex */
final class czxk extends czyl {
    final /* synthetic */ int a;
    final /* synthetic */ czxs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czxk(czxs czxsVar, Context context, int i, int i2) {
        super(i);
        this.b = czxsVar;
        this.a = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aag
    public final void K(aci aciVar, int[] iArr) {
        if (this.a == 0) {
            iArr[0] = this.b.f.getWidth();
            iArr[1] = this.b.f.getWidth();
            return;
        }
        iArr[0] = this.b.f.getHeight();
        iArr[1] = this.b.f.getHeight();
    }
}
