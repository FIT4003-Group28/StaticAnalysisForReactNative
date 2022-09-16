package defpackage;

import android.accounts.Account;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: ktg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ktg implements ayqe {
    private final /* synthetic */ int u;
    public static final /* synthetic */ ktg t = new ktg(20);
    public static final /* synthetic */ ktg s = new ktg(19);
    public static final /* synthetic */ ktg r = new ktg(18);
    public static final /* synthetic */ ktg q = new ktg(17);
    public static final /* synthetic */ ktg p = new ktg(16);
    public static final /* synthetic */ ktg o = new ktg(15);
    public static final /* synthetic */ ktg n = new ktg(14);
    public static final /* synthetic */ ktg m = new ktg(13);
    public static final /* synthetic */ ktg l = new ktg(12);
    public static final /* synthetic */ ktg k = new ktg(11);
    public static final /* synthetic */ ktg j = new ktg(10);
    public static final /* synthetic */ ktg i = new ktg(9);
    public static final /* synthetic */ ktg h = new ktg(7);
    public static final /* synthetic */ ktg g = new ktg(6);
    public static final /* synthetic */ ktg f = new ktg(5);
    public static final /* synthetic */ ktg e = new ktg(4);
    public static final /* synthetic */ ktg d = new ktg(3);
    public static final /* synthetic */ ktg c = new ktg(2);
    public static final /* synthetic */ ktg b = new ktg(1);
    public static final /* synthetic */ ktg a = new ktg();

    private /* synthetic */ ktg() {
    }

    public /* synthetic */ ktg(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return (Collection) obj;
            case 1:
                return ((aajp) obj).c;
            case 2:
                return (List) obj;
            case 3:
                aupg aupgVar = ((arhd) obj).n;
                return aupgVar == null ? aupg.a : aupgVar;
            case 4:
                return (Account) ((ampq) obj).c();
            case 5:
                return Boolean.valueOf(eog.W((arhd) obj));
            case 6:
                fgu fguVar = (fgu) obj;
                if ((fguVar.b & 4) != 0) {
                    return Integer.valueOf(fguVar.e);
                }
                return -1;
            case 7:
                awan b2 = awan.b(((awuj) obj).m);
                return b2 == null ? awan.VIDEO_QUALITY_SETTING_UNKNOWN : b2;
            case 8:
                ljp ljpVar = (ljp) obj;
                aopa createBuilder = aphr.a.createBuilder();
                boolean z = ljpVar.f;
                createBuilder.copyOnWrite();
                aphr aphrVar = (aphr) createBuilder.instance;
                aphrVar.b |= 524288;
                aphrVar.e = z;
                boolean z2 = ljpVar.g;
                createBuilder.copyOnWrite();
                aphr aphrVar2 = (aphr) createBuilder.instance;
                aphrVar2.b |= 1048576;
                aphrVar2.f = z2;
                boolean z3 = ljpVar.h;
                createBuilder.copyOnWrite();
                aphr aphrVar3 = (aphr) createBuilder.instance;
                aphrVar3.b |= 2097152;
                aphrVar3.g = z3;
                boolean z4 = ljpVar.i;
                createBuilder.copyOnWrite();
                aphr aphrVar4 = (aphr) createBuilder.instance;
                aphrVar4.b |= 4194304;
                aphrVar4.h = z4;
                boolean z5 = ljpVar.j;
                createBuilder.copyOnWrite();
                aphr aphrVar5 = (aphr) createBuilder.instance;
                aphrVar5.b |= 16777216;
                aphrVar5.j = z5;
                boolean z6 = ljpVar.k;
                createBuilder.copyOnWrite();
                aphr aphrVar6 = (aphr) createBuilder.instance;
                aphrVar6.b |= 8388608;
                aphrVar6.i = z6;
                return (aphr) createBuilder.mo39build();
            case 9:
                return ampq.j((aphr) obj);
            case 10:
                asxp asxpVar = ((arhd) obj).e;
                return asxpVar == null ? asxp.a : asxpVar;
            case 11:
                asxp asxpVar2 = (asxp) obj;
                boolean z7 = false;
                if (asxpVar2.ab && asxpVar2.ac) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 12:
                return Boolean.valueOf(eog.W((arhd) obj));
            case 13:
                gft gftVar = (gft) obj;
                return Pair.create(gftVar.f, Boolean.valueOf(gftVar.e));
            case 14:
                return ayoi.Q(((aawr) obj).a.d).I(kth.d).V(o).j();
            case 15:
                arul arulVar = (arul) obj;
                if (arulVar.b == 123267149) {
                    return (atia) arulVar.c;
                }
                return atia.a;
            case 16:
                aqls aqlsVar = ((atia) obj).f;
                if (aqlsVar == null) {
                    aqlsVar = aqls.a;
                }
                aqlr aqlrVar = aqlsVar.b;
                return aqlrVar == null ? aqlr.a : aqlrVar;
            case 17:
                return ampq.j((Drawable) obj);
            case 18:
                return Boolean.valueOf(eog.W((arhd) obj));
            case 19:
                return Boolean.valueOf(((lwl) obj).f());
            default:
                return ayoi.Q(((aawr) obj).a.d).I(kth.e).V(lyd.a).j();
        }
    }
}
