package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: fdu  reason: default package */
/* loaded from: classes3.dex */
public final class fdu implements aiqc, aiky {
    public final Set a;
    public fdq b = fdq.WATCH_WHILE;
    private final axnm c;
    private final Map d;
    private final Map e;
    private final boolean f;

    public fdu(axnm axnmVar, azqb azqbVar, azqb azqbVar2, axnm axnmVar2, axnm axnmVar3, aacz aaczVar) {
        this.c = axnmVar;
        amum h = amup.h();
        h.f(fdq.WATCH_WHILE, azqbVar);
        h.f(fdq.REEL, azqbVar2);
        this.d = h.b();
        amum h2 = amup.h();
        h2.f(fdq.WATCH_WHILE, axnmVar2);
        h2.f(fdq.REEL, axnmVar3);
        this.e = h2.b();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        aukw aukwVar = aaczVar.b().E;
        this.f = (aukwVar == null ? aukw.a : aukwVar).e;
        asxj asxjVar = aaczVar.b().e;
        if (!(asxjVar == null ? asxj.a : asxjVar).cf) {
            axnmVar2.get();
            axnmVar3.get();
        }
    }

    @Override // defpackage.aiky
    public final aikx a(final PlaybackStartDescriptor playbackStartDescriptor) {
        return (aikx) Optional.ofNullable((axnm) this.e.get(this.b)).map(new Function() { // from class: fdr
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((aiky) ((axnm) obj).get()).a(PlaybackStartDescriptor.this);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElse(null);
    }

    @Override // defpackage.aiqc
    public final aiqb b(PlaybackStartDescriptor playbackStartDescriptor) {
        aiqc aiqcVar = (aiqc) Optional.ofNullable((azqb) this.d.get(this.b)).map(eoo.e).orElse(null);
        aiqcVar.getClass();
        return aiqcVar.b(playbackStartDescriptor);
    }

    @Override // defpackage.aiqc
    public final aiqb c(final SequencerState sequencerState) {
        return (aiqb) Optional.ofNullable((azqb) this.d.get(this.b)).map(eoo.e).map(new Function() { // from class: fds
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((aiqc) obj).c(SequencerState.this);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElse(null);
    }

    public final void d(fdt fdtVar) {
        this.a.add(fdtVar);
    }

    public final void e(fdq fdqVar) {
        if (this.b == fdqVar) {
            return;
        }
        this.b = fdqVar;
        for (fdt fdtVar : this.a) {
            fdtVar.k(fdqVar);
        }
        if (this.f) {
            return;
        }
        ((airr) this.c.get()).s();
    }

    @Override // defpackage.aiqc
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor, aiqb aiqbVar) {
        aiqc aiqcVar = (aiqc) Optional.ofNullable((azqb) this.d.get(this.b)).map(eoo.e).orElse(null);
        aiqcVar.getClass();
        return aiqcVar.f(playbackStartDescriptor, aiqbVar);
    }
}
