package defpackage;

import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ige  reason: default package */
/* loaded from: classes3.dex */
public final class ige implements afzf {
    static final long a = TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS);
    public static final /* synthetic */ int k = 0;
    public final ihn b;
    public final LruCache d;
    public final ayos e;
    public final ayos f;
    public final ayor h;
    public boolean i;
    public boolean j;
    private final String m;
    private final long n;
    private final ihp o;
    private final snc p;
    private final aanz q;
    private boolean r;
    private final ArrayList l = new ArrayList();
    public final List c = new ArrayList();
    public final azpo g = azpo.W();

    public ige(ayos ayosVar, ayos ayosVar2, ihn ihnVar, String str, long j, LruCache lruCache, ihp ihpVar, Executor executor, ayor ayorVar, snc sncVar, aanz aanzVar, boolean z) {
        this.b = ihnVar;
        this.m = str;
        this.n = j;
        this.d = lruCache;
        this.o = ihpVar;
        this.p = sncVar;
        this.q = aanzVar;
        this.h = ayorVar;
        ayor b = azpj.b(executor);
        this.e = ayosVar.K(b);
        this.f = ayosVar2.K(b);
        this.j = z;
    }

    private final igg g(String str, artv artvVar) {
        if (!this.i) {
            arpa arpaVar = artvVar.c;
            if (arpaVar == null) {
                arpaVar = arpa.a;
            }
            VideoStreamingData h = h(artvVar);
            if (h == null) {
                return null;
            }
            int i = arpaVar.e;
            if (i <= 0) {
                i = 300;
            }
            long min = Math.min(this.p.d() + TimeUnit.SECONDS.toMillis(i), h.e - a);
            synchronized (this.d) {
                if (this.i) {
                    return null;
                }
                igg iggVar = new igg();
                iggVar.b = artvVar;
                iggVar.d = min;
                iggVar.e = h;
                this.d.put(str, iggVar);
                return iggVar;
            }
        }
        return null;
    }

    private final VideoStreamingData h(artv artvVar) {
        if (artvVar == null || (artvVar.b & 4) == 0) {
            return null;
        }
        aanz aanzVar = this.q;
        asaj asajVar = artvVar.e;
        if (asajVar == null) {
            asajVar = asaj.a;
        }
        return PlayerResponseModel.e(aanzVar, asajVar, this.n, this.m);
    }

    private final void i() {
        synchronized (this.d) {
            if (!this.i) {
                this.d.remove(this.b.b());
            }
        }
    }

    private final boolean j() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        ihn ihnVar = this.b;
        ihnVar.j = false;
        ihnVar.b = false;
        this.o.b(ihnVar, this);
        return true;
    }

    public final void d(afzf afzfVar, boolean z) {
        this.l.add(afzfVar);
        if (z || !this.b.j) {
            return;
        }
        this.r = true;
    }

    public final void e(afzf afzfVar, boolean z) {
        this.c.add(afzfVar);
        if (z || !this.b.j) {
            return;
        }
        this.r = true;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (j()) {
            return;
        }
        i();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afzf) arrayList.get(i)).kV(cffVar);
        }
        for (afzf afzfVar : this.c) {
            afzfVar.kV(cffVar);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    /* renamed from: f */
    public final void lG(artv artvVar) {
        int bK;
        VideoStreamingData h;
        int bK2 = awwc.bK(artvVar.h);
        VideoStreamingData videoStreamingData = null;
        if (bK2 == 0 || bK2 != 5) {
            int bK3 = awwc.bK(artvVar.h);
            if ((bK3 == 0 || bK3 != 3) && ((bK = awwc.bK(artvVar.h)) == 0 || bK != 4)) {
                igg g = g(this.b.b(), artvVar);
                if (g == null || (h = g.e) == null) {
                    h = h(artvVar);
                }
                if ((artvVar.b & 4096) != 0) {
                    apzg apzgVar = artvVar.k;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    ihn a2 = igh.a(apzgVar, this.o);
                    aopa mo52toBuilder = artvVar.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    artv artvVar2 = (artv) mo52toBuilder.instance;
                    artvVar2.k = null;
                    artvVar2.b &= -4097;
                    mo52toBuilder.copyOnWrite();
                    artv artvVar3 = (artv) mo52toBuilder.instance;
                    artvVar3.b &= -8193;
                    artvVar3.l = artv.a.l;
                    g(a2.b(), (artv) mo52toBuilder.mo39build());
                }
                videoStreamingData = h;
            } else if (j()) {
                return;
            } else {
                i();
            }
        } else if (j()) {
            return;
        } else {
            igh.c(this.d);
            videoStreamingData = h(artvVar);
        }
        if (videoStreamingData == null || (artvVar.b & 4) == 0) {
            if (j()) {
                return;
            }
            i();
            aopa mo52toBuilder2 = artvVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            artv artvVar4 = (artv) mo52toBuilder2.instance;
            artvVar4.h = 2;
            artvVar4.b |= 32;
            artvVar = (artv) mo52toBuilder2.mo39build();
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afzf) arrayList.get(i)).lG(new igf(artvVar, videoStreamingData, false));
        }
        if ((artvVar.b & 4) == 0 || videoStreamingData == null) {
            cff cffVar = new cff("Reel with no PlayerResponse.");
            for (afzf afzfVar : this.c) {
                afzfVar.kV(cffVar);
            }
            return;
        }
        asaj asajVar = artvVar.e;
        if (asajVar == null) {
            asajVar = asaj.a;
        }
        PlayerResponseModel playerResponseModel = new PlayerResponseModel(asajVar, this.n, videoStreamingData);
        for (afzf afzfVar2 : this.c) {
            afzfVar2.lG(playerResponseModel);
        }
    }
}
