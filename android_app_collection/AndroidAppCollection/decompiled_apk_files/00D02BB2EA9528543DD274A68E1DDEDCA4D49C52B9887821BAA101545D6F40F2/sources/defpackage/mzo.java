package defpackage;
/* compiled from: PG */
/* renamed from: mzo  reason: default package */
/* loaded from: classes7.dex */
public class mzo implements mze {
    private final String a;
    private final String b;
    private final String c;
    private final cqss d;
    private final cqss e;

    public mzo(mzn mznVar) {
        this(mznVar.a(), mznVar.b(), mznVar.c(), mznVar.d());
    }

    @Override // defpackage.mze
    public String a() {
        return this.a;
    }

    @Override // defpackage.mze
    public String b() {
        return this.b;
    }

    @Override // defpackage.mze
    public String c() {
        return this.c;
    }

    @Override // defpackage.mze
    public cqss d() {
        return this.d;
    }

    @Override // defpackage.mze
    public cqss e() {
        return this.e;
    }

    public mzo(String str, String str2, String str3, @dzsi dpej dpejVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = nql.b(dpejVar);
        iuv iuvVar = nql.bq;
        if (dpejVar != null) {
            int ordinal = dpejVar.ordinal();
            if (ordinal == 1) {
                iuvVar = nql.bv;
            } else if (ordinal == 2) {
                iuvVar = nql.bx;
            } else if (ordinal == 3) {
                iuvVar = nql.bt;
            }
        }
        this.e = iuvVar;
    }
}
