package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiek  reason: default package */
/* loaded from: classes.dex */
public abstract class aiek implements aiep, aiqi {
    private final aiev a;
    private boolean b;
    private final fgj c;

    public aiek(aiev aievVar, fgj fgjVar) {
        aievVar.getClass();
        this.a = aievVar;
        fgjVar.getClass();
        this.c = fgjVar;
    }

    @Override // defpackage.aiev
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.aiev
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.aiep
    public final PlaybackStartDescriptor d(aiqk aiqkVar) {
        fgh s = s(aiqkVar);
        if (s == null) {
            return null;
        }
        return s.a();
    }

    @Override // defpackage.aiev
    public final void e(aies aiesVar) {
        this.a.e(aiesVar);
    }

    @Override // defpackage.aiev
    public final void f(aiet aietVar) {
        this.a.f(aietVar);
    }

    @Override // defpackage.aiev
    public final void g(aieu aieuVar) {
        this.a.g(aieuVar);
    }

    @Override // defpackage.aiep
    public final void h(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor) {
        fgh s = s(aiqkVar);
        if (s == null || !aijn.c(s.a(), playbackStartDescriptor)) {
            throw new IllegalStateException("Navigation committed to a video that is not expected bythe navigable queue");
        }
        q(s);
    }

    @Override // defpackage.aiep
    public final void i(WatchNextResponseModel watchNextResponseModel) {
        this.b = watchNextResponseModel != null;
        aiev aievVar = this.a;
        if (aievVar instanceof kow) {
            ((kow) aievVar).a(watchNextResponseModel);
        }
    }

    @Override // defpackage.aiev
    public final void j(aies aiesVar) {
        this.a.j(aiesVar);
    }

    @Override // defpackage.aiev
    public final void k(aiet aietVar) {
        this.a.k(aietVar);
    }

    @Override // defpackage.aiev
    public final void l(aieu aieuVar) {
        this.a.l(aieuVar);
    }

    @Override // defpackage.aiev
    public final boolean m(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.a.m(playbackStartDescriptor);
    }

    @Override // defpackage.aiqi
    public /* synthetic */ boolean n(int i) {
        throw null;
    }

    @Override // defpackage.aiep
    public final int o(aiqk aiqkVar) {
        fgh s = s(aiqkVar);
        if (aiqkVar.e == aiqj.AUTOPLAY && s == null && !this.b) {
            return 3;
        }
        return aiqk.a(s != null);
    }

    @Override // defpackage.aiev
    public final int p(int i, fgh fghVar) {
        return this.a.p(i, fghVar);
    }

    @Override // defpackage.aiev
    public final int q(fgh fghVar) {
        return this.a.q(fghVar);
    }

    @Override // defpackage.aiev
    public final fgh r(int i, int i2) {
        return this.a.r(i, i2);
    }

    protected final fgh s(aiqk aiqkVar) {
        fgj fgjVar = this.c;
        int u = u();
        aiqj aiqjVar = aiqkVar.e;
        PlaybackStartDescriptor playbackStartDescriptor = aiqkVar.f;
        fgh b = playbackStartDescriptor != null ? fgjVar.b(playbackStartDescriptor) : null;
        int b2 = b(0);
        int b3 = b(1);
        aiqj aiqjVar2 = aiqj.NEXT;
        int ordinal = aiqjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int max = Math.max(c(), 0) - 1;
                if (u == 1 && b2 > 0) {
                    max = (max + b2) % b2;
                }
                if (zgd.P(max, 0, b2)) {
                    return r(0, max);
                }
                return null;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    if (u == 1 || c() != b2 - 1 || b3 <= 0) {
                        return null;
                    }
                    return r(1, 0);
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        return b;
                    }
                    return null;
                } else if (b == null) {
                    return null;
                } else {
                    int[] iArr = aiev.d;
                    for (int i = 0; i < 2; i++) {
                        int i2 = iArr[i];
                        int p = p(i2, b);
                        if (p != -1) {
                            return r(i2, p);
                        }
                    }
                    return null;
                }
            } else if (c() == -1) {
                return null;
            } else {
                if (u == 2 && zgd.P(c(), 0, b2)) {
                    fgh r = r(0, c());
                    PlaybackStartDescriptor a = r.a();
                    aopa mo52toBuilder = a.a.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    ory oryVar = (ory) mo52toBuilder.instance;
                    oryVar.b |= 128;
                    oryVar.k = true;
                    a.a = (ory) mo52toBuilder.mo39build();
                    return r;
                }
            }
        }
        int c = c() + 1;
        if (u == 1 && b2 > 0) {
            c %= b2;
        }
        if (zgd.P(c, 0, b2)) {
            return r(0, c);
        }
        if (aiqjVar == aiqj.NEXT && b3 > 0) {
            return r(1, 0);
        }
        return null;
    }

    @Override // defpackage.aiep
    public final /* synthetic */ aijp t() {
        return aijp.a;
    }
}
