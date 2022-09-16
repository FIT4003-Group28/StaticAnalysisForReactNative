package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cz  reason: default package */
/* loaded from: classes3.dex */
public final class cz extends da {
    private final boolean c;
    private boolean d;
    private du e;

    public cz(fx fxVar, akl aklVar, boolean z) {
        super(fxVar, aklVar);
        this.d = false;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final du a(Context context) {
        if (!this.d) {
            fx fxVar = this.a;
            du b = ft.b(context, fxVar.a, fxVar.e == 2, this.c);
            this.e = b;
            this.d = true;
            return b;
        }
        return this.e;
    }
}
