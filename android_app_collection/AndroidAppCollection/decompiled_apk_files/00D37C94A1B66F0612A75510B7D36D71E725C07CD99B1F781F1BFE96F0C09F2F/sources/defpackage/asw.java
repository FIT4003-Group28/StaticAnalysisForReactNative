package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: asw  reason: default package */
/* loaded from: classes2.dex */
public class asw extends IOException {
    public final int a;

    public asw(int i) {
        this.a = i;
    }

    public asw(String str, int i) {
        super(str);
        this.a = i;
    }

    public asw(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public asw(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
