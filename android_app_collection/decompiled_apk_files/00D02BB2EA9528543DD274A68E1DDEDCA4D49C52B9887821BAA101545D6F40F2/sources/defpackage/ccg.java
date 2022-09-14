package defpackage;

import java.io.InputStream;
import java.net.URL;
/* compiled from: PG */
/* renamed from: ccg  reason: default package */
/* loaded from: classes4.dex */
public final class ccg implements cap<URL, InputStream> {
    private final cap<cac, InputStream> a;

    public ccg(cap<cac, InputStream> capVar) {
        this.a = capVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<InputStream> b(URL url, int i, int i2, bua buaVar) {
        return this.a.b(new cac(url), i, i2, buaVar);
    }
}
