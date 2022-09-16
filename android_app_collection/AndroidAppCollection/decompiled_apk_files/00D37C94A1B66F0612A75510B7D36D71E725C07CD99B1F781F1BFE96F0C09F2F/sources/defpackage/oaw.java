package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: oaw  reason: default package */
/* loaded from: classes3.dex */
public final class oaw extends lpi implements ynl {
    public final ajrj a;
    private aypg b;

    public oaw(abeb abebVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, ajxt ajxtVar, ajin ajinVar, snc sncVar, iub iubVar, ampq ampqVar, ghs ghsVar) {
        super(ajyiVar, yniVar, yzjVar, ajinVar, sncVar, iubVar, ampqVar, ajxtVar, abebVar, actiVar, null);
        ajrj ajrjVar = new ajrj();
        this.a = ajrjVar;
        ajrjVar.m(this.i);
        this.b = ghsVar.d.C(oav.a).n().Z(new ayqb() { // from class: oau
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                oaw oawVar = oaw.this;
                if (((Boolean) obj).booleanValue()) {
                    oawVar.a.t();
                } else if (oawVar.a.h() != 0) {
                } else {
                    oawVar.a.m(oawVar.i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(aslq aslqVar) {
        return (aslqVar == null || (aslqVar.c & 8) == 0 || !aslqVar.h.equals("comments-entry-point")) ? false : true;
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        super.j();
        aypg aypgVar = this.b;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.b = null;
        }
    }

    @Override // defpackage.ajxl, defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }

    @Override // defpackage.lpi, defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == oaw.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, aabk.class, aabm.class, aawi.class, aawj.class, ajym.class};
                case 0:
                    n((isw) obj);
                    return null;
                case 1:
                    nn((aabk) obj);
                    return null;
                case 2:
                    no((aabm) obj);
                    return null;
                case 3:
                    N((aawi) obj);
                    return null;
                case 4:
                    o((aawj) obj);
                    return null;
                case 5:
                    M((ajym) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
