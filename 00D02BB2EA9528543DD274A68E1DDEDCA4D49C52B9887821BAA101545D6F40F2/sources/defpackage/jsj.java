package defpackage;
/* compiled from: PG */
/* renamed from: jsj  reason: default package */
/* loaded from: classes7.dex */
public class jsj implements jri {
    private final jrh a;
    private final int b;
    private final String c;
    private boolean d = false;

    public jsj(jrh jrhVar, String str, int i) {
        this.a = jrhVar;
        this.c = str;
        this.b = i;
    }

    @Override // defpackage.jri
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jri
    public String b() {
        return this.c;
    }

    @Override // defpackage.jri
    public cqkl c() {
        jrh jrhVar = this.a;
        int i = this.b;
        jrs jrsVar = (jrs) jrhVar;
        jrt jrtVar = jrsVar.a;
        jrtVar.c.get(jrtVar.f).b(false);
        jrt jrtVar2 = jrsVar.a;
        jrtVar2.f = i;
        jrj jrjVar = jrtVar2.d;
        if (jrjVar != null) {
            jrjVar.c(i);
        }
        jrsVar.a.c.get(i).b(jrsVar.a.j());
        cqkx.p(jrsVar.a);
        return cqkl.a;
    }

    @Override // defpackage.jri
    public void d(boolean z) {
        this.d = z;
    }
}
