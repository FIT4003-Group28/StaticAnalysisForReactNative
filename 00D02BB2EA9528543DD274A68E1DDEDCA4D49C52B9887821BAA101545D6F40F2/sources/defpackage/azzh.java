package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azzh  reason: default package */
/* loaded from: classes3.dex */
public final class azzh extends azwm<azzh> {
    public static final /* synthetic */ int a = 0;
    private static final dclu<donb> c = dclu.f(donb.EXPLICIT, donb.INFERRED, donb.DEFAULT);
    private final bvrt<dong> b;

    public azzh(azzg azzgVar) {
        super(azzgVar);
        this.b = bvrt.b(azzgVar.a);
    }

    public static azzh g() {
        return new azzg(dong.d).b();
    }

    public static domy j(done doneVar, btvo btvoVar) {
        dbsg<V> h = n(doneVar, btvoVar).h(azyi.a);
        domy b = domy.b(doneVar.b);
        if (b == null) {
            b = domy.UNKNOWN_TRAVEL_MODE;
        }
        return (domy) h.c(b);
    }

    public static donb k(done doneVar, btvo btvoVar) {
        dbsg<V> h = n(doneVar, btvoVar).h(azyj.a);
        donb b = donb.b(doneVar.c);
        if (b == null) {
            b = donb.UNKNOWN_PROVENANCE;
        }
        return (donb) h.c(b);
    }

    public static domy l(done doneVar, btvo btvoVar) {
        return (domy) n(doneVar, btvoVar).h(azyk.a).c(domy.DRIVE);
    }

    public static donb m(done doneVar, btvo btvoVar) {
        return (donb) n(doneVar, btvoVar).h(azyl.a).c(donb.DEFAULT);
    }

    public static dbsg<dond> n(done doneVar, final btvo btvoVar) {
        return dcft.m(dcbg.b(doneVar.d).o(azyn.a).o(azym.a).o(new dbsl(btvoVar) { // from class: azyo
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                btvo btvoVar2 = this.a;
                dond dondVar = (dond) obj;
                int i = azzh.a;
                dktt dkttVar = btvoVar2.getPassiveAssistParameters().a().am;
                if (dkttVar == null) {
                    dkttVar = dktt.z;
                }
                if (dkttVar.s) {
                    return true;
                }
                donb b = donb.b(dondVar.b);
                if (b == null) {
                    b = donb.UNKNOWN_PROVENANCE;
                }
                return b != donb.INFERRED;
            }
        }).A(c.g(azyp.a)), azyq.a);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        return "User Parameters";
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azzh> h() {
        return azxm.d;
    }

    public final dong o() {
        return this.b.e((dssr) dong.d.cu(7), dong.d);
    }

    @Override // defpackage.azwm
    /* renamed from: v */
    public final azzg i() {
        return new azzg(this);
    }
}
