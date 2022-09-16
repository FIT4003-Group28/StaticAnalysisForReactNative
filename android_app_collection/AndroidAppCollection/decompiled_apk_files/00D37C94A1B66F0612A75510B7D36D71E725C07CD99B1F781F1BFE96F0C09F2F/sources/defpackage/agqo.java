package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agqo  reason: default package */
/* loaded from: classes.dex */
public final class agqo {
    public final agqa a;
    public final aalc b;
    public final boolean c;
    public final Date d;
    public final atsl e;

    public agqo(atsl atslVar, boolean z, aalc aalcVar, agqa agqaVar) {
        atslVar.getClass();
        this.e = atslVar;
        this.c = z;
        this.b = aalcVar;
        this.a = agqaVar;
        if (!atslVar.j.isEmpty()) {
            Uri.parse(atslVar.j);
        }
        this.d = new Date(TimeUnit.SECONDS.toMillis(atslVar.h));
    }

    public static agqo c(atsl atslVar) {
        avhn avhnVar = atslVar.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        aalc aalcVar = new aalc(avhnVar);
        atqf atqfVar = atslVar.e;
        if (atqfVar == null) {
            atqfVar = atqf.a;
        }
        return new agqo(atslVar, false, aalcVar, agqa.a(atqfVar));
    }

    public final long a() {
        return this.e.o;
    }

    public final long b() {
        return this.e.i;
    }

    public final avhn d() {
        aalc aalcVar = this.b;
        if (aalcVar != null) {
            return aalcVar.e();
        }
        return null;
    }

    public final String e() {
        return this.e.n;
    }

    public final String f() {
        return this.e.c;
    }

    public final String g() {
        return this.e.g;
    }

    public final String h() {
        return this.e.m;
    }

    public final String i() {
        return this.e.l;
    }

    public final String j() {
        return this.e.f;
    }
}
