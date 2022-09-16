package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ary  reason: default package */
/* loaded from: classes2.dex */
public final class ary {
    arz a;

    public ary(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new arz(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ary) {
            return this.a.equals(((ary) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ary(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.a = new arz(str, i, i2, null);
                return;
            } else {
                this.a = new arz(str, i, i2);
                return;
            }
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
