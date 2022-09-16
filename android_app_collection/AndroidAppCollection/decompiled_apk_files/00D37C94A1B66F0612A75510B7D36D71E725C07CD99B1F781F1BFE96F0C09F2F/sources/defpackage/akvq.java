package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: akvq  reason: default package */
/* loaded from: classes.dex */
public final class akvq {
    private final Context a;
    private final zdj b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public akvq(Context context, zdj zdjVar) {
        this.a = context;
        this.b = zdjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e = this.f;
        try {
            this.f = uul.c(this.a);
        } catch (Throwable th) {
            String.valueOf(String.valueOf(th)).length();
            int i = akvp.a;
        }
        this.c = this.d;
        this.d = this.b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c || this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.e || this.f;
    }
}
