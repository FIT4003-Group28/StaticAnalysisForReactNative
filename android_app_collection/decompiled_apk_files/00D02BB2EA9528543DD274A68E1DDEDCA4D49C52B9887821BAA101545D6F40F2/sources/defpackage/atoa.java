package defpackage;
/* compiled from: PG */
/* renamed from: atoa  reason: default package */
/* loaded from: classes2.dex */
public class atoa {
    @dzsi
    public final amuo a;
    @dzsi
    public final atln b;

    public atoa() {
        this.a = null;
        this.b = null;
    }

    public atoa(amuo amuoVar, atln atlnVar) {
        this.a = amuoVar;
        this.b = atlnVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atoa)) {
            return false;
        }
        return this.a.equals(((atoa) obj).a);
    }
}
