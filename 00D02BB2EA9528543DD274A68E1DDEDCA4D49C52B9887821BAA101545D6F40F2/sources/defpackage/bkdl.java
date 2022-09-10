package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bkdl  reason: default package */
/* loaded from: classes3.dex */
public class bkdl implements bkdd {
    private final int a;
    private final Runnable b;

    public bkdl(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.bkdd
    public cjtd a() {
        return cjtd.a(dtxy.ot);
    }

    @Override // defpackage.bkdd
    public String b() {
        return String.format(Locale.US, "+%d", Integer.valueOf(this.a));
    }

    @Override // defpackage.bkdd
    public cqkl c() {
        this.b.run();
        return cqkl.a;
    }
}
