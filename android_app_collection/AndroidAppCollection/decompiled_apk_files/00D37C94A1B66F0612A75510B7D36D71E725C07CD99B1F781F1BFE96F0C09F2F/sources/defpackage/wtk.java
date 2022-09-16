package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wtk  reason: default package */
/* loaded from: classes4.dex */
public final class wtk implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final /* synthetic */ int i;

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i) {
        this.i = i;
        this.f = azqbVar;
        this.h = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
        this.g = azqbVar5;
        this.e = azqbVar6;
        this.c = azqbVar7;
        this.b = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, byte[] bArr) {
        this.i = i;
        this.f = azqbVar;
        this.e = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
        this.g = azqbVar5;
        this.b = azqbVar6;
        this.h = azqbVar7;
        this.a = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, char[] cArr) {
        this.i = i;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.f = azqbVar4;
        this.h = azqbVar5;
        this.b = azqbVar6;
        this.g = azqbVar7;
        this.c = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, float[] fArr) {
        this.i = i;
        this.c = azqbVar;
        this.f = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
        this.h = azqbVar5;
        this.d = azqbVar6;
        this.g = azqbVar7;
        this.e = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, int[] iArr) {
        this.i = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.h = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.g = azqbVar6;
        this.f = azqbVar7;
        this.b = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, short[] sArr) {
        this.i = i;
        this.d = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
        this.g = azqbVar4;
        this.f = azqbVar5;
        this.b = azqbVar6;
        this.e = azqbVar7;
        this.h = azqbVar8;
    }

    public wtk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, int i, boolean[] zArr) {
        this.i = i;
        this.g = azqbVar;
        this.b = azqbVar2;
        this.e = azqbVar3;
        this.f = azqbVar4;
        this.d = azqbVar5;
        this.a = azqbVar6;
        this.h = azqbVar7;
        this.c = azqbVar8;
    }

    public static wtk a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8);
    }

    public static acrx b(acrf acrfVar, aazp aazpVar, Object obj, afvn afvnVar, afso afsoVar, ykw ykwVar, afug afugVar) {
        return new acrx(acrfVar, aazpVar, (acrs) obj, afvnVar, afsoVar, ykwVar, afugVar);
    }

    public static ainw c(Context context, aizp aizpVar, aizn aiznVar, airw airwVar, aioa aioaVar, ainq ainqVar, snc sncVar, aioe aioeVar, List list) {
        return new ainw(context, aizpVar, aiznVar, airwVar.aF(), ainqVar, aioaVar, sncVar, aioeVar, list);
    }

    public static wtk d(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 1);
    }

    public static wtk e(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 2, (byte[]) null);
    }

    public static wtk f(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 3, (char[]) null);
    }

    public static wtk g(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 4, (short[]) null);
    }

    public static wtk h(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 5, (int[]) null);
    }

    public static wtk i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 6, (boolean[]) null);
    }

    public static wtk j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        return new wtk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, 7, (float[]) null);
    }

    public static aagk k(afvn afvnVar, azqb azqbVar, yni yniVar, azqb azqbVar2, aaki aakiVar, Map map, Executor executor, abgb abgbVar) {
        return new aagk(afvnVar, azqbVar, yniVar, azqbVar2, aakiVar, map, executor);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.i) {
            case 0:
                return new wtj(this.a, (wle) this.b.get(), this.c, this.d, (amvn) this.e.get(), (aadd) this.f.get(), (aacz) this.g.get(), this.h);
            case 1:
                return new afsl((Executor) this.f.get(), (Context) ((axov) this.h).a, (yqh) this.a.get(), this.d, null, (snc) this.g.get(), ((ajnl) this.e).get(), new ajml(), this.c, this.b, amon.a);
            case 2:
                snc sncVar = (snc) this.f.get();
                return new xiy((aiji) this.e.get(), (aijh) this.d.get(), (wjy) this.c.get(), (wzb) this.g.get(), (afzo) this.b.get(), (wzx) this.h.get(), (aafo) this.a.get());
            case 3:
                return k((afvn) this.d.get(), this.e, (yni) this.a.get(), this.f, (aaki) this.h.get(), (Map) ((axov) this.b).a, (Executor) this.g.get(), (abgb) this.c.get());
            case 4:
                aaqf aaqfVar = (aaqf) this.d.get();
                afvn afvnVar = (afvn) this.a.get();
                return new abeb(aaqfVar, (ampq) ((axov) this.c).a, this.g, (aadd) this.f.get(), (abec) this.b.get(), ((abee) this.e).get(), (zdz) this.h.get());
            case 5:
                acrf acrfVar = (acrf) this.c.get();
                aazp aazpVar = (aazp) this.a.get();
                Object obj = this.h.get();
                afvn afvnVar2 = (afvn) this.d.get();
                afso afsoVar = (afso) this.e.get();
                ykw ykwVar = (ykw) this.g.get();
                afug afugVar = (afug) this.f.get();
                afzk afzkVar = (afzk) this.b.get();
                return b(acrfVar, aazpVar, obj, afvnVar2, afsoVar, ykwVar, afugVar);
            case 6:
                return c((Context) ((axov) this.g).a, (aizp) this.b.get(), (aizn) this.e.get(), (airw) this.f.get(), ((ahef) this.d).get(), (ainq) this.a.get(), (snc) this.h.get(), opf.a(), (List) this.c.get());
            default:
                zey zeyVar = ((zez) this.c).get();
                aith aithVar = (aith) this.f.get();
                aynx aynxVar = (aynx) this.a.get();
                aynx aynxVar2 = (aynx) this.b.get();
                ailu ailuVar = (ailu) this.h.get();
                aiqp aiqpVar = (aiqp) this.d.get();
                axot.a(this.g);
                Executor executor = (Executor) this.e.get();
                return new aiis(zeyVar, aithVar, aynxVar, aynxVar2, ailuVar, aiqpVar);
        }
    }
}
