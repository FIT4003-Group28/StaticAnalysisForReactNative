package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cypz  reason: default package */
/* loaded from: classes5.dex */
final class cypz implements degu<cylk> {
    final /* synthetic */ List a;
    final /* synthetic */ cyqa b;

    public cypz(cyqa cyqaVar, List list) {
        this.b = cyqaVar;
        this.a = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cylk cylkVar) {
        cyge c;
        int a;
        cylk cylkVar2 = cylkVar;
        try {
            cypt cyptVar = this.b.e;
            HashSet<cygg> hashSet = new HashSet(this.a);
            final ArrayList arrayList = new ArrayList();
            dsht dshtVar = cylkVar2.a;
            if (dshtVar == null) {
                dshtVar = dsht.b;
            }
            for (dshs dshsVar : dshtVar.a) {
                dshl dshlVar = dshsVar.c;
                if (dshlVar == null) {
                    dshlVar = dshl.c;
                }
                cygf cygfVar = cygf.EMAIL;
                dshk dshkVar = dshk.EMAIL;
                int ordinal = dshk.a(dshlVar.a).ordinal();
                String str = "";
                if (ordinal == 0) {
                    c = cygg.c();
                    c.c(cygf.EMAIL);
                    if (dshlVar.a == 1) {
                        str = (String) dshlVar.b;
                    }
                } else if (ordinal == 1) {
                    c = cygg.c();
                    c.c(cygf.PHONE_NUMBER);
                    if (dshlVar.a == 2) {
                        str = (String) dshlVar.b;
                    }
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        throw new IllegalArgumentException();
                    }
                    throw new AssertionError(dshk.a(dshlVar.a));
                } else {
                    c = cygg.c();
                    c.c(cygf.PROFILE_ID);
                    if (dshlVar.a == 3) {
                        str = (String) dshlVar.b;
                    }
                }
                c.b(str);
                cygg a2 = c.a();
                int i = dshsVar.a;
                if (i == 2) {
                    hashSet.remove(a2);
                    arrayList.add(new cysi(a2.b().name(), a2.a(), ((cypv) cyptVar).a.b(), (dshsVar.a == 2 ? (dsgk) dshsVar.b : dsgk.c).bR()));
                } else if (i == 3) {
                    hashSet.remove(a2);
                    if (dshsVar.a == 3 && (a = dshr.a(((Integer) dshsVar.b).intValue())) != 0 && a == 2) {
                        arrayList.add(new cysi(a2.b().name(), a2.a(), ((cypv) cyptVar).a.b(), null));
                    }
                }
            }
            for (cygg cyggVar : hashSet) {
                arrayList.add(new cysi(cyggVar.b().name(), cyggVar.a(), ((cypv) cyptVar).a.b(), null));
            }
            final cypv cypvVar = (cypv) cyptVar;
            ((cypv) cyptVar).b.m(new Runnable(cypvVar, arrayList) { // from class: cypu
                private final cypv a;
                private final List b;

                {
                    this.a = cypvVar;
                    this.b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cypv cypvVar2 = this.a;
                    cypvVar2.b.h().d(this.b);
                    if (cypvVar2.b.h().g() > dyaz.a.a().f()) {
                        cypvVar2.b.h().c(decl.b(dyaz.a.a().e()));
                        cypvVar2.c.c(67, cyor.a);
                    }
                }
            });
        } catch (RuntimeException unused) {
            cypg.c(this.b.d, 22, 9, cyor.a);
        }
    }
}
