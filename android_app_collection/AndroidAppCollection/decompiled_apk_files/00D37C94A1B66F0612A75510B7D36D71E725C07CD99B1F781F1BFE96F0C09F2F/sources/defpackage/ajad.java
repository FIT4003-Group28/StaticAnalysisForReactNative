package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: ajad  reason: default package */
/* loaded from: classes.dex */
public final class ajad implements aizo {
    private static final SparseIntArray e;
    public final azpa a;
    public iz b;
    public jc c;
    public aoce d;
    private final Context f;
    private final Handler g;
    private final azqb h;
    private final aizp i;
    private final azqb j;
    private final azqb k;
    private final ajae l;
    private final int m;
    private final Runnable n;
    private final Runnable o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(2, 3);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(5, 6);
        sparseIntArray.put(6, 6);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(8, 7);
        sparseIntArray.put(9, 3);
        sparseIntArray.put(10, 2);
    }

    public ajad(Context context, Handler handler, azqb azqbVar, aizp aizpVar, azqb azqbVar2, ajae ajaeVar) {
        ajab ajabVar = new ajab(context);
        this.n = new ajaa(this, 1);
        this.o = new ajaa(this);
        this.f = context;
        handler.getClass();
        this.g = handler;
        azqbVar.getClass();
        this.h = azqbVar;
        aizpVar.getClass();
        this.i = aizpVar;
        this.k = ajabVar;
        this.j = azqbVar2;
        ajaeVar.getClass();
        this.l = ajaeVar;
        this.a = azpa.as(ajac.STOPPED);
        this.m = Build.VERSION.SDK_INT >= 30 ? 0 : 8;
    }

    public static void b(iz izVar) {
        izVar.h(null);
    }

    private final iz g() {
        iz izVar = this.b;
        if (izVar == null) {
            aijb.a(aija.MEDIASESSION, "MediaSession created", new Object[0]);
            iz izVar2 = (iz) this.k.get();
            this.b = izVar2;
            izVar2.b.q();
            izVar2.f((is) this.h.get());
            jc h = h();
            h.c(0, 0L, 1.0f);
            h.b = this.l.b();
            izVar2.i(h.a());
            izVar2.l();
            return izVar2;
        }
        return izVar;
    }

    private final jc h() {
        jc jcVar = new jc();
        amzt listIterator = ((amuk) this.l.a()).listIterator();
        while (listIterator.hasNext()) {
            aizz aizzVar = (aizz) listIterator.next();
            if (aizzVar.e()) {
                jd jdVar = new jd(aizzVar.d(), this.f.getString(aizzVar.b()), aizzVar.a());
                Bundle c = aizzVar.c();
                if (c != null) {
                    jdVar.d = c;
                }
                jcVar.a.add(new PlaybackStateCompat.CustomAction(jdVar.a, jdVar.b, jdVar.c, jdVar.d));
            }
        }
        Bundle f = this.l.f();
        f.putInt("android.media.session.extra.LEGACY_STREAM_TYPE", this.i.q == orw.AUDIO_ROUTE_ALARM ? 4 : 3);
        jcVar.f = f;
        return jcVar;
    }

    private final aoce i() {
        String charSequence = this.i.m.toString();
        aoce aoceVar = new aoce();
        aoceVar.m("android.media.metadata.ARTIST", charSequence);
        aoceVar.m("android.media.metadata.ALBUM_ARTIST", charSequence);
        aoceVar.m("android.media.metadata.TITLE", this.i.l.toString());
        aoceVar.l("android.media.metadata.DURATION", this.i.g);
        aoceVar.l("com.google.android.youtube.MEDIA_METADATA_VIDEO_HEIGHT_PX", this.i.i);
        aoceVar.l("com.google.android.youtube.MEDIA_METADATA_VIDEO_WIDTH_PX", this.i.j);
        if (this.i.n.length() != 0) {
            aoceVar.m("android.media.metadata.ALBUM", this.i.n.toString());
        }
        Bitmap bitmap = this.i.o;
        if (bitmap != null) {
            aoceVar.k("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.l.g();
        return aoceVar;
    }

    public final iz a() {
        ylr.c();
        return g();
    }

    public final void c() {
        this.i.c(this);
        amzt listIterator = ((amuk) this.l.a()).listIterator();
        while (listIterator.hasNext()) {
            ((aizz) listIterator.next()).f();
        }
    }

    public final void e() {
        iz izVar = this.b;
        if (izVar == null) {
            izVar = g();
        }
        if (izVar.k()) {
            return;
        }
        aijb.a(aija.MEDIASESSION, "MediaSession setActive(true)", new Object[0]);
        izVar.j((PendingIntent) this.j.get());
        izVar.e(true);
        izVar.h(i().j());
        this.a.c(ajac.STARTED);
    }

    public final void f(boolean z) {
        iz izVar = this.b;
        if (izVar == null) {
            return;
        }
        aijb.a(aija.MEDIASESSION, "MediaSession setActive(false)", new Object[0]);
        this.d = null;
        this.c = null;
        izVar.e(false);
        jc h = h();
        h.c(1, 0L, 1.0f);
        h.b = this.l.d();
        izVar.i(h.a());
        if (z) {
            b(izVar);
        }
        this.a.c(ajac.STOPPED);
    }

    @Override // defpackage.aizo
    public final void d(int i) {
        iz izVar = this.b;
        long j = 0;
        if (izVar != null && (64791 & i) != 0) {
            if (i == 16) {
                aizp aizpVar = this.i;
                if (izVar.c.c() == null || Math.abs(aizpVar.h - izVar.c.c().b) > 2000) {
                    i = 16;
                } else {
                    i = 16;
                }
            }
            aizp aizpVar2 = this.i;
            long j2 = true != aizpVar2.e ? 0L : 6L;
            if (aizpVar2.c) {
                j2 |= 16;
            }
            if (aizpVar2.d) {
                j2 |= 32;
            }
            if (aizpVar2.f) {
                j2 |= 256;
            }
            int i2 = e.get(this.i.b, this.m);
            jc h = h();
            aizp aizpVar3 = this.i;
            h.c(i2, aizpVar3.h, aizpVar3.k);
            h.b = this.l.c(j2);
            this.l.e();
            h.e = -1L;
            this.c = h;
            if (h != null) {
                this.g.removeCallbacks(this.o);
                this.o.run();
            }
        }
        if (this.b == null || (66280 & i) == 0) {
            return;
        }
        if (this.i.o == null && (i & 64) != 0) {
            j = 500;
        }
        this.g.removeCallbacks(this.n);
        this.d = i();
        this.g.postDelayed(this.n, j);
    }
}
