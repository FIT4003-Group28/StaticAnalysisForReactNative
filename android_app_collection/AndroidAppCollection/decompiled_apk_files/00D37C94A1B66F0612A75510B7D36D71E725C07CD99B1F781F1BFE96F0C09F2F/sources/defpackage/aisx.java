package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
/* compiled from: PG */
/* renamed from: aisx  reason: default package */
/* loaded from: classes.dex */
public final class aisx {
    public ajah a;
    private final aipq b;

    public aisx(aipq aipqVar) {
        this.b = aipqVar;
    }

    public final synchronized void a() {
        ajah ajahVar = this.a;
        if (ajahVar != null) {
            ajahVar.M();
        }
        this.a = null;
    }

    public final synchronized void b(DirectorSavedState directorSavedState, aijp aijpVar) {
        ajah ajahVar = this.a;
        if (ajahVar != null) {
            ajahVar.M();
        }
        this.a = this.b.a().b(directorSavedState, aijpVar);
    }

    public final synchronized void c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        ajah ajahVar = this.a;
        if (ajahVar != null) {
            ajahVar.M();
        }
        this.a = this.b.a().a(playbackStartDescriptor, aijpVar);
    }
}
