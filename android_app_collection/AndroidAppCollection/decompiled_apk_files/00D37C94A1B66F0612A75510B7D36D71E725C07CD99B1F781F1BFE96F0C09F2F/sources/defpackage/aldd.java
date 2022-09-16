package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aldd  reason: default package */
/* loaded from: classes.dex */
public abstract class aldd implements aldj {
    protected final Uri c;
    protected final ContentResolver d;
    protected final akze e;

    public aldd(Uri uri, ContentResolver contentResolver, akze akzeVar) {
        this.c = uri;
        this.d = contentResolver;
        this.e = akzeVar;
    }

    @Override // defpackage.aldj
    public final Bitmap b(Point point) {
        return alde.b(this.d, this.c, point);
    }

    @Override // defpackage.aldj
    public final avuy g(String str, String str2) {
        return alde.d(str);
    }

    @Override // defpackage.aldj
    public final boolean k() {
        return true;
    }

    public static aldd a(int i, Uri uri, Context context, akze akzeVar) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return new aldc(uri, context, akzeVar, true);
            }
            return new aldg(uri, context.getContentResolver(), akzeVar);
        }
        return new aldc(uri, context, akzeVar, false);
    }
}
