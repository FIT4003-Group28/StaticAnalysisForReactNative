package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: arvh  reason: default package */
/* loaded from: classes2.dex */
public class arvh extends arxa {
    public dcdc<arye> a;
    public boolean b;
    @dzsi
    public arut c;
    @dzsi
    public mg d;
    @dzsi
    public cqtd e;
    @dzsi
    public jic f;
    @dzsi
    public arye g;
    final arus h;
    final mb i;
    private final Context j;
    private final cqss k;
    private final cqss l;
    private final aruu m;
    private final arvg n;
    private final arwz r;
    private final arxv s;
    private final aryc t;
    private final dxio<afha> u;
    @dzsi
    private MediaMetadataCompat v;
    @dzsi
    private PlaybackStateCompat w;

    public arvh(Context context, cqhn cqhnVar, aruv aruvVar, arxw arxwVar, aryc arycVar, arrh arrhVar, arve arveVar, dxio<afha> dxioVar, dehq dehqVar, dehq dehqVar2, cqkn<aryd> cqknVar, ResolveInfo resolveInfo, arwz arwzVar, cqss cqssVar, cqss cqssVar2) {
        super(context, arxf.UNKNOWN, cqhnVar, arrhVar, resolveInfo.serviceInfo.packageName, cqknVar, dehqVar, dehqVar2);
        this.h = new arvc(this);
        this.i = new arvd(this);
        this.b = true;
        this.j = context;
        this.k = cqssVar;
        this.l = cqssVar2;
        this.m = aruvVar.a(resolveInfo);
        this.r = arwzVar;
        this.n = new arvg(this);
        this.s = arxwVar.a(cqssVar);
        this.t = arycVar;
        this.a = dcdc.e();
        this.u = dxioVar;
    }

    @dzsi
    public static cqtd C(@dzsi Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new arva(new Object[]{bitmap}, bitmap);
    }

    @dzsi
    public static jic D(@dzsi String str) {
        ckqc ckqcVar;
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse((String) dcft.p(dbtm.c("\u001f").g(str), 0));
        if (!dsna.e(parse.toString()) && !"content".equals(parse.getScheme())) {
            return null;
        }
        String uri = parse.toString();
        if (dsna.e(parse.toString())) {
            ckqcVar = ckqc.FIFE;
        } else {
            ckqcVar = ckqc.FULLY_QUALIFIED;
        }
        return new jic(uri, ckqcVar, 0, 250);
    }

    private static Boolean ao(@dzsi PlaybackStateCompat playbackStateCompat) {
        boolean z = false;
        if (playbackStateCompat != null) {
            if (playbackStateCompat.a == 3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    private final synchronized boolean ap(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadataCompat mediaMetadataCompat2 = this.v;
        if (mediaMetadataCompat2 == null) {
            return true;
        }
        if (al() != arwz.SKIP_NEXT_PREVIOUS && al() != arwz.SELECT_NEW_BROWSE_ITEM) {
            return false;
        }
        return !mediaMetadataCompat2.equals(mediaMetadataCompat);
    }

    private final synchronized boolean aq(PlaybackStateCompat playbackStateCompat) {
        PlaybackStateCompat playbackStateCompat2 = this.w;
        if (playbackStateCompat2 == null) {
            return true;
        }
        arwz al = al();
        if (al == null) {
            return false;
        }
        int ordinal = al.ordinal();
        if (ordinal == 0) {
            return playbackStateCompat2.b != playbackStateCompat.b;
        } else if (ordinal == 1) {
            return playbackStateCompat2.a != playbackStateCompat.a;
        } else if (ordinal != 2) {
            return false;
        } else {
            return playbackStateCompat.a == 3;
        }
    }

    private final void ar(MediaMetadataCompat mediaMetadataCompat, PlaybackStateCompat playbackStateCompat) {
        this.s.a(playbackStateCompat.b, mediaMetadataCompat.b.getLong("android.media.metadata.DURATION", 0L), playbackStateCompat.d, ao(playbackStateCompat).booleanValue());
    }

    @Override // defpackage.aryd
    @dzsi
    public synchronized CharSequence A() {
        MediaMetadataCompat mediaMetadataCompat = this.v;
        if (mediaMetadataCompat != null) {
            return mediaMetadataCompat.a("android.media.metadata.ARTIST");
        }
        return null;
    }

    @Override // defpackage.aryd
    public aryi B() {
        return this.s;
    }

    public final void E(@dzsi MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            G();
            lq lqVar = this.m.c;
            if (lqVar != null) {
                arvl.a(lqVar, new arvb(this), 1);
            }
            cqkx.p(this);
            return;
        }
        if (ap(mediaMetadataCompat)) {
            super.an();
        }
        String a = mediaMetadataCompat.a("android.media.metadata.ART_URI");
        if (a == null) {
            a = mediaMetadataCompat.a("android.media.metadata.ALBUM_ART_URI");
        }
        this.f = D(a);
        Bitmap b = mediaMetadataCompat.b("android.media.metadata.ART");
        if (b == null) {
            b = mediaMetadataCompat.b("android.media.metadata.ALBUM_ART");
        }
        this.e = C(b);
        synchronized (this) {
            PlaybackStateCompat playbackStateCompat = this.w;
            if (playbackStateCompat != null) {
                ar(mediaMetadataCompat, playbackStateCompat);
            }
            this.v = mediaMetadataCompat;
        }
        cqkx.p(this);
    }

    public final void F(PlaybackStateCompat playbackStateCompat) {
        if (aq(playbackStateCompat)) {
            super.an();
        }
        synchronized (this) {
            MediaMetadataCompat mediaMetadataCompat = this.v;
            if (mediaMetadataCompat != null) {
                ar(mediaMetadataCompat, playbackStateCompat);
            }
            this.w = playbackStateCompat;
        }
        if (playbackStateCompat.a == 7) {
            aj(arwy.APP_ERROR);
        } else {
            ak(arwy.APP_ERROR, arwy.CONNECTED);
        }
        this.t.b(w(), j());
        cqkx.p(this);
    }

    public final synchronized void G() {
        this.e = null;
        this.f = null;
        this.v = null;
        this.w = null;
        this.g = null;
    }

    public final synchronized void H() {
        this.d = null;
    }

    @Override // defpackage.arxa
    public void a() {
        this.m.a(this.h);
    }

    @Override // defpackage.arxa
    public void b() {
        aj(arwy.DISCONNECTED);
        this.b = true;
        G();
        H();
        arut arutVar = this.c;
        if (arutVar != null) {
            mb mbVar = this.i;
            mi miVar = arutVar.a;
            if (mbVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (miVar.b.remove(mbVar) != null) {
                try {
                    mc mcVar = miVar.a;
                    ((me) mcVar).a.unregisterCallback(mbVar.a);
                    synchronized (((me) mcVar).b) {
                        if (((me) mcVar).e.b() != null) {
                            try {
                                md remove = ((me) mcVar).d.remove(mbVar);
                                if (remove != null) {
                                    mbVar.c = null;
                                    ((me) mcVar).e.b().b(remove);
                                }
                            } catch (RemoteException unused) {
                            }
                        } else {
                            ((me) mcVar).c.remove(mbVar);
                        }
                    }
                } finally {
                    mbVar.c(null);
                }
            }
            this.c = null;
        }
        this.m.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized void d() {
        mg mgVar = this.d;
        if (mgVar != null) {
            mgVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized void e() {
        mg mgVar = this.d;
        if (mgVar != null) {
            mgVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized void f() {
        mg mgVar = this.d;
        if (mgVar != null) {
            mgVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized void g() {
        mg mgVar = this.d;
        if (mgVar != null) {
            mgVar.f();
        }
    }

    @Override // defpackage.arxa
    protected final void h() {
        this.a = dcdc.e();
        this.b = true;
        lq lqVar = this.m.c;
        if (lqVar == null) {
            return;
        }
        arvl.a(lqVar, new aruz(this), 9);
    }

    @Override // defpackage.arxa
    protected final void i() {
        this.a = dcdc.e();
        this.b = true;
    }

    @Override // defpackage.aryd
    public synchronized Boolean j() {
        return ao(this.w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized boolean k() {
        PlaybackStateCompat playbackStateCompat = this.w;
        if (playbackStateCompat != null) {
            return (playbackStateCompat.e & 16) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized boolean l() {
        PlaybackStateCompat playbackStateCompat = this.w;
        if (playbackStateCompat != null) {
            return (playbackStateCompat.e & 32) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized boolean m() {
        PlaybackStateCompat playbackStateCompat = this.w;
        if (playbackStateCompat != null) {
            return (playbackStateCompat.e & 64) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized boolean n() {
        PlaybackStateCompat playbackStateCompat = this.w;
        if (playbackStateCompat != null) {
            return (playbackStateCompat.e & 8) != 0;
        }
        return false;
    }

    @Override // defpackage.arxa
    protected final arwz o() {
        return this.r;
    }

    @Override // defpackage.arxa
    protected final dcdc<arye> p() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.arxa
    @dzsi
    protected final arye q() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final synchronized boolean r() {
        return this.v != null;
    }

    @Override // defpackage.aryf
    public cqkl s() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(ag());
        intent.setFlags(268435456);
        String valueOf = String.valueOf(this.j.getPackageName());
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse(valueOf.length() != 0 ? "android-app://".concat(valueOf) : new String("android-app://")));
        this.u.a().f(this.j, intent, 1);
        return cqkl.a;
    }

    @Override // defpackage.aryf
    public Boolean t() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aryd
    public cqss u() {
        return this.k;
    }

    @Override // defpackage.arxa
    protected final cqss v() {
        return this.l;
    }

    @Override // defpackage.arxa
    public ddnk w() {
        return ddnk.NAVIGATION_MEDIA_INTEGRATION_PROVIDER_UNKNOWN;
    }

    @Override // defpackage.arxa
    @dzsi
    protected final synchronized CharSequence x() {
        MediaMetadataCompat mediaMetadataCompat = this.v;
        if (mediaMetadataCompat != null) {
            return mediaMetadataCompat.a("android.media.metadata.TITLE");
        }
        return null;
    }

    @Override // defpackage.arxa
    protected final aryl y() {
        return this.n;
    }

    @Override // defpackage.arxa
    @dzsi
    protected final synchronized CharSequence z() {
        PlaybackStateCompat playbackStateCompat = this.w;
        if (playbackStateCompat != null) {
            return playbackStateCompat.g;
        }
        return null;
    }

    @Override // defpackage.arxa
    protected final synchronized void c() {
        PlaybackStateCompat playbackStateCompat;
        mg mgVar;
        if (this.v == null || (playbackStateCompat = this.w) == null || (mgVar = this.d) == null) {
            return;
        }
        if (playbackStateCompat.a != 3) {
            mgVar.a();
        } else {
            mgVar.c();
        }
    }
}
