package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: akt  reason: default package */
/* loaded from: classes.dex */
public final class akt {
    private final ale a;
    private final Handler b;

    public akt(ale aleVar, Handler handler) {
        this.a = aleVar;
        this.b = handler;
    }

    public final void a(ala alaVar) {
        if (alaVar.b != 0) {
            this.b.post(new aks(this.a));
            return;
        }
        Typeface typeface = alaVar.a;
        this.b.post(new akr(this.a, typeface));
    }
}
