package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anul  reason: default package */
/* loaded from: classes2.dex */
public class anul implements anuk {
    private static final dcqe a = dcqe.c("anul");
    private final String b;
    private dbsg<Integer> c = dbpy.a;

    public anul(String str) {
        this.b = str;
    }

    public final String PA() {
        return this.b;
    }

    public int PB() {
        if (this.c.a()) {
            return this.c.b().intValue();
        }
        bvoo.h("getListAdapterPosition() called without listAdapterPosition being set.", new Object[0]);
        return 0;
    }

    @Override // defpackage.anuk
    public void b(int i) {
        this.c = dbsg.i(Integer.valueOf(i));
    }

    public dcdc<dvan> d() {
        return dcdc.e();
    }

    public Bundle f() {
        return new Bundle();
    }

    public void g(Bundle bundle) {
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
