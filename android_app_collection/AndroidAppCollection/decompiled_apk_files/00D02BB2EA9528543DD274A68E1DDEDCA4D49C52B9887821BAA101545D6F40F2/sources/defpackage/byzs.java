package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: byzs  reason: default package */
/* loaded from: classes4.dex */
public final class byzs implements dbty<Bitmap> {
    public final Context a;
    public final dpzb b;
    private final int c;
    private final int d;
    @dzsi
    private Bitmap e;

    public byzs(Context context, dpzb dpzbVar, int i, int i2) {
        this.a = context;
        this.c = i;
        this.d = i2;
        this.b = dpzbVar;
        dbsk.a(xkn.e(xkn.g(dpzbVar)));
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Bitmap a() {
        if (this.e == null) {
            cqtd c = xkn.c(xkn.g(this.b));
            Context context = this.a;
            dbsk.s(c);
            this.e = bzkw.c(context, c.a(this.a), this.c, this.d);
        }
        return this.e;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byzs)) {
            return false;
        }
        byzs byzsVar = (byzs) obj;
        return this.c == byzsVar.c && this.d == byzsVar.d && dbsd.a(this.b, byzsVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), this.b});
    }
}
