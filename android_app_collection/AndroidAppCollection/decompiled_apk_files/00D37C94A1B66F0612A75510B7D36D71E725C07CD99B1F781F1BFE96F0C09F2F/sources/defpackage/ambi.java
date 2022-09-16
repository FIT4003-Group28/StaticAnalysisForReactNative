package defpackage;
/* compiled from: PG */
/* renamed from: ambi  reason: default package */
/* loaded from: classes.dex */
public final class ambi {
    private Boolean a;
    private amuf b;
    private amuk c;

    public final ambj a() {
        amuf amufVar = this.b;
        if (amufVar != null) {
            this.c = amufVar.g();
        } else if (this.c == null) {
            this.c = amuk.q();
        }
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: canSwitchAccounts");
        }
        return new ambj(bool.booleanValue(), this.c);
    }

    public final void b(Class cls) {
        if (this.b == null) {
            this.b = amuk.f();
        }
        this.b.h(cls);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
