package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbwl  reason: default package */
/* loaded from: classes3.dex */
public final class bbwl extends OrientationEventListener {
    final /* synthetic */ bbwn a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbwl(bbwn bbwnVar, Context context) {
        super(context, 2);
        this.a = bbwnVar;
        this.b = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        if (i == -1 || (i2 = (((i + 45) / 90) * 90) % 360) == this.b) {
            return;
        }
        this.b = i2;
        bbwn bbwnVar = this.a;
        bbyi bbyiVar = bbwnVar.m;
        if (bbyiVar != null) {
            bbyy bbyyVar = bbyiVar.a;
            bbyyVar.l = i2;
            bbyyVar.x();
        }
        if (bbwnVar.h == null) {
            return;
        }
        int i3 = ((bbwn.e().orientation + i2) + 360) % 360;
        bbwnVar.j = i3;
        bbwnVar.g.c = i3;
    }
}
