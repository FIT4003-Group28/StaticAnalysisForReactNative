package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: avlx  reason: default package */
/* loaded from: classes3.dex */
public final class avlx {
    public final dxio<delp> a;
    public final avlw b = new avlw();
    private final avoo c;
    private final avzo d;
    private final avzj e;

    public avlx(avoo avooVar, avzo avzoVar, avzj avzjVar, dxio<delp> dxioVar) {
        this.c = avooVar;
        this.d = avzoVar;
        this.e = avzjVar;
        this.a = dxioVar;
    }

    private static String e(dspd dspdVar) {
        String valueOf = String.valueOf(Base64.encodeToString(dspdVar.G(), 8));
        return valueOf.length() != 0 ? "https://www.google.com/maps/offline/region/view/".concat(valueOf) : new String("https://www.google.com/maps/offline/region/view/");
    }

    public final boolean a(dltm dltmVar) {
        return this.d.a(dltmVar);
    }

    public final void b(dltm dltmVar) {
        String t;
        dlox dloxVar;
        delp a = this.a.a();
        if (a != null && a(dltmVar)) {
            try {
                avzj avzjVar = this.e;
                dlsw dlswVar = dltmVar.s;
                if (dlswVar == null) {
                    dlswVar = dlsw.d;
                }
                btlu c = avzjVar.c(dlswVar);
                if (c.f() || (t = c.t()) == null) {
                    return;
                }
                avoo avooVar = this.c;
                dlug dlugVar = dltmVar.c;
                if (dlugVar == null) {
                    dlugVar = dlug.c;
                }
                try {
                    dloxVar = (dlox) dsqw.cq(dlox.b, avooVar.a.b(dlugVar.bS()));
                } catch (Exception e) {
                    avoo.b("exteriorS2RectCovering", e);
                    dloxVar = dlox.b;
                }
                int size = dloxVar.a.size();
                if (size <= 0) {
                    return;
                }
                String[] strArr = new String[size];
                int i = 0;
                while (i < size) {
                    dluc dlucVar = dloxVar.a.get(i);
                    dwzj dwzjVar = dlucVar.b;
                    if (dwzjVar == null) {
                        dwzjVar = dwzj.d;
                    }
                    akqq q = akqq.q(dwzjVar);
                    dbsk.s(q);
                    dwzj dwzjVar2 = dlucVar.c;
                    if (dwzjVar2 == null) {
                        dwzjVar2 = dwzj.d;
                    }
                    akqq q2 = akqq.q(dwzjVar2);
                    dbsk.s(q2);
                    int i2 = i;
                    akqq akqqVar = new akqq(q2.a, q.b);
                    akqq akqqVar2 = new akqq(q.a, q2.b);
                    String a2 = akqqVar.a();
                    String a3 = akqqVar2.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
                    sb.append(a2);
                    sb.append(" ");
                    sb.append(a3);
                    strArr[i2] = sb.toString();
                    i = i2 + 1;
                }
                dems a4 = demu.geoShapeBuilder().a(dltmVar.a);
                a4.e(e(dltmVar.b));
                a4.d("box", strArr);
                demd demdVar = new demd();
                demdVar.a = true;
                cnwc.m(t, "accountEmail must not be an empty string");
                demdVar.b = t;
                cnwc.c(a4.b == null, "setMetadata may only be called once");
                a4.b = demdVar.a();
                cpcq<Void> a5 = a.a(a4.b());
                a5.s(this.b);
                a5.r(this.b);
            } catch (avzi unused) {
            }
        }
    }

    public final void c(dltm dltmVar) {
        d(dltmVar.b);
    }

    public final void d(dspd dspdVar) {
        delp a = this.a.a();
        if (a == null) {
            return;
        }
        cpcq<Void> b = a.b(e(dspdVar));
        b.s(this.b);
        b.r(this.b);
    }
}
