package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.util.SparseIntArray;
import com.baidu.mapapi.model.LatLng;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.x509.DisplayText;
/* loaded from: classes.dex */
public class HeatMap {
    public static final Gradient DEFAULT_GRADIENT;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;

    /* renamed from: b  reason: collision with root package name */
    private static final String f1593b = "HeatMap";

    /* renamed from: c  reason: collision with root package name */
    private static final SparseIntArray f1594c = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1595d;
    private static final float[] e;
    private static int r;

    /* renamed from: a  reason: collision with root package name */
    BaiduMap f1596a;
    private l<WeightedLatLng> f;
    private Collection<WeightedLatLng> g;
    private int h;
    private Gradient i;
    private double j;
    private f k;
    private int[] l;
    private double[] m;
    private double[] n;
    private HashMap<String, Tile> o;
    private ExecutorService p;
    private HashSet<String> q;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Collection<WeightedLatLng> f1597a;

        /* renamed from: b  reason: collision with root package name */
        private int f1598b = 12;

        /* renamed from: c  reason: collision with root package name */
        private Gradient f1599c = HeatMap.DEFAULT_GRADIENT;

        /* renamed from: d  reason: collision with root package name */
        private double f1600d = 0.6d;

        public HeatMap build() {
            if (this.f1597a == null) {
                throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
            }
            return new HeatMap(this, null);
        }

        public Builder data(Collection<LatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            if (!collection.contains(null)) {
                return weightedData(HeatMap.c(collection));
            }
            throw new IllegalArgumentException("input points can not contain null.");
        }

        public Builder gradient(Gradient gradient) {
            if (gradient == null) {
                throw new IllegalArgumentException("gradient can not be null");
            }
            this.f1599c = gradient;
            return this;
        }

        public Builder opacity(double d2) {
            this.f1600d = d2;
            if (this.f1600d < 0.0d || this.f1600d > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i) {
            this.f1598b = i;
            if (this.f1598b < 10 || this.f1598b > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            if (collection.contains(null)) {
                throw new IllegalArgumentException("input points can not contain null.");
            }
            ArrayList arrayList = new ArrayList();
            for (WeightedLatLng weightedLatLng : collection) {
                LatLng latLng = weightedLatLng.latLng;
                if (latLng.latitude < 0.37532d || latLng.latitude > 54.562495d || latLng.longitude < 72.508319d || latLng.longitude > 135.942198d) {
                    arrayList.add(weightedLatLng);
                }
            }
            collection.removeAll(arrayList);
            this.f1597a = collection;
            return this;
        }
    }

    static {
        f1594c.put(3, 8388608);
        f1594c.put(4, 4194304);
        f1594c.put(5, PKIFailureInfo.badSenderNonce);
        f1594c.put(6, PKIFailureInfo.badCertTemplate);
        f1594c.put(7, PKIFailureInfo.signerNotTrusted);
        f1594c.put(8, PKIFailureInfo.transactionIdInUse);
        f1594c.put(9, 131072);
        f1594c.put(10, PKIFailureInfo.notAuthorized);
        f1594c.put(11, 32768);
        f1594c.put(12, 16384);
        f1594c.put(13, PKIFailureInfo.certRevoked);
        f1594c.put(14, 4096);
        f1594c.put(15, 2048);
        f1594c.put(16, 1024);
        f1594c.put(17, 512);
        f1594c.put(18, 256);
        f1594c.put(19, 128);
        f1594c.put(20, 64);
        f1595d = new int[]{Color.rgb(0, 0, (int) DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE), Color.rgb(0, 225, 0), Color.rgb(255, 0, 0)};
        e = new float[]{0.08f, 0.4f, 1.0f};
        DEFAULT_GRADIENT = new Gradient(f1595d, e);
    }

    private HeatMap(Builder builder) {
        this.o = new HashMap<>();
        this.p = Executors.newFixedThreadPool(1);
        this.q = new HashSet<>();
        this.g = builder.f1597a;
        this.h = builder.f1598b;
        this.i = builder.f1599c;
        this.j = builder.f1600d;
        this.m = a(this.h, this.h / 3.0d);
        a(this.i);
        b(this.g);
    }

    /* synthetic */ HeatMap(Builder builder, g gVar) {
        this(builder);
    }

    private static double a(Collection<WeightedLatLng> collection, f fVar, int i, int i2) {
        android.support.v4.i.f fVar2;
        double d2;
        double d3 = fVar.f1722a;
        double d4 = fVar.f1724c;
        double d5 = fVar.f1723b;
        double d6 = d4 - d3;
        double d7 = fVar.f1725d - d5;
        if (d6 <= d7) {
            d6 = d7;
        }
        double d8 = ((int) ((i2 / (i * 2)) + 0.5d)) / d6;
        android.support.v4.i.f fVar3 = new android.support.v4.i.f();
        double d9 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            int i3 = (int) ((weightedLatLng.a().y - d5) * d8);
            long j = (int) ((weightedLatLng.a().x - d3) * d8);
            android.support.v4.i.f fVar4 = (android.support.v4.i.f) fVar3.a(j);
            if (fVar4 == null) {
                fVar4 = new android.support.v4.i.f();
                fVar3.b(j, fVar4);
            }
            long j2 = i3;
            Double d10 = (Double) fVar4.a(j2);
            if (d10 == null) {
                fVar2 = fVar3;
                d2 = d3;
                d10 = Double.valueOf(0.0d);
            } else {
                fVar2 = fVar3;
                d2 = d3;
            }
            Double valueOf = Double.valueOf(weightedLatLng.intensity + d10.doubleValue());
            fVar4.b(j2, valueOf);
            if (valueOf.doubleValue() > d9) {
                d9 = valueOf.doubleValue();
            }
            d3 = d2;
            fVar3 = fVar2;
        }
        return d9;
    }

    private static Bitmap a(double[][] dArr, int[] iArr, double d2) {
        int i = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d3 = dArr[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d3 * length);
                if (d3 == 0.0d) {
                    iArr2[i4] = 0;
                } else if (i5 < iArr.length) {
                    iArr2[i4] = iArr[i5];
                } else {
                    iArr2[i4] = i;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static Tile a(Bitmap bitmap) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(allocate);
        return new Tile(256, 256, allocate.array());
    }

    private void a(Gradient gradient) {
        this.i = gradient;
        this.l = gradient.a(this.j);
    }

    private synchronized void a(String str, Tile tile) {
        this.o.put(str, tile);
    }

    private synchronized boolean a(String str) {
        return this.q.contains(str);
    }

    private double[] a(int i) {
        int i2;
        double[] dArr = new double[20];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = a(this.g, this.k, i, (int) (Math.pow(2.0d, i3 - 3) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 20; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static double[] a(int i, double d2) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((-i2) * i2) / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
        int floor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i = length - (floor * 2);
        int i2 = (floor + i) - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, length, length);
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                double d2 = dArr[i3][i4];
                if (d2 != 0.0d) {
                    int i5 = i3 + floor;
                    if (i2 < i5) {
                        i5 = i2;
                    }
                    int i6 = i5 + 1;
                    int i7 = i3 - floor;
                    for (int i8 = floor > i7 ? floor : i7; i8 < i6; i8++) {
                        double[] dArr4 = dArr3[i8];
                        dArr4[i4] = dArr4[i4] + (dArr2[i8 - i7] * d2);
                    }
                }
            }
        }
        double[][] dArr5 = (double[][]) Array.newInstance(double.class, i, i);
        for (int i9 = floor; i9 < i2 + 1; i9++) {
            for (int i10 = 0; i10 < length; i10++) {
                double d3 = dArr3[i9][i10];
                if (d3 != 0.0d) {
                    int i11 = i10 + floor;
                    if (i2 < i11) {
                        i11 = i2;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 - floor;
                    for (int i14 = floor > i13 ? floor : i13; i14 < i12; i14++) {
                        double[] dArr6 = dArr5[i9 - floor];
                        int i15 = i14 - floor;
                        dArr6[i15] = dArr6[i15] + (dArr2[i14 - i13] * d3);
                    }
                }
            }
        }
        return dArr5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, int i3) {
        double d2 = f1594c.get(i3);
        double d3 = (this.h * d2) / 256.0d;
        double d4 = ((2.0d * d3) + d2) / ((this.h * 2) + 256);
        if (i < 0 || i2 < 0) {
            return;
        }
        double d5 = (i * d2) - d3;
        double d6 = ((i + 1) * d2) + d3;
        double d7 = (i2 * d2) - d3;
        double d8 = ((i2 + 1) * d2) + d3;
        f fVar = new f(d5, d6, d7, d8);
        if (!fVar.a(new f(this.k.f1722a - d3, this.k.f1724c + d3, this.k.f1723b - d3, this.k.f1725d + d3))) {
            return;
        }
        Collection<WeightedLatLng> a2 = this.f.a(fVar);
        if (a2.isEmpty()) {
            return;
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, (this.h * 2) + 256, (this.h * 2) + 256);
        for (WeightedLatLng weightedLatLng : a2) {
            Point a3 = weightedLatLng.a();
            int i4 = (int) ((a3.x - d5) / d4);
            int i5 = (int) ((d8 - a3.y) / d4);
            if (i4 >= (this.h * 2) + 256) {
                i4 = ((this.h * 2) + 256) - 1;
            }
            if (i5 >= (this.h * 2) + 256) {
                i5 = ((this.h * 2) + 256) - 1;
            }
            double[] dArr2 = dArr[i4];
            dArr2[i5] = dArr2[i5] + weightedLatLng.intensity;
            d8 = d8;
        }
        Bitmap a4 = a(a(dArr, this.m), this.l, this.n[i3 - 1]);
        Tile a5 = a(a4);
        a4.recycle();
        a(i + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i3, a5);
        if (this.o.size() > r) {
            a();
        }
        if (this.f1596a == null) {
            return;
        }
        this.f1596a.a();
    }

    private synchronized void b(String str) {
        this.q.add(str);
    }

    private void b(Collection<WeightedLatLng> collection) {
        this.g = collection;
        if (this.g.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        this.k = d(this.g);
        this.f = new l<>(this.k);
        for (WeightedLatLng weightedLatLng : this.g) {
            this.f.a((l<WeightedLatLng>) weightedLatLng);
        }
        this.n = a(this.h);
    }

    private synchronized Tile c(String str) {
        if (this.o.containsKey(str)) {
            Tile tile = this.o.get(str);
            this.o.remove(str);
            return tile;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> c(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : collection) {
            arrayList.add(new WeightedLatLng(latLng));
        }
        return arrayList;
    }

    private static f d(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d2 = next.a().x;
        double d3 = next.a().x;
        double d4 = next.a().y;
        double d5 = next.a().y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d6 = next2.a().x;
            double d7 = next2.a().y;
            if (d6 < d2) {
                d2 = d6;
            }
            if (d6 > d3) {
                d3 = d6;
            }
            if (d7 < d4) {
                d4 = d7;
            }
            if (d7 > d5) {
                d5 = d7;
            }
        }
        return new f(d2, d3, d4, d5);
    }

    private synchronized void d() {
        this.o.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tile a(int i, int i2, int i3) {
        String str = i + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i3;
        Tile c2 = c(str);
        if (c2 != null) {
            return c2;
        }
        if (a(str)) {
            return null;
        }
        if (this.f1596a != null && r == 0) {
            MapStatus mapStatus = this.f1596a.getMapStatus();
            r = (((mapStatus.f1618a.j.f2035b - mapStatus.f1618a.j.f2034a) / 256) + 2) * (((mapStatus.f1618a.j.f2037d - mapStatus.f1618a.j.f2036c) / 256) + 2) * 4;
        }
        if (this.o.size() > r) {
            a();
        }
        if (this.p.isShutdown()) {
            return null;
        }
        try {
            this.p.execute(new g(this, i, i2, i3));
            b(str);
            return null;
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        this.q.clear();
        this.o.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.p.shutdownNow();
    }

    public void removeHeatMap() {
        if (this.f1596a != null) {
            this.f1596a.a(this);
        }
    }
}
