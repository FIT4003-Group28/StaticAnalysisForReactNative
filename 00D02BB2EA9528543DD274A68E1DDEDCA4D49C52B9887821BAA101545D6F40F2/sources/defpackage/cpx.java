package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpx  reason: default package */
/* loaded from: classes5.dex */
public final class cpx implements pp {
    final /* synthetic */ cpy a;

    public cpx(cpy cpyVar) {
        this.a = cpyVar;
    }

    @Override // defpackage.pp
    public final boolean a(View view) {
        CharSequence contentDescription;
        AccessibilityManager accessibilityManager;
        dzvx.c(view, "host");
        cpy cpyVar = this.a;
        int[] iArr = cpyVar.b;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(view.findViewById(i));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList<View> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((View) obj2).getVisibility() == 0) {
                arrayList3.add(obj2);
            }
        }
        for (View view2 : arrayList3) {
            if (cpy.c != null) {
                accessibilityManager = cpy.c;
                if (accessibilityManager == null) {
                    dzvx.a("lateAccessibilityManager");
                    accessibilityManager = null;
                }
            } else {
                Context context = view2.getContext();
                dzvx.b(context, "context");
                Object systemService = context.getSystemService("accessibility");
                if (systemService != null) {
                    accessibilityManager = (AccessibilityManager) systemService;
                    cpy.c = accessibilityManager;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                }
            }
            view2.setImportantForAccessibility(true != accessibilityManager.isTouchExplorationEnabled() ? 0 : 2);
        }
        ArrayList<oy> arrayList4 = new ArrayList(dzti.d(arrayList3, 10));
        for (View view3 : arrayList3) {
            int id = view3.getId();
            if (view3 instanceof TextView) {
                TextView textView = (TextView) view3;
                CharSequence text = textView.getText();
                dzvx.b(text, "text");
                if (!dzxg.a(text)) {
                    contentDescription = textView.getText();
                    dzvx.b(contentDescription, "text");
                    arrayList4.add(new oy(id, contentDescription));
                }
            }
            contentDescription = view3.getContentDescription();
            dzvx.b(contentDescription, "contentDescription");
            arrayList4.add(new oy(id, contentDescription));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(dzwj.a(dztz.a(dzti.d(arrayList4, 10)), 16));
        for (oy oyVar : arrayList4) {
            dzsx a = dzsz.a(oyVar, new cpw(oyVar.a()));
            linkedHashMap.put(a.a, a.b);
        }
        cpyVar.a = linkedHashMap;
        return false;
    }
}
