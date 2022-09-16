package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: tpa  reason: default package */
/* loaded from: classes4.dex */
public final class tpa {
    public static final ThreadLocal a = new tox();
    public Choreographer b;

    public tpa(byte[] bArr) {
        this.b = Choreographer.getInstance();
    }

    public tpa() {
    }
}
