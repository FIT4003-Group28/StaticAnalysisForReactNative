package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: zdj  reason: default package */
/* loaded from: classes4.dex */
public final class zdj {
    public volatile boolean a;
    private final yor b;

    public zdj(Context context) {
        this.a = uul.c(context);
        yor yorVar = new yor();
        this.b = yorVar;
        yorVar.c(new yoj() { // from class: zdh
            @Override // defpackage.yoj
            public final void g() {
                zdj.this.a = false;
            }
        });
        yorVar.c(new yok() { // from class: zdi
            @Override // defpackage.yok
            public final void a() {
                zdj.this.a = true;
            }
        });
        yorVar.a((Application) context.getApplicationContext());
    }

    public final void a(yom yomVar) {
        this.b.c(yomVar);
    }

    public final void b(yom yomVar) {
        this.b.d(yomVar);
    }
}
