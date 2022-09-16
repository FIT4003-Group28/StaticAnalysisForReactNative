package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.litho.ComponentHost;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: cyt  reason: default package */
/* loaded from: classes3.dex */
public final class cyt extends amh {
    private static final Rect g = new Rect(0, 0, 1, 1);
    public dab f;
    private final View h;
    private final jo i;

    public cyt(View view, dab dabVar, boolean z, int i) {
        super(view);
        this.h = view;
        this.f = dabVar;
        this.i = new cys(this);
        view.setFocusable(z);
        lj.V(view, i);
    }

    private static dms E(View view) {
        if (!(view instanceof ComponentHost)) {
            return null;
        }
        return ((ComponentHost) view).c();
    }

    @Override // defpackage.amh, defpackage.jo
    public final ml a(View view) {
        dms E = E(this.h);
        if (E == null || !dbn.a(E).b.ae()) {
            return null;
        }
        return super.a(view);
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        int i;
        String str;
        daq daqVar;
        dms E = E(this.h);
        dab dabVar = this.f;
        if (dabVar != null && (daqVar = dabVar.n) != null) {
            jo joVar = this.i;
            if (czu.f == null) {
                czu.f = new dcy();
            }
            czu.f.a = view;
            czu.f.b = mhVar;
            czu.f.c = joVar;
            daqVar.a.l().K(daqVar, czu.f);
            czu.f.a = null;
            czu.f.b = null;
            czu.f.c = null;
        } else if (E != null) {
            super.d(view, mhVar);
            dbn.a(E).b.T(view, mhVar);
        } else {
            super.d(view, mhVar);
        }
        dab dabVar2 = this.f;
        if (dabVar2 != null && (str = dabVar2.m) != null) {
            mhVar.r(str);
        }
        dab dabVar3 = this.f;
        if (dabVar3 == null || (i = dabVar3.s) == 0) {
            return;
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        mhVar.z(z);
    }

    @Override // defpackage.amh
    protected final int k(float f, float f2) {
        dms E = E(this.h);
        if (E == null) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        cyr cyrVar = dbn.a(E).b;
        if (cyrVar.E() != 0) {
            Rect bounds = ((Drawable) E.a).getBounds();
            int D = cyrVar.D(((int) f) - bounds.left, ((int) f2) - bounds.top);
            if (D >= 0) {
                return D;
            }
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.amh
    protected final void m(List list) {
        dms E = E(this.h);
        if (E == null) {
            return;
        }
        int E2 = dbn.a(E).b.E();
        for (int i = 0; i < E2; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.amh
    protected final void p(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // defpackage.amh
    protected final void q(int i, mh mhVar) {
        dms E = E(this.h);
        if (E == null) {
            String valueOf = String.valueOf(this.h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("No accessible mount item found for view: ");
            sb.append(valueOf);
            Log.e("ComponentAccessibility", sb.toString());
            mhVar.v("");
            mhVar.n(g);
            return;
        }
        Rect bounds = ((Drawable) E.a).getBounds();
        cyr cyrVar = dbn.a(E).b;
        mhVar.r(cyrVar.getClass().getName());
        if (i >= cyrVar.E()) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Received unrecognized virtual view id: ");
            sb2.append(i);
            Log.e("ComponentAccessibility", sb2.toString());
            mhVar.v("");
            mhVar.n(g);
            return;
        }
        cyrVar.U(mhVar, i, bounds.left, bounds.top);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amh
    public final boolean u(int i, int i2) {
        return false;
    }
}
