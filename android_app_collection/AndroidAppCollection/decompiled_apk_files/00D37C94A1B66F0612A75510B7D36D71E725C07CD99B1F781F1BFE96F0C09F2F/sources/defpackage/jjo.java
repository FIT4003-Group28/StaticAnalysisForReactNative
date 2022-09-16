package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: jjo  reason: default package */
/* loaded from: classes3.dex */
public final class jjo {
    private final jjc a;
    private final jsc b;
    private final ohp c;

    public jjo(ohp ohpVar, jjc jjcVar, jsc jscVar) {
        this.c = ohpVar;
        this.a = jjcVar;
        this.b = jscVar;
    }

    public final Intent a(String str) {
        return this.c.a().addFlags(67108864).putExtra("pane", this.a.a(str, false, ""));
    }

    public final Intent b() {
        return this.c.a().addFlags(67108864).putExtra("pane", this.b.a());
    }
}
