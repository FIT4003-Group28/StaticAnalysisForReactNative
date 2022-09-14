package defpackage;

import android.content.Context;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azwu  reason: default package */
/* loaded from: classes3.dex */
public abstract class azwu {
    public static azwu j(baad baadVar, Context context) {
        String m = baadVar.m();
        baab o = baadVar.o();
        String E = baadVar.E(context);
        azvi azviVar = new azvi();
        boolean z = true;
        azviVar.c(true);
        azviVar.b(false);
        azviVar.d(false);
        String str = null;
        azviVar.h = null;
        azviVar.i = null;
        azviVar.e(0L);
        if (m != null) {
            azviVar.a = m;
            if (o != null) {
                azviVar.b = o;
                if (E != null) {
                    azviVar.c = E;
                    azviVar.c(baadVar.y());
                    azviVar.b(baadVar.C());
                    azviVar.d(baadVar.z());
                    azviVar.h = baadVar.L() ? baadVar.O() : null;
                    if (baadVar.M()) {
                        str = baadVar.P();
                    }
                    azviVar.i = str;
                    azviVar.e(baadVar.ah());
                    String str2 = azviVar.a;
                    if (str2 == null) {
                        throw new IllegalStateException("Property \"id\" has not been set");
                    }
                    dbsk.b(!str2.isEmpty(), "list id is empty");
                    String str3 = azviVar.c;
                    if (str3 == null) {
                        throw new IllegalStateException("Property \"title\" has not been set");
                    }
                    dbsk.b(!str3.isEmpty(), "list title is empty");
                    if (azviVar.a() == baab.UNKNOWN) {
                        z = false;
                    }
                    dbsk.g(z, "Unsupported list listType: %s", azviVar.a());
                    String str4 = azviVar.a == null ? " id" : "";
                    if (azviVar.b == null) {
                        str4 = str4.concat(" listType");
                    }
                    if (azviVar.c == null) {
                        str4 = String.valueOf(str4).concat(" title");
                    }
                    if (azviVar.d == null) {
                        str4 = String.valueOf(str4).concat(" editable");
                    }
                    if (azviVar.e == null) {
                        str4 = String.valueOf(str4).concat(" collaborative");
                    }
                    if (azviVar.f == null) {
                        str4 = String.valueOf(str4).concat(" followed");
                    }
                    if (azviVar.g == null) {
                        str4 = String.valueOf(str4).concat(" lastModifiedTimestamp");
                    }
                    if (str4.isEmpty()) {
                        return new azvj(azviVar.a, azviVar.b, azviVar.c, azviVar.d.booleanValue(), azviVar.e.booleanValue(), azviVar.f.booleanValue(), azviVar.g.longValue(), azviVar.h, azviVar.i);
                    }
                    String valueOf = String.valueOf(str4);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null listType");
        }
        throw new NullPointerException("Null id");
    }

    public abstract String a();

    public abstract baab b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof azwu) {
            return dbsd.a(a(), ((azwu) obj).a());
        }
        return false;
    }

    public abstract boolean f();

    public abstract long g();

    @dzsi
    public abstract String h();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @dzsi
    public abstract String i();
}
