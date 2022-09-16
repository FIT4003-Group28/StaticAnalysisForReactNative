package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vjb  reason: default package */
/* loaded from: classes4.dex */
public final class vjb {
    private final Map a;
    private final Map b;
    private final List c;

    public vjb(List list) {
        List<vkr> emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vkm vkmVar = (vkm) it.next();
            if (TextUtils.isEmpty(vkmVar.h())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                vkm vkmVar2 = (vkm) this.a.put(vkmVar.h(), vkmVar);
                if (vkmVar2 != null) {
                    String canonicalName = vkmVar2.getClass().getCanonicalName();
                    String canonicalName2 = vkmVar.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        for (vkr vkrVar : emptyList) {
            if (TextUtils.isEmpty(vkrVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                vkr vkrVar2 = (vkr) this.b.put(vkrVar.a(), vkrVar);
                if (vkrVar2 != null) {
                    String canonicalName3 = vkrVar2.getClass().getCanonicalName();
                    String canonicalName4 = vkrVar.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb2.append("Cannot to override Transform ");
                    sb2.append(canonicalName3);
                    sb2.append(" with ");
                    sb2.append(canonicalName4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        this.c.addAll(emptyList2);
    }

    private static final Uri k(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final viz l(Uri uri) {
        amuk n = n(uri);
        viy viyVar = new viy();
        viyVar.a = this;
        viyVar.b = m(uri.getScheme());
        viyVar.d = this.c;
        viyVar.c = n;
        viyVar.e = uri;
        if (!n.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = n.listIterator(n.size());
                while (listIterator.hasPrevious()) {
                    str = ((vkr) listIterator.previous()).c();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        viyVar.f = uri;
        return new viz(viyVar);
    }

    private final vkm m(String str) {
        vkm vkmVar = (vkm) this.a.get(str);
        if (vkmVar != null) {
            return vkmVar;
        }
        throw new vjw(String.format("Cannot open, unregistered backend: %s", str));
    }

    private final amuk n(Uri uri) {
        amuf f = amuk.f();
        amuk a = vkc.a(uri);
        int i = ((amxx) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) a.get(i2);
            vkr vkrVar = (vkr) this.b.get(str);
            if (vkrVar != null) {
                f.h(vkrVar);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new vjw(sb.toString());
            }
        }
        return f.g().a();
    }

    public final long a(Uri uri) {
        viz l = l(uri);
        return l.b.a(l.f);
    }

    public final Iterable b(Uri uri) {
        vkm m = m(uri.getScheme());
        amuk<vkr> n = n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        for (Uri uri2 : m.g(k(uri))) {
            Uri build = uri2.buildUpon().encodedFragment(encodedFragment).build();
            if (!n.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) arey.s(arrayList2);
                    for (vkr vkrVar : n) {
                        str = vkrVar.b();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final Object c(Uri uri, vja vjaVar) {
        return vjaVar.a(l(uri));
    }

    public final void d(Uri uri) {
        m(uri.getScheme()).i(k(uri));
    }

    public final void e(Uri uri) {
        m(uri.getScheme()).j(k(uri));
    }

    public final void f(Uri uri) {
        viz l = l(uri);
        l.b.k(l.f);
    }

    public final void g(Uri uri, Uri uri2) {
        viz l = l(uri);
        viz l2 = l(uri2);
        vkm vkmVar = l.b;
        if (vkmVar == l2.b) {
            vkmVar.l(l.f, l2.f);
            return;
        }
        throw new vjw("Cannot rename file across backends");
    }

    public final boolean h(Uri uri) {
        viz l = l(uri);
        return l.b.m(l.f);
    }

    public final boolean i(Uri uri) {
        return m(uri.getScheme()).n(k(uri));
    }

    @Deprecated
    public final void j(Uri uri) {
        if (!h(uri)) {
            return;
        }
        if (!i(uri)) {
            f(uri);
            return;
        }
        for (Uri uri2 : b(uri)) {
            j(uri2);
        }
        e(uri);
    }
}
