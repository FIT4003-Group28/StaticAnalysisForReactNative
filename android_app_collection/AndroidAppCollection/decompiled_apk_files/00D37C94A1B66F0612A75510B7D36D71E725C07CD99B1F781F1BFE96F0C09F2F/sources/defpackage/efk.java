package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: efk  reason: default package */
/* loaded from: classes3.dex */
public final class efk implements ajmx {
    volatile int a = 0;
    private final aacz b;
    private final yxe c;
    private final Runnable d;

    public efk(azqb azqbVar, yxe yxeVar, Runnable runnable) {
        this.b = (aacz) azqbVar.get();
        this.c = yxeVar;
        this.d = runnable;
    }

    static final avhm f(avhn avhnVar) {
        if (avhnVar.c.size() > 0) {
            return (avhm) avhnVar.c.get(0);
        }
        return null;
    }

    final void a(ImageView imageView) {
        if (this.a == System.identityHashCode(imageView)) {
            this.c.e(8);
            this.d.run();
        }
    }

    @Override // defpackage.ajmx
    public final void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        a(imageView);
    }

    @Override // defpackage.ajmx
    public final void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        a(imageView);
    }

    @Override // defpackage.ajmx
    public final void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        avhm f;
        if (this.a != 0 || f(avhnVar) == null || (f = f(avhnVar)) == null) {
            return;
        }
        int ae = eog.ae(this.b);
        if ((f.d < ae && imageView.getWidth() < ae) || !this.c.g(8)) {
            return;
        }
        this.a = System.identityHashCode(imageView);
    }

    @Override // defpackage.ajmx
    public final void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        a(imageView);
    }
}
