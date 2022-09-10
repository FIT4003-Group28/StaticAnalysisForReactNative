package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: czec  reason: default package */
/* loaded from: classes5.dex */
final class czec {
    private final dued a;
    private final Context b;
    private final Locale c;
    private final Object d = new Object();
    private final ClientConfigInternal e;
    private final cyph f;
    private volatile czdx g;
    @dzsi
    private final cyug h;

    public czec(cyug cyugVar, Context context, Locale locale, ClientConfigInternal clientConfigInternal, cyph cyphVar) {
        this.b = context;
        this.c = locale;
        this.h = cyugVar;
        this.e = clientConfigInternal;
        this.a = clientConfigInternal.h;
        this.f = cyphVar;
    }

    public final String a() {
        return dybx.b() ? String.format(Locale.US, "TopNContacts_%d.dat", Integer.valueOf(cydu.a(this.e.T))) : String.format(Locale.US, "TopNContactsGrpc_%d_%s.dat", Integer.valueOf(this.a.cg), dbrz.e("_").g(dcdc.w(dcln.a, dcft.o(this.e.r, czea.a))));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: all -> 0x0119, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:58:0x0113, B:9:0x0013, B:12:0x0031, B:13:0x003c, B:48:0x00bd, B:50:0x00ea, B:52:0x00f2, B:54:0x0105, B:56:0x0109, B:47:0x00af, B:59:0x0115, B:60:0x0117), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[Catch: all -> 0x0119, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:58:0x0113, B:9:0x0013, B:12:0x0031, B:13:0x003c, B:48:0x00bd, B:50:0x00ea, B:52:0x00f2, B:54:0x0105, B:56:0x0109, B:47:0x00af, B:59:0x0115, B:60:0x0117), top: B:67:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.czdx b() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czec.b():czdx");
    }

    public final dehn<?> c(final czdx czdxVar, final cylc cylcVar, final boolean z, dehp dehpVar) {
        return dehpVar.a(new Runnable(this, czdxVar, cylcVar, z) { // from class: czeb
            private final czec a;
            private final czdx b;
            private final cylc c;
            private final boolean d;

            {
                this.a = this;
                this.b = czdxVar;
                this.c = cylcVar;
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(this.b, this.c, this.d);
            }
        });
    }

    public final void d(czdx czdxVar, cylc cylcVar, boolean z) {
        FileOutputStream fileOutputStream;
        if (z || !b().s(czdxVar)) {
            czdm bZ = czdo.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cylcVar.getClass();
            ((czdo) bZ.b).b = cylcVar;
            long e = czdxVar.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((czdo) bZ.b).a = e;
            int u = czdxVar.u();
            int i = u - 1;
            FileOutputStream fileOutputStream2 = null;
            if (u == 0) {
                throw null;
            }
            int i2 = 3;
            if (i != 2) {
                i2 = i != 3 ? 2 : 4;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((czdo) bZ.b).c = czdn.a(i2);
            List asList = Arrays.asList(this.e.J.b());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            czdo czdoVar = (czdo) bZ.b;
            dsrj<String> dsrjVar = czdoVar.d;
            if (!dsrjVar.a()) {
                czdoVar.d = dsqw.cl(dsrjVar);
            }
            dsod.bv(asList, czdoVar.d);
            byte[] bS = bZ.bK().bS();
            synchronized (this.d) {
                if (!z) {
                    if (b().s(czdxVar)) {
                        return;
                    }
                }
                this.g = czdxVar;
                cyug cyugVar = this.h;
                if (cyugVar != null) {
                    String a = a();
                    cyxe.a();
                    synchronized (cyugVar.b(a)) {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(new File(cyugVar.a, a));
                            } catch (IOException e2) {
                                e = e2;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            fileOutputStream.write(bS);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                            fileOutputStream2 = fileOutputStream;
                            if (String.valueOf(e.getMessage()).length() == 0) {
                                new String("Failed to write cache bytes: ");
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            cyug cyugVar = this.h;
            if (cyugVar != null) {
                String a = a();
                cyxe.a();
                synchronized (cyugVar.b(a)) {
                    new File(cyugVar.a, a).delete();
                }
            }
            this.g = null;
        }
    }
}
