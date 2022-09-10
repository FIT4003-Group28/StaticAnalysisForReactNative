package defpackage;
/* compiled from: PG */
/* renamed from: cvjw  reason: default package */
/* loaded from: classes5.dex */
public final class cvjw {
    public dsok a;
    private String b;
    private Integer c;
    private String d;
    private String e;
    private dsef f;
    private String g;
    private drxx h;
    private dspt i;
    private int j;

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null actionId");
    }

    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void d(drxx drxxVar) {
        if (drxxVar != null) {
            this.h = drxxVar;
            return;
        }
        throw new NullPointerException("Null preferenceKey");
    }

    public final void e(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null replyHintText");
    }

    public final void f(dspt dsptVar) {
        if (dsptVar != null) {
            this.i = dsptVar;
            return;
        }
        throw new NullPointerException("Null snoozeDuration");
    }

    public final void g(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public final void h(dsef dsefVar) {
        if (dsefVar != null) {
            this.f = dsefVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final void i(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    public final void j(int i) {
        this.j = i;
    }

    public final cvkg a() {
        String str = this.b == null ? " actionId" : "";
        if (this.j == 0) {
            str = str.concat(" builtInActionType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" iconResourceId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" text");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" url");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" threadStateUpdate");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" replyHintText");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" preferenceKey");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" snoozeDuration");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvjx(this.b, this.j, this.c.intValue(), this.d, this.e, this.f, this.a, this.g, this.h, this.i);
    }
}
