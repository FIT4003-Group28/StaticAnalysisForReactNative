package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: tbs  reason: default package */
/* loaded from: classes4.dex */
public final class tbs {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger();
    private static final aoos c;
    private static final aoos d;

    static {
        aoos c2 = aoos.c();
        c2.e(awqj.b);
        c = c2;
        aoos c3 = aoos.c();
        c3.e(awna.b);
        c3.e(awnp.b);
        d = c3;
    }

    public static SparseArray a(tda tdaVar) {
        SparseArray sparseArray = new SparseArray(1);
        String str = tdaVar.t;
        if (str == null) {
            throw new IllegalStateException("View missing tree debug id in debug mode.");
        }
        sparseArray.append(R.id.elements_tree_debug_id, str);
        return sparseArray;
    }

    public static czt b(czt cztVar, String str) {
        View view;
        Object obj;
        if (cztVar == null) {
            return null;
        }
        if (str.equals(cztVar.l())) {
            return cztVar;
        }
        cyr W = cztVar.b.W();
        if (W == null || !cyr.z(W)) {
            view = null;
        } else {
            if (cztVar.o()) {
                cyv X = cztVar.b.X();
                ComponentTree componentTree = X == null ? null : X.j;
                dci lithoView = componentTree == null ? null : componentTree.getLithoView();
                dcp dcpVar = lithoView == null ? null : lithoView.s;
                if (dcpVar != null) {
                    int a2 = dcpVar.a();
                    for (int i = 0; i < a2; i++) {
                        dms g = dcpVar.g(i);
                        cyr cyrVar = g == null ? null : dbn.a(g).b;
                        if (cyrVar != null && cyrVar == cztVar.b.W()) {
                            obj = g.a;
                            break;
                        }
                    }
                }
            }
            obj = null;
            view = (View) obj;
        }
        if (view != null) {
            czt m = m(view, str);
            if (m != null) {
                return m;
            }
        } else {
            for (czt cztVar2 : cztVar.m()) {
                czt b2 = b(cztVar2, str);
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    public static dci c(View view, String str) {
        if (view instanceof dci) {
            dci dciVar = (dci) view;
            if (str.equals(g(dciVar))) {
                return dciVar;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                dci c2 = c(viewGroup.getChildAt(i), str);
                if (c2 != null) {
                    return c2;
                }
            }
            return null;
        }
        return null;
    }

    public static amup d(View view) {
        final amum h = amup.h();
        j(view, new ji() { // from class: tbr
            @Override // defpackage.ji
            public final void accept(Object obj) {
                amum amumVar = amum.this;
                int i = tbs.a;
                Object j = ((czt) ((Pair) obj).second).j();
                if (j instanceof tbq) {
                    amumVar.f(amps.d(((tbq) j).c), j);
                }
            }
        });
        return h.b();
    }

    public static aorw e() {
        long currentTimeMillis = System.currentTimeMillis();
        aopa createBuilder = aorw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).b = currentTimeMillis / 1000;
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).c = ((int) (currentTimeMillis % 1000)) * 1000000;
        return (aorw) createBuilder.mo39build();
    }

    public static awrg f(tda tdaVar) {
        aopa createBuilder = awrg.a.createBuilder();
        String num = Integer.toString(b.getAndIncrement());
        createBuilder.copyOnWrite();
        awrg awrgVar = (awrg) createBuilder.instance;
        num.getClass();
        awrgVar.b |= 2;
        awrgVar.d = num;
        String str = tdaVar.s;
        String str2 = tdaVar.t;
        if (str == null || str2 == null) {
            return (awrg) createBuilder.mo39build();
        }
        aopa createBuilder2 = awqk.a.createBuilder();
        createBuilder2.copyOnWrite();
        awqk awqkVar = (awqk) createBuilder2.instance;
        awqkVar.b |= 2;
        awqkVar.d = str;
        createBuilder2.copyOnWrite();
        awqk awqkVar2 = (awqk) createBuilder2.instance;
        awqkVar2.b |= 1;
        awqkVar2.c = str2;
        createBuilder.copyOnWrite();
        awrg awrgVar2 = (awrg) createBuilder.instance;
        awqk awqkVar3 = (awqk) createBuilder2.mo39build();
        awqkVar3.getClass();
        awrgVar2.c = awqkVar3;
        awrgVar2.b |= 1;
        return (awrg) createBuilder.mo39build();
    }

    public static String g(View view) {
        Object tag = view.getTag(R.id.elements_tree_debug_id);
        if (!(tag instanceof String)) {
            return null;
        }
        return (String) tag;
    }

    public static List h() {
        List q;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                q = amuk.q();
            } else {
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj == null) {
                    q = amuk.q();
                } else if (obj instanceof List) {
                    q = (List) obj;
                } else if (obj instanceof View[]) {
                    q = Arrays.asList((Object[]) obj);
                } else {
                    q = amuk.q();
                }
            }
        } catch (Exception e) {
            Log.w("ElementsDebugger", "Failed to get root views from WindowManager", e);
            q = amuk.q();
        }
        for (Object obj2 : q) {
            if (obj2 instanceof View) {
                View view = (View) obj2;
                if (view.getWindowVisibility() == 0 && view.hasWindowFocus()) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    public static void i(czt cztVar, ji jiVar, int[] iArr) {
        if (cztVar == null) {
            return;
        }
        jiVar.accept(Pair.create(iArr, cztVar));
        for (czt cztVar2 : cztVar.m()) {
            i(cztVar2, jiVar, iArr);
        }
    }

    public static void j(View view, ji jiVar) {
        if (view == null) {
            return;
        }
        if (view instanceof dci) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i(czt.f((dci) view), jiVar, iArr);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            j(viewGroup.getChildAt(i), jiVar);
        }
    }

    public static awqm k(aodt aodtVar, tet tetVar, byte[] bArr, String str) {
        try {
            ByteBuffer k = tfy.k(aodtVar.ax(), 287553821);
            if (k == null) {
                Log.w("Elements", "Failed to create debugger info: ELEMENT_SERIALIZED_PROTO_BYTES missing");
                return null;
            }
            awnn awnnVar = (awnn) aopi.parseFrom(awnn.a, k, aoos.b());
            aopa createBuilder = awqm.a.createBuilder();
            createBuilder.copyOnWrite();
            awqm awqmVar = (awqm) createBuilder.instance;
            awnnVar.getClass();
            awqmVar.e = awnnVar;
            awqmVar.b |= 4;
            if (tetVar != null) {
                awnc awncVar = (awnc) aopi.parseFrom(awnc.a, tetVar.e(), aoos.b());
                createBuilder.copyOnWrite();
                awqm awqmVar2 = (awqm) createBuilder.instance;
                awncVar.getClass();
                awqmVar2.d = awncVar;
                awqmVar2.b |= 2;
            }
            if (bArr != null) {
                awmy awmyVar = (awmy) aopi.parseFrom(awmy.a, bArr, d);
                createBuilder.copyOnWrite();
                awqm awqmVar3 = (awqm) createBuilder.instance;
                awmyVar.getClass();
                awqmVar3.f = awmyVar;
                awqmVar3.b |= 8;
            }
            if (str != null) {
                createBuilder.copyOnWrite();
                awqm awqmVar4 = (awqm) createBuilder.instance;
                awqmVar4.b |= 1;
                awqmVar4.c = str;
            }
            return (awqm) createBuilder.mo39build();
        } catch (IOException e) {
            Log.w("Elements", "Failed to create debugger info: failed to parse ELEMENT_SERIALIZED_PROTO_BYTES", e);
            return null;
        }
    }

    public static String l(aodt aodtVar) {
        if (aodtVar == null) {
            return null;
        }
        try {
            ByteBuffer k = tfy.k(aodtVar, 224886694);
            if (k == null) {
                Log.w("Elements", "Failed to get debugger id: PROPERTIES_SERIALIZED_PROTO_BYTES_ID missing");
                return null;
            }
            awok awokVar = (awok) aopi.parseFrom(awok.a, k, c);
            if (!awokVar.qn(awqj.b)) {
                Log.w("Elements", "Failed to get debugger id: DebuggerProperties missing");
                return null;
            }
            awqj awqjVar = (awqj) awokVar.qm(awqj.b);
            if ((awqjVar.c & 2) != 0) {
                return awqjVar.d;
            }
            Log.w("Elements", "Failed to get debugger id: DebuggerProperties.debugger_id missing");
            return null;
        } catch (IOException e) {
            Log.w("Elements", "Failed to get debugger id: failed to parse PROPERTIES_SERIALIZED_PROTO_BYTES_ID", e);
            return null;
        }
    }

    private static czt m(View view, String str) {
        if (view == null) {
            return null;
        }
        if (view instanceof dci) {
            return b(czt.f((dci) view), str);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                czt m = m(viewGroup.getChildAt(i), str);
                if (m != null) {
                    return m;
                }
            }
        }
        return null;
    }
}
