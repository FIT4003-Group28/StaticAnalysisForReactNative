package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aief  reason: default package */
/* loaded from: classes2.dex */
public final class aief implements aijb, aila {
    public final aijc a;
    public final ailb<aigo> b;
    public final ailb<aiik> c;
    public final aidh d;
    public aiee e;
    private final Executor f;

    public aief(aijc aijcVar, ailb<aigo> ailbVar, ailb<aiik> ailbVar2, aidh aidhVar, Executor executor) {
        this.a = aijcVar;
        this.b = ailbVar;
        this.c = ailbVar2;
        this.d = aidhVar;
        this.f = executor;
    }

    public final boolean a() {
        return this.a.b();
    }

    @Override // defpackage.aila
    public final void b(dbsg<btlu> dbsgVar) {
        this.f.execute(new Runnable(this) { // from class: aied
            private final aief a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        });
    }

    public final List<PersonId> c(dbsg<btlu> dbsgVar) {
        dbsg<aiik> b = this.c.b(dbsgVar);
        if (b.a()) {
            return dcdc.q(dcft.o(b.b().c, aieb.a));
        }
        return dcdc.e();
    }

    @Override // defpackage.aijb
    public final void d() {
        this.f.execute(new Runnable(this) { // from class: aiec
            private final aief a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        });
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        aiee aieeVar = this.e;
        if (aieeVar != null) {
            aidy aidyVar = (aidy) aieeVar;
            btlu btluVar = aidyVar.d;
            aidyVar.g(btluVar, btluVar);
        }
    }
}
