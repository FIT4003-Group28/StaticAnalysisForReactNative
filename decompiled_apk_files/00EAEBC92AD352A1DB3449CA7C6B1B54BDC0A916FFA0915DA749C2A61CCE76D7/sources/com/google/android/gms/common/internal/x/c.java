package com.google.android.gms.common.internal.x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return b(parcel, 20293);
    }

    public static void a(Parcel parcel, int i) {
        c(parcel, i);
    }

    public static void a(Parcel parcel, int i, float f2) {
        b(parcel, i, 4);
        parcel.writeFloat(f2);
    }

    public static void a(Parcel parcel, int i, int i2) {
        b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, int i, long j) {
        b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcel.writeBundle(bundle);
        c(parcel, b2);
    }

    public static void a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        c(parcel, b2);
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        c(parcel, b2);
    }

    public static void a(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            b(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (!z) {
        } else {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Double d2, boolean z) {
        if (d2 != null) {
            b(parcel, i, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (!z) {
        } else {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Float f2, boolean z) {
        if (f2 != null) {
            b(parcel, i, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (!z) {
        } else {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (!z) {
        } else {
            b(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcel.writeString(str);
        c(parcel, b2);
    }

    public static void a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcel.writeStringList(list);
        c(parcel, b2);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, i2);
            }
        }
        c(parcel, b2);
    }

    private static <T extends Parcelable> void a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static int b(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
            return;
        }
        parcel.writeInt(i | (-65536));
        parcel.writeInt(i2);
    }

    public static <T extends Parcelable> void b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            b(parcel, i, 0);
            return;
        }
        int b2 = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, 0);
            }
        }
        c(parcel, b2);
    }

    private static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
