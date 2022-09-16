package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: arz  reason: default package */
/* loaded from: classes2.dex */
final class arz {
    private String a;
    private int b;
    private int c;

    public arz(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public arz(String str, int i, int i2, byte[] bArr) {
        this(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arz)) {
            return false;
        }
        arz arzVar = (arz) obj;
        return (this.b < 0 || arzVar.b < 0) ? TextUtils.equals(this.a, arzVar.a) && this.c == arzVar.c : TextUtils.equals(this.a, arzVar.a) && this.b == arzVar.b && this.c == arzVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
