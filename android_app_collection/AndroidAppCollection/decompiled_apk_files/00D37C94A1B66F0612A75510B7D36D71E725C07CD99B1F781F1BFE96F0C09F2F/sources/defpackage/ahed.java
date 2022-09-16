package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahed  reason: default package */
/* loaded from: classes.dex */
public final class ahed implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public ahed(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, byte[][] bArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, char[][] cArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, int[][] iArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, short[][] sArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public ahed(azqb azqbVar, azqb azqbVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static ahed A(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 12, (char[][]) null);
    }

    public static ahed B(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 13);
    }

    public static ahed C(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 14, (short[][]) null);
    }

    public static ahed D(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 15);
    }

    public static ahed E(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 16);
    }

    public static ahed F(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 17, (int[][]) null);
    }

    public static ahed G(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 18);
    }

    public static ahed H(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 19);
    }

    public static ahed I(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 20, (boolean[][]) null);
    }

    public static ahed a(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ajfb] */
    public static ajfb b(ajba ajbaVar, aacz aaczVar) {
        ajba ajbaVar2 = ajbaVar;
        if (aiix.F(aaczVar)) {
            ajbaVar2 = new ajfb();
        }
        axzl.o(ajbaVar2);
        return ajbaVar2;
    }

    public static List c(afio afioVar, afiy afiyVar) {
        amuk s = amuk.s(afioVar, afiyVar);
        axzl.o(s);
        return s;
    }

    public static acvg d(acvh acvhVar, aiix aiixVar) {
        acvg acviVar;
        if (aiixVar.v()) {
            acviVar = acvhVar.c(asny.LATENCY_ACTION_WATCH);
            aopa createBuilder = asno.a.createBuilder();
            aopa createBuilder2 = asnq.a.createBuilder();
            createBuilder2.copyOnWrite();
            asnq asnqVar = (asnq) createBuilder2.instance;
            asnqVar.d = 3;
            asnqVar.b |= 8;
            asnq asnqVar2 = (asnq) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnqVar2.getClass();
            asnoVar.v = asnqVar2;
            asnoVar.c |= 262144;
            createBuilder.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder.instance;
            asnoVar2.b |= 8;
            asnoVar2.g = "warm";
            acviVar.a((asno) createBuilder.mo39build());
        } else {
            acviVar = new acvi();
        }
        axzl.o(acviVar);
        return acviVar;
    }

    public static acvg e(acvh acvhVar, aiix aiixVar) {
        acvg acviVar;
        if (aiixVar.v()) {
            acviVar = acvhVar.c(asny.LATENCY_ACTION_WATCH);
            aopa createBuilder = asno.a.createBuilder();
            aopa createBuilder2 = asnq.a.createBuilder();
            createBuilder2.copyOnWrite();
            asnq asnqVar = (asnq) createBuilder2.instance;
            asnqVar.d = 2;
            asnqVar.b |= 8;
            asnq asnqVar2 = (asnq) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnqVar2.getClass();
            asnoVar.v = asnqVar2;
            asnoVar.c |= 262144;
            createBuilder.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder.instance;
            asnoVar2.b |= 8;
            asnoVar2.g = "warm";
            acviVar.a((asno) createBuilder.mo39build());
        } else {
            acviVar = new acvi();
        }
        axzl.o(acviVar);
        return acviVar;
    }

    public static iz f(final ajad ajadVar, Executor executor) {
        iz izVar;
        if (ylr.e()) {
            izVar = ajadVar.a();
        } else {
            try {
                ajadVar.getClass();
                izVar = (iz) anlz.u(new Callable() { // from class: ahee
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ajad.this.a();
                    }
                }, executor).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        axzl.o(izVar);
        return izVar;
    }

    public static ankt g(Context context, Executor executor) {
        return anlz.u(new slg(context, 5), executor);
    }

    public static ahxv h(Context context) {
        return new ahxv(context);
    }

    public static ainz i(aizp aizpVar, aizn aiznVar) {
        return new ainz(aizpVar, aiznVar);
    }

    public static aiob j(aizp aizpVar, aizn aiznVar) {
        return new aiob(aizpVar, aiznVar);
    }

    public static airc k(airr airrVar, aisi aisiVar) {
        return new airc(airrVar, aisiVar);
    }

    public static aheq l(adzt adztVar, aijf aijfVar) {
        return new aheq(adztVar, aijfVar);
    }

    public static aijf m(aijh aijhVar, aijg aijgVar) {
        return new aijf(aijhVar, aijgVar);
    }

    public static Set n(ailw ailwVar, aimx aimxVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(ailwVar);
        if (aimxVar != null) {
            hashSet.add(aimxVar);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        axzl.o(unmodifiableSet);
        return unmodifiableSet;
    }

    public static ahed o(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 1);
    }

    public static ahed p(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 2, (byte[]) null);
    }

    public static ahed q(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 3, (char[]) null);
    }

    public static ahed r(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 4, (short[]) null);
    }

    public static ahed s(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 5, (int[]) null);
    }

    public static ahed t(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 6);
    }

    public static ahed u(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 7);
    }

    public static ahed v(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 8);
    }

    public static ahed w(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 9, (boolean[]) null);
    }

    public static aiob x(aizp aizpVar, aizn aiznVar) {
        return new aiob(aizpVar, aiznVar, 1);
    }

    public static ahed y(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 10, (float[]) null);
    }

    public static ahed z(azqb azqbVar, azqb azqbVar2) {
        return new ahed(azqbVar, azqbVar2, 11, (byte[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return b((ajba) this.a.get(), (aacz) this.b.get());
            case 1:
                return c((afio) this.b.get(), (afiy) this.a.get());
            case 2:
                return ahfa.a((zah) this.a.get(), (ahfm) ((axov) this.b).a);
            case 3:
                return d((acvh) this.a.get(), (aiix) this.b.get());
            case 4:
                return e((acvh) this.a.get(), (aiix) this.b.get());
            case 5:
                return f((ajad) this.a.get(), (Executor) this.b.get());
            case 6:
                return g((Context) ((axov) this.b).a, (Executor) this.a.get());
            case 7:
                aiwv aiwvVar = (aiwv) this.a.get();
                return h((Context) ((axov) this.b).a);
            case 8:
                return new aikm((aynx) this.b.get(), (aynx) this.a.get());
            case 9:
                return new ailw((aiji) this.a.get(), (aikh) this.b.get());
            case 10:
                return x((aizp) this.a.get(), (aizn) this.b.get());
            case 11:
                return i((aizp) this.a.get(), (aizn) this.b.get());
            case 12:
                return j((aizp) this.a.get(), (aizn) this.b.get());
            case 13:
                return new aios((Context) ((axov) this.b).a, (aijf) this.a.get());
            case 14:
                return new aipr(((aips) this.a).get(), ((aipx) this.b).get());
            case 15:
                return k((airr) this.b.get(), (aisi) this.a.get());
            case 16:
                return l((adzt) this.b.get(), (aijf) this.a.get());
            case 17:
                return m((aijh) this.a.get(), (aijg) this.b.get());
            case 18:
                Context context = (Context) ((axov) this.b).a;
                azpb azpbVar = (azpb) this.a.get();
                axzl.o(azpbVar);
                return azpbVar;
            case 19:
                Context context2 = (Context) ((axov) this.b).a;
                azpb azpbVar2 = (azpb) this.a.get();
                axzl.o(azpbVar2);
                return azpbVar2;
            default:
                return n((ailw) this.a.get(), (aimx) this.b.get());
        }
    }
}
