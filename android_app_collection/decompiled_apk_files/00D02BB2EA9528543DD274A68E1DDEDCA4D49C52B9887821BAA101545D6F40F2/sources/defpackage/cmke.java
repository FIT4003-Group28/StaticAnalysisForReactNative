package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* compiled from: PG */
/* renamed from: cmke  reason: default package */
/* loaded from: classes5.dex */
public final class cmke extends cmka {
    private cmkj a;
    private byte[] b;
    private int c;
    private int d;

    public cmke() {
        super(false);
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.c - this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(cmny.c(this.b), this.d, bArr, i, min);
        this.d += min;
        h(min);
        return min;
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        j();
        this.a = cmkjVar;
        this.d = (int) cmkjVar.f;
        Uri uri = cmkjVar.a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new clob(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String[] u = cmny.u(uri.getSchemeSpecificPart(), ",");
        if (u.length != 2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(valueOf2);
            throw new clob(sb.toString());
        }
        String str = u[1];
        if (u[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String valueOf3 = String.valueOf(str);
                throw new clob(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.b = cmny.t(URLDecoder.decode(str, dbrc.a.name()));
        }
        long j = cmkjVar.g;
        int length = j != -1 ? ((int) j) + this.d : this.b.length;
        this.c = length;
        if (length > this.b.length || this.d > length) {
            this.b = null;
            throw new cmkh();
        }
        g(cmkjVar);
        return this.c - this.d;
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        cmkj cmkjVar = this.a;
        if (cmkjVar != null) {
            return cmkjVar.a;
        }
        return null;
    }

    @Override // defpackage.cmkg
    public final void f() {
        if (this.b != null) {
            this.b = null;
            i();
        }
        this.a = null;
    }
}
