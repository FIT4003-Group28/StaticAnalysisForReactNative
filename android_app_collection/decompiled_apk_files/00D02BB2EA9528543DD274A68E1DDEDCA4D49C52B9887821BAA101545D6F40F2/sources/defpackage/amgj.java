package defpackage;
/* compiled from: PG */
/* renamed from: amgj  reason: default package */
/* loaded from: classes.dex */
public abstract class amgj {
    public static final amgj a = c("", amgk.NO_WRAP);

    public static amgj c(String str, amgk amgkVar) {
        return new amfw(str, amgkVar);
    }

    public abstract String a();

    public abstract amgk b();

    public final boolean d() {
        return a().isEmpty();
    }
}
