package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bzb  reason: default package */
/* loaded from: classes2.dex */
public final class bzb extends bzd {
    private final cao e;

    public bzb(List list) {
        super(list);
        int i = 0;
        cao caoVar = (cao) ((cdi) list.get(0)).b;
        i = caoVar != null ? caoVar.a() : i;
        this.e = new cao(new float[i], new int[i]);
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        cao caoVar = this.e;
        cao caoVar2 = (cao) cdiVar.b;
        cao caoVar3 = (cao) cdiVar.c;
        int length = caoVar2.b.length;
        int length2 = caoVar3.b.length;
        if (length == length2) {
            for (int i = 0; i < caoVar2.b.length; i++) {
                caoVar.a[i] = cdc.c(caoVar2.a[i], caoVar3.a[i], f);
                caoVar.b[i] = na.e(f, caoVar2.b[i], caoVar3.b[i]);
            }
            return this.e;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("Cannot interpolate between gradients. Lengths vary (");
        sb.append(length);
        sb.append(" vs ");
        sb.append(length2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
