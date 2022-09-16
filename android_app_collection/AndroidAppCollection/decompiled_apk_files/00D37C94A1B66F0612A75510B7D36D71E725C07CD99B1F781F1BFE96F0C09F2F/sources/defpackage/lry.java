package defpackage;
/* compiled from: PG */
/* renamed from: lry  reason: default package */
/* loaded from: classes3.dex */
public final class lry extends lpi implements ynl {
    public lry(ajyi ajyiVar, yni yniVar, yzj yzjVar, ajin ajinVar, snc sncVar, iub iubVar, ajxt ajxtVar, ampq ampqVar, aari aariVar, acti actiVar, akam akamVar) {
        super(ajyiVar, yniVar, yzjVar, ajinVar, sncVar, iubVar, ampqVar, ajxtVar, aariVar, actiVar, akamVar);
        K(false);
    }

    @Override // defpackage.lpi, defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == lry.class) {
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
