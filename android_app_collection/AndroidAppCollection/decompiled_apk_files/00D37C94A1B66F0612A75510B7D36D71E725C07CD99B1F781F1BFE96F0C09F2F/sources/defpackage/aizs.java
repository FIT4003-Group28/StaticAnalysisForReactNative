package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aizs  reason: default package */
/* loaded from: classes.dex */
public final class aizs implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final /* synthetic */ int g;

    public aizs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public aizs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i) {
        this.g = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.b = azqbVar3;
        this.f = azqbVar4;
        this.c = azqbVar5;
        this.e = azqbVar6;
    }

    public aizs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, byte[] bArr) {
        this.g = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public aizs(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, char[] cArr) {
        this.g = i;
        this.f = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.e = azqbVar4;
        this.d = azqbVar5;
        this.c = azqbVar6;
    }

    public static aizs a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aizs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6);
    }

    public static aivo b(aivk aivkVar, aisp aispVar, aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aynx aynxVar4) {
        return new aivo(aivkVar, aispVar, aynxVar, aynxVar2, aynxVar3, aynxVar4);
    }

    public static ajeg c(aisq aisqVar, Executor executor, azqb azqbVar, azqb azqbVar2, acrr acrrVar, aiix aiixVar) {
        return new ajeg(aisqVar, executor, azqbVar, azqbVar2, acrrVar, aiixVar);
    }

    public static aizs d(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aizs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 1);
    }

    public static aizs e(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aizs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 2, (byte[]) null);
    }

    public static aizs f(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aizs(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 3, (char[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new ajai((yni) this.c.get(), ((axpa) this.b).get(), (bame) this.a.get(), (bame) this.d.get(), (bame) this.e.get(), (bame) this.f.get());
                }
                return c((aisq) this.f.get(), (Executor) this.b.get(), this.a, this.e, (acrr) this.d.get(), (aiix) this.c.get());
            }
            aivo b = b(((aivm) this.a).get(), (aisp) this.d.get(), (aynx) this.b.get(), (aynx) this.f.get(), (aynx) this.c.get(), (aynx) this.e.get());
            b.a();
            return b;
        }
        return new aizr((Context) ((axov) this.a).a, this.b, this.c, (aiix) this.d.get(), (Executor) this.e.get(), (Executor) this.f.get());
    }
}
