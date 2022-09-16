package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: asx  reason: default package */
/* loaded from: classes2.dex */
public final class asx {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public Object j;

    public asx() {
        this.c = 1;
        this.e = Collections.emptyMap();
        this.g = -1L;
    }

    public asx(asy asyVar) {
        this.a = asyVar.a;
        this.b = asyVar.b;
        this.c = asyVar.c;
        this.d = asyVar.d;
        this.e = asyVar.e;
        this.f = asyVar.g;
        this.g = asyVar.h;
        this.h = asyVar.i;
        this.i = asyVar.j;
        this.j = asyVar.k;
    }

    public final asy a() {
        ptx.h(this.a, "The uri must be set.");
        return new asy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }
}
