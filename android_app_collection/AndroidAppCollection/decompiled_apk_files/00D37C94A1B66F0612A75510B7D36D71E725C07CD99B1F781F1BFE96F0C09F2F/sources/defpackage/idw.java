package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: idw  reason: default package */
/* loaded from: classes3.dex */
public final class idw {
    private static final idv k = new idv();
    public final ajmy a;
    public final amqo b;
    public ImageView d;
    public ImageView e;
    public idu f;
    public ajnj g;
    public avhn h;
    public boolean i;
    private final int l;
    public final yyj c = new ids(this);
    public final yiw j = new f(1);

    public idw(ajmy ajmyVar, amqo amqoVar) {
        int i;
        this.a = ajmyVar;
        this.b = amqoVar;
        Object obj = amqoVar.get();
        if (obj == null || (i = ((aull) obj).I) <= 0) {
            this.l = 720;
        } else {
            this.l = i;
        }
    }

    public final void a(afmu afmuVar, Optional optional) {
        this.e.getClass();
        int e = afmuVar.e();
        int c = afmuVar.c();
        if (e == 0 || c == 0) {
            optional.ifPresent(fyb.i);
            return;
        }
        idv idvVar = k;
        if (idvVar.a == null) {
            int i = this.l;
            idvVar.a = Bitmap.createBitmap(i, i, Bitmap.Config.RGB_565);
        }
        int i2 = this.l;
        if (e > i2 || c > i2) {
            double d = c;
            double d2 = e;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (e > c) {
                double d4 = i2;
                Double.isNaN(d4);
                c = (int) ((d4 * d3) + 0.5d);
                e = i2;
            } else {
                double d5 = i2;
                Double.isNaN(d5);
                e = (int) ((d5 / d3) + 0.5d);
                c = i2;
            }
        }
        if (e < 8 || c < 8) {
            optional.ifPresent(fyb.i);
            return;
        }
        this.e.setImageDrawable(null);
        idvVar.a.reconfigure(e, c, Bitmap.Config.RGB_565);
        afmuVar.l(idvVar.a, new idt(this, optional));
    }

    public final void b() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            zag.o(this.e, false);
        }
    }

    public final void c() {
        this.i = false;
        this.h = null;
        this.g.a();
        zag.o(this.d, false);
    }

    public final void d(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        h();
    }

    public final void e() {
        zag.o(this.d, false);
    }

    public final void f(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        boolean z = true;
        if (!hqp.n(reelWatchEndpointOuterClass$ReelWatchEndpoint) && !hqp.g(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            z = false;
        }
        this.i = z;
        avhn avhnVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        this.h = avhnVar;
        this.g.k(avhnVar);
    }

    public final void g() {
        zag.o(this.e, true);
    }

    public final void h() {
        zag.o(this.d, true);
    }
}
