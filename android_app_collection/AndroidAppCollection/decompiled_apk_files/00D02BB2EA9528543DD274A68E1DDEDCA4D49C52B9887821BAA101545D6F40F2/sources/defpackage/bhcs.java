package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bhcs  reason: default package */
/* loaded from: classes3.dex */
public final class bhcs {
    static final dcdn<dgdr, String> a;
    public static final /* synthetic */ int b = 0;

    static {
        dcdg p = dcdn.p();
        p.f(dgdr.OPEN_HELP_CENTER_ADWORDS, "android_task_ads");
        p.f(dgdr.OPEN_HELP_CENTER_MISSING_BUSINESS_INFO, "android_task_info");
        p.f(dgdr.OPEN_HELP_CENTER_PHOTOS, "android_task_photos");
        p.f(dgdr.OPEN_HELP_CENTER_REVIEWS_SHARE, "android_task_reviews_more");
        p.f(dgdr.OPEN_HELP_CENTER_REVIEWS_REPLY, "android_task_reviews_respond");
        p.f(dgdr.OPEN_HELP_CENTER_CUSTOMER_PHOTOS, "android_task_photos_user");
        a = p.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static jht a(final dged dgedVar, final bhdj bhdjVar, @dzsi ilo iloVar, int i) {
        ddho ddhoVar;
        ArrayList arrayList = new ArrayList();
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        for (final dgdw dgdwVar : dgecVar.e) {
            jhm a2 = jhm.a();
            a2.a = dgdwVar.b;
            int a3 = dgdt.a(dgdwVar.f);
            if (a3 == 0) {
                a3 = 1;
            }
            int i2 = a3 - 1;
            if (i2 != 1) {
                ddhoVar = i2 != 2 ? dtxv.bw : dtxv.by;
            } else {
                ddhoVar = dtxv.bx;
            }
            a2.f = bhco.b(ddhoVar, dgedVar, iloVar, i);
            int a4 = dgdv.a(dgdwVar.c);
            if (a4 == 0) {
                a4 = 1;
            }
            int i3 = a4 - 1;
            if (i3 == 1) {
                a2.d(new View.OnClickListener(bhdjVar, dgedVar) { // from class: bhcp
                    private final bhdj a;
                    private final dged b;

                    {
                        this.a = bhdjVar;
                        this.b = dgedVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bhdj bhdjVar2 = this.a;
                        dged dgedVar2 = this.b;
                        int i4 = bhcs.b;
                        bhdjVar2.b(dgedVar2);
                    }
                });
                arrayList.add(a2.c());
            } else if (i3 == 4) {
                if ((dgdwVar.a & 16) != 0) {
                    dcdn<dgdr, String> dcdnVar = a;
                    dgdr b2 = dgdr.b(dgdwVar.e);
                    if (b2 == null) {
                        b2 = dgdr.UNKNOWN_CTA_INTENT;
                    }
                    if (dcdnVar.containsKey(b2)) {
                        a2.d(new View.OnClickListener(bhdjVar, dgdwVar) { // from class: bhcq
                            private final bhdj a;
                            private final dgdw b;

                            {
                                this.a = bhdjVar;
                                this.b = dgdwVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bhdj bhdjVar2 = this.a;
                                dgdw dgdwVar2 = this.b;
                                dcdn<dgdr, String> dcdnVar2 = bhcs.a;
                                dgdr b3 = dgdr.b(dgdwVar2.e);
                                if (b3 == null) {
                                    b3 = dgdr.UNKNOWN_CTA_INTENT;
                                }
                                String str = dcdnVar2.get(b3);
                                dbsk.s(str);
                                bhdjVar2.j(str);
                            }
                        });
                        arrayList.add(a2.c());
                    }
                }
                dgbo dgboVar = dgdwVar.d;
                if (dgboVar == null) {
                    dgboVar = dgbo.e;
                }
                if ((dgboVar.a & 2) != 0) {
                    a2.d(new View.OnClickListener(bhdjVar, dgdwVar) { // from class: bhcr
                        private final bhdj a;
                        private final dgdw b;

                        {
                            this.a = bhdjVar;
                            this.b = dgdwVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bhdj bhdjVar2 = this.a;
                            dgdw dgdwVar2 = this.b;
                            int i4 = bhcs.b;
                            dgbo dgboVar2 = dgdwVar2.d;
                            if (dgboVar2 == null) {
                                dgboVar2 = dgbo.e;
                            }
                            bhdjVar2.c(dgboVar2.c);
                        }
                    });
                    arrayList.add(a2.c());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        jhu h = jhv.h();
        h.e(arrayList);
        h.c(bhco.b(dtxv.bz, dgedVar, iloVar, i));
        ((jhi) h).e = bhdjVar.o(dgedVar);
        return h.b();
    }
}
