package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cnsd  reason: default package */
/* loaded from: classes.dex */
public final class cnsd<L> {
    public volatile L a;
    public volatile cnsb<L> b;
    private final cnsa c;

    public cnsd(Looper looper, L l, String str) {
        this.c = new cnsa(this, looper);
        cnwc.n(l, "Listener must not be null");
        this.a = l;
        cnwc.l(str);
        this.b = new cnsb<>(l, str);
    }

    public final void a(cnsc<? super L> cnscVar) {
        cnwc.n(cnscVar, "Notifier must not be null");
        this.c.sendMessage(this.c.obtainMessage(1, cnscVar));
    }

    public final void b() {
        this.a = null;
        this.b = null;
    }
}
