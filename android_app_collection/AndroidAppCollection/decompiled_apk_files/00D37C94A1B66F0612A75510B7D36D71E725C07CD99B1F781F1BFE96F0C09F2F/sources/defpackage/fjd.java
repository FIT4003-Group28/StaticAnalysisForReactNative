package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: fjd  reason: default package */
/* loaded from: classes3.dex */
public final class fjd implements tct {
    private final mcu a;
    private final InlinePlaybackLifecycleController b;
    private final fyx c;

    public fjd(mcu mcuVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fyx fyxVar) {
        this.a = mcuVar;
        this.b = inlinePlaybackLifecycleController;
        this.c = fyxVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awsl.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        awsl awslVar = (awsl) obj;
        if (this.c.f()) {
            String str = tcsVar.g;
            if (str == null || !"InlinePlaybackCommandEventData".equals(str)) {
                return aynr.f();
            }
            Object obj2 = tcsVar.d;
            if (obj2 != null) {
                Pair pair = (Pair) obj2;
                boolean booleanValue = ((Boolean) pair.first).booleanValue();
                fin finVar = (fin) pair.second;
                int h = awwc.h(awslVar.d);
                if (h == 0 || h != 2) {
                    ggt a = this.a.a(finVar);
                    if (a != null) {
                        return this.b.i(a).E(aypa.a());
                    }
                    return aynr.f();
                }
                awmt awmtVar = awslVar.e;
                if (awmtVar == null) {
                    awmtVar = awmt.a;
                }
                apzg apzgVar = (apzg) awmtVar.qm(arng.a);
                awmt awmtVar2 = awslVar.j;
                if (awmtVar2 == null) {
                    awmtVar2 = awmt.a;
                }
                apzg apzgVar2 = (apzg) awmtVar2.qm(arng.a);
                if (apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
                    boolean z = awslVar.g;
                    boolean z2 = awslVar.h;
                    aopa createBuilder = avhc.a.createBuilder();
                    arag aragVar = null;
                    if ((awslVar.c & 4096) != 0) {
                        avhe avheVar = awslVar.p;
                        if (avheVar == null) {
                            avheVar = avhe.a;
                        }
                        createBuilder.copyOnWrite();
                        avhc avhcVar = (avhc) createBuilder.instance;
                        avheVar.getClass();
                        avhcVar.k = avheVar;
                        avhcVar.b |= 16384;
                    } else {
                        if (z2) {
                            apme apmeVar = apme.a;
                            createBuilder.copyOnWrite();
                            avhc avhcVar2 = (avhc) createBuilder.instance;
                            apmeVar.getClass();
                            avhcVar2.j = apmeVar;
                            avhcVar2.b |= 4096;
                        } else if (z) {
                            aplz aplzVar = aplz.a;
                            createBuilder.copyOnWrite();
                            avhc avhcVar3 = (avhc) createBuilder.instance;
                            aplzVar.getClass();
                            avhcVar3.i = aplzVar;
                            avhcVar3.b |= 2048;
                        }
                        if (!z && !z2) {
                            aopc aopcVar = (aopc) arag.a.createBuilder();
                            awma awmaVar = awslVar.i;
                            if (awmaVar == null) {
                                awmaVar = awma.a;
                            }
                            String str2 = awmaVar.c;
                            aopcVar.copyOnWrite();
                            arag aragVar2 = (arag) aopcVar.instance;
                            str2.getClass();
                            aragVar2.b |= 1;
                            aragVar2.d = str2;
                            aragVar = (arag) aopcVar.mo39build();
                        }
                    }
                    ggt a2 = this.a.a(finVar);
                    if (a2 == null) {
                        mcu mcuVar = this.a;
                        awny awnyVar = awslVar.f;
                        if (awnyVar == null) {
                            awnyVar = awny.a;
                        }
                        int C = awwc.C(awslVar.o);
                        if (C == 0) {
                            C = 1;
                        }
                        boolean z3 = C == 4;
                        avhc avhcVar4 = (avhc) createBuilder.mo39build();
                        ggx a3 = ggy.a();
                        arjm b = arjm.b(awslVar.l);
                        if (b == null) {
                            b = arjm.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
                        }
                        a3.b(b);
                        arjz b2 = arjz.b(awslVar.k);
                        if (b2 == null) {
                            b2 = arjz.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
                        }
                        a3.e(b2);
                        arjo b3 = arjo.b(awslVar.m);
                        if (b3 == null) {
                            b3 = arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
                        }
                        a3.c(b3);
                        arjy b4 = arjy.b(awslVar.n);
                        if (b4 == null) {
                            b4 = arjy.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
                        }
                        a3.d(b4);
                        ggy a4 = a3.a();
                        apzgVar.getClass();
                        aqxo.y(apzgVar.qn(WatchEndpointOuterClass.watchEndpoint));
                        ghl n = ghm.n();
                        n.i = 4;
                        n.d = apzgVar2;
                        n.c = apzgVar;
                        n.b = ((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).c;
                        n.e = aragVar;
                        n.f = new avhc[]{avhcVar4};
                        n.a = aolu.u(awnyVar);
                        n.g = z3;
                        n.h = a4;
                        ghm a5 = n.a();
                        mcuVar.b.put(finVar, a5);
                        a2 = a5;
                    }
                    String f = a2.f();
                    fzq fzqVar = (fzq) this.a.c.get(finVar);
                    if (fzqVar == null) {
                        mcu mcuVar2 = this.a;
                        awny awnyVar2 = awslVar.f;
                        if (awnyVar2 == null) {
                            awnyVar2 = awny.a;
                        }
                        awny awnyVar3 = awnyVar2;
                        mcv mcvVar = mcuVar2.a;
                        WeakReference weakReference = new WeakReference(finVar);
                        mbw mbwVar = (mbw) mcvVar.a.get();
                        mbwVar.getClass();
                        ajmy ajmyVar = (ajmy) mcvVar.b.get();
                        ajmyVar.getClass();
                        f.getClass();
                        awnyVar3.getClass();
                        mct mctVar = new mct(mbwVar, ajmyVar, f, awnyVar3, weakReference);
                        mcuVar2.c.put(finVar, mctVar);
                        fzqVar = mctVar;
                    }
                    return this.b.j(a2, fzqVar, true != booleanValue ? 0 : 2).E(aypa.a());
                }
                return aynr.s(new NullPointerException());
            }
            return aynr.s(new Throwable("InlineMutedCommand dispatched without eventData."));
        }
        return aynr.f();
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
