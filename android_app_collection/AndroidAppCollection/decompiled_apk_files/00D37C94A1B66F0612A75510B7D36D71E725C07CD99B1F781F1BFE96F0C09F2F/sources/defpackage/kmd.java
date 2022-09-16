package defpackage;

import com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
/* compiled from: PG */
/* renamed from: kmd  reason: default package */
/* loaded from: classes3.dex */
public final class kmd {
    public final airw a;
    public final DefaultScrubberEventLogger$LifecycleObserver b = new f() { // from class: com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver
        private final aypf b = new aypf();

        @Override // defpackage.f, defpackage.g
        public final /* synthetic */ void kG(apy apyVar) {
        }

        @Override // defpackage.f, defpackage.g
        public final /* synthetic */ void lc(apy apyVar) {
        }

        @Override // defpackage.f, defpackage.g
        public final /* synthetic */ void ld(apy apyVar) {
        }

        @Override // defpackage.g
        public final void nA(apy apyVar) {
            this.b.c();
        }

        @Override // defpackage.g
        public final /* synthetic */ void nv(apy apyVar) {
        }

        @Override // defpackage.f, defpackage.g
        public final void nz(apy apyVar) {
            this.b.c();
            aypf aypfVar = this.b;
            aynx G = kmd.this.a.G().c.I().G(aypa.a());
            final kmd kmdVar = kmd.this;
            aypfVar.d(G.aa(new ayqb() { // from class: kmb
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    kmd.this.c = ((ahhj) obj).d();
                }
            }, kjt.d));
        }
    };
    public String c;
    private final acrr d;
    private final ahwz e;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver] */
    public kmd(acrr acrrVar, ahwz ahwzVar, airw airwVar, aibz aibzVar, kma kmaVar) {
        this.d = acrrVar;
        this.e = ahwzVar;
        this.a = airwVar;
        aibzVar.kP(new kmc(this));
        kmaVar.a = this;
    }

    public final void a(int i) {
        TimelineMarker[] m = this.e.m(aicb.CHAPTER);
        if (m == null || m.length == 0) {
            return;
        }
        auor a = auos.a();
        a.copyOnWrite();
        boolean z = true;
        ((auos) a.instance).g(true);
        if (i != 1) {
            z = false;
        }
        a.copyOnWrite();
        ((auos) a.instance).h(z);
        String str = this.c;
        if (str != null) {
            a.copyOnWrite();
            ((auos) a.instance).f(str);
        }
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dD((auos) a.mo39build());
        this.d.c((arrh) a2.mo39build());
    }
}
