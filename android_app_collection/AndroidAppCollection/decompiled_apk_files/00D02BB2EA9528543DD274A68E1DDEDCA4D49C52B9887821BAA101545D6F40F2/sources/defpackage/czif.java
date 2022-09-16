package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: czif  reason: default package */
/* loaded from: classes5.dex */
public final class czif {
    private final Map<String, czjl> a;
    private final Map<String, czjq> b;
    private final List<czjp> c;

    public czif(List<czjl> list) {
        czjq put;
        czjl put2;
        List<czjq> emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        for (czjl czjlVar : list) {
            if (!TextUtils.isEmpty(czjlVar.a()) && (put2 = this.a.put(czjlVar.a(), czjlVar)) != null) {
                String canonicalName = put2.getClass().getCanonicalName();
                String canonicalName2 = czjlVar.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                sb.append("Cannot override Backend ");
                sb.append(canonicalName);
                sb.append(" with ");
                sb.append(canonicalName2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        for (czjq czjqVar : emptyList) {
            if (!TextUtils.isEmpty(czjqVar.a()) && (put = this.b.put(czjqVar.a(), czjqVar)) != null) {
                String canonicalName3 = put.getClass().getCanonicalName();
                String canonicalName4 = czjqVar.getClass().getCanonicalName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                sb2.append("Cannot to override Transform ");
                sb2.append(canonicalName3);
                sb2.append(" with ");
                sb2.append(canonicalName4);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        this.c.addAll(emptyList2);
    }

    private final czid e(Uri uri, czio... czioVarArr) {
        dccx F = dcdc.F();
        dcdc<String> a = czje.a(uri);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            String str = a.get(i);
            czjq czjqVar = this.b.get(str);
            if (czjqVar != null) {
                F.g(czjqVar);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new cziz(sb.toString());
            }
        }
        dcdc SL = F.f().SL();
        czic czicVar = new czic();
        String scheme = uri.getScheme();
        czjl czjlVar = this.a.get(scheme);
        if (czjlVar != null) {
            czicVar.a = czjlVar;
            czicVar.c = this.c;
            czicVar.b = SL;
            czicVar.d = uri;
            if (!SL.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    ListIterator<E> listIterator = SL.listIterator(SL.size());
                    while (listIterator.hasPrevious()) {
                        str2 = ((czjq) listIterator.previous()).b();
                    }
                    arrayList.set(arrayList.size() - 1, str2);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            czicVar.e = uri;
            czicVar.f = Arrays.asList(czioVarArr);
            return new czid(czicVar);
        }
        throw new cziz(String.format("Cannot open, unregistered backend: %s", scheme));
    }

    public final void a(Uri uri) {
        czid e = e(uri, new czio[0]);
        e.a.e(e.e);
    }

    public final boolean b(Uri uri) {
        czid e = e(uri, new czio[0]);
        return e.a.b(e.e);
    }

    public final void c(Uri uri, Uri uri2) {
        czid e = e(uri, new czio[0]);
        czid e2 = e(uri2, new czio[0]);
        czjl czjlVar = e.a;
        if (czjlVar == e2.a) {
            czjlVar.f(e.e, e2.e);
            return;
        }
        throw new cziz("Cannot rename file across backends");
    }

    public final <T> T d(Uri uri, czie<T> czieVar, czio... czioVarArr) {
        return czieVar.a(e(uri, czioVarArr));
    }
}
