package defpackage;

import android.graphics.Bitmap;
/* renamed from: jcr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jcr {
    private final jct a;

    public jcr(jct jctVar) {
        this.a = jctVar;
    }

    public final void a(final Bitmap bitmap) {
        final jct jctVar = this.a;
        synchronized (jctVar.d) {
            if (jctVar.d.f != jctVar) {
                return;
            }
            jctVar.d.a.execute(new Runnable(jctVar, bitmap) { // from class: jcs
                private final jct a;
                private final Bitmap b;

                {
                    this.a = jctVar;
                    this.b = bitmap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    jct jctVar2 = this.a;
                    jctVar2.d.c(this.b);
                }
            });
        }
    }
}
