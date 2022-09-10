package defpackage;

import android.app.Activity;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bfha  reason: default package */
/* loaded from: classes3.dex */
public class bfha {
    public final cqat a;
    public final Resources b;
    private final Activity c;
    private final ania d;

    public bfha(Activity activity, cqat cqatVar, ania aniaVar) {
        this.c = activity;
        this.a = cqatVar;
        this.d = aniaVar;
        this.b = activity.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static String b(@dzsi bnhz bnhzVar, btvo btvoVar) {
        if (!btvoVar.getDirectionsPageParameters().A && bnhzVar != null && bnhzVar.b().booleanValue()) {
            return bnhzVar.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static cqtd c(@dzsi bnhz bnhzVar, btvo btvoVar) {
        if (!btvoVar.getDirectionsPageParameters().A && bnhzVar != null && bnhzVar.b().booleanValue()) {
            return bnhzVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean e(jjn jjnVar) {
        return Boolean.valueOf(!jjnVar.equals(jjn.FULLY_EXPANDED));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bfgz f(ilo iloVar) {
        return new bfgz(iloVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String a(ilo iloVar) {
        if (!this.d.a() || !iloVar.bl()) {
            return null;
        }
        return axxz.a(this.c, iloVar.p, iloVar.bh(), iloVar.F, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String d(ilo iloVar) {
        String bh;
        String a = a(iloVar);
        if (dbsj.d(a)) {
            if (iloVar.w()) {
                bh = iloVar.q();
            } else {
                bh = iloVar.bi() ? iloVar.bh() : null;
            }
            return !dbsj.d(bh) ? bh : (String) dcft.r(iloVar.z(), "");
        }
        return a;
    }
}
