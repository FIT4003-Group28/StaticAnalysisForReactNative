package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ggq  reason: default package */
/* loaded from: classes3.dex */
public final class ggq {
    public final Uri a;
    public final String b;
    public boolean c;
    public boolean d;
    public double e;
    public double f;
    public double g;
    public int h;
    public int i;

    public ggq(String str, atep atepVar, String str2) {
        this.i = 1;
        zgh.m(str);
        this.b = str;
        atepVar.getClass();
        this.a = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
        this.i = 1;
        this.e = 0.0d;
        this.f = 0.0d;
        this.g = 0.0d;
    }

    public final double a() {
        return ((this.e + this.f) + this.g) / 3.0d;
    }

    public final void b() {
        this.d = true;
    }

    public final void c(alct alctVar) {
        this.h = 0;
        int z = araa.z(alctVar.c);
        if (z == 0) {
            z = 1;
        }
        int i = z - 1;
        if (i != 0) {
            if (i == 1) {
                this.f = 1.0d;
                return;
            } else if (i != 3) {
                return;
            } else {
                this.c = true;
                return;
            }
        }
        avun b = avun.b(alctVar.d);
        if (b == null) {
            b = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b == avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI) {
            this.h = 1;
            return;
        }
        avun b2 = avun.b(alctVar.d);
        if (b2 == null) {
            b2 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b2 != avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK) {
            return;
        }
        this.h = 2;
    }
}
