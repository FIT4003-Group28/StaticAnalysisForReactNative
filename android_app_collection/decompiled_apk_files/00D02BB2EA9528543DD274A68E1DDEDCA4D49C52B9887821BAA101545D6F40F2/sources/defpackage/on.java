package defpackage;

import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: on  reason: default package */
/* loaded from: classes7.dex */
public class on extends op {
    final WindowInsets.Builder a;

    public on() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.op
    public final void a(kd kdVar) {
        this.a.setSystemWindowInsets(kdVar.d());
    }

    @Override // defpackage.op
    public final ow b() {
        return ow.a(this.a.build());
    }

    @Override // defpackage.op
    public final void c(kd kdVar) {
        this.a.setStableInsets(kdVar.d());
    }

    public on(ow owVar) {
        WindowInsets.Builder builder;
        WindowInsets p = owVar.p();
        if (p != null) {
            builder = new WindowInsets.Builder(p);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
