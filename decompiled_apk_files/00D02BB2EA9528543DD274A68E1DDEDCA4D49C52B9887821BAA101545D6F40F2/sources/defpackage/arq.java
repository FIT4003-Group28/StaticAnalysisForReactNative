package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: arq  reason: default package */
/* loaded from: classes2.dex */
public final class arq {
    public final arp a;
    final String b;
    public final String c;
    public String d;
    public String e;
    boolean f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    aqn n;
    private Uri o;
    private int p;
    private boolean q;
    private Bundle s;
    private IntentSender t;
    private Map<String, aqt> v;
    public final ArrayList<IntentFilter> g = new ArrayList<>();
    private int r = -1;
    private List<arq> u = new ArrayList();

    public arq(arp arpVar, String str, String str2) {
        this.a = arpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        arv.a();
        return arv.a.a() == this;
    }

    public final boolean b(String str) {
        arv.a();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            if (this.g.get(i).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.n != null && this.f;
    }

    public final void d() {
        arv.a();
        arv.a.c(this, 3);
    }

    public final boolean e() {
        return f().size() > 0;
    }

    public final List<arq> f() {
        return Collections.unmodifiableList(this.u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r4.hasNext() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.aqn r12) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arq.g(aqn):int");
    }

    public final aqy h() {
        arp arpVar = this.a;
        arv.a();
        return arpVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Collection<aqt> collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new aif();
        }
        this.v.clear();
        for (aqt aqtVar : collection) {
            arq c = this.a.c(aqtVar.a.a());
            if (c != null) {
                this.v.put(c.c, aqtVar);
                int i = aqtVar.b;
                if (i == 2 || i == 3) {
                    this.u.add(c);
                }
            }
        }
        arv.a.h.a(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.o + ", enabled=" + this.f + ", connectionState=" + this.p + ", canDisconnect=" + this.q + ", playbackType=" + this.h + ", playbackStream=" + this.i + ", deviceType=" + this.j + ", volumeHandling=" + this.k + ", volume=" + this.l + ", volumeMax=" + this.m + ", presentationDisplayId=" + this.r + ", extras=" + this.s + ", settingsIntent=" + this.t + ", providerPackageName=" + this.a.a());
        if (e()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(this.u.get(i).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
