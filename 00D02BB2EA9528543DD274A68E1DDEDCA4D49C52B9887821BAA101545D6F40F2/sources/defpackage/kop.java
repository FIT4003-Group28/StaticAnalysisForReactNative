package defpackage;
/* compiled from: PG */
/* renamed from: kop  reason: default package */
/* loaded from: classes7.dex */
public final class kop implements koi {
    private final String a;
    private final Runnable b;
    private final boolean c;
    private final cjtd d;
    private final kof e;

    public kop(String str, boolean z, Runnable runnable, cjtd cjtdVar, kof kofVar) {
        dbsk.s(str);
        this.a = str;
        this.c = z;
        this.b = runnable;
        dbsk.s(cjtdVar);
        this.d = cjtdVar;
        this.e = kofVar;
    }

    @Override // defpackage.koi
    public String a() {
        return this.a;
    }

    @Override // defpackage.koi
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.koi
    public cqkl c() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.koi
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.koi
    public kof e() {
        return this.e;
    }
}
