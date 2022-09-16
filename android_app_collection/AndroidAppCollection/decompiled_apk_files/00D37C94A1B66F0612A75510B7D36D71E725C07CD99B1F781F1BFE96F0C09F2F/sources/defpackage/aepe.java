package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aepe  reason: default package */
/* loaded from: classes.dex */
public final class aepe implements afdx {
    private static final aequ o = new aequ(afte.NATIVE_MEDIA_PLAYER);
    private static final Set p = Collections.singleton(Integer.valueOf(aalx.RAW.bD));
    public final yrj a;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public FormatStreamModel h;
    public PlayerConfigModel i;
    public long j;
    public int k;
    public int l;
    public float m;
    public final afjz n;
    private final Context q;
    private final aeha r;
    private final aeoc s;
    private String v;
    private final AtomicReference t = new AtomicReference();
    private final aepd u = new aepd(this);
    public aetv b = aetv.c;
    private int w = 0;

    public aepe(Context context, yrj yrjVar, aeha aehaVar, aeoc aeocVar, afjz afjzVar) {
        this.q = context;
        this.a = yrjVar;
        this.r = aehaVar;
        this.s = aeocVar;
        this.n = afjzVar;
    }

    private final aegu L(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aegs aegsVar, int i, String str) {
        return this.r.c(playerConfigModel, videoStreamingData.o, aegsVar, aeha.a, p, 1, i, str, aeub.a);
    }

    private final void O(FormatStreamModel formatStreamModel, long j) {
        this.h = formatStreamModel;
        this.j = j;
        E(true);
        this.g = true;
        int i = (int) formatStreamModel.c;
        this.k = i;
        this.b.k(0L, i);
        try {
            aeof a = this.s.a(formatStreamModel);
            a.k(1 != (this.w & 1) ? 3 : 4);
            a.n(this.u);
            this.b.a().F();
            Uri uri = formatStreamModel.d;
            this.t.set(a);
            if (a == null || uri == null) {
                String valueOf = String.valueOf(a);
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
                sb.append("Media Player null pointer preparing video ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                zep.l(sb.toString());
                this.b.g(new afkn("android.fw.npe", 0L, new NullPointerException()));
                return;
            }
            try {
                try {
                    this.b.r();
                    a.l(this.q, uri, null, this.i);
                    a.g();
                    this.b.c(a.a());
                    A(false);
                } catch (IllegalArgumentException e) {
                    zep.n("Media Player error preparing video", e);
                    this.b.g(new afkn("android.fw.ise", 0L, e));
                }
            } catch (IOException e2) {
                zep.n("Media Player error preparing video", e2);
                this.b.g(new afkn("android.fw.prepare", 0L, e2));
            } catch (IllegalStateException e3) {
                zep.n("Error calling mediaPlayer", e3);
            }
        } catch (InstantiationException e4) {
            zep.b("Factory failed to create a MediaPlayer for the stream");
            this.b.g(new afkn("android.fw.create", 0L, e4));
        }
    }

    public final void A(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (z) {
                if (this.g) {
                    this.b.d();
                } else {
                    this.b.n();
                }
            } else if (this.g) {
                this.b.q();
                this.b.s(-1L);
            } else {
                this.b.m();
            }
        }
    }

    @Override // defpackage.affb
    public final void B(long j, auqn auqnVar) {
        if (this.j != j) {
            this.f = true;
            this.j = j;
            aeof aeofVar = (aeof) this.t.get();
            if (this.g) {
                this.b.t(j);
            } else {
                this.b.o(j);
            }
            if (aeofVar == null || !this.c) {
                O(this.h, j);
                return;
            }
            try {
                aeofVar.j(j);
                if (this.d || !this.g) {
                    return;
                }
                u();
            } catch (IllegalStateException e) {
                zep.n("Error calling mediaPlayer", e);
            }
        }
    }

    @Override // defpackage.affb
    public final void C(float f) {
    }

    @Override // defpackage.affb
    public final void D(float f) {
        this.m = f;
        aeof aeofVar = (aeof) this.t.get();
        if (aeofVar != null) {
            aeofVar.q(f, f);
        }
    }

    public final void E(boolean z) {
        this.c = false;
        this.d = false;
        this.g = false;
        this.v = null;
        A(false);
        aeof aeofVar = (aeof) this.t.getAndSet(null);
        if (aeofVar != null) {
            this.b.b(aeofVar.a());
            if (z) {
                this.b.v();
            }
            aeofVar.i();
        }
    }

    @Override // defpackage.afgg
    public final void F(boolean z) {
        E(z);
    }

    @Override // defpackage.affb
    public final boolean G() {
        return this.e;
    }

    @Override // defpackage.afdx
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return videoStreamingData.F();
    }

    @Override // defpackage.affb
    public final boolean I() {
        return this.t.get() != null && this.d;
    }

    @Override // defpackage.afgg
    public final boolean J(afgf afgfVar) {
        return false;
    }

    @Override // defpackage.afgg
    public final afte K(aetw aetwVar) {
        aetv a = aetwVar.a();
        this.b = a;
        a.j(afte.NATIVE_MEDIA_PLAYER);
        this.i = aetwVar.e;
        this.m = aetwVar.i;
        try {
            VideoStreamingData videoStreamingData = aetwVar.b;
            PlayerConfigModel playerConfigModel = this.i;
            amvn amvnVar = aeha.a;
            aegu L = L(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.v);
            int i = L.g;
            if (i != Integer.MAX_VALUE) {
                this.b.i("lmdu", new aest(Integer.toString(i)));
            }
            FormatStreamModel formatStreamModel = L.b[0];
            this.b.h(new aesr(null, formatStreamModel, null, L.d, L.e, L.f, 1, -1L, 0, aesq.a(f(), g(), -1)));
            this.g = afgn.c(this.w, 2);
            this.w = aetwVar.k;
            O(formatStreamModel, aetwVar.c.a);
            this.v = aetwVar.d;
            return afte.NATIVE_MEDIA_PLAYER;
        } catch (aegw e) {
            this.b.g(new afkn("fmt.noneavailable", 0L, e));
            return afte.NATIVE_MEDIA_PLAYER;
        }
    }

    @Override // defpackage.affb
    public final void M() {
        E(true);
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void N(boolean z, int i) {
    }

    @Override // defpackage.affb
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.affb
    public final int b() {
        return -1;
    }

    @Override // defpackage.afgg
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return this.n.C() ? 16 : 0;
    }

    @Override // defpackage.afgg
    public final int d() {
        return -1;
    }

    @Override // defpackage.affb
    public final int e() {
        return -1;
    }

    @Override // defpackage.afgg
    public final long f() {
        return (this.l / 100.0f) * this.k;
    }

    @Override // defpackage.afgg
    public final long g() {
        aeof aeofVar = (aeof) this.t.get();
        if (aeofVar != null && this.c) {
            this.j = aeofVar.b();
        }
        return this.j;
    }

    @Override // defpackage.afgg
    public final long h() {
        return -1L;
    }

    @Override // defpackage.afgg
    public final long i() {
        return this.k;
    }

    @Override // defpackage.affb
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.affb
    public final FormatStreamModel k() {
        return this.h;
    }

    @Override // defpackage.affb
    public final FormatStreamModel l() {
        return null;
    }

    @Override // defpackage.afgg
    public final aegu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        return L(videoStreamingData, playerConfigModel, aegsVar, i, null);
    }

    @Override // defpackage.affb
    public final aequ n() {
        return o;
    }

    @Override // defpackage.affb
    public final String o() {
        return this.v;
    }

    @Override // defpackage.afgg
    public final void p(afnh afnhVar) {
    }

    @Override // defpackage.affb
    public final void q() {
    }

    @Override // defpackage.affb
    public final void r() {
    }

    @Override // defpackage.affb
    public final void s() {
    }

    @Override // defpackage.afgg
    public final void t(aanr aanrVar, aetv aetvVar) {
    }

    public final void u() {
        this.g = true;
        aeof aeofVar = (aeof) this.t.get();
        if (aeofVar != null) {
            try {
                if (!this.c) {
                    return;
                }
                aeofVar.r();
                this.d = true;
                this.b.q();
                this.b.s(-1L);
            } catch (IllegalStateException e) {
                zep.n("Error calling mediaPlayer", e);
            }
        }
    }

    @Override // defpackage.affb
    public final void v() {
        aeof aeofVar = (aeof) this.t.get();
        if (aeofVar != null && this.c) {
            try {
                aeofVar.f();
                this.d = false;
                this.g = false;
                this.b.m();
                A(false);
            } catch (IllegalStateException e) {
                zep.n("Error calling mediaPlayer", e);
            }
        } else if (!this.g) {
        } else {
            this.g = false;
            this.b.m();
        }
    }

    @Override // defpackage.affb
    public final void w() {
    }

    @Override // defpackage.affb
    public final void x() {
        u();
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.affb
    public final void z() {
    }
}
