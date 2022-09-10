package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
import com.spotify.protocol.types.Capabilities;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.PlaybackSpeed;
import com.spotify.protocol.types.PlayerContext;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arwp  reason: default package */
/* loaded from: classes2.dex */
public class arwp extends arxa {
    private static final cqss r = cqrt.c(R.color.nav_media_spotify_app_color);
    private static final cqss s = cqrt.c(R.color.nav_media_spotify_app_touch_color);
    @dzsi
    private PlayerState A;
    @dzsi
    private Track B;
    private final arvv C;
    public boolean a;
    @dzsi
    public Capabilities b;
    @dzsi
    public PlayerContext c;
    @dzsi
    public cqtd d;
    @dzsi
    public arwm e;
    public final List<arwm> f;
    public boolean g;
    public boolean h;
    public final dxhf<PlayerContext> i;
    public final dxhf<PlayerState> j;
    public final dxhf<Capabilities> k;
    @dzsi
    public dxfp l;
    @dzsi
    public dxfs m;
    @dzsi
    public dxfu n;
    private final Context t;
    private final arxv u;
    private final aryc v;
    private final arri w;
    private final arvw x;
    private final arwo y;
    private final dxio<afha> z;

    public arwp(Context context, cqhn cqhnVar, arxw arxwVar, aryc arycVar, arrh arrhVar, arri arriVar, cqkn<aryd> cqknVar, dehq dehqVar, dehq dehqVar2, arvw arvwVar, arwn arwnVar, dxio<afha> dxioVar) {
        super(context, arxf.FIFTEEN_SECONDS, cqhnVar, arrhVar, "com.spotify.music", cqknVar, dehqVar, dehqVar2);
        this.a = true;
        this.C = new arwg(this);
        this.i = new arwh(this);
        this.j = new arwi(this);
        this.k = new arwj(this);
        dbsk.l(true);
        this.t = context;
        this.u = arxwVar.a(r);
        this.v = arycVar;
        this.w = arriVar;
        this.x = arvwVar;
        this.f = new ArrayList();
        this.y = new arwo(this);
        this.z = dxioVar;
    }

    private static boolean I(@dzsi PlayerState playerState) {
        return playerState != null && !playerState.isPaused && playerState.playbackSpeed > 0.0f;
    }

    @Override // defpackage.aryd
    @dzsi
    public CharSequence A() {
        Track track = this.B;
        if (track != null) {
            return track.artist.name;
        }
        return null;
    }

    @Override // defpackage.aryd
    public aryi B() {
        return this.u;
    }

    public final void F(PlayerState playerState) {
        Track track;
        super.an();
        if (playerState == null || (track = playerState.track) == null) {
            G();
            dxfp dxfpVar = this.l;
            if (dxfpVar != null) {
                arwv.b(dxfpVar, new arwd(this), 1);
            }
            cqkx.p(this);
            return;
        }
        PlayerState playerState2 = this.A;
        this.A = playerState;
        this.B = track;
        if (playerState2 == null || !playerState.track.imageUri.equals(playerState2.track.imageUri)) {
            this.d = null;
            dxfs dxfsVar = this.m;
            if (dxfsVar != null) {
                dxfsVar.a(playerState.track.imageUri).c(new arwf(this));
            }
        }
        this.u.a(playerState.playbackPosition, playerState.track.duration, playerState.playbackSpeed, I(playerState));
        this.v.b(w(), j());
        cqkx.p(this);
    }

    public final void G() {
        this.e = null;
        this.A = null;
        this.c = null;
        this.B = null;
        this.d = null;
        this.g = false;
    }

    @Override // defpackage.arxa, defpackage.aryd
    public synchronized CharSequence PS() {
        if (this.g) {
            return this.t.getResources().getString(R.string.SPOTIFY_AUTHORIZATION_ERROR_TEXT);
        }
        return super.PS();
    }

    @Override // defpackage.arxa, defpackage.aryd
    @dzsi
    public CharSequence PT() {
        return this.g ? this.t.getResources().getString(R.string.SPOTIFY_AUTHORIZATION_ERROR_BUTTON) : super.PT();
    }

    @Override // defpackage.arxa, defpackage.aryd
    public cqkl PU() {
        if (this.g) {
            this.w.j();
        }
        return super.PU();
    }

    @Override // defpackage.arxa
    public synchronized void a() {
        this.h = true;
        arvw arvwVar = this.x;
        arvv arvvVar = this.C;
        cqrp.d(64.0d).a(this.t);
        arvwVar.b(arvvVar);
    }

    @Override // defpackage.arxa
    public synchronized void b() {
        this.h = false;
        G();
        aj(arwy.DISCONNECTED);
        this.a = true;
        this.x.a();
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final void d() {
        dxfu dxfuVar = this.n;
        if (dxfuVar != null) {
            dxfuVar.a.d("com.spotify.skip_previous", Empty.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final void e() {
        dxfu dxfuVar = this.n;
        if (dxfuVar != null) {
            dxfuVar.a.d("com.spotify.skip_next", Empty.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final void f() {
        dxfu dxfuVar = this.n;
        if (dxfuVar != null) {
            eaow eaowVar = arxf.FIFTEEN_SECONDS.e;
            dbsk.s(eaowVar);
            dxfuVar.a(eaowVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final void g() {
        dxfu dxfuVar = this.n;
        if (dxfuVar != null) {
            eaow eaowVar = arxf.FIFTEEN_SECONDS.e;
            eaow m = eaowVar != null ? eaowVar.m() : null;
            dbsk.s(m);
            dxfuVar.a(m.b);
        }
    }

    @Override // defpackage.arxa
    protected final void h() {
        this.f.clear();
        this.a = true;
        dxfp dxfpVar = this.l;
        if (dxfpVar == null) {
            return;
        }
        arwv.b(dxfpVar, new arwc(this), 9);
    }

    @Override // defpackage.arxa
    protected final void i() {
        this.f.clear();
        this.a = true;
    }

    @Override // defpackage.aryd
    public Boolean j() {
        return Boolean.valueOf(I(this.A));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final boolean k() {
        PlayerState playerState;
        Capabilities capabilities = this.b;
        return capabilities != null && (playerState = this.A) != null && capabilities.canPlayOnDemand && playerState.playbackRestrictions.canSkipPrev;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final boolean l() {
        PlayerState playerState = this.A;
        if (playerState == null) {
            return false;
        }
        return playerState.playbackRestrictions.canSkipNext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final boolean m() {
        PlayerState playerState = this.A;
        if (playerState == null) {
            return false;
        }
        return playerState.playbackRestrictions.canSeek;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final boolean n() {
        PlayerState playerState = this.A;
        if (playerState == null) {
            return false;
        }
        return playerState.playbackRestrictions.canSeek;
    }

    @Override // defpackage.arxa
    protected final dcdc<arye> p() {
        return dcdc.r(this.f);
    }

    @Override // defpackage.arxa
    @dzsi
    protected final arye q() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxa
    public final boolean r() {
        return this.B != null;
    }

    @Override // defpackage.aryf
    public cqkl s() {
        PlayerContext playerContext = this.c;
        Intent intent = playerContext == null ? new Intent("android.intent.action.MAIN") : new Intent("android.intent.action.VIEW");
        intent.setPackage("com.spotify.music");
        intent.setFlags(268435456);
        String valueOf = String.valueOf(this.t.getPackageName());
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse(valueOf.length() != 0 ? "android-app://".concat(valueOf) : new String("android-app://")));
        intent.putExtra("com.spotify.music.external.banner.MAPS", "com.google.android.apps.maps.NAVIGATING");
        intent.putExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME", this.t.getApplicationInfo().packageName);
        if (playerContext != null) {
            intent.setData(Uri.parse(playerContext.uri));
        }
        this.z.a().f(this.t, intent, 1);
        return cqkl.a;
    }

    @Override // defpackage.aryf
    public Boolean t() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.aryd
    public cqss u() {
        return r;
    }

    @Override // defpackage.arxa
    protected final cqss v() {
        return s;
    }

    @Override // defpackage.arxa
    public ddnk w() {
        return ddnk.NAVIGATION_MEDIA_INTEGRATION_PROVIDER_UNKNOWN;
    }

    @Override // defpackage.arxa
    @dzsi
    protected final CharSequence x() {
        Track track = this.B;
        if (track != null) {
            return track.name;
        }
        return null;
    }

    @Override // defpackage.arxa
    protected final aryl y() {
        return this.y;
    }

    @Override // defpackage.arxa
    @dzsi
    protected final CharSequence z() {
        return null;
    }

    @Override // defpackage.arxa
    protected final void c() {
        PlayerState playerState;
        dxfu dxfuVar = this.n;
        if (dxfuVar == null || (playerState = this.A) == null) {
            return;
        }
        if (!playerState.isPaused) {
            dxfuVar.b(new PlaybackSpeed(0));
        } else {
            dxfuVar.b(new PlaybackSpeed(1));
        }
    }

    @Override // defpackage.arxa
    protected final arwz o() {
        Track track = this.B;
        if (track == null || !track.isPodcast) {
            return arwz.SKIP_NEXT_PREVIOUS;
        }
        return arwz.FAST_FORWARD_REWIND;
    }

    public arwp(Context context, cqhn cqhnVar, arxw arxwVar, aryc arycVar, arrh arrhVar, arri arriVar, cqkn<aryd> cqknVar, dehq dehqVar, dehq dehqVar2, arvw arvwVar, dxio<afha> dxioVar) {
        this(context, cqhnVar, arxwVar, arycVar, arrhVar, arriVar, cqknVar, dehqVar, dehqVar2, arvwVar, new arwn(), dxioVar);
    }
}
