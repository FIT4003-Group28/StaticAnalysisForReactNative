package defpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: adtt  reason: default package */
/* loaded from: classes.dex */
public final class adtt extends axpx {
    private static final String n = zep.a("MDX.transport");
    public volatile axps a;
    public final adti b;
    final adtk c;
    final adtr d;
    private final Object o;
    private final acrr p;
    private String q;
    private final adtl r;

    public adtt(adtl adtlVar, adwc adwcVar, acrr acrrVar) {
        super(adwcVar.c());
        this.o = new Object();
        this.q = "";
        this.p = acrrVar;
        this.r = adtlVar;
        this.d = new adtr();
        adti adtiVar = new adti();
        this.b = adtiVar;
        this.c = new adtk(adtiVar);
    }

    private final String o() {
        String str;
        synchronized (this.o) {
            str = this.q;
        }
        return str;
    }

    private final synchronized void p() {
        if (this.a == null || this.a.c != 3) {
            return;
        }
        try {
            this.a.g(1000, "Local transport closing web socket", false);
        } catch (IOException e) {
            zep.f(n, "Could not close web socket.", e);
        }
        this.a = null;
    }

    private static final axpn q() {
        return n(axpm.NOT_FOUND, "Error 404, file not found.");
    }

    private final void r(int i) {
        s(i, null);
    }

    private final void s(int i, String str) {
        aopa createBuilder = atch.a.createBuilder();
        createBuilder.copyOnWrite();
        atch atchVar = (atch) createBuilder.instance;
        atchVar.c = i - 1;
        atchVar.b |= 1;
        if (str != null) {
            createBuilder.copyOnWrite();
            atch atchVar2 = (atch) createBuilder.instance;
            atchVar2.b |= 2;
            atchVar2.d = str;
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dg((atch) createBuilder.mo39build());
        this.p.c((arrh) a.mo39build());
    }

    @Override // defpackage.axpx, defpackage.axpq
    public final axpn a(axpj axpjVar) {
        try {
            URI uri = new URI(((axpi) axpjVar).d);
            if (!o().equals(uri.getPath())) {
                s(6, uri.getPath());
                return q();
            }
            axpn a = super.a(axpjVar);
            axpl axplVar = a.a;
            axpm axpmVar = axpm.SWITCH_PROTOCOL;
            int ordinal = ((axpm) axplVar).ordinal();
            if (ordinal != 1) {
                if (ordinal == 11) {
                    r(3);
                } else if (ordinal == 21) {
                    r(2);
                } else if (ordinal == 13) {
                    r(6);
                } else if (ordinal != 14) {
                    r(1);
                } else {
                    r(5);
                }
            }
            return a;
        } catch (URISyntaxException e) {
            zep.f(n, String.format("Unexpected requested uri: %s", ((axpi) axpjVar).d), e);
            return q();
        }
    }

    @Override // defpackage.axpx
    protected final axps b(axpj axpjVar) {
        adtl adtlVar = this.r;
        this.a = new adte(axpjVar, this.c, this.d, adtlVar.a, adtlVar.b);
        return this.a;
    }

    public final void c(adts adtsVar) {
        adtr adtrVar = this.d;
        adtrVar.b.add(adtsVar);
        if (adtrVar.a == 2) {
            adtsVar.a();
        } else if (adtrVar.a != 0 || !adtrVar.c) {
        } else {
            adtsVar.b();
        }
    }

    public final void d(adtj adtjVar) {
        this.c.a(adtjVar);
    }

    public final void e(final acvg acvgVar) {
        if (!m()) {
            c(new adtq(this, acvgVar));
            d(new adtj() { // from class: adtp
                @Override // defpackage.adtj
                public final void a(adtd adtdVar) {
                    adtt adttVar = adtt.this;
                    acvg acvgVar2 = acvgVar;
                    adttVar.h(5);
                    acvgVar2.c("ws_ssr");
                }
            });
            if (!m()) {
                synchronized (this.o) {
                    this.q = String.format("/%s", UUID.randomUUID());
                }
                this.j = new ServerSocket();
                this.j.setReuseAddress(true);
                axpp axppVar = new axpp(this);
                this.k = new Thread(axppVar);
                this.k.setDaemon(true);
                this.k.setName("NanoHttpd Main Listener");
                this.k.start();
                while (!axppVar.b && axppVar.a == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable unused) {
                    }
                }
                IOException iOException = axppVar.a;
                if (iOException != null) {
                    throw iOException;
                }
                String.format("Started web socket server: %s", g());
            }
            if (m()) {
                h(2);
                acvgVar.c("ws_ss");
                return;
            }
            h(4);
        }
    }

    @Override // defpackage.axpq
    public final void f() {
        if (m()) {
            synchronized (this.o) {
                this.q = "";
            }
            p();
            adtr adtrVar = this.d;
            adtrVar.b.clear();
            adtrVar.a = 0;
            adtrVar.c = false;
            adti adtiVar = this.b;
            adtiVar.a = null;
            adtiVar.b.clear();
            this.c.c();
            try {
                axpq.l(this.j);
                ArrayList arrayList = new ArrayList(this.l.b);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    axpc axpcVar = (axpc) arrayList.get(i);
                    axpq.l(axpcVar.a);
                    axpq.l(axpcVar.b);
                }
                Thread thread = this.k;
                if (thread == null) {
                    return;
                }
                thread.join();
            } catch (Exception e) {
                axpq.h.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
            }
        }
    }

    public final String g() {
        if (!m()) {
            return "";
        }
        try {
            return new URI("ws", null, this.i, this.j == null ? -1 : this.j.getLocalPort(), o(), null, null).toString();
        } catch (URISyntaxException e) {
            zep.f(n, "Could not create web socket server URI.", e);
            throw new IllegalArgumentException(e);
        }
    }

    public final void h(int i) {
        aopa createBuilder = atcg.a.createBuilder();
        createBuilder.copyOnWrite();
        atcg atcgVar = (atcg) createBuilder.instance;
        atcgVar.c = i - 1;
        atcgVar.b |= 1;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).df((atcg) createBuilder.mo39build());
        this.p.c((arrh) a.mo39build());
    }
}
