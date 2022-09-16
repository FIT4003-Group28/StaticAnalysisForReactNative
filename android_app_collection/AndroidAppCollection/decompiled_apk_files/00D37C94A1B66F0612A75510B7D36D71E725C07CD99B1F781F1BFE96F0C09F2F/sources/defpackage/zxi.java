package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zxi  reason: default package */
/* loaded from: classes4.dex */
public final class zxi implements aldj, vrc {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private final Context b;
    private final aldd c;
    private final vqr d;
    private final aldi e;
    private long f = -1;
    private final String g;
    private final aacz h;

    public zxi(int i, Uri uri, Context context, aacz aaczVar, akze akzeVar, aldi aldiVar, alco alcoVar) {
        uri.getClass();
        this.b = context;
        this.h = aaczVar;
        this.e = aldiVar;
        aqxo.p("goog-edited-video".equals(uri.getScheme()));
        Uri parse = Uri.parse(uri.getQueryParameter("videoFileUri"));
        this.g = uri.getQueryParameter("videoEffectsStateFilePath");
        try {
            vry a2 = vrz.a();
            a2.c(false);
            a2.b(true);
            VideoMetaData b = vsa.b(context, parse, a2.a());
            vqq vqqVar = new vqq();
            vqqVar.a = b;
            vqr a3 = vqqVar.a();
            this.d = a3;
            aqxo.p("goog-edited-video".equals(uri.getScheme()));
            String queryParameter = uri.getQueryParameter("trimStartUs");
            String queryParameter2 = uri.getQueryParameter("trimEndUs");
            if (queryParameter != null && queryParameter2 != null) {
                a3.D(Long.parseLong(queryParameter));
                a3.C(Long.parseLong(queryParameter2));
            }
            String queryParameter3 = uri.getQueryParameter("filter");
            if (queryParameter3 != null) {
                a3.B(queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("muted");
            if (queryParameter4 != null) {
                a3.v(Boolean.parseBoolean(queryParameter4));
            }
            String queryParameter5 = uri.getQueryParameter("audioSwapSourceUri");
            if (queryParameter5 != null) {
                a3.x(Uri.parse(queryParameter5));
                a3.y(Float.parseFloat(uri.getQueryParameter("audioSwapVolume")));
                a3.w(Long.parseLong(uri.getQueryParameter("audioSwapOffsetUs")));
                String queryParameter6 = uri.getQueryParameter("audioSwapDurationUs");
                if (queryParameter6 != null && !queryParameter6.isEmpty()) {
                    long parseLong = Long.parseLong(queryParameter6);
                    EditableVideoEdits editableVideoEdits = a3.a;
                    if (editableVideoEdits.k != parseLong) {
                        editableVideoEdits.k = parseLong;
                        a3.t(7);
                    }
                }
            }
            String queryParameter7 = uri.getQueryParameter("cropTop");
            String queryParameter8 = uri.getQueryParameter("cropBottom");
            String queryParameter9 = uri.getQueryParameter("cropLeft");
            String queryParameter10 = uri.getQueryParameter("cropRight");
            double d = 0.0d;
            a3.A(queryParameter7 == null ? 0.0d : Double.parseDouble(queryParameter7), queryParameter8 == null ? 0.0d : Double.parseDouble(queryParameter8));
            double parseDouble = queryParameter9 == null ? 0.0d : Double.parseDouble(queryParameter9);
            if (queryParameter10 != null) {
                d = Double.parseDouble(queryParameter10);
            }
            a3.z(parseDouble, d);
            this.c = aldd.a(i, parse, context, akzeVar);
        } catch (IOException e) {
            zep.d("Unable to re-create the previously serialized EditableVideo", e);
            throw new FileNotFoundException("Unable to render video");
        }
    }

    public static Uri.Builder c(String str) {
        return new Uri.Builder().scheme("goog-edited-video").authority("generated").appendQueryParameter("videoFileUri", str);
    }

    public static Uri d(vqr vqrVar) {
        return e(vqrVar, vqrVar.b.a);
    }

    public static Uri e(vqr vqrVar, Uri uri) {
        vqrVar.getClass();
        uri.getClass();
        Uri.Builder c = c(uri.toString());
        i(vqrVar, c);
        return c.build();
    }

    public static Long h(Uri uri) {
        String queryParameter = uri.getQueryParameter("trimStartUs");
        String queryParameter2 = uri.getQueryParameter("trimEndUs");
        if (queryParameter == null || queryParameter2 == null) {
            return null;
        }
        return Long.valueOf((Long.parseLong(queryParameter2) - Long.parseLong(queryParameter)) / 1000);
    }

    public static void i(vqr vqrVar, Uri.Builder builder) {
        if (vqrVar.K()) {
            builder.appendQueryParameter("trimStartUs", Long.toString(vqrVar.n())).appendQueryParameter("trimEndUs", Long.toString(vqrVar.l()));
        }
        if (vqrVar.I()) {
            builder.appendQueryParameter("filter", vqrVar.p());
        }
        if (vqrVar.F()) {
            builder.appendQueryParameter("muted", Boolean.toString(vqrVar.F()));
        } else if (vqrVar.G()) {
            builder.appendQueryParameter("audioSwapSourceUri", vqrVar.o().toString()).appendQueryParameter("audioSwapVolume", Float.toString(vqrVar.e())).appendQueryParameter("audioSwapOffsetUs", Long.toString(vqrVar.g()));
        }
        if (vqrVar.H()) {
            builder.appendQueryParameter("cropTop", Double.toString(vqrVar.d())).appendQueryParameter("cropBottom", Double.toString(vqrVar.a())).appendQueryParameter("cropLeft", Double.toString(vqrVar.b())).appendQueryParameter("cropRight", Double.toString(vqrVar.c()));
        }
    }

    private final boolean m() {
        return this.d.G() || this.d.K() || this.d.F();
    }

    @Override // defpackage.vrc
    public final void a(double d) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e != null) {
            long j = this.f;
            if (j != -1 && Math.abs(j - currentTimeMillis) < 500) {
                return;
            }
            this.e.a(d);
            this.f = currentTimeMillis;
        }
    }

    @Override // defpackage.aldj
    public final Bitmap b(Point point) {
        if (!this.d.K()) {
            return this.c.b(point);
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        vrt vrtVar = new vrt();
        VideoMetaData videoMetaData = this.d.b;
        float k = videoMetaData.k();
        float j = videoMetaData.j();
        float min = Math.min(point.x / k, point.y / j);
        vvf vvfVar = new vvf(this.b, videoMetaData, (int) (k * min), (int) (j * min), priorityBlockingQueue, vrw.a, vrp.b, vrtVar);
        vvfVar.start();
        try {
            try {
                long j2 = a;
                if (vvfVar.a.await(j2, TimeUnit.MILLISECONDS)) {
                    if (vvfVar.b instanceof IOException) {
                        throw new IOException(vvfVar.b);
                    }
                    if (!(vvfVar.b instanceof vuz)) {
                        if (vvfVar.b != null) {
                            String valueOf = String.valueOf(vvfVar.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                            sb.append("Unexpected initialization exception ");
                            sb.append(valueOf);
                            throw new AssertionError(sb.toString());
                        }
                    } else {
                        throw new vuz(vvfVar.b);
                    }
                }
                long n = this.d.n();
                long l = this.d.l();
                VideoMetaData videoMetaData2 = this.d.b;
                int g = videoMetaData2.g(n);
                int c = videoMetaData2.c(n);
                if (c != -1 && videoMetaData2.l(c) <= l) {
                    g = c;
                }
                vvd vvdVar = new vvd(g);
                priorityBlockingQueue.add(vvdVar);
                vvdVar.c.await(j2, TimeUnit.MILLISECONDS);
                return vvdVar.d;
            } finally {
                vvfVar.a();
            }
        } catch (IOException | AssertionError | InterruptedException | vuz e) {
            zep.d("Error while extracting thumbnail", e);
            vvfVar.a();
            return null;
        }
    }

    @Override // defpackage.aldj
    public final aldh f(File file) {
        boolean z;
        vun g;
        asfs a2 = aadf.a(this.h);
        vul vulVar = new vul();
        if (!a2.s) {
            this.b.getApplicationContext();
            z = false;
        } else {
            z = true;
        }
        vulVar.a = z;
        if (!m()) {
            return this.c.f(file);
        }
        if (this.d.F()) {
            Context context = this.b;
            vqr vqrVar = this.d;
            g = new vun(context, null, vqrVar.b.a, vqrVar.n(), this.d.l(), null, 0.0f, 0L, null, vulVar, true, 0L);
        } else if (this.d.o() != null) {
            Context context2 = this.b;
            vqr vqrVar2 = this.d;
            g = new vun(context2, file, vqrVar2.b.a, vqrVar2.n(), this.d.l(), this.d.o(), this.d.e(), this.d.g(), this, vulVar, false, this.d.a.k);
        } else {
            Context context3 = this.b;
            vqr vqrVar3 = this.d;
            g = vun.g(context3, vqrVar3.b.a, vqrVar3.n(), this.d.l(), vulVar);
        }
        vuq vuqVar = new vuq(g.c());
        return new aldh(vuqVar, vuqVar.b);
    }

    @Override // defpackage.aldj
    public final void j() {
        this.c.j();
    }

    @Override // defpackage.aldj
    public final boolean k() {
        return !this.d.K() && !this.d.G();
    }

    @Override // defpackage.aldj
    public final boolean l() {
        return !m() && this.c.l();
    }

    @Override // defpackage.aldj
    public final avuy g(String str, String str2) {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        byte[] bArr = new byte[0];
        String str3 = this.g;
        if (str3 != null) {
            File file = new File(str3);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr2);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    zep.d("Error reading video effects state file", e);
                }
            }
        }
        String p = this.d.p();
        long k = this.d.k() - this.d.m();
        double d5 = this.d.d();
        double a2 = this.d.a();
        double b = this.d.b();
        double c = this.d.c();
        aqxo.p(d5 >= 0.0d);
        aqxo.p(a2 >= 0.0d);
        aqxo.p(b >= 0.0d);
        aqxo.p(c >= 0.0d);
        aqxo.p(d5 + a2 < 1.0d);
        aqxo.p(b + c < 1.0d);
        str.getClass();
        if (!FilterMapTable$FilterDescriptor.h(p) || !(bArr == null || bArr.length == 0)) {
            d = c;
            d2 = b;
            d3 = a2;
            d4 = d5;
            i = 1;
        } else {
            d = c;
            i = 1;
            d2 = b;
            d3 = a2;
            d4 = d5;
            if (!aafx.e(d5, a2, d2, d)) {
                aopa createBuilder = auok.a.createBuilder();
                createBuilder.copyOnWrite();
                auok auokVar = (auok) createBuilder.instance;
                auokVar.b |= 1;
                auokVar.c = str;
                auok auokVar2 = (auok) createBuilder.mo39build();
                aopa createBuilder2 = avuy.a.createBuilder();
                createBuilder2.copyOnWrite();
                avuy avuyVar = (avuy) createBuilder2.instance;
                auokVar2.getClass();
                avuyVar.c = auokVar2;
                avuyVar.b |= 1;
                return (avuy) createBuilder2.mo39build();
            }
        }
        aopa createBuilder3 = auok.a.createBuilder();
        createBuilder3.copyOnWrite();
        auok auokVar3 = (auok) createBuilder3.instance;
        auokVar3.b |= i;
        auokVar3.c = str;
        auok auokVar4 = (auok) createBuilder3.mo39build();
        aopa createBuilder4 = aqsd.a.createBuilder();
        createBuilder4.copyOnWrite();
        aqsd aqsdVar = (aqsd) createBuilder4.instance;
        auokVar4.getClass();
        aqsdVar.c = auokVar4;
        aqsdVar.b = 2;
        aqsd aqsdVar2 = (aqsd) createBuilder4.mo39build();
        aopa createBuilder5 = aqsc.a.createBuilder();
        createBuilder5.copyOnWrite();
        aqsc aqscVar = (aqsc) createBuilder5.instance;
        aqsdVar2.getClass();
        aqscVar.c = aqsdVar2;
        aqscVar.b |= i;
        createBuilder5.copyOnWrite();
        aqsc aqscVar2 = (aqsc) createBuilder5.instance;
        aqscVar2.d = i;
        aqscVar2.b |= 2;
        aopa createBuilder6 = aqse.a.createBuilder();
        createBuilder6.copyOnWrite();
        aqse aqseVar = (aqse) createBuilder6.instance;
        aqseVar.b |= i;
        aqseVar.c = 0;
        createBuilder6.copyOnWrite();
        aqse aqseVar2 = (aqse) createBuilder6.instance;
        aqseVar2.b |= 2;
        aqseVar2.d = (int) k;
        createBuilder5.copyOnWrite();
        aqsc aqscVar3 = (aqsc) createBuilder5.instance;
        aqse aqseVar3 = (aqse) createBuilder6.mo39build();
        aqseVar3.getClass();
        aqscVar3.e = aqseVar3;
        aqscVar3.b |= 8;
        aopa createBuilder7 = aqsb.a.createBuilder();
        createBuilder7.copyOnWrite();
        aqsb aqsbVar = (aqsb) createBuilder7.instance;
        aqsbVar.c = 13;
        aqsbVar.b |= i;
        aopa createBuilder8 = aqry.a.createBuilder();
        createBuilder8.copyOnWrite();
        aqry aqryVar = (aqry) createBuilder8.instance;
        aqryVar.b |= i;
        aqryVar.c = p;
        if (bArr != null) {
            aoob x = aoob.x(bArr);
            createBuilder8.copyOnWrite();
            aqry aqryVar2 = (aqry) createBuilder8.instance;
            aqryVar2.b |= 2;
            aqryVar2.d = x;
        }
        aopa createBuilder9 = aqsa.a.createBuilder();
        createBuilder9.copyOnWrite();
        aqsa aqsaVar = (aqsa) createBuilder9.instance;
        aqry aqryVar3 = (aqry) createBuilder8.mo39build();
        aqryVar3.getClass();
        aqsaVar.c = aqryVar3;
        aqsaVar.b = 2;
        createBuilder7.copyOnWrite();
        aqsb aqsbVar2 = (aqsb) createBuilder7.instance;
        aqsa aqsaVar2 = (aqsa) createBuilder9.mo39build();
        aqsaVar2.getClass();
        aqsbVar2.d = aqsaVar2;
        aqsbVar2.b |= 2;
        createBuilder5.copyOnWrite();
        ((aqsc) createBuilder5.instance).f = aqsc.emptyProtobufList();
        createBuilder5.copyOnWrite();
        aqsc aqscVar4 = (aqsc) createBuilder5.instance;
        aqsb aqsbVar3 = (aqsb) createBuilder7.mo39build();
        aqsbVar3.getClass();
        aopu aopuVar = aqscVar4.f;
        if (!aopuVar.c()) {
            aqscVar4.f = aopi.mutableCopy(aopuVar);
        }
        aqscVar4.f.add(aqsbVar3);
        if (aafx.e(d4, d3, d2, d)) {
            aopa createBuilder10 = aqrx.a.createBuilder();
            createBuilder10.copyOnWrite();
            aqrx aqrxVar = (aqrx) createBuilder10.instance;
            aqrxVar.b |= i;
            aqrxVar.c = d4;
            createBuilder10.copyOnWrite();
            aqrx aqrxVar2 = (aqrx) createBuilder10.instance;
            aqrxVar2.b |= 2;
            aqrxVar2.d = d3;
            createBuilder10.copyOnWrite();
            aqrx aqrxVar3 = (aqrx) createBuilder10.instance;
            aqrxVar3.b |= 4;
            aqrxVar3.e = d2;
            createBuilder10.copyOnWrite();
            aqrx aqrxVar4 = (aqrx) createBuilder10.instance;
            aqrxVar4.b |= 8;
            aqrxVar4.f = d;
            createBuilder5.copyOnWrite();
            aqsc aqscVar5 = (aqsc) createBuilder5.instance;
            aqrx aqrxVar5 = (aqrx) createBuilder10.mo39build();
            aqrxVar5.getClass();
            aqscVar5.g = aqrxVar5;
            aqscVar5.b |= 16;
        }
        aopa createBuilder11 = aqsf.a.createBuilder();
        createBuilder11.copyOnWrite();
        aqsf aqsfVar = (aqsf) createBuilder11.instance;
        aqsc aqscVar6 = (aqsc) createBuilder5.mo39build();
        aqscVar6.getClass();
        aqsfVar.a();
        aqsfVar.b.add(aqscVar6);
        aqsf aqsfVar2 = (aqsf) createBuilder11.mo39build();
        aopa createBuilder12 = avuy.a.createBuilder();
        createBuilder12.copyOnWrite();
        avuy avuyVar2 = (avuy) createBuilder12.instance;
        aqsfVar2.getClass();
        avuyVar2.d = aqsfVar2;
        avuyVar2.b |= 2;
        return (avuy) createBuilder12.mo39build();
    }
}
