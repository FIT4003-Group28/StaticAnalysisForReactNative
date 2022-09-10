package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: buiw  reason: default package */
/* loaded from: classes.dex */
public final class buiw implements btuw {
    final /* synthetic */ dzsj a;
    final /* synthetic */ URL b;

    public buiw(dzsj dzsjVar, URL url) {
        this.a = dzsjVar;
        this.b = url;
    }

    @Override // defpackage.btuw
    public final URL a() {
        if ((((dmxf) this.a.a()).a & 32) != 0) {
            try {
                return new URL(((dmxf) this.a.a()).f);
            } catch (MalformedURLException e) {
                bvoo.j(e);
            }
        }
        return this.b;
    }
}
