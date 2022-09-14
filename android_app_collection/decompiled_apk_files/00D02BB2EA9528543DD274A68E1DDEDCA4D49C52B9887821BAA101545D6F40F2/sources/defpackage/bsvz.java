package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bsvz  reason: default package */
/* loaded from: classes4.dex */
public final class bsvz extends bszv {
    public Context ad;
    public bvjj ae;
    public dbsg<czw> af;
    public Executor ag;

    public static void aT(dehn<Void> dehnVar) {
        deha.q(dehnVar, new bsvy(), dege.a);
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(bsud.LIVE_VIEW_OPTIONS);
    }

    public final void aS(PreferenceScreen preferenceScreen, final czw czwVar, dtm dtmVar) {
        if (!this.aX) {
            return;
        }
        Preference preference = new Preference(this.ad);
        preference.s("Clear ALL settings");
        preference.o = new auc(this, czwVar) { // from class: bsvo
            private final bsvz a;
            private final czw b;

            {
                this.a = this;
                this.b = czwVar;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference2) {
                bsvz bsvzVar = this.a;
                bsvz.aT(this.b.d());
                bsvzVar.ae.P(bvjk.iu);
                bsvzVar.J().g().e();
                return true;
            }
        };
        preferenceScreen.aj(preference);
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.ad);
        ((PreferenceGroup) preferenceCategory).c = true;
        preferenceCategory.s(Rp(bsud.LIVE_VIEW_OPTIONAL_FEATURES));
        preferenceScreen.aj(preferenceCategory);
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat.s(Rp(bsud.LIVE_VIEW_ENABLE_LIGHOUSE_ENTRY_POINT));
        switchPreferenceCompat.m(dtmVar.c);
        switchPreferenceCompat.n = new aub(this, czwVar) { // from class: bsvp
            private final bsvz a;
            private final czw b;

            {
                this.a = this;
                this.b = czwVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference2, final Object obj) {
                bsvz.aT(this.b.c(new dbrn(obj) { // from class: bsvw
                    private final Object a;

                    {
                        this.a = obj;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Object obj3 = this.a;
                        dtm dtmVar2 = (dtm) obj2;
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        if (dtlVar.c) {
                            dtlVar.bF();
                            dtlVar.c = false;
                        }
                        dtm dtmVar3 = (dtm) dtlVar.b;
                        dtm dtmVar4 = dtm.g;
                        dtmVar3.a |= 2;
                        dtmVar3.c = booleanValue;
                        return dtlVar.bK();
                    }
                }, this.a.ag));
                return true;
            }
        };
        preferenceCategory.aj(switchPreferenceCompat);
        SwitchPreferenceCompat switchPreferenceCompat2 = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat2.s(Rp(bsud.LIVE_VIEW_ENABLE_CALIBRATOR_ENTRY_POINT));
        switchPreferenceCompat2.m(dtmVar.d);
        switchPreferenceCompat2.n = new aub(this, czwVar) { // from class: bsvq
            private final bsvz a;
            private final czw b;

            {
                this.a = this;
                this.b = czwVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference2, final Object obj) {
                bsvz.aT(this.b.c(new dbrn(obj) { // from class: bsvv
                    private final Object a;

                    {
                        this.a = obj;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Object obj3 = this.a;
                        dtm dtmVar2 = (dtm) obj2;
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        if (dtlVar.c) {
                            dtlVar.bF();
                            dtlVar.c = false;
                        }
                        dtm dtmVar3 = (dtm) dtlVar.b;
                        dtm dtmVar4 = dtm.g;
                        dtmVar3.a |= 4;
                        dtmVar3.d = booleanValue;
                        return dtlVar.bK();
                    }
                }, this.a.ag));
                return true;
            }
        };
        preferenceCategory.aj(switchPreferenceCompat2);
        SwitchPreferenceCompat switchPreferenceCompat3 = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat3.s(Rp(bsud.LIVE_VIEW_ENABLE_CALIBRATOR_MAP_TRACKING));
        switchPreferenceCompat3.m(dtmVar.e);
        switchPreferenceCompat3.n = new aub(this, czwVar) { // from class: bsvr
            private final bsvz a;
            private final czw b;

            {
                this.a = this;
                this.b = czwVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference2, final Object obj) {
                bsvz.aT(this.b.c(new dbrn(obj) { // from class: bsvu
                    private final Object a;

                    {
                        this.a = obj;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Object obj3 = this.a;
                        dtm dtmVar2 = (dtm) obj2;
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        if (dtlVar.c) {
                            dtlVar.bF();
                            dtlVar.c = false;
                        }
                        dtm dtmVar3 = (dtm) dtlVar.b;
                        dtm dtmVar4 = dtm.g;
                        dtmVar3.a |= 8;
                        dtmVar3.e = booleanValue;
                        return dtlVar.bK();
                    }
                }, this.a.ag));
                return true;
            }
        };
        preferenceCategory.aj(switchPreferenceCompat3);
        SwitchPreferenceCompat switchPreferenceCompat4 = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat4.s(Rp(bsud.LIVE_VIEW_FAKE_LOCALIZATION_SUCCESS));
        switchPreferenceCompat4.m(dtmVar.f);
        switchPreferenceCompat4.n = new aub(this, czwVar) { // from class: bsvs
            private final bsvz a;
            private final czw b;

            {
                this.a = this;
                this.b = czwVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference2, final Object obj) {
                bsvz.aT(this.b.c(new dbrn(obj) { // from class: bsvt
                    private final Object a;

                    {
                        this.a = obj;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Object obj3 = this.a;
                        dtm dtmVar2 = (dtm) obj2;
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        if (dtlVar.c) {
                            dtlVar.bF();
                            dtlVar.c = false;
                        }
                        dtm dtmVar3 = (dtm) dtlVar.b;
                        dtm dtmVar4 = dtm.g;
                        dtmVar3.a |= 16;
                        dtmVar3.f = booleanValue;
                        return dtlVar.bK();
                    }
                }, this.a.ag));
                return true;
            }
        };
        preferenceCategory.aj(switchPreferenceCompat4);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        this.b.d(bvjj.a);
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        deha.q(((czw) ((dbsu) this.af).a).b(), new bsvx(this, b), this.ag);
    }
}
