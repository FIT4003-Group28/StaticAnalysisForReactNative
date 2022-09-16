package defpackage;

import android.graphics.Color;
import android.view.MotionEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: shp  reason: default package */
/* loaded from: classes4.dex */
public class shp {
    public static HashSet c() {
        return new HashSet();
    }

    public static HashSet d(Collection collection) {
        return new HashSet(collection);
    }

    public static HashSet e(int i) {
        return new HashSet(g(i));
    }

    public static LinkedHashSet f() {
        return new LinkedHashSet();
    }

    static int g(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i <= 1073741823) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static HashMap h() {
        return new HashMap();
    }

    public static HashMap i(int i) {
        sho.a(i >= 0, "expectedSize should be greater than or equal to 0");
        return new HashMap(g(i));
    }

    public static LinkedHashMap j() {
        return new LinkedHashMap();
    }

    public static TreeMap k() {
        return new TreeMap();
    }

    public static int l(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public boolean b() {
        return false;
    }
}
