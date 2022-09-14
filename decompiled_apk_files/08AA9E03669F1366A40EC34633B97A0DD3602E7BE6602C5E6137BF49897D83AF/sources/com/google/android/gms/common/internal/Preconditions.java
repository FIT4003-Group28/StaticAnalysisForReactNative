package com.google.android.gms.common.internal;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.ThreadUtils;
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static int checkElementIndex(int i, int i2, String str) {
        String format;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                format = format("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                format = format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(format);
        }
        return i;
    }

    public static void checkHandlerThread(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void checkMainThread(String str) {
        if (!ThreadUtils.isMainThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static void checkNotMainThread(String str) {
        if (ThreadUtils.isMainThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t) {
        if (t == null) {
            throw new NullPointerException("null reference");
        }
        return t;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t;
    }

    public static void checkNotNullIfPresent(String str, ContentValues contentValues) {
        if (!contentValues.containsKey(str) || contentValues.get(str) != null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" cannot be set to null"));
    }

    public static int checkNotZero(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        return i;
    }

    public static int checkNotZero(int i, Object obj) {
        if (i == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return i;
    }

    public static long checkNotZero(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
        return j;
    }

    public static long checkNotZero(long j, Object obj) {
        if (j == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return j;
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static int checkPositionIndex(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zza(i, i2, str));
        }
        return i;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zza(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zza(i2, i3, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static String checkTag(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Tag must not be empty or null");
        }
        if (str.length() <= 23) {
            return str;
        }
        throw new IllegalArgumentException("Tag must not be greater than 23 chars.");
    }

    private static String format(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    private static String zza(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
