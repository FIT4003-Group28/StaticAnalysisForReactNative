package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: hcu  reason: default package */
/* loaded from: classes3.dex */
public final class hcu extends abc {
    private final hcy a;

    public hcu(hcy hcyVar) {
        this.a = hcyVar;
    }

    static Optional q(yo yoVar) {
        return Optional.ofNullable((ajrz) yoVar.a.getTag(R.id.presenter_adapter_viewholder_tag));
    }

    static boolean r(xo xoVar, int i) {
        if (i == -1 || xoVar.b() == 0 || !(xoVar instanceof ajsf)) {
            return false;
        }
        return ((ajsf) xoVar).getItem(i) instanceof hcn;
    }

    @Override // defpackage.abc
    public final int d(RecyclerView recyclerView, yo yoVar) {
        int i;
        if (r(recyclerView.m, yoVar.a())) {
            Optional q = q(yoVar);
            if (q.isPresent() && (((ajrz) q.get()).t instanceof hcb) && !((hcb) ((ajrz) q.get()).t).a.i) {
                i = 3;
                return n(i);
            }
        }
        i = 0;
        return n(i);
    }

    @Override // defpackage.abc
    public final void f(RecyclerView recyclerView, yo yoVar) {
        yoVar.a.setScaleX(1.0f);
        yoVar.a.setScaleY(1.0f);
        super.f(recyclerView, yoVar);
    }

    @Override // defpackage.abc
    public final void g(yo yoVar, int i) {
        gyq gyqVar;
        if (i == 2) {
            yoVar.a.setScaleX(1.03f);
            yoVar.a.setScaleY(1.1f);
            Optional q = q(yoVar);
            if (!q.isPresent() || !(((ajrz) q.get()).t instanceof hcb) || (gyqVar = ((hcb) ((ajrz) q.get()).t).a.c) == null) {
                return;
            }
            gyqVar.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_TEXT_TRACK).c();
        }
    }

    @Override // defpackage.abc
    public final boolean j() {
        return this.a.a() > 1;
    }

    @Override // defpackage.abc
    public final boolean k(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        int i = !r(recyclerView.m, 0) ? 1 : 0;
        int a = this.a.a();
        int a2 = yoVar.a();
        int min = Math.min(Math.max(yoVar2.a(), i), (a + i) - 1);
        if (a2 == min || !r(recyclerView.m, min)) {
            return false;
        }
        hcy hcyVar = this.a;
        int i2 = a2 - i;
        int i3 = min - i;
        if (i2 != i3 && i2 >= 0 && i3 >= 0 && i2 < hcyVar.a() && i3 < hcyVar.a()) {
            int size = hcyVar.b.size();
            hcv hcvVar = (hcv) hcyVar.b.remove(i2);
            hcyVar.b.add(i3, hcvVar);
            hcyVar.d.o(hcvVar.a(), (size - i3) - 1);
        }
        recyclerView.m.om(a2, min);
        return true;
    }

    @Override // defpackage.abc
    public final void m() {
    }

    @Override // defpackage.abc
    public final void p() {
    }
}
