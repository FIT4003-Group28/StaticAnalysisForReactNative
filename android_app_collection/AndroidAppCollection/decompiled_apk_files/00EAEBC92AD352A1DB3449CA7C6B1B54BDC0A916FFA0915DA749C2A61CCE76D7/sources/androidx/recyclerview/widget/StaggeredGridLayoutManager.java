package androidx.recyclerview.widget;

import a.g.m.e0.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;
    f[] t;
    k u;
    k v;
    private int w;
    private int x;
    private final g y;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f1995a;

        /* renamed from: b  reason: collision with root package name */
        int f1996b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1997c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1998d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1999e;

        /* renamed from: f  reason: collision with root package name */
        int[] f2000f;

        b() {
            b();
        }

        void a() {
            this.f1996b = this.f1997c ? StaggeredGridLayoutManager.this.u.b() : StaggeredGridLayoutManager.this.u.f();
        }

        void a(int i) {
            this.f1996b = this.f1997c ? StaggeredGridLayoutManager.this.u.b() - i : StaggeredGridLayoutManager.this.u.f() + i;
        }

        void a(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2000f;
            if (iArr == null || iArr.length < length) {
                this.f2000f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2000f[i] = fVarArr[i].b(RecyclerView.UNDEFINED_DURATION);
            }
        }

        void b() {
            this.f1995a = -1;
            this.f1996b = RecyclerView.UNDEFINED_DURATION;
            this.f1997c = false;
            this.f1998d = false;
            this.f1999e = false;
            int[] iArr = this.f2000f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        f f2002e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2003f;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            f fVar = this.f2002e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2021e;
        }

        public boolean f() {
            return this.f2003f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f2004a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f2005b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0052a();

            /* renamed from: b  reason: collision with root package name */
            int f2006b;

            /* renamed from: c  reason: collision with root package name */
            int f2007c;

            /* renamed from: d  reason: collision with root package name */
            int[] f2008d;

            /* renamed from: e  reason: collision with root package name */
            boolean f2009e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            static class C0052a implements Parcelable.Creator<a> {
                C0052a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                /* renamed from: createFromParcel */
                public a mo80createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                /* renamed from: newArray */
                public a[] mo81newArray(int i) {
                    return new a[i];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f2006b = parcel.readInt();
                this.f2007c = parcel.readInt();
                this.f2009e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2008d = new int[readInt];
                    parcel.readIntArray(this.f2008d);
                }
            }

            int a(int i) {
                int[] iArr = this.f2008d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2006b + ", mGapDir=" + this.f2007c + ", mHasUnwantedGapAfter=" + this.f2009e + ", mGapPerSpan=" + Arrays.toString(this.f2008d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2006b);
                parcel.writeInt(this.f2007c);
                parcel.writeInt(this.f2009e ? 1 : 0);
                int[] iArr = this.f2008d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2008d);
            }
        }

        d() {
        }

        private void c(int i, int i2) {
            List<a> list = this.f2005b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2005b.get(size);
                int i3 = aVar.f2006b;
                if (i3 >= i) {
                    aVar.f2006b = i3 + i2;
                }
            }
        }

        private void d(int i, int i2) {
            List<a> list = this.f2005b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2005b.get(size);
                int i4 = aVar.f2006b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f2005b.remove(size);
                    } else {
                        aVar.f2006b = i4 - i2;
                    }
                }
            }
        }

        private int g(int i) {
            if (this.f2005b == null) {
                return -1;
            }
            a c2 = c(i);
            if (c2 != null) {
                this.f2005b.remove(c2);
            }
            int size = this.f2005b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2005b.get(i2).f2006b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2005b.remove(i2);
            return this.f2005b.get(i2).f2006b;
        }

        public a a(int i, int i2, int i3, boolean z) {
            List<a> list = this.f2005b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f2005b.get(i4);
                int i5 = aVar.f2006b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2007c == i3 || (z && aVar.f2009e))) {
                    return aVar;
                }
            }
            return null;
        }

        void a() {
            int[] iArr = this.f2004a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2005b = null;
        }

        void a(int i) {
            int[] iArr = this.f2004a;
            if (iArr == null) {
                this.f2004a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.f2004a, -1);
            } else if (i < iArr.length) {
            } else {
                this.f2004a = new int[f(i)];
                System.arraycopy(iArr, 0, this.f2004a, 0, iArr.length);
                int[] iArr2 = this.f2004a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        void a(int i, int i2) {
            int[] iArr = this.f2004a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.f2004a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2004a, i, i3, -1);
            c(i, i2);
        }

        void a(int i, f fVar) {
            a(i);
            this.f2004a[i] = fVar.f2021e;
        }

        public void a(a aVar) {
            if (this.f2005b == null) {
                this.f2005b = new ArrayList();
            }
            int size = this.f2005b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.f2005b.get(i);
                if (aVar2.f2006b == aVar.f2006b) {
                    this.f2005b.remove(i);
                }
                if (aVar2.f2006b >= aVar.f2006b) {
                    this.f2005b.add(i, aVar);
                    return;
                }
            }
            this.f2005b.add(aVar);
        }

        int b(int i) {
            List<a> list = this.f2005b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2005b.get(size).f2006b >= i) {
                        this.f2005b.remove(size);
                    }
                }
            }
            return e(i);
        }

        void b(int i, int i2) {
            int[] iArr = this.f2004a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.f2004a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2004a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            d(i, i2);
        }

        public a c(int i) {
            List<a> list = this.f2005b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2005b.get(size);
                if (aVar.f2006b == i) {
                    return aVar;
                }
            }
            return null;
        }

        int d(int i) {
            int[] iArr = this.f2004a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        int e(int i) {
            int[] iArr = this.f2004a;
            if (iArr != null && i < iArr.length) {
                int g2 = g(i);
                if (g2 == -1) {
                    int[] iArr2 = this.f2004a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f2004a.length;
                }
                int i2 = g2 + 1;
                Arrays.fill(this.f2004a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        int f(int i) {
            int length = this.f2004a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f2010b;

        /* renamed from: c  reason: collision with root package name */
        int f2011c;

        /* renamed from: d  reason: collision with root package name */
        int f2012d;

        /* renamed from: e  reason: collision with root package name */
        int[] f2013e;

        /* renamed from: f  reason: collision with root package name */
        int f2014f;

        /* renamed from: g  reason: collision with root package name */
        int[] f2015g;

        /* renamed from: h  reason: collision with root package name */
        List<d.a> f2016h;
        boolean i;
        boolean j;
        boolean k;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public e mo82createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public e[] mo83newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f2010b = parcel.readInt();
            this.f2011c = parcel.readInt();
            this.f2012d = parcel.readInt();
            int i = this.f2012d;
            if (i > 0) {
                this.f2013e = new int[i];
                parcel.readIntArray(this.f2013e);
            }
            this.f2014f = parcel.readInt();
            int i2 = this.f2014f;
            if (i2 > 0) {
                this.f2015g = new int[i2];
                parcel.readIntArray(this.f2015g);
            }
            boolean z = false;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1 ? true : z;
            this.f2016h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2012d = eVar.f2012d;
            this.f2010b = eVar.f2010b;
            this.f2011c = eVar.f2011c;
            this.f2013e = eVar.f2013e;
            this.f2014f = eVar.f2014f;
            this.f2015g = eVar.f2015g;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.f2016h = eVar.f2016h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void j() {
            this.f2013e = null;
            this.f2012d = 0;
            this.f2010b = -1;
            this.f2011c = -1;
        }

        void k() {
            this.f2013e = null;
            this.f2012d = 0;
            this.f2014f = 0;
            this.f2015g = null;
            this.f2016h = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2010b);
            parcel.writeInt(this.f2011c);
            parcel.writeInt(this.f2012d);
            if (this.f2012d > 0) {
                parcel.writeIntArray(this.f2013e);
            }
            parcel.writeInt(this.f2014f);
            if (this.f2014f > 0) {
                parcel.writeIntArray(this.f2015g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.f2016h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f2017a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f2018b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c  reason: collision with root package name */
        int f2019c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f2020d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f2021e;

        f(int i) {
            this.f2021e = i;
        }

        int a(int i) {
            int i2 = this.f2019c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2017a.size() == 0) {
                return i;
            }
            a();
            return this.f2019c;
        }

        int a(int i, int i2, boolean z) {
            return a(i, i2, false, false, z);
        }

        int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2017a.get(i);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d2 < b2 : d2 <= b2;
                if (!z3 ? a2 > f2 : a2 >= f2) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d2 >= f2 && a2 <= b2) {
                        }
                        return StaggeredGridLayoutManager.this.l(view);
                    } else if (d2 >= f2 && a2 <= b2) {
                        return StaggeredGridLayoutManager.this.l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2017a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2017a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2017a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2017a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        void a() {
            d.a c2;
            ArrayList<View> arrayList = this.f2017a;
            View view = arrayList.get(arrayList.size() - 1);
            c b2 = b(view);
            this.f2019c = StaggeredGridLayoutManager.this.u.a(view);
            if (!b2.f2003f || (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) == null || c2.f2007c != 1) {
                return;
            }
            this.f2019c += c2.a(this.f2021e);
        }

        void a(View view) {
            c b2 = b(view);
            b2.f2002e = this;
            this.f2017a.add(view);
            this.f2019c = RecyclerView.UNDEFINED_DURATION;
            if (this.f2017a.size() == 1) {
                this.f2018b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.f2020d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        void a(boolean z, int i) {
            int a2 = z ? a(RecyclerView.UNDEFINED_DURATION) : b(RecyclerView.UNDEFINED_DURATION);
            c();
            if (a2 == Integer.MIN_VALUE) {
                return;
            }
            if (z && a2 < StaggeredGridLayoutManager.this.u.b()) {
                return;
            }
            if (!z && a2 > StaggeredGridLayoutManager.this.u.f()) {
                return;
            }
            if (i != Integer.MIN_VALUE) {
                a2 += i;
            }
            this.f2019c = a2;
            this.f2018b = a2;
        }

        int b(int i) {
            int i2 = this.f2018b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2017a.size() == 0) {
                return i;
            }
            b();
            return this.f2018b;
        }

        c b(View view) {
            return (c) view.getLayoutParams();
        }

        void b() {
            d.a c2;
            View view = this.f2017a.get(0);
            c b2 = b(view);
            this.f2018b = StaggeredGridLayoutManager.this.u.d(view);
            if (!b2.f2003f || (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) == null || c2.f2007c != -1) {
                return;
            }
            this.f2018b -= c2.a(this.f2021e);
        }

        void c() {
            this.f2017a.clear();
            i();
            this.f2020d = 0;
        }

        void c(int i) {
            int i2 = this.f2018b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2018b = i2 + i;
            }
            int i3 = this.f2019c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2019c = i3 + i;
            }
        }

        void c(View view) {
            c b2 = b(view);
            b2.f2002e = this;
            this.f2017a.add(0, view);
            this.f2018b = RecyclerView.UNDEFINED_DURATION;
            if (this.f2017a.size() == 1) {
                this.f2019c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.f2020d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        public int d() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                i = this.f2017a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f2017a.size();
            }
            return a(i, size, true);
        }

        void d(int i) {
            this.f2018b = i;
            this.f2019c = i;
        }

        public int e() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.z) {
                size = 0;
                i = this.f2017a.size();
            } else {
                size = this.f2017a.size() - 1;
                i = -1;
            }
            return a(size, i, true);
        }

        public int f() {
            return this.f2020d;
        }

        int g() {
            int i = this.f2019c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            a();
            return this.f2019c;
        }

        int h() {
            int i = this.f2018b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            b();
            return this.f2018b;
        }

        void i() {
            this.f2018b = RecyclerView.UNDEFINED_DURATION;
            this.f2019c = RecyclerView.UNDEFINED_DURATION;
        }

        void j() {
            int size = this.f2017a.size();
            View remove = this.f2017a.remove(size - 1);
            c b2 = b(remove);
            b2.f2002e = null;
            if (b2.c() || b2.b()) {
                this.f2020d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.f2018b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f2019c = RecyclerView.UNDEFINED_DURATION;
        }

        void k() {
            View remove = this.f2017a.remove(0);
            c b2 = b(remove);
            b2.f2002e = null;
            if (this.f2017a.size() == 0) {
                this.f2019c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.f2020d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.f2018b = RecyclerView.UNDEFINED_DURATION;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i, i2);
        j(a2.f1955a);
        k(a2.f1956b);
        c(a2.f1957c);
        this.y = new g();
        N();
    }

    private void N() {
        this.u = k.a(this, this.w);
        this.v = k.a(this, 1 - this.w);
    }

    private void O() {
        if (this.v.d() == 1073741824) {
            return;
        }
        int e2 = e();
        float f2 = 0.0f;
        for (int i = 0; i < e2; i++) {
            View d2 = d(i);
            float b2 = this.v.b(d2);
            if (b2 >= f2) {
                if (((c) d2.getLayoutParams()).f()) {
                    b2 = (b2 * 1.0f) / this.s;
                }
                f2 = Math.max(f2, b2);
            }
        }
        int i2 = this.x;
        int round = Math.round(f2 * this.s);
        if (this.v.d() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.g());
        }
        l(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < e2; i3++) {
            View d3 = d(i3);
            c cVar = (c) d3.getLayoutParams();
            if (!cVar.f2003f) {
                if (!M() || this.w != 1) {
                    int i4 = cVar.f2002e.f2021e;
                    int i5 = this.w;
                    int i6 = (this.x * i4) - (i4 * i2);
                    if (i5 == 1) {
                        d3.offsetLeftAndRight(i6);
                    } else {
                        d3.offsetTopAndBottom(i6);
                    }
                } else {
                    int i7 = this.s;
                    int i8 = cVar.f2002e.f2021e;
                    d3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                }
            }
        }
    }

    private void P() {
        this.A = (this.w == 1 || !M()) ? this.z : !this.z;
    }

    private int a(RecyclerView.v vVar, g gVar, RecyclerView.a0 a0Var) {
        int i;
        f fVar;
        int b2;
        int i2;
        int i3;
        int b3;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int i4;
        int i5;
        boolean z = false;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = gVar.f2112e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = gVar.f2112e == 1 ? gVar.f2114g + gVar.f2109b : gVar.f2113f - gVar.f2109b;
        }
        e(gVar.f2112e, i);
        int b4 = this.A ? this.u.b() : this.u.f();
        boolean z2 = false;
        while (gVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View a2 = gVar.a(vVar);
            c cVar = (c) a2.getLayoutParams();
            int a3 = cVar.a();
            int d2 = this.E.d(a3);
            boolean z3 = d2 == -1;
            if (z3) {
                if (cVar.f2003f) {
                    f[] fVarArr = this.t;
                    char c2 = z ? 1 : 0;
                    char c3 = z ? 1 : 0;
                    fVar = fVarArr[c2];
                } else {
                    fVar = a(gVar);
                }
                this.E.a(a3, fVar);
            } else {
                fVar = this.t[d2];
            }
            f fVar2 = fVar;
            cVar.f2002e = fVar2;
            if (gVar.f2112e == 1) {
                b(a2);
            } else {
                int i6 = z ? 1 : 0;
                int i7 = z ? 1 : 0;
                b(a2, i6);
            }
            a(a2, cVar, z);
            if (gVar.f2112e == 1) {
                int s = cVar.f2003f ? s(b4) : fVar2.a(b4);
                int b5 = this.u.b(a2) + s;
                if (z3 && cVar.f2003f) {
                    d.a o = o(s);
                    o.f2007c = -1;
                    o.f2006b = a3;
                    this.E.a(o);
                }
                i2 = b5;
                b2 = s;
            } else {
                int v = cVar.f2003f ? v(b4) : fVar2.b(b4);
                b2 = v - this.u.b(a2);
                if (z3 && cVar.f2003f) {
                    d.a p = p(v);
                    p.f2007c = 1;
                    p.f2006b = a3;
                    this.E.a(p);
                }
                i2 = v;
            }
            if (cVar.f2003f && gVar.f2111d == -1) {
                if (!z3) {
                    if (!(gVar.f2112e == 1 ? E() : F())) {
                        d.a c4 = this.E.c(a3);
                        if (c4 != null) {
                            c4.f2009e = true;
                        }
                    }
                }
                this.M = true;
            }
            a(a2, cVar, gVar);
            if (!M() || this.w != 1) {
                int f2 = cVar.f2003f ? this.v.f() : (fVar2.f2021e * this.x) + this.v.f();
                i3 = f2;
                b3 = this.v.b(a2) + f2;
            } else {
                int b6 = cVar.f2003f ? this.v.b() : this.v.b() - (((this.s - 1) - fVar2.f2021e) * this.x);
                b3 = b6;
                i3 = b6 - this.v.b(a2);
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = a2;
                i4 = i3;
                i3 = b2;
                i5 = b3;
            } else {
                staggeredGridLayoutManager = this;
                view = a2;
                i4 = b2;
                i5 = i2;
                i2 = b3;
            }
            staggeredGridLayoutManager.a(view, i4, i3, i5, i2);
            if (cVar.f2003f) {
                e(this.y.f2112e, i);
            } else {
                a(fVar2, this.y.f2112e, i);
            }
            a(vVar, this.y);
            if (this.y.f2115h && a2.hasFocusable()) {
                if (cVar.f2003f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar2.f2021e, false);
                    z2 = true;
                    z = false;
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            a(vVar, this.y);
        }
        int f3 = this.y.f2112e == -1 ? this.u.f() - v(this.u.f()) : s(this.u.b()) - this.u.b();
        if (f3 > 0) {
            return Math.min(gVar.f2109b, f3);
        }
        return 0;
    }

    private f a(g gVar) {
        int i;
        int i2;
        int i3 = -1;
        if (w(gVar.f2112e)) {
            i = this.s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.s;
            i2 = 1;
        }
        f fVar = null;
        if (gVar.f2112e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f2 = this.u.f();
            while (i != i3) {
                f fVar2 = this.t[i];
                int a2 = fVar2.a(f2);
                if (a2 < i4) {
                    fVar = fVar2;
                    i4 = a2;
                }
                i += i2;
            }
            return fVar;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int b2 = this.u.b();
        while (i != i3) {
            f fVar3 = this.t[i];
            int b3 = fVar3.b(b2);
            if (b3 > i5) {
                fVar = fVar3;
                i5 = b3;
            }
            i += i2;
        }
        return fVar;
    }

    private void a(View view, int i, int i2, boolean z) {
        a(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int c2 = c(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int c3 = c(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? b(view, c2, c3, cVar) : a(view, c2, c3, cVar)) {
            view.measure(c2, c3);
        }
    }

    private void a(View view, c cVar, g gVar) {
        if (gVar.f2112e == 1) {
            if (cVar.f2003f) {
                p(view);
            } else {
                cVar.f2002e.a(view);
            }
        } else if (cVar.f2003f) {
            q(view);
        } else {
            cVar.f2002e.c(view);
        }
    }

    private void a(View view, c cVar, boolean z) {
        int a2;
        int a3;
        if (cVar.f2003f) {
            if (this.w != 1) {
                a(view, RecyclerView.o.a(r(), s(), o() + p(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            a2 = this.J;
        } else if (this.w != 1) {
            a2 = RecyclerView.o.a(r(), s(), o() + p(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            a3 = RecyclerView.o.a(this.x, i(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            a(view, a2, a3, z);
        } else {
            a2 = RecyclerView.o.a(this.x, s(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        a3 = RecyclerView.o.a(h(), i(), q() + n(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        a(view, a2, a3, z);
    }

    private void a(RecyclerView.v vVar, int i) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View d2 = d(e2);
            if (this.u.d(d2) < i || this.u.f(d2) < i) {
                return;
            }
            c cVar = (c) d2.getLayoutParams();
            if (cVar.f2003f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f2017a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].j();
                }
            } else if (cVar.f2002e.f2017a.size() == 1) {
                return;
            } else {
                cVar.f2002e.j();
            }
            a(d2, vVar);
        }
    }

    private void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int b2;
        int s = s(RecyclerView.UNDEFINED_DURATION);
        if (s != Integer.MIN_VALUE && (b2 = this.u.b() - s) > 0) {
            int i = b2 - (-c(-b2, vVar, a0Var));
            if (!z || i <= 0) {
                return;
            }
            this.u.a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r4.f2112e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.g r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2108a
            if (r0 == 0) goto L4d
            boolean r0 = r4.i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f2109b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f2112e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f2114g
        L14:
            r2.a(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f2113f
        L1a:
            r2.b(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f2112e
            if (r0 != r1) goto L37
            int r0 = r4.f2113f
            int r1 = r2.t(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f2114g
            int r4 = r4.f2109b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f2114g
            int r0 = r2.u(r0)
            int r1 = r4.f2114g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f2113f
            int r4 = r4.f2109b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.g):void");
    }

    private void a(b bVar) {
        boolean z;
        e eVar = this.I;
        int i = eVar.f2012d;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].c();
                    e eVar2 = this.I;
                    int i3 = eVar2.f2013e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.j ? this.u.b() : this.u.f();
                    }
                    this.t[i2].d(i3);
                }
            } else {
                eVar.k();
                e eVar3 = this.I;
                eVar3.f2010b = eVar3.f2011c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.k;
        c(eVar4.i);
        P();
        e eVar5 = this.I;
        int i4 = eVar5.f2010b;
        if (i4 != -1) {
            this.C = i4;
            z = eVar5.j;
        } else {
            z = this.A;
        }
        bVar.f1997c = z;
        e eVar6 = this.I;
        if (eVar6.f2014f > 1) {
            d dVar = this.E;
            dVar.f2004a = eVar6.f2015g;
            dVar.f2005b = eVar6.f2016h;
        }
    }

    private void a(f fVar, int i, int i2) {
        int f2 = fVar.f();
        if (i == -1) {
            if (fVar.h() + f2 > i2) {
                return;
            }
        } else if (fVar.g() - f2 < i2) {
            return;
        }
        this.B.set(fVar.f2021e, false);
    }

    private boolean a(f fVar) {
        if (this.A) {
            if (fVar.g() < this.u.b()) {
                ArrayList<View> arrayList = fVar.f2017a;
                return !fVar.b(arrayList.get(arrayList.size() - 1)).f2003f;
            }
        } else if (fVar.h() > this.u.f()) {
            return !fVar.b(fVar.f2017a.get(0)).f2003f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.J()
            goto Ld
        L9:
            int r0 = r6.I()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1d
        L16:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L1f
        L1b:
            int r2 = r7 + r8
        L1d:
            r3 = r2
            r2 = r7
        L1f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.e(r2)
            r4 = 1
            if (r9 == r4) goto L3e
            r5 = 2
            if (r9 == r5) goto L38
            if (r9 == r1) goto L2d
            goto L43
        L2d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a(r8, r4)
            goto L43
        L38:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r8)
            goto L43
        L3e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.a(r7, r8)
        L43:
            if (r3 > r0) goto L46
            return
        L46:
            boolean r7 = r6.A
            if (r7 == 0) goto L4f
            int r7 = r6.I()
            goto L53
        L4f:
            int r7 = r6.J()
        L53:
            if (r2 > r7) goto L58
            r6.z()
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.y
            r1 = 0
            r0.f2109b = r1
            r0.f2110c = r5
            boolean r0 = r4.x()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.b()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.k r5 = r4.u
            int r5 = r5.g()
            goto L2f
        L25:
            androidx.recyclerview.widget.k r5 = r4.u
            int r5 = r5.g()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.f()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.g r0 = r4.y
            androidx.recyclerview.widget.k r3 = r4.u
            int r3 = r3.f()
            int r3 = r3 - r6
            r0.f2113f = r3
            androidx.recyclerview.widget.g r6 = r4.y
            androidx.recyclerview.widget.k r0 = r4.u
            int r0 = r0.b()
            int r0 = r0 + r5
            r6.f2114g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.g r0 = r4.y
            androidx.recyclerview.widget.k r3 = r4.u
            int r3 = r3.a()
            int r3 = r3 + r5
            r0.f2114g = r3
            androidx.recyclerview.widget.g r5 = r4.y
            int r6 = -r6
            r5.f2113f = r6
        L5d:
            androidx.recyclerview.widget.g r5 = r4.y
            r5.f2115h = r1
            r5.f2108a = r2
            androidx.recyclerview.widget.k r6 = r4.u
            int r6 = r6.d()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.k r6 = r4.u
            int r6 = r6.a()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void b(RecyclerView.v vVar, int i) {
        while (e() > 0) {
            View d2 = d(0);
            if (this.u.a(d2) > i || this.u.e(d2) > i) {
                return;
            }
            c cVar = (c) d2.getLayoutParams();
            if (cVar.f2003f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f2017a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].k();
                }
            } else if (cVar.f2002e.f2017a.size() == 1) {
                return;
            } else {
                cVar.f2002e.k();
            }
            a(d2, vVar);
        }
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int f2;
        int v = v(Integer.MAX_VALUE);
        if (v != Integer.MAX_VALUE && (f2 = v - this.u.f()) > 0) {
            int c2 = f2 - c(f2, vVar, a0Var);
            if (!z || c2 <= 0) {
                return;
            }
            this.u.a(-c2);
        }
    }

    private int c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
        if (G() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean c(RecyclerView.a0 a0Var, b bVar) {
        boolean z = this.G;
        int a2 = a0Var.a();
        bVar.f1995a = z ? r(a2) : q(a2);
        bVar.f1996b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void e(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f2017a.isEmpty()) {
                a(this.t[i3], i, i2);
            }
        }
    }

    private int h(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return m.a(a0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int i(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return m.a(a0Var, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    private int j(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return m.b(a0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int m(int i) {
        if (e() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < I()) != this.A ? -1 : 1;
    }

    private int n(int i) {
        if (i == 1) {
            return (this.w != 1 && M()) ? 1 : -1;
        } else if (i == 2) {
            return (this.w != 1 && M()) ? -1 : 1;
        } else if (i == 17) {
            if (this.w != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 33) {
            if (this.w != 1) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 66) {
            if (this.w != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return 1;
        } else if (i != 130 || this.w != 1) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            return 1;
        }
    }

    private d.a o(int i) {
        d.a aVar = new d.a();
        aVar.f2008d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f2008d[i2] = i - this.t[i2].a(i);
        }
        return aVar;
    }

    private d.a p(int i) {
        d.a aVar = new d.a();
        aVar.f2008d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f2008d[i2] = this.t[i2].b(i) - i;
        }
        return aVar;
    }

    private void p(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private int q(int i) {
        int e2 = e();
        for (int i2 = 0; i2 < e2; i2++) {
            int l = l(d(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private void q(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].c(view);
        }
    }

    private int r(int i) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            int l = l(d(e2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private int s(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int t(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int u(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int v(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private boolean w(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == M();
    }

    private void x(int i) {
        g gVar = this.y;
        gVar.f2112e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        gVar.f2111d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean D() {
        return this.I == null;
    }

    boolean E() {
        int a2 = this.t[0].a(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].a(RecyclerView.UNDEFINED_DURATION) != a2) {
                return false;
            }
        }
        return true;
    }

    boolean F() {
        int b2 = this.t[0].b(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].b(RecyclerView.UNDEFINED_DURATION) != b2) {
                return false;
            }
        }
        return true;
    }

    boolean G() {
        int I;
        int J;
        if (e() == 0 || this.F == 0 || !u()) {
            return false;
        }
        if (this.A) {
            I = J();
            J = I();
        } else {
            I = I();
            J = J();
        }
        if (I == 0 && K() != null) {
            this.E.a();
        } else if (!this.M) {
            return false;
        } else {
            int i = this.A ? -1 : 1;
            int i2 = J + 1;
            d.a a2 = this.E.a(I, i2, i, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i2);
                return false;
            }
            d.a a3 = this.E.a(I, a2.f2006b, i * (-1), true);
            if (a3 == null) {
                this.E.b(a2.f2006b);
            } else {
                this.E.b(a3.f2006b + 1);
            }
        }
        A();
        z();
        return true;
    }

    int H() {
        View a2 = this.A ? a(true) : b(true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    int I() {
        if (e() == 0) {
            return 0;
        }
        return l(d(0));
    }

    int J() {
        int e2 = e();
        if (e2 == 0) {
            return 0;
        }
        return l(d(e2 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View K() {
        /*
            r12 = this;
            int r0 = r12.e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.M()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.d(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2002e
            int r9 = r9.f2021e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2002e
            boolean r9 = r12.a(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2002e
            int r9 = r9.f2021e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f2003f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.d(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.k r10 = r12.u
            int r10 = r10.a(r7)
            androidx.recyclerview.widget.k r11 = r12.u
            int r11 = r11.a(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.k r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.k r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2002e
            int r8 = r8.f2021e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2002e
            int r9 = r9.f2021e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K():android.view.View");
    }

    public void L() {
        this.E.a();
        z();
    }

    boolean M() {
        return k() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 1 ? this.s : super.a(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int m = m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = m;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View c2;
        View a2;
        if (e() == 0 || (c2 = c(view)) == null) {
            return null;
        }
        P();
        int n = n(i);
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) c2.getLayoutParams();
        boolean z = cVar.f2003f;
        f fVar = cVar.f2002e;
        int J = n == 1 ? J() : I();
        b(J, a0Var);
        x(n);
        g gVar = this.y;
        gVar.f2110c = gVar.f2111d + J;
        gVar.f2109b = (int) (this.u.g() * 0.33333334f);
        g gVar2 = this.y;
        gVar2.f2115h = true;
        gVar2.f2108a = false;
        a(vVar, gVar2, a0Var);
        this.G = this.A;
        if (!z && (a2 = fVar.a(J, n)) != null && a2 != c2) {
            return a2;
        }
        if (w(n)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View a3 = this.t[i2].a(J, n);
                if (a3 != null && a3 != c2) {
                    return a3;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View a4 = this.t[i3].a(J, n);
                if (a4 != null && a4 != c2) {
                    return a4;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (n == -1);
        if (!z) {
            View c3 = c(z2 ? fVar.d() : fVar.e());
            if (c3 != null && c3 != c2) {
                return c3;
            }
        }
        if (w(n)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f2021e) {
                    f[] fVarArr = this.t;
                    View c4 = c(z2 ? fVarArr[i4].d() : fVarArr[i4].e());
                    if (c4 != null && c4 != c2) {
                        return c4;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                f[] fVarArr2 = this.t;
                View c5 = c(z2 ? fVarArr2[i5].d() : fVarArr2[i5].e());
                if (c5 != null && c5 != c2) {
                    return c5;
                }
            }
        }
        return null;
    }

    View a(boolean z) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View d2 = d(e2);
            int d3 = this.u.d(d2);
            int a2 = this.u.a(d2);
            if (a2 > f2 && d3 < b2) {
                if (a2 <= b2 || !z) {
                    return d2;
                }
                if (view == null) {
                    view = d2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int a2;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (e() == 0 || i == 0) {
            return;
        }
        a(i, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            g gVar = this.y;
            if (gVar.f2111d == -1) {
                a2 = gVar.f2113f;
                i3 = this.t[i5].b(a2);
            } else {
                a2 = this.t[i5].a(gVar.f2114g);
                i3 = this.y.f2114g;
            }
            int i6 = a2 - i3;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(a0Var); i7++) {
            cVar.a(this.y.f2110c, this.O[i7]);
            g gVar2 = this.y;
            gVar2.f2110c += gVar2.f2111d;
        }
    }

    void a(int i, RecyclerView.a0 a0Var) {
        int I;
        int i2;
        if (i > 0) {
            I = J();
            i2 = 1;
        } else {
            I = I();
            i2 = -1;
        }
        this.y.f2108a = true;
        b(I, a0Var);
        x(i2);
        g gVar = this.y;
        gVar.f2110c = I + gVar.f2111d;
        gVar.f2109b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Rect rect, int i, int i2) {
        int a2;
        int a3;
        int o = o() + p();
        int q = q() + n();
        if (this.w == 1) {
            a3 = RecyclerView.o.a(i2, rect.height() + q, l());
            a2 = RecyclerView.o.a(i, (this.x * this.s) + o, m());
        } else {
            a2 = RecyclerView.o.a(i, rect.width() + o, m());
            a3 = RecyclerView.o.a(i2, (this.x * this.s) + q, l());
        }
        c(a2, a3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 == null || a2 == null) {
                return;
            }
            int l = l(b2);
            int l2 = l(a2);
            if (l < l2) {
                accessibilityEvent.setFromIndex(l);
                accessibilityEvent.setToIndex(l2);
                return;
            }
            accessibilityEvent.setFromIndex(l2);
            accessibilityEvent.setToIndex(l);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, a.g.m.e0.c cVar) {
        int i;
        int i2;
        int e2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.a(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.w == 0) {
            i = cVar2.e();
            i2 = cVar2.f2003f ? this.s : 1;
            e2 = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            e2 = cVar2.e();
            i3 = cVar2.f2003f ? this.s : 1;
        }
        cVar.b(c.C0015c.a(i, i2, e2, i3, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2) {
        b(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        b(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        b(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        h hVar = new h(recyclerView.getContext());
        hVar.c(i);
        b(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(String str) {
        if (this.I == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a() {
        return this.w == 0;
    }

    boolean a(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int f2;
        int d2;
        boolean z = false;
        if (!a0Var.d() && (i = this.C) != -1) {
            if (i >= 0 && i < a0Var.a()) {
                e eVar = this.I;
                if (eVar == null || eVar.f2010b == -1 || eVar.f2012d < 1) {
                    View c2 = c(this.C);
                    if (c2 != null) {
                        bVar.f1995a = this.A ? J() : I();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f1997c) {
                                f2 = this.u.b() - this.D;
                                d2 = this.u.a(c2);
                            } else {
                                f2 = this.u.f() + this.D;
                                d2 = this.u.d(c2);
                            }
                            bVar.f1996b = f2 - d2;
                            return true;
                        } else if (this.u.b(c2) > this.u.g()) {
                            bVar.f1996b = bVar.f1997c ? this.u.b() : this.u.f();
                            return true;
                        } else {
                            int d3 = this.u.d(c2) - this.u.f();
                            if (d3 < 0) {
                                bVar.f1996b = -d3;
                                return true;
                            }
                            int b2 = this.u.b() - this.u.a(c2);
                            if (b2 < 0) {
                                bVar.f1996b = b2;
                                return true;
                            }
                            bVar.f1996b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        bVar.f1995a = this.C;
                        int i2 = this.D;
                        if (i2 == Integer.MIN_VALUE) {
                            if (m(bVar.f1995a) == 1) {
                                z = true;
                            }
                            bVar.f1997c = z;
                            bVar.a();
                        } else {
                            bVar.a(i2);
                        }
                        bVar.f1998d = true;
                    }
                } else {
                    bVar.f1996b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f1995a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 0 ? this.s : super.b(vVar, a0Var);
    }

    View b(boolean z) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int e2 = e();
        View view = null;
        for (int i = 0; i < e2; i++) {
            View d2 = d(i);
            int d3 = this.u.d(d2);
            if (this.u.a(d2) > f2 && d3 < b2) {
                if (d3 >= f2 || !z) {
                    return d2;
                }
                if (view == null) {
                    view = d2;
                }
            }
        }
        return view;
    }

    void b(RecyclerView.a0 a0Var, b bVar) {
        if (!a(a0Var, bVar) && !c(a0Var, bVar)) {
            bVar.a();
            bVar.f1995a = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, int i, int i2) {
        b(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.b(recyclerView, vVar);
        a(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b() {
        return this.w == 1;
    }

    int c(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        a(i, a0Var);
        int a2 = a(vVar, this.y, a0Var);
        if (this.y.f2109b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.u.a(-i);
        this.G = this.A;
        g gVar = this.y;
        gVar.f2109b = 0;
        a(vVar, gVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int c(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void c(boolean z) {
        a((String) null);
        e eVar = this.I;
        if (eVar != null && eVar.i != z) {
            eVar.i = z;
        }
        this.z = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int d(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d(RecyclerView recyclerView) {
        this.E.a();
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int e(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(int i) {
        super.e(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        c(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int f(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(int i) {
        super.f(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(int i) {
        if (i == 0) {
            G();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(RecyclerView.a0 a0Var) {
        super.g(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.f2010b != i) {
            eVar.j();
        }
        this.C = i;
        this.D = RecyclerView.UNDEFINED_DURATION;
        z();
    }

    public void j(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i == this.w) {
                return;
            }
            this.w = i;
            k kVar = this.u;
            this.u = this.v;
            this.v = kVar;
            z();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void k(int i) {
        a((String) null);
        if (i != this.s) {
            L();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            z();
        }
    }

    void l(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable y() {
        int b2;
        int f2;
        int[] iArr;
        e eVar = this.I;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.i = this.z;
        eVar2.j = this.G;
        eVar2.k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f2004a) == null) {
            eVar2.f2014f = 0;
        } else {
            eVar2.f2015g = iArr;
            eVar2.f2014f = eVar2.f2015g.length;
            eVar2.f2016h = dVar.f2005b;
        }
        if (e() > 0) {
            eVar2.f2010b = this.G ? J() : I();
            eVar2.f2011c = H();
            int i = this.s;
            eVar2.f2012d = i;
            eVar2.f2013e = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    b2 = this.t[i2].a(RecyclerView.UNDEFINED_DURATION);
                    if (b2 != Integer.MIN_VALUE) {
                        f2 = this.u.b();
                        b2 -= f2;
                        eVar2.f2013e[i2] = b2;
                    } else {
                        eVar2.f2013e[i2] = b2;
                    }
                } else {
                    b2 = this.t[i2].b(RecyclerView.UNDEFINED_DURATION);
                    if (b2 != Integer.MIN_VALUE) {
                        f2 = this.u.f();
                        b2 -= f2;
                        eVar2.f2013e[i2] = b2;
                    } else {
                        eVar2.f2013e[i2] = b2;
                    }
                }
            }
        } else {
            eVar2.f2010b = -1;
            eVar2.f2011c = -1;
            eVar2.f2012d = 0;
        }
        return eVar2;
    }
}
