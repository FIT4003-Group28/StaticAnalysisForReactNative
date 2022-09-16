package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
/* compiled from: PG */
/* renamed from: coo  reason: default package */
/* loaded from: classes3.dex */
public final class coo implements cnq {
    private final Context a;
    private final cnq b;
    private final cnq c;
    private final Class d;

    public coo(Context context, cnq cnqVar, cnq cnqVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = cnqVar;
        this.c = cnqVar2;
        this.d = cls;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri uri = (Uri) obj;
        return new cnp(new cup(uri), new con(this.a, this.b, this.c, uri, i, i2, cicVar, this.d));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && acz.e((Uri) obj);
    }
}
