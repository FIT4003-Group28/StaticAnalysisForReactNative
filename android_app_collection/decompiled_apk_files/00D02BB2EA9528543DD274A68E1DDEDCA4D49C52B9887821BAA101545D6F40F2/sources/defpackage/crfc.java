package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: crfc  reason: default package */
/* loaded from: classes5.dex */
public final class crfc {
    private static final dcqe o = dcqe.c("crfc");
    public final Application a;
    public final bvsl b;
    public final crfa c = new crfa();
    public final crfa d = new crfa();
    public final crfa e = new crfa();
    public final crfa f = new crfa();
    public final crfa g = new crfa();
    public final crfa h = new crfa();
    public final crfa i = new crfa();
    public final crfa j = new crfa();
    public final crfa k = new crfa();
    public final crfa l = new crfa();
    public final crfa m = new crfa();
    public final crfa n = new crfa();

    public crfc(Application application, bvsl bvslVar) {
        this.a = application;
        this.b = bvslVar;
    }

    public static String a(crfa crfaVar, int i) {
        int size = crfaVar.size();
        int i2 = 0;
        while (i2 < size) {
            crez crezVar = crfaVar.get(i2);
            i2++;
            if (i < crezVar.b) {
                return crezVar.a(i);
            }
        }
        bvoo.h("Cannot format distance: %s", Integer.valueOf(i));
        return "";
    }

    public final crfa b(dowa dowaVar, boolean z) {
        dowa dowaVar2 = dowa.KILOMETERS;
        int ordinal = dowaVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? z ? this.c : this.f : z ? this.k : this.n : z ? this.g : this.j;
    }
}
