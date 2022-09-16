package defpackage;

import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wrm  reason: default package */
/* loaded from: classes4.dex */
public final class wrm implements wri, wlk {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final Executor m;
    private final Executor n;
    private final azqb o;
    private final CopyOnWriteArrayList p;
    private final Map q = new HashMap();
    private final wwf r;
    private final azqb s;

    public wrm(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, Executor executor, Executor executor2, CopyOnWriteArrayList copyOnWriteArrayList, wwf wwfVar, azqb azqbVar14) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
        this.j = azqbVar10;
        this.k = azqbVar11;
        this.l = azqbVar12;
        this.o = azqbVar13;
        this.m = executor;
        this.n = executor2;
        this.p = copyOnWriteArrayList;
        this.r = wwfVar;
        this.s = azqbVar14;
        this.f = azqbVar6;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        int i;
        String str;
        String str2;
        xdu xduVar2;
        wra wqxVar;
        wqv wqvVar;
        boolean z;
        wrm wrmVar = this;
        xdu xduVar3 = xduVar;
        xci xciVar2 = xciVar;
        if (wwf.e(wqr.class, xduVar3, xciVar2)) {
            aeso aesoVar = (aeso) xduVar3.d(xaw.class);
            if (wrmVar.q.containsKey(aesoVar.a)) {
                aesoVar = (aeso) wrmVar.q.get(aesoVar.a);
            }
            wqr wqrVar = new wqr((wll) wrmVar.c.get(), (wlh) wrmVar.l.get(), (yni) wrmVar.o.get(), wrmVar.m, wrmVar.n, xduVar, xciVar, (wqf) wrmVar.h.get(), (wkt) wrmVar.i.get(), aesoVar, (aadd) wrmVar.a.get());
            for (xci xciVar3 : (List) xciVar2.e(xbp.class)) {
                if (wwf.e(wqs.class, xduVar3, xciVar3)) {
                    wqrVar.e.add(new wqs((wlh) wrmVar.l.get(), (wnj) wrmVar.f.get(), xduVar, xciVar3, (wkt) wrmVar.i.get()));
                } else {
                    String valueOf = String.valueOf(xduVar);
                    String valueOf2 = String.valueOf(xciVar3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
                    sb.append("Unrecognized metadata. slot: ");
                    sb.append(valueOf);
                    sb.append(", layout: ");
                    sb.append(valueOf2);
                    throw new wrh(sb.toString());
                }
            }
            return wqrVar;
        }
        String str3 = "Unrecognized metadata. slot: ";
        String str4 = ", layout: ";
        if (wwf.e(wqv.class, xduVar3, xciVar2)) {
            List list = (List) xciVar2.e(xbp.class);
            wqv wqvVar2 = r11;
            wqv wqvVar3 = new wqv((wqf) wrmVar.h.get(), (wkt) wrmVar.i.get(), (wll) wrmVar.c.get(), (wvk) wrmVar.j.get(), (wlh) wrmVar.l.get(), (wnf) wrmVar.e.get(), xduVar, xciVar, (PlayerResponseModel) xduVar3.d(xat.class), wrmVar.n);
            int i2 = 0;
            while (i2 < list.size()) {
                List list2 = (List) xciVar2.e(xbp.class);
                xci xciVar4 = (xci) list2.get(i2);
                if (wwf.e(wqy.class, xduVar3, xciVar4)) {
                    wkt wktVar = (wkt) wrmVar.i.get();
                    aadd aaddVar = (aadd) wrmVar.a.get();
                    wnp wnpVar = (wnp) wrmVar.d.get();
                    wll wllVar = (wll) wrmVar.c.get();
                    wmt wmtVar = (wmt) wrmVar.b.get();
                    wlh wlhVar = (wlh) wrmVar.l.get();
                    wld wldVar = (wld) wrmVar.g.get();
                    wzu b = ((wtz) wrmVar.k.get()).b(xduVar3, xciVar4);
                    yni yniVar = (yni) wrmVar.o.get();
                    int i3 = i2 + 1;
                    if (i3 < list2.size()) {
                        xci xciVar5 = (xci) list2.get(i3);
                        if (xciVar5.f(xbi.class)) {
                            z = xciVar5.e(xbi.class) instanceof AdVideoEnd;
                            i = i2;
                            str2 = str3;
                            str = str4;
                            wqxVar = new wqy(wktVar, wqvVar2, aaddVar, wnpVar, wllVar, wmtVar, wlhVar, wldVar, b, yniVar, xduVar, xciVar4, z, (wnd) wrmVar.s.get());
                            wqvVar = wqvVar2;
                            xduVar2 = xduVar3;
                            wrmVar = this;
                        }
                    }
                    z = false;
                    i = i2;
                    str2 = str3;
                    str = str4;
                    wqxVar = new wqy(wktVar, wqvVar2, aaddVar, wnpVar, wllVar, wmtVar, wlhVar, wldVar, b, yniVar, xduVar, xciVar4, z, (wnd) wrmVar.s.get());
                    wqvVar = wqvVar2;
                    xduVar2 = xduVar3;
                    wrmVar = this;
                } else {
                    i = i2;
                    str = str4;
                    str2 = str3;
                    xdu xduVar4 = xduVar3;
                    if (wwf.e(wqx.class, xduVar4, xciVar4)) {
                        xduVar2 = xduVar4;
                        wrmVar = this;
                        wkt wktVar2 = (wkt) wrmVar.i.get();
                        wvk wvkVar = (wvk) wrmVar.j.get();
                        CopyOnWriteArrayList copyOnWriteArrayList = wrmVar.p;
                        wlh wlhVar2 = (wlh) wrmVar.l.get();
                        wld wldVar2 = (wld) wrmVar.g.get();
                        wzu b2 = ((wtz) wrmVar.k.get()).b(xduVar2, xciVar4);
                        aadd aaddVar2 = (aadd) wrmVar.a.get();
                        wqxVar = new wqx(wktVar2, wqvVar2, wvkVar, copyOnWriteArrayList, wlhVar2, wldVar2, b2, (yni) wrmVar.o.get(), xduVar, xciVar4);
                        wqvVar = wqvVar2;
                    } else {
                        String valueOf3 = String.valueOf(xduVar);
                        String valueOf4 = String.valueOf(xciVar4);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 39 + String.valueOf(valueOf4).length());
                        sb2.append(str2);
                        sb2.append(valueOf3);
                        sb2.append(str);
                        sb2.append(valueOf4);
                        throw new wrh(sb2.toString());
                    }
                }
                wqvVar.a.add(wqxVar);
                i2 = i + 1;
                xciVar2 = xciVar;
                wqvVar2 = wqvVar;
                xduVar3 = xduVar2;
                str4 = str;
                str3 = str2;
            }
            return wqvVar2;
        }
        throw new wrh("PlayerBytesLayoutRenderingAdapterFactory received unsupported slot");
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (aikaVar == aika.NEW) {
            this.q.clear();
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final void qM(ahgc ahgcVar) {
        this.q.put(ahgcVar.a().a, ahgcVar.a());
    }
}
