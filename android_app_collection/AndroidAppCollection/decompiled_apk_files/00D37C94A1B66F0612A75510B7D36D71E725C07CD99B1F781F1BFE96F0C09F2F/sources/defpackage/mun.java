package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mun  reason: default package */
/* loaded from: classes3.dex */
public final class mun {
    public final Context a;
    public final aafo b;
    public final aadd d;
    public ViewGroup f;
    public final List c = new ArrayList();
    public final Map e = new HashMap();

    public mun(Context context, aafo aafoVar, aadd aaddVar) {
        this.a = context;
        this.b = aafoVar;
        this.d = aaddVar;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (mum mumVar : this.c) {
            muj mujVar = mumVar.a;
            arbc arbcVar = mumVar.b;
            if (!(mujVar instanceof mto)) {
                aopa createBuilder = dpn.a.createBuilder();
                aopa createBuilder2 = dpp.a.createBuilder();
                String f = mujVar.f();
                createBuilder2.copyOnWrite();
                dpp dppVar = (dpp) createBuilder2.instance;
                f.getClass();
                dppVar.b |= 1;
                dppVar.c = f;
                createBuilder.copyOnWrite();
                dpn dpnVar = (dpn) createBuilder.instance;
                dpp dppVar2 = (dpp) createBuilder2.mo39build();
                dppVar2.getClass();
                dpnVar.d = dppVar2;
                dpnVar.c = 4;
                String str = arbcVar.d;
                createBuilder.copyOnWrite();
                dpn dpnVar2 = (dpn) createBuilder.instance;
                str.getClass();
                dpnVar2.b |= 1;
                dpnVar2.e = str;
                boolean h = mujVar.h();
                createBuilder.copyOnWrite();
                dpn dpnVar3 = (dpn) createBuilder.instance;
                dpnVar3.b |= 2;
                dpnVar3.f = h;
                arrayList.add((dpn) createBuilder.mo39build());
            }
        }
        return arrayList;
    }
}
