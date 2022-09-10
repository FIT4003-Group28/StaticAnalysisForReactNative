package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyvx  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyvx implements Runnable {
    final /* synthetic */ dyvy b;

    public dyvx(dyvy dyvyVar) {
        this.b = dyvyVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}
