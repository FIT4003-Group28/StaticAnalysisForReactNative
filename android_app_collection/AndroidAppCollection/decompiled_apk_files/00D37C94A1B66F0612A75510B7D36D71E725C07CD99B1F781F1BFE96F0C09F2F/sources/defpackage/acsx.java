package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acsx  reason: default package */
/* loaded from: classes.dex */
public class acsx implements acti, actz {
    protected final zfq a;
    protected final yni b;
    protected final actm c;
    protected final actr d;
    protected final acuf e;
    protected final acub f;
    protected final Context g;
    protected final aadd h;
    public InteractionLoggingScreen i;
    private final List j;
    private final Map k;
    private final axxb m;
    private final actg n;

    public acsx(zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuf acufVar, Context context, aadd aaddVar, axxb axxbVar) {
        this(zfqVar, yniVar, actmVar, actrVar, acufVar, acul.b, context, aaddVar, axxbVar);
    }

    private final awbs J(Object obj, int i, int i2) {
        if (c() == null) {
            return null;
        }
        acsw acswVar = new acsw(obj, i, i2);
        awbs awbsVar = (awbs) this.k.get(acswVar);
        if (awbsVar != null) {
            return awbsVar;
        }
        awbs A = A(i, i2);
        this.k.put(acswVar, A);
        return A;
    }

    private final boolean K() {
        asvx asvxVar = this.h.a().m;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        aski askiVar = asvxVar.c;
        if (askiVar == null) {
            askiVar = aski.a;
        }
        return askiVar.k;
    }

    protected awbs A(int i, int i2) {
        InteractionLoggingScreen c = c();
        if (c == null) {
            return null;
        }
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        if (i2 <= 0) {
            createBuilder.copyOnWrite();
            awbs awbsVar2 = (awbs) createBuilder.instance;
            awbsVar2.b |= 4;
            awbsVar2.e = 0;
        } else {
            createBuilder.copyOnWrite();
            awbs awbsVar3 = (awbs) createBuilder.instance;
            awbsVar3.b |= 4;
            awbsVar3.e = i2;
        }
        int b = c.b(i);
        createBuilder.copyOnWrite();
        awbs awbsVar4 = (awbs) createBuilder.instance;
        awbsVar4.b |= 8;
        awbsVar4.f = b;
        return (awbs) createBuilder.mo39build();
    }

    @Override // defpackage.acti
    public void B(InteractionLoggingScreen interactionLoggingScreen) {
        this.i = interactionLoggingScreen;
        for (acti actiVar : this.j) {
            actiVar.B(interactionLoggingScreen);
        }
    }

    @Override // defpackage.acti
    /* renamed from: C */
    public final void D(acum acumVar) {
        if (acumVar == null) {
            zep.l("null VE container encountered in logAttachChild");
            return;
        }
        actm actmVar = this.c;
        InteractionLoggingScreen c = c();
        awbs awbsVar = acumVar.a;
        if (!actmVar.m(c, awbsVar)) {
            return;
        }
        int i = c.f;
        actmVar.b(c, actm.a(awbsVar), actm.n(c.f));
    }

    @Override // defpackage.acti
    public final InteractionLoggingScreen F(acup acupVar, acuc acucVar, apzg apzgVar) {
        return e(acupVar, acucVar, apzgVar, null, null);
    }

    @Override // defpackage.acti
    public final void G(aoqu aoquVar, aoob aoobVar, View view) {
        Object tag = view.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof actw) {
            ((actw) tag).b(aoquVar, aoobVar);
        } else {
            view.setTag(R.id.logging_directable_supplier_tag, new actw(aoquVar, aoobVar));
        }
    }

    @Override // defpackage.acti
    public final void H(int i, acum acumVar, asjj asjjVar) {
        String str;
        if (acumVar == null) {
            zep.l("null VE container encountered in logGesture");
            return;
        }
        actm actmVar = this.c;
        InteractionLoggingScreen c = c();
        awbs awbsVar = acumVar.a;
        if (!actmVar.m(c, awbsVar)) {
            return;
        }
        awbs a = actm.a(awbsVar);
        aopa createBuilder = asii.a.createBuilder();
        String str2 = c.a;
        createBuilder.copyOnWrite();
        asii asiiVar = (asii) createBuilder.instance;
        str2.getClass();
        asiiVar.b |= 1;
        asiiVar.c = str2;
        createBuilder.copyOnWrite();
        asii asiiVar2 = (asii) createBuilder.instance;
        asiiVar2.f = i - 1;
        asiiVar2.b |= 8;
        createBuilder.copyOnWrite();
        asii asiiVar3 = (asii) createBuilder.instance;
        a.getClass();
        asiiVar3.d = a;
        asiiVar3.b |= 2;
        if (asjjVar != null && !asjjVar.equals(asjj.a)) {
            createBuilder.copyOnWrite();
            asii asiiVar4 = (asii) createBuilder.instance;
            asiiVar4.e = asjjVar;
            asiiVar4.b |= 4;
        }
        asii asiiVar5 = (asii) createBuilder.mo39build();
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dZ(asiiVar5);
        actmVar.c((arrh) a2.mo39build(), c);
        actp actpVar = actmVar.d;
        if (actpVar.f()) {
            return;
        }
        HashMap hashMap = new HashMap();
        awbs awbsVar2 = asiiVar5.d;
        if (awbsVar2 == null) {
            awbsVar2 = awbs.a;
        }
        hashMap.put("client.params.ve", actp.j(awbsVar2));
        if ((asiiVar5.b & 1) == 0 || asiiVar5.c.isEmpty()) {
            awbs awbsVar3 = asiiVar5.d;
            if (awbsVar3 == null) {
                awbsVar3 = awbs.a;
            }
            String valueOf = String.valueOf(actp.j(awbsVar3));
            str = "INTERACTIONLOGGINGBUG->CLICK_MISSING_CSN";
            actp.l(str, valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
        } else if (!actpVar.a.containsKey(asiiVar5.c)) {
            awbs awbsVar4 = asiiVar5.d;
            if (awbsVar4 == null) {
                awbsVar4 = awbs.a;
            }
            String valueOf2 = String.valueOf(actp.j(awbsVar4));
            str = "INTERACTIONLOGGINGBUG->CLICK_UNRESOLVED_CSN";
            actp.l(str, valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
        } else {
            acto actoVar = (acto) actpVar.a.get(asiiVar5.c);
            awbs awbsVar5 = asiiVar5.d;
            if (awbsVar5 == null) {
                awbsVar5 = awbs.a;
            }
            actpVar.m("CLICK", actoVar, awbsVar5, hashMap);
            boolean z = actpVar.b;
        }
        afus.f(str, hashMap);
        boolean z2 = actpVar.b;
    }

    @Override // defpackage.acti
    /* renamed from: I */
    public final void E(acum acumVar, acum acumVar2) {
        if (acumVar == null || acumVar2 == null) {
            zep.l("null VE container encountered in logAttachChild");
        } else {
            this.c.b(c(), acumVar.a, acumVar2.a);
        }
    }

    @Override // defpackage.acti
    public final actg a() {
        return this.n;
    }

    @Override // defpackage.acti
    public acti b(acul aculVar) {
        acsx acsxVar = new acsx(this.a, this.b, this.c, this.d, this.e, aculVar, this.g, this.h, this.m);
        acsxVar.B(c());
        this.j.add(acsxVar);
        return acsxVar;
    }

    @Override // defpackage.acti, defpackage.actz
    public InteractionLoggingScreen c() {
        return this.i;
    }

    @Override // defpackage.acti
    public InteractionLoggingScreen d(acup acupVar, apzg apzgVar, asjj asjjVar) {
        return e(acupVar, null, apzgVar, asjjVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x05b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    @Override // defpackage.acti
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen e(defpackage.acup r20, defpackage.acuc r21, defpackage.apzg r22, defpackage.asjj r23, defpackage.asjj r24) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsx.e(acup, acuc, apzg, asjj, asjj):com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen");
    }

    @Override // defpackage.acti
    public final apzg f(apzg apzgVar) {
        aopa mo52toBuilder;
        acuf acufVar = this.e;
        InteractionLoggingScreen c = c();
        if (apzgVar == null) {
            return null;
        }
        if (c == null) {
            zep.l("Failed to set parent screen");
            return apzgVar;
        }
        if (!apzgVar.qn(atno.b)) {
            mo52toBuilder = atnp.a.createBuilder();
        } else {
            mo52toBuilder = ((atnp) apzgVar.qm(atno.b)).mo52toBuilder();
        }
        if (((atnp) mo52toBuilder.instance).c.isEmpty()) {
            String str = c.a;
            mo52toBuilder.copyOnWrite();
            atnp atnpVar = (atnp) mo52toBuilder.instance;
            str.getClass();
            atnpVar.b |= 1;
            atnpVar.c = str;
        }
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopcVar.e(atno.b, (atnp) mo52toBuilder.mo39build());
        apzg apzgVar2 = (apzg) aopcVar.mo39build();
        String str2 = ((atnp) mo52toBuilder.instance).c;
        String a = acuf.a(apzgVar2);
        if (a == null) {
            return apzgVar2;
        }
        acufVar.a.put(a, str2);
        return apzgVar2;
    }

    @Override // defpackage.acti
    public final awbs g(Object obj, actj actjVar) {
        if (K()) {
            if (actjVar != null) {
                return h(obj, acuo.b(actjVar.II));
            }
            return null;
        }
        return i(obj, actjVar, -1);
    }

    @Override // defpackage.acti
    public final awbs h(Object obj, acup acupVar) {
        return j(obj, acupVar, -1);
    }

    @Override // defpackage.acti
    public final awbs i(Object obj, actj actjVar, int i) {
        if (actjVar == null) {
            return null;
        }
        if (!K()) {
            return J(obj, actjVar.II, i);
        }
        return j(obj, acuo.b(actjVar.II), i);
    }

    @Override // defpackage.acti
    public final awbs j(Object obj, acup acupVar, int i) {
        return J(obj, acupVar.a, i);
    }

    @Override // defpackage.acti
    @Deprecated
    public String k() {
        return c() == null ? "" : c().a;
    }

    @Override // defpackage.acti
    public final void l(Object obj, acup acupVar, int i) {
        awbs awbsVar;
        int i2 = acupVar.a;
        if (c() == null) {
            return;
        }
        acsw acswVar = new acsw(obj, i2, -1);
        if (this.k.containsKey(acswVar)) {
            return;
        }
        if (c() == null) {
            awbsVar = null;
        } else {
            aopa createBuilder = awbs.a.createBuilder();
            createBuilder.copyOnWrite();
            awbs awbsVar2 = (awbs) createBuilder.instance;
            awbsVar2.b |= 2;
            awbsVar2.d = i2;
            createBuilder.copyOnWrite();
            awbs awbsVar3 = (awbs) createBuilder.instance;
            awbsVar3.b |= 4;
            awbsVar3.e = 0;
            int abs = Math.abs(i);
            createBuilder.copyOnWrite();
            awbs awbsVar4 = (awbs) createBuilder.instance;
            awbsVar4.b |= 8;
            awbsVar4.f = abs;
            awbsVar = (awbs) createBuilder.mo39build();
        }
        this.k.put(acswVar, awbsVar);
    }

    @Override // defpackage.acti
    public final void m(List list) {
        actm actmVar = this.c;
        InteractionLoggingScreen c = c();
        if (!actmVar.l(c)) {
            return;
        }
        awbs n = actm.n(c.f);
        ArrayList<awbs> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            awbs awbsVar = (awbs) it.next();
            if (actmVar.m(c, awbsVar)) {
                awbs a = actm.a(awbsVar);
                if (actmVar.h.c().booleanValue()) {
                    synchronized (actmVar.i) {
                        if (actm.k(a) && c.g(a)) {
                            return;
                        }
                        c.d(a, n);
                    }
                } else if (!actm.k(a) || !c.g(a)) {
                    c.d(a, n);
                }
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        actmVar.d(c, n, arrayList);
        actp actpVar = actmVar.d;
        String str = c.a;
        if (actpVar.f()) {
            return;
        }
        for (awbs awbsVar2 : arrayList) {
            actpVar.b(awbsVar2, n, str);
        }
    }

    @Override // defpackage.acti
    public final void n(acum acumVar) {
        if (acumVar == null) {
            zep.l("null VE container encountered in logAttachVisibleChild");
            return;
        }
        D(acumVar);
        u(acumVar, null);
    }

    @Override // defpackage.acti
    public final void o(acum acumVar, acum acumVar2) {
        if (acumVar2 == null) {
            zep.l("null VE container encountered in logAttachVisibleChild");
            return;
        }
        E(acumVar, acumVar2);
        u(acumVar, null);
    }

    @Override // defpackage.acti
    public final void p(acuc acucVar) {
        if (!this.c.c.d) {
            return;
        }
        InteractionLoggingScreen a = this.d.a(acucVar);
        if (a != null) {
            this.c.e(a);
            this.d.c(a);
        }
        InteractionLoggingScreen a2 = this.d.a(acucVar);
        if (a2 == null) {
            return;
        }
        this.c.f(a2);
    }

    @Override // defpackage.acti
    public final void q(acum acumVar, asjj asjjVar) {
        if (acumVar == null) {
            zep.l("null VE container encountered in logHidden");
        } else if (acumVar.b == null) {
            this.f.d(new GelVisibilityUpdate.HiddenVisibilityUpdate(acumVar.a, asjjVar));
        } else {
            this.f.d(new GelVisibilityUpdate.HiddenVisibilityUpdate(acumVar, asjjVar));
        }
    }

    @Override // defpackage.acti
    public final void r(String str) {
        actm actmVar = this.c;
        InteractionLoggingScreen c = c();
        if (!actmVar.l(c)) {
            return;
        }
        actmVar.o(c, actm.n(c.f), str);
    }

    @Override // defpackage.acti
    public final void s(acum acumVar, String str) {
        this.c.o(c(), acumVar.a, str);
    }

    @Override // defpackage.acti
    public final void t() {
        this.c.p(c(), 17);
        this.d.c(c());
    }

    @Override // defpackage.acti
    public final void u(acum acumVar, asjj asjjVar) {
        acub acubVar = this.f;
        if (acumVar == null) {
            zep.l("null VE container encountered in logShown");
        } else if (acumVar.b != null) {
            acubVar.e(new GelVisibilityUpdate.ShownVisibilityUpdate(acumVar, asjjVar));
        } else {
            awbs awbsVar = acumVar.a;
            if (awbsVar == null) {
                return;
            }
            acua acuaVar = new acua(awbsVar, asjjVar);
            if (acubVar.a.c() == null) {
                return;
            }
            synchronized (acubVar.b) {
                acubVar.b.add(acuaVar);
            }
            acubVar.c();
        }
    }

    @Override // defpackage.acti
    public final void v(aoqu aoquVar, aoob aoobVar, asjj asjjVar) {
        if (aoquVar == null) {
            return;
        }
        asvv b = acun.b(aoquVar);
        if (b != null) {
            this.f.e(new GelVisibilityUpdate.ShownVisibilityUpdate(new actf(b), amuk.o(new aops(b.g, asvv.a)), b.d, asjjVar));
        } else if (aoobVar == null) {
        } else {
            u(new acte(aoobVar), asjjVar);
        }
    }

    @Override // defpackage.acti
    public final void w(acum acumVar, asjj asjjVar) {
        if (acumVar == null) {
            zep.l("null VE container encountered in logStateChange");
            return;
        }
        actm actmVar = this.c;
        InteractionLoggingScreen c = c();
        awbs awbsVar = acumVar.a;
        if (!actmVar.m(c, awbsVar) || asjjVar == null) {
            return;
        }
        actmVar.i(c.a, awbsVar, asjjVar);
    }

    @Override // defpackage.acti
    public final void x(String str, acum acumVar, asjj asjjVar) {
        this.c.i(str, acumVar.a, asjjVar);
    }

    @Override // defpackage.acti
    public void y() {
        this.i = null;
        this.f.b();
        this.k.clear();
        for (acti actiVar : this.j) {
            actiVar.y();
        }
    }

    @Override // defpackage.acti
    public final void z(acuc acucVar, InteractionLoggingScreen interactionLoggingScreen) {
        if (!this.c.c.d) {
            return;
        }
        InteractionLoggingScreen a = this.d.a(acucVar);
        boolean z = false;
        if (a != null) {
            if (a.equals(interactionLoggingScreen)) {
                this.d.c(a);
                a = this.d.a(acucVar);
                z = true;
            }
            this.c.e(a);
        }
        if (interactionLoggingScreen == null) {
            return;
        }
        this.d.d(acucVar, interactionLoggingScreen);
        if (z) {
            return;
        }
        this.c.f(interactionLoggingScreen);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public acsx(zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuf acufVar, acul aculVar, Context context, aadd aaddVar, axxb axxbVar) {
        actmVar.getClass();
        this.c = actmVar;
        zfqVar.getClass();
        this.a = zfqVar;
        yniVar.getClass();
        this.b = yniVar;
        this.f = new acub(actmVar, this, aculVar);
        this.d = actrVar;
        acufVar.getClass();
        this.e = acufVar;
        this.j = new ArrayList();
        this.k = new HashMap();
        this.g = context;
        this.h = aaddVar;
        if (acuo.a.get() <= 0) {
            acuo.a.set(2);
        }
        this.m = axxbVar;
        this.n = new actg(axxbVar);
    }
}
