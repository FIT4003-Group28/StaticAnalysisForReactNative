package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: buew  reason: default package */
/* loaded from: classes.dex */
public final class buew implements btvf {
    private final dzsj<btvd> a;
    private final dzsj<btuy> b;
    private final bufr c;

    public buew(dzsj<btvd> dzsjVar, dzsj<btuy> dzsjVar2, bufr bufrVar) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = bufrVar;
    }

    @Override // defpackage.btvf
    public final btve b(URL url) {
        if (!this.c.a()) {
            return this.a.a().b(url);
        }
        return this.b.a().b(url);
    }
}
