package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: amkk  reason: default package */
/* loaded from: classes.dex */
abstract class amkk implements amlv {
    public final amlv a;
    public final UUID b;
    private final String c;

    public amkk(String str, UUID uuid) {
        str.getClass();
        this.c = str;
        this.a = null;
        this.b = uuid;
    }

    @Override // defpackage.amlv
    public final amlv a() {
        return this.a;
    }

    @Override // defpackage.amlv
    public final String b() {
        return this.c;
    }

    @Override // defpackage.amlv
    public final UUID c() {
        return this.b;
    }

    @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        amna.i(this);
    }

    public final String toString() {
        return amna.g(this);
    }

    public amkk(String str, amlv amlvVar, amlt amltVar) {
        str.getClass();
        this.c = str;
        this.a = amlvVar;
        this.b = amlvVar.c();
        aqxo.p(amltVar.c);
    }

    public amkk(String str, UUID uuid, amlt amltVar) {
        this(str, uuid);
        aqxo.p(amltVar.c);
    }
}
