package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
/* compiled from: PG */
/* renamed from: bqf  reason: default package */
/* loaded from: classes2.dex */
public final class bqf {
    private static bqf b;
    public int a;

    public bqf(int i) {
        this.a = i;
    }

    public bqf(View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, anh.a, i, i2);
            this.a = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    public static synchronized bqf a() {
        bqf bqfVar;
        synchronized (bqf.class) {
            if (b == null) {
                b = new bqf(3);
            }
            bqfVar = b;
        }
        return bqfVar;
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized void c(bqf bqfVar) {
        synchronized (bqf.class) {
            b = bqfVar;
        }
    }

    public static final void f(Throwable... thArr) {
        if (thArr.length > 0) {
            Throwable th = thArr[0];
        }
    }

    public final void d(Throwable... thArr) {
        if (this.a > 3 || thArr.length <= 0) {
            return;
        }
        Throwable th = thArr[0];
    }

    public static final void e(String str, String str2, Throwable... thArr) {
        if (thArr.length <= 0) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, thArr[0]);
        }
    }

    public static final void g(String str, String str2, Throwable... thArr) {
        if (thArr.length <= 0) {
            Log.w(str, str2);
        } else {
            Log.w(str, str2, thArr[0]);
        }
    }

    public bqf() {
    }
}
