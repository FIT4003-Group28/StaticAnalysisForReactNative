package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pbh  reason: default package */
/* loaded from: classes7.dex */
public final class pbh<T> implements dzsj<T> {
    final /* synthetic */ pbi a;
    private final int b;

    public pbh(pbi pbiVar, int i) {
        this.a = pbiVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Set emptySet;
        Object obj;
        Object obj2;
        switch (this.b) {
            case 0:
                return (T) this.a.e();
            case 1:
                return (T) this.a.a();
            case 2:
                if (dxyd.b()) {
                    emptySet = Collections.singleton(drtm.USER_FEEDBACK_IHNR);
                } else {
                    emptySet = Collections.emptySet();
                }
                dxjg.f(emptySet);
                return (T) dcep.K(emptySet);
            case 3:
                pbi pbiVar = this.a;
                Object obj3 = pbiVar.g;
                if (obj3 instanceof dxjf) {
                    synchronized (obj3) {
                        obj = pbiVar.g;
                        if (obj instanceof dxjf) {
                            Context context = pbiVar.a;
                            obj = new cvma(context, new pbn(context, pbiVar.c, pbiVar.d, pbiVar.e, pbiVar.f));
                            dxjc.d(pbiVar.g, obj);
                            pbiVar.g = obj;
                        }
                    }
                    obj3 = obj;
                }
                return (T) ((cvma) obj3);
            case 4:
                return (T) this.a.d();
            case 5:
                return (T) this.a.f();
            case 6:
                return (T) this.a.g();
            case 7:
                return (T) this.a.h();
            case 8:
                return (T) this.a.i();
            case 9:
                return (T) this.a.j();
            case 10:
                return (T) this.a.k();
            case 11:
                return (T) this.a.l();
            case 12:
                T t = (T) this.a.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
                dxjg.f(t);
                return t;
            case 13:
                return (T) Boolean.valueOf(dxxn.a.a().a());
            case 14:
                return (T) Long.valueOf(dxxn.a.a().b());
            default:
                pbi pbiVar2 = this.a;
                Object obj4 = pbiVar2.h;
                if (obj4 instanceof dxjf) {
                    synchronized (obj4) {
                        obj2 = pbiVar2.h;
                        if (obj2 instanceof dxjf) {
                            obj2 = new cvou(pbiVar2.a, pbiVar2.b, pbiVar2.a());
                            dxjc.d(pbiVar2.h, obj2);
                            pbiVar2.h = obj2;
                        }
                    }
                    obj4 = obj2;
                }
                return (T) dcdn.m(1, (cvou) obj4, 2, new cvoz(pbiVar2.c(), pbiVar2.b, pbiVar2.a()), 3, new cvpz((cvtz) pbiVar2.m(), pbiVar2.b(), pbiVar2.a()));
        }
    }
}
