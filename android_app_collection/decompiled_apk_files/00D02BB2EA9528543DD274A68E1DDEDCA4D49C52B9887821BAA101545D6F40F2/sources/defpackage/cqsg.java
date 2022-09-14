package defpackage;

import android.content.Context;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqsg  reason: default package */
/* loaded from: classes.dex */
public abstract class cqsg implements cqtv, cqtu {
    protected final Object[] d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cqsg(Object[] objArr) {
        this.d = objArr;
    }

    public static cqtv d(cqtv... cqtvVarArr) {
        return new cqrz(cqtvVarArr, cqtvVarArr);
    }

    public static cqtv f(cqtv cqtvVar, Float f) {
        return new cqsa(new Object[]{cqtvVar, f}, cqtvVar, f);
    }

    public static cqtv g(cqtv cqtvVar, cqtv cqtvVar2) {
        return new cqsb(new Object[]{cqtvVar, cqtvVar2}, cqtvVar, cqtvVar2);
    }

    public static cqtv h(cqtv cqtvVar) {
        return new cqsc(new Object[]{cqtvVar}, cqtvVar);
    }

    public static cqtv i(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3) {
        return new cqsd(new Object[]{cqtvVar, cqtvVar2, cqtvVar3}, cqtvVar3, cqtvVar2, cqtvVar);
    }

    public static cqtv j(cqtv cqtvVar, cqtv cqtvVar2) {
        return new cqse(new Object[]{cqtvVar, cqtvVar2}, cqtvVar, cqtvVar2);
    }

    public static cqtv k(cqtv cqtvVar, cqtv cqtvVar2) {
        return new cqsf(new Object[]{cqtvVar, cqtvVar2}, cqtvVar, cqtvVar2);
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return (int) a(context);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        float a = a(context);
        int i = (int) (0.5f + a);
        return i != 0 ? i : a == 0.0f ? 0 : 1;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.d, ((cqsg) obj).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }
}
