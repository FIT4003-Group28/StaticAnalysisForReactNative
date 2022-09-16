package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mtu  reason: default package */
/* loaded from: classes3.dex */
public final class mtu extends ajsl {
    public final aafo a;
    public araz b;
    public arap c;
    public final TextView d;
    public final TextView e;
    private final LayoutInflater f;
    private final ajmy g;
    private final aagi h;
    private acti i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final TextView s;
    private final TextView t;
    private final Button u;
    private final Button v;

    public mtu(Context context, aafo aafoVar, ajmy ajmyVar, aagi aagiVar) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f = from;
        this.a = aafoVar;
        this.g = ajmyVar;
        this.h = aagiVar;
        this.b = null;
        View inflate = from.inflate(R.layout.formfill_confirmation, (ViewGroup) null, false);
        this.j = inflate;
        this.k = (ImageView) inflate.findViewById(R.id.title_image);
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.description);
        this.n = (TextView) inflate.findViewById(R.id.confirmation_main_title);
        this.o = (ImageView) inflate.findViewById(R.id.information_destination_icon);
        this.p = (TextView) inflate.findViewById(R.id.information_destination_title);
        this.q = (TextView) inflate.findViewById(R.id.information_destination_description);
        this.r = (ImageView) inflate.findViewById(R.id.contact_info_icon);
        this.s = (TextView) inflate.findViewById(R.id.contact_info_title);
        this.t = (TextView) inflate.findViewById(R.id.contact_info_description);
        this.d = (TextView) inflate.findViewById(R.id.contact_info_description_phone);
        this.e = (TextView) inflate.findViewById(R.id.contact_info_description_email);
        Button button = (Button) inflate.findViewById(R.id.back_button);
        this.u = button;
        Button button2 = (Button) inflate.findViewById(R.id.submit_button);
        this.v = button2;
        button.setOnClickListener(new View.OnClickListener() { // from class: mtr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtu mtuVar = mtu.this;
                arap arapVar = mtuVar.c;
                if (arapVar != null) {
                    aunb aunbVar = arapVar.n;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                        return;
                    }
                    aunb aunbVar2 = mtuVar.c.n;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                    if ((apojVar.b & 32768) != 0) {
                        aafo aafoVar2 = mtuVar.a;
                        apzg apzgVar = apojVar.p;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar2.c(apzgVar, null);
                    }
                    if ((apojVar.b & 16384) == 0) {
                        return;
                    }
                    aafo aafoVar3 = mtuVar.a;
                    apzg apzgVar2 = apojVar.o;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar3.a(apzgVar2);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: mts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                araw arawVar;
                mtu mtuVar = mtu.this;
                aunb aunbVar = mtuVar.c.o;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    return;
                }
                aunb aunbVar2 = mtuVar.c.o;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                List<arav> formfillFieldResults = mtuVar.b.getFormfillFieldResults();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < formfillFieldResults.size(); i++) {
                    arav aravVar = (arav) formfillFieldResults.get(i);
                    aopa createBuilder = dpn.a.createBuilder();
                    aopa createBuilder2 = dpp.a.createBuilder();
                    if (aravVar.c == 4) {
                        arawVar = (araw) aravVar.d;
                    } else {
                        arawVar = araw.a;
                    }
                    String str = arawVar.c;
                    createBuilder2.copyOnWrite();
                    dpp dppVar = (dpp) createBuilder2.instance;
                    str.getClass();
                    dppVar.b |= 1;
                    dppVar.c = str;
                    createBuilder.copyOnWrite();
                    dpn dpnVar = (dpn) createBuilder.instance;
                    dpp dppVar2 = (dpp) createBuilder2.mo39build();
                    dppVar2.getClass();
                    dpnVar.d = dppVar2;
                    dpnVar.c = 4;
                    String str2 = aravVar.e;
                    createBuilder.copyOnWrite();
                    dpn dpnVar2 = (dpn) createBuilder.instance;
                    str2.getClass();
                    dpnVar2.b |= 1;
                    dpnVar2.e = str2;
                    boolean z = aravVar.f;
                    createBuilder.copyOnWrite();
                    dpn dpnVar3 = (dpn) createBuilder.instance;
                    dpnVar3.b = 2 | dpnVar3.b;
                    dpnVar3.f = z;
                    arrayList.add((dpn) createBuilder.mo39build());
                }
                aopu<araq> aopuVar = mtuVar.c.m;
                ArrayList arrayList2 = new ArrayList();
                for (arav aravVar2 : formfillFieldResults) {
                    String str3 = aravVar2.e;
                    Iterator it = aopuVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            apzgVar = null;
                            break;
                        }
                        araq araqVar = (araq) it.next();
                        if (araqVar.d.equals(str3) && (araqVar.b & 8) != 0) {
                            apzgVar = araqVar.e;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                        }
                    }
                    if (apzgVar != null && aravVar2.f) {
                        arrayList2.add(apzgVar);
                    }
                }
                aopa createBuilder3 = asjj.a.createBuilder();
                aopa mo52toBuilder = asjg.a.mo52toBuilder();
                aopa mo52toBuilder2 = asip.a.mo52toBuilder();
                String h = mtu.h(aopuVar, 2);
                String h2 = mtu.h(aopuVar, 4);
                String h3 = mtu.h(aopuVar, 3);
                for (arav aravVar3 : formfillFieldResults) {
                    String str4 = aravVar3.e;
                    if (h == null || !h.equals(str4)) {
                        if (h2 == null || !h2.equals(str4)) {
                            if (h3 != null && h3.equals(str4) && aravVar3.f) {
                                mo52toBuilder.copyOnWrite();
                                asjg.b((asjg) mo52toBuilder.instance);
                                mo52toBuilder2.copyOnWrite();
                                asip.b((asip) mo52toBuilder2.instance);
                            }
                        } else if (aravVar3.f) {
                            mo52toBuilder.copyOnWrite();
                            asjg.c((asjg) mo52toBuilder.instance);
                            mo52toBuilder2.copyOnWrite();
                            asip.c((asip) mo52toBuilder2.instance);
                        }
                    } else if (aravVar3.f) {
                        mo52toBuilder.copyOnWrite();
                        asjg.a((asjg) mo52toBuilder.instance);
                        mo52toBuilder2.copyOnWrite();
                        asip.a((asip) mo52toBuilder2.instance);
                    }
                }
                for (araq araqVar2 : aopuVar) {
                    if (h == null || !h.equals(araqVar2.d)) {
                        if (h2 == null || !h2.equals(araqVar2.d)) {
                            if (h3 != null && h3.equals(araqVar2.d) && araqVar2.f) {
                                mo52toBuilder.copyOnWrite();
                                asjg.e((asjg) mo52toBuilder.instance);
                                mo52toBuilder2.copyOnWrite();
                                asip.e((asip) mo52toBuilder2.instance);
                            }
                        } else if (araqVar2.f) {
                            mo52toBuilder.copyOnWrite();
                            asjg.f((asjg) mo52toBuilder.instance);
                            mo52toBuilder2.copyOnWrite();
                            asip.f((asip) mo52toBuilder2.instance);
                        }
                    } else if (araqVar2.f) {
                        mo52toBuilder.copyOnWrite();
                        asjg.d((asjg) mo52toBuilder.instance);
                        mo52toBuilder2.copyOnWrite();
                        asip.d((asip) mo52toBuilder2.instance);
                    }
                }
                aopa createBuilder4 = asit.a.createBuilder();
                createBuilder4.copyOnWrite();
                asit asitVar = (asit) createBuilder4.instance;
                asip asipVar = (asip) mo52toBuilder2.mo39build();
                asipVar.getClass();
                asitVar.d = asipVar;
                asitVar.c = 6;
                createBuilder3.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder3.instance;
                asit asitVar2 = (asit) createBuilder4.mo39build();
                asitVar2.getClass();
                asjjVar.t = asitVar2;
                asjjVar.c |= 1024;
                createBuilder3.copyOnWrite();
                asjj asjjVar2 = (asjj) createBuilder3.instance;
                asjg asjgVar = (asjg) mo52toBuilder.mo39build();
                asjgVar.getClass();
                asjjVar2.n = asjgVar;
                asjjVar2.b |= 131072;
                asjj asjjVar3 = (asjj) createBuilder3.mo39build();
                if ((apojVar.b & 8192) != 0) {
                    Map h4 = actk.h(mtuVar.c, false);
                    h4.put("FORM_RESULTS_ARG", arrayList);
                    h4.put("SUBMIT_COMMANDS_ARG", arrayList2);
                    aafo aafoVar2 = mtuVar.a;
                    apzg apzgVar2 = apojVar.n;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.c(apzgVar2, h4);
                }
                if ((apojVar.b & 16384) != 0) {
                    Map g = actk.g(mtuVar.c, asjjVar3);
                    aafo aafoVar3 = mtuVar.a;
                    apzg apzgVar3 = apojVar.o;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    aafoVar3.c(apzgVar3, g);
                }
                if ((apojVar.b & 32768) == 0) {
                    return;
                }
                aafo aafoVar4 = mtuVar.a;
                apzg apzgVar4 = apojVar.p;
                if (apzgVar4 == null) {
                    apzgVar4 = apzg.a;
                }
                aafoVar4.c(apzgVar4, null);
            }
        });
    }

    public static String f(List list, List list2) {
        araw arawVar;
        String h = h(list2, 2);
        if (h != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arav aravVar = (arav) it.next();
                if (h.equals(aravVar.e)) {
                    if (aravVar.c == 4) {
                        arawVar = (araw) aravVar.d;
                    } else {
                        arawVar = araw.a;
                    }
                    return arawVar.c;
                }
            }
            return null;
        }
        return null;
    }

    public static String g(List list, List list2) {
        araw arawVar;
        String h = h(list2, 4);
        if (h != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arav aravVar = (arav) it.next();
                if (h.equals(aravVar.e)) {
                    if (aravVar.c == 4) {
                        arawVar = (araw) aravVar.d;
                    } else {
                        arawVar = araw.a;
                    }
                    return arawVar.c;
                }
            }
            return null;
        }
        return null;
    }

    public static String h(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            araq araqVar = (araq) it.next();
            int C = akpq.C(araqVar.c);
            if (C == 0) {
                C = 1;
                continue;
            }
            if (C == i) {
                return araqVar.d;
            }
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        arag aragVar7;
        arag aragVar8;
        arap arapVar = (arap) obj;
        arapVar.getClass();
        if ((arapVar.b & 16384) != 0) {
            this.b = (araz) this.h.c().f(arapVar.q).g(araz.class).W();
        }
        if (this.b == null) {
            String valueOf = String.valueOf(arapVar.q);
            afus.b(2, 1, valueOf.length() != 0 ? "Lead Form Ads on Confirmation Page failed to read from Entity Store with id=".concat(valueOf) : new String("Lead Form Ads on Confirmation Page failed to read from Entity Store with id="));
            return;
        }
        final String str = arapVar.q;
        this.h.c().h(str, false).X(aypa.a()).as(new ayqb() { // from class: mtt
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                mtu mtuVar = mtu.this;
                String str2 = str;
                mtuVar.b = (araz) ((aajp) obj2).c;
                araz arazVar = mtuVar.b;
                if (arazVar == null) {
                    String valueOf2 = String.valueOf(str2);
                    afus.b(2, 1, valueOf2.length() != 0 ? "Lead Form Ads on Confirmation Page failed to update from Entity Store with id=".concat(valueOf2) : new String("Lead Form Ads on Confirmation Page failed to update from Entity Store with id="));
                    return;
                }
                arap arapVar2 = mtuVar.c;
                if (arapVar2 == null || !arapVar2.k) {
                    return;
                }
                List formfillFieldResults = arazVar.getFormfillFieldResults();
                aopu aopuVar = mtuVar.c.m;
                String g = mtu.g(formfillFieldResults, aopuVar);
                if (g != null) {
                    mtuVar.d.setText(g);
                    mtuVar.d.setVisibility(0);
                }
                String f = mtu.f(formfillFieldResults, aopuVar);
                if (f == null) {
                    return;
                }
                mtuVar.e.setText(f);
                mtuVar.e.setVisibility(0);
            }
        });
        this.i = ajrsVar.a;
        this.c = arapVar;
        aunb aunbVar = arapVar.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        arag aragVar9 = null;
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            acti actiVar = this.i;
            aunb aunbVar2 = this.c.n;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            actiVar.u(new acte(((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer)).t), null);
        }
        aunb aunbVar3 = this.c.o;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            acti actiVar2 = this.i;
            aunb aunbVar4 = this.c.o;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            actiVar2.u(new acte(((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer)).t), null);
        }
        ajmy ajmyVar = this.g;
        ImageView imageView = this.k;
        avhn avhnVar = this.c.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.l;
        arap arapVar2 = this.c;
        if ((2 & arapVar2.b) != 0) {
            aragVar = arapVar2.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.m;
        arap arapVar3 = this.c;
        if ((arapVar3.b & 4) != 0) {
            aragVar2 = arapVar3.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.n;
        arap arapVar4 = this.c;
        if ((arapVar4.b & 8) != 0) {
            aragVar3 = arapVar4.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView3.setText(ajgl.b(aragVar3));
        ajmy ajmyVar2 = this.g;
        ImageView imageView2 = this.o;
        avhn avhnVar2 = this.c.l;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar2.h(imageView2, avhnVar2);
        TextView textView4 = this.p;
        arap arapVar5 = this.c;
        if ((arapVar5.b & 16) != 0) {
            aragVar4 = arapVar5.g;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        textView4.setText(ajgl.b(aragVar4));
        TextView textView5 = this.q;
        arap arapVar6 = this.c;
        if ((arapVar6.b & 32) != 0) {
            aragVar5 = arapVar6.h;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        zag.m(textView5, ajgl.b(aragVar5));
        ajmy ajmyVar3 = this.g;
        ImageView imageView3 = this.r;
        avhn avhnVar3 = this.c.l;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        ajmyVar3.h(imageView3, avhnVar3);
        TextView textView6 = this.s;
        arap arapVar7 = this.c;
        if ((arapVar7.b & 64) != 0) {
            aragVar6 = arapVar7.i;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
        } else {
            aragVar6 = null;
        }
        textView6.setText(ajgl.b(aragVar6));
        TextView textView7 = this.t;
        arap arapVar8 = this.c;
        if ((arapVar8.b & 128) != 0) {
            aragVar7 = arapVar8.j;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
        } else {
            aragVar7 = null;
        }
        zag.m(textView7, ajgl.b(aragVar7));
        if (this.c.k) {
            this.t.setVisibility(8);
            List formfillFieldResults = this.b.getFormfillFieldResults();
            aopu aopuVar = this.c.m;
            String g = g(formfillFieldResults, aopuVar);
            if (g != null) {
                this.d.setText(g);
                this.d.setVisibility(0);
            }
            String f = f(formfillFieldResults, aopuVar);
            if (f != null) {
                this.e.setText(f);
                this.e.setVisibility(0);
            }
        }
        aunb aunbVar5 = this.c.n;
        if (aunbVar5 == null) {
            aunbVar5 = aunb.a;
        }
        if (aunbVar5.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar6 = this.c.n;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar6.qm(ButtonRendererOuterClass.buttonRenderer);
            Button button = this.u;
            if ((apojVar.b & 256) != 0) {
                aragVar8 = apojVar.i;
                if (aragVar8 == null) {
                    aragVar8 = arag.a;
                }
            } else {
                aragVar8 = null;
            }
            button.setText(ajgl.b(aragVar8));
        }
        aunb aunbVar7 = this.c.o;
        if (aunbVar7 == null) {
            aunbVar7 = aunb.a;
        }
        if (!aunbVar7.qn(ButtonRendererOuterClass.buttonRenderer)) {
            return;
        }
        aunb aunbVar8 = this.c.o;
        if (aunbVar8 == null) {
            aunbVar8 = aunb.a;
        }
        apoj apojVar2 = (apoj) aunbVar8.qm(ButtonRendererOuterClass.buttonRenderer);
        Button button2 = this.v;
        if ((apojVar2.b & 256) != 0 && (aragVar9 = apojVar2.i) == null) {
            aragVar9 = arag.a;
        }
        button2.setText(ajgl.b(aragVar9));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arap) obj).p.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if ((this.c.b & 16384) != 0) {
            aahb c = ((aagu) this.h.c()).c();
            c.g(this.c.q);
            c.b().Q();
        }
    }
}
