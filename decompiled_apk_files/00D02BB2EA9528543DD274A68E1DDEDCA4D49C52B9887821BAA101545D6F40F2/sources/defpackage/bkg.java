package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
/* compiled from: PG */
/* renamed from: bkg  reason: default package */
/* loaded from: classes3.dex */
public final class bkg extends Paint {
    public bkg() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public bkg(int i) {
        super(i);
    }

    public bkg(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public bkg(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}
