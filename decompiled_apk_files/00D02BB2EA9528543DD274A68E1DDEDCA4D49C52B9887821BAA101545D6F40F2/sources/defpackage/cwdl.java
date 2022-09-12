package defpackage;
/* compiled from: PG */
/* renamed from: cwdl  reason: default package */
/* loaded from: classes.dex */
public abstract class cwdl {
    public static cwdk g() {
        cwdg cwdgVar = new cwdg();
        cwdi cwdiVar = new cwdi();
        cwdiVar.a = false;
        cwdiVar.b = true;
        String str = cwdiVar.a == null ? " hideRecentAccounts" : "";
        if (cwdiVar.b == null) {
            str = str.concat(" enableSuperG");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cwdgVar.a = new cwdj(cwdiVar.a.booleanValue(), cwdiVar.b.booleanValue());
        cwdgVar.b = false;
        cwdgVar.c = true;
        cwdgVar.d = false;
        cwdgVar.e = true;
        return cwdgVar;
    }

    public abstract cwdr a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract dcdc<cwdc> f();
}
