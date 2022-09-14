package b.a.a.a;

import b.a.a.a.a.b.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializationTask.java */
/* loaded from: classes.dex */
public class h<Result> extends b.a.a.a.a.c.f<Void, Void, Result> {

    /* renamed from: a  reason: collision with root package name */
    final i<Result> f1267a;

    public h(i<Result> iVar) {
        this.f1267a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.a.c.a
    public void a() {
        super.a();
        u a2 = a("onPreExecute");
        try {
            try {
                boolean onPreExecute = this.f1267a.onPreExecute();
                a2.b();
                if (onPreExecute) {
                    return;
                }
            } catch (b.a.a.a.a.c.m e) {
                throw e;
            } catch (Exception e2) {
                c.h().e("Fabric", "Failure onPreExecute()", e2);
                a2.b();
            }
            a(true);
        } catch (Throwable th) {
            a2.b();
            a(true);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.a.c.a
    public Result a(Void... voidArr) {
        u a2 = a("doInBackground");
        Result mo24doInBackground = !d() ? this.f1267a.mo24doInBackground() : null;
        a2.b();
        return mo24doInBackground;
    }

    @Override // b.a.a.a.a.c.a
    protected void a(Result result) {
        this.f1267a.onPostExecute(result);
        this.f1267a.initializationCallback.a((f<Result>) result);
    }

    @Override // b.a.a.a.a.c.a
    protected void b(Result result) {
        this.f1267a.onCancelled(result);
        this.f1267a.initializationCallback.a(new g(this.f1267a.getIdentifier() + " Initialization was cancelled"));
    }

    @Override // b.a.a.a.a.c.f, b.a.a.a.a.c.i
    public b.a.a.a.a.c.e getPriority() {
        return b.a.a.a.a.c.e.HIGH;
    }

    private u a(String str) {
        u uVar = new u(this.f1267a.getIdentifier() + "." + str, "KitInitialization");
        uVar.a();
        return uVar;
    }
}
