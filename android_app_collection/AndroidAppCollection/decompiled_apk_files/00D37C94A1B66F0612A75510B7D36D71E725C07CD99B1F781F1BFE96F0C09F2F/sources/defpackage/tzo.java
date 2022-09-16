package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tzo  reason: default package */
/* loaded from: classes4.dex */
public final class tzo implements vkq, ubr, tzl {
    public final snc a;
    public final Executor b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    private final tzk e;

    public tzo(snc sncVar, Executor executor) {
        this.a = sncVar;
        this.b = anlz.g(executor);
        this.e = new tzk(executor);
    }

    @Override // defpackage.vkq
    public final vkp a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vkq
    public final vkp b(Uri uri) {
        synchronized (tzo.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return this.e.b(uri);
            } else if (this.d.get(str) == null) {
                typ.d("%s: Can't find file group for uri: %s", "DownloadProgressMonitor", uri);
                return null;
            } else {
                return (vkp) this.d.get(str);
            }
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
        synchronized (tzo.class) {
            for (vkf vkfVar : this.d.values()) {
                aaek aaekVar = ((tzn) vkfVar.a).c;
                int i = typ.a;
            }
            this.e.e();
        }
    }

    @Override // defpackage.vkq
    public final void f() {
    }

    public final void g(String str, long j) {
        synchronized (tzo.class) {
            if (this.d.containsKey(str)) {
                ((vkf) this.d.get(str)).a.a((int) j);
            }
        }
    }

    public final void h(String str) {
        synchronized (tzo.class) {
            this.d.remove(str);
        }
    }
}
