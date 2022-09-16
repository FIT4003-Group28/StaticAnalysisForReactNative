package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aidz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aidz implements agr {
    public final /* synthetic */ aiea a;
    public final /* synthetic */ PlaybackStartDescriptor b;
    public final /* synthetic */ aiec c;
    private final /* synthetic */ int d;

    public /* synthetic */ aidz(aiea aieaVar, PlaybackStartDescriptor playbackStartDescriptor, aiec aiecVar) {
        this.a = aieaVar;
        this.b = playbackStartDescriptor;
        this.c = aiecVar;
    }

    public /* synthetic */ aidz(aiea aieaVar, PlaybackStartDescriptor playbackStartDescriptor, aiec aiecVar, int i) {
        this.d = i;
        this.a = aieaVar;
        this.b = playbackStartDescriptor;
        this.c = aiecVar;
    }

    @Override // defpackage.agr
    public final Object a(agp agpVar) {
        if (this.d == 0) {
            aiea aieaVar = this.a;
            PlaybackStartDescriptor playbackStartDescriptor = this.b;
            aiec aiecVar = this.c;
            Executor executor = aieaVar.a;
            aicz aiczVar = aieaVar.c;
            aids aidsVar = (aids) aiczVar.a.get();
            aidsVar.getClass();
            executor.execute(new aicy(aidsVar, (aicx) aiczVar.b.get(), agpVar, playbackStartDescriptor, aiecVar));
            return "PrefetchPrebufferManagerImpl.doPrefetch operation";
        }
        aiea aieaVar2 = this.a;
        PlaybackStartDescriptor playbackStartDescriptor2 = this.b;
        aiec aiecVar2 = this.c;
        Executor executor2 = aieaVar2.a;
        aids aidsVar2 = (aids) aieaVar2.d.a.get();
        aidsVar2.getClass();
        executor2.execute(new aidd(aidsVar2, agpVar, playbackStartDescriptor2, aiecVar2));
        return "PrefetchPrebufferManagerImpl.doOnesiePrefetchPrebuffer operation";
    }
}
