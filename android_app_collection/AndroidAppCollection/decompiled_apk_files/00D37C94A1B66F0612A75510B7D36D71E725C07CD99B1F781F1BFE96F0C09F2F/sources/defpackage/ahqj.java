package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
/* compiled from: PG */
/* renamed from: ahqj  reason: default package */
/* loaded from: classes.dex */
final class ahqj implements Runnable {
    final /* synthetic */ SubtitlesStyle a;
    final /* synthetic */ ahqo b;

    public ahqj(ahqo ahqoVar, SubtitlesStyle subtitlesStyle) {
        this.b = ahqoVar;
        this.a = subtitlesStyle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.i(this.a);
    }
}
