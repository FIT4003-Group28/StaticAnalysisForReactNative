package defpackage;

import android.content.res.Configuration;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: oav  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oav implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ oav u = new oav(20);
    public static final /* synthetic */ oav t = new oav(19);
    public static final /* synthetic */ oav s = new oav(18);
    public static final /* synthetic */ oav r = new oav(17);
    public static final /* synthetic */ oav q = new oav(16);
    public static final /* synthetic */ oav p = new oav(15);
    public static final /* synthetic */ oav o = new oav(14);
    public static final /* synthetic */ oav n = new oav(13);
    public static final /* synthetic */ oav m = new oav(12);
    public static final /* synthetic */ oav l = new oav(11);
    public static final /* synthetic */ oav k = new oav(10);
    public static final /* synthetic */ oav j = new oav(9);
    public static final /* synthetic */ oav i = new oav(8);
    public static final /* synthetic */ oav h = new oav(7);
    public static final /* synthetic */ oav g = new oav(6);
    public static final /* synthetic */ oav f = new oav(5);
    public static final /* synthetic */ oav e = new oav(4);
    public static final /* synthetic */ oav d = new oav(3);
    public static final /* synthetic */ oav c = new oav(2);
    public static final /* synthetic */ oav b = new oav(1);
    public static final /* synthetic */ oav a = new oav();

    private /* synthetic */ oav() {
    }

    private /* synthetic */ oav(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                if (((Integer) obj).intValue() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                gbd gbdVar = (gbd) obj;
                return ayoi.T(true);
            case 2:
                return Boolean.valueOf(((zbb) obj) instanceof zbe);
            case 3:
                return ((ahic) obj).a().b();
            case 4:
                return Boolean.valueOf(((zbb) obj) instanceof zbe);
            case 5:
                return ((aajp) obj).c;
            case 6:
                return ((ahic) obj).a().b();
            case 7:
                if (((Integer) obj).intValue() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return Integer.valueOf(((zaw) obj).a.a.top);
            case 9:
                return ((gbd) obj).aN();
            case 10:
                return Integer.valueOf(((Configuration) obj).smallestScreenWidthDp);
            case 11:
                return ((gbd) obj).aN();
            case 12:
                return ((aawr) obj).a;
            case 13:
                return ((aruk) obj).d;
            case 14:
                arul arulVar = (arul) obj;
                if (arulVar.b == 117866661) {
                    return (atxm) arulVar.c;
                }
                return atxm.a;
            case 15:
                return ((atxm) obj).b;
            case 16:
                return meq.a((atxn) obj);
            case 17:
                return (meq) ((Optional) obj).get();
            case 18:
                String str = (String) obj;
                return str.isEmpty() ? Optional.empty() : Optional.of(str);
            case 19:
                return ((meq) obj).d;
            default:
                return Integer.valueOf(((okw) obj).c);
        }
    }
}
