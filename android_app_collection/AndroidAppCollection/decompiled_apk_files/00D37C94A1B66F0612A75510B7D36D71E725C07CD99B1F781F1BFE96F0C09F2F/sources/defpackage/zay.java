package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: zay  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zay implements zaz {
    public final /* synthetic */ zba a;
    private final /* synthetic */ int b;

    public /* synthetic */ zay(zba zbaVar, int i) {
        this.b = i;
        this.a = zbaVar;
    }

    @Override // defpackage.zaz
    public final boolean a(MotionEvent motionEvent) {
        if (this.b == 0) {
            return this.a.A(motionEvent);
        }
        return this.a.z(motionEvent);
    }
}
