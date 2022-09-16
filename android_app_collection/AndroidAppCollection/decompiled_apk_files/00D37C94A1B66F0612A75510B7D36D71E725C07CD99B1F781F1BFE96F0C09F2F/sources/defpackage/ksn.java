package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ksn  reason: default package */
/* loaded from: classes3.dex */
public final class ksn {
    public avhn a;
    public int b;
    public String c;
    public apzg d;
    public String f;
    public String g;
    private String i;
    private String j;
    private Instant l;
    private final List k = new ArrayList();
    public int h = 1;
    public boolean e = true;

    public final kso a() {
        if (this.l == null) {
            e(0L);
        }
        boolean z = this.e;
        String str = this.i;
        String str2 = this.j;
        int i = this.h;
        avhn avhnVar = this.a;
        int i2 = this.b;
        List list = this.k;
        Instant instant = this.l;
        instant.getClass();
        return new kso(z, str, str2, i, avhnVar, i2, list, instant, this.c, this.d, this.f, this.g);
    }

    public final void b(avhn avhnVar) {
        List list = this.k;
        avhnVar.getClass();
        list.add(avhnVar);
    }

    public final void c(String str) {
        str.getClass();
        this.i = str;
    }

    public final void d(String str) {
        str.getClass();
        this.j = str;
    }

    public final void e(long j) {
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        ofEpochMilli.getClass();
        this.l = ofEpochMilli;
    }
}
