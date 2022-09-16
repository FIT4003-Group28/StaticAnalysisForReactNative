package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: jjz  reason: default package */
/* loaded from: classes3.dex */
public final class jjz implements aguk {
    public final ankx a;
    public final aimr b;
    public final yrj c;
    public final jjs d;
    public final faw e;
    public final axwu f;
    private final agug g;

    public jjz(ankx ankxVar, agug agugVar, aimr aimrVar, yrj yrjVar, jjs jjsVar, faw fawVar, axwu axwuVar) {
        this.a = ankxVar;
        this.g = agugVar;
        this.b = aimrVar;
        this.c = yrjVar;
        this.d = jjsVar;
        this.e = fawVar;
        this.f = axwuVar;
    }

    public final WatchNextResponseModel a(PlaybackStartDescriptor playbackStartDescriptor, amuk amukVar) {
        ylr.b();
        return this.d.a(playbackStartDescriptor, amukVar);
    }

    @Override // defpackage.aguk
    public final ankt b(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z) {
        if (TextUtils.equals("PPSV", playbackStartDescriptor.k())) {
            ylr.b();
            faw fawVar = this.e;
            fas a = fau.a();
            a.b(aqpa.FILTER_TYPE_VIDEOS_ONLY);
            fau a2 = a.a();
            final aqpa aqpaVar = (aqpa) a2.a.e(aqpa.FILTER_TYPE_NONE);
            final int intValue = ((Integer) a2.b.e(-1)).intValue();
            final fbn fbnVar = (fbn) fawVar;
            faw fawVar2 = fbnVar.a;
            fas a3 = fau.a();
            a3.b(aqpaVar);
            a3.c(intValue);
            a3.d(fat.TIME_DESCENDING);
            return anii.i(anko.q(zna.r(fawVar2.b(a3.a()).z(new ayqe() { // from class: fbl
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    fbn fbnVar2 = fbn.this;
                    int i = intValue;
                    aqpa aqpaVar2 = aqpaVar;
                    final fav favVar = (fav) obj;
                    int i2 = -1;
                    if (i != -1) {
                        i2 = i - favVar.b.size();
                    }
                    faw fawVar3 = fbnVar2.b;
                    fas a4 = fau.a();
                    a4.b(aqpaVar2);
                    a4.c(i2);
                    a4.d(fat.NONE);
                    return fawVar3.b(a4.a()).z(new ayqe() { // from class: fbm
                        @Override // defpackage.ayqe
                        public final Object a(Object obj2) {
                            fav favVar2 = fav.this;
                            fav favVar3 = (fav) obj2;
                            amuf amufVar = new amuf();
                            amufVar.j(favVar2.b);
                            amufVar.j(favVar3.b);
                            return ayos.D(fav.a(favVar2.a + favVar3.a, amufVar.g()));
                        }
                    });
                }
            }))), new anir() { // from class: jjx
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    final jjz jjzVar = jjz.this;
                    final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                    boolean z2 = z;
                    final amuk amukVar = ((fav) obj).b;
                    try {
                        String l = playbackStartDescriptor2.l();
                        if (amukVar.isEmpty()) {
                            throw null;
                        }
                        if (TextUtils.isEmpty(l)) {
                            throw new IllegalArgumentException();
                        }
                        if (!TextUtils.equals(l, aakj.g(((aajj) amukVar.get(playbackStartDescriptor2.a())).d()))) {
                            for (int i = 0; i < amukVar.size(); i++) {
                                if (l.equals(aakj.g(((aajj) amukVar.get(i)).d()))) {
                                    apzg d = aguy.d(!TextUtils.isEmpty(playbackStartDescriptor2.k()) ? playbackStartDescriptor2.k() : "PPSV", l, i, playbackStartDescriptor2.i(), aoob.x(playbackStartDescriptor2.y()));
                                    aijl d2 = PlaybackStartDescriptor.d();
                                    d2.a = d;
                                    playbackStartDescriptor2 = d2.a();
                                }
                            }
                            throw new IllegalArgumentException();
                        }
                        if (!z2 || (!jjzVar.f.a().booleanValue() && !jjzVar.c.p())) {
                            return anlz.q(jjzVar.a(playbackStartDescriptor2, amukVar));
                        }
                        return anii.h(anhq.h(anii.h(anko.q(jjzVar.b.a(playbackStartDescriptor2)).r(3L, TimeUnit.SECONDS, jjzVar.a), jgl.k, jjzVar.a), TimeoutException.class, jgl.l, jjzVar.a), new ampg() { // from class: jjw
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                jjz jjzVar2 = jjz.this;
                                PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                amuk amukVar2 = amukVar;
                                Optional optional = (Optional) obj2;
                                ylr.b();
                                if (optional.isPresent()) {
                                    return jjzVar2.d.b((WatchNextResponseModel) optional.get(), playbackStartDescriptor3, amukVar2);
                                }
                                return jjzVar2.a(playbackStartDescriptor3, amukVar2);
                            }
                        }, jjzVar.a);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        if (playbackStartDescriptor2.l().isEmpty()) {
                            return anlz.u(new Callable() { // from class: jjy
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return jjz.this.d.e();
                                }
                            }, jjzVar.a);
                        }
                        return anii.h(anko.q(zna.r(jjzVar.e.a(playbackStartDescriptor2.l()).w(iyw.u).R(Optional.empty()))), new ampg() { // from class: jjv
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                jjz jjzVar2 = jjz.this;
                                PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                Optional optional = (Optional) obj2;
                                ylr.b();
                                if (optional.isPresent()) {
                                    return jjzVar2.d.c(playbackStartDescriptor3, (aajj) optional.get());
                                }
                                return jjzVar2.d.e();
                            }
                        }, jjzVar.a);
                    }
                }
            }, this.a);
        }
        return this.g.b(playbackStartDescriptor, z);
    }
}
