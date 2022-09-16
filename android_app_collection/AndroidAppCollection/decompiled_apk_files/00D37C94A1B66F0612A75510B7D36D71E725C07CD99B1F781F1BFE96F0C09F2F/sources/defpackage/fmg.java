package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: fmg  reason: default package */
/* loaded from: classes3.dex */
public final class fmg implements View.OnClickListener, fou, ajpz, ynl {
    public static final Set a = Collections.emptySet();
    private final fmi A;
    private final fmi B;
    private final aadd C;
    private final Random D;
    private AlertDialog E;
    private Map F;
    boolean b;
    public final yzj c;
    public final fny d;
    public final Set e = Collections.newSetFromMap(new WeakHashMap());
    public final akfb f;
    avaq g;
    AlertDialog h;
    public acti i;
    boolean j;
    boolean k;
    boolean l;
    aypg m;
    boolean n;
    private final dt o;
    private final afvn p;
    private final afwc q;
    private final aafo r;
    private final yni s;
    private final TextView t;
    private final fow u;
    private final yrj v;
    private final yzv w;
    private final ajsk x;
    private final ajqa y;
    private final aagi z;

    public fmg(dt dtVar, afvn afvnVar, afwc afwcVar, yzj yzjVar, aafo aafoVar, akfb akfbVar, yni yniVar, fow fowVar, yrj yrjVar, yzv yzvVar, ajsk ajskVar, ajqa ajqaVar, aagi aagiVar, aadd aaddVar, TextView textView, fny fnyVar) {
        this.t = textView;
        this.o = dtVar;
        this.p = afvnVar;
        this.q = afwcVar;
        this.c = yzjVar;
        this.r = aafoVar;
        this.f = akfbVar;
        this.s = yniVar;
        this.d = fnyVar;
        this.u = fowVar;
        this.v = yrjVar;
        this.w = yzvVar;
        this.x = ajskVar;
        this.y = ajqaVar;
        this.z = aagiVar;
        this.C = aaddVar;
        textView.setOnClickListener(this);
        this.A = new fmi(textView, true);
        this.B = new fmi(textView, false);
        this.D = new Random();
    }

    private final apzg p() {
        avau avauVar = this.g.q;
        if (avauVar == null) {
            avauVar = avau.a;
        }
        avat avatVar = avauVar.d;
        if (avatVar == null) {
            avatVar = avat.a;
        }
        if ((avatVar.b & 1) != 0) {
            avau avauVar2 = this.g.q;
            if (avauVar2 == null) {
                avauVar2 = avau.a;
            }
            avat avatVar2 = avauVar2.d;
            if (avatVar2 == null) {
                avatVar2 = avat.a;
            }
            apzg apzgVar = avatVar2.c;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    private final String q() {
        avav avavVar;
        if (!u()) {
            return null;
        }
        avan avanVar = this.g.u;
        if (avanVar == null) {
            avanVar = avan.a;
        }
        if (avanVar.b == 136390057) {
            avavVar = (avav) avanVar.c;
        } else {
            avavVar = avav.a;
        }
        return avavVar.b;
    }

    private final void r() {
        boolean booleanValue = b().booleanValue();
        this.k = booleanValue;
        this.j = booleanValue;
    }

    private final void s() {
        fny fnyVar = this.d;
        if (fnyVar == null) {
            return;
        }
        fnyVar.g(this.g, this.i);
        if (!t() || !b().booleanValue() || this.b) {
            this.d.f();
            return;
        }
        fny fnyVar2 = this.d;
        fmr fmrVar = fnyVar2.b;
        if (fmrVar != null) {
            fmrVar.d();
        }
        foa foaVar = fnyVar2.c;
        if (foaVar != null) {
            foaVar.c();
        }
        foh fohVar = fnyVar2.d;
        if (fohVar != null && fohVar.c != null) {
            fohVar.b.setVisibility(0);
        }
        View a2 = fnyVar2.a();
        if (a2 != null) {
            fnyVar2.a.setVisibility(a2.getVisibility());
        } else {
            fnyVar2.a.setVisibility(8);
        }
    }

    private final boolean t() {
        avaq avaqVar = this.g;
        if (avaqVar == null) {
            return false;
        }
        if (avaqVar.n) {
            return true;
        }
        if (b().booleanValue()) {
            if (fyv.b(this.g) == null) {
                return false;
            }
        } else if ((this.g.b & 65536) == 0) {
            return false;
        }
        return true;
    }

    private final boolean u() {
        avav avavVar;
        avaq avaqVar = this.g;
        if (avaqVar != null) {
            avan avanVar = avaqVar.u;
            if (avanVar == null) {
                avanVar = avan.a;
            }
            if (avanVar.b == 136390057) {
                avavVar = (avav) avanVar.c;
            } else {
                avavVar = avav.a;
            }
            return !avavVar.b.isEmpty();
        }
        return false;
    }

    private final boolean v() {
        return !this.n && !this.g.m.isEmpty();
    }

    public final void c(fmf fmfVar) {
        this.e.add(fmfVar);
    }

    public final void d() {
        this.s.m(this);
        this.y.e(this);
        this.u.b.remove(new fov(this, 0L));
        aypg aypgVar = this.m;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.m = null;
        }
        fny fnyVar = this.d;
        if (fnyVar != null) {
            fnyVar.g(null, null);
        }
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
        }
        AlertDialog alertDialog2 = this.E;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            this.E = null;
        }
        this.i = null;
        this.F = null;
        this.b = false;
        this.l = false;
        this.j = false;
        this.k = false;
        this.g = null;
        this.n = false;
        this.t.setVisibility(8);
    }

    public final void e() {
        argj argjVar;
        if (!t() || this.b || b().booleanValue()) {
            return;
        }
        argl arglVar = this.g.t;
        if (arglVar == null) {
            arglVar = argl.a;
        }
        if (arglVar.b != 102716411) {
            return;
        }
        akfb akfbVar = this.f;
        argl arglVar2 = this.g.t;
        if (arglVar2 == null) {
            arglVar2 = argl.a;
        }
        if (arglVar2.b == 102716411) {
            argjVar = (argj) arglVar2.c;
        } else {
            argjVar = argj.a;
        }
        akfbVar.b(argjVar, this.t, this.g, this.i);
    }

    @Override // defpackage.fou
    public final void g(String str) {
        if (TextUtils.isEmpty(str) || !str.equals(q())) {
            return;
        }
        e();
    }

    public final void h(avaq avaqVar, boolean z, boolean z2) {
        fop fopVar = new fop(z, new fme(this, avaqVar, z2));
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", fopVar);
        acti actiVar = this.i;
        if (actiVar != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", actiVar);
        }
        Map map = this.F;
        if (map != null) {
            hashMap.putAll(map);
        }
        aafo aafoVar = this.r;
        List list = null;
        if (!z2) {
            if (avaqVar.A.size() <= 0) {
                Iterator it = avaqVar.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    apzg apzgVar = (apzg) it.next();
                    if (apzgVar.qn(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                        list = amuk.r(apzgVar);
                        break;
                    }
                }
            } else {
                list = avaqVar.A;
            }
        } else if (avaqVar.z.size() <= 0) {
            Iterator it2 = avaqVar.x.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                apzg apzgVar2 = (apzg) it2.next();
                if (apzgVar2.qn(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)) {
                    list = amuk.r(apzgVar2);
                    break;
                }
            }
        } else {
            list = avaqVar.z;
        }
        aafoVar.d(list, hashMap);
    }

    public final void i(avaq avaqVar, acti actiVar) {
        j(avaqVar, actiVar, null);
    }

    public final void j(avaq avaqVar, acti actiVar, Map map) {
        avav avavVar;
        String str;
        acti actiVar2;
        d();
        if (avaqVar == null) {
            return;
        }
        this.g = avaqVar;
        this.i = actiVar;
        this.F = map;
        if (v()) {
            String str2 = this.g.m;
            aagh c = this.z.c();
            this.m = c.h(str2, false).X(aypa.a()).C(new fzb(1)).as(new ayqb() { // from class: fmc
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    fmg fmgVar = fmg.this;
                    aajp aajpVar = (aajp) obj;
                    if (aajpVar.e == aajo.CLEAR_ON_SIGN_OUT) {
                        String str3 = aajpVar.a;
                        return;
                    }
                    avbw avbwVar = (avbw) aajpVar.c;
                    if (avbwVar == null) {
                        fmgVar.n = true;
                        return;
                    }
                    fmgVar.l = avbwVar.getSubscribed().booleanValue();
                    fmgVar.m();
                }
            });
            avbw avbwVar = (avbw) c.f(str2).g(avbw.class).W();
            if (avbwVar == null) {
                this.n = true;
                ayqi.c((AtomicReference) this.m);
                this.m = null;
                r();
                m();
            } else {
                this.l = avbwVar.getSubscribed().booleanValue();
                m();
                r();
            }
        } else {
            r();
            m();
        }
        if (t()) {
            avaq avaqVar2 = this.g;
            if (avaqVar2 != null && (actiVar2 = this.i) != null) {
                actiVar2.u(new acte(avaqVar2.D), null);
            }
            avaq avaqVar3 = this.g;
            if (avaqVar3 != null) {
                argl arglVar = avaqVar3.t;
                if (arglVar == null) {
                    arglVar = argl.a;
                }
                if (arglVar.b == 102716411) {
                    if ((this.g.b & 1048576) == 0) {
                        e();
                    } else if (u()) {
                        fow fowVar = this.u;
                        String q = q();
                        avan avanVar = this.g.u;
                        if (avanVar == null) {
                            avanVar = avan.a;
                        }
                        if (avanVar.b == 136390057) {
                            avavVar = (avav) avanVar.c;
                        } else {
                            avavVar = avav.a;
                        }
                        long j = avavVar.c;
                        if (!TextUtils.isEmpty(q) && j >= 0 && ((str = fowVar.f) == null || str.equals(q))) {
                            fov fovVar = new fov(this, j);
                            fowVar.b.remove(fovVar);
                            if (!q.equals(fowVar.c)) {
                                fowVar.d();
                            }
                            fowVar.c = q;
                            if (fowVar.c() < j || !fowVar.j()) {
                                fowVar.b.offer(fovVar);
                                fowVar.i();
                            } else {
                                g(q);
                            }
                        }
                    }
                }
            }
            this.s.g(this);
            if (!avaqVar.f.isEmpty()) {
                Uri a2 = iiq.a(avaqVar.f);
                iiq iiqVar = (iiq) this.y.b(a2);
                iiq a3 = iiq.b(avaqVar).a();
                long j2 = avaqVar.G;
                if (j2 > 0) {
                    if (iiqVar == null || iiqVar.d < j2) {
                        this.y.c(a2, a3);
                        this.y.h(a2, this);
                    } else {
                        this.y.h(a2, this);
                        this.y.c(a2, a3);
                    }
                } else if (iiqVar == null || iiqVar.e <= avaqVar.F) {
                    this.y.c(a2, a3);
                    this.y.h(a2, this);
                } else {
                    this.y.h(a2, this);
                    this.y.c(a2, a3);
                }
            }
        }
        this.x.a(avaqVar, this.t);
    }

    public final void k(int i) {
        this.A.a = i;
        this.B.a = i;
    }

    @Override // defpackage.ajpz
    public final void kA(Uri uri, Uri uri2) {
        ajpy b = this.y.b(uri);
        if (!(b instanceof iiq)) {
            return;
        }
        iiq iiqVar = (iiq) b;
        avaq avaqVar = this.g;
        if ((avaqVar.b & 1) == 0 || !avaqVar.f.equals(iiqVar.c)) {
            return;
        }
        aopa mo52toBuilder = this.g.mo52toBuilder();
        long j = iiqVar.e;
        mo52toBuilder.copyOnWrite();
        avaq avaqVar2 = (avaq) mo52toBuilder.instance;
        avaqVar2.c |= 2;
        avaqVar2.F = j;
        Boolean bool = iiqVar.h;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            mo52toBuilder.copyOnWrite();
            avaq avaqVar3 = (avaq) mo52toBuilder.instance;
            avaqVar3.b |= 1024;
            avaqVar3.l = booleanValue;
        }
        apos c = fny.c(this.g);
        apos aposVar = iiqVar.k;
        avbl e = fny.e(this.g);
        avbl avblVar = iiqVar.j;
        avbh d = fny.d(this.g);
        avbh avbhVar = iiqVar.i;
        if (c != null && aposVar != null) {
            aopa createBuilder = apok.a.createBuilder();
            createBuilder.copyOnWrite();
            apok apokVar = (apok) createBuilder.instance;
            apokVar.d = aposVar;
            apokVar.b |= 2;
            apok apokVar2 = (apok) createBuilder.mo39build();
            mo52toBuilder.copyOnWrite();
            avaq avaqVar4 = (avaq) mo52toBuilder.instance;
            apokVar2.getClass();
            avaqVar4.o = apokVar2;
            avaqVar4.b |= 8192;
        } else if (e != null && avblVar != null) {
            aopa createBuilder2 = avao.a.createBuilder();
            createBuilder2.copyOnWrite();
            avao avaoVar = (avao) createBuilder2.instance;
            avaoVar.c = avblVar;
            avaoVar.b = 119226798;
            avao avaoVar2 = (avao) createBuilder2.mo39build();
            mo52toBuilder.copyOnWrite();
            avaq avaqVar5 = (avaq) mo52toBuilder.instance;
            avaoVar2.getClass();
            avaqVar5.p = avaoVar2;
            avaqVar5.b |= 16384;
        } else if (d != null && avbhVar != null) {
            aopa createBuilder3 = avao.a.createBuilder();
            createBuilder3.copyOnWrite();
            avao avaoVar3 = (avao) createBuilder3.instance;
            avaoVar3.c = avbhVar;
            avaoVar3.b = 136076983;
            avao avaoVar4 = (avao) createBuilder3.mo39build();
            mo52toBuilder.copyOnWrite();
            avaq avaqVar6 = (avaq) mo52toBuilder.instance;
            avaoVar4.getClass();
            avaqVar6.p = avaoVar4;
            avaqVar6.b |= 16384;
        }
        this.g = (avaq) mo52toBuilder.mo39build();
        if (v()) {
            s();
        } else {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            r3 = -1
            r0 = 0
            if (r5 == r3) goto L63
            if (r5 != 0) goto L4a
            com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction r4 = (com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction) r4
            java.lang.String r3 = r4.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L6b
            avaq r3 = r2.g
            if (r3 == 0) goto L3b
            avan r3 = r3.u
            if (r3 != 0) goto L1a
            avan r3 = defpackage.avan.a
        L1a:
            int r3 = r3.b
            r5 = 136390057(0x82125a9, float:4.8493444E-34)
            if (r3 != r5) goto L3b
            avaq r3 = r2.g
            avan r3 = r3.u
            if (r3 != 0) goto L29
            avan r3 = defpackage.avan.a
        L29:
            int r1 = r3.b
            if (r1 != r5) goto L32
            java.lang.Object r3 = r3.c
            avav r3 = (defpackage.avav) r3
            goto L34
        L32:
            avav r3 = defpackage.avav.a
        L34:
            aopu r3 = r3.d
            amvn r3 = defpackage.amvn.p(r3)
            goto L3d
        L3b:
            java.util.Set r3 = defpackage.fmg.a
        L3d:
            java.lang.String r4 = r4.b
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L46
            goto L6b
        L46:
            r2.e()
            return r0
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 32
            r4.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L63:
            r3 = 1
            java.lang.Class[] r0 = new java.lang.Class[r3]
            r3 = 0
            java.lang.Class<com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction> r4 = com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class
            r0[r3] = r4
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmg.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    public final void l(avaq avaqVar, boolean z) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        if (!o(avaqVar)) {
            return;
        }
        boolean booleanValue = b().booleanValue();
        arag aragVar4 = null;
        if (booleanValue) {
            if (fyv.b(this.g) != null) {
                atuo b = fyv.b(this.g);
                AlertDialog alertDialog = this.h;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
                if ((b.b & 1) != 0) {
                    aragVar = b.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                AlertDialog.Builder title = builder.setTitle(ajgl.b(aragVar));
                if ((b.b & 2) != 0) {
                    aragVar2 = b.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                AlertDialog.Builder message = title.setMessage(ajgl.b(aragVar2));
                if ((b.b & 4) != 0) {
                    aragVar3 = b.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                this.h = message.setNegativeButton(ajgl.b(aragVar3), (DialogInterface.OnClickListener) null).create();
                if (b.f) {
                    final avaq avaqVar2 = this.g;
                    AlertDialog alertDialog2 = this.h;
                    if ((b.b & 16) != 0 && (aragVar4 = b.g) == null) {
                        aragVar4 = arag.a;
                    }
                    alertDialog2.setButton(-1, ajgl.b(aragVar4), new DialogInterface.OnClickListener() { // from class: fmb
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            fmg.this.h(avaqVar2, false, false);
                        }
                    });
                }
                this.h.show();
                return;
            }
        } else if ((this.g.b & 65536) != 0) {
            if (p() != null) {
                this.r.c(p(), null);
                return;
            }
            avau avauVar = this.g.q;
            if (avauVar == null) {
                avauVar = avau.a;
            }
            if ((avauVar.b & 4) != 0) {
                avau avauVar2 = this.g.q;
                if (avauVar2 == null) {
                    avauVar2 = avau.a;
                }
                aqmu aqmuVar = avauVar2.c;
                if (aqmuVar == null) {
                    aqmuVar = aqmu.a;
                }
                if (this.E == null) {
                    this.E = new AlertDialog.Builder(this.o).setPositiveButton(this.o.getResources().getString(R.string.ok), (DialogInterface.OnClickListener) null).create();
                }
                this.E.setTitle(aqmuVar.d);
                this.E.setMessage(aqmuVar.e);
                this.E.show();
            }
        }
        avaq avaqVar3 = this.g;
        if (!avaqVar3.n) {
            return;
        }
        h(avaqVar3, z, !booleanValue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (this.g == null) {
            return;
        }
        n(b().booleanValue());
    }

    public final void n(boolean z) {
        if (this.g != null) {
            boolean z2 = b().booleanValue() != z;
            this.b = z2;
            avaq avaqVar = this.g;
            if (avaqVar != null && this.i != null && !z2) {
                int i = avaqVar.b;
                if ((i & 1) == 0 || (i & 536870912) == 0) {
                    zep.b("SubscribeButtonRenderer must have valid channel id and tracking params");
                } else {
                    avbb avbbVar = this.C.a().q;
                    if (avbbVar == null) {
                        avbbVar = avbb.a;
                    }
                    if (this.D.nextFloat() < avbbVar.b) {
                        aopa createBuilder = asjj.a.createBuilder();
                        aopa createBuilder2 = askb.a.createBuilder();
                        boolean booleanValue = b().booleanValue();
                        createBuilder2.copyOnWrite();
                        askb askbVar = (askb) createBuilder2.instance;
                        askbVar.b |= 2;
                        askbVar.d = booleanValue;
                        String str = this.g.f;
                        createBuilder2.copyOnWrite();
                        askb askbVar2 = (askb) createBuilder2.instance;
                        str.getClass();
                        askbVar2.b = 1 | askbVar2.b;
                        askbVar2.c = str;
                        createBuilder.copyOnWrite();
                        asjj asjjVar = (asjj) createBuilder.instance;
                        askb askbVar3 = (askb) createBuilder2.mo39build();
                        askbVar3.getClass();
                        asjjVar.x = askbVar3;
                        asjjVar.c |= 16384;
                        this.i.w(new acte(this.g.D), (asjj) createBuilder.mo39build());
                    }
                }
            }
            if (z) {
                this.A.a(this.g);
            } else {
                this.B.a(this.g);
            }
            this.t.setVisibility(0);
            if (this.j != z || this.k != b().booleanValue()) {
                this.j = z;
                this.k = b().booleanValue();
                for (fmf fmfVar : this.e) {
                    fmfVar.oc(z, this.k);
                }
            }
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(avaq avaqVar) {
        avaq avaqVar2 = this.g;
        return (avaqVar2 == null || avaqVar == null || !avaqVar2.equals(avaqVar)) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avaq avaqVar;
        if (this.b || (avaqVar = this.g) == null) {
            return;
        }
        if (!avaqVar.y.isEmpty()) {
            this.r.d(this.g.y, null);
        } else if (this.v.o()) {
            avaq avaqVar2 = this.g;
            if (avaqVar2 != null && (avaqVar2.b & 536870912) != 0 && this.i != null) {
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asja.a.createBuilder();
                int i = true != b().booleanValue() ? 3 : 2;
                createBuilder2.copyOnWrite();
                asja asjaVar = (asja) createBuilder2.instance;
                asjaVar.c = i - 1;
                asjaVar.b |= 1;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asja asjaVar2 = (asja) createBuilder2.mo39build();
                asjaVar2.getClass();
                asjjVar.m = asjaVar2;
                asjjVar.b |= 32768;
                this.i.H(3, new acte(this.g.D.I()), (asjj) createBuilder.mo39build());
            }
            if (this.p.t()) {
                l(this.g, false);
                return;
            }
            fmd fmdVar = new fmd(this, this.g);
            if ((this.g.c & 1) == 0) {
                this.q.c(this.o, null, fmdVar);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sign_in_callback", fmdVar);
            aafo aafoVar = this.r;
            apzg apzgVar = this.g.E;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else {
            this.w.b();
        }
    }

    final Boolean b() {
        if (this.g == null) {
            throw new IllegalStateException("Active model not set on the server.");
        }
        if (v()) {
            return Boolean.valueOf(this.l);
        }
        return Boolean.valueOf(this.g.l);
    }
}
