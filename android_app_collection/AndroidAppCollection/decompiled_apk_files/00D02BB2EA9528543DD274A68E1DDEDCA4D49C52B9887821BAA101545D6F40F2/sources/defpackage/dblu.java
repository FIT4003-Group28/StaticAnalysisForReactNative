package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dblu  reason: default package */
/* loaded from: classes5.dex */
public final class dblu implements Runnable {
    final /* synthetic */ dblv a;
    final /* synthetic */ dyjl b;

    public dblu(dblv dblvVar, dyjl dyjlVar) {
        this.a = dblvVar;
        this.b = dyjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dblv dblvVar = this.a;
        dyjl dyjlVar = this.b;
        try {
            dyjlVar.a(dblvVar.c());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                dyjlVar.a.b(dyjb.m.g("Credentials failed to obtain metadata").f(th));
            } else {
                dyjlVar.a.b(dyjb.i.g("Failed computing credential metadata").f(th));
            }
        }
    }
}
