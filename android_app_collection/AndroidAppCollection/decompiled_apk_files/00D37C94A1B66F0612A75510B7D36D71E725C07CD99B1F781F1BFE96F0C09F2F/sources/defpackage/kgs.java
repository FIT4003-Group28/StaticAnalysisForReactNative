package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: kgs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgs implements Consumer {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgs(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2 && i == 3) {
            return consumer.getClass();
        }
        return consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        TimelineMarker[] m;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                int i2 = iou.cp;
                ((fxh) obj).a = this.a;
                return;
            } else if (i == 2) {
                ((ffo) obj).p(this.a);
                return;
            } else if (i == 3) {
                ((ffo) obj).setClickable(this.a);
                return;
            } else {
                ((ffo) obj).s(this.a);
                return;
            }
        }
        boolean z = this.a;
        aifm aifmVar = (aifm) obj;
        if (aifmVar.h == null) {
            return;
        }
        aifj aifjVar = aifmVar.c;
        if (!aifjVar.c || (m = aifjVar.a.m(aicb.CHAPTER)) == null || m.length == 0) {
            aifmVar.h.f(z);
        } else {
            aifmVar.h.g(z, 1);
        }
    }
}
