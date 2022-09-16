package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.List;
/* compiled from: PG */
/* renamed from: izt  reason: default package */
/* loaded from: classes3.dex */
public final class izt implements aibg {
    public final aibe a;
    private Optional b = Optional.empty();

    public izt(aibe aibeVar) {
        this.a = aibeVar;
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        aqxo.y(!this.b.isPresent());
        this.b = Optional.ofNullable(aibfVar);
    }

    @Override // defpackage.aibg
    public final void r(final List list) {
        this.b.ifPresent(new Consumer() { // from class: izs
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                izt.this.a.b(list, (aibf) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }
}
