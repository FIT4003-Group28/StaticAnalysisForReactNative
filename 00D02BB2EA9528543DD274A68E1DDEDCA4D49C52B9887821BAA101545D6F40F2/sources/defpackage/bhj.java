package defpackage;
/* compiled from: PG */
/* renamed from: bhj  reason: default package */
/* loaded from: classes3.dex */
public final class bhj implements Runnable {
    private final bdn a;
    private final String b;
    private final bcr c;

    public bhj(bdn bdnVar, String str, bcr bcrVar) {
        this.a = bdnVar;
        this.b = str;
        this.c = bcrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e.b(this.b, this.c);
    }
}
