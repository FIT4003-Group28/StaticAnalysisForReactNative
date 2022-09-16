package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: alcl  reason: default package */
/* loaded from: classes.dex */
public final class alcl {
    public String a;
    public Bitmap b;
    public byte[] c;
    public Uri d;

    public final alcm a() {
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: frontendId");
        }
        return new alcm(str, this.b, this.c, this.d);
    }
}
