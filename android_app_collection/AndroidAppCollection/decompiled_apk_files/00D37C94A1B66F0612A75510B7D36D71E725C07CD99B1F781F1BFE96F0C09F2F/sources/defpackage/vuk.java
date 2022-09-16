package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.OutputStream;
import java.util.Date;
/* compiled from: PG */
/* renamed from: vuk  reason: default package */
/* loaded from: classes4.dex */
public final class vuk extends Thread {
    public volatile Exception a;
    private final Context b;
    private final OutputStream c;
    private final Uri d;
    private final long e;
    private final Uri f;
    private final long g;
    private final float h;
    private final long i;
    private final long j;
    private final boolean k;
    private final vrc l;

    public vuk(Context context, OutputStream outputStream, Uri uri, long j, Uri uri2, long j2, float f, long j3, long j4, boolean z, vrc vrcVar) {
        aqxo.p(j3 >= 0);
        context.getClass();
        this.b = context;
        this.c = outputStream;
        this.d = uri;
        this.e = j;
        uri2.getClass();
        this.f = uri2;
        this.g = j2;
        this.h = f;
        this.j = j3;
        this.i = j4;
        this.k = z;
        this.l = vrcVar;
    }

    private static oui a(Context context, Uri uri, boolean z, int i) {
        if (z) {
            return new oxx(uri, new pbq(context, pcx.l(context, "AudioMPEG")), new pbo(65536), i, new oxq[0]);
        }
        return new otf(context, uri);
    }

    private static vri b(oui ouiVar, vrf vrfVar) {
        vri vriVar = new vri(ouiVar);
        vriVar.a = vrfVar;
        return vriVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Date date = new Date(0L);
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        otb b = osz.b();
        otb b2 = osz.b();
        vui vuiVar = new vui(b, b2, myLooper);
        b.e(new vuj(this, b2, b, myLooper, 1));
        b2.e(new vuj(this, b, b2, myLooper));
        vre vreVar = new vre(new vra(new vrh(this.c, date, vuiVar)), this.j, this.l);
        Uri uri = this.d;
        if (uri != null) {
            b.g(b(a(this.b, uri, this.k, 16777216), vreVar.b(this.e, 1.0f - this.h, Long.MAX_VALUE)));
            b.l(true);
        }
        vri b3 = b(a(this.b, this.f, this.k, 1310720), vreVar.b(this.g, this.h, this.i));
        vreVar.a = vrd.STARTED;
        b2.g(b3);
        b2.l(true);
        Looper.loop();
    }
}
