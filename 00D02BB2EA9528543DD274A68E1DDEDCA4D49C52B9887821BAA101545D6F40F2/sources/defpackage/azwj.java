package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azwj  reason: default package */
/* loaded from: classes3.dex */
public final class azwj {
    public final azwi a;
    @dzsi
    public final String b;
    @dzsi
    public final Long c;
    public boolean d = true;
    private final azxm<?> e;

    public azwj(azxm<?> azxmVar, azwi azwiVar, @dzsi String str, @dzsi Long l) {
        this.e = azxmVar;
        this.a = azwiVar;
        this.b = str;
        this.c = l;
    }

    public static azwj a(azxm<?> azxmVar, String str) {
        return new azwj(azxmVar, azwi.SERVER_ID, str, null);
    }

    public static azwj b(azxm<?> azxmVar, String str) {
        return new azwj(azxmVar, azwi.STRING_INDEX, str, null);
    }

    public static azwj c(azxm<?> azxmVar, long j) {
        return new azwj(azxmVar, azwi.UPDATE_ID, null, Long.valueOf(j));
    }

    public final azxl d() {
        return this.e.b();
    }

    public final void e() {
        this.d = false;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof azwj) {
            azwj azwjVar = (azwj) obj;
            if (this.e.b().equals(azwjVar.e.b()) && this.a.equals(azwjVar.a) && this.d == azwjVar.d && dbsd.a(this.b, azwjVar.b) && dbsd.a(this.c, azwjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e.b(), this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }
}
