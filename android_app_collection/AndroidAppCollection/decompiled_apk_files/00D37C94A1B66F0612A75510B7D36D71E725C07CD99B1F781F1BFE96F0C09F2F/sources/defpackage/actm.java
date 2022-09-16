package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: actm  reason: default package */
/* loaded from: classes.dex */
public final class actm {
    public final yni a;
    public final acrr b;
    public final aski c;
    public final actp d;
    public final acst e;
    public final acss f;
    public final asvw g;
    public final axxb h;
    public final Object i = new Object();
    private final Map j;

    public actm(Context context, yni yniVar, acrr acrrVar, aacz aaczVar, Map map, acst acstVar, actp actpVar, acss acssVar, aadd aaddVar, axxb axxbVar) {
        aski askiVar;
        arhd a;
        asvw asvwVar;
        context.getClass();
        yniVar.getClass();
        this.a = yniVar;
        acrrVar.getClass();
        this.b = acrrVar;
        acstVar.getClass();
        this.e = acstVar;
        this.j = map;
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (((atfwVar == null ? atfw.a : atfwVar).b & 2048) != 0) {
                atfw atfwVar2 = b.k;
                askiVar = (atfwVar2 == null ? atfw.a : atfwVar2).h;
                if (askiVar == null) {
                    askiVar = aski.a;
                }
                this.c = askiVar;
                this.d = actpVar;
                this.f = acssVar;
                a = aaddVar.a();
                if (a != null || (a.b & 524288) == 0) {
                    aopa createBuilder = asvw.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asvw asvwVar2 = (asvw) createBuilder.instance;
                    asvwVar2.b |= 64;
                    asvwVar2.i = false;
                    asvwVar = (asvw) createBuilder.mo39build();
                } else {
                    asvx asvxVar = a.m;
                    asvwVar = (asvxVar == null ? asvx.a : asvxVar).e;
                    if (asvwVar == null) {
                        asvwVar = asvw.a;
                    }
                }
                this.g = asvwVar;
                this.h = axxbVar;
            }
        }
        aopa createBuilder2 = aski.a.createBuilder();
        createBuilder2.copyOnWrite();
        aski askiVar2 = (aski) createBuilder2.instance;
        askiVar2.b |= 1;
        askiVar2.c = true;
        askiVar = (aski) createBuilder2.mo39build();
        this.c = askiVar;
        this.d = actpVar;
        this.f = acssVar;
        a = aaddVar.a();
        if (a != null) {
        }
        aopa createBuilder3 = asvw.a.createBuilder();
        createBuilder3.copyOnWrite();
        asvw asvwVar22 = (asvw) createBuilder3.instance;
        asvwVar22.b |= 64;
        asvwVar22.i = false;
        asvwVar = (asvw) createBuilder3.mo39build();
        this.g = asvwVar;
        this.h = axxbVar;
    }

    public static awbs a(awbs awbsVar) {
        if (!q(awbsVar) || (awbsVar.b & 8) != 0) {
            return awbsVar;
        }
        aopa mo52toBuilder = awbsVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        awbs awbsVar2 = (awbs) mo52toBuilder.instance;
        awbsVar2.b |= 8;
        awbsVar2.f = 0;
        return (awbs) mo52toBuilder.mo39build();
    }

    static boolean j(aoob aoobVar) {
        return aoobVar != null && !aoobVar.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(awbs awbsVar) {
        return j(awbsVar.c) || q(awbsVar);
    }

    public static final awbs n(int i) {
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        createBuilder.copyOnWrite();
        awbs awbsVar2 = (awbs) createBuilder.instance;
        awbsVar2.b |= 8;
        awbsVar2.f = 0;
        return (awbs) createBuilder.mo39build();
    }

    private static boolean q(awbs awbsVar) {
        return awbsVar != null && awbsVar.d > 0;
    }

    private final boolean r(GelVisibilityUpdate gelVisibilityUpdate) {
        if (!this.c.c) {
            return false;
        }
        awbs awbsVar = gelVisibilityUpdate.d;
        if (awbsVar != null && (j(awbsVar.c) || awbsVar.d > 0)) {
            return gelVisibilityUpdate.f != 1;
        }
        String.valueOf(String.valueOf(awbsVar)).length();
        return false;
    }

    public final void b(InteractionLoggingScreen interactionLoggingScreen, awbs awbsVar, awbs awbsVar2) {
        if (!m(interactionLoggingScreen, awbsVar, awbsVar2)) {
            return;
        }
        awbs a = a(awbsVar);
        awbs a2 = a(awbsVar2);
        if (this.h.c().booleanValue()) {
            synchronized (this.i) {
                if (k(a) && interactionLoggingScreen.g(a)) {
                    return;
                }
                interactionLoggingScreen.d(a, a2);
            }
        } else if (k(a) && interactionLoggingScreen.g(a)) {
            return;
        } else {
            interactionLoggingScreen.d(a, a2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        d(interactionLoggingScreen, a2, arrayList);
        this.d.b(a, a2, interactionLoggingScreen.a);
    }

    public final void c(arrh arrhVar, InteractionLoggingScreen interactionLoggingScreen) {
        acrr acrrVar = this.b;
        if (this.c.f && interactionLoggingScreen != null && arrhVar != null && !TextUtils.isEmpty(interactionLoggingScreen.a)) {
            arrf arrfVar = (arrf) arrhVar.mo52toBuilder();
            aopa createBuilder = arri.a.createBuilder();
            aopa createBuilder2 = arrm.a.createBuilder();
            String str = interactionLoggingScreen.a;
            createBuilder2.copyOnWrite();
            arrm arrmVar = (arrm) createBuilder2.instance;
            str.getClass();
            arrmVar.b |= 1;
            arrmVar.c = str;
            int a = interactionLoggingScreen.a();
            createBuilder2.copyOnWrite();
            arrm arrmVar2 = (arrm) createBuilder2.instance;
            arrmVar2.b |= 2;
            arrmVar2.d = a;
            arrm arrmVar3 = (arrm) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            arri arriVar = (arri) createBuilder.instance;
            arrmVar3.getClass();
            arriVar.d = arrmVar3;
            arriVar.b |= 4;
            arrfVar.copyOnWrite();
            ((arrh) arrfVar.instance).cj((arri) createBuilder.mo39build());
            arrhVar = (arrh) arrfVar.mo39build();
        }
        acrrVar.c(arrhVar);
    }

    public final void d(InteractionLoggingScreen interactionLoggingScreen, awbs awbsVar, List list) {
        awbs a = a(awbsVar);
        if (list.isEmpty()) {
            return;
        }
        ArrayList<awbs> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((awbs) it.next()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        awbs a2 = a(a);
        ArrayList arrayList2 = new ArrayList();
        for (awbs awbsVar2 : arrayList) {
            arrayList2.add(a(awbsVar2));
        }
        aopa createBuilder = asih.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asih asihVar = (asih) createBuilder.instance;
        str.getClass();
        asihVar.b |= 1;
        asihVar.c = str;
        createBuilder.copyOnWrite();
        asih asihVar2 = (asih) createBuilder.instance;
        a2.getClass();
        asihVar2.d = a2;
        asihVar2.b |= 2;
        createBuilder.copyOnWrite();
        asih asihVar3 = (asih) createBuilder.instance;
        aopu aopuVar = asihVar3.e;
        if (!aopuVar.c()) {
            asihVar3.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) arrayList2, (List) asihVar3.e);
        arrf a3 = arrh.a();
        a3.copyOnWrite();
        ((arrh) a3.instance).dY((asih) createBuilder.mo39build());
        c((arrh) a3.mo39build(), interactionLoggingScreen);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(InteractionLoggingScreen interactionLoggingScreen) {
        p(interactionLoggingScreen, 9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(InteractionLoggingScreen interactionLoggingScreen) {
        aopa createBuilder = asik.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asik asikVar = (asik) createBuilder.instance;
        str.getClass();
        asikVar.b |= 1;
        asikVar.c = str;
        createBuilder.copyOnWrite();
        asik asikVar2 = (asik) createBuilder.instance;
        asikVar2.f = 4;
        asikVar2.b |= 8;
        awbs n = n(interactionLoggingScreen.f);
        createBuilder.copyOnWrite();
        asik asikVar3 = (asik) createBuilder.instance;
        n.getClass();
        asikVar3.d = n;
        asikVar3.b |= 2;
        asik asikVar4 = (asik) createBuilder.mo39build();
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).eb(asikVar4);
        c((arrh) a.mo39build(), interactionLoggingScreen);
        this.d.d(asikVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(InteractionLoggingScreen interactionLoggingScreen, GelVisibilityUpdate.HiddenVisibilityUpdate hiddenVisibilityUpdate) {
        if (!r(hiddenVisibilityUpdate) || !interactionLoggingScreen.h(hiddenVisibilityUpdate.d)) {
            return;
        }
        interactionLoggingScreen.e(hiddenVisibilityUpdate);
        aopa createBuilder = asij.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asij asijVar = (asij) createBuilder.instance;
        str.getClass();
        asijVar.b |= 1;
        asijVar.c = str;
        int i = hiddenVisibilityUpdate.f;
        createBuilder.copyOnWrite();
        asij asijVar2 = (asij) createBuilder.instance;
        asijVar2.f = i - 1;
        asijVar2.b |= 8;
        awbs awbsVar = hiddenVisibilityUpdate.d;
        createBuilder.copyOnWrite();
        asij asijVar3 = (asij) createBuilder.instance;
        awbsVar.getClass();
        asijVar3.d = awbsVar;
        asijVar3.b |= 2;
        asjj asjjVar = hiddenVisibilityUpdate.e;
        if (asjjVar != null) {
            createBuilder.copyOnWrite();
            asij asijVar4 = (asij) createBuilder.instance;
            asijVar4.e = asjjVar;
            asijVar4.b |= 4;
        }
        asij asijVar5 = (asij) createBuilder.mo39build();
        amuk amukVar = hiddenVisibilityUpdate.c;
        int size = amukVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            aswa aswaVar = (aswa) amukVar.get(i2);
            if (this.j.containsKey(aswaVar)) {
                ((acue) this.j.get(aswaVar)).b();
            }
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).ea(asijVar5);
        c((arrh) a.mo39build(), interactionLoggingScreen);
        this.d.c(asijVar5);
    }

    public final void h(InteractionLoggingScreen interactionLoggingScreen, GelVisibilityUpdate.ShownVisibilityUpdate shownVisibilityUpdate) {
        if (!r(shownVisibilityUpdate) || interactionLoggingScreen.h(shownVisibilityUpdate.d)) {
            return;
        }
        interactionLoggingScreen.e(shownVisibilityUpdate);
        aopa createBuilder = asik.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asik asikVar = (asik) createBuilder.instance;
        str.getClass();
        asikVar.b |= 1;
        asikVar.c = str;
        int i = shownVisibilityUpdate.f;
        createBuilder.copyOnWrite();
        asik asikVar2 = (asik) createBuilder.instance;
        asikVar2.f = i - 1;
        asikVar2.b |= 8;
        awbs awbsVar = shownVisibilityUpdate.d;
        createBuilder.copyOnWrite();
        asik asikVar3 = (asik) createBuilder.instance;
        awbsVar.getClass();
        asikVar3.d = awbsVar;
        asikVar3.b |= 2;
        asjj asjjVar = shownVisibilityUpdate.e;
        if (asjjVar != null) {
            createBuilder.copyOnWrite();
            asik asikVar4 = (asik) createBuilder.instance;
            asikVar4.e = asjjVar;
            asikVar4.b |= 4;
        }
        asik asikVar5 = (asik) createBuilder.mo39build();
        amuk amukVar = shownVisibilityUpdate.c;
        int size = amukVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            aswa aswaVar = (aswa) amukVar.get(i2);
            if (this.j.containsKey(aswaVar)) {
                ((acue) this.j.get(aswaVar)).a(asikVar5);
            }
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).eb(asikVar5);
        c((arrh) a.mo39build(), interactionLoggingScreen);
        this.d.d(asikVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str, awbs awbsVar, asjj asjjVar) {
        if (str.isEmpty()) {
            zep.l("[InteractionLogging] csn is empty for state change event, please provide a valid csn");
            return;
        }
        awbs a = a(awbsVar);
        aopa createBuilder = asil.a.createBuilder();
        createBuilder.copyOnWrite();
        asil asilVar = (asil) createBuilder.instance;
        str.getClass();
        asilVar.b |= 1;
        asilVar.c = str;
        createBuilder.copyOnWrite();
        asil asilVar2 = (asil) createBuilder.instance;
        a.getClass();
        asilVar2.d = a;
        asilVar2.b |= 2;
        createBuilder.copyOnWrite();
        asil asilVar3 = (asil) createBuilder.instance;
        asjjVar.getClass();
        asilVar3.e = asjjVar;
        asilVar3.b |= 4;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).ec((asil) createBuilder.mo39build());
        this.b.c((arrh) a2.mo39build());
    }

    public final boolean l(InteractionLoggingScreen interactionLoggingScreen) {
        return this.c.c && interactionLoggingScreen != null;
    }

    public final boolean m(InteractionLoggingScreen interactionLoggingScreen, awbs... awbsVarArr) {
        if (!l(interactionLoggingScreen)) {
            return false;
        }
        for (awbs awbsVar : awbsVarArr) {
            if (awbsVar == null || (!j(awbsVar.c) && awbsVar.d <= 0)) {
                String.valueOf(String.valueOf(awbsVar)).length();
                return false;
            }
        }
        return true;
    }

    public final void o(InteractionLoggingScreen interactionLoggingScreen, awbs awbsVar, String str) {
        if (m(interactionLoggingScreen, awbsVar) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str) && interactionLoggingScreen.i.contains(str)) {
                return;
            }
            awbs a = a(awbsVar);
            aopa createBuilder = asie.a.createBuilder();
            String str2 = interactionLoggingScreen.a;
            createBuilder.copyOnWrite();
            asie asieVar = (asie) createBuilder.instance;
            str2.getClass();
            asieVar.b |= 4;
            asieVar.e = str2;
            createBuilder.copyOnWrite();
            asie asieVar2 = (asie) createBuilder.instance;
            a.getClass();
            asieVar2.d = a;
            asieVar2.b |= 2;
            createBuilder.copyOnWrite();
            asie asieVar3 = (asie) createBuilder.instance;
            str.getClass();
            asieVar3.b = 1 | asieVar3.b;
            asieVar3.c = str;
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).dr((asie) createBuilder.mo39build());
            c((arrh) a2.mo39build(), interactionLoggingScreen);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            interactionLoggingScreen.i.add(str);
        }
    }

    public final void p(InteractionLoggingScreen interactionLoggingScreen, int i) {
        if (interactionLoggingScreen == null) {
            return;
        }
        aopa createBuilder = asij.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asij asijVar = (asij) createBuilder.instance;
        str.getClass();
        asijVar.b |= 1;
        asijVar.c = str;
        createBuilder.copyOnWrite();
        asij asijVar2 = (asij) createBuilder.instance;
        asijVar2.f = i - 1;
        asijVar2.b |= 8;
        awbs n = n(interactionLoggingScreen.f);
        createBuilder.copyOnWrite();
        asij asijVar3 = (asij) createBuilder.instance;
        n.getClass();
        asijVar3.d = n;
        asijVar3.b |= 2;
        asij asijVar4 = (asij) createBuilder.mo39build();
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).ea(asijVar4);
        c((arrh) a.mo39build(), interactionLoggingScreen);
        this.d.c(asijVar4);
    }
}
