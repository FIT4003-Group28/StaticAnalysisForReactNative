package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cfhs  reason: default package */
/* loaded from: classes4.dex */
public class cfhs implements cfgx {
    public static final dcdc<cqjg> a = dcdc.i(cfde.a, cfde.b, cfav.a, cfeh.a);
    public final AtomicReference<cfhr> b;
    public final cpv c;
    public boolean d = false;
    private final cfgm e;

    /* JADX INFO: Access modifiers changed from: protected */
    public cfhs(cfgm cfgmVar, cfhr cfhrVar, cpv cpvVar) {
        this.e = cfgmVar;
        this.b = new AtomicReference<>(cfhrVar);
        this.c = cpvVar;
    }

    @Override // defpackage.cfgx
    public Boolean a() {
        cfhr cfhrVar = cfhr.UNKNOWN;
        int ordinal = this.b.get().ordinal();
        if (ordinal == 1 || ordinal == 7) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cfgx
    public Boolean b() {
        cfhr cfhrVar = cfhr.UNKNOWN;
        int ordinal = this.b.get().ordinal();
        if (ordinal == 2 || ordinal == 4 || ordinal == 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cfgx
    @dzsi
    public cqfc c() {
        return new cqfc(this) { // from class: cfhp
            private final cfhs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                cfhs cfhsVar = this.a;
                cfhr cfhrVar = cfhr.UNKNOWN;
                switch (cfhsVar.b.get().ordinal()) {
                    case 1:
                        view.setTranslationX(cfhsVar.t(cfhr.BEGIN));
                        return;
                    case 2:
                        cfhsVar.r(view, cfhr.BEGIN, cfhr.CENTER);
                        return;
                    case 3:
                        cfhsVar.r(view, cfhr.CENTER, cfhr.BEGIN);
                        return;
                    case 4:
                        view.setTranslationX(cfhsVar.t(cfhr.CENTER));
                        return;
                    case 5:
                        cfhsVar.r(view, cfhr.CENTER, cfhr.END);
                        return;
                    case 6:
                        cfhsVar.r(view, cfhr.END, cfhr.CENTER);
                        return;
                    case 7:
                        view.setTranslationX(cfhsVar.t(cfhr.END));
                        return;
                    default:
                        return;
                }
            }
        };
    }

    public final void r(final View view, cfhr cfhrVar, final cfhr cfhrVar2) {
        float t = t(cfhrVar);
        float t2 = t(cfhrVar2);
        if (this.d) {
            t = view.getTranslationX();
        }
        Runnable runnable = new Runnable(this, cfhrVar2, view) { // from class: cfhq
            private final cfhs a;
            private final cfhr b;
            private final View c;

            {
                this.a = this;
                this.b = cfhrVar2;
                this.c = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfhs cfhsVar = this.a;
                cfhr cfhrVar3 = this.b;
                View view2 = this.c;
                cfhsVar.d = false;
                cfhsVar.b.set(cfhrVar3);
                cqkx.p(cfhsVar);
                if (cfhrVar3.equals(cfhr.CENTER) || cfhrVar3.equals(cfhr.END)) {
                    dcdc<cqjg> dcdcVar = cfhs.a;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        View a2 = cqhu.a(view2, dcdcVar.get(i));
                        if (a2 != null) {
                            cfhsVar.c.a(a2);
                        }
                    }
                }
            }
        };
        view.animate().cancel();
        view.setTranslationX(t);
        view.animate().setDuration(500L).setInterpolator(irf.a).translationX(t2).withEndAction(runnable).start();
    }

    public boolean s() {
        return this.b.get().i;
    }

    public final float t(cfhr cfhrVar) {
        int e;
        int i;
        cfhr cfhrVar2 = cfhr.UNKNOWN;
        int ordinal = cfhrVar.ordinal();
        if (ordinal == 1) {
            cfgm cfgmVar = this.e;
            if (bvox.b(cfgmVar.a)) {
                e = -cqsz.c().e(cfgmVar.a);
            } else {
                e = cqsz.c().e(cfgmVar.a);
            }
            return e * 1.1f;
        } else if (ordinal == 4) {
            return 0.0f;
        } else {
            if (ordinal == 7) {
                cfgm cfgmVar2 = this.e;
                if (bvox.b(cfgmVar2.a)) {
                    i = cqsz.c().e(cfgmVar2.a);
                } else {
                    i = -cqsz.c().e(cfgmVar2.a);
                }
                return i * 1.1f;
            }
            throw new IllegalArgumentException("CardState must be BEGIN, CENTER or END");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        cfhr cfhrVar;
        this.d = false;
        AtomicReference<cfhr> atomicReference = this.b;
        cfhr cfhrVar2 = cfhr.UNKNOWN;
        switch (atomicReference.get().ordinal()) {
            case 1:
                cfhrVar = cfhr.BEGIN_TO_CENTER;
                break;
            case 2:
            case 6:
                cfhrVar = cfhr.CENTER;
                break;
            case 3:
                cfhrVar = cfhr.BEGIN;
                break;
            case 4:
                cfhrVar = cfhr.CENTER_TO_END;
                break;
            case 5:
            case 7:
                cfhrVar = cfhr.END;
                break;
            default:
                cfhrVar = cfhr.UNKNOWN;
                break;
        }
        atomicReference.set(cfhrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        cfhr cfhrVar;
        if (this.b.get().i) {
            this.d = true;
        }
        AtomicReference<cfhr> atomicReference = this.b;
        switch (atomicReference.get().ordinal()) {
            case 1:
                cfhrVar = cfhr.BEGIN;
                break;
            case 2:
            case 3:
            case 4:
                cfhrVar = cfhr.CENTER_TO_BEGIN;
                break;
            case 5:
            case 6:
            case 7:
                cfhrVar = cfhr.END_TO_CENTER;
                break;
            default:
                cfhrVar = cfhr.UNKNOWN;
                break;
        }
        atomicReference.set(cfhrVar);
    }

    public void w(Runnable runnable) {
        runnable.run();
    }

    public void x() {
    }
}
