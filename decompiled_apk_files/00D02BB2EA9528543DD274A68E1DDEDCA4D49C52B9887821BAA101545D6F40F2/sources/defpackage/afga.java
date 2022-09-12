package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afga  reason: default package */
/* loaded from: classes.dex */
public final class afga {
    public final Intent a;
    private final afih b;
    @dzsi
    private String c;
    @dzsi
    private Uri d;
    @dzsi
    private afia e;

    public afga(Intent intent, afih afihVar) {
        this.a = intent;
        this.b = afihVar;
    }

    public final String a() {
        if (this.c == null) {
            Intent intent = this.a;
            this.c = intent == null ? "" : afhg.c(intent);
        }
        return this.c;
    }

    public final Uri b() {
        if (this.d == null) {
            Intent intent = this.a;
            this.d = intent == null ? Uri.EMPTY : afhg.b(intent);
        }
        return this.d;
    }

    public final afib c() {
        if (this.e == null) {
            afia b = this.b.b(this.a, null);
            if (b == null) {
                b = afia.R;
            }
            this.e = b;
        }
        return this.e.a;
    }
}
