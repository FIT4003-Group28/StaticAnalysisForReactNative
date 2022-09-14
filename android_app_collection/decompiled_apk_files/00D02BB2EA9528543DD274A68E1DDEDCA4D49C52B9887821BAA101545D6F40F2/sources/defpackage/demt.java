package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import defpackage.demt;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: demt  reason: default package */
/* loaded from: classes6.dex */
public class demt<T extends demt<?>> {
    public final Bundle a;
    public Thing.Metadata b;
    private final String c;
    private String d;

    /* JADX INFO: Access modifiers changed from: protected */
    public demt(String str) {
        cnwc.l(str);
        this.a = new Bundle();
        this.c = str;
    }

    private static <S> S[] f(S[] sArr) {
        return sArr.length < 100 ? sArr : (S[]) Arrays.copyOf(sArr, 100);
    }

    public static void putInBundle(Bundle bundle, String str, double... dArr) {
        cnwc.a(str);
        cnwc.a(dArr);
        int length = dArr.length;
        if (length > 0) {
            if (length >= 100) {
                dArr = Arrays.copyOf(dArr, 100);
            }
            bundle.putDoubleArray(str, dArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T a(String str) {
        cnwc.a(str);
        d("name", str);
        return this;
    }

    public final deme b() {
        Bundle bundle = new Bundle(this.a);
        Thing.Metadata metadata = this.b;
        if (metadata == null) {
            metadata = new demd().a();
        }
        return new Thing(bundle, metadata, this.d, this.c);
    }

    public final void c(String str, deme... demeVarArr) {
        putInBundle(this.a, str, demeVarArr);
    }

    public final void d(String str, String... strArr) {
        putInBundle(this.a, str, strArr);
    }

    public final void e(String str) {
        cnwc.a(str);
        this.d = str;
    }

    public static void putInBundle(Bundle bundle, String str, long... jArr) {
        cnwc.a(str);
        cnwc.a(jArr);
        int length = jArr.length;
        if (length > 0) {
            if (length >= 100) {
                jArr = Arrays.copyOf(jArr, 100);
            }
            bundle.putLongArray(str, jArr);
        }
    }

    public static void putInBundle(Bundle bundle, String str, deme... demeVarArr) {
        cnwc.a(str);
        cnwc.a(demeVarArr);
        int length = demeVarArr.length;
        Thing[] thingArr = new Thing[length];
        for (int i = 0; i < demeVarArr.length; i++) {
            deme demeVar = demeVarArr[i];
            if (demeVar == null || (demeVar instanceof Thing)) {
                thingArr[i] = (Thing) demeVar;
            } else {
                throw new delt("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
            }
        }
        cnwc.a(str);
        if (length > 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                thingArr[i2] = thingArr[i3];
                if (thingArr[i3] == null) {
                    StringBuilder sb = new StringBuilder(58);
                    sb.append("Thing at ");
                    sb.append(i3);
                    sb.append(" is null and is ignored by put method.");
                    sb.toString();
                } else {
                    i2++;
                }
            }
            if (i2 <= 0) {
                return;
            }
            bundle.putParcelableArray(str, (Parcelable[]) f((Thing[]) Arrays.copyOfRange(thingArr, 0, i2)));
        }
    }

    public static void putInBundle(Bundle bundle, String str, String... strArr) {
        cnwc.a(str);
        cnwc.a(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    sb.toString();
                } else {
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        sb2.toString();
                        strArr2[i] = deoq.truncate(strArr2[i], 20000);
                    }
                    i++;
                }
            }
            if (i <= 0) {
                return;
            }
            bundle.putStringArray(str, (String[]) f((String[]) Arrays.copyOfRange(strArr2, 0, i)));
        }
    }

    public static void putInBundle(Bundle bundle, String str, boolean... zArr) {
        cnwc.a(str);
        cnwc.a(zArr);
        int length = zArr.length;
        if (length > 0) {
            if (length >= 100) {
                zArr = Arrays.copyOf(zArr, 100);
            }
            bundle.putBooleanArray(str, zArr);
        }
    }
}
