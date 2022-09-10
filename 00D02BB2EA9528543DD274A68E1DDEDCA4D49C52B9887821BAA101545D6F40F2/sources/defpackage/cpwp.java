package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpwp  reason: default package */
/* loaded from: classes5.dex */
public final class cpwp {
    public final List<Integer> a;
    public final List<Integer> b;
    public final dbsg<Boolean> c;

    public cpwp(cpyz cpyzVar) {
        this.a = cpyzVar.b;
        dsrj<String> dsrjVar = cpyzVar.c;
        this.b = cpyzVar.g;
        if ((cpyzVar.a & 1) != 0) {
            dbsg.i(cpyzVar.d);
        }
        if ((cpyzVar.a & 2) != 0) {
            dbsg.i(cpyzVar.e);
        }
        if ((cpyzVar.a & 4) != 0) {
            dbsg.i(Boolean.valueOf(cpyzVar.f));
        }
        this.c = (cpyzVar.a & 8) != 0 ? dbsg.i(Boolean.valueOf(cpyzVar.h)) : dbpy.a;
    }

    public static dehn<cpwp> a(Context context) {
        deig d = deig.d();
        new cpwo(context, d).execute(new Void[0]);
        return deew.h(d, cpwn.a, dege.a);
    }
}
