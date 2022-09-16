package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.net.SocketTimeoutException;
/* compiled from: PG */
/* renamed from: aeib  reason: default package */
/* loaded from: classes.dex */
public final class aeib extends aflh {
    private final yrj b;
    private final PlayerConfigModel c;
    private final afjp d;
    private Exception e;
    private boolean f;
    private boolean g;
    private Uri h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeib(ati atiVar, yrj yrjVar, PlayerConfigModel playerConfigModel, afjp afjpVar) {
        super(atiVar);
        afms.a(atiVar);
        afms.a(yrjVar);
        this.b = yrjVar;
        afms.a(playerConfigModel);
        this.c = playerConfigModel;
        afms.a(afjpVar);
        this.d = afjpVar;
    }

    private final void c(ate ateVar) {
        if (!this.b.o()) {
            return;
        }
        if ((ateVar instanceof afkb) && ((afkb) ateVar).e == 204) {
            return;
        }
        if ((ateVar instanceof afkc) && "x-segment-lmt".equals(((afkc) ateVar).e)) {
            return;
        }
        if (this.f) {
            this.g = true;
            return;
        }
        this.e = ateVar;
        this.i++;
    }

    private final void d() {
        if (!this.f) {
            this.i = 0;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        try {
            int g = super.g(bArr, i, i2);
            d();
            return g;
        } catch (ate e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        boolean equals;
        if (this.c.aY()) {
            equals = aeik.g(asyVar.a, this.h);
        } else {
            equals = asyVar.a.equals(this.h);
        }
        if (!equals) {
            Exception exc = this.e;
            if (exc == null || !(exc.getCause() instanceof SocketTimeoutException)) {
                this.e = null;
                this.f = false;
                this.g = false;
                this.i = 0;
            }
            this.h = asyVar.a;
        }
        if (this.c.ah() && this.i > this.c.u() && !this.g) {
            Uri uri = asyVar.a;
            String authority = uri.getAuthority();
            Uri.Builder authority2 = uri.buildUpon().authority("redirector.googlevideo.com");
            afms.a(authority);
            if (authority.endsWith("a1.googlevideo.com")) {
                uri = authority2.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
            } else if (authority.endsWith("googlevideo.com")) {
                uri = authority2.appendQueryParameter("cmo", "pf=1").build();
            } else if (authority.endsWith("c.youtube.com")) {
                uri = authority2.appendQueryParameter("cmo", "td=c.youtube.com").build();
            }
            asyVar = asyVar.d(uri);
            this.f = true;
        } else {
            this.f = false;
        }
        try {
            long h = super.h(asyVar);
            this.d.D(super.k(), super.a());
            d();
            return h;
        } catch (ate e) {
            c(e);
            throw e;
        }
    }
}
