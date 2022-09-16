package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ofe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ofe implements amqo {
    public final /* synthetic */ ofg a;
    public final /* synthetic */ int b;

    public /* synthetic */ ofe(ofg ofgVar, int i) {
        this.a = ofgVar;
        this.b = i;
    }

    @Override // defpackage.amqo
    public final Object get() {
        ofg ofgVar = this.a;
        return new Rect(ofgVar.d.getLeft(), ofgVar.d.getTop(), ofgVar.d.getWidth(), ofgVar.d.getHeight() - this.b);
    }
}
