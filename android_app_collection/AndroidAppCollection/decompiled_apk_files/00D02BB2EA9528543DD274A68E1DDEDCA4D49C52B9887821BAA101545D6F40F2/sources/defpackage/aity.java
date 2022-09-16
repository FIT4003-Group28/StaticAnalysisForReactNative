package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aity  reason: default package */
/* loaded from: classes2.dex */
public class aity implements aivg {
    public aink a;
    @dzsi
    public akqq b;
    public dkog c;
    public boolean d = j();
    private final aito e;
    private final cqat f;
    private final Resources g;
    private final DateFormat h;

    public aity(aink ainkVar, aito aitoVar, cqat cqatVar, DateFormat dateFormat, dkog dkogVar, Resources resources, @dzsi akqq akqqVar) {
        this.a = ainkVar;
        this.e = aitoVar;
        this.f = cqatVar;
        this.h = dateFormat;
        this.g = resources;
        this.b = akqqVar;
        this.c = dkogVar;
    }

    @Override // defpackage.aivg
    public CharSequence a() {
        return this.a.m().a() ? this.a.m().b().i().c("") : "";
    }

    @Override // defpackage.aivg
    public Boolean b() {
        return false;
    }

    @Override // defpackage.aivg
    public Boolean c() {
        boolean z = false;
        if (this.a.l().a() && this.a.l().b().c().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aivg
    public CharSequence d() {
        if (c().booleanValue()) {
            return ajsb.a(this.g, alp.a(), R.string.MOD_PERSON_CARD_TO_JOURNEY_DESTINATION, this.a.l().b().c().b().a().k().p());
        }
        return "";
    }

    @Override // defpackage.aivg
    public CharSequence e() {
        int E;
        if (c().booleanValue()) {
            ahvg b = this.a.l().b();
            ahvj b2 = this.a.l().b().c().b();
            doek doekVar = b.b().f;
            if (doekVar == null) {
                doekVar = doek.f;
            }
            doqt doqtVar = doekVar.c;
            if (doqtVar == null) {
                doqtVar = doqt.k;
            }
            dgas dgasVar = doqtVar.h;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            if ((dgasVar.a & 1) == 0) {
                return "";
            }
            dkof dkofVar = this.c.q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            if (dkofVar.d) {
                E = b2.a().z();
            } else {
                E = b2.a().E();
            }
            long b3 = this.f.b();
            long j = b.l(aiua.v(this.f)).b().b;
            return ajsb.a(this.g, alp.a(), R.string.JOURNEY_SHARING_ETA_DESCRIPTION, this.h.format(Long.valueOf((b3 - j) + TimeUnit.SECONDS.toMillis(E))));
        }
        return "";
    }

    @Override // defpackage.aivg
    public Boolean f() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aivg
    public cqkl g() {
        amvh l;
        if (f().booleanValue()) {
            airr airrVar = (airr) this.e;
            if (airrVar.aX()) {
                aink ainkVar = airrVar.aU;
                dbsk.s(ainkVar);
                if (!ainkVar.d().isEmpty()) {
                    amvg P = amvh.P();
                    aink ainkVar2 = airrVar.aU;
                    dbsk.s(ainkVar2);
                    if (ainkVar2.l().a()) {
                        aink ainkVar3 = airrVar.aU;
                        dbsk.s(ainkVar3);
                        if (ainkVar3.l().b().c().a()) {
                            aink ainkVar4 = airrVar.aU;
                            dbsk.s(ainkVar4);
                            dbsg<ahvj> c = ainkVar4.l().b().c();
                            dkof dkofVar = airrVar.aX.q;
                            if (dkofVar == null) {
                                dkofVar = dkof.s;
                            }
                            if (dkofVar.d) {
                                l = c.b().a().k();
                            } else {
                                l = c.b().a().l();
                            }
                            P.b = l.c;
                            P.d = l.e;
                            qcw x = qcx.x();
                            x.u(P.a());
                            airrVar.as.a().m(x.a());
                        }
                    }
                    aink ainkVar5 = airrVar.aU;
                    dbsk.s(ainkVar5);
                    if (ainkVar5.m().a()) {
                        aink ainkVar6 = airrVar.aU;
                        dbsk.s(ainkVar6);
                        dbsg<dhjz> n = ainkVar6.n();
                        aink ainkVar7 = airrVar.aU;
                        dbsk.s(ainkVar7);
                        dnol dnolVar = ainkVar7.m().b().b().d;
                        if (dnolVar == null) {
                            dnolVar = dnol.g;
                        }
                        P.b = dnolVar.e;
                        if (n.a()) {
                            P.d(akra.e(n.b().c, n.b().b));
                        }
                    }
                    qcw x2 = qcx.x();
                    x2.u(P.a());
                    airrVar.as.a().m(x2.a());
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aivg
    public cjtd h() {
        return cjtd.a(c().booleanValue() ? dtxu.eV : dtxu.eS);
    }

    @Override // defpackage.aivg
    public cjtd i() {
        return cjtd.a(c().booleanValue() ? dtxu.eW : dtxu.eT);
    }

    public final boolean j() {
        akqq akqqVar;
        if (!this.a.n().a()) {
            return false;
        }
        if (this.b == null) {
            return true;
        }
        if (this.a.l().a()) {
            ahvj b = this.a.l().b().c().b();
            dkof dkofVar = this.c.q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            if (dkofVar.d) {
                akqqVar = b.a().k().e;
            } else {
                akqqVar = b.a().l().e;
            }
            if (akqqVar == null) {
                return false;
            }
            akqq akqqVar2 = this.b;
            dbsk.s(akqqVar2);
            return ((long) ((int) akqo.e(akqqVar2, akqqVar))) >= this.c.R;
        }
        dhjz b2 = this.a.n().b();
        if (b2 == null) {
            return false;
        }
        akqq akqqVar3 = this.b;
        dbsk.s(akqqVar3);
        return ((long) ((int) akqo.e(akqqVar3, new akqq(b2.c, b2.b)))) >= this.c.S;
    }
}
