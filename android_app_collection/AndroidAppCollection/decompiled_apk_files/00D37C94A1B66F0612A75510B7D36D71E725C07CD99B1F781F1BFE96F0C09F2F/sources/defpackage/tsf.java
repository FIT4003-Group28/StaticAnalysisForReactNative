package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: tsf  reason: default package */
/* loaded from: classes4.dex */
public final class tsf {
    public Uri a;
    public String b;
    public tse c;
    public Integer d;
    public amuk e;
    public ampq f;

    public tsf() {
    }

    public tsf(byte[] bArr) {
        this.f = amon.a;
    }

    public final void a(tse tseVar) {
        if (tseVar != null) {
            this.c = tseVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    public final void b(amuk amukVar) {
        if (amukVar != null) {
            this.e = amukVar;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
