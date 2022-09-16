package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: dq  reason: default package */
/* loaded from: classes6.dex */
public final class dq extends ViewGroup.MarginLayoutParams {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public ed X;
    public int a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public float z;

    public dq() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new ed();
    }

    public final void a() {
        this.P = false;
        this.M = true;
        this.N = true;
        if (this.width == 0 || this.width == -1) {
            this.M = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.N = false;
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.P = true;
        this.M = true;
        this.N = true;
        if (!(this.X instanceof ef)) {
            this.X = new ef();
        }
        ((ef) this.X).A(this.L);
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.S = -1;
        this.T = -1;
        this.Q = -1;
        this.R = -1;
        this.U = this.q;
        this.V = this.s;
        this.W = this.w;
        if (getLayoutDirection() == 1) {
            int i2 = this.m;
            if (i2 != -1) {
                this.S = i2;
            } else {
                int i3 = this.n;
                if (i3 != -1) {
                    this.T = i3;
                }
            }
            int i4 = this.o;
            if (i4 != -1) {
                this.R = i4;
            }
            int i5 = this.p;
            if (i5 != -1) {
                this.Q = i5;
            }
            int i6 = this.u;
            if (i6 != -1) {
                this.V = i6;
            }
            int i7 = this.v;
            if (i7 != -1) {
                this.U = i7;
            }
            this.W = 1.0f - this.w;
        } else {
            int i8 = this.m;
            if (i8 != -1) {
                this.R = i8;
            }
            int i9 = this.n;
            if (i9 != -1) {
                this.Q = i9;
            }
            int i10 = this.o;
            if (i10 != -1) {
                this.S = i10;
            }
            int i11 = this.p;
            if (i11 != -1) {
                this.T = i11;
            }
            int i12 = this.u;
            if (i12 != -1) {
                this.U = i12;
            }
            int i13 = this.v;
            if (i13 != -1) {
                this.V = i13;
            }
        }
        if (this.o == -1 && this.p == -1) {
            int i14 = this.f;
            if (i14 != -1) {
                this.S = i14;
            } else {
                int i15 = this.g;
                if (i15 != -1) {
                    this.T = i15;
                }
            }
        }
        if (this.n == -1 && this.m == -1) {
            int i16 = this.d;
            if (i16 != -1) {
                this.Q = i16;
                return;
            }
            int i17 = this.e;
            if (i17 == -1) {
                return;
            }
            this.R = i17;
        }
    }

    public dq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new ed();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dt.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 63) {
                int resourceId = obtainStyledAttributes.getResourceId(63, this.d);
                this.d = resourceId;
                if (resourceId == -1) {
                    this.d = obtainStyledAttributes.getInt(63, -1);
                }
            } else if (index == 64) {
                int resourceId2 = obtainStyledAttributes.getResourceId(64, this.e);
                this.e = resourceId2;
                if (resourceId2 == -1) {
                    this.e = obtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 66) {
                int resourceId3 = obtainStyledAttributes.getResourceId(66, this.f);
                this.f = resourceId3;
                if (resourceId3 == -1) {
                    this.f = obtainStyledAttributes.getInt(66, -1);
                }
            } else if (index == 67) {
                int resourceId4 = obtainStyledAttributes.getResourceId(67, this.g);
                this.g = resourceId4;
                if (resourceId4 == -1) {
                    this.g = obtainStyledAttributes.getInt(67, -1);
                }
            } else if (index == 73) {
                int resourceId5 = obtainStyledAttributes.getResourceId(73, this.h);
                this.h = resourceId5;
                if (resourceId5 == -1) {
                    this.h = obtainStyledAttributes.getInt(73, -1);
                }
            } else if (index == 72) {
                int resourceId6 = obtainStyledAttributes.getResourceId(72, this.i);
                this.i = resourceId6;
                if (resourceId6 == -1) {
                    this.i = obtainStyledAttributes.getInt(72, -1);
                }
            } else if (index == 45) {
                int resourceId7 = obtainStyledAttributes.getResourceId(45, this.j);
                this.j = resourceId7;
                if (resourceId7 == -1) {
                    this.j = obtainStyledAttributes.getInt(45, -1);
                }
            } else if (index == 44) {
                int resourceId8 = obtainStyledAttributes.getResourceId(44, this.k);
                this.k = resourceId8;
                if (resourceId8 == -1) {
                    this.k = obtainStyledAttributes.getInt(44, -1);
                }
            } else if (index == 42) {
                int resourceId9 = obtainStyledAttributes.getResourceId(42, this.l);
                this.l = resourceId9;
                if (resourceId9 == -1) {
                    this.l = obtainStyledAttributes.getInt(42, -1);
                }
            } else if (index == 81) {
                this.J = obtainStyledAttributes.getDimensionPixelOffset(81, this.J);
            } else if (index == 82) {
                this.K = obtainStyledAttributes.getDimensionPixelOffset(82, this.K);
            } else if (index == 52) {
                this.a = obtainStyledAttributes.getDimensionPixelOffset(52, this.a);
            } else if (index == 53) {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(53, this.b);
            } else if (index == 54) {
                this.c = obtainStyledAttributes.getFloat(54, this.c);
            } else if (index == 0) {
                this.L = obtainStyledAttributes.getInt(0, this.L);
            } else if (index == 68) {
                int resourceId10 = obtainStyledAttributes.getResourceId(68, this.m);
                this.m = resourceId10;
                if (resourceId10 == -1) {
                    this.m = obtainStyledAttributes.getInt(68, -1);
                }
            } else if (index == 69) {
                int resourceId11 = obtainStyledAttributes.getResourceId(69, this.n);
                this.n = resourceId11;
                if (resourceId11 == -1) {
                    this.n = obtainStyledAttributes.getInt(69, -1);
                }
            } else if (index == 51) {
                int resourceId12 = obtainStyledAttributes.getResourceId(51, this.o);
                this.o = resourceId12;
                if (resourceId12 == -1) {
                    this.o = obtainStyledAttributes.getInt(51, -1);
                }
            } else if (index == 50) {
                int resourceId13 = obtainStyledAttributes.getResourceId(50, this.p);
                this.p = resourceId13;
                if (resourceId13 == -1) {
                    this.p = obtainStyledAttributes.getInt(50, -1);
                }
            } else if (index == 85) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(85, this.q);
            } else if (index == 88) {
                this.r = obtainStyledAttributes.getDimensionPixelSize(88, this.r);
            } else if (index == 86) {
                this.s = obtainStyledAttributes.getDimensionPixelSize(86, this.s);
            } else if (index == 83) {
                this.t = obtainStyledAttributes.getDimensionPixelSize(83, this.t);
            } else if (index == 87) {
                this.u = obtainStyledAttributes.getDimensionPixelSize(87, this.u);
            } else if (index == 84) {
                this.v = obtainStyledAttributes.getDimensionPixelSize(84, this.v);
            } else if (index == 59) {
                this.w = obtainStyledAttributes.getFloat(59, this.w);
            } else if (index == 74) {
                this.x = obtainStyledAttributes.getFloat(74, this.x);
            } else if (index == 49) {
                this.y = obtainStyledAttributes.getString(49);
            } else if (index == 61) {
                this.z = obtainStyledAttributes.getFloat(61, 0.0f);
            } else if (index == 76) {
                this.A = obtainStyledAttributes.getFloat(76, 0.0f);
            } else if (index == 60) {
                this.B = obtainStyledAttributes.getInt(60, 0);
            } else if (index == 75) {
                this.C = obtainStyledAttributes.getInt(75, 0);
            } else if (index == 77) {
                this.D = obtainStyledAttributes.getInt(77, 0);
            } else if (index == 55) {
                this.E = obtainStyledAttributes.getInt(55, 0);
            } else if (index == 79) {
                this.F = obtainStyledAttributes.getDimensionPixelSize(79, this.F);
            } else if (index == 78) {
                this.H = obtainStyledAttributes.getDimensionPixelSize(78, this.H);
            } else if (index == 57) {
                this.G = obtainStyledAttributes.getDimensionPixelSize(57, this.G);
            } else if (index == 56) {
                this.I = obtainStyledAttributes.getDimensionPixelSize(56, this.I);
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public dq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new ed();
    }
}
