package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxjb  reason: default package */
/* loaded from: classes6.dex */
public final class dxjb {
    public static <T> List<T> a(int i) {
        return new ArrayList(i);
    }

    public static int b(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }
}
