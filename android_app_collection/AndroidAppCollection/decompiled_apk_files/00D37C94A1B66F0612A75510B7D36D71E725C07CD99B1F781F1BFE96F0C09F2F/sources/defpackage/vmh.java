package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: vmh  reason: default package */
/* loaded from: classes4.dex */
public final class vmh implements vnf, vmv {
    static final vwl p = new vwl();
    public final String a;
    public final ankt b;
    public final Executor c;
    public final vjb d;
    public final vls e;
    public final amlc h;
    public boolean n;
    public final vnl o;
    private final vkt r;
    public final vku f = new vmg(this, 1);
    public final vku g = new vmg(this);
    public final Object i = new Object();
    public final anju j = anju.a();
    private final anju s = anju.a();
    private final anju t = anju.a();
    public Object k = null;
    public Object l = null;
    public boolean m = false;
    public vwr q = null;

    public vmh(String str, ankt anktVar, vnl vnlVar, Executor executor, vjb vjbVar, vls vlsVar, vkt vktVar, amlc amlcVar) {
        this.a = str;
        this.b = anlz.r(anktVar);
        this.o = vnlVar;
        this.c = executor;
        this.d = vjbVar;
        this.e = vlsVar;
        this.r = vktVar;
        this.h = amlcVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static ankt b(final ankt anktVar, final Closeable closeable, Executor executor) {
        return anlz.k(anktVar).a(new Callable() { // from class: vlx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Closeable closeable2 = closeable;
                ankt anktVar2 = anktVar;
                closeable2.close();
                return anlz.y(anktVar2);
            }
        }, executor);
    }

    private final Closeable m(Uri uri, vwl vwlVar) {
        boolean z = vwlVar != p;
        try {
            vjb vjbVar = this.d;
            vki vkiVar = new vki(true, true);
            vkiVar.a = z;
            return (Closeable) vjbVar.c(uri, vkiVar);
        } catch (vjw e) {
            if (!z) {
                throw e;
            }
            return null;
        }
    }

    @Override // defpackage.vnf
    public final aniq a() {
        return new aniq() { // from class: vlu
            @Override // defpackage.aniq
            public final ankt a() {
                final vmh vmhVar = vmh.this;
                vls vlsVar = vmhVar.e;
                ankt r = anlz.r(vmhVar.b);
                final Runnable runnable = new Runnable() { // from class: vlw
                    @Override // java.lang.Runnable
                    public final void run() {
                        vmh vmhVar2 = vmh.this;
                        synchronized (vmhVar2.i) {
                            Object obj = vmhVar2.k;
                            if (obj != null && vmhVar2.m) {
                                vmhVar2.l = obj;
                            }
                            vmhVar2.k = null;
                            vmhVar2.n = true;
                            synchronized (vmhVar2.i) {
                                if (vmhVar2.q != null) {
                                    anlz.A(vmhVar2.k(vmh.p), new adjr(1), anjk.a);
                                }
                            }
                        }
                    }
                };
                final vlc vlcVar = (vlc) vlsVar;
                return anii.h(r, new ampg() { // from class: vkv
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        vlc vlcVar2 = vlc.this;
                        Runnable runnable2 = runnable;
                        Uri uri = (Uri) obj;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intentFilter.addDataScheme(uri.getScheme());
                        intentFilter.addDataPath(uri.getPath(), 0);
                        intentFilter.addDataAuthority("*", null);
                        vlcVar2.b.registerReceiver(new vla(runnable2), intentFilter, vlcVar2.d, vlcVar2.e);
                        synchronized (vlcVar2.i) {
                            vlcVar2.h.p(uri, runnable2);
                        }
                        return null;
                    }
                }, anjk.a);
            }
        };
    }

    public final ankt c(IOException iOException, vku vkuVar) {
        if ((iOException instanceof vjn) || (iOException.getCause() instanceof vjn)) {
            return anlz.p(iOException);
        }
        return this.r.a(iOException, vkuVar);
    }

    @Override // defpackage.vmv
    public final ankt d() {
        synchronized (this.i) {
            this.m = true;
        }
        vwr vwrVar = new vwr();
        synchronized (this.i) {
            this.q = vwrVar;
        }
        return ankq.a;
    }

    @Override // defpackage.vmv
    public final Object e() {
        synchronized (this.i) {
            aqxo.y(this.m);
            Object obj = this.k;
            if (obj != null) {
                return obj;
            }
            Object obj2 = this.l;
            if (obj2 == null) {
                throw new IllegalStateException("Do not call getWarmData before read(lock) completes.");
            }
            return obj2;
        }
    }

    public final Object f(Uri uri) {
        try {
            try {
                amlc amlcVar = this.h;
                String valueOf = String.valueOf(this.a);
                amlp b = amlcVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "));
                try {
                    InputStream inputStream = (InputStream) this.d.c(uri, vkk.b());
                    aoqu b2 = this.o.b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    b.close();
                    return b2;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (this.d.h(uri)) {
                    throw e;
                }
                return this.o.a;
            }
        } catch (IOException e2) {
            throw vwr.f(this.d, uri, e2);
        }
    }

    @Override // defpackage.vnf
    public final String g() {
        return this.a;
    }

    public final void h(Object obj) {
        this.k = obj;
        this.l = null;
    }

    public final ankt i(final ankt anktVar) {
        ankt b;
        vls vlsVar = this.e;
        final ankt anktVar2 = this.b;
        final vlc vlcVar = (vlc) vlsVar;
        final Integer num = (Integer) ((amqr) vlcVar.f).a;
        if (num.intValue() < 0) {
            b = ankq.a;
        } else {
            final ankt i = anii.i(anktVar2, vlcVar.c, anjk.a);
            b = anlz.m(anktVar2, i).b(new aniq() { // from class: vkx
                @Override // defpackage.aniq
                public final ankt a() {
                    vlc vlcVar2 = vlc.this;
                    ankt anktVar3 = anktVar2;
                    ankt anktVar4 = i;
                    Integer num2 = num;
                    Uri uri = (Uri) anlz.y(anktVar3);
                    Set<String> set = (Set) anlz.y(anktVar4);
                    vlb vlbVar = new vlb(set);
                    for (String str : set) {
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intent.setData(uri);
                        intent.setPackage(str);
                        intent.setFlags(268435456);
                        vlcVar2.b.sendOrderedBroadcast(intent, null, vlbVar, vlcVar2.e, -1, null, null);
                    }
                    amqi b2 = amqi.b(amok.a);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    ankt h = anhq.h(anko.q(vlbVar.a).r(num2.intValue(), vlcVar2.g, null), TimeoutException.class, new ampg() { // from class: vkw
                        @Override // defpackage.ampg
                        public final Object apply(Object obj) {
                            TimeoutException timeoutException = (TimeoutException) obj;
                            atomicBoolean.set(false);
                            return null;
                        }
                    }, anjk.a);
                    anlz.A(h, new vky(vlcVar2, atomicBoolean, set, b2, vlbVar, num2), anjk.a);
                    return h;
                }
            }, anjk.a);
        }
        return anii.i(b, ammo.c(new anir() { // from class: vme
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final vmh vmhVar = vmh.this;
                Void r3 = (Void) obj;
                return anii.i(anktVar, ammo.c(new anir() { // from class: vmb
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        vmh vmhVar2 = vmh.this;
                        Uri uri = (Uri) anlz.y(vmhVar2.b);
                        Uri a = uyr.a(uri, ".tmp");
                        try {
                            amlc amlcVar = vmhVar2.h;
                            String valueOf = String.valueOf(vmhVar2.a);
                            amlp b2 = amlcVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "));
                            vjk vjkVar = new vjk();
                            try {
                                vjb vjbVar = vmhVar2.d;
                                vkl b3 = vkl.b();
                                b3.a = new vjk[]{vjkVar};
                                OutputStream outputStream = (OutputStream) vjbVar.c(a, b3);
                                try {
                                    ((aoqu) obj2).writeTo(outputStream);
                                    vjkVar.a();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    b2.close();
                                    vmhVar2.d.g(a, uri);
                                    synchronized (vmhVar2.i) {
                                        vmhVar2.h(obj2);
                                    }
                                    return ankq.a;
                                } catch (Throwable th) {
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e) {
                                throw vwr.f(vmhVar2.d, uri, e);
                            }
                        } catch (IOException e2) {
                            if (vmhVar2.d.h(a)) {
                                try {
                                    vmhVar2.d.f(a);
                                } catch (IOException unused2) {
                                }
                            }
                            throw e2;
                        }
                    }
                }), vmhVar.c);
            }
        }), anjk.a);
    }

    @Override // defpackage.vnf
    public final ankt j(final anir anirVar, final Executor executor) {
        return this.j.b(ammo.b(new aniq() { // from class: vlz
            @Override // defpackage.aniq
            public final ankt a() {
                final ankt i;
                final vmh vmhVar = vmh.this;
                anir anirVar2 = anirVar;
                Executor executor2 = executor;
                final Uri uri = (Uri) anlz.y(vmhVar.b);
                vju a = vju.a((Closeable) vmhVar.d.c(uri, vki.b()));
                try {
                    try {
                        i = anlz.q(vmhVar.f(uri));
                    } catch (IOException e) {
                        i = anii.i(vmhVar.c(e, vmhVar.g), ammo.c(new anir() { // from class: vmc
                            @Override // defpackage.anir
                            public final ankt a(Object obj) {
                                Void r3 = (Void) obj;
                                return anlz.q(vmh.this.f(uri));
                            }
                        }), vmhVar.c);
                    }
                    final ankt i2 = anii.i(i, anirVar2, executor2);
                    ankt b = vmh.b(anii.i(i2, ammo.c(new anir() { // from class: vlv
                        @Override // defpackage.anir
                        public final ankt a(Object obj) {
                            vmh vmhVar2 = vmh.this;
                            ankt anktVar = i;
                            ankt anktVar2 = i2;
                            if (anlz.y(anktVar).equals(anlz.y(anktVar2))) {
                                return ankq.a;
                            }
                            return vmhVar2.i(anktVar2);
                        }
                    }), anjk.a), a.b(), vmhVar.c);
                    a.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }), this.c);
    }

    @Override // defpackage.vnf
    public final ankt k(final vwl vwlVar) {
        synchronized (this.i) {
            Object obj = this.k;
            if (obj != null) {
                return anlz.q(obj);
            }
            return anlz.r((vwlVar == p ? this.t : this.s).b(ammo.b(new aniq(vwlVar, null) { // from class: vly
                public final /* synthetic */ vwl b;

                @Override // defpackage.aniq
                public final ankt a() {
                    final vmh vmhVar = vmh.this;
                    final vwl vwlVar2 = this.b;
                    final Uri uri = (Uri) anlz.y(vmhVar.b);
                    try {
                        return anlz.q(vmhVar.l(vwlVar2, uri));
                    } catch (IOException e) {
                        return anii.i(vmhVar.c(e, vmhVar.f), ammo.c(new anir(vwlVar2, uri, null) { // from class: vmd
                            public final /* synthetic */ Uri b;
                            public final /* synthetic */ vwl c;

                            @Override // defpackage.anir
                            public final ankt a(Object obj2) {
                                Void r4 = (Void) obj2;
                                return anlz.q(vmh.this.l(this.c, this.b));
                            }
                        }), vmhVar.c);
                    }
                }
            }), this.c));
        }
    }

    public final Object l(vwl vwlVar, Uri uri) {
        Closeable m;
        synchronized (this.i) {
            Object obj = this.k;
            if (obj != null) {
                return obj;
            }
            try {
                m = m(uri, vwlVar);
            } catch (FileNotFoundException unused) {
                Object f = f(uri);
                synchronized (this.i) {
                    if (!this.n) {
                        h(f);
                    } else {
                        f = null;
                    }
                    if (f != null) {
                        return f;
                    }
                    m = m(uri, vwlVar);
                }
            }
            try {
                Object f2 = f(uri);
                synchronized (this.i) {
                    if (m != null) {
                        h(f2);
                        m.close();
                    }
                }
                return f2;
            } catch (Throwable th) {
                if (m != null) {
                    try {
                        m.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
    }
}
