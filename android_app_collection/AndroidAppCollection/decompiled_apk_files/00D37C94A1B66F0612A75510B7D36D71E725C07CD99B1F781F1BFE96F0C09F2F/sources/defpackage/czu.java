package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.litho.TextContent;
import com.facebook.yoga.YogaMeasureMode;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: czu  reason: default package */
/* loaded from: classes3.dex */
public class czu {
    public static cyj a;
    public static daw b;
    public static dck c;
    public static ddr d;
    public static dbw e;
    public static dcy f;
    public static Paint g;
    public static Paint h;
    public static Rect i;
    public static Paint j;
    public static Paint k;
    public static volatile dew l;
    private static volatile daz m;
    private static dag n;
    private static dev o;
    private static dbl p;
    private static dax q;
    private static dep r;
    private static day s;
    private static der t;

    public czu() {
    }

    public czu(List list) {
        Collections.unmodifiableList(list);
    }

    public static int A(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return i3;
            }
            if (mode == 1073741824) {
                return View.MeasureSpec.getSize(i2);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected size mode: ");
            sb.append(mode2);
            throw new IllegalStateException(sb.toString());
        }
        return Math.min(View.MeasureSpec.getSize(i2), i3);
    }

    public static boolean B(int i2, int i3) {
        return i2 == i3 || (View.MeasureSpec.getMode(i2) == 0 && View.MeasureSpec.getMode(i3) == 0);
    }

    public static boolean C(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i2 != i3) {
            if (mode2 == 0) {
                if (mode == 0) {
                    return true;
                }
                mode2 = 0;
            }
            float f2 = i4;
            if (mode == 1073741824 && Math.abs(size - f2) < 0.5f) {
                return true;
            }
            if (mode == Integer.MIN_VALUE && mode2 == 0) {
                if (size >= f2) {
                    return true;
                }
                mode2 = 0;
            }
            return mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 > size && f2 <= ((float) size);
        }
        return true;
    }

    public static ddb D(cyv cyvVar, tha thaVar, ddb ddbVar) {
        return F(thaVar, cyvVar.c, ddbVar, cyvVar.m());
    }

    public static dbk E(cyv cyvVar) {
        dcv dcvVar = dcx.b;
        return new czz(cyvVar);
    }

    public static ddb F(tha thaVar, String str, ddb ddbVar, aflw aflwVar) {
        Map e2;
        if (ddbVar == null) {
            return null;
        }
        if (str == null) {
            tha.b(ddbVar);
            return null;
        }
        ddbVar.a("log_tag", str);
        if (aflwVar == null || (e2 = thaVar.e(aflwVar)) == null) {
            return ddbVar;
        }
        for (Map.Entry entry : e2.entrySet()) {
            ddbVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return ddbVar;
    }

    public static String G(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    protected static File H(Context context) {
        return context.getDir("lib", 0);
    }

    public static void I(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
        r4 = new defpackage.dnd(r12, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J(android.content.Context r18, java.lang.String r19, java.lang.String r20, java.util.Set r21) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czu.J(android.content.Context, java.lang.String, java.lang.String, java.util.Set):void");
    }

    protected static File K(Context context, String str, String str2) {
        String G = G(str);
        if (dnt.d(str2)) {
            return new File(H(context), G);
        }
        File H = H(context);
        return new File(H, G + "." + str2);
    }

    public static void L(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean M(float f2) {
        return Float.compare(f2, Float.NaN) == 0;
    }

    public static ddb N(cyv cyvVar, int i2, dhj dhjVar, dhj dhjVar2) {
        tha thaVar = cyvVar.l;
        if (thaVar == null) {
            return null;
        }
        ddb D = D(cyvVar, thaVar, thaVar.a(cyvVar, i2));
        if (D != null) {
            String str = "null";
            D.a("section_current", dhjVar == null ? str : dhjVar.e);
            if (dhjVar2 != null) {
                str = dhjVar2.e;
            }
            D.a("section_next", str);
        }
        return D;
    }

    public static String O(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? "updateStateAsync" : "updateState" : "setRootAsync" : "setRoot" : "none";
    }

    public static void P(int i2, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i2) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                if (!bitSet.get(i3)) {
                    arrayList.add(strArr[i3]);
                }
            }
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            throw new IllegalStateException(valueOf.length() != 0 ? "The following props are not marked as optional and were not supplied: ".concat(valueOf) : new String("The following props are not marked as optional and were not supplied: "));
        }
    }

    public static void Q(czu czuVar, dhf dhfVar) {
        List list = dhfVar.a;
        dhy dhyVar = (dhy) czuVar;
        dhy.P(1, dhyVar.o, dhyVar.n);
        list.add(dhyVar.m);
    }

    private static boolean S(Field field, Class cls, Object obj, Object obj2, boolean z) {
        try {
            int a2 = ((dfs) field.getAnnotation(dfs.class)).a();
            switch (a2) {
                case 0:
                    if (Float.compare(((Float) obj).floatValue(), ((Float) obj2).floatValue()) != 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Double.compare(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()) != 0) {
                        return false;
                    }
                    break;
                case 2:
                    Class<?> componentType = cls.getComponentType();
                    if (!Byte.TYPE.isAssignableFrom(componentType) ? !(!Short.TYPE.isAssignableFrom(componentType) ? !Character.TYPE.isAssignableFrom(componentType) ? !Integer.TYPE.isAssignableFrom(componentType) ? !Long.TYPE.isAssignableFrom(componentType) ? !Float.TYPE.isAssignableFrom(componentType) ? !Double.TYPE.isAssignableFrom(componentType) ? !Boolean.TYPE.isAssignableFrom(componentType) ? Arrays.equals((Object[]) obj, (Object[]) obj2) : Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.equals((double[]) obj, (double[]) obj2) : Arrays.equals((float[]) obj, (float[]) obj2) : Arrays.equals((long[]) obj, (long[]) obj2) : Arrays.equals((int[]) obj, (int[]) obj2) : Arrays.equals((char[]) obj, (char[]) obj2) : Arrays.equals((short[]) obj, (short[]) obj2)) : !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                    break;
                case 3:
                    if (!obj.equals(obj2)) {
                        return false;
                    }
                    break;
                case 4:
                    if (!((dgw) obj).a((dgw) obj2)) {
                        return false;
                    }
                    break;
                case 5:
                    Collection collection = (Collection) obj;
                    Collection collection2 = (Collection) obj2;
                    if (collection == null ? collection2 != null : !collection.equals(collection2)) {
                        return false;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    if (!R(a2 - 5, (Collection) obj, (Collection) obj2)) {
                        return false;
                    }
                    break;
                case 10:
                case 15:
                    if (obj == null ? obj2 != null : !((dan) obj).f(obj2)) {
                        return false;
                    }
                    break;
                case 11:
                case 12:
                    if (obj == null ? obj2 != null : !((daq) obj).b((daq) obj2)) {
                        return false;
                    }
                    break;
                case 13:
                    if (obj == null ? obj2 != null : !obj.equals(obj2)) {
                        return false;
                    }
                    break;
                case 14:
                    if (z && !b(obj, obj2, true)) {
                        return false;
                    }
                    break;
            }
            return true;
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
            return false;
        }
    }

    private static int T(float f2) {
        return f2 >= 0.0f ? 1 : -1;
    }

    private static void U(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5) {
        int i6 = i2 > i4 ? i2 : i4;
        if (i2 > i4) {
            i2 = i4;
        }
        int i7 = i3 > i5 ? i3 : i5;
        if (i3 > i5) {
            i3 = i5;
        }
        canvas.drawRect(i2, i3, i6, i7, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static void addViewDescription(int i2, int i3, czt cztVar, StringBuilder sb, boolean z) {
        dab bb;
        sb.append("litho.");
        sb.append(cztVar.c().o());
        sb.append('{');
        sb.append(Integer.toHexString(cztVar.hashCode()));
        sb.append(' ');
        dci h2 = cztVar.h();
        czv g2 = cztVar.g();
        String str = "V";
        String str2 = ".";
        sb.append((h2 == null || h2.getVisibility() != 0) ? str2 : str);
        sb.append((g2 == null || (bb = g2.a.bb()) == null || bb.o != 1) ? str2 : "F");
        sb.append((h2 == null || !h2.isEnabled()) ? str2 : "E");
        sb.append(str2);
        sb.append((h2 == null || !h2.isHorizontalScrollBarEnabled()) ? str2 : "H");
        if (h2 == null || !h2.isVerticalScrollBarEnabled()) {
            str = str2;
        }
        sb.append(str);
        if (g2 != null && g2.a() != null) {
            str2 = "C";
        }
        sb.append(str2);
        sb.append(". .. ");
        Rect a2 = cztVar.a();
        sb.append(a2.left + i2);
        sb.append(",");
        sb.append(a2.top + i3);
        sb.append("-");
        sb.append(i2 + a2.right);
        sb.append(",");
        sb.append(i3 + a2.bottom);
        String str3 = null;
        String aq = cztVar.o() ? cztVar.b.aq() : null;
        if (aq != null && !TextUtils.isEmpty(aq)) {
            sb.append(String.format(" litho:id/%s", aq.replace(' ', '_')));
        }
        dci h3 = cztVar.h();
        if (h3 != null) {
            cyr c2 = cztVar.c();
            dcp dcpVar = h3.s;
            int a3 = dcpVar.a();
            int i4 = 0;
            while (true) {
                if (i4 >= a3) {
                    break;
                }
                dms g3 = dcpVar.g(i4);
                cyr cyrVar = g3 == null ? null : dbn.a(g3).b;
                if (cyrVar != null && cyrVar.k == c2.k) {
                    Object obj = g3.a;
                    StringBuilder sb2 = new StringBuilder();
                    if (obj instanceof TextContent) {
                        for (CharSequence charSequence : ((TextContent) obj).getTextItems()) {
                            sb2.append(charSequence);
                        }
                    } else if (obj instanceof TextView) {
                        sb2.append(((TextView) obj).getText());
                    }
                    if (sb2.length() != 0) {
                        str3 = sb2.toString();
                        break;
                    }
                }
                i4++;
            }
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            String replace = str3.replace("\n", "").replace("\"", "");
            if (replace.length() > 200) {
                replace = String.valueOf(replace.substring(0, 200)).concat("...");
            }
            sb.append(String.format(" text=\"%s\"", replace));
        }
        if (!z && g2 != null && g2.a() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
    }

    public static boolean b(Object obj, Object obj2, boolean z) {
        Field[] declaredFields;
        if (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) {
            throw new IllegalArgumentException("The input is invalid.");
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(dfs.class)) {
                Class<?> type = field.getType();
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    field.setAccessible(false);
                    boolean z2 = dfz.a;
                    if (!S(field, type, obj3, obj4, z)) {
                        return false;
                    }
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e2);
                }
            }
        }
        return true;
    }

    public static boolean c(cyr cyrVar, cyr cyrVar2) {
        if (cyrVar == cyrVar2) {
            return true;
        }
        if (cyrVar != null && cyrVar2 != null) {
            return cyrVar.getClass().equals(cyrVar2.getClass());
        }
        return false;
    }

    public static void d(czt cztVar, int i2, StringBuilder sb) {
        if (cztVar == null) {
            return;
        }
        sb.append(cztVar.c().o());
        sb.append('{');
        dci h2 = cztVar.h();
        czv g2 = cztVar.g();
        sb.append((h2 == null || h2.getVisibility() != 0) ? "H" : "V");
        if (g2 != null && g2.a() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
        for (czt cztVar2 : cztVar.m()) {
            sb.append("\n");
            for (int i3 = 0; i3 <= i2; i3++) {
                sb.append("  ");
            }
            d(cztVar2, i2 + 1, sb);
        }
    }

    public static dby e(dby dbyVar) {
        return dbyVar;
    }

    public static int f(float f2) {
        double d2;
        double d3;
        if (f2 > 0.0f) {
            d2 = f2;
            d3 = 0.5d;
        } else {
            d2 = f2;
            d3 = -0.5d;
        }
        Double.isNaN(d2);
        return (int) (d2 + d3);
    }

    public static void g(daq daqVar, View view, MotionEvent motionEvent) {
        if (n == null) {
            n = new dag();
        }
        n.b = motionEvent;
        n.a = view;
        daqVar.a.l().K(daqVar, n);
        n.b = null;
        n.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(daq daqVar) {
        if (q == null) {
            q = new dax();
        }
        daqVar.a(q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(daq daqVar) {
        if (s == null) {
            s = new day();
        }
        daqVar.a(s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(daq daqVar, View view) {
        if (p == null) {
            p = new dbl();
        }
        p.a = view;
        daqVar.a(p);
        p.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(daq daqVar) {
        if (r == null) {
            r = new dep();
        }
        daqVar.a(r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(daq daqVar, int i2, int i3, float f2, float f3) {
        if (t == null) {
            t = new der();
        }
        t.a = i3;
        t.b = i2;
        t.d = f3;
        t.c = f2;
        daqVar.a(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(daq daqVar, View view, View view2) {
        if (o == null) {
            o = new dev();
        }
        o.a = view;
        o.b = view2;
        daqVar.a(o);
        o.a = null;
        o.b = null;
    }

    public static int n(Resources resources, int i2) {
        return (int) ((i2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static void o(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6) {
        U(canvas, paint, i2, i3, i2 + i4, i3 + (T(i5) * i6));
        U(canvas, paint, i2, i3, i2 + (i6 * T(i4)), i3 + i5);
    }

    public static boolean p(View view) {
        return (dcp.c(view) == null && dcp.e(view) == null && dcp.f(view) == null) ? false : true;
    }

    public static boolean q(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            return drawable2 == null;
        } else if (drawable2 == null) {
            return false;
        } else {
            if (!(drawable instanceof dgw) || !(drawable2 instanceof dgw)) {
                return drawable.equals(drawable2);
            }
            return ((dgw) drawable).a((dgw) drawable2);
        }
    }

    public static void r() {
    }

    public static void s() {
    }

    public static void t() {
    }

    public static def u(dbk dbkVar) {
        String str;
        int i2;
        String str2;
        if (dbkVar.aQ()) {
            str = dbkVar.ar();
            int ba = dbkVar.ba();
            i2 = 2;
            if (ba == 1) {
                str2 = null;
                i2 = 1;
            } else if (ba == 2) {
                str2 = dbkVar.as();
            } else {
                String str3 = ba != 1 ? "null" : "GLOBAL";
                StringBuilder sb = new StringBuilder(str3.length() + 30);
                sb.append("Unhandled transition key type ");
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            cyr W = dbkVar.W();
            str = W != null ? W.m : null;
            i2 = 3;
            str2 = null;
        }
        if (str != null) {
            return new def(i2, str, str2);
        }
        return null;
    }

    public static void v(dee deeVar, List list, String str) {
        if (deeVar instanceof ddw) {
            list.addAll(((ddw) deeVar).a());
        } else if (deeVar != null) {
            list.add(deeVar);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
            sb.append("[");
            sb.append(str);
            sb.append("] Adding null to transition list is not allowed.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void w(def defVar, dee deeVar, dfe dfeVar, ddz ddzVar) {
        int i2 = 0;
        if (deeVar instanceof deo) {
            ArrayList arrayList = ((deo) deeVar).a;
            int size = arrayList.size();
            while (i2 < size) {
                w(defVar, (dee) arrayList.get(i2), dfeVar, ddzVar);
                i2++;
            }
        } else if (deeVar instanceof ded) {
            ded dedVar = (ded) deeVar;
            ddx ddxVar = dedVar.a.a;
            int i3 = ddxVar.b;
            if (!defVar.b.equals(ddxVar.a) || !dfeVar.equals(dedVar.a.b.a)) {
                return;
            }
            ddzVar.a = true;
            if (!dedVar.a()) {
                return;
            }
            ddzVar.b = dedVar;
        } else if (deeVar instanceof ddw) {
            ArrayList a2 = ((ddw) deeVar).a();
            int size2 = a2.size();
            while (i2 < size2) {
                w(defVar, (dee) a2.get(i2), dfeVar, ddzVar);
                i2++;
            }
        } else {
            String valueOf = String.valueOf(deeVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unhandled transition type: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }

    public static boolean x(Context context) {
        boolean z = dfz.a;
        if (dfz.f) {
            return false;
        }
        if (!dfz.e) {
            return true;
        }
        return (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) ? false : true;
    }

    public static boolean y() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static int z(float f2, YogaMeasureMode yogaMeasureMode) {
        YogaMeasureMode yogaMeasureMode2 = YogaMeasureMode.UNDEFINED;
        int ordinal = yogaMeasureMode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return View.MeasureSpec.makeMeasureSpec(f(f2), 1073741824);
            }
            if (ordinal == 2) {
                return View.MeasureSpec.makeMeasureSpec(f(f2), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            }
            String valueOf = String.valueOf(yogaMeasureMode);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unexpected YogaMeasureMode: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    private static boolean R(int i2, Collection collection, Collection collection2) {
        if (i2 > 0) {
            if (collection == null && collection2 == null) {
                return true;
            }
            if (collection == null || collection2 == null || collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (i2 == 1) {
                    if (!((cyr) it.next()).f((cyr) it2.next())) {
                        return false;
                    }
                } else if (!R(i2 - 1, (Collection) it.next(), (Collection) it2.next())) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Level cannot be < 1");
    }
}
