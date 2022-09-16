package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: brod  reason: default package */
/* loaded from: classes4.dex */
public final class brod {
    public final ilo a;

    public brod(ilo iloVar) {
        this.a = iloVar;
    }

    public static List<brod> a(List<ilo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ilo iloVar : list) {
            if (iloVar != null) {
                arrayList.add(new brod(iloVar));
            }
        }
        return arrayList;
    }

    public static final bydo h(Context context, cqat cqatVar) {
        return new bydo(context, cqatVar);
    }

    public final boolean b(dkee dkeeVar) {
        return dcdc.j(dkee.CHAIN, dkee.COMMODITY, dkee.DINING, dkee.LEAN, dkee.RICH).contains(dkeeVar) && !this.a.cu() && !this.a.bi();
    }

    public final dpxf c() {
        return this.a.cz();
    }

    public final akqi d() {
        return this.a.ai();
    }

    @dzsi
    public final dnbv e() {
        alvj bL = this.a.bL();
        if (bL != null) {
            return bL.b();
        }
        return null;
    }

    public final boolean f() {
        return this.a.aM() || this.a.aP();
    }

    public final String g() {
        return this.a.cG();
    }
}
