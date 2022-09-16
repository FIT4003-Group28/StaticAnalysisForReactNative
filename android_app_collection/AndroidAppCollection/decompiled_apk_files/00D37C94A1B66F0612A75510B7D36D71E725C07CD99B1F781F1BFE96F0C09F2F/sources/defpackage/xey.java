package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: xey  reason: default package */
/* loaded from: classes4.dex */
public final class xey {
    private static final Pattern c = Pattern.compile("^NO_MATCH_REGEX$");
    public final Pattern a;
    public final afwu b;
    private final afwu d;
    private final snc e;

    public xey(aacz aaczVar, afwu afwuVar, afwu afwuVar2, snc sncVar) {
        aaczVar.getClass();
        afwuVar.getClass();
        this.b = afwuVar;
        afwuVar2.getClass();
        this.d = afwuVar2;
        this.a = c;
        sncVar.getClass();
        this.e = sncVar;
    }

    public final void a(afwt afwtVar, cez cezVar) {
        if (afwtVar.j.a(aswe.VISITOR_ID)) {
            this.b.a(afwtVar, cezVar);
        } else {
            b(afwtVar, cezVar);
        }
    }

    public final void b(afwt afwtVar, cez cezVar) {
        Uri build;
        Uri uri = afwtVar.b;
        if (uri.getHost() != null && ((uri.getHost().endsWith(".doubleclick.net") || TextUtils.equals(uri.getHost(), "doubleclick.net")) && afwtVar.d)) {
            Uri uri2 = afwtVar.b;
            String valueOf = String.valueOf(this.e.c() / 1000);
            String encodedQuery = uri2.getEncodedQuery();
            if (encodedQuery == null || encodedQuery.length() == 0) {
                build = uri2.buildUpon().appendQueryParameter("ts", valueOf).build();
            } else {
                String encode = Uri.encode("ts", null);
                String encode2 = Uri.encode(valueOf, null);
                StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
                sb.append(encode);
                sb.append("=");
                sb.append(encode2);
                String sb2 = sb.toString();
                Uri.Builder buildUpon = uri2.buildUpon();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + encodedQuery.length());
                sb3.append(sb2);
                sb3.append("&");
                sb3.append(encodedQuery);
                build = buildUpon.encodedQuery(sb3.toString()).build();
            }
            afwtVar.b(build);
        }
        this.d.a(afwtVar, cezVar);
    }

    public final afwt c(Uri uri, afvm afvmVar) {
        afwt d;
        if (this.a.matcher(uri.toString()).find()) {
            d = afwu.d("vastad");
        } else {
            d = afwu.d("vastad");
        }
        d.b(uri);
        d.g = afvmVar;
        return d;
    }

    public final afwt d(Uri uri, byte[] bArr, afvm afvmVar) {
        afwt c2;
        if (this.a.matcher(uri.toString()).find()) {
            c2 = afwu.c(bArr, "vastad");
        } else {
            c2 = afwu.c(bArr, "vastad");
        }
        c2.b(uri);
        c2.g = afvmVar;
        return c2;
    }
}
