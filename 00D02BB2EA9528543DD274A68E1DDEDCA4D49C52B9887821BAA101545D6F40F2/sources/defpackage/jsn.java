package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jsn  reason: default package */
/* loaded from: classes7.dex */
public class jsn implements jrb {
    public final jsh a;
    @dzsi
    private final jqz b;
    private final List<jre> c;
    private final cjtd e;
    private final jra d = new jsm(this);
    private boolean f = false;

    public jsn(jsh jshVar, @dzsi jqz jqzVar, List<jre> list, cjtd cjtdVar) {
        this.b = jqzVar;
        this.c = list;
        this.a = jshVar;
        this.e = cjtdVar;
    }

    @Override // defpackage.jrb
    public List<jre> a() {
        return this.c;
    }

    @Override // defpackage.jrb
    public void b(boolean z) {
        this.f = z;
    }

    @Override // defpackage.jrb
    @dzsi
    public jra c() {
        if (this.f) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.jrb
    @dzsi
    public jqz d() {
        return this.b;
    }

    @Override // defpackage.jrb
    public cjtd e() {
        return this.e;
    }
}
