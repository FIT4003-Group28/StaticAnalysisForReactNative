package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ice  reason: default package */
/* loaded from: classes3.dex */
final class ice implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ico a;

    public ice(ico icoVar) {
        this.a = icoVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int bG;
        if (this.a.bf()) {
            this.a.am.c("r_fge");
        }
        ico icoVar = this.a;
        if (icoVar.ar()) {
            if (!icoVar.bc()) {
                icoVar.aA.f(new exd());
                icoVar.aI.q(icoVar.bn);
                icoVar.aI.r(icoVar.aH());
            }
            airr airrVar = icoVar.av;
            ylr.c();
            airm airmVar = airrVar.k;
            if (airmVar != null) {
                airmVar.b = false;
            }
            icoVar.av.x(icoVar.bh.c, new aijc(aijd.a, icoVar.c, aijd.a, aijd.a));
            icoVar.av.E(true);
            icoVar.av.J(1.0f);
            if (icoVar.bk != null) {
                apzg apzgVar = (apzg) Optional.ofNullable(icoVar.m).filter(gka.d).map(glk.p).orElse(icoVar.bk.b);
                icoVar.bb.a = acuu.b(apzgVar);
                PlaybackStartDescriptor playbackStartDescriptor = icoVar.bk;
                atnp w = hqp.w(apzgVar);
                icoVar.bk = hqp.u(playbackStartDescriptor, w == null ? -1 : w.d);
                if (!TextUtils.isEmpty(icoVar.bj)) {
                    auld auldVar = icoVar.aX.a().u;
                    if (auldVar == null) {
                        auldVar = auld.a;
                    }
                    if (auldVar.l) {
                        PlaybackStartDescriptor playbackStartDescriptor2 = icoVar.bk;
                        String str = icoVar.bj;
                        apzg apzgVar2 = playbackStartDescriptor2.b;
                        if (apzgVar2 != null) {
                            aopa y = hqp.y(apzgVar2);
                            y.copyOnWrite();
                            atnp atnpVar = (atnp) y.instance;
                            atnp atnpVar2 = atnp.a;
                            str.getClass();
                            atnpVar.b |= 32;
                            atnpVar.f = str;
                            aijl e = playbackStartDescriptor2.e();
                            aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
                            aopcVar.e(atno.b, (atnp) y.mo39build());
                            e.a = (apzg) aopcVar.mo39build();
                            e.f = playbackStartDescriptor2.s();
                            e.e = playbackStartDescriptor2.r();
                            PlaybackStartDescriptor a = e.a();
                            a.o(playbackStartDescriptor2);
                            playbackStartDescriptor2 = a;
                        }
                        icoVar.bk = playbackStartDescriptor2;
                    }
                }
                PlaybackStartDescriptor playbackStartDescriptor3 = icoVar.bk;
                icoVar.bs = playbackStartDescriptor3.b;
                icoVar.am.e(playbackStartDescriptor3.l());
                z = icoVar.aI().k;
                if (!z) {
                    icoVar.aN();
                }
                if (icoVar.af.r()) {
                    Bundle bundle = icoVar.bi;
                    if (bundle != null) {
                        ibd ibdVar = icoVar.af.b;
                        ibdVar.l = bundle.getBoolean("ReelSequenceController.IS_INITIALIZED_KEY");
                        ibdVar.h = (ReelSequenceController$PendingContinuation) bundle.getParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY");
                        ibdVar.i = (ReelSequenceController$PendingContinuation) bundle.getParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY");
                        ibdVar.k = bundle.getBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY");
                    } else {
                        ibd ibdVar2 = icoVar.af.b;
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint f = hqp.f(icoVar.bk);
                        if (!ibdVar2.l && (bG = awwc.bG(f.m)) != 0 && bG == 3 && (f.b & 4096) != 0) {
                            ibdVar2.l = true;
                            ihq a2 = ibdVar2.a.a();
                            a2.b = f.n;
                            ibdVar2.a(ibdVar2.i, a2, 2);
                        }
                    }
                }
            } else {
                z = false;
            }
            icoVar.af.l(false);
            if (!z) {
                icoVar.aX();
                icoVar.bk = null;
            }
        }
        this.a.bh.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
