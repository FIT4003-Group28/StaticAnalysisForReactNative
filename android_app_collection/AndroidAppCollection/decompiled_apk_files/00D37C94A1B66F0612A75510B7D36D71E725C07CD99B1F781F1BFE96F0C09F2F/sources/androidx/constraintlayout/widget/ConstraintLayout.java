package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a;
    public ArrayList b;
    protected ahi c;
    public int d;
    protected boolean e;
    public int f;
    public HashMap g;
    aij h;
    private int i;
    private int j;
    private int k;
    private ais l;
    private int m;
    private SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ahi();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new aij(this, this);
        e(null, 0, 0);
    }

    protected static final aii d() {
        return new aii();
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        ahi ahiVar = this.c;
        ahiVar.af = this;
        aij aijVar = this.h;
        ahiVar.aG = aijVar;
        ahiVar.b.g = aijVar;
        this.a.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aix.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 112) {
                    this.f = obtainStyledAttributes.getInt(112, this.f);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(55, 0);
                    if (resourceId != 0) {
                        try {
                            ael.b(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        ais aisVar = new ais();
                        this.l = aisVar;
                        aisVar.c(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.U(this.f);
    }

    private final void f() {
        this.e = true;
    }

    private final void g() {
        boolean z;
        int i;
        float f;
        int i2;
        ahh ahhVar;
        ahh ahhVar2;
        ahh ahhVar3;
        ahh ahhVar4;
        float f2;
        aii aiiVar;
        float f3;
        int i3;
        int i4;
        float parseFloat;
        int i5;
        Object obj;
        ahl ahlVar;
        ahh qt;
        String str;
        int d;
        ConstraintLayout constraintLayout;
        int i6;
        boolean z2;
        int i7;
        View findViewById;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        String str3;
        ahh ahhVar5;
        ConstraintLayout constraintLayout2 = this;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ahh qt2 = constraintLayout2.qt(constraintLayout2.getChildAt(i12));
            if (qt2 != null) {
                qt2.s();
            }
        }
        int i13 = -1;
        if (isInEditMode) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = constraintLayout2.getChildAt(i14);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    Integer valueOf = Integer.valueOf(childAt.getId());
                    if (resourceName instanceof String) {
                        if (constraintLayout2.g == null) {
                            constraintLayout2.g = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        constraintLayout2.g.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, Integer.valueOf(valueOf.intValue()));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id == 0) {
                        ahhVar5 = constraintLayout2.c;
                    } else {
                        View view = (View) constraintLayout2.a.get(id);
                        if (view == null && (view = constraintLayout2.findViewById(id)) != null && view != constraintLayout2 && view.getParent() == constraintLayout2) {
                            constraintLayout2.onViewAdded(view);
                        }
                        if (view == constraintLayout2) {
                            ahhVar5 = constraintLayout2.c;
                        } else {
                            ahhVar5 = view == null ? null : ((aii) view.getLayoutParams()).aq;
                        }
                    }
                    ahhVar5.ah = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout2.m != -1) {
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = constraintLayout2.getChildAt(i15);
                if (childAt2.getId() == constraintLayout2.m && (childAt2 instanceof ait)) {
                    ait aitVar = (ait) childAt2;
                    throw null;
                }
            }
        }
        ais aisVar = constraintLayout2.l;
        int i16 = 1;
        if (aisVar != null) {
            int childCount2 = getChildCount();
            HashSet hashSet = new HashSet(aisVar.b.keySet());
            int i17 = 0;
            while (i17 < childCount2) {
                View childAt3 = constraintLayout2.getChildAt(i17);
                int id2 = childAt3.getId();
                HashMap hashMap = aisVar.b;
                Integer valueOf2 = Integer.valueOf(id2);
                if (!hashMap.containsKey(valueOf2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("id unknown ");
                    try {
                        str3 = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                    } catch (Exception unused2) {
                        str3 = "UNKNOWN";
                    }
                    sb.append(str3);
                    Log.w("ConstraintSet", sb.toString());
                } else if (id2 != i13) {
                    if (id2 != i13 && aisVar.b.containsKey(valueOf2)) {
                        hashSet.remove(valueOf2);
                        ain ainVar = (ain) aisVar.b.get(valueOf2);
                        if (ainVar != null) {
                            if (childAt3 instanceof aie) {
                                ainVar.d.ai = i16;
                                aie aieVar = (aie) childAt3;
                                aieVar.setId(id2);
                                aio aioVar = ainVar.d;
                                aieVar.a = aioVar.ag;
                                aieVar.b(aioVar.ah);
                                aio aioVar2 = ainVar.d;
                                aieVar.b.b = aioVar2.ao;
                                int[] iArr = aioVar2.aj;
                                if (iArr != null) {
                                    aieVar.e(iArr);
                                } else {
                                    String str4 = aioVar2.ak;
                                    if (str4 != null) {
                                        aioVar2.aj = ais.g(aieVar, str4);
                                        aieVar.e(ainVar.d.aj);
                                    }
                                }
                            }
                            aii aiiVar2 = (aii) childAt3.getLayoutParams();
                            aiiVar2.a();
                            ainVar.a(aiiVar2);
                            HashMap hashMap2 = ainVar.f;
                            Class<?> cls = childAt3.getClass();
                            for (String str5 : hashMap2.keySet()) {
                                boolean z3 = isInEditMode;
                                aif aifVar = (aif) hashMap2.get(str5);
                                HashMap hashMap3 = hashMap2;
                                if (!aifVar.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i8 = childCount;
                                    sb2.append("set");
                                    sb2.append(str5);
                                    str2 = sb2.toString();
                                } else {
                                    i8 = childCount;
                                    str2 = str5;
                                }
                                try {
                                    i10 = aifVar.h;
                                    i11 = i10 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i9 = childCount2;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i9 = childCount2;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i9 = childCount2;
                                }
                                if (i10 == 0) {
                                    i9 = childCount2;
                                    throw null;
                                }
                                switch (i11) {
                                    case 0:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(aifVar.c));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 1:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt3, Float.valueOf(aifVar.d));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 2:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(aifVar.g));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 3:
                                        i9 = childCount2;
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(aifVar.g);
                                        method.invoke(childAt3, colorDrawable);
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 4:
                                        i9 = childCount2;
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt3, aifVar.e);
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 5:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(aifVar.f));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 6:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt3, Float.valueOf(aifVar.d));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 7:
                                        i9 = childCount2;
                                        try {
                                            cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(aifVar.c));
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(cls.getName());
                                            sb3.append(" must have a method ");
                                            sb3.append(str2);
                                            Log.e("TransitionLayout", sb3.toString());
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        }
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                    default:
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        break;
                                }
                            }
                            i6 = childCount2;
                            z2 = isInEditMode;
                            i7 = childCount;
                            childAt3.setLayoutParams(aiiVar2);
                            aiq aiqVar = ainVar.b;
                            if (aiqVar.c == 0) {
                                childAt3.setVisibility(aiqVar.b);
                            }
                            childAt3.setAlpha(ainVar.b.d);
                            childAt3.setRotation(ainVar.e.c);
                            childAt3.setRotationX(ainVar.e.d);
                            childAt3.setRotationY(ainVar.e.e);
                            childAt3.setScaleX(ainVar.e.f);
                            childAt3.setScaleY(ainVar.e.g);
                            air airVar = ainVar.e;
                            if (airVar.j != -1) {
                                if (((View) childAt3.getParent()).findViewById(ainVar.e.j) != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt3.getRight() - childAt3.getLeft() > 0 && childAt3.getBottom() - childAt3.getTop() > 0) {
                                        int left2 = childAt3.getLeft();
                                        int top2 = childAt3.getTop();
                                        childAt3.setPivotX(left - left2);
                                        childAt3.setPivotY(top - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(airVar.h)) {
                                    childAt3.setPivotX(ainVar.e.h);
                                }
                                if (!Float.isNaN(ainVar.e.i)) {
                                    childAt3.setPivotY(ainVar.e.i);
                                }
                            }
                            childAt3.setTranslationX(ainVar.e.k);
                            childAt3.setTranslationY(ainVar.e.l);
                            childAt3.setTranslationZ(ainVar.e.m);
                            air airVar2 = ainVar.e;
                            if (airVar2.n) {
                                childAt3.setElevation(airVar2.o);
                            }
                            i17++;
                            constraintLayout2 = this;
                            isInEditMode = z2;
                            childCount = i7;
                            childCount2 = i6;
                            i13 = -1;
                            i16 = 1;
                        }
                    }
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                i6 = childCount2;
                z2 = isInEditMode;
                i7 = childCount;
                i17++;
                constraintLayout2 = this;
                isInEditMode = z2;
                childCount = i7;
                childCount2 = i6;
                i13 = -1;
                i16 = 1;
            }
            int i18 = childCount2;
            z = isInEditMode;
            i = childCount;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                ain ainVar2 = (ain) aisVar.b.get(num);
                if (ainVar2 != null) {
                    if (ainVar2.d.ai == 1) {
                        aie aieVar2 = new aie(getContext());
                        aieVar2.setId(num.intValue());
                        aio aioVar3 = ainVar2.d;
                        int[] iArr2 = aioVar3.aj;
                        if (iArr2 != null) {
                            aieVar2.e(iArr2);
                        } else {
                            String str6 = aioVar3.ak;
                            if (str6 != null) {
                                aioVar3.aj = ais.g(aieVar2, str6);
                                aieVar2.e(ainVar2.d.aj);
                            }
                        }
                        aio aioVar4 = ainVar2.d;
                        aieVar2.a = aioVar4.ag;
                        aieVar2.b(aioVar4.ah);
                        aii d2 = d();
                        aieVar2.f();
                        ainVar2.a(d2);
                        constraintLayout = this;
                        constraintLayout.addView(aieVar2, d2);
                    } else {
                        constraintLayout = this;
                    }
                    if (ainVar2.d.b) {
                        aiu aiuVar = new aiu(getContext());
                        aiuVar.setId(num.intValue());
                        aii d3 = d();
                        ainVar2.a(d3);
                        constraintLayout.addView(aiuVar, d3);
                    }
                }
            }
            constraintLayout2 = this;
            for (int i19 = 0; i19 < i18; i19++) {
                View childAt4 = constraintLayout2.getChildAt(i19);
                if (childAt4 instanceof aig) {
                    aig aigVar = (aig) childAt4;
                }
            }
        } else {
            z = isInEditMode;
            i = childCount;
        }
        constraintLayout2.c.aH.clear();
        int size = constraintLayout2.b.size();
        if (size > 0) {
            for (int i20 = 0; i20 < size; i20++) {
                aig aigVar2 = (aig) constraintLayout2.b.get(i20);
                if (aigVar2.isInEditMode()) {
                    String str7 = aigVar2.f;
                    obj = null;
                    aigVar2.f = null;
                } else {
                    obj = null;
                }
                ahl ahlVar2 = aigVar2.h;
                if (ahlVar2 != null) {
                    ahlVar2.ar = 0;
                    Arrays.fill(ahlVar2.aq, obj);
                    for (int i21 = 0; i21 < aigVar2.d; i21++) {
                        int i22 = aigVar2.c[i21];
                        View qs = constraintLayout2.qs(i22);
                        if (qs == null && (d = aigVar2.d(constraintLayout2, (str = (String) aigVar2.g.get(Integer.valueOf(i22))))) != 0) {
                            aigVar2.c[i21] = d;
                            aigVar2.g.put(Integer.valueOf(d), str);
                            qs = constraintLayout2.qs(d);
                        }
                        if (qs != null && (qt = constraintLayout2.qt(qs)) != (ahlVar = aigVar2.h) && qt != null) {
                            int i23 = ahlVar.ar;
                            ahh[] ahhVarArr = ahlVar.aq;
                            int length = ahhVarArr.length;
                            if (i23 + 1 > length) {
                                ahlVar.aq = (ahh[]) Arrays.copyOf(ahhVarArr, length + length);
                            }
                            ahh[] ahhVarArr2 = ahlVar.aq;
                            int i24 = ahlVar.ar;
                            ahhVarArr2[i24] = qt;
                            ahlVar.ar = i24 + 1;
                        }
                    }
                    ahl ahlVar3 = aigVar2.h;
                }
            }
        }
        int i25 = i;
        for (int i26 = 0; i26 < i25; i26++) {
            View childAt5 = constraintLayout2.getChildAt(i26);
            if (childAt5 instanceof aiv) {
                aiv aivVar = (aiv) childAt5;
                throw null;
            }
        }
        constraintLayout2.n.clear();
        constraintLayout2.n.put(0, constraintLayout2.c);
        constraintLayout2.n.put(getId(), constraintLayout2.c);
        for (int i27 = 0; i27 < i25; i27++) {
            View childAt6 = constraintLayout2.getChildAt(i27);
            constraintLayout2.n.put(childAt6.getId(), constraintLayout2.qt(childAt6));
        }
        for (int i28 = 0; i28 < i25; i28++) {
            View childAt7 = constraintLayout2.getChildAt(i28);
            ahh qt3 = constraintLayout2.qt(childAt7);
            if (qt3 != null) {
                aii aiiVar3 = (aii) childAt7.getLayoutParams();
                ahi ahiVar = constraintLayout2.c;
                ahiVar.aH.add(qt3);
                ahh ahhVar6 = qt3.T;
                if (ahhVar6 != null) {
                    ((aho) ahhVar6).Y(qt3);
                }
                qt3.T = ahiVar;
                SparseArray sparseArray = constraintLayout2.n;
                aiiVar3.a();
                aiiVar3.ar = false;
                qt3.ag = childAt7.getVisibility();
                boolean z4 = aiiVar3.ae;
                qt3.af = childAt7;
                if (childAt7 instanceof aig) {
                    ((aig) childAt7).a(qt3, constraintLayout2.c.d);
                }
                if (aiiVar3.ac) {
                    ahk ahkVar = (ahk) qt3;
                    int i29 = aiiVar3.an;
                    int i30 = aiiVar3.ao;
                    float f4 = aiiVar3.ap;
                    if (f4 == -1.0f) {
                        i5 = -1;
                        if (i29 != -1) {
                            if (i29 >= 0) {
                                ahkVar.a = -1.0f;
                                ahkVar.b = i29;
                                ahkVar.c = i5;
                            }
                        } else if (i30 != -1 && i30 >= 0) {
                            ahkVar.a = -1.0f;
                            ahkVar.b = -1;
                            ahkVar.c = i30;
                        }
                    } else if (f4 > -1.0f) {
                        ahkVar.a = f4;
                        i5 = -1;
                        ahkVar.b = -1;
                        ahkVar.c = i5;
                    }
                } else {
                    int i31 = aiiVar3.ag;
                    int i32 = aiiVar3.ah;
                    int i33 = aiiVar3.ai;
                    int i34 = aiiVar3.aj;
                    int i35 = aiiVar3.ak;
                    int i36 = aiiVar3.al;
                    float f5 = aiiVar3.am;
                    int i37 = aiiVar3.o;
                    if (i37 != -1) {
                        ahh ahhVar7 = (ahh) sparseArray.get(i37);
                        if (ahhVar7 != null) {
                            float f6 = aiiVar3.q;
                            qt3.P(7, ahhVar7, 7, aiiVar3.p, 0);
                            qt3.E = f6;
                        }
                        aiiVar = aiiVar3;
                        f3 = 0.0f;
                    } else {
                        if (i31 != -1) {
                            ahh ahhVar8 = (ahh) sparseArray.get(i31);
                            if (ahhVar8 != null) {
                                f = f5;
                                i2 = i36;
                                qt3.P(2, ahhVar8, 2, aiiVar3.leftMargin, i35);
                            } else {
                                f = f5;
                                i2 = i36;
                            }
                        } else {
                            f = f5;
                            i2 = i36;
                            if (i32 != -1 && (ahhVar = (ahh) sparseArray.get(i32)) != null) {
                                qt3.P(2, ahhVar, 4, aiiVar3.leftMargin, i35);
                            }
                        }
                        if (i33 != -1) {
                            ahh ahhVar9 = (ahh) sparseArray.get(i33);
                            if (ahhVar9 != null) {
                                qt3.P(4, ahhVar9, 2, aiiVar3.rightMargin, i2);
                            }
                        } else if (i34 != -1 && (ahhVar2 = (ahh) sparseArray.get(i34)) != null) {
                            qt3.P(4, ahhVar2, 4, aiiVar3.rightMargin, i2);
                        }
                        int i38 = aiiVar3.h;
                        if (i38 != -1) {
                            ahh ahhVar10 = (ahh) sparseArray.get(i38);
                            if (ahhVar10 != null) {
                                qt3.P(3, ahhVar10, 3, aiiVar3.topMargin, aiiVar3.w);
                            }
                        } else {
                            int i39 = aiiVar3.i;
                            if (i39 != -1 && (ahhVar3 = (ahh) sparseArray.get(i39)) != null) {
                                qt3.P(3, ahhVar3, 5, aiiVar3.topMargin, aiiVar3.w);
                            }
                        }
                        int i40 = aiiVar3.j;
                        if (i40 != -1) {
                            ahh ahhVar11 = (ahh) sparseArray.get(i40);
                            if (ahhVar11 != null) {
                                qt3.P(5, ahhVar11, 3, aiiVar3.bottomMargin, aiiVar3.y);
                            }
                        } else {
                            int i41 = aiiVar3.k;
                            if (i41 != -1 && (ahhVar4 = (ahh) sparseArray.get(i41)) != null) {
                                qt3.P(5, ahhVar4, 5, aiiVar3.bottomMargin, aiiVar3.y);
                            }
                        }
                        int i42 = aiiVar3.l;
                        if (i42 != -1) {
                            f2 = f;
                            aiiVar = aiiVar3;
                            h(qt3, aiiVar3, sparseArray, i42, 6);
                        } else {
                            f2 = f;
                            aiiVar = aiiVar3;
                            int i43 = aiiVar.m;
                            if (i43 != -1) {
                                h(qt3, aiiVar, sparseArray, i43, 3);
                            } else {
                                int i44 = aiiVar.n;
                                if (i44 != -1) {
                                    h(qt3, aiiVar, sparseArray, i44, 5);
                                }
                            }
                        }
                        f3 = 0.0f;
                        if (f2 >= 0.0f) {
                            qt3.ad = f2;
                        }
                        float f7 = aiiVar.E;
                        if (f7 >= 0.0f) {
                            qt3.ae = f7;
                        }
                    }
                    if (z) {
                        int i45 = aiiVar.S;
                        if (i45 == -1) {
                            if (aiiVar.T != -1) {
                                i45 = -1;
                            }
                        }
                        int i46 = aiiVar.T;
                        qt3.Y = i45;
                        qt3.Z = i46;
                    }
                    if (!aiiVar.Z) {
                        if (aiiVar.width == -1) {
                            if (aiiVar.V) {
                                qt3.Q(3);
                            } else {
                                qt3.Q(4);
                            }
                            qt3.L(2).f = aiiVar.leftMargin;
                            qt3.L(4).f = aiiVar.rightMargin;
                        } else {
                            qt3.Q(3);
                            qt3.D(0);
                        }
                    } else {
                        qt3.Q(1);
                        qt3.D(aiiVar.width);
                        if (aiiVar.width == -2) {
                            qt3.Q(2);
                        }
                    }
                    if (!aiiVar.aa) {
                        if (aiiVar.height == -1) {
                            if (aiiVar.W) {
                                qt3.R(3);
                            } else {
                                qt3.R(4);
                            }
                            qt3.L(3).f = aiiVar.topMargin;
                            qt3.L(5).f = aiiVar.bottomMargin;
                        } else {
                            qt3.R(3);
                            qt3.y(0);
                        }
                    } else {
                        qt3.R(1);
                        qt3.y(aiiVar.height);
                        if (aiiVar.height == -2) {
                            qt3.R(2);
                        }
                    }
                    String str8 = aiiVar.F;
                    if (str8 == null || str8.length() == 0) {
                        qt3.W = f3;
                    } else {
                        int length2 = str8.length();
                        int indexOf3 = str8.indexOf(44);
                        if (indexOf3 <= 0 || indexOf3 >= length2 - 1) {
                            i3 = 0;
                            i4 = -1;
                        } else {
                            String substring = str8.substring(0, indexOf3);
                            if (substring.equalsIgnoreCase("W")) {
                                i4 = 0;
                            } else {
                                i4 = substring.equalsIgnoreCase("H") ? 1 : -1;
                            }
                            i3 = indexOf3 + 1;
                        }
                        int indexOf4 = str8.indexOf(58);
                        if (indexOf4 < 0 || indexOf4 >= length2 - 1) {
                            String substring2 = str8.substring(i3);
                            if (substring2.length() > 0) {
                                parseFloat = Float.parseFloat(substring2);
                            }
                            parseFloat = 0.0f;
                        } else {
                            String substring3 = str8.substring(i3, indexOf4);
                            String substring4 = str8.substring(indexOf4 + 1);
                            if (substring3.length() > 0 && substring4.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    float parseFloat3 = Float.parseFloat(substring4);
                                    if (parseFloat2 > f3 && parseFloat3 > f3) {
                                        if (i4 == 1) {
                                            parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                        } else {
                                            parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > f3) {
                            qt3.W = parseFloat;
                            qt3.X = i4;
                        }
                    }
                    float f8 = aiiVar.G;
                    float[] fArr = qt3.ak;
                    fArr[0] = f8;
                    fArr[1] = aiiVar.H;
                    qt3.ai = aiiVar.I;
                    qt3.aj = aiiVar.f50J;
                    int i47 = aiiVar.Y;
                    if (i47 >= 0 && i47 <= 3) {
                        qt3.r = i47;
                    }
                    int i48 = aiiVar.K;
                    int i49 = aiiVar.M;
                    int i50 = aiiVar.O;
                    float f9 = aiiVar.Q;
                    qt3.s = i48;
                    qt3.v = i49;
                    if (i50 == Integer.MAX_VALUE) {
                        i50 = 0;
                    }
                    qt3.w = i50;
                    qt3.x = f9;
                    if (f9 > f3 && f9 < 1.0f && i48 == 0) {
                        qt3.s = 2;
                    }
                    int i51 = aiiVar.L;
                    int i52 = aiiVar.N;
                    int i53 = aiiVar.P;
                    float f10 = aiiVar.R;
                    qt3.t = i51;
                    qt3.y = i52;
                    if (i53 == Integer.MAX_VALUE) {
                        i53 = 0;
                    }
                    qt3.z = i53;
                    qt3.A = f10;
                    if (f10 > f3 && f10 < 1.0f && i51 == 0) {
                        qt3.t = 2;
                    }
                }
            }
        }
    }

    private final void h(ahh ahhVar, aii aiiVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        ahh ahhVar2 = (ahh) sparseArray.get(i);
        if (ahhVar2 == null || view == null || !(view.getLayoutParams() instanceof aii)) {
            return;
        }
        aiiVar.ab = true;
        if (i2 == 6) {
            aii aiiVar2 = (aii) view.getLayoutParams();
            aiiVar2.ab = true;
            aiiVar2.aq.F = true;
        }
        ahhVar.L(6).j(ahhVar2.L(i2), aiiVar.C, aiiVar.B);
        ahhVar.F = true;
        ahhVar.L(3).d();
        ahhVar.L(5).d();
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aii;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                aig aigVar = (aig) this.b.get(i);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i4 + ((int) ((parseInt4 / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aii(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            aii aiiVar = (aii) childAt.getLayoutParams();
            ahh ahhVar = aiiVar.aq;
            if (childAt.getVisibility() == 8 && !aiiVar.ac && !aiiVar.ad) {
                boolean z2 = aiiVar.af;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = aiiVar.ae;
            int k = ahhVar.k();
            int l = ahhVar.l();
            childAt.layout(k, l, ahhVar.j() + k, ahhVar.h() + l);
            if (childAt instanceof aiv) {
                aiv aivVar = (aiv) childAt;
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                aig aigVar = (aig) this.b.get(i6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        ahh qt = qt(view);
        if ((view instanceof aiu) && !(qt instanceof ahk)) {
            aii aiiVar = (aii) view.getLayoutParams();
            aiiVar.aq = new ahk();
            aiiVar.ac = true;
            ((ahk) aiiVar.aq).c(aiiVar.U);
        }
        if (view instanceof aig) {
            aig aigVar = (aig) view;
            aigVar.f();
            ((aii) view.getLayoutParams()).ad = true;
            if (!this.b.contains(aigVar)) {
                this.b.add(aigVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(qt(view));
        this.b.remove(view);
        this.e = true;
    }

    public final View qs(int i) {
        return (View) this.a.get(i);
    }

    public final ahh qt(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof aii) {
            return ((aii) view.getLayoutParams()).aq;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (!(view.getLayoutParams() instanceof aii)) {
            return null;
        }
        return ((aii) view.getLayoutParams()).aq;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aii(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ahi();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new aij(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ahi();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new aij(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ahi();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new aij(this, this);
        e(attributeSet, i, i2);
    }
}
