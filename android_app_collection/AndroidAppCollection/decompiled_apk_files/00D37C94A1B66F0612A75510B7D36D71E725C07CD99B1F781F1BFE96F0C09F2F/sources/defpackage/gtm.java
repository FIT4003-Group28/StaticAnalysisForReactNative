package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: gtm  reason: default package */
/* loaded from: classes3.dex */
public final class gtm {
    public static final /* synthetic */ int f = 0;
    private static final String g = String.valueOf(gtm.class.getName()).concat("$ARG_BACKSTACK_POSITION");
    private static final String h = String.valueOf(gtm.class.getName()).concat("$ARG_TRIGGERED_ACTION");
    private static final String i = gtm.class.getCanonicalName();
    public final aadd a;
    public ReelWatchBackstack$BackstackEntryStack b;
    public final Deque c;
    public final azpx d;
    public final aynr e;
    private final dt j;
    private final amup k;
    private final azqb l;
    private final snc m;
    private final aacz n;

    public gtm(final aacz aaczVar, aadd aaddVar, dt dtVar, ypf ypfVar, Map map, azqb azqbVar, snc sncVar, final ayor ayorVar) {
        final aynr A;
        ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack;
        azpx aO = azpm.aI(Optional.empty()).aO();
        this.d = aO;
        this.n = aaczVar;
        this.a = aaddVar;
        this.j = dtVar;
        this.k = amup.j(map);
        this.b = new ReelWatchBackstack$BackstackEntryStack();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        this.l = azqbVar;
        this.m = sncVar;
        blj savedStateRegistry = dtVar.getSavedStateRegistry();
        String str = i;
        savedStateRegistry.b(str, new bli() { // from class: gtf
            @Override // defpackage.bli
            public final Bundle a() {
                gtm gtmVar = gtm.this;
                Bundle bundle = new Bundle();
                int a = gtmVar.b.a() - gtmVar.c.size();
                for (dp dpVar : gtmVar.c) {
                    gtmVar.f(dpVar, a);
                    a++;
                }
                auld auldVar = gtmVar.a.a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                aull aullVar = auldVar.d;
                if (aullVar == null) {
                    aullVar = aull.a;
                }
                if (!aullVar.A || gtmVar.b.a() <= 10) {
                    bundle.putParcelable("BUNDLE_STACK_KEY", gtmVar.b);
                } else {
                    ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack2 = new ReelWatchBackstack$BackstackEntryStack();
                    int a2 = gtmVar.b.a() - 10;
                    while (reelWatchBackstack$BackstackEntryStack2.a() < 10) {
                        reelWatchBackstack$BackstackEntryStack2.e(gtmVar.b.b(a2));
                        a2++;
                    }
                    bundle.putParcelable("BUNDLE_STACK_KEY", reelWatchBackstack$BackstackEntryStack2);
                }
                return bundle;
            }
        });
        aukw aukwVar = aaczVar.b().E;
        if ((aukwVar == null ? aukw.a : aukwVar).c) {
            A = aO.af(new ayqe() { // from class: gth
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    final gtm gtmVar = gtm.this;
                    return ((aynr) ((Optional) obj).map(glk.h).orElse(aynr.A())).M(ayoi.O(new Callable() { // from class: gtj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(gtm.this.h());
                        }
                    }));
                }
            }).ah(efx.o).h().e();
        } else {
            A = aynr.A();
        }
        this.e = A;
        A.getClass();
        ypfVar.f(new Callable() { // from class: gtl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aynr.this.Q();
            }
        });
        ypfVar.f(new Callable() { // from class: gtk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final gtm gtmVar = gtm.this;
                final aacz aaczVar2 = aaczVar;
                final ayor ayorVar2 = ayorVar;
                return gtmVar.d.af(new ayqe() { // from class: gti
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        aacz aaczVar3 = aacz.this;
                        ayor ayorVar3 = ayorVar2;
                        int i2 = gtm.f;
                        ayoi ayoiVar = (ayoi) ((Optional) obj).map(glk.f).orElse(ayoi.G());
                        aukw aukwVar2 = aaczVar3.b().E;
                        if (aukwVar2 == null) {
                            aukwVar2 = aukw.a;
                        }
                        return ayoiVar.ab(true != aukwVar2.c ? 1L : 0L).X(ayorVar3);
                    }
                }).as(new ayqb() { // from class: gtg
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        gtm gtmVar2 = gtm.this;
                        ReelWatchBackstack$BackstackEntry d = gtmVar2.b.d();
                        gtmVar2.b.e(ReelWatchBackstack$BackstackEntry.a((apzg) obj, d.b, d.c, d.d));
                    }
                });
            }
        });
        Bundle a = dtVar.getSavedStateRegistry().a(str);
        if (a == null || (reelWatchBackstack$BackstackEntryStack = (ReelWatchBackstack$BackstackEntryStack) a.getParcelable("BUNDLE_STACK_KEY")) == null) {
            return;
        }
        this.b = reelWatchBackstack$BackstackEntryStack;
        arrayDeque.clear();
        if (this.b.f()) {
            return;
        }
        k(this.b.d());
    }

    public static Optional c(Bundle bundle) {
        if (bundle == null) {
            return Optional.empty();
        }
        return gtn.a(bundle.getInt(h, -1));
    }

    public static OptionalInt d(Bundle bundle) {
        if (bundle == null) {
            return OptionalInt.empty();
        }
        String str = g;
        if (!bundle.containsKey(str)) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bundle.getInt(str));
    }

    private final dp i(ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry, gtn gtnVar, int i2) {
        apzg apzgVar = reelWatchBackstack$BackstackEntry.a;
        Bundle bundle = reelWatchBackstack$BackstackEntry.b;
        if (!bundle.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY")) {
            bundle.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.m.c());
        }
        bundle.putInt(g, i2);
        bundle.putInt(h, gtnVar.ordinal());
        Object a = aafp.a(apzgVar);
        a.getClass();
        gtp gtpVar = (gtp) this.k.get(a.getClass());
        gtpVar.getClass();
        dp a2 = gtpVar.a(apzgVar, bundle);
        if (a2 instanceof gto) {
            gto gtoVar = (gto) a2;
        }
        a2.ag(reelWatchBackstack$BackstackEntry.c);
        if (a2 instanceof gtq) {
            ((gtq) a2).m(reelWatchBackstack$BackstackEntry.d);
        }
        return a2;
    }

    private final void j(dp dpVar) {
        Optional map = Optional.ofNullable(dpVar).filter(new lgw(gto.class, 1)).map(new lgv(gto.class, 1));
        map.ifPresent(fyb.f);
        this.d.c(map);
    }

    private final void k(ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        dp dpVar;
        reelWatchBackstack$BackstackEntry.a.getClass();
        reelWatchBackstack$BackstackEntry.b.getClass();
        if (!g()) {
            apzg apzgVar = reelWatchBackstack$BackstackEntry.a;
            apzg b = b();
            Object a = aafp.a(apzgVar);
            a.getClass();
            Object a2 = aafp.a(b);
            a2.getClass();
            if (a.equals(a2)) {
                return;
            }
        }
        this.b.e(reelWatchBackstack$BackstackEntry);
        if (this.c.peekLast() instanceof gto) {
            ((gto) this.c.peekLast()).c();
        }
        if (this.c.size() == 1) {
            f((dp) this.c.peekFirst(), this.b.a() - 2);
            dpVar = (dp) this.c.removeFirst();
        } else {
            dpVar = null;
        }
        dp i2 = i(reelWatchBackstack$BackstackEntry, gtn.PUSH, this.b.a() - 1);
        this.c.addLast(i2);
        ex l = this.j.getSupportFragmentManager().l();
        l.p(R.id.reel_watch_backstack_container, i2);
        l.d();
        if (dpVar != null) {
            ex l2 = this.j.getSupportFragmentManager().l();
            l2.m(dpVar);
            l2.a();
        }
        j(i2);
    }

    public final dp a() {
        return (dp) this.c.peekLast();
    }

    public final apzg b() {
        ReelWatchBackstack$BackstackEntry c = this.b.c();
        if (c == null) {
            return null;
        }
        return c.a;
    }

    public final void e(apzg apzgVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        k(ReelWatchBackstack$BackstackEntry.a(apzgVar, bundle, null, null));
    }

    public final void f(dp dpVar, int i2) {
        ReelWatchBackstack$BackstackEntry b = this.b.b(i2);
        Fragment$SavedState c = this.j.getSupportFragmentManager().c(dpVar);
        Object l = dpVar instanceof gtq ? ((gtq) dpVar).l() : null;
        Bundle bundle = b.b;
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY");
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_ONESIE_INITIAL_KEY");
        ReelWatchBackstack$BackstackEntry a = ReelWatchBackstack$BackstackEntry.a(b.a, bundle, c, l);
        ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack = this.b;
        reelWatchBackstack$BackstackEntryStack.a.remove(i2);
        reelWatchBackstack$BackstackEntryStack.a.add(i2, a);
    }

    public final boolean g() {
        return this.b.f();
    }

    public final boolean h() {
        if (this.b.f()) {
            aukw aukwVar = this.n.b().E;
            if (aukwVar == null) {
                aukwVar = aukw.a;
            }
            if (!aukwVar.c) {
                throw new NoSuchElementException();
            }
            return false;
        } else if ((this.c.peekLast() instanceof gto) && !((gto) this.c.peekLast()).k()) {
            return false;
        } else {
            this.b.d();
            dp dpVar = (dp) this.c.removeLast();
            if (!g()) {
                ReelWatchBackstack$BackstackEntry d = this.b.d();
                aopc aopcVar = (aopc) d.a.mo52toBuilder();
                aopcVar.d(atno.b);
                apzg f2 = ((acth) this.l.get()).oi().f((apzg) aopcVar.mo39build());
                aopa mo52toBuilder = ((atnp) f2.qm(atno.b)).mo52toBuilder();
                int i2 = actj.MOBILE_BACK_BUTTON.II;
                mo52toBuilder.copyOnWrite();
                atnp atnpVar = (atnp) mo52toBuilder.instance;
                atnpVar.b |= 2;
                atnpVar.d = i2;
                aopc aopcVar2 = (aopc) f2.mo52toBuilder();
                aopcVar2.e(atno.b, (atnp) mo52toBuilder.mo39build());
                apzg apzgVar = (apzg) aopcVar2.mo39build();
                Bundle bundle = d.b;
                bundle.putByteArray(gsw.a, apzgVar.toByteArray());
                this.b.e(ReelWatchBackstack$BackstackEntry.a(apzgVar, bundle, d.c, d.d));
                if (this.c.isEmpty()) {
                    dp i3 = i(this.b.c(), gtn.POP, this.b.a() - 1);
                    this.c.addLast(i3);
                    ex l = this.j.getSupportFragmentManager().l();
                    l.p(R.id.reel_watch_backstack_container, i3);
                    l.d();
                }
                ex l2 = this.j.getSupportFragmentManager().l();
                l2.m(dpVar);
                l2.a();
                j((dp) this.c.peekLast());
                return true;
            }
            this.j.finish();
            return false;
        }
    }
}
