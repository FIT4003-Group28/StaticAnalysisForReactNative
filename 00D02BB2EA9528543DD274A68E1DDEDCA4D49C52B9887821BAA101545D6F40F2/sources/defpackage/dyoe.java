package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: dyoe  reason: default package */
/* loaded from: classes6.dex */
public final class dyoe extends dyil {
    @Override // defpackage.dyif
    public final /* bridge */ /* synthetic */ dyik a(URI uri, dyid dyidVar) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            dbsk.t(path, "targetPath");
            dbsk.j(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            return new dyod(substring, dyidVar, dyow.l, dbtp.a(), dyix.b(getClass().getClassLoader()));
        }
        return null;
    }

    @Override // defpackage.dyif
    public final String b() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyil
    public final boolean c() {
        return true;
    }

    @Override // defpackage.dyil
    public final int d() {
        return 5;
    }
}
