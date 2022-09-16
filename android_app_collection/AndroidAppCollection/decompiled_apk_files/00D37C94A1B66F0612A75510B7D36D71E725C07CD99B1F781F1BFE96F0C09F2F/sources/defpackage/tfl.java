package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
/* compiled from: PG */
/* renamed from: tfl  reason: default package */
/* loaded from: classes4.dex */
public final class tfl {
    public final awmt a;
    public final tcu b;
    private final awmt c;
    private FrameSequenceDrawable d;
    private final Object e;

    public tfl(awmt awmtVar, awmt awmtVar2, tcu tcuVar, Object obj) {
        this.a = awmtVar;
        this.c = awmtVar2;
        this.b = tcuVar;
        this.e = obj;
    }

    public final void a() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.setOnFinishedListener(null);
        }
        this.d = null;
    }

    public final void b(FrameSequenceDrawable frameSequenceDrawable) {
        this.d = frameSequenceDrawable;
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.setOnFinishedListener(new FrameSequenceDrawable.OnFinishedListener() { // from class: tfk
            @Override // android.support.rastermill.FrameSequenceDrawable.OnFinishedListener
            public final void onFinished(FrameSequenceDrawable frameSequenceDrawable2) {
                tfl tflVar = tfl.this;
                awmt awmtVar = tflVar.a;
                if (awmtVar != null) {
                    tflVar.b.b(awmtVar, tcs.a().a()).Q();
                }
                frameSequenceDrawable2.setLoopBehavior(1);
                frameSequenceDrawable2.setLoopCount(1);
                frameSequenceDrawable2.start();
            }
        });
    }

    public final void c() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.start();
            awmt awmtVar = this.c;
            if (awmtVar == null) {
                return;
            }
            this.b.b(awmtVar, null).Q();
        }
    }

    public final void d() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tfl) {
            tfl tflVar = (tfl) obj;
            Object obj2 = this.e;
            if (obj2 instanceof aodt) {
                Object obj3 = tflVar.e;
                if (obj3 instanceof aodt) {
                    return tfy.c((aodt) obj2, (aodt) obj3);
                }
            }
            return obj2.equals(tflVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
