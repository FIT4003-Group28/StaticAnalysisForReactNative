package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: debx  reason: default package */
/* loaded from: classes6.dex */
public final class debx extends dcbm<String, String> implements Cloneable, Serializable {
    private static final long serialVersionUID = -3053773769157973706L;
    public final dcha<String, String> b;
    private static final Charset c = Charset.forName("ISO-8859-1");
    public static final debx a = new debx(dcax.a);

    public debx() {
        this(dcgz.a());
    }

    public static debx g(String str, Charset charset) {
        dbsk.s(charset);
        debx debxVar = new debx();
        if (!str.isEmpty()) {
            String name = charset.name();
            int length = name.length();
            int i = 0;
            boolean z = true;
            if ((length < 9 || !name.regionMatches(true, length - 9, "SHIFT_JIS", 0, 9)) && (length < 11 || !name.regionMatches(true, length - 11, "WINDOWS-31J", 0, 11))) {
                z = false;
            }
            while (i <= str.length()) {
                int indexOf = str.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = str.length();
                }
                int indexOf2 = str.indexOf(61, i);
                if (indexOf2 > indexOf) {
                    indexOf2 = -1;
                }
                debxVar.n(j(str, i, indexOf2 == -1 ? indexOf : indexOf2, charset, z), indexOf2 == -1 ? "" : j(str, indexOf2 + 1, indexOf, charset, z));
                i = indexOf + 1;
            }
        }
        return debxVar;
    }

    private static String j(String str, int i, int i2, Charset charset, boolean z) {
        try {
            if (z) {
                return new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(c), charset);
            }
            return URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.dcbp, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.b;
    }

    @Override // defpackage.dcbm
    protected final dcha<String, String> a() {
        return this.b;
    }

    @Override // defpackage.dcbm, defpackage.dcbp
    protected final /* bridge */ /* synthetic */ dcka b() {
        return this.b;
    }

    /* renamed from: h */
    public final debx clone() {
        return new debx(new dcgz(this.b));
    }

    public final String i(Charset charset) {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<String, String>> it = I().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append((CharSequence) debw.a(next.getKey(), charset));
                if (!"".equals(next.getValue())) {
                    sb.append('=').append(debw.a(next.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.dcbq
    public final String toString() {
        return debt.a(this);
    }

    public debx(dcha<String, String> dchaVar) {
        this.b = new debn(dchaVar);
    }
}
