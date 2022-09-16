package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmq  reason: default package */
/* loaded from: classes4.dex */
public final class vmq implements vnf, vmv {
    public final ankt a;
    public final Executor b;
    public final vjb c;
    public final vkt d;
    private final String g;
    private final amlc h;
    private final vnl j;
    public final Object e = new Object();
    private final anju i = anju.a();
    public ankt f = null;

    public vmq(String str, ankt anktVar, vnl vnlVar, Executor executor, vjb vjbVar, vkt vktVar, amlc amlcVar) {
        this.g = str;
        this.a = anlz.r(anktVar);
        this.j = vnlVar;
        this.b = anlz.g(executor);
        this.c = vjbVar;
        this.d = vktVar;
        this.h = amlcVar;
    }

    private final ankt f() {
        ankt anktVar;
        synchronized (this.e) {
            ankt anktVar2 = this.f;
            if (anktVar2 != null && anktVar2.isDone()) {
                try {
                    anlz.y(this.f);
                } catch (ExecutionException unused) {
                    this.f = null;
                }
            }
            if (this.f == null) {
                this.f = anlz.r(this.i.b(ammo.b(new vmj(this)), this.b));
            }
            anktVar = this.f;
        }
        return anktVar;
    }

    @Override // defpackage.vnf
    public final aniq a() {
        return new vmj(this, 1);
    }

    public final Object b(Uri uri) {
        try {
            try {
                amlc amlcVar = this.h;
                String valueOf = String.valueOf(this.g);
                amlp b = amlcVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "));
                try {
                    InputStream inputStream = (InputStream) this.c.c(uri, vkk.b());
                    aoqu b2 = this.j.b(inputStream);
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
                if (this.c.h(uri)) {
                    throw e;
                }
                return this.j.a;
            }
        } catch (IOException e2) {
            throw vwr.f(this.c, uri, e2);
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri a = uyr.a(uri, ".tmp");
        try {
            amlc amlcVar = this.h;
            String valueOf = String.valueOf(this.g);
            amlp b = amlcVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "));
            vjk vjkVar = new vjk();
            try {
                vjb vjbVar = this.c;
                vkl b2 = vkl.b();
                b2.a = new vjk[]{vjkVar};
                OutputStream outputStream = (OutputStream) vjbVar.c(a, b2);
                try {
                    ((aoqu) obj).writeTo(outputStream);
                    vjkVar.a();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    b.close();
                    this.c.g(a, uri);
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
                throw vwr.f(this.c, uri, e);
            }
        } catch (IOException e2) {
            if (this.c.h(a)) {
                try {
                    this.c.f(a);
                } catch (IOException unused2) {
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.vmv
    public final ankt d() {
        return ankq.a;
    }

    @Override // defpackage.vmv
    public final Object e() {
        Object y;
        try {
            synchronized (this.e) {
                y = anlz.y(this.f);
            }
            return y;
        } catch (NullPointerException | ExecutionException e) {
            throw new IllegalStateException("Do not call getDataSync() before a successful call to getData()", e);
        }
    }

    @Override // defpackage.vnf
    public final String g() {
        return this.g;
    }

    @Override // defpackage.vnf
    public final ankt j(final anir anirVar, final Executor executor) {
        final ankt f = f();
        return this.i.b(ammo.b(new aniq() { // from class: vmk
            @Override // defpackage.aniq
            public final ankt a() {
                final vmq vmqVar = vmq.this;
                ankt anktVar = f;
                anir anirVar2 = anirVar;
                Executor executor2 = executor;
                final ankt i = anii.i(anktVar, new vml(vmqVar, 1), anjk.a);
                final ankt i2 = anii.i(i, anirVar2, executor2);
                return anii.i(i2, ammo.c(new anir() { // from class: vmn
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        final vmq vmqVar2 = vmq.this;
                        ankt anktVar2 = i;
                        final ankt anktVar3 = i2;
                        if (!anlz.y(anktVar2).equals(anlz.y(anktVar3))) {
                            ankt i3 = anii.i(anktVar3, ammo.c(new anir() { // from class: vmm
                                @Override // defpackage.anir
                                public final ankt a(Object obj2) {
                                    vmq vmqVar3 = vmq.this;
                                    ankt anktVar4 = anktVar3;
                                    vmqVar3.c((Uri) anlz.y(vmqVar3.a), obj2);
                                    synchronized (vmqVar3.e) {
                                        vmqVar3.f = anktVar4;
                                    }
                                    return ankq.a;
                                }
                            }), vmqVar2.b);
                            synchronized (vmqVar2.e) {
                            }
                            return i3;
                        }
                        return ankq.a;
                    }
                }), anjk.a);
            }
        }), anjk.a);
    }

    @Override // defpackage.vnf
    public final ankt k(vwl vwlVar) {
        return f();
    }
}
