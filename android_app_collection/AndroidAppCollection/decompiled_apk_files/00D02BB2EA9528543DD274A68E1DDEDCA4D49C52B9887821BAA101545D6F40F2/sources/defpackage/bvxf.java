package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvxf  reason: default package */
/* loaded from: classes4.dex */
public class bvxf implements bvxg {
    private static final View.OnClickListener b = new bvxe();
    private final jib a;

    public bvxf(bvxu bvxuVar) {
        String str = bvxuVar.o;
        View.OnClickListener onClickListener = b;
        jhz a = jhz.a();
        a.a = str;
        a.u = irg.b();
        a.q = irg.a();
        a.x = false;
        a.i = cqrt.g(2131231588, irg.b());
        a.j = cqrt.l(R.string.BACK_BUTTON);
        a.f(onClickListener);
        this.a = a.b();
    }

    @Override // defpackage.bvxg
    public jib a() {
        return this.a;
    }
}
