package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gll  reason: default package */
/* loaded from: classes3.dex */
public final class gll implements aafl {
    public static final /* synthetic */ int b = 0;
    public final ajmy a;
    private final Context c;
    private final adoa d;
    private final hxa e;
    private final iak f;
    private final ifk g;
    private final snc h;
    private final axnm i;
    private final Optional j;
    private final gts k;
    private final aadd l;
    private final PipObserver m;
    private final aagi n;
    private final zey o;
    private final igh p;
    private final ifn q;
    private final aacz r;

    public gll(Context context, adoa adoaVar, hxa hxaVar, iak iakVar, ifk ifkVar, gts gtsVar, snc sncVar, axnm axnmVar, Optional optional, aacz aaczVar, aadd aaddVar, PipObserver pipObserver, ajmy ajmyVar, aagi aagiVar, zey zeyVar, igh ighVar, ifn ifnVar) {
        this.c = context;
        this.d = adoaVar;
        this.e = hxaVar;
        this.f = iakVar;
        this.g = ifkVar;
        this.k = gtsVar;
        this.h = sncVar;
        this.i = axnmVar;
        this.j = optional;
        this.r = aaczVar;
        this.l = aaddVar;
        this.m = pipObserver;
        this.a = ajmyVar;
        this.n = aagiVar;
        this.o = zeyVar;
        this.p = ighVar;
        this.q = ifnVar;
    }

    private final Optional c() {
        return Optional.ofNullable(this.l).map(glk.a);
    }

    private final void d(String str) {
        if (((Boolean) c().map(glk.c).orElse(false)).booleanValue()) {
            this.f.c(str);
        }
    }

    private final void e() {
        try {
            new AlertDialog.Builder(this.c).setTitle(R.string.reel_cast_not_supported_title).setMessage(R.string.reel_cast_not_supported_message).setNeutralButton(R.string.app_got_it, (DialogInterface.OnClickListener) null).create().show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public final void b(apzg apzgVar, Map map, long j) {
        apyy apyyVar;
        aagi aagiVar;
        apzg apzgVar2;
        apzg apzgVar3 = apzgVar;
        boolean z = false;
        if (apzgVar3.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && !((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar3.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).k && ((Boolean) c().map(eoo.t).orElse(false)).booleanValue()) {
            apzgVar3 = this.k.a(apzgVar3);
        }
        final apzg apzgVar4 = apzgVar3;
        if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b & 262144) != 0 && (aagiVar = this.n) != null) {
            aagh c = aagiVar.c();
            aumf aumfVar = (aumf) c.f(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s).g(aumf.class).m(fzc.i).A(new ayqf() { // from class: gli
                @Override // defpackage.ayqf
                public final boolean a(Object obj) {
                    return r1.isInstance((Throwable) obj);
                }
            }).W();
            if (aumfVar != null) {
                apzg apzgVar5 = null;
                if (aumfVar.f()) {
                    apzgVar5 = aumfVar.getUpdatedEndpointProto();
                } else if (aumfVar.b()) {
                    try {
                        apzgVar5 = (apzg) aopi.parseFrom(apzg.a, aumfVar.getUpdatedEndpoint(), aoos.b());
                    } catch (aopx e) {
                        zep.d("Error parsing bytes for updated ReelWatchEndpoint.", e);
                    }
                }
                if (apzgVar5 != null && apzgVar5.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    aopc aopcVar = (aopc) apzgVar4.mo52toBuilder();
                    aopcVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar5.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                    apzgVar2 = (apzg) aopcVar.mo39build();
                    aahb c2 = ((aagu) c).c();
                    c2.g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s);
                    c2.b().Q();
                    apzgVar4 = apzgVar2;
                }
            }
            apzgVar2 = apzgVar4;
            aahb c22 = ((aagu) c).c();
            c22.g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s);
            c22.b().Q();
            apzgVar4 = apzgVar2;
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar4;
        PlaybackStartDescriptor a = d.a();
        atub atubVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).l;
        if (atubVar == null) {
            atubVar = atub.a;
        }
        int i = atubVar.b;
        boolean booleanValue = ((Boolean) c().map(glk.e).orElse(false)).booleanValue();
        if ((i & 2) != 0 && booleanValue) {
            z = true;
        }
        if (this.p != null && !((Boolean) c().map(glk.d).orElse(false)).booleanValue()) {
            this.p.b();
        }
        this.f.j(0, 2, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar4.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint), null, j);
        Optional c3 = c();
        if (this.o != null && ((Boolean) c3.map(eoo.s).orElse(false)).booleanValue()) {
            String h = a.h(this.o);
            Optional a2 = this.f.a();
            if (a2.isPresent()) {
                ifk ifkVar = this.g;
                acvg acvgVar = (acvg) a2.get();
                synchronized (ifkVar.b) {
                    ifkVar.b.put(h, acvgVar);
                }
            }
            if (z) {
                d("r_ofs");
                ifn ifnVar = this.q;
                if (ifnVar != null) {
                    ifnVar.a.e(a, a.l(), ifnVar.b, ifnVar.a(h, ifnVar.c.get()));
                }
                if (this.p != null && ((Boolean) c3.map(eoo.r).orElse(false)).booleanValue()) {
                    this.p.f(apzgVar4, h, false, true, true, afzj.a, afzj.a);
                }
                d("r_ofe");
            } else {
                igh ighVar = this.p;
                if (ighVar != null) {
                    ighVar.d(apzgVar4, h, false, false, afzj.a);
                }
            }
        }
        aacz aaczVar = this.r;
        if (aaczVar != null) {
            apyyVar = aaczVar.b();
        } else {
            apyyVar = apyy.a;
        }
        aukw aukwVar = apyyVar.E;
        if (aukwVar == null) {
            aukwVar = aukw.a;
        }
        if (!aukwVar.d || !hqp.l(apzgVar4) || !((Optional) this.i.get()).isPresent() || !this.j.isPresent()) {
            Intent intent = new Intent(this.c, this.e.a);
            intent.setFlags(262144);
            intent.putExtra("com.google.android.apps.youtube.PlaybackStartDescriptor", a);
            intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", j);
            intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_ONESIE_INITIAL_KEY", z);
            Bundle bundle = (Bundle) Optional.ofNullable((Bundle) zew.K(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class)).orElseGet(new Supplier() { // from class: glg
                @Override // j$.util.function.Supplier
                /* renamed from: get */
                public final Object mo515get() {
                    gll gllVar = gll.this;
                    final apzg apzgVar6 = apzgVar4;
                    return (Bundle) Optional.ofNullable(gllVar.a).map(new Function() { // from class: glj
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return function.getClass();
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            return gtd.b(apzg.this, (ajmy) obj);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return function.getClass();
                        }
                    }).map(glk.b).orElse(new Bundle());
                }
            });
            this.f.c("r_as");
            Context context = this.c;
            PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) intent.getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
            playbackStartDescriptor.getClass();
            boolean p = hqp.p(hqp.f(playbackStartDescriptor));
            boolean k = hqp.k(playbackStartDescriptor);
            int i2 = true != p ? R.anim.reel_activity_slide_up : R.anim.reel_activity_slide_in_right;
            if (bundle != null || k) {
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                context.startActivity(intent, akd.d(context, i2, R.anim.reel_activity_fade_out).a());
                return;
            }
            context.startActivity(intent);
            return;
        }
        ((gbh) ((Optional) this.i.get()).get()).d(((ict) this.j.get()).a());
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        aqxo.p(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        final long c = this.h.c();
        boolean booleanValue = ((Boolean) c().map(eoo.u).orElse(false)).booleanValue();
        if (this.d.e() != null || this.d.m()) {
            e();
            return;
        }
        PipObserver pipObserver = this.m;
        if (pipObserver == null || !booleanValue) {
            b(apzgVar, map, c);
        } else {
            pipObserver.a.R().I(efx.n).ag(1L).as(new ayqb() { // from class: glh
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    gdm gdmVar = (gdm) obj;
                    gll.this.b(apzgVar, map, c);
                }
            });
        }
    }
}
