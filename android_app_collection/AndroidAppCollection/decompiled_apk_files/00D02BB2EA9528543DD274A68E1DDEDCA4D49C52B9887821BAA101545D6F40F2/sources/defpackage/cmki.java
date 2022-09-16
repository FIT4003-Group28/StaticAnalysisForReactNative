package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmki  reason: default package */
/* loaded from: classes5.dex */
public final class cmki {
    public Uri a;
    public long b;
    public final int c;
    public Map<String, String> d;
    public long e;
    public long f;
    public String g;
    public int h;

    public cmki() {
        this.c = 1;
        this.d = Collections.emptyMap();
        this.f = -1L;
    }

    public cmki(cmkj cmkjVar) {
        this.a = cmkjVar.a;
        this.b = cmkjVar.b;
        this.c = 1;
        this.d = cmkjVar.e;
        this.e = cmkjVar.f;
        this.f = cmkjVar.g;
        this.g = cmkjVar.h;
        this.h = cmkjVar.i;
    }

    public final cmkj a() {
        cmmn.i(this.a, "The uri must be set.");
        return new cmkj(this.a, this.b, 1, this.d, this.e, this.f, this.g, this.h);
    }
}
