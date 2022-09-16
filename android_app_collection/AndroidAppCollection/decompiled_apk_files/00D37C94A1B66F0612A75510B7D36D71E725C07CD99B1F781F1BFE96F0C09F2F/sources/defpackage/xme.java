package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: xme  reason: default package */
/* loaded from: classes4.dex */
public final class xme implements ajrt {
    private final xmd a;

    public xme(xmd xmdVar) {
        this.a = xmdVar;
    }

    public static xmd b(Map map) {
        xlx xlxVar = (xlx) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xlx.class);
        return xlxVar != null ? xlxVar.e() : (xmd) zew.K(map, "commentThreadMutator", xmd.class);
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f("commentThreadMutator", this.a);
    }
}
