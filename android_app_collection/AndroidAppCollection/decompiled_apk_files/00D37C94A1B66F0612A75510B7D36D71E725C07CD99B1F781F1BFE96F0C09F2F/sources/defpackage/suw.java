package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
/* compiled from: PG */
/* renamed from: suw  reason: default package */
/* loaded from: classes4.dex */
public final class suw {
    public static final swr a;
    public static final Handler b;

    static {
        aodq aodqVar = new aodq();
        aodq aodqVar2 = new aodq();
        int i = axmw.d;
        aodqVar2.p(1);
        aodqVar2.k(aodqVar2.c());
        aodqVar.k(aodt.L(aodqVar, aodt.R(aodqVar, 158796327, aodqVar.a(aodqVar2.f().array()), 1), 0, 0, 0));
        a = swr.a(aodt.au(aodqVar.f()), null);
        b = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(cyv cyvVar, dcz dczVar, tdr tdrVar, aypf aypfVar, tdi tdiVar, suv suvVar, ayoi ayoiVar, tda tdaVar, teb tebVar, boolean z, boolean z2) {
        svx svxVar = new svx(tebVar, tdrVar, tdaVar, tdiVar, aypfVar);
        dczVar.a = svxVar;
        e(svxVar, cyvVar, tdaVar, suvVar, ayoiVar, tebVar, z, z2);
        aypfVar.d(svxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(dcz dczVar) {
        Integer num = (Integer) dczVar.a;
        dczVar.a = Integer.valueOf((num == null ? 0 : num.intValue()) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyr c(cyv cyvVar, svx svxVar, aypf aypfVar, suv suvVar, ayoi ayoiVar, tda tdaVar, teb tebVar, tff tffVar, boolean z, boolean z2) {
        cyr a2;
        if (svxVar.g != ayoiVar) {
            if (suvVar != null && (a2 = svxVar.a()) != null) {
                svw svwVar = svxVar.f;
                suv suvVar2 = svwVar != null ? svwVar.a : null;
                if (suvVar2 != null && !svxVar.e() && suvVar.equals(suvVar2)) {
                    return a2.j();
                }
            }
            svxVar.qr();
        }
        if (svxVar.e()) {
            e(svxVar, cyvVar, tdaVar, suvVar, ayoiVar, tebVar, z, z2);
            aypfVar.d(svxVar);
        } else {
            svxVar.d(cyvVar);
        }
        cyr a3 = svxVar.a();
        if (a3 == null) {
            tffVar.e(true);
            return djf.a(cyvVar).a;
        }
        tffVar.e(false);
        return a3.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(tda tdaVar, suv suvVar, azqb azqbVar, azqb azqbVar2) {
        if (((tdc) azqbVar2.get()).b()) {
            awre a2 = awrf.a();
            awrg f = tbs.f(tdaVar);
            a2.copyOnWrite();
            ((awrf) a2.instance).e(f);
            String c = sus.c(suvVar.a.aH());
            a2.copyOnWrite();
            ((awrf) a2.instance).f(c);
            awro a3 = awrp.a();
            aorw e = tbs.e();
            a3.copyOnWrite();
            ((awrp) a3.instance).p(e);
            a3.copyOnWrite();
            ((awrp) a3.instance).l((awrf) a2.mo39build());
            ((DebuggerClient) azqbVar.get()).sendTimelineEvent(((awrp) a3.mo39build()).toByteArray());
        }
    }

    private static void e(svx svxVar, final cyv cyvVar, final tda tdaVar, suv suvVar, ayoi ayoiVar, final teb tebVar, final boolean z, final boolean z2) {
        svxVar.f(ayoiVar, ayoiVar.Y(new ayqe() { // from class: sut
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                teb tebVar2 = teb.this;
                tda tdaVar2 = tdaVar;
                boolean z3 = z2;
                final cyv cyvVar2 = cyvVar;
                boolean z4 = z;
                final Throwable th = (Throwable) obj;
                swr swrVar = suw.a;
                tebVar2.a(29, "Error materializing Component", tdaVar2, th);
                if (z3) {
                    suw.b.post(new Runnable() { // from class: suu
                        @Override // java.lang.Runnable
                        public final void run() {
                            cyv cyvVar3 = cyv.this;
                            Throwable th2 = th;
                            swr swrVar2 = suw.a;
                            Context a2 = cyvVar3.a();
                            String valueOf = String.valueOf(th2.getMessage());
                            Toast.makeText(a2, valueOf.length() != 0 ? "Elements Error (check settings):\n".concat(valueOf) : new String("Elements Error (check settings):\n"), 1).show();
                        }
                    });
                } else if (z4) {
                    Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
                    throw azom.b(th);
                }
                return suw.a;
            }
        }), tdaVar, cyvVar, suvVar);
        svxVar.c();
    }
}
