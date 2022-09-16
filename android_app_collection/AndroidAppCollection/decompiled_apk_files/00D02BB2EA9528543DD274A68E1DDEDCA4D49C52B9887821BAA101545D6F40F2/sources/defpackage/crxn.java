package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
/* compiled from: PG */
/* renamed from: crxn  reason: default package */
/* loaded from: classes5.dex */
public final class crxn extends crxh<crts> implements crxj<crts> {
    public final Uri k;
    public final crts l;
    @dzsi
    public String m;
    @dzsi
    crvw n;
    protected boolean o;
    public final crwl p;
    public final int q;
    private final Uri r;
    private final crxu s;
    @dzsi
    private final crxv t;
    private dars u;
    @dzsi
    private crwo v;
    private boolean w;
    private crxi x;
    private final duiw y;

    public crxn(crxg crxgVar, crwz crwzVar, crxu crxuVar, crxv crxvVar, duiw duiwVar, crwl crwlVar) {
        super(dtbh.NEW_UPLOAD, crxgVar);
        this.w = true;
        this.r = crwzVar.c();
        this.k = crwzVar.c();
        this.l = crwzVar.b();
        this.s = crxuVar;
        this.t = crxvVar;
        this.y = duiwVar;
        this.p = crwlVar;
        this.q = crwzVar.e();
        this.g.n(crwzVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0.c == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean p() {
        /*
            r8 = this;
            crxk r0 = r8.f
            crwb r0 = r0.b()
            boolean r0 = r0.u
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L61
            crts r0 = r8.l
            crtp r0 = r0.n
            if (r0 != 0) goto L14
            crtp r0 = defpackage.crtp.d
        L14:
            int r0 = r0.b
            int r0 = defpackage.crto.a(r0)
            if (r0 != 0) goto L1d
            r0 = 1
        L1d:
            if (r0 == r2) goto L61
            r3 = 2
            if (r0 != r3) goto L2f
            crts r0 = r8.l
            crtp r0 = r0.n
            if (r0 != 0) goto L2a
            crtp r0 = defpackage.crtp.d
        L2a:
            int r0 = r0.c
            if (r0 != 0) goto L2f
            goto L61
        L2f:
            crxv r0 = r8.t
            if (r0 == 0) goto L60
            crwo r0 = r8.v
            if (r0 != 0) goto L45
            crwl r0 = r8.p
            crxb r2 = r8.a
            java.lang.String r2 = r2.a()
            crwo r0 = r0.a(r2)
            r8.v = r0
        L45:
            crwo r0 = r8.v
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.y()
            if (r0 == 0) goto L60
            crwl r2 = r8.p
            r2.h(r0)
            crxv r2 = r8.t
            defpackage.dbsk.s(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            defpackage.crxv.a(r0)
        L60:
            return r1
        L61:
            crvs r0 = r8.g
            crvq r0 = r0.a
            r3 = 42
            r0.c(r3)
            crwl r0 = r8.p
            java.lang.String r3 = r8.e()
            crxv r4 = r8.t
            crwo r3 = r0.a(r3)
            if (r3 != 0) goto L79
            goto La3
        L79:
            java.lang.Object r5 = defpackage.crwl.a
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r0.f()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L84
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            goto L94
        L84:
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = r3.c()     // Catch: java.lang.Throwable -> La4
            r6[r1] = r7     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "upload_tasks"
            java.lang.String r7 = "gpu_media_id = ?"
            r0.delete(r1, r7, r6)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
        L94:
            java.lang.String r0 = r3.y()
            if (r4 == 0) goto La3
            if (r0 == 0) goto La3
            android.net.Uri r0 = android.net.Uri.parse(r0)
            defpackage.crxv.a(r0)
        La3:
            return r2
        La4:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxn.p():boolean");
    }

    @dzsi
    private final davp q() {
        davp davpVar;
        List<davp> list;
        String z;
        try {
            z = this.v.z();
            if (z == null) {
                z = crxw.a(this.s.d(this.k));
            }
        } catch (crxr unused) {
            this.k.toString();
            davpVar = null;
        } catch (IOException unused2) {
            throw new crxr(crtx.FAILED, dgpm.UPLOAD_FILENAME_IO_EXCEPTION);
        } catch (SecurityException unused3) {
            throw new crxr(crtx.FAILED, dgpm.UPLOAD_FILE_ACCESS_SECURITY_EXCEPTION);
        }
        if (z == null) {
            this.k.toString();
            throw new crxr(dgpm.ARGUMENT_PARSE_FAILURE);
        }
        davpVar = crxo.a(this.a, this.l, this.q == 3);
        davpVar.sha1 = z;
        if (davpVar == null) {
            return null;
        }
        int m = m();
        int i = 0;
        while (!h()) {
            if (!this.h.a()) {
                k(dgpm.CONNECTION_FAILURE, null);
            } else {
                try {
                    crvv crvvVar = this.e;
                    String str = this.i;
                    dbsk.s(str);
                    crxb crxbVar = this.a;
                    crts crtsVar = this.l;
                    dasy dathVar = new dath();
                    davn a = crvvVar.a(dathVar, str);
                    davu d = crxo.d(crxbVar, dcdc.f(davpVar));
                    try {
                        dathVar.d(d);
                        davv e = a.e().a(d).e();
                        new dath().d(e);
                        if (!crvv.c(e)) {
                            dtbh dtbhVar = dtbh.NEW_UPLOAD;
                            dgpm dgpmVar = dgpm.IMPORT_INVALID_RESPONSE_FAILURE;
                            crtt bZ = crua.o.bZ();
                            crtx crtxVar = crtx.FAILED;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            crua cruaVar = (crua) bZ.b;
                            cruaVar.e = crtxVar.l;
                            int i2 = cruaVar.a | 8;
                            cruaVar.a = i2;
                            crtsVar.getClass();
                            cruaVar.d = crtsVar;
                            cruaVar.a = i2 | 4;
                            crvvVar.d(crxbVar, dtbhVar, dgpmVar, bZ.bK(), null);
                            return null;
                        } else if (dgpw.b(e.status) != dgpw.OK || (list = e.importedPhotos) == null || list.size() != 1) {
                            if (dgpw.b(e.status) == dgpw.PS_DUPLICATE_PHOTO) {
                                throw new crxr(crtx.FAILED, dgpw.b(e.status));
                            }
                            crvs b = crvvVar.a.b(crxbVar, dtbh.NEW_UPLOAD);
                            b.n(crtsVar);
                            b.f(dgpw.b(e.status), null);
                            return null;
                        } else {
                            crvs b2 = crvvVar.a.b(crxbVar, dtbh.NEW_UPLOAD);
                            b2.n(crtsVar);
                            b2.g(crxbVar.c());
                            return e.importedPhotos.get(0);
                        }
                    } catch (IOException e2) {
                        dtbh dtbhVar2 = dtbh.NEW_UPLOAD;
                        dgpm dgpmVar2 = dgpm.IMPORT_IO_EXCEPTION;
                        crtt bZ2 = crua.o.bZ();
                        crtx crtxVar2 = crtx.TRANSIENT_ERROR;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        crua cruaVar2 = (crua) bZ2.b;
                        cruaVar2.e = crtxVar2.l;
                        cruaVar2.a |= 8;
                        crvvVar.d(crxbVar, dtbhVar2, dgpmVar2, bZ2.bK(), e2);
                        throw new crxr(crtx.FAILED, dgpm.IMPORT_IO_EXCEPTION);
                    }
                } catch (UnknownHostException e3) {
                    k(dgpm.CONNECTION_FAILURE, e3);
                } catch (IOException e4) {
                    k(dgpm.IMPORT_IO_EXCEPTION, e4);
                }
            }
            if (!h()) {
                try {
                    Thread.sleep(l(i));
                    i++;
                    if (i >= m) {
                        throw new crxr(crtx.TRANSIENT_ERROR);
                    }
                } catch (InterruptedException unused4) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                throw new InterruptedIOException();
            }
        }
        throw new InterruptedIOException();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(boolean r12, defpackage.davp r13) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxn.r(boolean, davp):void");
    }

    private final void s(crtx crtxVar) {
        InputStream inputStream;
        try {
            dars darsVar = this.u;
            if (darsVar != null && (inputStream = ((crxs) darsVar).a) != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        this.f.a(this, crtxVar);
    }

    private final void t(crxr crxrVar) {
        crtt a = a();
        crtx crtxVar = crxrVar.a;
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar = (crua) a.b;
        crua cruaVar2 = crua.o;
        cruaVar.e = crtxVar.l;
        cruaVar.a |= 8;
        cruc a2 = crxrVar.a();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar3 = (crua) a.b;
        cruaVar3.n = a2.q;
        cruaVar3.a |= 2048;
        Sv(a.bK());
    }

    @Override // defpackage.crxh
    protected final crtt a() {
        crtt a = super.a();
        String uri = this.k.toString();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar = (crua) a.b;
        crua cruaVar2 = crua.o;
        uri.getClass();
        int i = cruaVar.a | 2;
        cruaVar.a = i;
        cruaVar.c = uri;
        crts crtsVar = this.l;
        crtsVar.getClass();
        cruaVar.d = crtsVar;
        cruaVar.a = i | 4;
        return a;
    }

    @Override // defpackage.crxh, defpackage.crxl
    public final /* bridge */ /* synthetic */ Object b() {
        return this.l;
    }

    @Override // defpackage.crxj
    public final synchronized void d(boolean z) {
        int i = this.j;
        if (this.w) {
            this.o = z;
            int i2 = i - 1;
            dgpw dgpwVar = dgpw.OK;
            if (i != 0) {
                if (i2 == 0) {
                    this.j = 3;
                    this.g.a.c(51);
                } else if (i2 == 1) {
                    this.j = 3;
                    this.g.a.c(48);
                }
                crvw crvwVar = this.n;
                if (crvwVar != null && i != 1) {
                    crvwVar.b();
                }
            } else {
                throw null;
            }
        }
        try {
            dars darsVar = this.u;
            if (darsVar != null && i != 1) {
                ((crxs) darsVar).a.close();
            }
        } catch (IOException unused) {
        }
        if (this.w) {
            if (z && !p()) {
                crwl crwlVar = this.p;
                String e = e();
                crtx crtxVar = crtx.CANCELLED;
                synchronized (crwl.a) {
                    SQLiteDatabase f = crwlVar.f();
                    if (f != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_status", Integer.valueOf(crtxVar.l));
                        if (crtxVar == crtx.CANCELLED) {
                            contentValues.put("completion_time", Long.valueOf(new Date().getTime()));
                        }
                        f.update("upload_tasks", contentValues, "gpu_media_id = ?", new String[]{e});
                    }
                }
            }
            this.w = false;
        }
        if (i == 1) {
            if (this.o) {
                this.g.m(true);
                Sv(Su(crtx.CANCELLED));
                return;
            }
            this.g.d(0L);
            crxr crxrVar = new crxr(crtx.TRANSIENT_ERROR);
            this.p.i(e(), crtx.TRANSIENT_ERROR, crxrVar.a());
            t(crxrVar);
        }
    }

    public final boolean equals(@dzsi Object obj) {
        crxn crxnVar;
        return (obj instanceof crxn) && (crxnVar = (crxn) obj) != null && this.k.equals(crxnVar.k) && this.l.equals(crxnVar.l);
    }

    @Override // defpackage.crxj
    public final boolean h() {
        return this.j == 3;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.crxh
    protected final dbsb j() {
        dbsb j = super.j();
        j.b("PhotoUri", this.k);
        return j;
    }

    @Override // defpackage.crxh
    protected final void n() {
        if (!this.o) {
            crwl crwlVar = this.p;
            String e = e();
            crwo crwoVar = this.v;
            dbsk.s(crwoVar);
            int D = crwoVar.D();
            synchronized (crwl.a) {
                SQLiteDatabase f = crwlVar.f();
                if (f != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("attempt_count", Integer.valueOf(D));
                    f.update("upload_tasks", contentValues, "gpu_media_id = ?", new String[]{e});
                }
            }
        }
        if (this.o) {
            super.n();
            return;
        }
        crvs crvsVar = this.g;
        crxi crxiVar = this.x;
        crvsVar.d(crxiVar != null ? crxiVar.b() : 0L);
        crxr crxrVar = new crxr(crtx.TRANSIENT_ERROR);
        this.p.i(e(), crtx.TRANSIENT_ERROR, crxrVar.a());
        t(crxrVar);
        s(crtx.TRANSIENT_ERROR);
    }

    @Override // defpackage.crxh
    protected final void o(crxr crxrVar) {
        if (!h()) {
            if (crxrVar.a == crtx.FAILED) {
                if (!p()) {
                    this.p.i(e(), crtx.FAILED, crxrVar.a());
                }
                int i = this.f.b().i;
                crwo crwoVar = this.v;
                dbsk.s(crwoVar);
                if (i <= crwoVar.D()) {
                    this.g.a.c(47);
                } else {
                    this.g.j();
                }
            } else {
                this.p.i(e(), crtx.TRANSIENT_ERROR, crxrVar.a());
            }
            t(crxrVar);
            s(crxrVar.a);
            return;
        }
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r6 >= ((java.lang.System.currentTimeMillis() - r4) / 1000)) goto L29;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxn.run():void");
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String e = e();
        String valueOf = String.valueOf(this.k);
        String valueOf2 = String.valueOf(this.l);
        int length = String.valueOf(simpleName).length();
        int length2 = String.valueOf(e).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(simpleName);
        sb.append("[RequestId: ");
        sb.append(e);
        sb.append(", Uri: ");
        sb.append(valueOf);
        sb.append(", UploadOption: ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
