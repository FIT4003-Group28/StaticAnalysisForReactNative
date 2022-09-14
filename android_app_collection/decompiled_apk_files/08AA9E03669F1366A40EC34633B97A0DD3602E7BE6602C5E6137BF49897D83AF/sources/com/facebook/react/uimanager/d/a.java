package com.facebook.react.uimanager.d;

import android.view.View;
import com.facebook.react.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ReactFindViewUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<InterfaceC0072a> f3872a = new ArrayList();

    /* compiled from: ReactFindViewUtil.java */
    /* renamed from: com.facebook.react.uimanager.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0072a {
        String a();

        void a(View view);
    }

    public static void a(View view) {
        String b2 = b(view);
        if (b2 == null) {
            return;
        }
        Iterator<InterfaceC0072a> it = f3872a.iterator();
        while (it.hasNext()) {
            InterfaceC0072a next = it.next();
            if (b2 != null && b2.equals(next.a())) {
                next.a(view);
                it.remove();
            }
        }
    }

    private static String b(View view) {
        Object tag = view.getTag(f.a.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }
}
