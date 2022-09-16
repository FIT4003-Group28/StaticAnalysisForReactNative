package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationOptions extends AbstractSafeParcelable {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final qna G;
    private final int[] H;
    public final List c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;
    public static final List a = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] b = {0, 1};
    public static final Parcelable.Creator CREATOR = new qnn();

    public NotificationOptions(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        qna qmzVar;
        this.c = new ArrayList(list);
        this.H = Arrays.copyOf(iArr, iArr.length);
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        if (iBinder == null) {
            this.G = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof qna) {
            qmzVar = (qna) queryLocalInterface;
        } else {
            qmzVar = new qmz(iBinder);
        }
        this.G = qmzVar;
    }

    public final int[] a() {
        int[] iArr = this.H;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.H(parcel, 2, this.c);
        tqj.z(parcel, 3, a());
        tqj.t(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.s(parcel, 6, this.f);
        tqj.s(parcel, 7, this.g);
        tqj.s(parcel, 8, this.h);
        tqj.s(parcel, 9, this.i);
        tqj.s(parcel, 10, this.j);
        tqj.s(parcel, 11, this.k);
        tqj.s(parcel, 12, this.l);
        tqj.s(parcel, 13, this.m);
        tqj.s(parcel, 14, this.n);
        tqj.s(parcel, 15, this.o);
        tqj.s(parcel, 16, this.p);
        tqj.s(parcel, 17, this.q);
        tqj.s(parcel, 18, this.r);
        tqj.s(parcel, 19, this.s);
        tqj.s(parcel, 20, this.t);
        tqj.s(parcel, 21, this.u);
        tqj.s(parcel, 22, this.v);
        tqj.s(parcel, 23, this.w);
        tqj.s(parcel, 24, this.x);
        tqj.s(parcel, 25, this.y);
        tqj.s(parcel, 26, this.z);
        tqj.s(parcel, 27, this.A);
        tqj.s(parcel, 28, this.B);
        tqj.s(parcel, 29, this.C);
        tqj.s(parcel, 30, this.D);
        tqj.s(parcel, 31, this.E);
        tqj.s(parcel, 32, this.F);
        qna qnaVar = this.G;
        tqj.y(parcel, 33, qnaVar == null ? null : qnaVar.asBinder());
        tqj.n(parcel, m);
    }
}
