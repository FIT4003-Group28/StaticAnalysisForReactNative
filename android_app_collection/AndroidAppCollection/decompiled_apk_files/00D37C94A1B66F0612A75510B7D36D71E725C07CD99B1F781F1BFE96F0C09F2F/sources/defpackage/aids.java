package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aids  reason: default package */
/* loaded from: classes.dex */
public final class aids {
    public static final aidq a = new aidp();
    public final ailf b;
    private final Executor c;
    private final aadd d;

    public aids(ailf ailfVar, Executor executor, aadd aaddVar) {
        ailfVar.getClass();
        this.b = ailfVar;
        executor.getClass();
        this.c = executor;
        aaddVar.getClass();
        this.d = aaddVar;
    }

    public final void a(PlaybackStartDescriptor playbackStartDescriptor, aiju aijuVar, aidq aidqVar) {
        b(playbackStartDescriptor, aijuVar, aidqVar, -1L, null);
    }

    public final void b(PlaybackStartDescriptor playbackStartDescriptor, aiju aijuVar, aidq aidqVar, long j, afmv afmvVar) {
        if (TextUtils.isEmpty(playbackStartDescriptor.l()) || aijuVar == null || (aijuVar.b == 1 && aijuVar.a <= 0)) {
            aidqVar.b(4);
            return;
        }
        auaf auafVar = this.d.a().j;
        if (auafVar == null) {
            auafVar = auaf.a;
        }
        if (auafVar.k) {
            aidqVar.b(5);
        } else {
            this.c.execute(new aidr(this, playbackStartDescriptor, aijuVar, aidqVar, j, afmvVar));
        }
    }
}
