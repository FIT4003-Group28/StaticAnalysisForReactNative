package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ctlj  reason: default package */
/* loaded from: classes5.dex */
public final class ctlj<ModelT> extends ctlg<Pair<dcdc<ModelT>, Boolean>> {
    public final dbrn<Cursor, dcdc<ModelT>> e;
    private final dbsl<ModelT> h;
    private final cswe i;

    public ctlj(Context context, final dbrn dbrnVar, ctir ctirVar, Uri uri, ctlp ctlpVar) {
        super(context, new dbrn(dbrnVar) { // from class: ctlh
            private final dbrn a;

            {
                this.a = dbrnVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Pair.create((dcdc) this.a.a((Cursor) obj), false);
            }
        }, ctirVar, uri, ctlpVar);
        dbsk.t(ctlpVar.h(), "filterPredicate isn't valid in parent monitor");
        this.e = dbrnVar;
        this.h = (dbsl<ModelT>) ctlpVar.h();
        this.i = cswe.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ctlg
    public final /* bridge */ /* synthetic */ Object d() {
        dcdc<ModelT> f;
        boolean z;
        cstq.a();
        final int f2 = this.b.f();
        if (f2 == -1 || f2 < 0) {
            f = f((dcdc) ((Pair) super.d()).first);
            z = false;
        } else if (f2 != 0) {
            final int intValue = this.i.m.f().intValue();
            if (intValue <= 0) {
                intValue = this.i.n.f().intValue() * f2;
            }
            final dccx dccxVar = new dccx();
            return (Pair) ctiv.b(this.d, new Callable(this, intValue, dccxVar, f2) { // from class: ctli
                private final ctlj a;
                private final int b;
                private final dccx c;
                private final int d;

                {
                    this.a = this;
                    this.b = intValue;
                    this.c = dccxVar;
                    this.d = f2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ctlj ctljVar = this.a;
                    int i = this.b;
                    dccx dccxVar2 = this.c;
                    int i2 = this.d;
                    int g = ctljVar.b.g();
                    int i3 = 0;
                    while (true) {
                        ctir ctirVar = ctljVar.d;
                        ctlf ctlfVar = ctljVar.c;
                        Cursor a = ctirVar.a(ctlfVar.j, ctlfVar.k, ctlfVar.l, ctlfVar.m, ctlfVar.n, ctlj.e(g, i));
                        try {
                            dcdc dcdcVar = (dcdc) ctljVar.e.a(a);
                            if (!dcdcVar.isEmpty()) {
                                dcdc f3 = ctljVar.f(dcdcVar);
                                dccxVar2.i(f3);
                                i3 += f3.size();
                                g += dcdcVar.size();
                                if (a != null) {
                                    a.close();
                                    continue;
                                }
                                if (i3 >= i2) {
                                    break;
                                }
                            } else if (a != null) {
                                a.close();
                            }
                        } catch (Throwable th) {
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                            }
                            throw th;
                        }
                    }
                    return Pair.create(dccxVar2.f().subList(0, Math.min(i3, i2)), Boolean.valueOf(i3 >= i2));
                }
            });
        } else {
            cstl.a("FilterLstMonitor");
            f = dcdc.e();
            z = true;
        }
        return Pair.create(f, Boolean.valueOf(z));
    }

    public final dcdc<ModelT> f(dcdc<ModelT> dcdcVar) {
        return dcdc.q(dcft.i(dcdcVar, this.h));
    }
}
