package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bhjf  reason: default package */
/* loaded from: classes3.dex */
public class bhjf extends bmya {
    bwrs<ilo> a;
    private final btvo i;
    private final bvjj j;
    private final dxio<apyz> k;
    private final dxio<bhjg> l;
    private final bhhf m;
    private final dxio<bmdw> n;

    public bhjf(Activity activity, cqhn cqhnVar, btvo btvoVar, bvjj bvjjVar, dxio<apyz> dxioVar, dxio<begg> dxioVar2, dxio<bmdw> dxioVar3, dxio<bhjg> dxioVar4, bhhf bhhfVar) {
        super(activity, dxioVar2);
        this.a = bwrs.a(null);
        this.f = Integer.MAX_VALUE;
        this.i = btvoVar;
        this.j = bvjjVar;
        this.k = dxioVar;
        this.l = dxioVar4;
        this.m = bhhfVar;
        this.n = dxioVar3;
    }

    private final cjtd s(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ilo c = this.a.c();
        if (c != null) {
            ddes bZ = ddet.D.bZ();
            ddeo bZ2 = ddep.f.bZ();
            dtbk g = c.ai().g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddep ddepVar = (ddep) bZ2.b;
            g.getClass();
            ddepVar.b = g;
            ddepVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = bZ2.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a |= 1;
            b.s(bZ.bK());
        }
        return b.a();
    }

    private final void v() {
        this.l.a().a(this.a.c());
        cqkx.p(this);
    }

    @Override // defpackage.bmya
    protected final boolean a() {
        if (this.g == jjn.FULLY_EXPANDED && this.f == 0 && !this.c) {
            this.c = true;
            if (b().booleanValue() && !this.d) {
                r();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.bmya, defpackage.bmxw
    public Boolean b() {
        ilo c;
        boolean z = false;
        if (super.b().booleanValue() && this.i.getBusinessMessagingParameters().g && ((this.k.a().p(this.a.c()) || this.n.a().c()) && (c = this.a.c()) != null && !this.j.C(bvjk.ix, new HashSet()).contains(c.ai().o()) && !this.m.b(this.a))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmxw
    public String c() {
        if (this.i.getBusinessMessagingParameters().k) {
            return this.b.getString(R.string.MESSAGING_TOAST_PROMO_HEADER_CONTACT);
        }
        return this.b.getString(R.string.MESSAGING_TOAST_PROMO_HEADER);
    }

    @Override // defpackage.bmxw
    public String d() {
        ilo c = this.a.c();
        if (c == null || !c.cI()) {
            return "";
        }
        dpoa cJ = c.cJ();
        dbsk.s(cJ);
        if ((cJ.a & 1) == 0) {
            return "";
        }
        dpoa cJ2 = c.cJ();
        dbsk.s(cJ2);
        return cJ2.c;
    }

    @Override // defpackage.bmxw
    public String e() {
        if (this.i.getBusinessMessagingParameters().k) {
            return this.b.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_CONTACT);
        }
        return this.b.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_MESSAGE);
    }

    @Override // defpackage.bmxw
    public cqkl f() {
        v();
        return cqkl.a;
    }

    @Override // defpackage.bmxw
    public cjtd h() {
        return s(dtxv.dG);
    }

    @Override // defpackage.bmxw
    public cjtd i() {
        return s(dtxv.dH);
    }

    @Override // defpackage.bmxw
    public cqkl j() {
        v();
        if (this.a.c() != null) {
            if (this.k.a().o()) {
                ilo c = this.a.c();
                dbsk.s(c);
                this.k.a().m(c, apzb.PLACEPAGE_TOAST_PROMO);
            } else {
                this.n.a().d();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bmxw
    @dzsi
    public cqtd k() {
        return null;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
        if (bwrsVar.c() != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            this.n.a().a(c);
            if (!this.c) {
                return;
            }
            this.f = Integer.MAX_VALUE;
            this.c = false;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.a = bwrs.a(null);
    }
}
