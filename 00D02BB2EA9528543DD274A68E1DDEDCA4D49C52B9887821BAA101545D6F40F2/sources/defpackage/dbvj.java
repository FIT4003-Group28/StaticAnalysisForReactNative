package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbvj  reason: default package */
/* loaded from: classes.dex */
public class dbvj extends Enum<dbvj> {
    public static final dbvj a;
    public static final dbvj b;
    public static final dbvj c;
    public static final dbvj d;
    public static final dbvj e;
    public static final dbvj f;
    public static final dbvj g;
    public static final dbvj h;
    static final dbvj[] i;
    private static final /* synthetic */ dbvj[] j;

    static {
        dbvj dbvjVar = new dbvj("STRONG", 0);
        a = dbvjVar;
        dbvj dbvjVar2 = new dbvj() { // from class: dbvd
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                d(dbwvVar, a2);
                return a2;
            }
        };
        b = dbvjVar2;
        dbvj dbvjVar3 = new dbvj() { // from class: dbve
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                e(dbwvVar, a2);
                return a2;
            }
        };
        c = dbvjVar3;
        dbvj dbvjVar4 = new dbvj() { // from class: dbvf
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                d(dbwvVar, a2);
                e(dbwvVar, a2);
                return a2;
            }
        };
        d = dbvjVar4;
        dbvj dbvjVar5 = new dbvj("WEAK", 4);
        e = dbvjVar5;
        dbvj dbvjVar6 = new dbvj() { // from class: dbvg
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                d(dbwvVar, a2);
                return a2;
            }
        };
        f = dbvjVar6;
        dbvj dbvjVar7 = new dbvj() { // from class: dbvh
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                e(dbwvVar, a2);
                return a2;
            }
        };
        g = dbvjVar7;
        dbvj dbvjVar8 = new dbvj() { // from class: dbvi
            @Override // defpackage.dbvj
            public final <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
                dbwv<K, V> a2 = super.a(dbvxVar, dbwvVar, dbwvVar2);
                d(dbwvVar, a2);
                e(dbwvVar, a2);
                return a2;
            }
        };
        h = dbvjVar8;
        j = new dbvj[]{dbvjVar, dbvjVar2, dbvjVar3, dbvjVar4, dbvjVar5, dbvjVar6, dbvjVar7, dbvjVar8};
        i = new dbvj[]{dbvjVar, dbvjVar2, dbvjVar3, dbvjVar4, dbvjVar5, dbvjVar6, dbvjVar7, dbvjVar8};
    }

    public dbvj(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static dbvj b(dbvz dbvzVar, boolean z, boolean z2) {
        int i2 = 0;
        int i3 = (dbvzVar == dbvz.WEAK ? 4 : 0) | (z ? 1 : 0);
        if (true == z2) {
            i2 = 2;
        }
        return i[i3 | i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <K, V> void d(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        dbwvVar2.g(dbwvVar.f());
        dbwu.m(dbwvVar.j(), dbwvVar2);
        dbwu.m(dbwvVar2, dbwvVar.h());
        dbwu.n(dbwvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <K, V> void e(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        dbwvVar2.m(dbwvVar.l());
        dbwu.o(dbwvVar.p(), dbwvVar2);
        dbwu.o(dbwvVar2, dbwvVar.n());
        dbwu.p(dbwvVar);
    }

    public static dbvj[] values() {
        return (dbvj[]) j.clone();
    }

    public <K, V> dbwv<K, V> a(dbvx<K, V> dbvxVar, dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        return c(dbvxVar, dbwvVar.e(), dbwvVar.d(), dbwvVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <K, V> dbwv<K, V> c(dbvx<K, V> dbvxVar, K k, int i2, dbwv<K, V> dbwvVar) {
        switch (ordinal()) {
            case 0:
                return new dbwc(k, i2, dbwvVar);
            case 1:
                return new dbwa(k, i2, dbwvVar);
            case 2:
                return new dbwe(k, i2, dbwvVar);
            case 3:
                return new dbwb(k, i2, dbwvVar);
            case 4:
                return new dbwk(dbvxVar.h, k, i2, dbwvVar);
            case 5:
                return new dbwi(dbvxVar.h, k, i2, dbwvVar);
            case 6:
                return new dbwm(dbvxVar.h, k, i2, dbwvVar);
            case 7:
                return new dbwj(dbvxVar.h, k, i2, dbwvVar);
            default:
                throw null;
        }
    }
}
