package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
/* compiled from: PG */
/* renamed from: bxz  reason: default package */
/* loaded from: classes2.dex */
public final class bxz extends Paint {
    public bxz() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public bxz(int i) {
        super(i);
    }

    public bxz(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public bxz(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}
