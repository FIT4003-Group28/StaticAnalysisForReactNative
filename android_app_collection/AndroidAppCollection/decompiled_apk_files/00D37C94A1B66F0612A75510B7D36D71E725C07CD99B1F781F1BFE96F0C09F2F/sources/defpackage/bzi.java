package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bzi  reason: default package */
/* loaded from: classes2.dex */
public final class bzi extends bzd {
    private final cdk e;

    public bzi(List list) {
        super(list);
        this.e = new cdk();
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        Object obj;
        Object obj2 = cdiVar.b;
        if (obj2 == null || (obj = cdiVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cdk cdkVar = (cdk) obj2;
        cdk cdkVar2 = (cdk) obj;
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f2 = cdiVar.g;
            cdiVar.h.floatValue();
            c();
            cdk cdkVar3 = (cdk) cdjVar.a();
            if (cdkVar3 != null) {
                return cdkVar3;
            }
        }
        cdk cdkVar4 = this.e;
        float c = cdc.c(cdkVar.a, cdkVar2.a, f);
        float f3 = cdkVar.b;
        float f4 = cdkVar2.b;
        cdkVar4.a = c;
        cdkVar4.b = cdc.c(f3, f4, f);
        return this.e;
    }
}
