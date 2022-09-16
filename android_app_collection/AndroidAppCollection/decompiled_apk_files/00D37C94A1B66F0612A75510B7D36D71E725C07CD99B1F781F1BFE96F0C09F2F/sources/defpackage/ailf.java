package defpackage;

import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ailf  reason: default package */
/* loaded from: classes.dex */
public class ailf {
    public static final byte[] a = aadi.b;
    public static final long b = TimeUnit.SECONDS.toMillis(15);
    public final yni c;
    public final aimy d;
    protected final Executor e;
    public final Set f;
    public final snc g;
    public final aadd h;
    public final aiix i;
    public final LruCache j;
    public final zey k;
    private final ailv l;
    private final Executor m;
    private final aenl n;
    private final ConditionVariable o;

    public ailf(yni yniVar, ailv ailvVar, aimy aimyVar, Executor executor, Executor executor2, List list, zey zeyVar) {
        this.o = new ConditionVariable();
        this.k = zeyVar;
        this.c = yniVar;
        this.l = ailvVar;
        this.d = aimyVar;
        this.e = executor;
        this.m = executor2;
        this.f = new HashSet(list);
        this.g = new zgi();
        this.j = null;
        this.h = null;
        this.n = null;
        this.i = null;
    }

    private final void j(String str) {
        LruCache lruCache = this.j;
        if (lruCache != null) {
            lruCache.remove(str);
        }
    }

    private final void k() {
        if (aiix.e(this.h).s) {
            this.o.block(Math.max(aiix.e(this.h).t, 1L));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlayerResponseModel a(String str, PlayerResponseModel playerResponseModel) {
        return playerResponseModel;
    }

    public final ankt b(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aanr aanrVar, boolean z, aijp aijpVar) {
        zgh.m(playbackStartDescriptor.l());
        return c(playbackStartDescriptor.l(), str, this.d.b(playbackStartDescriptor, i, this.f, aijpVar.b, str), aanrVar, z, true, aijpVar.b);
    }

    public final ankt c(String str, String str2, aina ainaVar, final aanr aanrVar, boolean z, boolean z2, acvg acvgVar) {
        Pair pair;
        aenl aenlVar;
        asae asaeVar;
        aiix aiixVar;
        aiix aiixVar2;
        atzt D;
        zgh.m(str);
        this.c.d(new ahgy());
        if (acvgVar != null) {
            acvgVar.c("ps_s");
            aopa createBuilder = asno.a.createBuilder();
            if (str2 != null) {
                createBuilder.copyOnWrite();
                asno asnoVar = (asno) createBuilder.instance;
                asnoVar.b |= 1024;
                asnoVar.j = str2;
            }
            createBuilder.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder.instance;
            str.getClass();
            asnoVar2.b |= 16777216;
            asnoVar2.o = str;
            acvgVar.a((asno) createBuilder.mo39build());
        }
        if (this.j == null) {
            pair = null;
        } else if (!ainaVar.j && (((aiixVar = this.i) == null || (D = aiix.D(aiixVar.d)) == null || !D.v || z2) && ((aiixVar2 = this.i) == null || !aiix.e(aiixVar2.a).M))) {
            pair = (Pair) this.j.remove(ainaVar.b());
        } else {
            pair = (Pair) this.j.get(ainaVar.b());
        }
        if (pair == null || this.g.d() > ((Long) pair.second).longValue() || aijr.b((PlayerResponseModel) pair.first, this.g)) {
            if (pair != null) {
                j(ainaVar.b());
            }
            aile aileVar = new aile(this, ainaVar, str, acvgVar);
            this.l.b(ainaVar, aileVar, str2, aanrVar, z, acvgVar);
            return aileVar;
        }
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) pair.first;
        this.c.d(new ahgx(true));
        if (acvgVar != null) {
            acvgVar.c("ps_r");
            aopa createBuilder2 = asno.a.createBuilder();
            createBuilder2.copyOnWrite();
            asno asnoVar3 = (asno) createBuilder2.instance;
            asnoVar3.c |= 4;
            asnoVar3.r = true;
            acvgVar.a((asno) createBuilder2.mo39build());
        }
        afze afzeVar = new afze();
        afzeVar.o(playerResponseModel);
        if (!aiix.g(this.h) && (aenlVar = this.n) != null && aanrVar != null && playerResponseModel != null) {
            aoyb o = playerResponseModel.o();
            final aenk aenkVar = (aenk) aenlVar;
            final aflm b2 = aenkVar.b(acvgVar);
            if (o == null) {
                Iterator it = playerResponseModel.a.m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        asac asacVar = (asac) it.next();
                        if (asacVar.b == 63112829) {
                            asaeVar = (asae) asacVar.c;
                        } else {
                            asaeVar = asae.a;
                        }
                        if ((asaeVar.b & 1) != 0) {
                            asaj asajVar = asaeVar.c;
                            if (asajVar == null) {
                                asajVar = asaj.a;
                            }
                            asap asapVar = asajVar.g;
                            if (asapVar == null) {
                                asapVar = asap.a;
                            }
                            if ((asapVar.b & 1) != 0) {
                                break;
                            }
                        }
                    } else {
                        VideoStreamingData videoStreamingData = playerResponseModel.c;
                        if (videoStreamingData != null && videoStreamingData.e() != null) {
                            if (aenkVar.k.ad()) {
                                aanrVar.d(videoStreamingData, playerResponseModel.c());
                            } else {
                                aanrVar.c(videoStreamingData);
                            }
                            aanrVar.e(playerResponseModel.c().F());
                            aeuo a2 = aenkVar.j.a(aanrVar.b);
                            aenv aenvVar = new aenv(aenkVar.h, aanrVar.b, aenkVar.f);
                            if (aanrVar.g != null) {
                                try {
                                    ((aenk) aenlVar).e(null, aanrVar, null, aenkVar.a(aanrVar.b, aenvVar, null, b2, null, aanrVar), a2, b2);
                                } catch (RuntimeException e) {
                                    aeny.j("LoadOnesieVideo for prefetched playbacks got an exception.", e);
                                }
                            }
                        }
                    }
                }
            } else {
                Iterator it2 = o.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    final avwu avwuVar = ((aoyc) it2.next()).c;
                    if (avwuVar == null) {
                        avwuVar = avwu.a;
                    }
                    if ((avwuVar.b & 1) != 0) {
                        if (z) {
                            aenkVar.f(aanrVar, avwuVar.e.I(), b2);
                        } else {
                            aenkVar.b.execute(new Runnable() { // from class: aeni
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aenk aenkVar2 = aenk.this;
                                    aanr aanrVar2 = aanrVar;
                                    avwu avwuVar2 = avwuVar;
                                    aenkVar2.f(aanrVar2, avwuVar2.e.I(), b2);
                                }
                            });
                        }
                    }
                }
            }
        }
        aiix aiixVar3 = this.i;
        if (aiixVar3 == null || !aiixVar3.i()) {
            return afzeVar;
        }
        if (playerResponseModel.d.d("PLAYER_REQUEST_WAS_AUTOPLAY") == ainaVar.G && playerResponseModel.d.d("PLAYER_REQUEST_WAS_AUTONAV") == ainaVar.H) {
            String encodeToString = Base64.encodeToString(ainaVar.g, 0);
            PlayerResponseModel.MutableContext mutableContext = playerResponseModel.d;
            if (encodeToString.equals(mutableContext.c.containsKey("PLAYER_REQUEST_CLICK_TRACKING") ? (String) mutableContext.c.get("PLAYER_REQUEST_CLICK_TRACKING") : "")) {
                return afzeVar;
            }
        }
        playerResponseModel.d.b("PLAYER_RESPONSE_SOURCE_KEY", 3L);
        return afzeVar;
    }

    public final void d(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        if (this.j == null || TextUtils.isEmpty(playbackStartDescriptor.l()) || playbackStartDescriptor.y() == null) {
            return;
        }
        j(this.d.a(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), i, this.f, null, null, false).b());
    }

    public final void e(final PlaybackStartDescriptor playbackStartDescriptor, final String str, Executor executor, final aijp aijpVar) {
        final String h;
        final aanr h2;
        if (!aiix.y(this.h)) {
            return;
        }
        aiix aiixVar = this.i;
        if (aiixVar != null && aiixVar.l(playbackStartDescriptor)) {
            return;
        }
        if (!aiix.e(this.h).n) {
            if (playbackStartDescriptor.t()) {
                return;
            }
            final String h3 = playbackStartDescriptor.h(this.k);
            executor.execute(new Runnable() { // from class: ailc
                @Override // java.lang.Runnable
                public final void run() {
                    ailf ailfVar = ailf.this;
                    PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                    String str2 = h3;
                    aijp aijpVar2 = aijpVar;
                    String str3 = str;
                    aanr h4 = aanr.h(ailfVar.h, playbackStartDescriptor2.f(), str2, playbackStartDescriptor2.c(), aijpVar2.h, playbackStartDescriptor2.z());
                    if (h4 == null || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    h4.f(str3);
                    h4.i();
                    ailfVar.c(str3, str2, ailfVar.d.b(playbackStartDescriptor2, -1, ailfVar.f, aijpVar2.b, str2), h4, true, false, aijpVar2.b);
                }
            });
            k();
        } else if (playbackStartDescriptor.t() || TextUtils.isEmpty(str) || (h2 = aanr.h(this.h, playbackStartDescriptor.f(), (h = playbackStartDescriptor.h(this.k)), playbackStartDescriptor.c(), aijpVar.h, playbackStartDescriptor.z())) == null || TextUtils.isEmpty(str)) {
        } else {
            executor.execute(new Runnable() { // from class: ailb
                @Override // java.lang.Runnable
                public final void run() {
                    ailf ailfVar = ailf.this;
                    aanr aanrVar = h2;
                    String str2 = str;
                    PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                    String str3 = h;
                    aijp aijpVar2 = aijpVar;
                    aanrVar.f(str2);
                    aanrVar.i();
                    ailfVar.b(playbackStartDescriptor2, str3, -1, aanrVar, true, aijpVar2);
                }
            });
            k();
        }
    }

    @Deprecated
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.j != null && !TextUtils.isEmpty(playbackStartDescriptor.l()) && playbackStartDescriptor.y() != null) {
            if (this.j.get(this.d.a(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), -1, this.f, null, null, false).b()) != null) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void g(String str, String str2, byte[] bArr, int i, final yiw yiwVar) {
        aadd aaddVar;
        final PlayerResponseModel playerResponseModel;
        try {
            aijl d = PlaybackStartDescriptor.d();
            aopc m = aikb.m(str, "", -1, 0.0f, str2, null);
            aoob x = aoob.x(bArr);
            m.copyOnWrite();
            apzg apzgVar = (apzg) m.instance;
            apzg apzgVar2 = apzg.a;
            apzgVar.b |= 1;
            apzgVar.c = x;
            d.a = (apzg) m.mo39build();
            ankt b2 = b(d.a(), null, i, null, false, aijp.a);
            long j = b;
            if (this.h != null) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(aiix.a(aaddVar)));
            }
            if (j > 0) {
                playerResponseModel = (PlayerResponseModel) b2.get(j, TimeUnit.MILLISECONDS);
            } else {
                playerResponseModel = (PlayerResponseModel) b2.get();
            }
            this.m.execute(new Runnable() { // from class: aikz
                @Override // java.lang.Runnable
                public final void run() {
                    yiw yiwVar2 = yiw.this;
                    PlayerResponseModel playerResponseModel2 = playerResponseModel;
                    byte[] bArr2 = ailf.a;
                    yiwVar2.b(null, playerResponseModel2);
                }
            });
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.m.execute(new Runnable() { // from class: aila
                @Override // java.lang.Runnable
                public final void run() {
                    yiw yiwVar2 = yiw.this;
                    Exception exc = e;
                    byte[] bArr2 = ailf.a;
                    yiwVar2.a(null, exc);
                }
            });
        }
    }

    public final void h(final String str, final byte[] bArr, final String str2, final int i, final yiw yiwVar) {
        yiwVar.getClass();
        this.e.execute(new Runnable() { // from class: aild
            @Override // java.lang.Runnable
            public final void run() {
                ailf.this.g(str, str2, bArr, i, yiwVar);
            }
        });
    }

    public final ankt i(PlaybackStartDescriptor playbackStartDescriptor, String str, boolean z, aijp aijpVar) {
        zgh.m(playbackStartDescriptor.l());
        aanr h = aanr.h(this.h, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aijpVar.h, playbackStartDescriptor.z());
        if (h != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            h.f(playbackStartDescriptor.l());
        }
        return b(playbackStartDescriptor, str, -1, h, z, aijpVar);
    }

    public ailf(yni yniVar, ailv ailvVar, aimy aimyVar, Executor executor, Executor executor2, Set set, aenl aenlVar, snc sncVar, aadd aaddVar, aiix aiixVar, zey zeyVar) {
        this.o = new ConditionVariable();
        yniVar.getClass();
        this.c = yniVar;
        ailvVar.getClass();
        this.l = ailvVar;
        aimyVar.getClass();
        this.d = aimyVar;
        executor.getClass();
        this.e = executor;
        executor2.getClass();
        this.m = executor2;
        set.getClass();
        this.f = set;
        this.n = aenlVar;
        this.g = sncVar;
        this.i = aiixVar;
        this.j = new LruCache(16);
        aaddVar.getClass();
        this.h = aaddVar;
        this.k = zeyVar;
    }
}
