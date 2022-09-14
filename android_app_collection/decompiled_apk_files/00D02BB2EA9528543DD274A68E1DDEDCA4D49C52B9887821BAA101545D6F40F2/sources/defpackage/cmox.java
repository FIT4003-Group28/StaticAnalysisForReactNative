package defpackage;

import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: cmox  reason: default package */
/* loaded from: classes5.dex */
public final class cmox {
    public final Handler a;
    public final cmoy b;

    public cmox(Handler handler, cmoy cmoyVar) {
        this.a = cmoyVar == null ? null : handler;
        this.b = cmoyVar;
    }

    public final void a(final int i, final int i2, final int i3, final float f) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable(this, i, i2, i3, f) { // from class: cmot
                private final cmox a;
                private final int b;
                private final int c;
                private final int d;
                private final float e;

                {
                    this.a = this;
                    this.b = i;
                    this.c = i2;
                    this.d = i3;
                    this.e = f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar = this.a;
                    int i4 = this.b;
                    int i5 = this.c;
                    int i6 = this.d;
                    float f2 = this.e;
                    cmoy cmoyVar = cmoxVar.b;
                    int i7 = cmny.a;
                    cmoyVar.v(i4, i5, i6, f2);
                }
            });
        }
    }

    public final void b(final Surface surface) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable(this, surface) { // from class: cmou
                private final cmox a;
                private final Surface b;

                {
                    this.a = this;
                    this.b = surface;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar = this.a;
                    Surface surface2 = this.b;
                    cmoy cmoyVar = cmoxVar.b;
                    int i = cmny.a;
                    cmoyVar.w(surface2);
                }
            });
        }
    }

    public final void c(final clte clteVar) {
        clteVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable(this, clteVar) { // from class: cmow
                private final cmox a;
                private final clte b;

                {
                    this.a = this;
                    this.b = clteVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar = this.a;
                    clte clteVar2 = this.b;
                    clteVar2.a();
                    cmoy cmoyVar = cmoxVar.b;
                    int i = cmny.a;
                    cmoyVar.y(clteVar2);
                }
            });
        }
    }
}
