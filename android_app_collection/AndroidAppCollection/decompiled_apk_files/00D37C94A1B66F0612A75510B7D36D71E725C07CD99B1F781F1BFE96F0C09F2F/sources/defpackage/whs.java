package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: whs  reason: default package */
/* loaded from: classes4.dex */
public final class whs implements aafl {
    private final aasl a;

    public whs(aasl aaslVar) {
        aaslVar.getClass();
        this.a = aaslVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aasl aaslVar = this.a;
        aask aaskVar = new aask(aaslVar.e, aaslVar.a.c());
        aasj aasjVar = (aasj) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aasj.class);
        asbk asbkVar = (asbk) zew.K(map, "KEY_CODE_DELIVERY_METHOD", asbk.class);
        if (asbkVar == null) {
            asbkVar = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
        }
        aaskVar.b = (String) zew.K(map, "KEY_PHONE_NUMBER", String.class);
        aaskVar.c = (String) zew.K(map, "KEY_COUNTRY_CODE", String.class);
        aaskVar.a = asbkVar;
        this.a.b.e(aaskVar, new aasi(aasjVar));
    }
}
