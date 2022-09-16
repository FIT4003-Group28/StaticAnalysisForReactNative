package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agxn  reason: default package */
/* loaded from: classes.dex */
public abstract class agxn extends Service implements agxs {
    public Executor a;
    public boolean c;
    public Set d;
    public agxt e;
    public agyy f;
    private agxm h;
    public final Map b = new HashMap();
    protected boolean g = false;

    protected abstract agxt a(agxs agxsVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        throw null;
    }

    @Override // defpackage.agxs
    public void c(boolean z) {
        throw null;
    }

    @Override // defpackage.agxs
    public void d(Map map) {
        throw null;
    }

    @Override // defpackage.agxs
    public void e(agqz agqzVar) {
        throw null;
    }

    @Override // defpackage.agxs
    public final void f(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.d(agqzVar);
        }
    }

    @Override // defpackage.agxs
    public void g(agqz agqzVar, boolean z) {
        throw null;
    }

    @Override // defpackage.agxs
    public void h(agqz agqzVar) {
        throw null;
    }

    @Override // defpackage.agxs
    public final void i(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.h(agqzVar);
        }
    }

    @Override // defpackage.agxs
    public final void j(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.i(agqzVar);
        }
    }

    @Override // defpackage.agxs
    public final void k(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.j(agqzVar);
        }
    }

    @Override // defpackage.agxs
    public void l(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        throw null;
    }

    @Override // defpackage.agxs
    public final void m(agqz agqzVar) {
        this.b.put(agqzVar.a, agqzVar);
        for (agxf agxfVar : this.d) {
            agxfVar.l(agqzVar);
        }
    }

    public abstract void n();

    protected abstract void o();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new agxl(this);
        if (this.e == null) {
            agyy agyyVar = new agyy(this, this.a);
            this.f = agyyVar;
            this.e = a(agyyVar);
        }
        this.d = new CopyOnWriteArraySet();
        this.h = new agxm(this);
        o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e.j();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.e.g(intent.getAction(), intent.getExtras());
        }
        this.g = false;
        return 1;
    }

    public final void p(agxf agxfVar) {
        Set set = this.d;
        agxfVar.getClass();
        if (!set.add(agxfVar) || !this.c) {
            return;
        }
        agxfVar.g();
    }
}
