package defpackage;

import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: cgs  reason: default package */
/* loaded from: classes4.dex */
public final class cgs extends Fragment {
    public final cfz a;
    public final cgv b;
    public bsa c;
    private final Set<cgs> d;
    private cgs e;

    public cgs() {
        cfz cfzVar = new cfz();
        this.b = new cgr(this);
        this.d = new HashSet();
        this.a = cfzVar;
    }

    private final void a() {
        cgs cgsVar = this.e;
        if (cgsVar != null) {
            cgsVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a();
            cgs d = brc.a(activity).e.d(activity.getFragmentManager());
            this.e = d;
            if (equals(d)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.e();
        a();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        a();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(fragment).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fragment);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
