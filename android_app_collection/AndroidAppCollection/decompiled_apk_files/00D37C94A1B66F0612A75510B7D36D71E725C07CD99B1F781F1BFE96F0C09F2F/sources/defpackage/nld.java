package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nld  reason: default package */
/* loaded from: classes3.dex */
public final class nld extends ajyq implements xmy, ynl {
    private final ajin a;
    private final xko b;
    private final acti c;
    private final xna d;

    public nld(ajyi ajyiVar, yni yniVar, yzj yzjVar, ajin ajinVar, xko xkoVar, xna xnaVar, aari aariVar, acti actiVar) {
        super(aariVar, ajyiVar, yniVar, yzjVar, actiVar, null);
        this.a = ajinVar;
        this.b = xkoVar;
        this.d = xnaVar;
        this.c = actiVar;
        L(ajinVar);
        amvl i = amvn.i();
        i.k(xnaVar.a.iterator());
        i.c(this);
        xnaVar.a = i.g();
    }

    @Override // defpackage.xmy
    public final void c(arnw arnwVar) {
        arnh arnhVar;
        aqtb aqtbVar;
        arnx arnxVar = arnwVar.d;
        if (arnxVar == null) {
            arnxVar = arnx.a;
        }
        if (arnxVar.b != 153515154 || this.a == null) {
            return;
        }
        xko xkoVar = this.b;
        if ((arnwVar.b & 16) != 0) {
            arnhVar = arnwVar.h;
            if (arnhVar == null) {
                arnhVar = arnh.a;
            }
        } else {
            arnhVar = null;
        }
        xkoVar.b(arnhVar, amup.k("sectionController", this), R.string.reply_added);
        if (af(ajfy.NEXT)) {
            return;
        }
        arnx arnxVar2 = arnwVar.d;
        if (arnxVar2 == null) {
            arnxVar2 = arnx.a;
        }
        if (arnxVar2.b == 153515154) {
            aqtbVar = (aqtb) arnxVar2.c;
        } else {
            aqtbVar = aqtb.a;
        }
        if ((aqtbVar.b & 8) != 0) {
            this.c.D(new acte(aqtbVar.e.I()));
        }
        B(ajhh.a(aqtbVar));
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        super.j();
        xna xnaVar = this.d;
        amvl i = amvn.i();
        amzs it = xnaVar.a.iterator();
        while (it.hasNext()) {
            xmy xmyVar = (xmy) it.next();
            if (xmyVar != this) {
                i.c(xmyVar);
            }
        }
        xnaVar.a = i.g();
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == nld.class) {
            if (i == -1) {
                return new Class[]{aabk.class, aabm.class, aawi.class, ajym.class};
            }
            if (i == 0) {
                nn((aabk) obj);
                return null;
            } else if (i == 1) {
                no((aabm) obj);
                return null;
            } else if (i == 2) {
                N((aawi) obj);
                return null;
            } else if (i == 3) {
                M((ajym) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
