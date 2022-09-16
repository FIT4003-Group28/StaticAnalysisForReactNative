package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.MessageRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
/* compiled from: PG */
/* renamed from: abiq  reason: default package */
/* loaded from: classes.dex */
public final class abiq implements abgz, abkp, afzf, abhm, abhi, zdx, abhh {
    private final yni A;
    private final ajvj B;
    private final abkl C;
    private final Handler D;
    private boolean E;
    private boolean F;
    private ynk G;
    private String H;
    public final agce a;
    public final abhg b;
    abhc c;
    public final abhw d;
    public abkq e;
    public List f;
    public abhb g;
    public abqf h;
    public abip i;
    public final aayw j;
    public final abic k;
    public final abiy l;
    public final abin m;
    public final yzj n;
    public final airr o;
    public final acti p;
    public final acth q;
    public abij r;
    public boolean s;
    public long t;
    public boolean u;
    public boolean v;
    public abis w;
    private final abha x;
    private final aaza y;
    private final abij z;

    public abiq(aaza aazaVar, aayw aaywVar, agca agcaVar, yni yniVar, airr airrVar, yzj yzjVar, Handler handler, ajvj ajvjVar, abkl abklVar, abic abicVar, abiy abiyVar, aagi aagiVar, abka abkaVar, abha abhaVar, acti actiVar, acth acthVar) {
        this.y = aazaVar;
        this.j = aaywVar;
        this.n = yzjVar;
        this.A = yniVar;
        this.o = airrVar;
        this.B = ajvjVar;
        this.C = abklVar;
        this.D = handler;
        this.x = abhaVar;
        this.k = abicVar;
        this.l = abiyVar;
        this.p = actiVar;
        this.q = acthVar;
        this.c = new abhc(abhaVar, this);
        this.b = new abhg(aagiVar.c());
        abij abijVar = new abij(this, aazaVar, yniVar, yzjVar, actiVar);
        this.z = abijVar;
        this.r = abijVar;
        this.m = new abin(this, aaywVar, yniVar, yzjVar, actiVar);
        this.d = new abhw(handler, abkaVar);
        this.a = new agce(abijVar, agcaVar, new abio(this));
    }

    private final void F(assn assnVar) {
        boolean z = false;
        if (assnVar.f.size() > 0 && ((apzg) assnVar.f.get(0)).qn(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
            z = true;
        }
        if (assnVar.l || z) {
            this.c = new abhn(this.D, this.x, this, this);
        } else {
            this.c = new abhr(this.D, this.x, this);
        }
        this.c.mW();
    }

    private final void G(boolean z) {
        this.f = null;
        this.r.Y();
        abij abijVar = this.r;
        abijVar.a = false;
        abijVar.b = false;
        agce agceVar = this.a;
        if (agceVar != null) {
            agceVar.c();
        }
        this.c.mX();
        this.b.q();
        this.d.mX();
        abkq abkqVar = this.e;
        if (abkqVar != null) {
            abkqVar.mX();
        }
        this.F = false;
        this.s = false;
        if (!z) {
            this.t = 0L;
            this.E = false;
        }
        H();
    }

    private final synchronized void H() {
        ynk ynkVar = this.G;
        if (ynkVar != null) {
            this.A.l(ynkVar);
            this.G = null;
        }
        if (!this.s || this.r != this.m) {
            return;
        }
        this.G = this.A.a(this, ahhx.class, new ynj() { // from class: abif
            @Override // defpackage.ynj
            public final void a(Object obj) {
                abiq abiqVar = abiq.this;
                ahhx ahhxVar = (ahhx) obj;
                if (!abiqVar.o.R()) {
                    long e = ahhxVar.e();
                    abiqVar.t = e;
                    abhc abhcVar = abiqVar.c;
                    if (!(abhcVar instanceof abhn)) {
                        return;
                    }
                    ((abhn) abhcVar).g(e);
                }
            }
        });
    }

    public final synchronized void A(apzg apzgVar) {
        if (!apzgVar.qn(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
            return;
        }
        aaza aazaVar = this.y;
        aays e = aazaVar.e();
        e.a = ((LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).c.I();
        e.j(apzgVar.c);
        aazaVar.b.e(e, this);
        this.F = true;
        this.d.mW();
        this.s = true;
        abkq o = o();
        if (o != null) {
            o.A();
        }
        H();
    }

    public final synchronized void B(assn assnVar) {
        if (abse.d(assnVar)) {
            F(assnVar);
            if (assnVar.l) {
                abhb abhbVar = this.g;
                if (abhbVar != null) {
                    abhbVar.b();
                }
                this.r = this.m;
            } else {
                this.r = this.z;
            }
            aumx aumxVar = ((assp) assnVar.d.get(0)).c;
            if (aumxVar == null) {
                aumxVar = aumx.a;
            }
            ajfz g = ajna.g(aumxVar);
            this.u = !((ajgc) g).a.equals(this.H);
            this.H = ((ajgc) g).a;
            this.v = true;
            z(g);
        }
    }

    public final synchronized void C() {
        G(false);
    }

    public final synchronized boolean D() {
        return this.s;
    }

    public final synchronized void E(abis abisVar) {
        this.w = abisVar;
    }

    @Override // defpackage.abhh
    public final void d(ajfz ajfzVar) {
        abkq abkqVar = this.e;
        if (abkqVar != null) {
            abkqVar.A();
        }
        G(true);
        z(ajfzVar);
    }

    @Override // defpackage.abhm
    public final boolean e() {
        List<assp> list = this.f;
        if (list != null) {
            for (assp asspVar : list) {
                if ((asspVar.b & 8) != 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.abgz
    public final abhb f() {
        return this.g;
    }

    @Override // defpackage.abgz
    public final abhe g() {
        return this.k;
    }

    @Override // defpackage.abgz
    public final abhg h() {
        return this.b;
    }

    @Override // defpackage.abgz
    public final abhi i() {
        return this;
    }

    @Override // defpackage.zdx
    public final synchronized void j() {
        throw null;
    }

    @Override // defpackage.abgz
    public final abhk k() {
        return this.l;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.n.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.abgz
    public final abho l() {
        return this.e;
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arwd arwdVar = (arwd) obj;
        arwe arweVar = arwdVar.d;
        if (arweVar == null) {
            arweVar = arwe.a;
        }
        if ((arweVar.b & 1) != 0) {
            arwe arweVar2 = arwdVar.d;
            if (arweVar2 == null) {
                arweVar2 = arwe.a;
            }
            assn assnVar = arweVar2.c;
            if (assnVar == null) {
                assnVar = assn.a;
            }
            t(assnVar);
            ((acsx) this.p).D(new acte(arwdVar.f));
        }
    }

    @Override // defpackage.abgz
    public final abhw m() {
        return this.d;
    }

    @Override // defpackage.abgz
    public final Object n(String str) {
        return null;
    }

    public final synchronized abkq o() {
        return this.e;
    }

    public final void p() {
        this.b.q();
    }

    public final synchronized void q() {
        this.r.A();
    }

    public final synchronized void r() {
        this.r.Y();
        agce agceVar = this.a;
        if (agceVar != null) {
            agceVar.c();
        }
        this.c.mU();
        this.d.mU();
        abkq abkqVar = this.e;
        if (abkqVar != null) {
            abkqVar.mU();
        }
    }

    final void s(List list) {
        agce agceVar;
        boolean containsKey;
        if (list == null) {
            return;
        }
        this.f = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            assp asspVar = (assp) it.next();
            int i = asspVar.b;
            if ((i & 2) != 0) {
                agce agceVar2 = this.a;
                if (agceVar2 != null) {
                    agceVar2.c();
                }
                abij abijVar = this.r;
                avia aviaVar = asspVar.d;
                if (aviaVar == null) {
                    aviaVar = avia.a;
                }
                ajfz g = ajna.g(aviaVar);
                abijVar.ae(g, g, new Timer());
            } else if ((i & 4) != 0 && (agceVar = this.a) != null) {
                askw askwVar = asspVar.e;
                if (askwVar == null) {
                    askwVar = askw.a;
                }
                ajfz g2 = ajna.g(askwVar);
                synchronized (agceVar.b) {
                    askw askwVar2 = (askw) ajna.h(g2, askw.class);
                    askwVar2.getClass();
                    asky askyVar = askwVar2.c;
                    if (askyVar == null) {
                        askyVar = asky.a;
                    }
                    containsKey = agceVar.b.containsKey(agce.a(askyVar));
                }
                if (!containsKey) {
                    this.a.c();
                }
                this.r.Y();
                agce agceVar3 = this.a;
                askw askwVar3 = asspVar.e;
                if (askwVar3 == null) {
                    askwVar3 = askw.a;
                }
                agceVar3.b(ajna.g(askwVar3));
            }
            int i2 = asspVar.b;
            if ((i2 & 1) != 0) {
                aumx aumxVar = asspVar.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                arrayList.add(ajna.g(aumxVar));
            } else if ((i2 & 2) != 0) {
                avia aviaVar2 = asspVar.d;
                if (aviaVar2 == null) {
                    aviaVar2 = avia.a;
                }
                arrayList.add(ajna.g(aviaVar2));
            } else if ((i2 & 4) != 0) {
                askw askwVar4 = asspVar.e;
                if (askwVar4 == null) {
                    askwVar4 = askw.a;
                }
                arrayList.add(ajna.g(askwVar4));
            } else if ((i2 & 8) != 0) {
                assq assqVar = asspVar.f;
                if (assqVar == null) {
                    assqVar = assq.a;
                }
                arrayList.add(ajna.g(assqVar));
            } else if ((i2 & 16) != 0) {
                aubu aubuVar = asspVar.g;
                if (aubuVar == null) {
                    aubuVar = aubu.a;
                }
                arrayList.add(ajna.g(aubuVar));
            }
        }
        this.r.ls(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(assn assnVar) {
        long j;
        int i;
        asqv asqvVar;
        atfa atfaVar;
        arag aragVar;
        StyleSpan[] styleSpanArr;
        arag aragVar2;
        asqv asqvVar2;
        this.r.b = false;
        if (assnVar == null) {
            return;
        }
        if (!this.E) {
            F(assnVar);
            this.C.a(assnVar.k);
        } else if (this.F) {
            this.c.mW();
        }
        if (assnVar.i.size() > 0) {
            this.B.g(assnVar.i);
        }
        abis abisVar = this.w;
        if (abisVar != null) {
            assm assmVar = assnVar.g;
            if (assmVar == null) {
                assmVar = assm.a;
            }
            if (assmVar.b == 130037640) {
                asqvVar = (asqv) assmVar.c;
            } else {
                asqvVar = asqv.a;
            }
            aunb aunbVar = asqvVar.b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(MessageRendererOuterClass.messageRenderer)) {
                assm assmVar2 = assnVar.g;
                if (assmVar2 == null) {
                    assmVar2 = assm.a;
                }
                if (assmVar2.b == 130037640) {
                    asqvVar2 = (asqv) assmVar2.c;
                } else {
                    asqvVar2 = asqv.a;
                }
                aunb aunbVar2 = asqvVar2.b;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                atfaVar = (atfa) aunbVar2.qm(MessageRendererOuterClass.messageRenderer);
            } else {
                atfaVar = null;
            }
            if (atfaVar != null && abisVar.a != null) {
                abqd abqdVar = abisVar.b;
                abqdVar.b = false;
                Context context = abqdVar.c.getContext();
                if ((atfaVar.b & 1) != 0) {
                    aragVar = atfaVar.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajgl.b(aragVar));
                for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, abqdVar.a.a(6)), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), 33);
                    }
                }
                abqdVar.d.setText(spannableStringBuilder);
                atfd atfdVar = atfaVar.f;
                if (atfdVar == null) {
                    atfdVar = atfd.a;
                }
                if ((atfdVar.b & 1) != 0) {
                    abqdVar.b = true;
                    TextView textView = abqdVar.e;
                    atfd atfdVar2 = atfaVar.f;
                    if (atfdVar2 == null) {
                        atfdVar2 = atfd.a;
                    }
                    atfc atfcVar = atfdVar2.c;
                    if (atfcVar == null) {
                        atfcVar = atfc.a;
                    }
                    if ((atfcVar.b & 1) != 0) {
                        atfd atfdVar3 = atfaVar.f;
                        if (atfdVar3 == null) {
                            atfdVar3 = atfd.a;
                        }
                        atfc atfcVar2 = atfdVar3.c;
                        if (atfcVar2 == null) {
                            atfcVar2 = atfc.a;
                        }
                        aragVar2 = atfcVar2.c;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    textView.setText(ajgl.b(aragVar2));
                }
                abisVar.b.a(abisVar.a.b.isEmpty());
            }
        }
        this.E = true;
        this.f = null;
        if (assnVar.d.size() != 0) {
            s(assnVar.d);
        }
        if (assnVar.f.size() > 0) {
            apzg apzgVar = (apzg) assnVar.f.get(assnVar.f.size() - 1);
            if (this.F && (this.c instanceof abhn) && apzgVar.qn(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
                long j2 = ((LiveChatAction.ReplayChatItemAction) apzgVar.qm(LiveChatAction.ReplayChatItemAction.replayChatItemAction)).c;
                long j3 = this.t;
                if (j2 < j3) {
                    ((abhn) this.c).f(j3);
                }
            }
            abhc abhcVar = this.c;
            aopu aopuVar = assnVar.f;
            for (assp asspVar : assnVar.d) {
                int i2 = asspVar.b;
                if ((i2 & 2) != 0) {
                    avia aviaVar = asspVar.d;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                    i = aviaVar.c;
                } else if ((i2 & 4) != 0 && this.a != null) {
                    askw askwVar = asspVar.e;
                    if (askwVar == null) {
                        askwVar = askw.a;
                    }
                    i = askwVar.d;
                }
                j = i;
                abhcVar.a(aopuVar, j);
            }
            j = 0;
            abhcVar.a(aopuVar, j);
        }
        abhb abhbVar = this.g;
        if (abhbVar != null && (assnVar.c & 16) != 0) {
            assk asskVar = assnVar.h;
            if (asskVar == null) {
                asskVar = assk.a;
            }
            abhbVar.a(asskVar);
            this.r.a = false;
        }
        abqf abqfVar = this.h;
        if (abqfVar != null && (assnVar.c & 2) != 0) {
            assl asslVar = assnVar.e;
            if (asslVar == null) {
                asslVar = assl.a;
            }
            abqfVar.B(asslVar);
        }
        abkq o = o();
        if (o != null) {
            o.y();
        }
        this.F = false;
    }

    public final synchronized void u() {
        this.c.mV();
        this.d.mV();
        abkq abkqVar = this.e;
        if (abkqVar != null) {
            abkqVar.mV();
        }
        s(this.f);
        abkq o = o();
        if (o != null) {
            o.y();
        }
    }

    public final synchronized void v(assn assnVar) {
        if (D()) {
            u();
        } else {
            B(assnVar);
        }
    }

    public final synchronized void w(abkq abkqVar) {
        abkq abkqVar2 = this.e;
        if (abkqVar == abkqVar2) {
            return;
        }
        if (abkqVar == null) {
            abkl abklVar = this.C;
            abklVar.a = null;
            abklVar.b = null;
            if (abkqVar2 == null) {
                return;
            }
            abkqVar2.r();
            this.e = null;
            return;
        }
        if (abkqVar2 != null) {
            abkqVar.u(abkqVar2.o(), this.e.p());
            abkqVar.w(this.e.n());
        }
        this.e = abkqVar;
        abkqVar.q();
        abkq abkqVar3 = this.e;
        abhg abhgVar = this.b;
        abkqVar3.t(abhgVar, abhgVar.b);
        abhw abhwVar = this.d;
        ajsm ajsmVar = abhwVar.b;
        this.e.x(ajsmVar, abhwVar.d);
        this.e.v(this);
        if (this.h != null) {
            this.e.B();
        }
        this.e.h();
        ajsmVar.i(new abig(this, ajsmVar));
    }

    public final synchronized void x(abqf abqfVar) {
        this.h = abqfVar;
    }

    public final synchronized void y(abhb abhbVar) {
        this.g = abhbVar;
    }

    public final synchronized void z(ajfz ajfzVar) {
        this.r.ls(Collections.singletonList(ajfzVar));
        this.d.mW();
        abkq abkqVar = this.e;
        if (abkqVar != null) {
            abkqVar.mW();
            this.e.A();
        }
        this.s = true;
        this.r.lr(ajfzVar);
        this.F = true;
        H();
    }
}
