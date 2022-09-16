package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: bt  reason: default package */
/* loaded from: classes2.dex */
public final class bt {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = bu.a;
        sparseIntArray.append(84, 25);
        sparseIntArray.append(85, 26);
        sparseIntArray.append(87, 29);
        sparseIntArray.append(88, 30);
        sparseIntArray.append(94, 36);
        sparseIntArray.append(93, 35);
        sparseIntArray.append(66, 4);
        sparseIntArray.append(65, 3);
        sparseIntArray.append(61, 1);
        sparseIntArray.append(102, 6);
        sparseIntArray.append(103, 7);
        sparseIntArray.append(73, 17);
        sparseIntArray.append(74, 18);
        sparseIntArray.append(75, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(89, 32);
        sparseIntArray.append(90, 33);
        sparseIntArray.append(72, 10);
        sparseIntArray.append(71, 9);
        sparseIntArray.append(107, 13);
        sparseIntArray.append(110, 16);
        sparseIntArray.append(108, 14);
        sparseIntArray.append(105, 11);
        sparseIntArray.append(109, 15);
        sparseIntArray.append(106, 12);
        sparseIntArray.append(97, 40);
        sparseIntArray.append(82, 39);
        sparseIntArray.append(81, 41);
        sparseIntArray.append(96, 42);
        sparseIntArray.append(80, 20);
        sparseIntArray.append(95, 37);
        sparseIntArray.append(70, 5);
        sparseIntArray.append(83, 60);
        sparseIntArray.append(92, 60);
        sparseIntArray.append(86, 60);
        sparseIntArray.append(64, 60);
        sparseIntArray.append(60, 60);
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
        sparseIntArray.append(98, 54);
        sparseIntArray.append(76, 55);
        sparseIntArray.append(99, 56);
        sparseIntArray.append(77, 57);
        sparseIntArray.append(100, 58);
        sparseIntArray.append(78, 59);
        sparseIntArray.append(1, 38);
    }

    private static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String j(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top";
    }

    public final bs a(int i) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new bs());
        }
        return (bs) this.a.get(valueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                bs bsVar = (bs) this.a.get(valueOf);
                br brVar = (br) childAt.getLayoutParams();
                bsVar.a(brVar);
                childAt.setLayoutParams(brVar);
                childAt.setVisibility(bsVar.G);
                childAt.setAlpha(bsVar.R);
                childAt.setRotationX(bsVar.U);
                childAt.setRotationY(bsVar.V);
                childAt.setScaleX(bsVar.W);
                childAt.setScaleY(bsVar.X);
                childAt.setPivotX(bsVar.Y);
                childAt.setPivotY(bsVar.Z);
                childAt.setTranslationX(bsVar.aa);
                childAt.setTranslationY(bsVar.ab);
                childAt.setTranslationZ(bsVar.ac);
                if (bsVar.S) {
                    childAt.setElevation(bsVar.T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            bs bsVar2 = (bs) this.a.get(num);
            if (bsVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                br b2 = ConstraintLayout.b();
                bsVar2.a(b2);
                constraintLayout.addView(guideline, b2);
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            br brVar = (br) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.a.put(valueOf, new bs());
            }
            bs bsVar = (bs) this.a.get(valueOf);
            bsVar.d = id;
            bsVar.h = brVar.d;
            bsVar.i = brVar.e;
            bsVar.j = brVar.f;
            bsVar.k = brVar.g;
            bsVar.l = brVar.h;
            bsVar.m = brVar.i;
            bsVar.n = brVar.j;
            bsVar.o = brVar.k;
            bsVar.p = brVar.l;
            bsVar.q = brVar.m;
            bsVar.r = brVar.n;
            bsVar.s = brVar.o;
            bsVar.t = brVar.p;
            bsVar.u = brVar.w;
            bsVar.v = brVar.x;
            bsVar.w = brVar.y;
            bsVar.x = brVar.K;
            bsVar.y = brVar.L;
            bsVar.z = brVar.M;
            bsVar.g = brVar.c;
            bsVar.e = brVar.a;
            bsVar.f = brVar.b;
            bsVar.b = brVar.width;
            bsVar.c = brVar.height;
            bsVar.A = brVar.leftMargin;
            bsVar.B = brVar.rightMargin;
            bsVar.C = brVar.topMargin;
            bsVar.D = brVar.bottomMargin;
            bsVar.N = brVar.B;
            bsVar.O = brVar.A;
            bsVar.Q = brVar.D;
            bsVar.P = brVar.C;
            bsVar.ad = brVar.E;
            bsVar.ae = brVar.F;
            bsVar.af = brVar.I;
            bsVar.ag = brVar.f142J;
            bsVar.ah = brVar.G;
            bsVar.ai = brVar.H;
            bsVar.E = brVar.getMarginEnd();
            bsVar.F = brVar.getMarginStart();
            bsVar.G = childAt.getVisibility();
            bsVar.R = childAt.getAlpha();
            bsVar.U = childAt.getRotationX();
            bsVar.V = childAt.getRotationY();
            bsVar.W = childAt.getScaleX();
            bsVar.X = childAt.getScaleY();
            bsVar.Y = childAt.getPivotX();
            bsVar.Z = childAt.getPivotY();
            bsVar.aa = childAt.getTranslationX();
            bsVar.ab = childAt.getTranslationY();
            bsVar.ac = childAt.getTranslationZ();
            if (bsVar.S) {
                bsVar.T = childAt.getElevation();
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new bs());
        }
        bs bsVar = (bs) this.a.get(valueOf);
        if (i2 == 3) {
            if (i4 == 3) {
                bsVar.l = i3;
                bsVar.m = -1;
                bsVar.p = -1;
            } else if (i4 == 4) {
                bsVar.m = i3;
                bsVar.l = -1;
                bsVar.p = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        } else if (i2 == 4) {
            if (i4 == 4) {
                bsVar.o = i3;
                bsVar.n = -1;
                bsVar.p = -1;
            } else if (i4 == 3) {
                bsVar.n = i3;
                bsVar.o = -1;
                bsVar.p = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        } else if (i2 == 5) {
            if (i4 == 5) {
                bsVar.p = i3;
                bsVar.o = -1;
                bsVar.n = -1;
                bsVar.l = -1;
                bsVar.m = -1;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        } else if (i2 != 6) {
            if (i4 == 7) {
                bsVar.t = i3;
                bsVar.s = -1;
            } else if (i4 == 6) {
                bsVar.s = i3;
                bsVar.t = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        } else if (i4 == 6) {
            bsVar.r = i3;
            bsVar.q = -1;
        } else if (i4 == 7) {
            bsVar.q = i3;
            bsVar.r = -1;
        } else {
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new bs());
        }
        bs bsVar = (bs) this.a.get(valueOf);
        if (i2 == 4) {
            if (i4 == 4) {
                bsVar.o = i3;
                bsVar.n = -1;
                bsVar.p = -1;
                bsVar.D = i5;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        } else if (i2 == 5) {
            if (i4 == 5) {
                bsVar.p = i3;
                bsVar.o = -1;
                bsVar.n = -1;
                bsVar.l = -1;
                bsVar.m = -1;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        } else if (i2 != 6) {
            if (i4 == 7) {
                bsVar.t = i3;
                bsVar.s = -1;
            } else if (i4 == 6) {
                bsVar.s = i3;
                bsVar.t = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
            bsVar.E = i5;
        } else {
            if (i4 == 6) {
                bsVar.r = i3;
                bsVar.q = -1;
            } else if (i4 == 7) {
                bsVar.q = i3;
                bsVar.r = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
            bsVar.F = i5;
        }
    }

    public final void g(Context context, int i) {
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
                    bs bsVar = new bs();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, bu.b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 == 60) {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        } else {
                            switch (i3) {
                                case 1:
                                    bsVar.p = i(obtainStyledAttributes, index, bsVar.p);
                                    break;
                                case 2:
                                    bsVar.D = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.D);
                                    break;
                                case 3:
                                    bsVar.o = i(obtainStyledAttributes, index, bsVar.o);
                                    break;
                                case 4:
                                    bsVar.n = i(obtainStyledAttributes, index, bsVar.n);
                                    break;
                                case 5:
                                    bsVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    bsVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, bsVar.x);
                                    break;
                                case 7:
                                    bsVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, bsVar.y);
                                    break;
                                case 8:
                                    bsVar.E = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.E);
                                    break;
                                case 9:
                                    bsVar.n = i(obtainStyledAttributes, index, bsVar.t);
                                    break;
                                case 10:
                                    bsVar.s = i(obtainStyledAttributes, index, bsVar.s);
                                    break;
                                case 11:
                                    bsVar.K = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.K);
                                    break;
                                case 12:
                                    bsVar.L = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.L);
                                    break;
                                case 13:
                                    bsVar.H = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.H);
                                    break;
                                case 14:
                                    bsVar.f143J = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.f143J);
                                    break;
                                case 15:
                                    bsVar.M = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.M);
                                    break;
                                case 16:
                                    bsVar.I = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.I);
                                    break;
                                case 17:
                                    bsVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, bsVar.e);
                                    break;
                                case 18:
                                    bsVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, bsVar.f);
                                    break;
                                case 19:
                                    bsVar.g = obtainStyledAttributes.getFloat(index, bsVar.g);
                                    break;
                                case 20:
                                    bsVar.u = obtainStyledAttributes.getFloat(index, bsVar.u);
                                    break;
                                case 21:
                                    bsVar.c = obtainStyledAttributes.getLayoutDimension(index, bsVar.c);
                                    break;
                                case 22:
                                    bsVar.G = obtainStyledAttributes.getInt(index, bsVar.G);
                                    bsVar.G = b[bsVar.G];
                                    break;
                                case 23:
                                    bsVar.b = obtainStyledAttributes.getLayoutDimension(index, bsVar.b);
                                    break;
                                case 24:
                                    bsVar.A = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.A);
                                    break;
                                case 25:
                                    bsVar.h = i(obtainStyledAttributes, index, bsVar.h);
                                    break;
                                case 26:
                                    bsVar.i = i(obtainStyledAttributes, index, bsVar.i);
                                    break;
                                case 27:
                                    bsVar.z = obtainStyledAttributes.getInt(index, bsVar.z);
                                    break;
                                case 28:
                                    bsVar.B = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.B);
                                    break;
                                case 29:
                                    bsVar.j = i(obtainStyledAttributes, index, bsVar.j);
                                    break;
                                case 30:
                                    bsVar.k = i(obtainStyledAttributes, index, bsVar.k);
                                    break;
                                case 31:
                                    bsVar.F = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.F);
                                    break;
                                case 32:
                                    bsVar.q = i(obtainStyledAttributes, index, bsVar.q);
                                    break;
                                case 33:
                                    bsVar.r = i(obtainStyledAttributes, index, bsVar.r);
                                    break;
                                case 34:
                                    bsVar.C = obtainStyledAttributes.getDimensionPixelSize(index, bsVar.C);
                                    break;
                                case 35:
                                    bsVar.m = i(obtainStyledAttributes, index, bsVar.m);
                                    break;
                                case 36:
                                    bsVar.l = i(obtainStyledAttributes, index, bsVar.l);
                                    break;
                                case 37:
                                    bsVar.v = obtainStyledAttributes.getFloat(index, bsVar.v);
                                    break;
                                case 38:
                                    bsVar.d = obtainStyledAttributes.getResourceId(index, bsVar.d);
                                    break;
                                case 39:
                                    bsVar.O = obtainStyledAttributes.getFloat(index, bsVar.O);
                                    break;
                                case 40:
                                    bsVar.N = obtainStyledAttributes.getFloat(index, bsVar.N);
                                    break;
                                case 41:
                                    bsVar.P = obtainStyledAttributes.getInt(index, bsVar.P);
                                    break;
                                case 42:
                                    bsVar.Q = obtainStyledAttributes.getInt(index, bsVar.Q);
                                    break;
                                case 43:
                                    bsVar.R = obtainStyledAttributes.getFloat(index, bsVar.R);
                                    break;
                                case 44:
                                    bsVar.S = true;
                                    bsVar.T = obtainStyledAttributes.getFloat(index, bsVar.T);
                                    break;
                                case 45:
                                    bsVar.U = obtainStyledAttributes.getFloat(index, bsVar.U);
                                    break;
                                case 46:
                                    bsVar.V = obtainStyledAttributes.getFloat(index, bsVar.V);
                                    break;
                                case 47:
                                    bsVar.W = obtainStyledAttributes.getFloat(index, bsVar.W);
                                    break;
                                case 48:
                                    bsVar.X = obtainStyledAttributes.getFloat(index, bsVar.X);
                                    break;
                                case 49:
                                    bsVar.Y = obtainStyledAttributes.getFloat(index, bsVar.Y);
                                    break;
                                case 50:
                                    bsVar.Z = obtainStyledAttributes.getFloat(index, bsVar.Z);
                                    break;
                                case 51:
                                    bsVar.aa = obtainStyledAttributes.getFloat(index, bsVar.aa);
                                    break;
                                case 52:
                                    bsVar.ab = obtainStyledAttributes.getFloat(index, bsVar.ab);
                                    break;
                                case 53:
                                    bsVar.ac = obtainStyledAttributes.getFloat(index, bsVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        bsVar.a = true;
                    }
                    this.a.put(Integer.valueOf(bsVar.d), bsVar);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void h(int i, int i2, int i3) {
        bs a = a(i);
        if (i2 == 3) {
            a.C = i3;
        } else if (i2 == 4) {
            a.D = i3;
        } else if (i2 == 5) {
            throw new IllegalArgumentException("baseline does not support margins");
        } else {
            if (i2 != 6) {
                a.E = i3;
            } else {
                a.F = i3;
            }
        }
    }
}
