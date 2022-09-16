package defpackage;

import android.graphics.PointF;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: kdm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kdm implements Consumer {
    public final /* synthetic */ kdo a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdm(kdo kdoVar, int i) {
        this.b = i;
        this.a = kdoVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            kdo kdoVar = this.a;
            TimelineMarker timelineMarker = (TimelineMarker) obj;
            kdoVar.c.add(new PointF(((float) timelineMarker.a) / ((float) kdoVar.i), timelineMarker.d));
            return;
        }
        ((View) obj).addOnLayoutChangeListener(this.a);
    }
}
