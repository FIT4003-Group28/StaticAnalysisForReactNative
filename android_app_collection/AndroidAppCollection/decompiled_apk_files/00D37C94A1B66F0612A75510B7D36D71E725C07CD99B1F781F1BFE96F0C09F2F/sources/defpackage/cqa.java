package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cqa  reason: default package */
/* loaded from: classes3.dex */
public final class cqa implements cie {
    private final cqs a;
    private final cld b;

    public cqa(cqs cqsVar, cld cldVar) {
        this.a = cqsVar;
        this.b = cldVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        cku c = this.a.c((Uri) obj);
        if (c == null) {
            return null;
        }
        return cpn.a(this.b, ((cqq) c).c(), i, i2);
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
