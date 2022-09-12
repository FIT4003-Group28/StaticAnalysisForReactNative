package defpackage;

import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: voq  reason: default package */
/* loaded from: classes7.dex */
final class voq implements egl {
    final /* synthetic */ vos a;

    public voq(vos vosVar) {
        this.a = vosVar;
    }

    @Override // defpackage.egl
    public final int a() {
        return this.a.c.getBottom();
    }

    @Override // defpackage.egl
    public final int b() {
        if (!(this.a.b.c() instanceof ModAppBar)) {
            bvoo.h("TransparentAppBar appBar View must be an instance of ModAppBar", new Object[0]);
            return 0;
        }
        return this.a.b.c().findViewById(R.id.title_start_space).getLeft();
    }

    @Override // defpackage.egl
    public final int c() {
        if (!(this.a.b.c() instanceof ModAppBar)) {
            bvoo.h("TransparentAppBar appBar View must be an instance of ModAppBar", new Object[0]);
            return 0;
        }
        return this.a.b.c().getWidth() - this.a.b.c().findViewById(R.id.title_end_space).getRight();
    }
}
