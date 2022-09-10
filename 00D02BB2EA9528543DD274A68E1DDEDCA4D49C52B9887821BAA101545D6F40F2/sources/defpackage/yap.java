package defpackage;
/* compiled from: PG */
/* renamed from: yap  reason: default package */
/* loaded from: classes7.dex */
class yap implements xzb {
    @dzsi
    private final jhk a;
    @dzsi
    private final CharSequence b;
    @dzsi
    private final Runnable c;
    private final cjtd d;
    @dzsi
    private final String e;

    public yap(@dzsi jhk jhkVar, @dzsi CharSequence charSequence, @dzsi Runnable runnable, cjtd cjtdVar, @dzsi String str) {
        this.a = jhkVar;
        this.b = charSequence;
        this.c = runnable;
        this.d = cjtdVar;
        this.e = str;
    }

    @Override // defpackage.xzb
    @dzsi
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.xzb
    public Boolean b() {
        return true;
    }

    @Override // defpackage.xzb
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.xzb
    public cqkl d() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.xzb
    @dzsi
    public jhk e() {
        return this.a;
    }

    @Override // defpackage.xzb
    @dzsi
    public String f() {
        return this.e;
    }
}
