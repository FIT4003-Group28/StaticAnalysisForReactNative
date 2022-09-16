package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: mdn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdn implements Consumer {
    public final /* synthetic */ mdp a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdn(mdp mdpVar) {
        this.a = mdpVar;
    }

    public /* synthetic */ mdn(mdp mdpVar, int i) {
        this.b = i;
        this.a = mdpVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            ((aizn) this.a.b.get()).i(((TimelineMarker) obj).a);
        } else {
            ((aizn) this.a.b.get()).i(((TimelineMarker) obj).a);
        }
    }
}
