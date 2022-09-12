package defpackage;

import android.content.Context;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: atwd  reason: default package */
/* loaded from: classes2.dex */
public class atwd implements atyd {
    private final cjtd a;
    private final cqsn b;
    private final atwc c;
    private final atwb d;
    private final cqfc e;
    private final cqfc f;
    private Boolean g = false;

    public atwd(cqhn cqhnVar, Context context, cjtd cjtdVar, atwb atwbVar, cqsn cqsnVar, int i, int i2, atwc atwcVar, atvy atvyVar) {
        this.a = cjtdVar;
        this.d = atwbVar;
        this.b = cqsnVar;
        this.c = atwcVar;
        this.e = new atwa(context);
        this.f = new atvz(new Handler(), context, azz.a(context, i), azz.a(context, i2), atvyVar);
    }

    @Override // defpackage.atyd
    public cqsn a() {
        return this.b;
    }

    @Override // defpackage.atyd
    public cqkl b() {
        if (!this.g.booleanValue() && !this.d.a()) {
            this.g = true;
            this.c.a();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.atyd
    public cjtd c() {
        return this.a;
    }

    @Override // defpackage.atyd
    public Boolean d() {
        return this.g;
    }

    @Override // defpackage.atyd
    public cqfc e() {
        return this.e;
    }

    @Override // defpackage.atyd
    public cqfc f() {
        return this.f;
    }
}
