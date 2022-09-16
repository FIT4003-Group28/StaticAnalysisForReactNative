package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: fyv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fyv {
    public static ise a() {
        return new ise(gaw.class);
    }

    public static atuo b(avaq avaqVar) {
        avaw avawVar = avaqVar.r;
        if (avawVar == null) {
            avawVar = avaw.a;
        }
        if ((avawVar.b & 1) != 0) {
            avaw avawVar2 = avaqVar.r;
            if (avawVar2 == null) {
                avawVar2 = avaw.a;
            }
            atuo atuoVar = avawVar2.c;
            return atuoVar == null ? atuo.a : atuoVar;
        }
        return null;
    }

    public static aopa c(Context context, aopa aopaVar, CharSequence charSequence) {
        if (aopaVar == null) {
            return null;
        }
        aopaVar.copyOnWrite();
        avaq avaqVar = (avaq) aopaVar.instance;
        avaq avaqVar2 = avaq.a;
        avaqVar.r = null;
        avaqVar.b &= -131073;
        d(context, aopaVar, charSequence);
        return aopaVar;
    }

    public static void d(Context context, aopa aopaVar, CharSequence charSequence) {
        if (aopaVar == null || b((avaq) aopaVar.mo39build()) != null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        Spanned fromHtml = Html.fromHtml(context.getString(R.string.unsubscribe_confirmation, charSequence));
        String string = context.getString(17039370);
        String string2 = context.getString(17039360);
        aopa createBuilder = atuo.a.createBuilder();
        arag h = ajgl.h(fromHtml.toString());
        createBuilder.copyOnWrite();
        atuo atuoVar = (atuo) createBuilder.instance;
        h.getClass();
        atuoVar.d = h;
        atuoVar.b |= 2;
        arag h2 = ajgl.h(string.toString());
        createBuilder.copyOnWrite();
        atuo atuoVar2 = (atuo) createBuilder.instance;
        h2.getClass();
        atuoVar2.g = h2;
        atuoVar2.b |= 16;
        arag h3 = ajgl.h(string2.toString());
        createBuilder.copyOnWrite();
        atuo atuoVar3 = (atuo) createBuilder.instance;
        h3.getClass();
        atuoVar3.e = h3;
        atuoVar3.b |= 4;
        createBuilder.copyOnWrite();
        atuo atuoVar4 = (atuo) createBuilder.instance;
        atuoVar4.b |= 8;
        atuoVar4.f = true;
        atuo atuoVar5 = (atuo) createBuilder.mo39build();
        aopa createBuilder2 = avaw.a.createBuilder();
        createBuilder2.copyOnWrite();
        avaw avawVar = (avaw) createBuilder2.instance;
        atuoVar5.getClass();
        avawVar.c = atuoVar5;
        avawVar.b |= 1;
        aopaVar.copyOnWrite();
        avaq avaqVar = (avaq) aopaVar.instance;
        avaw avawVar2 = (avaw) createBuilder2.mo39build();
        avaq avaqVar2 = avaq.a;
        avawVar2.getClass();
        avaqVar.r = avawVar2;
        avaqVar.b |= 131072;
    }

    public static ivj e(aqvq aqvqVar) {
        auqh auqhVar;
        aqvs aqvsVar;
        ivj ivjVar = null;
        if ((aqvqVar.c & 16) != 0) {
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            if (aqvoVar.b == 49399797) {
                auqhVar = (auqh) aqvoVar.c;
            } else {
                auqhVar = auqh.a;
            }
            if (auqhVar.d.size() != 0) {
                aslq aslqVar = ((auqk) auqhVar.d.get(0)).j;
                if (aslqVar == null) {
                    aslqVar = aslq.a;
                }
                if (aslqVar.e.size() != 0 && (((aslt) aslqVar.e.get(0)).g & 268435456) != 0) {
                    assn assnVar = ((aslt) aslqVar.e.get(0)).at;
                    if (assnVar == null) {
                        assnVar = assn.a;
                    }
                    aqvp aqvpVar = aqvqVar.f;
                    if (aqvpVar == null) {
                        aqvpVar = aqvp.a;
                    }
                    if (aqvpVar.b == 138681548) {
                        aqvp aqvpVar2 = aqvqVar.f;
                        if (aqvpVar2 == null) {
                            aqvpVar2 = aqvp.a;
                        }
                        if (aqvpVar2.b == 138681548) {
                            aqvsVar = (aqvs) aqvpVar2.c;
                        } else {
                            aqvsVar = aqvs.a;
                        }
                        ivjVar = new ivj(aqvsVar, assnVar);
                    }
                }
            }
        }
        return ivjVar;
    }

    public static int f(apzg apzgVar, aadd aaddVar) {
        if (apzgVar == null) {
            return 1;
        }
        String c = aaji.c(apzgVar);
        if (c != null) {
            asxp asxpVar = aaddVar.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.k.contains(c)) {
                return 4;
            }
            asxp asxpVar2 = aaddVar.a().e;
            if (asxpVar2 == null) {
                asxpVar2 = asxp.a;
            }
            if (asxpVar2.l.contains(c)) {
                return 3;
            }
        }
        apnx apnxVar = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).g;
        if (apnxVar == null) {
            apnxVar = apnx.a;
        }
        apnw apnwVar = apnxVar.b;
        if (apnwVar == null) {
            apnwVar = apnw.a;
        }
        int q = akzj.q(apnwVar.b);
        if (q != 0) {
            return q;
        }
        return 1;
    }

    public static void g(acti actiVar, String str) {
        if (actiVar.c() != null) {
            actiVar.c().c();
            int i = actiVar.c().f;
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asjc.a.createBuilder();
            createBuilder2.copyOnWrite();
            asjc asjcVar = (asjc) createBuilder2.instance;
            str.getClass();
            asjcVar.b |= 1;
            asjcVar.c = str;
            createBuilder2.copyOnWrite();
            asjc asjcVar2 = (asjc) createBuilder2.instance;
            asjcVar2.b |= 2;
            asjcVar2.d = i;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjc asjcVar3 = (asjc) createBuilder2.mo39build();
            asjcVar3.getClass();
            asjjVar.l = asjcVar3;
            asjjVar.b |= 16384;
            awbs g = actiVar.g(new Object(), actj.GENERIC_ERROR);
            actiVar.D(acun.a(g));
            actiVar.u(acun.a(g), (asjj) createBuilder.mo39build());
        }
    }

    public static audw h(aueb auebVar) {
        for (auec auecVar : auebVar.d) {
            if ((auecVar.b & 8) != 0) {
                audw audwVar = auecVar.d;
                return audwVar == null ? audw.a : audwVar;
            }
        }
        return null;
    }

    public static audx i(aueb auebVar) {
        for (auec auecVar : auebVar.d) {
            if ((auecVar.b & 4) != 0) {
                audx audxVar = auecVar.c;
                return audxVar == null ? audx.a : audxVar;
            }
        }
        return null;
    }
}
