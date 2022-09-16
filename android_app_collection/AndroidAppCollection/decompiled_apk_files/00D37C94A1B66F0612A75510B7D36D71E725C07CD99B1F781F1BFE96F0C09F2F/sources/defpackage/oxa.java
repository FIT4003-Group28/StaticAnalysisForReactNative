package defpackage;

import android.media.MediaCrypto;
/* compiled from: PG */
/* renamed from: oxa  reason: default package */
/* loaded from: classes4.dex */
public final class oxa {
    public final MediaCrypto a;

    public oxa(MediaCrypto mediaCrypto) {
        this.a = mediaCrypto;
    }

    public final boolean a(String str) {
        return this.a.requiresSecureDecoderComponent(str);
    }
}
