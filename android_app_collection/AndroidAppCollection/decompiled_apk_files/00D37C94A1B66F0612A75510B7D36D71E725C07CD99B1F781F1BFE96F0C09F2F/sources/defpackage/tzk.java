package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tzk  reason: default package */
/* loaded from: classes4.dex */
public final class tzk implements vkq, ubr, tzl {
    private final HashMap a = new HashMap();

    public tzk(Executor executor) {
        anlz.g(executor);
    }

    @Override // defpackage.vkq
    public final vkp a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vkq
    public final vkp b(Uri uri) {
        synchronized (tzk.class) {
            if (this.a.get(uri) == null) {
                return null;
            }
            return (vkp) this.a.get(uri);
        }
    }

    @Override // defpackage.ubr
    public final void c() {
    }

    @Override // defpackage.ubr
    public final void d() {
    }

    @Override // defpackage.ubr
    public final void e() {
        synchronized (tzk.class) {
            Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                tzj tzjVar = (tzj) it.next();
                throw null;
            }
        }
    }

    @Override // defpackage.vkq
    public final void f() {
    }
}
