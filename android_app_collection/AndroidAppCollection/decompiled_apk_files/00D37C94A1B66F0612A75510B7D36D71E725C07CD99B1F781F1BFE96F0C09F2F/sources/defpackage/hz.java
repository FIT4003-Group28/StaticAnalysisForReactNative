package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaDescription;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: hz  reason: default package */
/* loaded from: classes3.dex */
public class hz {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void c(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void g(Object obj) {
        obj.getClass();
    }

    public static void h(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static String l(String str, int i) {
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        sb.append(str);
        sb.append('!');
        sb.append(i);
        return sb.toString();
    }

    public static TextContent m(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextContent ? (TextContent) obj : TextContent.b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new cyy(arrayList);
    }

    public static void n(dms dmsVar) {
        if (dbn.a(dmsVar).d()) {
            ((ComponentHost) dmsVar.b).k();
        }
    }

    public static void o(int i, int i2, age ageVar, age ageVar2) {
        Object e;
        if (r(i, ageVar2)) {
            e = ageVar2.e(i);
            ageVar2.l(i);
        } else {
            e = ageVar.e(i);
            ageVar.l(i);
        }
        ageVar.k(i2, e);
    }

    public static void p(int i, age ageVar, age ageVar2) {
        if (r(i, ageVar2)) {
            ageVar2.l(i);
        } else {
            ageVar.l(i);
        }
    }

    public static void q(int i, age ageVar, age ageVar2) {
        Object e;
        if (ageVar == null || ageVar2 == null || (e = ageVar.e(i)) == null) {
            return;
        }
        ageVar2.k(i, e);
    }

    static boolean r(int i, age ageVar) {
        return (ageVar == null || ageVar.e(i) == null) ? false : true;
    }

    public static void s(View view, Drawable drawable, int i, dab dabVar) {
        if (((dabVar == null || !dabVar.s()) && !dbn.e(i)) || !drawable.isStateful()) {
            return;
        }
        drawable.setState(view.getDrawableState());
    }

    public static List t(List list, Object obj) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(obj);
        return list;
    }

    public static boolean u(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r8 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(android.view.View r3, int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r0 = r6 - r4
            int r1 = r7 - r5
            if (r8 != 0) goto L12
            int r2 = r3.getMeasuredHeight()
            if (r2 != r1) goto L12
            int r2 = r3.getMeasuredWidth()
            if (r2 == r0) goto L21
        L12:
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r3.measure(r0, r1)
            if (r8 != 0) goto L3b
        L21:
            int r8 = r3.getLeft()
            if (r8 != r4) goto L3b
            int r8 = r3.getTop()
            if (r8 != r5) goto L3b
            int r8 = r3.getRight()
            if (r8 != r6) goto L3b
            int r8 = r3.getBottom()
            if (r8 == r7) goto L3a
            goto L3b
        L3a:
            return
        L3b:
            r3.layout(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz.v(android.view.View, int, int, int, int, boolean):void");
    }

    public static void w(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i, bounds.top + i2);
        if (drawable instanceof dcl) {
            ((dcl) drawable).a(i, i2);
        }
    }

    public static void x(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
    }

    public void i() {
    }

    public void j() {
    }
}
