package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajnw  reason: default package */
/* loaded from: classes.dex */
public final class ajnw implements ajmr {
    public static volatile cfk a;
    private static final Object b = new Object();
    private final Context c;
    private final Executor d;
    private final amqo e;

    public ajnw(Context context, Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.c = context;
        this.d = executor;
        this.e = aqxo.i(new ajnz(azqbVar2, azqbVar3, azqbVar, 1));
    }

    private static void b(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = cfk.b(context);
                }
            }
        }
    }

    @Override // defpackage.ajmr, defpackage.yys
    public final void a(final Uri uri, final yiw yiwVar) {
        b(this.c);
        yiwVar.getClass();
        final cgd f = cfk.c(this.c).b().d((ctl) this.e.get()).f(uri);
        if (cvd.n()) {
            f.p(new ajnu(yiwVar, uri));
        } else {
            this.d.execute(new Runnable() { // from class: ajns
                @Override // java.lang.Runnable
                public final void run() {
                    cgd cgdVar = cgd.this;
                    yiw yiwVar2 = yiwVar;
                    Uri uri2 = uri;
                    try {
                        yiwVar2.b(uri2, (Bitmap) cgdVar.n().get());
                    } catch (Exception e) {
                        yiwVar2.a(uri2, e);
                    }
                }
            });
        }
    }

    @Override // defpackage.ajmr
    public final void d() {
        if (a != null) {
            synchronized (b) {
                if (a != null) {
                    Executor executor = ylx.a;
                    ylx.q(ajsy.a);
                }
            }
        }
    }

    @Override // defpackage.ajmr
    public final void f(Uri uri, Uri uri2) {
    }

    @Override // defpackage.ajmr
    public final void g(final Uri uri, final yiw yiwVar) {
        yiwVar.getClass();
        b(this.c);
        cgd f = cfk.c(this.c).a(byte[].class).f(uri);
        if (!cvd.n()) {
            ylx.k(anii.h(aed.c(new cgx(f)), new hhf(1), cux.b), this.d, new ylv() { // from class: ajnq
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    yiw.this.a(uri, th instanceof Exception ? (Exception) th : new Exception(th));
                }
            }, new ylw() { // from class: ajnr
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    yiw.this.b(uri, (byte[]) obj);
                }
            });
        } else {
            f.p(new ajnt(yiwVar, uri));
        }
    }

    @Override // defpackage.ajmr
    public final boolean h(Uri uri) {
        throw new RuntimeException("Should not be called in GlideImageClient");
    }
}
