package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vag  reason: default package */
/* loaded from: classes4.dex */
public final class vag {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/sampling/Sampler");
    private static final vac e = vac.a(Integer.MAX_VALUE);
    public volatile val b = vak.a;
    public volatile int d = 3;
    public volatile vac c = e;

    public vag(final Context context, final Executor executor, final vak vakVar, final axnm axnmVar, boolean z, azqb azqbVar) {
        final azqb azqbVar2 = true != z ? null : azqbVar;
        anlz.t(new Runnable() { // from class: vad
            @Override // java.lang.Runnable
            public final void run() {
                final vag vagVar = vag.this;
                Context context2 = context;
                final vak vakVar2 = vakVar;
                final axnm axnmVar2 = axnmVar;
                final azqb azqbVar3 = azqbVar2;
                final Executor executor2 = executor;
                sre.b(context2, new Runnable() { // from class: vaf
                    @Override // java.lang.Runnable
                    public final void run() {
                        final vag vagVar2 = vag.this;
                        final vak vakVar3 = vakVar2;
                        final axnm axnmVar3 = axnmVar2;
                        final azqb azqbVar4 = azqbVar3;
                        anlz.t(new Runnable() { // from class: vae
                            @Override // java.lang.Runnable
                            public final void run() {
                                vag vagVar3 = vag.this;
                                vak vakVar4 = vakVar3;
                                axnm axnmVar4 = axnmVar3;
                                azqb azqbVar5 = azqbVar4;
                                try {
                                    uum uumVar = (uum) axnmVar4.get();
                                    vagVar3.d = uumVar.b();
                                    vagVar3.c = vac.a(uumVar.a());
                                } catch (Throwable th) {
                                    ((amzw) ((amzw) ((amzw) vag.a.g()).h(th)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingConfig", 'O', "Sampler.java")).q("Couldn't get config");
                                    vagVar3.d = 2;
                                }
                                if (vagVar3.d != 3 || azqbVar5 == null) {
                                    if (azqbVar5 != null) {
                                        return;
                                    }
                                    aopa createBuilder = baaw.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    baaw baawVar = (baaw) createBuilder.instance;
                                    baawVar.d = 2;
                                    baawVar.b |= 4;
                                    vagVar3.b = vakVar4.a((baaw) createBuilder.mo39build());
                                    return;
                                }
                                try {
                                    vagVar3.b = vakVar4.a((baaw) azqbVar5.get());
                                } catch (Throwable th2) {
                                    ((amzw) ((amzw) ((amzw) vag.a.g()).h(th2)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingConfig", 'X', "Sampler.java")).q("Couldn't get sampling strategy");
                                    aopa createBuilder2 = baaw.a.createBuilder();
                                    createBuilder2.copyOnWrite();
                                    baaw baawVar2 = (baaw) createBuilder2.instance;
                                    baawVar2.b = 2 | baawVar2.b;
                                    baawVar2.c = 0L;
                                    createBuilder2.copyOnWrite();
                                    baaw baawVar3 = (baaw) createBuilder2.instance;
                                    baawVar3.d = 1;
                                    baawVar3.b |= 4;
                                    vagVar3.b = vakVar4.a((baaw) createBuilder2.mo39build());
                                }
                            }
                        }, executor2);
                    }
                });
            }
        }, executor);
    }
}
