package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vlc  reason: default package */
/* loaded from: classes4.dex */
public final class vlc implements vls {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final anir c;
    public final String d;
    public final Handler e;
    public final amqo f;
    public final TimeUnit g;
    public final amwg h = amxh.a().b().b();
    public final Object i = new Object();

    public vlc(vkz vkzVar) {
        this.b = vkzVar.a;
        this.c = vkzVar.b;
        this.d = vkzVar.c;
        this.e = vkzVar.d;
        this.f = vkzVar.e;
        this.g = vkzVar.f;
    }

    public final void a(Uri uri) {
        amuf f = amuk.f();
        synchronized (this.i) {
            f.j(this.h.e(uri));
        }
        amuk g = f.g();
        int i = ((amxx) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Runnable) g.get(i2)).run();
        }
    }
}
