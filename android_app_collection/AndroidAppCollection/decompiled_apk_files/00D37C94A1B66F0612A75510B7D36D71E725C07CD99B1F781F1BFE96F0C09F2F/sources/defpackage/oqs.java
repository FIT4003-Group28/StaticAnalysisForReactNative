package defpackage;

import android.app.Activity;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.databus.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: oqs  reason: default package */
/* loaded from: classes4.dex */
public final class oqs extends alyf {
    public final opc a;
    public final f b;
    public final int c;
    private final d d;
    private final a e;
    private final b f;

    static {
        zep.k("YouTubeAndroidPlayerAPI");
    }

    public oqs(Activity activity, ooh oohVar, afmu afmuVar) {
        super(activity, new com.google.android.apps.youtube.embeddedplayer.service.jar.b(activity), new aizi(activity));
        this.j.h((View) afmuVar);
        this.o.b(new oqq());
        a aVar = new a(this.M);
        this.e = aVar;
        this.f = b.d(this.N, oohVar.b(), oohVar.h());
        d dVar = new d();
        this.d = dVar;
        aizi aiziVar = this.j;
        final ahzf ahzfVar = this.k;
        ahzfVar.getClass();
        aiziVar.o = new Runnable() { // from class: oqp
            @Override // java.lang.Runnable
            public final void run() {
                ahzf.this.pI();
            }
        };
        final i iVar = new i(this.x, ((oon) oohVar).f.b(), oohVar.h());
        aizi aiziVar2 = this.j;
        final ahzf ahzfVar2 = this.k;
        ahzfVar2.getClass();
        aiziVar2.o = new Runnable() { // from class: oqp
            @Override // java.lang.Runnable
            public final void run() {
                ahzf.this.pI();
            }
        };
        this.a = opc.M(activity, new oqr(this), oohVar, afmuVar, iVar, this.y, this.k, this.p, this.q, this.r, this.s, this.t, this.o, this.R, dVar, this.l, this.m, this.n, this.z, this.A, this.B, this.w, aVar, new zdt() { // from class: oqn
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                yzt yztVar = oqs.this.E;
                boolean z = false;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                yztVar.j(z);
            }
        }, alya.b, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a() { // from class: oqm
            @Override // com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a
            public final void a(aqxq aqxqVar) {
                i.this.a.y((aqxq) new FancyDismissibleDialogRendererWrapper(aqxqVar).a);
            }
        }, c.c);
        this.f65J.sh(new aafo() { // from class: oqo
            @Override // defpackage.aafo
            public final /* synthetic */ void a(apzg apzgVar) {
                aafn.a(this, apzgVar);
            }

            @Override // defpackage.aafo
            public final /* synthetic */ void b(List list) {
                aafn.b(this, list);
            }

            @Override // defpackage.aafo
            public final void c(apzg apzgVar, Map map) {
                oqs.this.a.y(apzgVar);
            }

            @Override // defpackage.aafo
            public final /* synthetic */ void d(List list, Map map) {
                aafn.c(this, list, map);
            }

            @Override // defpackage.aafo
            public final /* synthetic */ void e(List list, Object obj) {
                aafn.d(this, list, obj);
            }
        });
        f c = oohVar.c();
        this.b = c;
        int a = c.a(System.identityHashCode(activity));
        this.c = a;
        c.n(a);
        this.v.g(this.N, dVar, new g(c));
    }

    @Override // defpackage.alyf
    public final boolean A() {
        return this.a.H();
    }

    @Override // defpackage.alyf
    public final boolean B() {
        return this.a.J();
    }

    @Override // defpackage.alyf
    public final boolean C() {
        return this.a.d;
    }

    @Override // defpackage.alyf
    public final boolean D(VisibilityChangeEventData visibilityChangeEventData) {
        if (!au()) {
            return false;
        }
        this.a.s(visibilityChangeEventData);
        return true;
    }

    @Override // defpackage.alyf
    public final boolean E(int i, KeyEvent keyEvent) {
        return this.a.K(i, keyEvent);
    }

    @Override // defpackage.alyf
    public final boolean F(int i, KeyEvent keyEvent) {
        return this.a.L(i, keyEvent);
    }

    @Override // defpackage.alyf
    protected final boolean G(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        this.a.t((PlaybackServiceState) obtain.readParcelable(PlaybackServiceState.class.getClassLoader()));
        obtain.recycle();
        return true;
    }

    @Override // defpackage.alyf
    protected final byte[] H() {
        PlaybackServiceState c = this.a.c();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(c, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // defpackage.alyf
    public final int a() {
        if (this.a.a() < -2147483648L || this.a.a() > 2147483647L) {
            long a = this.a.a();
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(a);
            zep.l(sb.toString());
        }
        return (int) this.a.a();
    }

    @Override // defpackage.alyf
    public final int b() {
        if (this.a.b() < -2147483648L || this.a.b() > 2147483647L) {
            long b = this.a.b();
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(b);
            zep.l(sb.toString());
        }
        return (int) this.a.b();
    }

    @Override // defpackage.alyf
    public final void c() {
        this.a.q();
    }

    @Override // defpackage.alyf
    public final void d(String str, int i, int i2) {
        this.b.u(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.f(str, i, i2));
        this.a.e(str, i, i2, this.c);
    }

    @Override // defpackage.alyf
    public final void e(String str, int i) {
        this.b.u(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.g(str, i));
        this.a.g(str, i, this.c);
    }

    @Override // defpackage.alyf
    public final void f(List list, int i, int i2) {
        this.b.m(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.h(list, i, i2), true);
        this.a.h(list, i, i2, this.c);
    }

    @Override // defpackage.alyf
    public final void g() {
        this.a.j();
    }

    @Override // defpackage.alyf
    public final void h(String str, int i, int i2) {
        this.b.u(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.f(str, i, i2));
        this.a.n(str, i, i2, false, this.c);
    }

    @Override // defpackage.alyf
    public final void i(String str, int i) {
        this.b.u(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.g(str, i));
        this.a.o(str, false, i, false, this.c);
    }

    @Override // defpackage.alyf
    public final void j(List list, int i, int i2) {
        this.b.m(this.c, com.google.android.apps.youtube.embeddedplayer.service.util.a.h(list, i, i2), true);
        this.a.p(list, i, i2, false, this.c);
    }

    @Override // defpackage.alyf
    public final void k(acup acupVar) {
        this.b.p(acupVar);
    }

    @Override // defpackage.alyf
    public final void l() {
        this.a.r();
    }

    @Override // defpackage.alyf
    public final void m(boolean z) {
        this.a.i(z);
    }

    @Override // defpackage.alyf
    public final void n() {
        this.a.d();
    }

    @Override // defpackage.alyf
    public final void o() {
        this.a.u();
    }

    @Override // defpackage.alyf
    public final void p() {
        this.a.v();
    }

    @Override // defpackage.alyf
    public final void q() {
        this.a.w();
    }

    @Override // defpackage.alyf
    public final void r(boolean z) {
        this.a.x(z);
        this.b.t(this.c);
        this.e.b();
        this.f.c();
    }

    @Override // defpackage.alyf
    public final void s(int i) {
        this.a.z(i);
    }

    @Override // defpackage.alyf
    public final void t(int i) {
        this.a.A(i);
    }

    @Override // defpackage.alyf
    public final void u(boolean z) {
        this.a.B(z);
    }

    @Override // defpackage.alyf
    public final void v(boolean z) {
        this.a.C(z);
    }

    @Override // defpackage.alyf
    protected final void w(boolean z) {
        this.a.D(z);
    }

    @Override // defpackage.alyf
    public final void x() {
        this.a.E();
    }

    @Override // defpackage.alyf
    public final void y() {
        this.a.F();
    }

    @Override // defpackage.alyf
    public final boolean z() {
        return this.a.G();
    }
}
