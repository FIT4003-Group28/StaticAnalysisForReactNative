package defpackage;

import android.webkit.CookieManager;
import java.net.URI;
/* compiled from: PG */
/* renamed from: omu  reason: default package */
/* loaded from: classes3.dex */
public final class omu {
    public final CookieManager a;
    public final String b;
    public final azqb c;

    public omu(CookieManager cookieManager, URI uri, azqb azqbVar) {
        this.a = cookieManager;
        this.b = uri.getHost();
        this.c = azqbVar;
    }
}
