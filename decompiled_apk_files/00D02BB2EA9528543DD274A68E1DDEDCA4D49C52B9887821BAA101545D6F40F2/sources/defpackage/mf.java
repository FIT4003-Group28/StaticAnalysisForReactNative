package defpackage;

import android.os.Build;
import androidx.media.AudioAttributesCompat;
/* compiled from: PG */
/* renamed from: mf  reason: default package */
/* loaded from: classes7.dex */
public final class mf {
    public mf(int i) {
        apu apuVar;
        int i2 = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
            apuVar = new apv();
        } else {
            apuVar = new apu();
        }
        apuVar.a.setLegacyStreamType(i);
        new AudioAttributesCompat(apuVar.a());
    }

    public mf() {
    }
}
