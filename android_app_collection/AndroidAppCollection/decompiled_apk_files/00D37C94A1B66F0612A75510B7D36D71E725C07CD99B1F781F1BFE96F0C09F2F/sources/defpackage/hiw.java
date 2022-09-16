package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
/* compiled from: PG */
/* renamed from: hiw  reason: default package */
/* loaded from: classes3.dex */
public final class hiw extends Handler {
    private float a = Float.NaN;
    private final ShortsVideoTrimView2 b;

    public hiw(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.b = shortsVideoTrimView2;
    }

    public final void a() {
        removeMessages(0);
        this.a = Float.NaN;
    }

    public final void b(long j, float f) {
        boolean isNaN = Float.isNaN(this.a);
        float abs = Math.abs(f - this.a);
        float f2 = this.b.e / 2;
        if (isNaN || abs > f2) {
            removeMessages(0);
            sendEmptyMessageDelayed(0, j);
            this.a = f;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        vqp vqpVar;
        if (message.what != 0) {
            return;
        }
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.b;
        if (!shortsVideoTrimView2.m || !shortsVideoTrimView2.B() || this.b.E()) {
            return;
        }
        ShortsVideoTrimView2 shortsVideoTrimView22 = this.b;
        if (!shortsVideoTrimView22.z) {
            shortsVideoTrimView22.m();
        }
        ShortsVideoTrimView2 shortsVideoTrimView23 = this.b;
        if (!shortsVideoTrimView23.l) {
            return;
        }
        aqxo.y(!shortsVideoTrimView23.E());
        aqxo.y(shortsVideoTrimView23.B());
        vqp vqpVar2 = shortsVideoTrimView23.t;
        if (vqpVar2 == null || vqpVar2.b <= shortsVideoTrimView23.q) {
            return;
        }
        long k = shortsVideoTrimView23.y == hkc.BEGIN ? shortsVideoTrimView23.k() : shortsVideoTrimView23.j();
        double b = shortsVideoTrimView23.t == null ? 0.0d : vqpVar.b(k);
        double d = k;
        double d2 = shortsVideoTrimView23.q;
        Double.isNaN(d2);
        Double.isNaN(d);
        long j = (long) (d - (b * d2));
        Double.isNaN(d2);
        Double.isNaN(d);
        long j2 = (long) (d + ((1.0d - b) * d2));
        vqp vqpVar3 = shortsVideoTrimView23.t;
        long j3 = 0;
        shortsVideoTrimView23.n = vqpVar3 == null ? 0L : vqpVar3.e(0.0f);
        vqp vqpVar4 = shortsVideoTrimView23.t;
        if (vqpVar4 != null) {
            j3 = vqpVar4.e(1.0f);
        }
        shortsVideoTrimView23.o = j3;
        vvl vvlVar = shortsVideoTrimView23.v;
        if (vvlVar != null) {
            shortsVideoTrimView23.x = new vvt(vvlVar);
            shortsVideoTrimView23.x.a(j, j2);
            shortsVideoTrimView23.x.k(shortsVideoTrimView23);
        }
        vqp vqpVar5 = shortsVideoTrimView23.t;
        if (vqpVar5 != null) {
            vqpVar5.l(j, j2);
        }
        shortsVideoTrimView23.s();
        shortsVideoTrimView23.x();
        shortsVideoTrimView23.n(shortsVideoTrimView23.d);
        shortsVideoTrimView23.requestLayout();
    }
}
