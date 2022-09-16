package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aidr  reason: default package */
/* loaded from: classes.dex */
public final class aidr implements Runnable {
    final /* synthetic */ aids a;
    private final PlaybackStartDescriptor b;
    private final aiju c;
    private final aidq d;
    private final long e;
    private final afmv f;

    public aidr(aids aidsVar, PlaybackStartDescriptor playbackStartDescriptor, aiju aijuVar, aidq aidqVar, long j, afmv afmvVar) {
        this.a = aidsVar;
        this.b = playbackStartDescriptor;
        this.c = aijuVar;
        this.d = aidqVar;
        this.e = j;
        this.f = afmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aanr aanrVar;
        ylr.b();
        ailf ailfVar = this.a.b;
        PlaybackStartDescriptor playbackStartDescriptor = this.b;
        aiju aijuVar = this.c;
        aopa createBuilder = atyk.a.createBuilder();
        int i = aijuVar.a;
        if (i > 0) {
            createBuilder.copyOnWrite();
            atyk atykVar = (atyk) createBuilder.instance;
            atykVar.b |= 1;
            atykVar.c = i;
        }
        int i2 = aijuVar.b;
        if (i2 != 1) {
            createBuilder.copyOnWrite();
            atyk atykVar2 = (atyk) createBuilder.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            atykVar2.d = i3;
            atykVar2.b |= 2;
        }
        long j = this.e;
        afmv afmvVar = this.f;
        aina a = ailfVar.d.a(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), -1, ailfVar.f, playbackStartDescriptor.h(ailfVar.k), null, true);
        a.Q = (atyk) createBuilder.mo39build();
        a.G = playbackStartDescriptor.s();
        a.H = playbackStartDescriptor.r();
        a.f51J = playbackStartDescriptor.u();
        if (aiix.g(ailfVar.h)) {
            aanrVar = aanr.h(ailfVar.h, playbackStartDescriptor.f(), playbackStartDescriptor.h(ailfVar.k), playbackStartDescriptor.c(), afmvVar, playbackStartDescriptor.z());
        } else {
            aanrVar = null;
        }
        if (aanrVar != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            aanrVar.i();
            aanrVar.f(playbackStartDescriptor.l());
            if (j >= 0) {
                int i4 = (int) j;
                aanrVar.l = i4;
                aanrVar.k = i4;
            }
        }
        ankt c = ailfVar.c(playbackStartDescriptor.l(), null, a, aanrVar, false, false, null);
        this.d.b(2);
        try {
            this.d.b(3);
            this.d.a((PlayerResponseModel) c.get());
        } catch (InterruptedException | ExecutionException unused) {
            this.d.b(4);
        }
    }
}
