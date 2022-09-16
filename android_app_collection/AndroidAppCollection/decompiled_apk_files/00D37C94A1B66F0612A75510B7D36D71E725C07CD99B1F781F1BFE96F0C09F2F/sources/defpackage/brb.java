package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: brb  reason: default package */
/* loaded from: classes2.dex */
public final class brb extends aek {
    private static final String g = bqf.b("WorkContinuationImpl");
    public final brq a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private bqk i;

    public brb(brq brqVar, String str, int i, List list) {
        this(brqVar, str, i, list, null);
    }

    public static Set e() {
        return new HashSet();
    }

    public final bqk d() {
        if (!this.e) {
            bvf bvfVar = new bvf(this);
            this.a.j.a(bvfVar);
            this.i = bvfVar.a;
        } else {
            bqf.a();
            bqf.g(g, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.d)), new Throwable[0]);
        }
        return this.i;
    }

    public brb(brq brqVar, String str, int i, List list, byte[] bArr) {
        this.a = brqVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a = ((bqq) list.get(i2)).a();
            this.d.add(a);
            this.h.add(a);
        }
    }
}
