package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbnk  reason: default package */
/* loaded from: classes3.dex */
public class bbnk implements bbne {
    private final jic a;
    private final cjtd b;
    private final Runnable c;
    private final CharSequence d;

    public bbnk(jic jicVar, cjtd cjtdVar, Runnable runnable, CharSequence charSequence) {
        this.a = jicVar;
        this.b = cjtdVar;
        this.c = runnable;
        this.d = charSequence;
    }

    @Override // defpackage.bbne
    public jic a() {
        return this.a;
    }

    @Override // defpackage.bbne
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.bbne
    public cqkl c() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.d;
    }
}
