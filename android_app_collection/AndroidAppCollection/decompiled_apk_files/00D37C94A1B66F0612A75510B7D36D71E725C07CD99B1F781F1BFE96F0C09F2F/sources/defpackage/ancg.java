package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ancg  reason: default package */
/* loaded from: classes.dex */
public abstract class ancg extends anbf {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ancg(String str) {
        this.a = str;
    }

    @Override // defpackage.anbf
    public String a() {
        return this.a;
    }

    @Override // defpackage.anbf
    public void b(RuntimeException runtimeException, anbe anbeVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
