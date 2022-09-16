package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: aygr  reason: default package */
/* loaded from: classes2.dex */
public final class aygr extends aybh {
    @Override // defpackage.aybb
    public final /* bridge */ /* synthetic */ aybg a(URI uri, ayaz ayazVar) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            path.getClass();
            aqxo.w(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            return new aygq(substring, ayazVar, ayhf.k, amqi.c(), azqc.q(getClass().getClassLoader()));
        }
        return null;
    }

    @Override // defpackage.aybb
    public final String b() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aybh
    public final void c() {
    }

    @Override // defpackage.aybh
    public final void d() {
    }
}
