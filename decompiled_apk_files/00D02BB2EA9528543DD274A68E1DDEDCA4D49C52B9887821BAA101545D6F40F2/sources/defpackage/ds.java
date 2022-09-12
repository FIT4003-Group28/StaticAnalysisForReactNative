package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.filament.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: ds  reason: default package */
/* loaded from: classes6.dex */
public final class ds {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap<Integer, dr> a = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = dt.a;
        sparseIntArray.append(79, 25);
        sparseIntArray.append(80, 26);
        sparseIntArray.append(82, 29);
        sparseIntArray.append(83, 30);
        sparseIntArray.append(89, 36);
        sparseIntArray.append(88, 35);
        sparseIntArray.append(61, 4);
        sparseIntArray.append(60, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(97, 6);
        sparseIntArray.append(98, 7);
        sparseIntArray.append(68, 17);
        sparseIntArray.append(69, 18);
        sparseIntArray.append(70, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(84, 32);
        sparseIntArray.append(85, 33);
        sparseIntArray.append(67, 10);
        sparseIntArray.append(66, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 13);
        sparseIntArray.append(104, 16);
        sparseIntArray.append(102, 14);
        sparseIntArray.append(99, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 15);
        sparseIntArray.append(100, 12);
        sparseIntArray.append(92, 40);
        sparseIntArray.append(77, 39);
        sparseIntArray.append(76, 41);
        sparseIntArray.append(91, 42);
        sparseIntArray.append(75, 20);
        sparseIntArray.append(90, 37);
        sparseIntArray.append(65, 5);
        sparseIntArray.append(78, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(81, 60);
        sparseIntArray.append(59, 60);
        sparseIntArray.append(57, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(93, 54);
        sparseIntArray.append(71, 55);
        sparseIntArray.append(94, 56);
        sparseIntArray.append(72, 57);
        sparseIntArray.append(95, 58);
        sparseIntArray.append(73, 59);
        sparseIntArray.append(1, 38);
    }

    private static int p(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String q(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(Context context, int i) {
        c((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void b(ds dsVar) {
        this.a.clear();
        for (Integer num : dsVar.a.keySet()) {
            this.a.put(num, dsVar.a.get(num).clone());
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            dq dqVar = (dq) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap<Integer, dr> hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.a.put(valueOf, new dr());
            }
            dr drVar = this.a.get(valueOf);
            drVar.d = id;
            drVar.h = dqVar.d;
            drVar.i = dqVar.e;
            drVar.j = dqVar.f;
            drVar.k = dqVar.g;
            drVar.l = dqVar.h;
            drVar.m = dqVar.i;
            drVar.n = dqVar.j;
            drVar.o = dqVar.k;
            drVar.p = dqVar.l;
            drVar.q = dqVar.m;
            drVar.r = dqVar.n;
            drVar.s = dqVar.o;
            drVar.t = dqVar.p;
            drVar.u = dqVar.w;
            drVar.v = dqVar.x;
            drVar.w = dqVar.y;
            drVar.x = dqVar.J;
            drVar.y = dqVar.K;
            drVar.z = dqVar.L;
            drVar.g = dqVar.c;
            drVar.e = dqVar.a;
            drVar.f = dqVar.b;
            drVar.b = dqVar.width;
            drVar.c = dqVar.height;
            drVar.A = dqVar.leftMargin;
            drVar.B = dqVar.rightMargin;
            drVar.C = dqVar.topMargin;
            drVar.D = dqVar.bottomMargin;
            drVar.N = dqVar.A;
            drVar.O = dqVar.z;
            drVar.Q = dqVar.C;
            drVar.P = dqVar.B;
            drVar.ad = dqVar.D;
            drVar.ae = dqVar.E;
            drVar.af = dqVar.H;
            drVar.ag = dqVar.I;
            drVar.ah = dqVar.F;
            drVar.ai = dqVar.G;
            drVar.E = dqVar.getMarginEnd();
            drVar.F = dqVar.getMarginStart();
            drVar.G = childAt.getVisibility();
            drVar.R = childAt.getAlpha();
            drVar.U = childAt.getRotationX();
            drVar.V = childAt.getRotationY();
            drVar.W = childAt.getScaleX();
            drVar.X = childAt.getScaleY();
            drVar.Y = childAt.getPivotX();
            drVar.Z = childAt.getPivotY();
            drVar.aa = childAt.getTranslationX();
            drVar.ab = childAt.getTranslationY();
            drVar.ac = childAt.getTranslationZ();
            if (drVar.S) {
                drVar.T = childAt.getElevation();
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        e(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap<Integer, dr> hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                dr drVar = this.a.get(valueOf);
                dq dqVar = (dq) childAt.getLayoutParams();
                drVar.b(dqVar);
                childAt.setLayoutParams(dqVar);
                childAt.setVisibility(drVar.G);
                childAt.setAlpha(drVar.R);
                childAt.setRotationX(drVar.U);
                childAt.setRotationY(drVar.V);
                childAt.setScaleX(drVar.W);
                childAt.setScaleY(drVar.X);
                childAt.setPivotX(drVar.Y);
                childAt.setPivotY(drVar.Z);
                childAt.setTranslationX(drVar.aa);
                childAt.setTranslationY(drVar.ab);
                childAt.setTranslationZ(drVar.ac);
                if (drVar.S) {
                    childAt.setElevation(drVar.T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            dr drVar2 = this.a.get(num);
            if (drVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                dq b2 = ConstraintLayout.b();
                drVar2.b(b2);
                constraintLayout.addView(guideline, b2);
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        HashMap<Integer, dr> hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new dr());
        }
        dr drVar = this.a.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    drVar.h = i3;
                    drVar.i = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("Left to " + q(i4) + " undefined");
                } else {
                    drVar.i = i3;
                    drVar.h = -1;
                }
                drVar.A = i5;
                return;
            case 2:
                if (i4 == 1) {
                    drVar.j = i3;
                    drVar.k = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                } else {
                    drVar.k = i3;
                    drVar.j = -1;
                }
                drVar.B = i5;
                return;
            case 3:
                if (i4 == 3) {
                    drVar.l = i3;
                    drVar.m = -1;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                } else {
                    drVar.m = i3;
                    drVar.l = -1;
                }
                drVar.p = -1;
                drVar.C = i5;
                return;
            case 4:
                if (i4 == 4) {
                    drVar.o = i3;
                    drVar.n = -1;
                } else if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                } else {
                    drVar.n = i3;
                    drVar.o = -1;
                }
                drVar.p = -1;
                drVar.D = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                drVar.p = i3;
                drVar.o = -1;
                drVar.n = -1;
                drVar.l = -1;
                drVar.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    drVar.r = i3;
                    drVar.q = -1;
                } else if (i4 != 7) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                } else {
                    drVar.q = i3;
                    drVar.r = -1;
                }
                drVar.F = i5;
                return;
            case 7:
                if (i4 == 7) {
                    drVar.t = i3;
                    drVar.s = -1;
                } else if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                } else {
                    drVar.s = i3;
                    drVar.t = -1;
                }
                drVar.E = i5;
                return;
            default:
                throw new IllegalArgumentException(q(i2) + " to " + q(i4) + " unknown");
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        HashMap<Integer, dr> hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new dr());
        }
        dr drVar = this.a.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    drVar.h = i3;
                    drVar.i = -1;
                    return;
                } else if (i4 == 2) {
                    drVar.i = i3;
                    drVar.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + q(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    drVar.j = i3;
                    drVar.k = -1;
                    return;
                } else if (i4 == 2) {
                    drVar.k = i3;
                    drVar.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    drVar.l = i3;
                    drVar.m = -1;
                    drVar.p = -1;
                    return;
                } else if (i4 == 4) {
                    drVar.m = i3;
                    drVar.l = -1;
                    drVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    drVar.o = i3;
                    drVar.n = -1;
                    drVar.p = -1;
                    return;
                } else if (i4 == 3) {
                    drVar.n = i3;
                    drVar.o = -1;
                    drVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                drVar.p = i3;
                drVar.o = -1;
                drVar.n = -1;
                drVar.l = -1;
                drVar.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    drVar.r = i3;
                    drVar.q = -1;
                    return;
                } else if (i4 == 7) {
                    drVar.q = i3;
                    drVar.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    drVar.t = i3;
                    drVar.s = -1;
                    return;
                } else if (i4 == 6) {
                    drVar.s = i3;
                    drVar.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(q(i2) + " to " + q(i4) + " unknown");
        }
    }

    public final void h(int i, int i2, int i3) {
        dr n = n(i);
        switch (i2) {
            case 1:
                n.A = i3;
                return;
            case 2:
                n.B = i3;
                return;
            case 3:
                n.C = i3;
                return;
            case 4:
                n.D = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                n.F = i3;
                return;
            case 7:
                n.E = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void i(int i, float f) {
        n(i).u = f;
    }

    public final void j(int i, float f) {
        n(i).v = f;
    }

    public final void k(int i, int i2) {
        n(i).G = i2;
    }

    public final void l(int i, int i2) {
        n(i).c = i2;
    }

    public final void m(int i, int i2) {
        n(i).b = i2;
    }

    public final dr n(int i) {
        HashMap<Integer, dr> hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new dr());
        }
        return this.a.get(valueOf);
    }

    public final void o(Context context, int i) {
        SparseIntArray sparseIntArray;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    dr drVar = new dr();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, dt.b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        int i3 = c.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    drVar.p = p(obtainStyledAttributes, index, drVar.p);
                                    break;
                                case 2:
                                    drVar.D = obtainStyledAttributes.getDimensionPixelSize(index, drVar.D);
                                    break;
                                case 3:
                                    drVar.o = p(obtainStyledAttributes, index, drVar.o);
                                    break;
                                case 4:
                                    drVar.n = p(obtainStyledAttributes, index, drVar.n);
                                    break;
                                case 5:
                                    drVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    drVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, drVar.x);
                                    break;
                                case 7:
                                    drVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, drVar.y);
                                    break;
                                case 8:
                                    drVar.E = obtainStyledAttributes.getDimensionPixelSize(index, drVar.E);
                                    break;
                                case 9:
                                    drVar.n = p(obtainStyledAttributes, index, drVar.t);
                                    break;
                                case 10:
                                    drVar.s = p(obtainStyledAttributes, index, drVar.s);
                                    break;
                                case 11:
                                    drVar.K = obtainStyledAttributes.getDimensionPixelSize(index, drVar.K);
                                    break;
                                case 12:
                                    drVar.L = obtainStyledAttributes.getDimensionPixelSize(index, drVar.L);
                                    break;
                                case 13:
                                    drVar.H = obtainStyledAttributes.getDimensionPixelSize(index, drVar.H);
                                    break;
                                case 14:
                                    drVar.J = obtainStyledAttributes.getDimensionPixelSize(index, drVar.J);
                                    break;
                                case 15:
                                    drVar.M = obtainStyledAttributes.getDimensionPixelSize(index, drVar.M);
                                    break;
                                case 16:
                                    drVar.I = obtainStyledAttributes.getDimensionPixelSize(index, drVar.I);
                                    break;
                                case 17:
                                    drVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, drVar.e);
                                    break;
                                case 18:
                                    drVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, drVar.f);
                                    break;
                                case 19:
                                    drVar.g = obtainStyledAttributes.getFloat(index, drVar.g);
                                    break;
                                case 20:
                                    drVar.u = obtainStyledAttributes.getFloat(index, drVar.u);
                                    break;
                                case 21:
                                    drVar.c = obtainStyledAttributes.getLayoutDimension(index, drVar.c);
                                    break;
                                case 22:
                                    drVar.G = obtainStyledAttributes.getInt(index, drVar.G);
                                    drVar.G = b[drVar.G];
                                    break;
                                case 23:
                                    drVar.b = obtainStyledAttributes.getLayoutDimension(index, drVar.b);
                                    break;
                                case 24:
                                    drVar.A = obtainStyledAttributes.getDimensionPixelSize(index, drVar.A);
                                    break;
                                case 25:
                                    drVar.h = p(obtainStyledAttributes, index, drVar.h);
                                    break;
                                case 26:
                                    drVar.i = p(obtainStyledAttributes, index, drVar.i);
                                    break;
                                case 27:
                                    drVar.z = obtainStyledAttributes.getInt(index, drVar.z);
                                    break;
                                case 28:
                                    drVar.B = obtainStyledAttributes.getDimensionPixelSize(index, drVar.B);
                                    break;
                                case 29:
                                    drVar.j = p(obtainStyledAttributes, index, drVar.j);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    drVar.k = p(obtainStyledAttributes, index, drVar.k);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    drVar.F = obtainStyledAttributes.getDimensionPixelSize(index, drVar.F);
                                    break;
                                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                    drVar.q = p(obtainStyledAttributes, index, drVar.q);
                                    break;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    drVar.r = p(obtainStyledAttributes, index, drVar.r);
                                    break;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    drVar.C = obtainStyledAttributes.getDimensionPixelSize(index, drVar.C);
                                    break;
                                case 35:
                                    drVar.m = p(obtainStyledAttributes, index, drVar.m);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    drVar.l = p(obtainStyledAttributes, index, drVar.l);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    drVar.v = obtainStyledAttributes.getFloat(index, drVar.v);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    drVar.d = obtainStyledAttributes.getResourceId(index, drVar.d);
                                    break;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    drVar.O = obtainStyledAttributes.getFloat(index, drVar.O);
                                    break;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    drVar.N = obtainStyledAttributes.getFloat(index, drVar.N);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    drVar.P = obtainStyledAttributes.getInt(index, drVar.P);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    drVar.Q = obtainStyledAttributes.getInt(index, drVar.Q);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    drVar.R = obtainStyledAttributes.getFloat(index, drVar.R);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    drVar.S = true;
                                    drVar.T = obtainStyledAttributes.getFloat(index, drVar.T);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    drVar.U = obtainStyledAttributes.getFloat(index, drVar.U);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    drVar.V = obtainStyledAttributes.getFloat(index, drVar.V);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    drVar.W = obtainStyledAttributes.getFloat(index, drVar.W);
                                    break;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    drVar.X = obtainStyledAttributes.getFloat(index, drVar.X);
                                    break;
                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    drVar.Y = obtainStyledAttributes.getFloat(index, drVar.Y);
                                    break;
                                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                    drVar.Z = obtainStyledAttributes.getFloat(index, drVar.Z);
                                    break;
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    drVar.aa = obtainStyledAttributes.getFloat(index, drVar.aa);
                                    break;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    drVar.ab = obtainStyledAttributes.getFloat(index, drVar.ab);
                                    break;
                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    drVar.ac = obtainStyledAttributes.getFloat(index, drVar.ac);
                                    break;
                                default:
                                    String str = "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index);
                                    break;
                            }
                        } else {
                            String str2 = "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index);
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        drVar.a = true;
                    }
                    this.a.put(Integer.valueOf(drVar.d), drVar);
                    continue;
                }
            }
        } catch (IOException e) {
            deki.b(e);
        } catch (XmlPullParserException e2) {
            deki.b(e2);
        }
    }
}
