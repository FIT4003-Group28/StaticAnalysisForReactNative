package defpackage;

import android.graphics.PorterDuff;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: mkx  reason: default package */
/* loaded from: classes3.dex */
final class mkx {
    final /* synthetic */ mky a;
    private final ImageView b;
    private final int c;
    private final int d;

    public mkx(mky mkyVar, ImageView imageView, int i, int i2) {
        this.a = mkyVar;
        this.b = imageView;
        this.c = i;
        this.d = i2;
    }

    public final void a() {
        this.b.getDrawable().mutate().setColorFilter(this.a.f, PorterDuff.Mode.SRC_IN);
    }

    public final void b() {
        this.b.setImageResource(this.c);
        this.b.setTag("default");
        a();
    }

    public final void c() {
        this.b.setImageResource(this.d);
        this.b.setTag("on");
        a();
    }
}
