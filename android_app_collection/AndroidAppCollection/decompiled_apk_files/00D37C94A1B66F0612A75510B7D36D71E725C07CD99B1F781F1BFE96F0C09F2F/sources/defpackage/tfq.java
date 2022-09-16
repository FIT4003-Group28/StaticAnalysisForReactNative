package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: tfq  reason: default package */
/* loaded from: classes4.dex */
public final class tfq implements axou {
    private final /* synthetic */ int a;

    public tfq(int i) {
        this.a = i;
    }

    public static teb a(ampq ampqVar, ampq ampqVar2, axnm axnmVar) {
        teb tebVar;
        if (!((Boolean) ampqVar2.e(false)).booleanValue()) {
            tebVar = (teb) ampqVar.e(new tgf());
        } else if (ampqVar.h()) {
            HashSet hashSet = new HashSet();
            hashSet.add((teb) axnmVar.get());
            hashSet.add((teb) ampqVar.c());
            tebVar = new srl(hashSet);
        } else {
            tebVar = (teb) axnmVar.get();
        }
        czq.a = new thb(tebVar);
        axzl.o(tebVar);
        return tebVar;
    }

    public static tcw b(ampq ampqVar) {
        return (tcw) ampqVar.e(tcw.a);
    }

    public static PerformOnceCommandController c() {
        PerformOnceCommandController performOnceCommandController = tgi.a;
        axzl.o(performOnceCommandController);
        return performOnceCommandController;
    }

    public static ayor d(ampq ampqVar) {
        return (ayor) ampqVar.e(azpj.c());
    }

    public static tfj e(ampq ampqVar, teb tebVar) {
        tfj tfjVar;
        if (ampqVar.h()) {
            tfjVar = (tfj) ampqVar.c();
        } else {
            if (tjk.a == null) {
                tjk.a = new tfr(tebVar);
            }
            tfjVar = tjk.a;
        }
        axzl.o(tfjVar);
        return tfjVar;
    }

    public static wet f(Activity activity, afwc afwcVar, ajmy ajmyVar, yrj yrjVar, afvn afvnVar, azqb azqbVar, yzv yzvVar, whp whpVar, wge wgeVar, aasc aascVar, akbk akbkVar, ajxz ajxzVar, acth acthVar) {
        return new wet(activity, afwcVar, ajmyVar, yrjVar, afvnVar, azqbVar, yzvVar, whpVar, wgeVar, aascVar, akbkVar, ajxzVar, acthVar);
    }

    public static wfc g(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, acth acthVar) {
        return new wfc(context, ajmyVar, ajxzVar, aafoVar, acthVar);
    }

    public static wiy h(Activity activity, Map map) {
        azqb azqbVar = (azqb) map.get(activity.getClass());
        activity.getClass().getName();
        azqbVar.getClass();
        wiy wiyVar = (wiy) azqbVar.get();
        axzl.o(wiyVar);
        return wiyVar;
    }

    public static CopyOnWriteArrayList i() {
        return new CopyOnWriteArrayList();
    }

    public static wmi j() {
        return new wmi();
    }

    public static wmn k() {
        return new wmn();
    }

    public static wng l() {
        return new wng();
    }

    public static wro m() {
        return new wro();
    }

    public static wrs n() {
        return new wrs();
    }

    public static wrv o() {
        return new wrv();
    }

    public static wst p() {
        return new wst(1);
    }

    public static wrx q() {
        return new wrx(1);
    }

    public static wrz r() {
        return new wrz(1);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                return new zgi(1);
            case 6:
                return new voj();
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                return i();
            case 11:
                return j();
            case 12:
                return k();
            case 13:
                return l();
            case 14:
                return new wnp();
            case 15:
                return m();
            case 16:
                return p();
            case 17:
                return q();
            case 18:
                return n();
            case 19:
                return r();
            default:
                return o();
        }
    }
}
