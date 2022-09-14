package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bdbt  reason: default package */
/* loaded from: classes3.dex */
public class bdbt implements bdaa {
    private final bdpk a;
    private final Uri b;

    public bdbt(bdpk bdpkVar, Uri uri) {
        this.a = bdpkVar;
        this.b = uri;
    }

    @Override // defpackage.bdaa
    public cqkl a() {
        this.a.c(this.b);
        return cqkl.a;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcvf(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }
}
