package defpackage;
/* compiled from: PG */
/* renamed from: bony  reason: default package */
/* loaded from: classes3.dex */
public class bony implements boqe {
    private final String a;
    private final String b;
    private final Runnable c;
    private final String d;
    private final cjtd e;

    public bony(String str, String str2, String str3, Runnable runnable, cjtd cjtdVar) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.c = runnable;
        this.e = cjtdVar;
    }

    @Override // defpackage.boqe
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.boqe
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.boqe
    @dzsi
    public jic c() {
        if (this.d.isEmpty()) {
            return null;
        }
        return new jic(this.d, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
    }

    @Override // defpackage.boqe
    public cqkl d(cjqm cjqmVar) {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.boqe
    public cjtd e() {
        return this.e;
    }
}
