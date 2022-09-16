package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
/* compiled from: PG */
/* renamed from: cqt  reason: default package */
/* loaded from: classes3.dex */
public final class cqt implements cie {
    private final /* synthetic */ int a;

    public cqt() {
    }

    public cqt(int i) {
        this.a = i;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        int i = this.a;
        if (i == 0) {
            Drawable drawable = (Drawable) obj;
            return true;
        } else if (i == 1) {
            Bitmap bitmap = (Bitmap) obj;
            return true;
        } else {
            File file = (File) obj;
            return true;
        }
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                return new cqf((Bitmap) obj);
            }
            return new cot((File) obj);
        }
        return cqr.g((Drawable) obj);
    }
}
