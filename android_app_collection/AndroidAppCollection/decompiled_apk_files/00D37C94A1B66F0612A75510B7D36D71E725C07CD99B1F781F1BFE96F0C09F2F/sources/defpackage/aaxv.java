package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aaxv  reason: default package */
/* loaded from: classes.dex */
public final class aaxv implements aafl {
    private final aaxy a;

    public aaxv(aaxy aaxyVar) {
        aaxyVar.getClass();
        this.a = aaxyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aaxy aaxyVar = this.a;
        aaxx aaxxVar = new aaxx(aaxyVar.e, aaxyVar.a.c());
        aaxxVar.j(aafx.a(apzgVar));
        this.a.b.e(aaxxVar, new aaxw((aaxu) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aaxu.class)));
    }
}
