package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: adzp  reason: default package */
/* loaded from: classes.dex */
public final class adzp implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[] fArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[] iArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[] sArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[] zArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[][] fArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[][] iArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[][] sArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public adzp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public static adzp A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 12, (float[]) null);
    }

    public static adzp B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 13, (byte[][]) null);
    }

    public static adzp C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 14, (char[][]) null);
    }

    public static adzp D(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 15, (short[][]) null);
    }

    public static adzp E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 16, (int[][]) null);
    }

    public static adzp F(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 17, (boolean[][]) null);
    }

    public static adzp G(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 18, (float[][]) null);
    }

    public static adzp H(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 19, (byte[][][]) null);
    }

    public static adzp I(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 20, (char[][][]) null);
    }

    public static adzo a(azqb azqbVar, aepf aepfVar, afgz afgzVar) {
        return new adzo(azqbVar, aepfVar, afgzVar);
    }

    public static adzp b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3);
    }

    public static aesh c(aesi aesiVar, afxq afxqVar, afxq afxqVar2) {
        ArrayList arrayList = new ArrayList(2);
        if (afxqVar != null) {
            arrayList.add(afxqVar);
        }
        if (afxqVar2 != null) {
            arrayList.add(afxqVar2);
        }
        return aesiVar.a(amuk.o(arrayList));
    }

    public static ymq d(Context context, String str, ampq ampqVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ymo("DelayedEventProto"));
        return new ymk(context, str, arrayList, ((Integer) ampqVar.e(0)).intValue());
    }

    public static ymk e(Context context, String str, ampq ampqVar) {
        return new ymk(context, str, amuk.t(new ymo("ScheduledTaskProto"), new ymo("OfflineHttpRequestProto"), new ymo(1)), ((Integer) ampqVar.e(0)).intValue());
    }

    public static yqy f(ampq ampqVar, afys afysVar, yqy yqyVar) {
        azqb azqbVar = afysVar.a;
        apfr apfrVar = (apfr) afysVar.b.get();
        apfrVar.getClass();
        yqyVar.getClass();
        return (yqy) ampqVar.e(new afyr(azqbVar, apfrVar, yqyVar));
    }

    public static Set g(afzu afzuVar, afxq afxqVar, afxq afxqVar2) {
        amvl i = amvn.i();
        i.c(afzuVar);
        if (afxqVar != null) {
            i.c(afxqVar);
        }
        i.c(afxqVar2);
        amvn g = i.g();
        axzl.o(g);
        return g;
    }

    public static yqx h(snc sncVar, yqj yqjVar, afsx afsxVar) {
        return yqx.a(yqjVar, new afxz(afsxVar, sncVar));
    }

    public static yve i(Context context, ankw ankwVar, vlk vlkVar) {
        vjf a = vjg.a(context);
        a.e("net");
        a.f("delayed_event.pb");
        Uri a2 = a.a();
        yvh d = yvi.d(new ajab(context, 1), ankwVar);
        d.a = zto.h;
        d.b(adrz.m);
        d.b = adrz.l;
        d.c = aber.u;
        yvi a3 = d.a();
        vli a4 = vlj.a();
        a4.f(a2);
        a4.e(awus.a);
        a4.b(a3);
        return new yvc(vmu.b(vlkVar.a(a4.a())), awus.a);
    }

    public static afyq j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new afyq(azqbVar, azqbVar2, azqbVar3);
    }

    public static ampq k(aadd aaddVar, Context context, axnm axnmVar) {
        return aiix.e(aaddVar).f115J ? ampq.j(new zgx(context, (Handler) axnmVar.get())) : amon.a;
    }

    public static ahib l(zgz zgzVar, ajbk ajbkVar) {
        return new ahib(zgzVar, ajbkVar);
    }

    public static aigt m(aiha aihaVar) {
        return new aigt(aihaVar);
    }

    public static aiwf n(ankt anktVar, aiix aiixVar) {
        return new aiwf(anktVar, aiixVar);
    }

    public static ajdp o(String str, aiix aiixVar, ahfm ahfmVar) {
        return new ajdp(str, aiixVar, ahfmVar);
    }

    public static ajfv p(ajav ajavVar, aijg aijgVar, aeov aeovVar) {
        return new ajfv(ajavVar, aijgVar, aeovVar);
    }

    public static adzp q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 1);
    }

    public static adzp r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 2);
    }

    public static adzp s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 3);
    }

    public static adzp t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 4, (byte[]) null);
    }

    public static adzp u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 6);
    }

    public static adzp v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 7);
    }

    public static adzp w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 8);
    }

    public static adzp x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 9, (short[]) null);
    }

    public static adzp y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 10, (int[]) null);
    }

    public static adzp z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new adzp(azqbVar, azqbVar2, azqbVar3, 11, (boolean[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                return a(this.a, (aepf) this.b.get(), ((afha) this.c).get());
            case 1:
                return c(((aesj) this.b).get(), (afxq) this.a.get(), (afxq) this.c.get());
            case 2:
                return d((Context) ((axov) this.b).a, (String) this.a.get(), (ampq) ((axov) this.c).a);
            case 3:
                return e((Context) ((axov) this.b).a, (String) this.a.get(), (ampq) ((axov) this.c).a);
            case 4:
                return f((ampq) ((axov) this.a).a, ((afyt) this.c).get(), (yqy) this.b.get());
            case 5:
                return g((afzu) this.c.get(), (afxq) this.a.get(), ((vwo) this.b).a());
            case 6:
                return h((snc) this.b.get(), (yqj) this.a.get(), (afsx) this.c.get());
            case 7:
                return i((Context) ((axov) this.b).a, (ankw) this.a.get(), (vlk) this.c.get());
            case 8:
                return new afuf((yme) this.b.get(), (amup) ((axov) this.a).a, (yve) this.c.get());
            case 9:
                return j(this.c, this.a, this.b);
            case 10:
                return k((aadd) this.c.get(), (Context) ((axov) this.b).a, axot.a(this.a));
            case 11:
                ajfa ajfaVar = (ajfa) this.c.get();
                return l((zgz) this.a.get(), (ajbk) this.b.get());
            case 12:
                aadd aaddVar = (aadd) this.b.get();
                aigt m = m(((aihb) this.c).get());
                m.a((aynx) this.a.get());
                return m;
            case 13:
                return new aisp((aynx) this.b.get(), (aynx) this.c.get(), (aynx) this.a.get());
            case 14:
                aiwf n = n((ankt) this.c.get(), (aiix) this.b.get());
                n.b((airw) this.a.get());
                return n;
            case 15:
                return new aiwy((ScheduledExecutorService) this.a.get(), (Executor) this.b.get(), (zie) this.c.get());
            case 16:
                return new aiyx((Context) ((axov) this.a).a, (aitm) this.c.get(), (aacz) this.b.get());
            case 17:
                return o(((yin) this.c).b(), (aiix) this.b.get(), (ahfm) ((axov) this.a).a);
            case 18:
                return new ajfa((Executor) this.c.get(), (ajet) ((axov) this.a).a, (snc) this.b.get());
            case 19:
                ajfv p = p((ajav) this.a.get(), (aijg) this.c.get(), (aeov) this.b.get());
                p.a();
                return p;
            default:
                return new ajmo((ajmr) this.c.get(), ((ajnl) this.a).get(), ajnk.a(), (aacz) this.b.get());
        }
    }
}
