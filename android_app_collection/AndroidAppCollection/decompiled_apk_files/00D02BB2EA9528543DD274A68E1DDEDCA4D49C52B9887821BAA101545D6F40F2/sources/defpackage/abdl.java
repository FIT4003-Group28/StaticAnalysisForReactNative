package defpackage;
/* compiled from: PG */
/* renamed from: abdl  reason: default package */
/* loaded from: classes2.dex */
public class abdl implements abdt {
    private final jic a;
    private final String b;
    private final String c;
    private final dxio<afha> d;

    public abdl(@dzsi String str, String str2, String str3, dxio<afha> dxioVar) {
        this.a = new jic(str, ckqc.FULLY_QUALIFIED, 0);
        this.b = str2;
        this.c = str3;
        this.d = dxioVar;
    }

    @Override // defpackage.abdt
    public jic a() {
        return this.a;
    }

    @Override // defpackage.abdt
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.abdt
    public cqkl c() {
        this.d.a().m(this.c, 1);
        return cqkl.a;
    }
}
