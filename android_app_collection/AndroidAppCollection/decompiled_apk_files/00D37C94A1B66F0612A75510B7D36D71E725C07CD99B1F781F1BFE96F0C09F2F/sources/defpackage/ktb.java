package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ktb  reason: default package */
/* loaded from: classes3.dex */
public final class ktb extends xo {
    static final int[] d = {CellularSignalStrengthError.ERROR_NOT_SUPPORTED};
    private final int e;
    private final Activity f;
    private final ColorDrawable g = new ColorDrawable();
    private final ajmy h;
    private final xx i;
    private final xx j;
    private List k;
    private kta l;
    private avhn m;
    private int n;

    public ktb(Activity activity, ajmy ajmyVar, xx xxVar, xx xxVar2, int i) {
        this.f = activity;
        this.h = ajmyVar;
        this.i = xxVar;
        this.j = xxVar2;
        this.e = i;
    }

    private final boolean A() {
        avhn avhnVar = this.m;
        return avhnVar != null && avhnVar.c.size() > 0;
    }

    private static final ksy B(int i, ViewGroup viewGroup, xx xxVar) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        frameLayout.setLayoutParams(xxVar);
        return new ksy(frameLayout, zdk.d(frameLayout.findViewById(R.id.scrim)));
    }

    private final avhn z(int i) {
        if (w()) {
            List list = this.k;
            if (list != null && i < list.size()) {
                return (avhn) this.k.get(i);
            }
            return null;
        } else if (i == 0) {
            return this.m;
        } else {
            List list2 = this.k;
            if (list2 != null && i <= list2.size()) {
                return (avhn) this.k.get(i - 1);
            }
            return null;
        }
    }

    @Override // defpackage.xo
    public final int b() {
        return w() ? 4 : 3;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return (i == 0 && this.n == 3 && A()) ? 0 : 1;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        kta ktaVar;
        ksy ksyVar = (ksy) yoVar;
        ksyVar.a.setLayoutParams(x(i) ? this.j : this.i);
        List list = this.k;
        boolean z = true;
        int size = (list == null ? 0 : list.size()) + (!w());
        if (i < size) {
            this.h.h(ksyVar.u, z(i));
        }
        boolean z2 = i == b() + (-1) && w();
        ImageView imageView = ksyVar.w;
        int i2 = 8;
        if (imageView != null) {
            imageView.setVisibility(true != z2 ? 8 : 0);
        }
        View view = ksyVar.v;
        if (i >= size || z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
        avhn z3 = z(0);
        if (c(i) != 0 && i < size) {
            z = false;
        }
        if (z2 && i < size) {
            ksyVar.t.a(d);
        } else if (z && z3 != null) {
            if (this.l == null) {
                this.l = new kta();
            }
            kta ktaVar2 = this.l;
            yzo yzoVar = ksyVar.t;
            if (!ktaVar2.a.contains(yzoVar)) {
                ktaVar2.c();
                ktaVar2.a.add(yzoVar);
            }
        } else if (i >= size) {
            this.g.setColor(zhn.d(ksyVar.u.getContext(), R.attr.ytIconInactive));
            ksyVar.u.setImageDrawable(this.g);
            ksyVar.t.a(d);
        }
        if (i != b() - 1 || (ktaVar = this.l) == null || ktaVar.a.isEmpty()) {
            return;
        }
        this.h.l(akel.t(z(0)), yit.c(this.f, this.l));
    }

    public final boolean w() {
        int i = this.n;
        return i == 0 || i == 1 || i == 2 || !A();
    }

    public final boolean x(int i) {
        return i == 0 && !w();
    }

    public final void y(int i, avhn avhnVar, List list) {
        this.n = i;
        this.m = avhnVar;
        this.k = list;
        kta ktaVar = this.l;
        if (ktaVar != null) {
            ktaVar.c();
            ktaVar.a.clear();
            this.l = null;
        }
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            ksy B = B(R.layout.avatar_image_layout, viewGroup, this.j);
            ViewGroup.LayoutParams layoutParams = B.u.getLayoutParams();
            layoutParams.height = this.e;
            layoutParams.width = this.e;
            return B;
        }
        return B(R.layout.scrim_image_layout, viewGroup, this.i);
    }
}
