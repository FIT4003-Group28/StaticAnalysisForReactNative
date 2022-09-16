package defpackage;

import android.view.KeyEvent;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hmh  reason: default package */
/* loaded from: classes3.dex */
public final class hmh implements hmm {
    public final /* synthetic */ hml a;

    public hmh(hml hmlVar) {
        this.a = hmlVar;
    }

    @Override // defpackage.hmm
    public final boolean a(int i, KeyEvent keyEvent) {
        dp e = this.a.mL().e(R.id.reel_container);
        if (!e.at() || !(e instanceof hmc)) {
            return false;
        }
        hmc hmcVar = (hmc) e;
        if (hmcVar.aS()) {
            return false;
        }
        hor horVar = hmcVar.ao;
        if (horVar != null) {
            return horVar.f(i, keyEvent);
        }
        if (i != 24 && i != 25) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // defpackage.hmm
    public final boolean b(int i) {
        dp e = this.a.mL().e(R.id.reel_container);
        if (e.at() && (e instanceof hmc)) {
            hmc hmcVar = (hmc) e;
            if (!hmcVar.aS()) {
                hor horVar = hmcVar.ao;
                if (horVar != null) {
                    return horVar.g(i);
                }
                if (i == 24 || i == 25) {
                    hmcVar.aQ();
                    hmcVar.ap = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hmm
    public final boolean c(int i) {
        dp e = this.a.mL().e(R.id.reel_container);
        if (e.at() && (e instanceof hmc)) {
            hmc hmcVar = (hmc) e;
            if (!hmcVar.aS()) {
                hor horVar = hmcVar.ao;
                if (horVar != null) {
                    return horVar.h(i);
                }
                if (i == 24 || i == 25) {
                    if (hmcVar.ap) {
                        hmcVar.ap = false;
                    } else if (!hmcVar.an.H()) {
                        hmcVar.aQ();
                        return true;
                    }
                    hmcVar.aJ();
                    return true;
                }
            }
        }
        return false;
    }
}
