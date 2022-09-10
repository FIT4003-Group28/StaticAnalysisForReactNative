package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bego  reason: default package */
/* loaded from: classes3.dex */
public class bego {
    public final dbty<dvne> a;
    private final abfa b;
    private final dbty<dkiy> c;
    private final HashMap<akqi, Boolean> d = new HashMap<>();

    public bego(final btvo btvoVar, abfa abfaVar) {
        this.b = abfaVar;
        btvoVar.getClass();
        this.c = dbud.a(new dbty(btvoVar) { // from class: begm
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getEnableFeatureParameters();
            }
        });
        btvoVar.getClass();
        this.a = dbud.a(new dbty(btvoVar) { // from class: begn
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getPlaceSheetParametersWithoutLogging();
            }
        });
    }

    private final synchronized boolean i(ilo iloVar) {
        akqi ai = iloVar.ai();
        Boolean bool = this.d.get(ai);
        if (bool != null) {
            return bool.booleanValue();
        }
        dkiy a = this.c.a();
        boolean z = false;
        if (a.i == 301 && ((Boolean) a.j).booleanValue() && this.a.a().k() && iloVar.o) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.d.put(ai, valueOf);
        return valueOf.booleanValue();
    }

    public final boolean a(@dzsi ilo iloVar) {
        if (iloVar == null || !i(iloVar)) {
            return this.a.a().j();
        }
        return true;
    }

    public final boolean b() {
        return this.a.a().x();
    }

    public final boolean c(@dzsi ilo iloVar) {
        if (!a(iloVar)) {
            return false;
        }
        if (iloVar.o && this.b.b()) {
            return true;
        }
        int ap = this.a.a().ap();
        int i = ap - 1;
        if (ap == 0) {
            throw null;
        }
        return i == 2 || i == 3 || i == 4;
    }

    public final boolean d() {
        return this.a.a().O();
    }

    public final boolean e() {
        return this.a.a().P().a;
    }

    public final dvmw f() {
        return this.a.a().P();
    }

    public final boolean g() {
        return this.a.a().ae();
    }

    public final boolean h() {
        int aq = this.a.a().aq();
        return (aq == 1 || aq == 2) ? false : true;
    }
}
