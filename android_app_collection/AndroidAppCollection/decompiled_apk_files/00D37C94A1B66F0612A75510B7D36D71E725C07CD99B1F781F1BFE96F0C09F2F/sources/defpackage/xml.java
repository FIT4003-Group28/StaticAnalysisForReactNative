package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xml  reason: default package */
/* loaded from: classes4.dex */
public final class xml extends ajyq implements xmz, xnf, xow, ynl {
    private Object F;
    private int G;
    public final acti a;
    public String b;
    private final List c;
    private final xln d;
    private final akab e;
    private final xkb h;
    private final yni m;
    private final ajin n;
    private final xko o;
    private final xna p;
    private final xng q;
    private final xov r;
    private aslo s;

    public xml(ajyi ajyiVar, yni yniVar, yzj yzjVar, xln xlnVar, ajin ajinVar, xyc xycVar, xkb xkbVar, xko xkoVar, xna xnaVar, xng xngVar, xov xovVar, aari aariVar, acti actiVar, akam akamVar) {
        super(aariVar, ajyiVar, yniVar, yzjVar, actiVar, akam.a(akamVar));
        this.c = new ArrayList();
        this.d = xlnVar;
        this.n = ajinVar;
        this.h = xkbVar;
        this.m = yniVar;
        this.a = actiVar;
        this.o = xkoVar;
        this.p = xnaVar;
        this.q = xngVar;
        this.r = xovVar;
        amvl i = amvn.i();
        i.k(xnaVar.b.iterator());
        i.c(this);
        xnaVar.b = i.g();
        amvl i2 = amvn.i();
        i2.k(xngVar.a.iterator());
        i2.c(this);
        xngVar.a = i2.g();
        if (akamVar instanceof xmk) {
            this.b = ((xmk) akamVar).a;
        }
        this.i.mG(new xlo(xlnVar));
        akab akabVar = new akab();
        this.e = akabVar;
        akabVar.b(new ajyo());
        if (ajinVar != null) {
            L(ajinVar);
            akabVar.b(ajinVar);
        }
        xkbVar.a.add(this);
        xycVar.a.clear();
    }

    private final void Q(List list) {
        R(list, 0);
    }

    private final void R(List list, int i) {
        A();
        int i2 = this.s == null ? 0 : 1;
        int size = this.i.size() - i2;
        int min = Math.min(size, i);
        int max = Math.max(0, size - min);
        int min2 = Math.min(max, list.size());
        int min3 = Math.min(min + i2, this.i.size());
        for (int i3 = 0; i3 < min2; i3++) {
            I(this.i.get(min3 + i3), list.get(i3));
        }
        if (max < list.size()) {
            D(list.subList(max, list.size()));
        } else if (max > list.size()) {
            int size2 = list.size() + min3;
            ajsm ajsmVar = this.i;
            ajsmVar.h(size2, ajsmVar.size() - size2);
        }
    }

    private final void T(aakq aakqVar) {
        aslo asloVar = aakqVar.a.d;
        if (asloVar == null) {
            asloVar = aslo.a;
        }
        int i = asloVar.b;
        if ((i & 64) != 0) {
            aqtb aqtbVar = asloVar.i;
            if (aqtbVar == null) {
                aqtbVar = aqtb.a;
            }
            x(aqtbVar);
        } else if ((i & 4) == 0) {
        } else {
            aqbx aqbxVar = asloVar.e;
            if (aqbxVar == null) {
                aqbxVar = aqbx.a;
            }
            w(aqbxVar);
        }
    }

    public static final boolean y(aakq aakqVar) {
        if (!aakqVar.a.h.equals("comment-item-section")) {
            aslo asloVar = aakqVar.a.d;
            if (asloVar == null) {
                asloVar = aslo.a;
            }
            return (asloVar.b & 4) != 0;
        }
        return true;
    }

    @Override // defpackage.ajyq
    public final void i(aakq aakqVar) {
        yni yniVar = this.m;
        if (yniVar != null) {
            yniVar.k(this.c);
            this.c.clear();
            String str = aakqVar.a.h;
            if (str.startsWith("community-tab")) {
                this.c.add(this.m.b(this, aabi.class, str, new xmi(this, 1)));
                this.c.add(this.m.b(this, aabo.class, str, new xmi(this)));
            }
        }
        this.r.a.c(this);
        this.b = aakqVar.a.h;
        this.d.b();
        T(aakqVar);
        Q(this.e.a(aakqVar.a.e));
        ls(aakqVar.a());
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        super.j();
        this.h.a.remove(this);
        xna xnaVar = this.p;
        amvl i = amvn.i();
        amzs it = xnaVar.b.iterator();
        while (it.hasNext()) {
            xmz xmzVar = (xmz) it.next();
            if (xmzVar != this) {
                i.c(xmzVar);
            }
        }
        xnaVar.b = i.g();
        xng xngVar = this.q;
        amvl i2 = amvn.i();
        amzs it2 = xngVar.a.iterator();
        while (it2.hasNext()) {
            xnf xnfVar = (xnf) it2.next();
            if (xnfVar != this) {
                i2.c(xnfVar);
            }
        }
        xngVar.a = i2.g();
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == xml.class) {
            if (i == -1) {
                return new Class[]{xou.class, aabk.class, aabm.class, aawi.class, ajym.class};
            }
            if (i != 0) {
                if (i == 1) {
                    nn((aabk) obj);
                    return null;
                } else if (i == 2) {
                    no((aabm) obj);
                    return null;
                } else if (i == 3) {
                    N((aawi) obj);
                    return null;
                } else if (i == 4) {
                    M((ajym) obj);
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) ((xou) obj).h();
            if (!TextUtils.equals(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.e, this.b)) {
                return null;
            }
            if ((commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b & 16) != 0 && commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.g) {
                return null;
            }
            int e = aqgn.e(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.d);
            if (e == 0) {
                e = 1;
            }
            int i2 = e - 1;
            if (i2 == 1) {
                aqcm aqcmVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqcmVar == null) {
                    aqcmVar = aqcm.a;
                }
                aumx aumxVar = aqcmVar.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                lx(aumxVar, null);
                return null;
            } else if (i2 != 2) {
                aqcm aqcmVar2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqcmVar2 == null) {
                    aqcmVar2 = aqcm.a;
                }
                aumx aumxVar2 = aqcmVar2.c;
                if (aumxVar2 == null) {
                    aumxVar2 = aumx.a;
                }
                lr(ajna.g(aumxVar2));
                return null;
            } else {
                aqcm aqcmVar3 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqcmVar3 == null) {
                    aqcmVar3 = aqcm.a;
                }
                aumx aumxVar3 = aqcmVar3.c;
                if (aumxVar3 == null) {
                    aumxVar3 = aumx.a;
                }
                r(aumxVar3, Math.max(0, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.f));
                return null;
            }
        }
        return super.ky(cls, obj, i);
    }

    @Override // defpackage.ajxl
    public final void lB() {
        super.lB();
        this.s = null;
        this.F = null;
        this.G = 0;
        this.r.a.d(this);
    }

    @Override // defpackage.ajyq, defpackage.ajxy
    public final String lv() {
        return this.b;
    }

    @Override // defpackage.ajyq, defpackage.ajwc
    public final void lw(Object obj, int i) {
        C(obj, i + (this.s == null ? 0 : 1));
    }

    @Override // defpackage.ajyq, defpackage.ajwq
    public final void lx(aumx aumxVar, apzg apzgVar) {
        A();
        if (this.i.size() != 0) {
            this.G = 0;
            Q(amuk.q());
        }
        lr(ajna.g(aumxVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajyq
    public final void nm(aakq aakqVar) {
        T(aakqVar);
        super.nm(aakqVar);
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        return new xmk(super.pn(), this.b);
    }

    public final void r(aumx aumxVar, int i) {
        if (this.G == 0) {
            aqxo.y(true);
            xln xlnVar = this.d;
            xlnVar.b();
            xlnVar.c = -1L;
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < 10; i2++) {
                linkedList.add(new xwe(i2));
            }
            R(linkedList, i);
            this.G = 10;
        }
        Z(ajna.g(aumxVar), new xmj(this, i));
    }

    @Override // defpackage.xnf
    public final void s(List list) {
        xnd xndVar = new xnd(this);
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                aunb aunbVar = (aunb) list.get(size);
                if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                    xndVar.a(ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer)), false);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.xmz
    public final void t(arnz arnzVar) {
        arnh arnhVar;
        aqtb aqtbVar;
        aroa aroaVar = arnzVar.d;
        if (aroaVar == null) {
            aroaVar = aroa.a;
        }
        if (aroaVar.b != 153515154 || this.n == null) {
            return;
        }
        xko xkoVar = this.o;
        if ((arnzVar.b & 4) != 0) {
            arnhVar = arnzVar.f;
            if (arnhVar == null) {
                arnhVar = arnh.a;
            }
        } else {
            arnhVar = null;
        }
        xkoVar.b(arnhVar, amup.k("sectionController", this), R.string.reply_added);
        aroa aroaVar2 = arnzVar.d;
        if (aroaVar2 == null) {
            aroaVar2 = aroa.a;
        }
        if (aroaVar2.b == 153515154) {
            aqtbVar = (aqtb) aroaVar2.c;
        } else {
            aqtbVar = aqtb.a;
        }
        if ((aqtbVar.b & 8) != 0) {
            this.a.D(new acte(aqtbVar.e.I()));
        }
        new xnd(this).a(ajhh.a(aqtbVar), false);
    }

    @Override // defpackage.xow
    public final void u(aabn aabnVar) {
        for (int i = this.s == null ? 0 : 1; i < this.i.size(); i++) {
            if (aabnVar.a().a(this.i.get(i))) {
                G(this.i.get(i));
                C(aabnVar.b(), i);
            }
        }
    }

    public final void v(int i) {
        if (this.G == 0) {
            return;
        }
        boolean z = true;
        int i2 = i + (this.s == null ? 0 : 1);
        if (i2 >= this.i.size() || !(this.i.get(i2) instanceof xwe)) {
            z = false;
        }
        aqxo.y(z);
        this.i.h(i2, Math.min(this.G, this.i.size() - i2));
        this.G = 0;
    }

    public final void w(aqbx aqbxVar) {
        if (this.s == null) {
            C(aqbxVar, 0);
        } else {
            I(P(), aqbxVar);
        }
        aopa createBuilder = aslo.a.createBuilder();
        createBuilder.copyOnWrite();
        aslo asloVar = (aslo) createBuilder.instance;
        aqbxVar.getClass();
        asloVar.e = aqbxVar;
        asloVar.b |= 4;
        this.s = (aslo) createBuilder.mo39build();
        this.F = aqbxVar;
    }

    public final void x(aqtb aqtbVar) {
        if (this.s == null) {
            C(aqtbVar, 0);
        } else {
            I(P(), aqtbVar);
        }
        aopa createBuilder = aslo.a.createBuilder();
        createBuilder.copyOnWrite();
        aslo asloVar = (aslo) createBuilder.instance;
        aqtbVar.getClass();
        asloVar.i = aqtbVar;
        asloVar.b |= 64;
        this.s = (aslo) createBuilder.mo39build();
        this.F = aqtbVar;
    }

    private final Object P() {
        Object obj = this.F;
        if (obj != null) {
            return obj;
        }
        aslo asloVar = this.s;
        if (asloVar == null) {
            return null;
        }
        int i = asloVar.b;
        if ((i & 64) != 0) {
            aqtb aqtbVar = asloVar.i;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        } else if ((i & 4) == 0) {
            return null;
        } else {
            aqbx aqbxVar = asloVar.e;
            return aqbxVar == null ? aqbx.a : aqbxVar;
        }
    }
}
