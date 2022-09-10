package defpackage;
/* compiled from: PG */
/* renamed from: bbpl  reason: default package */
/* loaded from: classes3.dex */
public class bbpl implements bblz {
    private final String a;
    private final cqtd b;
    private final cjtd c;
    private final Runnable d;
    private boolean e = false;

    public bbpl(String str, cqtd cqtdVar, cjtd cjtdVar, Runnable runnable, boolean z) {
        this.a = str;
        this.b = cqtdVar;
        this.c = cjtdVar;
        this.d = runnable;
    }

    @Override // defpackage.bblz
    public String a() {
        return this.a;
    }

    @Override // defpackage.bblz
    public cqtd b() {
        return this.b;
    }

    @Override // defpackage.bblz
    public cqkl c() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bblz
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.bblz
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bblz
    public void f() {
        this.e = !this.e;
    }
}
