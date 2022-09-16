package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zjb  reason: default package */
/* loaded from: classes4.dex */
public final class zjb implements zjd, ynl {
    public final snc a;
    public final ziw b;
    public final Map c;
    public final Map d;
    public final afvn e;
    public afvm f;
    private final axnm g;

    public zjb(yni yniVar, snc sncVar, ziw ziwVar, axnm axnmVar, afvn afvnVar) {
        sncVar.getClass();
        this.a = sncVar;
        this.c = new HashMap();
        this.d = new HashMap();
        yniVar.g(this);
        ziwVar.getClass();
        this.b = ziwVar;
        axnmVar.getClass();
        this.g = axnmVar;
        afvnVar.getClass();
        this.e = afvnVar;
    }

    public static Uri a(Uri uri) {
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        if (arrayList.size() == 0) {
            return Uri.EMPTY;
        }
        arrayList.remove(arrayList.size() - 1);
        return new Uri.Builder().scheme(uri.getScheme()).path(TextUtils.join("/", arrayList)).build();
    }

    public static boolean i(Uri uri) {
        return TextUtils.isEmpty(uri.getPath()) && TextUtils.isEmpty(uri.getScheme());
    }

    private final void j(List list, Uri uri) {
        if (b(uri) != null) {
            list.add(uri);
        }
        Set<Uri> c = c(uri);
        if (c != null) {
            for (Uri uri2 : c) {
                j(list, uri2);
            }
        }
    }

    public final Object b(Uri uri) {
        List<Uri> singletonList = Collections.singletonList(uri);
        aqxo.y(this.g != null);
        e();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : singletonList) {
            zja zjaVar = (zja) this.c.get(uri2);
            if (zjaVar != null && zjaVar.a(this.a)) {
                arrayList.add(uri2);
            }
            if (zjaVar != null) {
                hashMap.put(uri2, zjaVar.a);
            }
        }
        if (!arrayList.isEmpty()) {
            ((zje) this.g.get()).b(arrayList);
        }
        return hashMap.get(uri);
    }

    public final Set c(Uri uri) {
        return (Set) this.d.get(uri);
    }

    public final void d() {
        this.c.clear();
        this.d.clear();
    }

    public final void e() {
        ylr.c();
        afvm afvmVar = this.f;
        afvm c = this.e.c();
        this.f = c;
        if (afvmVar == null && c == null) {
            return;
        }
        if (afvmVar != null && c != null && TextUtils.equals(afvmVar.b(), this.f.b())) {
            return;
        }
        d();
    }

    @Override // defpackage.zjd
    public final void g(Collection collection, final zis zisVar) {
        aqxo.y(this.g != null);
        e();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            zja zjaVar = (zja) this.c.get(uri);
            if (zjaVar == null || zjaVar.a(this.a)) {
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((zje) this.g.get()).c(arrayList, new zis() { // from class: ziz
            @Override // defpackage.zis
            public final void a() {
                zis zisVar2 = zis.this;
                zir zirVar = new zir(false);
                akku akkuVar = (akku) zisVar2;
                akkuVar.h();
                if (zirVar.a || akkuVar.d == null || akkuVar.e == null) {
                    ((akmx) akkuVar.b).ku();
                } else {
                    akkuVar.d();
                }
            }
        });
    }

    public final void h(Uri uri) {
        ArrayList arrayList = new ArrayList();
        j(arrayList, uri);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) arrayList.get(i);
            this.c.remove(uri2);
            if (c(uri2) == null) {
                do {
                    this.d.remove(uri2);
                    Uri a = a(uri2);
                    Map map = this.d;
                    if (map.containsKey(a) && ((LinkedHashSet) map.get(a)).contains(uri2)) {
                        ((LinkedHashSet) map.get(a)).remove(uri2);
                    }
                    Set set = (Set) this.d.get(a);
                    if (set != null && set.size() == 0) {
                        this.d.remove(a);
                    }
                    uri2 = a(uri2);
                    if (!i(uri2) && c(uri2) == null) {
                    }
                } while (b(uri2) == null);
            }
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                ylr.c();
                d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }
}
