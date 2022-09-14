package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: bubu  reason: default package */
/* loaded from: classes4.dex */
public final class bubu implements btuw {
    private static final dcqe a = dcqe.c("bubu");
    private final dzsj<btvo> b;

    public bubu(dzsj<btvo> dzsjVar) {
        this.b = dzsjVar;
    }

    @Override // defpackage.btuw
    public final URL a() {
        try {
            if (this.b.a().getZeroRatingParameters().c) {
                return new URL("https://mobilemaps-pa-gz.googleapis.com:443");
            }
        } catch (MalformedURLException e) {
            bvoo.j(e);
        }
        return b();
    }

    public final URL b() {
        try {
            URL url = new URL("https://mobilemaps-pa.googleapis.com:443");
            if (!"https".equals(url.getProtocol())) {
                bvoo.h("https is required for service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            }
            return url;
        } catch (MalformedURLException e) {
            bvoo.h("Invalid service address: %s", "https://mobilemaps-pa.googleapis.com:443");
            throw new IllegalArgumentException(e);
        }
    }

    public final URL c() {
        try {
            return new URL("https://mobilemaps-pa-gz.googleapis.com:443");
        } catch (MalformedURLException e) {
            bvoo.h("Invalid zero-rated service address: %s", "https://mobilemaps-pa-gz.googleapis.com:443");
            throw new IllegalArgumentException(e);
        }
    }
}
