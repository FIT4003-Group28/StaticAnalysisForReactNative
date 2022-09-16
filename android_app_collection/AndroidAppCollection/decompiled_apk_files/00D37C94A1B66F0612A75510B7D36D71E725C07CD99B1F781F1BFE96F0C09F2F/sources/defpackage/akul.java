package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: akul  reason: default package */
/* loaded from: classes.dex */
public final class akul {
    private final Context a;

    public akul(Context context) {
        this.a = context;
    }

    public final void a(Bitmap bitmap, Bundle bundle, String str) {
        b(bitmap, bundle, str, null);
    }

    public final void b(Bitmap bitmap, Bundle bundle, String str, String str2) {
        rbi rbiVar = new rbi(this.a);
        rbiVar.e(new akuj(bundle));
        if (bitmap != null) {
            rbiVar.d(bitmap);
        }
        if (str != null) {
            rbiVar.c = str;
        }
        if (str2 != null) {
            rbiVar.b = str2;
        }
        qst e = rbh.e(this.a);
        tnk.i(rbh.d(e.D, rbiVar.a()));
    }
}
