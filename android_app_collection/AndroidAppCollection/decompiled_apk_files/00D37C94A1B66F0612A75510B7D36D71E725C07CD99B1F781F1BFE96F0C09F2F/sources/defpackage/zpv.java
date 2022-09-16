package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zpv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zpv implements zdt {
    public final /* synthetic */ zqq a;
    public final /* synthetic */ zrp b;
    private final /* synthetic */ int c;

    public /* synthetic */ zpv(zqq zqqVar, zrp zrpVar) {
        this.a = zqqVar;
        this.b = zrpVar;
    }

    public /* synthetic */ zpv(zqq zqqVar, zrp zrpVar, int i) {
        this.c = i;
        this.a = zqqVar;
        this.b = zrpVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            zqq zqqVar = this.a;
            zqqVar.l = new zpp(this.b, (Map) obj);
            zqqVar.l.b = zqqVar.r;
            return;
        }
        final zqq zqqVar2 = this.a;
        final zso zsoVar = (zso) obj;
        zqqVar2.d.add(this.b.c(new zrl() { // from class: zqk
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, zpt] */
            @Override // defpackage.zdt
            public final void a(Object obj2) {
                final zqq zqqVar3 = zqq.this;
                final zso zsoVar2 = zsoVar;
                final zrg zrgVar = (zrg) obj2;
                synchronized (zqqVar3.d) {
                    List list = zqqVar3.d;
                    zrp zrpVar = zqqVar3.c;
                    final ?? r5 = new zdt() { // from class: zpt
                        @Override // defpackage.zdt
                        public final void a(Object obj3) {
                            zqq zqqVar4 = zqq.this;
                            zso zsoVar3 = zsoVar2;
                            zrg zrgVar2 = zrgVar;
                            List list2 = (List) obj3;
                            if (!zqqVar4.j.h()) {
                                boolean z = false;
                                if (zrgVar2 != null && zrgVar2.a(avxv.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS)) {
                                    z = true;
                                }
                                zqqVar4.t(list2, zsoVar3, z);
                                return;
                            }
                            zqqVar4.j.d(list2);
                        }
                    };
                    synchronized (((zsc) zrpVar).m) {
                        List list2 = ((zsc) zrpVar).s;
                        if (list2 != null) {
                            r5.a(list2);
                        }
                        zxq.b(((zsc) zrpVar).m, r5);
                    }
                    final zsc zscVar = (zsc) zrpVar;
                    list.add(new zrj() { // from class: zrw
                        @Override // defpackage.zrj
                        public final void a() {
                            zsc zscVar2 = zsc.this;
                            zpt zptVar = r5;
                            synchronized (zscVar2.m) {
                                zscVar2.m.remove(zptVar);
                            }
                        }
                    });
                }
            }
        }));
    }
}
