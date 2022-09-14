package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
/* compiled from: PG */
/* renamed from: ccn  reason: default package */
/* loaded from: classes.dex */
public final class ccn implements bud<BitmapDrawable> {
    private final bxn a;
    private final bud<Bitmap> b;

    public ccn(bxn bxnVar, bud<Bitmap> budVar) {
        this.a = bxnVar;
        this.b = budVar;
    }

    @Override // defpackage.btl
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bua buaVar) {
        return this.b.a(new ccq(((BitmapDrawable) ((bxd) obj).b()).getBitmap(), this.a), file, buaVar);
    }

    @Override // defpackage.bud
    public final int b() {
        return 2;
    }
}
