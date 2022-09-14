package com.teslamotors.plugins.ble;

import android.os.Build;
import android.os.ParcelUuid;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* compiled from: BLEConstants.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f5168a;

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f5169b;

    /* renamed from: c  reason: collision with root package name */
    public static final ParcelUuid f5170c;

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f5171d;
    public static final UUID e;
    public static final UUID f;
    public static final UUID g;
    public static final byte[] h;
    public static final SimpleDateFormat i;
    public static final Set<String> j;

    static {
        f5168a = Build.VERSION.SDK_INT >= 26;
        f5169b = UUID.fromString("00000211-b2d1-43f0-9b88-960cebf8b91e");
        f5170c = ParcelUuid.fromString("00001122-0000-1000-8000-00805F9B34FB");
        f5171d = UUID.fromString("00000212-b2d1-43f0-9b88-960cebf8b91e");
        e = UUID.fromString("00000213-b2d1-43f0-9b88-960cebf8b91e");
        f = UUID.fromString("00000214-b2d1-43f0-9b88-960cebf8b91e");
        g = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        h = new byte[]{2};
        i = new SimpleDateFormat("MM/dd/yy HH:mm:ss.SSS");
        j = new HashSet(Arrays.asList("C", "R", "D", "P"));
    }
}
