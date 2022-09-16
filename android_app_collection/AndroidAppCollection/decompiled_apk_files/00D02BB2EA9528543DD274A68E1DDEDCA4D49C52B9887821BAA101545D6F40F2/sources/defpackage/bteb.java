package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bteb  reason: default package */
/* loaded from: classes4.dex */
public final class bteb implements degu<dbsg<diz>> {
    final /* synthetic */ TwoStatePreference a;
    final /* synthetic */ PreferenceGroup b;
    final /* synthetic */ btem c;

    public bteb(btem btemVar, TwoStatePreference twoStatePreference, PreferenceGroup preferenceGroup) {
        this.c = btemVar;
        this.a = twoStatePreference;
        this.b = preferenceGroup;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = btem.aA;
        this.b.ak(this.a);
        if (this.b.n() == 0) {
            this.c.d().ak(this.b);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<diz> dbsgVar) {
        if (!dbsgVar.a()) {
            this.b.ak(this.a);
            if (this.b.n() != 0) {
                return;
            }
            this.c.d().ak(this.b);
            return;
        }
        final btem btemVar = this.c;
        TwoStatePreference twoStatePreference = this.a;
        if (btemVar.at.a()) {
            final cjql d = btemVar.ap.g().d(cjtd.a(dtxw.D));
            twoStatePreference.m(btemVar.at.b().b().a().e);
            twoStatePreference.J(new aub(btemVar, d) { // from class: btea
                private final btem a;
                private final cjql b;

                {
                    this.a = btemVar;
                    this.b = d;
                }

                @Override // defpackage.aub
                public final boolean a(Preference preference, Object obj) {
                    btem btemVar2 = this.a;
                    cjql cjqlVar = this.b;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    cjqy cjqyVar = btemVar2.ao;
                    cjte cjteVar = new cjte(deaf.TAP);
                    cjta b = cjtd.b();
                    b.d = dtxw.D;
                    ddzy bZ = deab.c.bZ();
                    deaa deaaVar = booleanValue ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    deab deabVar = (deab) bZ.b;
                    deabVar.b = deaaVar.d;
                    deabVar.a |= 1;
                    b.a = bZ.bK();
                    cjqyVar.n(cjqlVar, cjteVar, b.a());
                    arla b2 = btemVar2.at.b().b();
                    arkz a = b2.a();
                    dsqp dsqpVar = (dsqp) a.cu(5);
                    dsqpVar.bC(a);
                    arky arkyVar = (arky) dsqpVar;
                    if (arkyVar.c) {
                        arkyVar.bF();
                        arkyVar.c = false;
                    }
                    arkz arkzVar = (arkz) arkyVar.b;
                    arkz arkzVar2 = arkz.g;
                    arkzVar.a |= 8;
                    arkzVar.e = booleanValue;
                    b2.b(arkyVar.bK());
                    return true;
                }
            });
        }
        this.a.B(true);
        this.b.B(true);
    }
}
