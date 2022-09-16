package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjf  reason: default package */
/* loaded from: classes3.dex */
public final class kjf {
    public final String a;
    public final avhn b;

    public kjf(String str, avhn avhnVar) {
        this.a = str;
        this.b = avhnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kjf)) {
            return false;
        }
        kjf kjfVar = (kjf) obj;
        return TextUtils.equals(this.a, kjfVar.a) && akzj.f(this.b, kjfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
