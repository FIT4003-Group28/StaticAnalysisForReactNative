package defpackage;
/* compiled from: PG */
/* renamed from: aiij  reason: default package */
/* loaded from: classes.dex */
public class aiij {
    public static final aiij a = new aiij(null);
    private final afmu b;

    public aiij(afmu afmuVar) {
        this.b = afmuVar;
    }

    public afmu a() {
        return this.b;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 8 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(", view: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
