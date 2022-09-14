package defpackage;
/* compiled from: PG */
/* renamed from: aocu  reason: default package */
/* loaded from: classes2.dex */
public class aocu implements aoct {
    private final anhg a;
    private final aoge b;
    private final String c;
    private final String d;

    public aocu(anhg anhgVar, aoge aogeVar) {
        dvba dvbaVar = aogeVar.a().g;
        dvbaVar = dvbaVar == null ? dvba.e : dvbaVar;
        int i = dvbaVar.a;
        boolean z = true;
        if ((i & 1) == 0 && (i & 2) == 0) {
            z = false;
        }
        dbsk.a(z);
        this.a = anhgVar;
        this.b = aogeVar;
        int i2 = dvbaVar.a;
        String str = "";
        this.c = (i2 & 1) != 0 ? dvbaVar.b : str;
        this.d = (i2 & 2) != 0 ? dvbaVar.c : str;
    }

    @Override // defpackage.aoct
    public String a() {
        return this.c;
    }

    @Override // defpackage.aoct
    public String b() {
        return this.d;
    }

    @Override // defpackage.aoct
    public cqkl c() {
        this.a.i(this.b);
        return cqkl.a;
    }

    @Override // defpackage.aoct
    public cjtd d() {
        return cjtd.a(dtyi.bi);
    }
}
