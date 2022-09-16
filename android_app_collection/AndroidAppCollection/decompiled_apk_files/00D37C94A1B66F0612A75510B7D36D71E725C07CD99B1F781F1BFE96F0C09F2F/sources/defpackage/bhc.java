package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bhc  reason: default package */
/* loaded from: classes2.dex */
public final class bhc {
    public final bhb a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public Bundle q;
    bga r;
    private int s;
    private IntentSender t;
    private Map v;
    public final ArrayList j = new ArrayList();
    public int p = -1;
    private List u = new ArrayList();

    public bhc(bhb bhbVar, String str, String str2) {
        this.a = bhbVar;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        if (!k() || bhd.d()) {
            return this.s;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r4.hasNext() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.bga r13) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhc.b(bga):int");
    }

    public final bgk c() {
        bhb bhbVar = this.a;
        bhd.c();
        return bhbVar.a;
    }

    public final List d() {
        return Collections.unmodifiableList(this.u);
    }

    public final void e(int i) {
        bgj bgjVar;
        bgj bgjVar2;
        bhd.c();
        bgw a = bhd.a();
        int min = Math.min(this.o, Math.max(0, i));
        if (this != a.s || (bgjVar2 = a.t) == null) {
            if (a.w.isEmpty() || (bgjVar = (bgj) a.w.get(this.c)) == null) {
                return;
            }
            bgjVar.b(min);
            return;
        }
        bgjVar2.b(min);
    }

    public final void f(int i) {
        bgj bgjVar;
        bgj bgjVar2;
        bhd.c();
        if (i != 0) {
            bgw a = bhd.a();
            if (this != a.s || (bgjVar2 = a.t) == null) {
                if (a.w.isEmpty() || (bgjVar = (bgj) a.w.get(this.c)) == null) {
                    return;
                }
                bgjVar.c(i);
                return;
            }
            bgjVar2.c(i);
        }
    }

    public final void g() {
        bhd.c();
        bhd.a().j(this, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new afw();
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bgf bgfVar = (bgf) it.next();
            bhc b = this.a.b(bgfVar.a.n());
            if (b != null) {
                this.v.put(b.c, bgfVar);
                int i = bgfVar.b;
                if (i == 2 || i == 3) {
                    this.u.add(b);
                }
            }
        }
        bhd.a().m.a(259, this);
    }

    public final boolean i() {
        bhd.c();
        return bhd.a().d() == this;
    }

    public final boolean j() {
        if (i() || this.m == 3) {
            return true;
        }
        return TextUtils.equals(c().f.a(), "android") && o("android.media.intent.category.LIVE_AUDIO") && !o("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean k() {
        return d().size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.r != null && this.g;
    }

    public final boolean m() {
        bhd.c();
        return bhd.a().e() == this;
    }

    public final boolean o(String str) {
        bhd.c();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) this.j.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.s + ", volume=" + this.n + ", volumeMax=" + this.o + ", presentationDisplayId=" + this.p + ", extras=" + this.q + ", settingsIntent=" + this.t + ", providerPackageName=" + this.a.c());
        if (k()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((bhc) this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final boolean n(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        bhd.c();
        ArrayList<IntentFilter> arrayList = this.j;
        bgoVar.c();
        if (bgoVar.c.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                for (String str : bgoVar.c) {
                    if (intentFilter.hasCategory(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
