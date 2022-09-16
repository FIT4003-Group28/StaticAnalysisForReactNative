package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* compiled from: PG */
/* renamed from: axc  reason: default package */
/* loaded from: classes2.dex */
public final class axc extends ass {
    private asy a;
    private byte[] b;
    private int c;
    private int d;

    public axc() {
        super(false);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(pxi.y(this.b), this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        c(min);
        return min;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        e(asyVar);
        this.a = asyVar;
        Uri uri = asyVar.a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        ptx.d(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] Z = pxi.Z(uri.getSchemeSpecificPart(), ",");
        if (Z.length != 2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(valueOf2);
            throw pjq.b(sb.toString(), null);
        }
        String str = Z[1];
        if (Z[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String valueOf3 = String.valueOf(str);
                throw pjq.b(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.b = pxi.U(URLDecoder.decode(str, amoz.a.name()));
        }
        long j = asyVar.g;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new asw(2008);
        }
        int i = (int) j;
        this.c = i;
        int i2 = length - i;
        this.d = i2;
        long j2 = asyVar.h;
        if (j2 != -1) {
            this.d = (int) Math.min(i2, j2);
        }
        f(asyVar);
        long j3 = asyVar.h;
        return j3 != -1 ? j3 : this.d;
    }

    @Override // defpackage.asv
    public final Uri i() {
        asy asyVar = this.a;
        if (asyVar != null) {
            return asyVar.a;
        }
        return null;
    }

    @Override // defpackage.asv
    public final void j() {
        if (this.b != null) {
            this.b = null;
            d();
        }
        this.a = null;
    }
}
