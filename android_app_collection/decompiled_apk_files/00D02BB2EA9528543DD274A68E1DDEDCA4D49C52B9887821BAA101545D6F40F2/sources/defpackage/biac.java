package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: biac  reason: default package */
/* loaded from: classes3.dex */
public class biac implements bhzu {
    public final ges a;
    private final ff b;
    private final amfi c;
    private final axwy d;
    private final bwrs<ilo> e;
    private final List<bhzv> f = new ArrayList();
    @dzsi
    private decq g;

    public biac(ff ffVar, amfi amfiVar, axwy axwyVar, ges gesVar, bwrs<ilo> bwrsVar) {
        this.b = ffVar;
        this.c = amfiVar;
        this.d = axwyVar;
        this.e = bwrsVar;
        this.a = gesVar;
    }

    @Override // defpackage.bhzu
    public synchronized List<bhzv> a() {
        return this.f;
    }

    @Override // defpackage.bhzu
    public String b() {
        dndr dndrVar = dndr.WORK;
        ilo c = this.e.c();
        dbsk.s(c);
        if (dndrVar == c.bj()) {
            return this.b.getString(R.string.ALIAS_STICKER_WORK_SELECTION_HEADER);
        }
        return this.b.getString(R.string.ALIAS_STICKER_HOME_SELECTION_HEADER);
    }

    @Override // defpackage.bhzu
    public String c() {
        return this.b.getString(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.bhzu
    public String d() {
        return this.b.getString(R.string.SAVE);
    }

    @Override // defpackage.bhzu
    public cqkl e() {
        this.b.g().e();
        return cqkl.a;
    }

    @Override // defpackage.bhzu
    public cqkl f() {
        if (g().booleanValue()) {
            biaa biaaVar = new biaa(this);
            biab biabVar = new biab(this.e, this.g);
            axwy axwyVar = this.d;
            ilo c = this.e.c();
            dbsk.s(c);
            dndr bj = c.bj();
            dbsk.s(bj);
            decq decqVar = this.g;
            ilo c2 = this.e.c();
            dbsk.s(c2);
            String B = c2.B();
            ilo c3 = this.e.c();
            dbsk.s(c3);
            String o = c3.ai().o();
            ilo c4 = this.e.c();
            dbsk.s(c4);
            axwyVar.aa(bj, 0L, decqVar, B, o, c4.aj(), biaaVar, biabVar, dtxj.aj);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhzu
    public Boolean g() {
        return Boolean.valueOf(this.g != null);
    }

    @Override // defpackage.bhzu
    public synchronized Boolean h() {
        if (!this.f.isEmpty()) {
            for (bhzv bhzvVar : this.f) {
                if (!bhzvVar.g().booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bhzu
    public cjtd i() {
        return cjtd.a(dtxj.ah);
    }

    @Override // defpackage.bhzu
    public cjtd j() {
        return cjtd.a(dtxj.ai);
    }

    @Override // defpackage.bhzu
    public cjtd k() {
        return cjtd.a(dtxj.aj);
    }

    public synchronized void l(decq decqVar) {
        this.g = decqVar;
        for (bhzv bhzvVar : this.f) {
            bhzvVar.c(Boolean.valueOf(bhzvVar.b().equals(this.g)));
        }
    }

    public void m() {
        cqkx.p(this);
    }

    public synchronized void n(dukf dukfVar) {
        biag biagVar = new biag(decq.a, this.b.getString(R.string.NO_STICKER), this.c, this);
        this.f.add(biagVar);
        biagVar.k();
        int i = 1;
        for (dukd dukdVar : dukfVar.a) {
            biag biagVar2 = new biag(decq.a(dukdVar.a), this.b.getString(R.string.STICKER, new Object[]{Integer.valueOf(i)}), this.c, this);
            this.f.add(biagVar2);
            biagVar2.k();
            i++;
        }
    }

    public synchronized void o(biag biagVar) {
        this.f.remove(biagVar);
    }

    public String p(String str) {
        return this.b.getString(R.string.ACCESSIBILITY_STICKER_SELECTED, new Object[]{str});
    }
}
