package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayip  reason: default package */
/* loaded from: classes2.dex */
public final class ayip extends axzf {
    public final axyx a;
    private final axzq b;
    private final axye c;
    private final Executor d;
    private final ayax e;
    private axyd f;
    private axyg g;

    public ayip(axzq axzqVar, axye axyeVar, Executor executor, ayax ayaxVar, axyd axydVar) {
        this.b = axzqVar;
        this.c = axyeVar;
        this.e = ayaxVar;
        Executor executor2 = axydVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        axyd axydVar2 = new axyd(axydVar);
        axydVar2.c = executor;
        this.f = axydVar2;
        this.a = axyx.b();
    }

    @Override // defpackage.aybl, defpackage.axyg
    public final void b(String str, Throwable th) {
        axyg axygVar = this.g;
        if (axygVar != null) {
            axygVar.b(str, th);
        }
    }

    @Override // defpackage.axzf, defpackage.aybl
    protected final axyg f() {
        return this.g;
    }

    @Override // defpackage.axzf, defpackage.axyg
    public final void k(axzl axzlVar, ayat ayatVar) {
        new ayad(this.e, ayatVar, this.f);
        axzp a = this.b.a();
        Status status = a.a;
        if (status.f()) {
            ayjp b = ((ayjr) a.b).b(this.e);
            if (b != null) {
                this.f = this.f.d(ayjp.a, b);
            }
            axyg a2 = this.c.a(this.e, this.f);
            this.g = a2;
            a2.k(axzlVar, ayatVar);
            return;
        }
        this.d.execute(new ayio(this, axzlVar, status, null));
        this.g = ayji.h;
    }
}
