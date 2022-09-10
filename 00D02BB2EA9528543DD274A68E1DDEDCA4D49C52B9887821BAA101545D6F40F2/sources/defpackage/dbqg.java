package defpackage;
/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* compiled from: PG */
/* renamed from: dbqg  reason: default package */
/* loaded from: classes.dex */
public enum dbqg {
    a { // from class: dbqd
        @Override // defpackage.dbqg
        public final String a(dbqg dbqgVar, String str) {
            if (dbqgVar == b) {
                return str.replace('-', '_');
            }
            if (dbqgVar == e) {
                return dbqa.b(str.replace('-', '_'));
            }
            return super.a(dbqgVar, str);
        }
    },
    b { // from class: dbqe
        @Override // defpackage.dbqg
        public final String a(dbqg dbqgVar, String str) {
            if (dbqgVar == a) {
                return str.replace('_', '-');
            }
            if (dbqgVar == e) {
                return dbqa.b(str);
            }
            return super.a(dbqgVar, str);
        }
    },
    LOWER_CAMEL(dbrb.p('A', 'Z'), ""),
    UPPER_CAMEL(dbrb.p('A', 'Z'), ""),
    e { // from class: dbqf
        @Override // defpackage.dbqg
        public final String a(dbqg dbqgVar, String str) {
            if (dbqgVar == a) {
                return dbqa.a(str.replace('_', '-'));
            }
            if (dbqgVar == b) {
                return dbqa.a(str);
            }
            return super.a(dbqgVar, str);
        }
    };
    
    private final dbrb f;
    private final String g;

    static {
        dbrb.n('-');
        dbrb.n('_');
        dbrb.n('_');
    }

    dbqg(dbrb dbrbVar, String str) {
        this.f = dbrbVar;
        this.g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static String e(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char charAt = str.charAt(0);
        boolean c = dbqa.c(charAt);
        char c2 = charAt;
        if (c) {
            c2 = charAt ^ ' ';
        }
        String a2 = dbqa.a(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1);
        sb.append(c2);
        sb.append(a2);
        return sb.toString();
    }

    public String a(dbqg dbqgVar, String str) {
        StringBuilder sb = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            i = this.f.d(str, i + 1);
            if (i == -1) {
                break;
            }
            if (i2 == 0) {
                sb = new StringBuilder(str.length() + (dbqgVar.g.length() * 4));
                sb.append(dbqgVar.d(str.substring(0, i)));
            } else {
                sb.append(dbqgVar.c(str.substring(i2, i)));
            }
            sb.append(dbqgVar.g);
            i2 = this.g.length() + i;
        }
        if (i2 == 0) {
            return dbqgVar.d(str);
        }
        sb.append(dbqgVar.c(str.substring(i2)));
        return sb.toString();
    }

    public final String b(dbqg dbqgVar, String str) {
        dbsk.s(dbqgVar);
        dbsk.s(str);
        return dbqgVar == this ? str : a(dbqgVar, str);
    }

    final String c(String str) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dbqa.a(str);
            }
            if (ordinal == 2) {
                return e(str);
            }
            if (ordinal == 3) {
                return e(str);
            }
            if (ordinal != 4) {
                throw null;
            }
            return dbqa.b(str);
        }
        return dbqa.a(str);
    }

    final String d(String str) {
        if (ordinal() == 2) {
            return dbqa.a(str);
        }
        return c(str);
    }
}
