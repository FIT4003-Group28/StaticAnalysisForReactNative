package defpackage;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
/* compiled from: PG */
/* renamed from: aqu  reason: default package */
/* loaded from: classes2.dex */
public class aqu {
    public final AudioAttributes.Builder a = new AudioAttributes.Builder();

    public AudioAttributesImpl a() {
        return new AudioAttributesImplApi21(this.a.build());
    }
}
