package defpackage;
/* compiled from: PG */
/* renamed from: ucm  reason: default package */
/* loaded from: classes4.dex */
final class ucm {
    public String a;
    public Integer b;
    public String c;
    public String d;
    public aomr e;
    public aono f;
    public String g;
    public aoki h;
    public aooo i;
    public int j;

    public final void a(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null actionId");
    }

    public final void b() {
        this.b = 0;
    }

    public final void c(aoki aokiVar) {
        if (aokiVar != null) {
            this.h = aokiVar;
            return;
        }
        throw new NullPointerException("Null preferenceKey");
    }

    public final void d(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null replyHintText");
    }

    public final void e(aooo aoooVar) {
        if (aoooVar != null) {
            this.i = aoooVar;
            return;
        }
        throw new NullPointerException("Null snoozeDuration");
    }

    public final void f(aomr aomrVar) {
        if (aomrVar != null) {
            this.e = aomrVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final void g(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null url");
    }
}
