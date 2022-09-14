package com.facebook.react.uimanager.i1;

import android.view.View;
import com.facebook.react.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f5988a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<InterfaceC0133a, Set<String>> f5989b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.i1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133a {
        void a(View view, String str);
    }

    /* loaded from: classes.dex */
    public interface b {
        String a();

        void a(View view);
    }

    private static String a(View view) {
        Object tag = view.getTag(h.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void b(View view) {
        String a2 = a(view);
        if (a2 == null) {
            return;
        }
        Iterator<b> it = f5988a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (a2 != null && a2.equals(next.a())) {
                next.a(view);
                it.remove();
            }
        }
        for (Map.Entry<InterfaceC0133a, Set<String>> entry : f5989b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(a2)) {
                entry.getKey().a(view, a2);
            }
        }
    }
}
