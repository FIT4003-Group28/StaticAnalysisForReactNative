package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: wht  reason: default package */
/* loaded from: classes4.dex */
public final class wht implements aafl {
    private final aasp a;

    public wht(aasp aaspVar) {
        aaspVar.getClass();
        this.a = aaspVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aasp aaspVar = this.a;
        aaso aasoVar = new aaso(aaspVar.e, aaspVar.a.c());
        aasoVar.a = Long.valueOf(((Long) zew.K(map, "KEY_IDV_REQUEST_ID", Long.class)).longValue());
        aasoVar.b = (String) zew.K(map, "KEY_VERIFICATION_CODE", String.class);
        this.a.b.e(aasoVar, new aasm((aasn) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aasn.class)));
    }
}
