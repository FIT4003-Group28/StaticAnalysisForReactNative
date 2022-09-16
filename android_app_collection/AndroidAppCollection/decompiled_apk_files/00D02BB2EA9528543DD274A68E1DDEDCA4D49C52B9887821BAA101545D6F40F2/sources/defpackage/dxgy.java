package defpackage;

import com.spotify.protocol.types.Types;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxgy  reason: default package */
/* loaded from: classes6.dex */
public final class dxgy implements dxgf {
    final /* synthetic */ dxgz a;

    public dxgy(dxgz dxgzVar) {
        this.a = dxgzVar;
    }

    @Override // defpackage.dxgf
    public final void a(Types.RequestId requestId, Types.SubscriptionId subscriptionId) {
        dxhk dxhkVar = this.a.c;
        dxhkVar.b.put(subscriptionId, requestId);
        if (dxhkVar.c(requestId) == null) {
            dxgt.b();
            dxgt.b.e();
        }
        dxhh<?> dxhhVar = this.a.c.d(subscriptionId).b;
        if (!dxhhVar.e()) {
            dxhg dxhgVar = dxhhVar.d;
        }
    }

    @Override // defpackage.dxgf
    public final void b(dxhq dxhqVar, String str) {
        dxgz dxgzVar = this.a;
        dxhi<?> e = dxgzVar.c.e(dxgzVar.a);
        if (e != null) {
            dxgz dxgzVar2 = this.a;
            dxgzVar2.c.f(dxgzVar2.a);
            e.b.g(dxgz.a(dxhqVar, str));
        }
    }

    @Override // defpackage.dxgf
    public final void c(Types.RequestId requestId, dxhq dxhqVar, String str) {
        dxhh<?> dxhhVar = this.a.c.c(requestId).b;
        this.a.c.a.remove(requestId);
        dxhhVar.g(dxgz.a(dxhqVar, str));
    }

    @Override // defpackage.dxgf
    public final void d(Types.RequestId requestId, dxhq dxhqVar, String str) {
        dxhi<?> e = this.a.c.e(requestId);
        if (e != null) {
            this.a.c.f(requestId);
            e.b.g(dxgz.a(dxhqVar, str));
        }
    }

    @Override // defpackage.dxgf
    public final void e(Types.SubscriptionId subscriptionId, dxhq dxhqVar) {
        dxhj<?> d = this.a.c.d(subscriptionId);
        if (d != null) {
            try {
                d.b.f(dxhe.b(dxhqVar.a(d.c)));
            } catch (Exception e) {
                d.b.g(e);
            }
        }
    }

    @Override // defpackage.dxgf
    public final void f(String str) {
        dxey dxeyVar;
        if (!"wamp.error.system_shutdown".equals(str) || (dxeyVar = this.a.d) == null) {
            return;
        }
        dxeyVar.a();
    }

    @Override // defpackage.dxgf
    public final void g(Types.RequestId requestId, dxhq dxhqVar) {
        dxhi<?> e = this.a.c.e(requestId);
        if (e != null) {
            this.a.c.f(requestId);
            e.a(dxhqVar);
        }
    }

    @Override // defpackage.dxgf
    public final void h() {
    }

    @Override // defpackage.dxgf
    public final void i(dxhq dxhqVar) {
        dxgz dxgzVar = this.a;
        dxhi<?> e = dxgzVar.c.e(dxgzVar.a);
        if (e != null) {
            dxgz dxgzVar2 = this.a;
            dxgzVar2.c.f(dxgzVar2.a);
            e.a(dxhqVar);
        }
    }
}
