package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bszs  reason: default package */
/* loaded from: classes4.dex */
public final class bszs extends bszv {
    public Context ad;
    public bvjj ae;
    public dbsg<arkb> af;
    public dbsg<dap> ag;
    public dbsg<czw> ah;
    public Executor ai;
    public dxio<Executor> aj;

    public static final void aX(dehn<Void> dehnVar) {
        deha.q(dehnVar, new bszh(), dege.a);
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return "AR Options";
    }

    public final SwitchPreferenceCompat aS(String str, arkz arkzVar, bszq<arkz, Boolean> bszqVar, bszo<arky, Boolean> bszoVar, arla arlaVar) {
        return aT(str, arkzVar, bszqVar, bszoVar, arlaVar, false);
    }

    public final SwitchPreferenceCompat aT(String str, arkz arkzVar, bszq<arkz, Boolean> bszqVar, final bszo<arky, Boolean> bszoVar, final arla arlaVar, final boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat.s(str);
        switchPreferenceCompat.m(bszqVar.a(arkzVar).booleanValue());
        switchPreferenceCompat.n = new aub(this, arlaVar, bszoVar, z) { // from class: bsyr
            private final bszs a;
            private final arla b;
            private final bszo c;
            private final boolean d;

            {
                this.a = this;
                this.b = arlaVar;
                this.c = bszoVar;
                this.d = z;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                bszs bszsVar = this.a;
                arla arlaVar2 = this.b;
                bszo bszoVar2 = this.c;
                boolean z2 = this.d;
                arkz a = arlaVar2.a();
                dsqp dsqpVar = (dsqp) a.cu(5);
                dsqpVar.bC(a);
                arky arkyVar = (arky) dsqpVar;
                bszoVar2.a(arkyVar, (Boolean) obj);
                bszsVar.ae.al(bvjk.iu, arkyVar.bK());
                if (z2) {
                    bszsVar.aj.a().execute(new Runnable() { // from class: bszc
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    });
                    return true;
                }
                return true;
            }
        };
        return switchPreferenceCompat;
    }

    public final SwitchPreferenceCompat aU(String str, dtm dtmVar, bszq<dtm, Boolean> bszqVar, final bszo<dtl, Boolean> bszoVar, final czw czwVar) {
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat.s(str);
        switchPreferenceCompat.m(bszqVar.a(dtmVar).booleanValue());
        switchPreferenceCompat.n = new aub(this, czwVar, bszoVar) { // from class: bsys
            private final bszs a;
            private final czw b;
            private final bszo c;

            {
                this.a = this;
                this.b = czwVar;
                this.c = bszoVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, final Object obj) {
                bszs bszsVar = this.a;
                czw czwVar2 = this.b;
                final bszo bszoVar2 = this.c;
                bszs.aX(czwVar2.c(new dbrn(bszoVar2, obj) { // from class: bszb
                    private final bszo a;
                    private final Object b;

                    {
                        this.a = bszoVar2;
                        this.b = obj;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        bszo bszoVar3 = this.a;
                        Object obj3 = this.b;
                        dtm dtmVar2 = (dtm) obj2;
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        bszoVar3.a(dtlVar, (Boolean) obj3);
                        return dtlVar.bK();
                    }
                }, bszsVar.ai));
                return true;
            }
        };
        return switchPreferenceCompat;
    }

    public final EditTextPreference aV(String str, dtm dtmVar, bszq<dtm, String> bszqVar, final bszo<dtl, String> bszoVar, final czw czwVar) {
        final bszg bszgVar = new bszg(this.ad);
        bszgVar.s(str);
        bszgVar.C(str);
        bszgVar.e(bszqVar.a(dtmVar));
        bszgVar.t = true;
        bszgVar.n = new aub(this, czwVar, bszgVar, bszoVar) { // from class: bsyt
            private final bszs a;
            private final czw b;
            private final EditTextPreference c;
            private final bszo d;

            {
                this.a = this;
                this.b = czwVar;
                this.c = bszgVar;
                this.d = bszoVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, final Object obj) {
                bszs bszsVar = this.a;
                czw czwVar2 = this.b;
                final EditTextPreference editTextPreference = this.c;
                final bszo bszoVar2 = this.d;
                bszs.aX(czwVar2.c(new dbrn(editTextPreference, obj, bszoVar2) { // from class: bsza
                    private final EditTextPreference a;
                    private final Object b;
                    private final bszo c;

                    {
                        this.a = editTextPreference;
                        this.b = obj;
                        this.c = bszoVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        EditTextPreference editTextPreference2 = this.a;
                        Object obj3 = this.b;
                        bszo bszoVar3 = this.c;
                        dtm dtmVar2 = (dtm) obj2;
                        String str2 = (String) obj3;
                        editTextPreference2.e(str2);
                        dsqp dsqpVar = (dsqp) dtmVar2.cu(5);
                        dsqpVar.bC(dtmVar2);
                        dtl dtlVar = (dtl) dsqpVar;
                        bszoVar3.a(dtlVar, str2);
                        return dtlVar.bK();
                    }
                }, bszsVar.ai));
                return true;
            }
        };
        return bszgVar;
    }

    public final bszn aW(PreferenceCategory preferenceCategory, String str, String str2, final bszm bszmVar) {
        final SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat.s(str2);
        switchPreferenceCompat.m(((Boolean) bszmVar.c.a(bszmVar.c())).booleanValue());
        switchPreferenceCompat.n = new aub(bszmVar) { // from class: bsyw
            private final bszm a;

            {
                this.a = bszmVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                this.a.b((Boolean) obj);
                return true;
            }
        };
        if (!switchPreferenceCompat.x) {
            switchPreferenceCompat.x = true;
            switchPreferenceCompat.d();
        }
        switchPreferenceCompat.y(bszmVar.a());
        SwitchPreferenceCompat switchPreferenceCompat2 = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat2.s(str);
        switchPreferenceCompat2.m(bszmVar.a());
        switchPreferenceCompat2.n = new aub(switchPreferenceCompat, bszmVar) { // from class: bsyy
            private final SwitchPreferenceCompat a;
            private final bszm b;

            {
                this.a = switchPreferenceCompat;
                this.b = bszmVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                SwitchPreferenceCompat switchPreferenceCompat3 = this.a;
                bszm bszmVar2 = this.b;
                Boolean bool = (Boolean) obj;
                switchPreferenceCompat3.y(bool.booleanValue());
                if (!bool.booleanValue()) {
                    final bszp<dtd> bszpVar = bszmVar2.b;
                    bszpVar.getClass();
                    bszmVar2.d(new bszi(bszpVar) { // from class: bszk
                        private final bszp a;

                        {
                            this.a = bszpVar;
                        }

                        @Override // defpackage.bszi
                        public final void a(dssi dssiVar) {
                            this.a.a(dssiVar);
                        }
                    });
                    return true;
                }
                bszmVar2.b(Boolean.valueOf(((TwoStatePreference) switchPreferenceCompat3).a));
                return true;
            }
        };
        preferenceCategory.aj(switchPreferenceCompat2);
        preferenceCategory.aj(switchPreferenceCompat);
        return new bszn(switchPreferenceCompat);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        if (!this.af.a()) {
            return;
        }
        this.b.d(bvjj.a);
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        deha.q(((czw) ((dbsu) this.ah).a).b(), new bszf(this, b, this.af.b().b()), this.ai);
    }
}
