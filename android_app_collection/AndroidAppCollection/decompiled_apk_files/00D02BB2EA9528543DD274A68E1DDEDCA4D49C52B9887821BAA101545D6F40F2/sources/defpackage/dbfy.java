package defpackage;
/* compiled from: PG */
/* renamed from: dbfy  reason: default package */
/* loaded from: classes5.dex */
public final class dbfy implements Runnable {
    private final dbgb a;
    private final dbfz b;

    public dbfy(dbfz dbfzVar, dbgb dbgbVar) {
        this.b = dbfzVar;
        this.a = dbgbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbix.a();
        this.b.c();
        this.a.c();
    }
}
