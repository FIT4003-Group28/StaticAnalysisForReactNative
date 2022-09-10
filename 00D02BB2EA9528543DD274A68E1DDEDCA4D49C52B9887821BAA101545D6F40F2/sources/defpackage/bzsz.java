package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzsz  reason: default package */
/* loaded from: classes4.dex */
public final class bzsz implements bztp {
    public static final dcqe a = dcqe.c("bzsz");
    public final Application b;
    public final ckcw c;
    public final Executor d;
    public final bzsa e;
    private final btvo f;
    private final bzsr g;

    public bzsz(Application application, ckcw ckcwVar, btvo btvoVar, Executor executor, afec afecVar, bzsa bzsaVar) {
        this.b = application;
        this.c = ckcwVar;
        this.f = btvoVar;
        this.g = new bzsr(application, afecVar);
        this.d = dehx.b(executor);
        this.e = bzsaVar;
    }

    private static int l(SQLiteDatabase sQLiteDatabase, Collection<String> collection) {
        bvrj.UI_THREAD.d();
        int delete = sQLiteDatabase.delete("photos_top_feature", bzsx.b(collection), null);
        sQLiteDatabase.delete("photos_image_labels", bzsx.b(collection), null);
        return delete;
    }

    private final void m(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ((ckco) this.c.a(ckdz.I)).a(i - 1);
        }
    }

    @Override // defpackage.bztp
    public final Boolean a() {
        dvlp dvlpVar = this.f.getPhotoTakenNotificationParameters().j;
        if (dvlpVar == null) {
            dvlpVar = dvlp.f;
        }
        return Boolean.valueOf(dvlpVar.a);
    }

    @Override // defpackage.bztp
    public final dehn<List<bztl>> b(final Iterable<bztm> iterable) {
        final deig d = deig.d();
        this.d.execute(new Runnable(this, d, iterable) { // from class: bzsj
            private final bzsz a;
            private final deig b;
            private final Iterable c;

            {
                this.a = this;
                this.b = d;
                this.c = iterable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bzsz bzszVar = this.a;
                deig deigVar = this.b;
                Iterable<bztm> iterable2 = this.c;
                try {
                    SQLiteDatabase h = bzszVar.h();
                    deigVar.j(bzszVar.d(h, iterable2, true, true));
                    if (h == null) {
                        return;
                    }
                    h.close();
                } catch (bvjv unused) {
                    deigVar.j(dcdc.e());
                }
            }
        });
        return d;
    }

    @Override // defpackage.bztp
    public final dehn<List<bztl>> c(bztm... bztmVarArr) {
        return b(Arrays.asList(bztmVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.bztl> d(android.database.sqlite.SQLiteDatabase r28, java.lang.Iterable<defpackage.bztm> r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzsz.d(android.database.sqlite.SQLiteDatabase, java.lang.Iterable, boolean, boolean):java.util.List");
    }

    @Override // defpackage.bztp
    public final dehn<Integer> e(final List<Uri> list, bzto bztoVar, bzto... bztoVarArr) {
        final dcbg j = dcbg.j(bztoVar, bztoVarArr);
        if (dcft.w(j)) {
            return deha.a(0);
        }
        final deig d = deig.d();
        this.d.execute(new Runnable(this, d, list, j) { // from class: bzsn
            private final bzsz a;
            private final deig b;
            private final List c;
            private final Iterable d;

            {
                this.a = this;
                this.b = d;
                this.c = list;
                this.d = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int update;
                bzsz bzszVar = this.a;
                deig deigVar = this.b;
                List list2 = this.c;
                Iterable<bzto> iterable = this.d;
                try {
                    SQLiteDatabase h = bzszVar.h();
                    bvrj.UI_THREAD.d();
                    if (!bzszVar.a().booleanValue()) {
                        update = 0;
                    } else {
                        ContentValues contentValues = new ContentValues();
                        for (bzto bztoVar2 : iterable) {
                            contentValues.putAll(bztoVar2.a());
                        }
                        update = h.update("photos_top_feature", contentValues, bzsx.b(list2), null);
                    }
                    deigVar.j(Integer.valueOf(update));
                    if (h == null) {
                        return;
                    }
                    h.close();
                } catch (bvjv unused) {
                    deigVar.j(0);
                }
            }
        });
        return d;
    }

    @Override // defpackage.bztp
    public final dehn<Iterable<Uri>> f(final Iterable<eape> iterable) {
        final deig d = deig.d();
        this.d.execute(new Runnable(this, d, iterable) { // from class: bzsk
            private final bzsz a;
            private final deig b;
            private final Iterable c;

            {
                this.a = this;
                this.b = d;
                this.c = iterable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractCollection c;
                bzsz bzszVar = this.a;
                deig deigVar = this.b;
                Iterable iterable2 = this.c;
                try {
                    SQLiteDatabase h = bzszVar.h();
                    char c2 = 0;
                    dcep B = dcbg.b(bzszVar.j(h, new bztm[0])).s(bzsl.a).B();
                    Application application = bzszVar.b;
                    dcep B2 = dcbg.b(iterable2).s(bztz.a).B();
                    String str = null;
                    String format = B2.isEmpty() ? null : String.format(Locale.US, "(%s)", dbrz.e(" OR ").g(B2));
                    dcep B3 = dcbg.b(B).s(bzua.a).o(bzub.a).s(bzuc.a).B();
                    if (!B3.isEmpty()) {
                        str = String.format(Locale.US, "(%s NOT IN (%s))", "_id", dbrz.e(",").g(B3));
                    }
                    String i = dbrz.e(" AND ").j().i(bzud.b, bzud.a, str, String.format(Locale.US, "(%s > ?)", "_id"), format, bzud.c);
                    dcen N = dcep.N();
                    btop h2 = btoq.h();
                    h2.b("_id", "media_type");
                    h2.c(i);
                    h2.e("_id ASC LIMIT 500");
                    btoq a2 = h2.a();
                    long j = -1;
                    while (true) {
                        try {
                            Uri contentUri = MediaStore.Files.getContentUri("external");
                            String[] strArr = new String[1];
                            strArr[c2] = Long.toString(j);
                            btop g = a2.g();
                            g.d(strArr);
                            btou btouVar = new btou(application, contentUri, g.a());
                            try {
                                int i2 = btouVar.i();
                                btor<Long> c3 = btouVar.c("_id");
                                btor<Integer> b = btouVar.b("media_type");
                                Iterator<btos> it = btouVar.iterator();
                                while (it.hasNext()) {
                                    btos next = it.next();
                                    long longValue = ((Long) next.a(c3).b()).longValue();
                                    String l = Long.toString(longValue);
                                    int intValue = ((Integer) next.a(b).b()).intValue();
                                    if (intValue == 1) {
                                        N.b(Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, l));
                                    } else if (intValue == 3) {
                                        N.b(Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, l));
                                    }
                                    j = longValue;
                                }
                                btouVar.close();
                                if (i2 != 500) {
                                    break;
                                }
                                c2 = 0;
                            } catch (Throwable th) {
                                try {
                                    btouVar.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                                throw th;
                            }
                        } catch (btnx unused) {
                            c = dcnm.c();
                        }
                    }
                    c = N.f();
                    deigVar.j(c);
                    if (h == null) {
                        return;
                    }
                    h.close();
                } catch (bvjv unused2) {
                    deigVar.j(dcnm.c());
                }
            }
        });
        return d;
    }

    @Override // defpackage.bztp
    public final bztn g() {
        return new bzst();
    }

    public final synchronized SQLiteDatabase h() {
        return this.g.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ff, code lost:
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
        r0 = (r14 + r15) + r12;
        java.util.Locale.getDefault();
        r11.b();
        ((defpackage.ckcp) r19.c.a(defpackage.ckdz.J)).a(r0);
        ((defpackage.ckcp) r19.c.a(defpackage.ckdz.E)).a(r13.size() - r0);
        m(2, r14);
        m(3, r15);
        m(4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0138, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.database.sqlite.SQLiteDatabase r20) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzsz.i(android.database.sqlite.SQLiteDatabase):void");
    }

    public final List<bztl> j(SQLiteDatabase sQLiteDatabase, bztm... bztmVarArr) {
        return d(sQLiteDatabase, Arrays.asList(bztmVarArr), false, false);
    }

    @Override // defpackage.bztp
    public final void k() {
    }
}
