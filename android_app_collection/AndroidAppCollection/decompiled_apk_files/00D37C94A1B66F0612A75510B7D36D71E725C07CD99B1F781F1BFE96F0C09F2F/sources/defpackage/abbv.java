package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: abbv  reason: default package */
/* loaded from: classes.dex */
public final class abbv extends aaqs {
    protected final String a;
    private final Uri b;

    public abbv(aaqf aaqfVar, afvm afvmVar, Uri uri, String str) {
        super("navigation/resolve_url", aaqfVar, afvmVar);
        i();
        uri.getClass();
        this.b = uri;
        this.a = str;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arxr.a.createBuilder();
        String uri = this.b.toString();
        createBuilder.copyOnWrite();
        arxr arxrVar = (arxr) createBuilder.instance;
        uri.getClass();
        arxrVar.b |= 2;
        arxrVar.d = uri;
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arxr arxrVar2 = (arxr) createBuilder.instance;
            arxrVar2.b |= 4;
            arxrVar2.e = str;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("uri", this.b.toString());
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.b.toString());
    }
}
