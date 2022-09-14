package defpackage;
/* compiled from: PG */
/* renamed from: alwj  reason: default package */
/* loaded from: classes2.dex */
public abstract class alwj {
    public static alwj c(dmpm dmpmVar, int i) {
        return new alvo(dmpmVar, i);
    }

    public abstract dmpm a();

    public abstract int b();

    public final String toString() {
        dbsb d = dbsc.d("");
        d.b("tiePoint", a().name());
        int b = b();
        String str = b != 1 ? b != 2 ? b != 3 ? "null" : "RIGHT_JUSTIFY" : "LEFT_JUSTIFY" : "CENTER_JUSTIFY";
        if (b == 0) {
            throw null;
        }
        d.b("justification", str);
        return d.toString();
    }
}
