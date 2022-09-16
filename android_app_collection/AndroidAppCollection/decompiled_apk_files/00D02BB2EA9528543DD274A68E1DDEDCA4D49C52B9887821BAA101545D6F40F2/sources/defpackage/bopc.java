package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bopc  reason: default package */
/* loaded from: classes3.dex */
public class bopc implements boql {
    private static final dcqe b = dcqe.c("bopc");
    public final bopb a;
    private final bwrs<ilo> c;
    private final dqgh d;
    private final Activity e;
    private final dnvs f;
    private final int g;
    private final bmdq h;
    private final boolean i;
    @dzsi
    private final String j;
    private final bydk k;
    private boolean l = false;
    private boolean m = false;

    public bopc(bopb bopbVar, bwrs<ilo> bwrsVar, dqgh dqghVar, Activity activity, bmdq bmdqVar) {
        dnvs dnvsVar;
        this.a = bopbVar;
        this.c = bwrsVar;
        this.d = dqghVar;
        this.e = activity;
        this.h = bmdqVar;
        boolean z = false;
        this.k = new bydk(activity);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        dobr cy = c.cy();
        int i = -1;
        if (cy != null) {
            dsrj<dnvs> dsrjVar = cy.b;
            for (int i2 = 0; i2 < dsrjVar.size(); i2++) {
                dnvsVar = dsrjVar.get(i2);
                dqgh b2 = dqgh.b(dnvsVar.b.get(0).b);
                if ((b2 == null ? dqgh.UNDEFINED : b2) == dqghVar) {
                    i = i2;
                    break;
                }
            }
        }
        dnvsVar = null;
        this.g = i;
        if (dnvsVar == null) {
            bvoo.h("Tried to create edit card, but there were no pending attribute reports of that type", new Object[0]);
            this.f = dnvs.d;
        } else {
            this.f = dnvsVar;
        }
        List<String> Q = c.Q();
        if (!Q.isEmpty()) {
            this.i = true;
            this.j = Q.get(0);
            return;
        }
        this.i = dqghVar == dqgh.PHONE_NUMBER ? true : z;
        this.j = null;
    }

    @dzsi
    private final String s(Boolean bool) {
        if (bool.booleanValue()) {
            if (!j().booleanValue() || !f().booleanValue()) {
                return this.j;
            }
            dnfe dnfeVar = this.f.b.get(0).c;
            if (dnfeVar == null) {
                dnfeVar = dnfe.p;
            }
            return dnfeVar.c;
        } else if (!j().booleanValue()) {
            return null;
        } else {
            dnfe dnfeVar2 = this.f.b.get(0).d;
            if (dnfeVar2 == null) {
                dnfeVar2 = dnfe.p;
            }
            return dnfeVar2.c;
        }
    }

    @Override // defpackage.boql
    public CharSequence a() {
        if (r().booleanValue()) {
            dqgh dqghVar = dqgh.UNDEFINED;
            int ordinal = this.d.ordinal();
            if (ordinal == 1) {
                return this.e.getString(R.string.FACTUAL_MODERATION_NAME_QUESTION);
            }
            if (ordinal == 4) {
                return this.e.getString(R.string.FACTUAL_MODERATION_ADDRESS_QUESTION);
            }
            if (ordinal == 5) {
                return this.e.getString(R.string.FACTUAL_MODERATION_CATEGORY_QUESTION);
            }
            if (ordinal == 6) {
                return this.e.getString(R.string.FACTUAL_MODERATION_WEBSITE_QUESTION);
            }
            if (ordinal == 18) {
                return this.e.getString(R.string.FACTUAL_MODERATION_PHONE_QUESTION);
            }
            if (ordinal == 19) {
                return this.e.getString(R.string.FACTUAL_MODERATION_HOURS_QUESTION);
            }
            return this.e.getString(R.string.IS_THIS_RIGHT);
        } else if ((this.f.b.get(0).a & 2) == 0 || this.d == dqgh.BUSINESS_HOURS) {
            return this.e.getString(R.string.IS_THIS_RIGHT);
        } else {
            return this.e.getString(R.string.KNOW_WHICH_IS_RIGHT);
        }
    }

    @Override // defpackage.boql
    public CharSequence b() {
        String string;
        String string2;
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal == 1) {
            string = this.e.getString(R.string.SUGGESTED_NEW_NAME);
        } else if (ordinal == 4) {
            string = this.e.getString(R.string.SUGGESTED_NEW_ADDRESS);
        } else if (ordinal == 5) {
            string = this.e.getString(R.string.SUGGESTED_NEW_CATEGORY);
        } else if (ordinal == 6) {
            string = this.e.getString(R.string.SUGGESTED_NEW_WEBSITE);
        } else if (ordinal == 18) {
            string = this.e.getString(R.string.SUGGESTED_NEW_PHONE);
        } else if (ordinal == 19) {
            string = this.e.getString(R.string.SUGGESTED_NEW_HOURS);
        } else {
            string = this.e.getString(R.string.SUGGESTED_CHANGE);
        }
        dnvr dnvrVar = this.f.b.get(0);
        if (this.d == dqgh.BUSINESS_HOURS) {
            string2 = "";
        } else if ((dnvrVar.a & 2) == 0) {
            string2 = this.e.getString(R.string.TAP_IT_IF_RIGHT);
        } else {
            string2 = this.e.getString(R.string.TAP_ONE_IF_RIGHT);
        }
        return string2.isEmpty() ? string : this.e.getString(R.string.MODERATION_CARD_SUBTITLE, new Object[]{string, string2});
    }

    @Override // defpackage.boql
    public CharSequence c() {
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal != 1) {
            if (ordinal == 4) {
                return this.e.getString(R.string.CURRENT_ADDRESS);
            }
            if (ordinal == 5) {
                return this.e.getString(R.string.CURRENT_CATEGORY);
            }
            if (ordinal == 6) {
                return this.e.getString(R.string.CURRENT_WEBSITE);
            }
            if (ordinal == 18) {
                return this.e.getString(R.string.CURRENT_PHONE);
            }
            if (ordinal == 19) {
                return this.e.getString(R.string.CURRENT_HOURS);
            }
            return this.e.getString(R.string.VOTE_CURRENT);
        }
        return this.e.getString(R.string.CURRENT_NAME);
    }

    @Override // defpackage.boql
    public CharSequence d() {
        if (r().booleanValue()) {
            return "";
        }
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal == 1) {
            return this.e.getString(R.string.SUGGESTED_NAME);
        }
        if (ordinal == 4) {
            return this.e.getString(R.string.SUGGESTED_ADDRESS);
        }
        if (ordinal == 5) {
            return this.e.getString(R.string.SUGGESTED_CATEGORY);
        }
        if (ordinal == 6) {
            return this.e.getString(R.string.SUGGESTED_WEBSITE);
        }
        if (ordinal == 18) {
            return this.e.getString(R.string.SUGGESTED_PHONE);
        }
        if (ordinal == 19) {
            return this.e.getString(R.string.SUGGESTED_HOURS);
        }
        return this.e.getString(R.string.VOTE_SUGGESTED);
    }

    @Override // defpackage.boql
    public CharSequence e() {
        dnvr dnvrVar = this.f.b.get(0);
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal != 5) {
            if (ordinal == 19) {
                dnfe dnfeVar = dnvrVar.d;
                if (dnfeVar == null) {
                    dnfeVar = dnfe.p;
                }
                dgsl dgslVar = dnfeVar.l;
                if (dgslVar == null) {
                    dgslVar = dgsl.b;
                }
                ilo c = this.c.c();
                dbsk.s(c);
                return dbrz.f('\n').g(this.k.b(dgslVar, TimeZone.getTimeZone(c.aT())));
            }
            switch (ordinal) {
                case 8:
                    dnfe dnfeVar2 = dnvrVar.d;
                    if (dnfeVar2 == null) {
                        dnfeVar2 = dnfe.p;
                    }
                    if (dnfeVar2.d) {
                        return this.e.getString(R.string.PLACE_STATUS_CLOSED);
                    }
                    return this.e.getString(R.string.RAP_PLACE_IS_OPEN);
                case 9:
                    return this.e.getString(R.string.PLACE_STATUS_DOES_NOT_EXIST);
                case 10:
                    return this.e.getString(R.string.PLACE_STATUS_PRIVATE);
                case 11:
                    return this.e.getString(R.string.PLACE_STATUS_SPAM);
                case 12:
                    return this.e.getString(R.string.PLACE_STATUS_MOVED);
                default:
                    dnfe dnfeVar3 = dnvrVar.d;
                    if (dnfeVar3 == null) {
                        dnfeVar3 = dnfe.p;
                    }
                    return dnfeVar3.c;
            }
        }
        return dnvrVar.g;
    }

    @Override // defpackage.boql
    public Boolean f() {
        boolean z = false;
        dnvr dnvrVar = this.f.b.get(0);
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal != 19) {
            switch (ordinal) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return true;
                default:
                    if ((dnvrVar.a & 2) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
        return false;
    }

    @Override // defpackage.boql
    public Boolean g() {
        boolean z = true;
        if (this.d != dqgh.BUSINESS_HOURS && !r().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boql
    public CharSequence h() {
        dnvr dnvrVar = this.f.b.get(0);
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.d.ordinal();
        if (ordinal != 5) {
            switch (ordinal) {
                case 8:
                    dnfe dnfeVar = dnvrVar.d;
                    if (dnfeVar == null) {
                        dnfeVar = dnfe.p;
                    }
                    if (dnfeVar.d) {
                        return this.e.getString(R.string.RAP_PLACE_IS_OPEN);
                    }
                    return this.e.getString(R.string.PLACE_STATUS_CLOSED);
                case 9:
                case 12:
                    return this.e.getString(R.string.RAP_PLACE_EXISTS);
                case 10:
                    return this.e.getString(R.string.RAP_PLACE_IS_PUBLIC);
                case 11:
                    return this.e.getString(R.string.RAP_PLACE_NOT_SPAM);
                default:
                    dnfe dnfeVar2 = dnvrVar.c;
                    if (dnfeVar2 == null) {
                        dnfeVar2 = dnfe.p;
                    }
                    return dnfeVar2.c;
            }
        }
        return dnvrVar.f;
    }

    @Override // defpackage.boql
    public Boolean i() {
        boolean z = false;
        if (this.i && this.h.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boql
    public Boolean j() {
        return Boolean.valueOf(this.d == dqgh.PHONE_NUMBER);
    }

    @Override // defpackage.boql
    @dzsi
    public CharSequence k(Boolean bool) {
        String s = s(bool);
        if (s == null) {
            return null;
        }
        return this.e.getString(R.string.RAP_CALL_TO_VERIFY_LABEL, new Object[]{s});
    }

    @Override // defpackage.boql
    public cqkl l(Boolean bool) {
        String s = s(bool);
        if (s == null) {
            bvoo.h("Tried to call a non-existent phone number.", new Object[0]);
            return cqkl.a;
        }
        bmdq bmdqVar = this.h;
        Uri parse = Uri.parse(s.length() != 0 ? "tel:".concat(s) : new String("tel:"));
        Activity activity = this.e;
        ilo c = this.c.c();
        dbsk.s(c);
        bmdqVar.e(parse, activity, cjtx.c(2, c, false));
        return cqkl.a;
    }

    @Override // defpackage.boql
    public cqkl m() {
        this.l = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.boql
    public cqkl n(dosq dosqVar) {
        if (dosqVar != dosq.VOTE_ABSTAIN) {
            ilo c = this.c.c();
            dbsk.s(c);
            dvyw h = c.h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            dvya dvyaVar = (dvya) dsqpVar;
            dobr dobrVar = c.h().aF;
            if (dobrVar == null) {
                dobrVar = dobr.g;
            }
            dsqp dsqpVar2 = (dsqp) dobrVar.cu(5);
            dsqpVar2.bC(dobrVar);
            dobg dobgVar = (dobg) dsqpVar2;
            int i = this.g;
            dnvs dnvsVar = this.f;
            dsqp dsqpVar3 = (dsqp) dnvsVar.cu(5);
            dsqpVar3.bC(dnvsVar);
            dnvn dnvnVar = (dnvn) dsqpVar3;
            dnvr dnvrVar = this.f.b.get(0);
            dsqp dsqpVar4 = (dsqp) dnvrVar.cu(5);
            dsqpVar4.bC(dnvrVar);
            dnvq dnvqVar = (dnvq) dsqpVar4;
            if (dnvqVar.c) {
                dnvqVar.bF();
                dnvqVar.c = false;
            }
            dnvr dnvrVar2 = (dnvr) dnvqVar.b;
            dnvr dnvrVar3 = dnvr.h;
            dnvrVar2.e = dosqVar.e;
            dnvrVar2.a |= 8;
            if (dnvnVar.c) {
                dnvnVar.bF();
                dnvnVar.c = false;
            }
            dnvs dnvsVar2 = (dnvs) dnvnVar.b;
            dnvr bK = dnvqVar.bK();
            bK.getClass();
            dnvsVar2.b();
            dnvsVar2.b.set(0, bK);
            if (dobgVar.c) {
                dobgVar.bF();
                dobgVar.c = false;
            }
            dobr dobrVar2 = (dobr) dobgVar.b;
            dnvs bK2 = dnvnVar.bK();
            bK2.getClass();
            dsrj<dnvs> dsrjVar = dobrVar2.b;
            if (!dsrjVar.a()) {
                dobrVar2.b = dsqw.cl(dsrjVar);
            }
            dobrVar2.b.set(i, bK2);
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dobr bK3 = dobgVar.bK();
            bK3.getClass();
            dvywVar.aF = bK3;
            dvywVar.c |= 32768;
            ily g = c.g();
            g.E(dvyaVar.bK());
            this.c.d(g.d());
        }
        bopb bopbVar = this.a;
        dnvs dnvsVar3 = this.f;
        String str = dnvsVar3.a;
        dqgh b2 = dqgh.b(dnvsVar3.b.get(0).b);
        if (b2 == null) {
            b2 = dqgh.UNDEFINED;
        }
        bopbVar.b(str, b2, dosqVar);
        return cqkl.a;
    }

    public void o(Boolean bool) {
        this.m = bool.booleanValue();
        cqkx.p(this);
    }

    @Override // defpackage.boql
    public Boolean p() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.boql
    @dzsi
    public cqfc q() {
        if (this.l) {
            return new bopa(this);
        }
        return null;
    }

    @Override // defpackage.boql
    public Boolean r() {
        dnvp dnvpVar = this.f.c;
        if (dnvpVar == null) {
            dnvpVar = dnvp.c;
        }
        return Boolean.valueOf(dnvpVar.b);
    }
}
