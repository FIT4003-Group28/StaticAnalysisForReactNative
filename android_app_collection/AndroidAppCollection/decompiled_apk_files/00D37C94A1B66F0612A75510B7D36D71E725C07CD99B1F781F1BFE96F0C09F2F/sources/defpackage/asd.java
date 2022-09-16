package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
/* compiled from: PG */
/* renamed from: asd  reason: default package */
/* loaded from: classes2.dex */
public class asd {
    public int a;
    private final int b;
    private final int c;
    private final String d;
    private VolumeProvider e;

    public asd(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = str;
    }

    public final Object a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new asa(this, this.b, this.c, this.a, this.d);
            } else {
                this.e = new asb(this, this.b, this.c, this.a);
            }
        }
        return this.e;
    }

    public void b(int i) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }
}
