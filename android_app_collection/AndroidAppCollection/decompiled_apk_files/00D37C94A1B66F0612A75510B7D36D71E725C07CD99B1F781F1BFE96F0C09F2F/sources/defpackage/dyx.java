package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dyx implements ayqe {
    public final /* synthetic */ dyz a;
    private final /* synthetic */ int b;

    public /* synthetic */ dyx(dyz dyzVar) {
        this.a = dyzVar;
    }

    public /* synthetic */ dyx(dyz dyzVar, int i) {
        this.b = i;
        this.a = dyzVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            Callable callable = (Callable) obj;
            return new azmw((Executor) this.a.j.get());
        } else if (i == 1) {
            Callable callable2 = (Callable) obj;
            return new azmw(this.a.i);
        } else if (i == 2) {
            Callable callable3 = (Callable) obj;
            return new azmw(this.a.i);
        } else {
            Callable callable4 = (Callable) obj;
            return new azmw((Executor) this.a.k.get());
        }
    }
}
