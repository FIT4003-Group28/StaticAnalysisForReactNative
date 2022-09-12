package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cwnz  reason: default package */
/* loaded from: classes5.dex */
final class cwnz {
    public final csqo a;
    public final cwkn b;
    public final String c;
    private final cwll d;

    static {
        cwjy.a();
    }

    public cwnz(Context context, csqo csqoVar, cwll cwllVar, cwkn cwknVar) {
        this.a = csqoVar;
        this.d = cwllVar;
        this.b = cwknVar;
        this.c = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<dcdc<cwls>> a(final dbrn<csqn, dehn<dhdi>> dbrnVar) {
        return dbae.a(this.d.a(), new defg(this, dbrnVar) { // from class: cwnx
            private final cwnz a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final cwnz cwnzVar = this.a;
                dbrn dbrnVar2 = this.b;
                final List<Account> list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                for (Account account : list) {
                    arrayList.add((dehn) dbrnVar2.a(cwnzVar.a.a(account)));
                }
                return new dbad(deha.l(arrayList)).a(new Callable(cwnzVar, list, arrayList) { // from class: cwny
                    private final cwnz a;
                    private final List b;
                    private final List c;

                    {
                        this.a = cwnzVar;
                        this.b = list;
                        this.c = arrayList;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cwkn cwknVar;
                        String str;
                        dhdi dhdiVar;
                        cwli cwliVar;
                        int i;
                        String str2;
                        cwkn cwknVar2;
                        String str3;
                        cwnz cwnzVar2 = this.a;
                        List list2 = this.b;
                        List list3 = this.c;
                        int size = list2.size();
                        dccx G = dcdc.G(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            cwlq k = cwls.k();
                            k.b(((Account) list2.get(i2)).name);
                            dehn dehnVar = (dehn) list3.get(i2);
                            dbsk.l(dehnVar.isDone());
                            String str4 = "OK";
                            try {
                                try {
                                    dhdiVar = (dhdi) dehf.a(dehnVar, MdiOwnersLoader$MdiException.class);
                                } catch (Throwable th) {
                                    cwnzVar2.b.g(str4, cwnzVar2.c);
                                    throw th;
                                }
                            } catch (MdiOwnersLoader$MdiException | deiw e) {
                                Throwable cause = e.getCause();
                                str4 = cwik.a(cause);
                                cnob cnobVar = (cnob) cwik.b(cause, cnob.class);
                                if (cnobVar != null) {
                                    int a = cnobVar.a();
                                    StringBuilder sb = new StringBuilder(24);
                                    sb.append("ApiException-");
                                    sb.append(a);
                                    str4 = sb.toString();
                                    if (a == 17) {
                                        throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException());
                                    }
                                    if (a == 10) {
                                        throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException());
                                    }
                                }
                                cwknVar = cwnzVar2.b;
                                str = cwnzVar2.c;
                            }
                            if (dhdiVar == null) {
                                str2 = "Absent";
                                cwknVar2 = cwnzVar2.b;
                                str3 = cwnzVar2.c;
                            } else if (dhdiVar.a.size() <= 0) {
                                str2 = "NoPerson";
                                cwknVar2 = cwnzVar2.b;
                                str3 = cwnzVar2.c;
                            } else {
                                dayc daycVar = dhdiVar.a.get(0).a;
                                if (daycVar == null) {
                                    daycVar = dayc.e;
                                }
                                if (daycVar.c.size() > 0) {
                                    dayl daylVar = daycVar.c.get(0);
                                    ((cwli) k).d = daylVar.a;
                                    k.h(new dsrh(daylVar.b, dayl.c).contains(dayg.GOOGLE_ONE_USER));
                                    k.j(new dsrh(daylVar.b, dayl.c).contains(dayg.GOOGLE_FAMILY_CHILD_USER) ? 2 : 3);
                                    k.g(new dsrh(daylVar.b, dayl.c).contains(dayg.GOOGLE_APPS_USER));
                                }
                                if (daycVar.a.size() > 0) {
                                    daya dayaVar = daycVar.a.get(0);
                                    int i3 = dayaVar.a;
                                    ((cwli) k).a = (i3 & 2) != 0 ? dayaVar.b : null;
                                    ((cwli) k).b = (i3 & 16) != 0 ? dayaVar.c : null;
                                    ((cwli) k).c = (i3 & 32) != 0 ? dayaVar.d : null;
                                }
                                dayi a2 = cssk.a(dhdiVar);
                                if (a2 != null && !a2.d) {
                                    ((cwli) k).e = a2.c;
                                }
                                if (daycVar.d.size() == 1) {
                                    int a3 = daxw.a(daycVar.d.get(0).a);
                                    if (a3 != 0 && a3 != 1) {
                                        if (a3 != 2) {
                                            i = 4;
                                            if (a3 != 4) {
                                                cwliVar = (cwli) k;
                                            } else {
                                                cwliVar = (cwli) k;
                                                i = 3;
                                            }
                                        } else {
                                            cwliVar = (cwli) k;
                                            i = 2;
                                        }
                                        cwliVar.f = i;
                                    }
                                    ((cwli) k).f = 1;
                                }
                                cwknVar = cwnzVar2.b;
                                str = cwnzVar2.c;
                                cwknVar.g(str4, str);
                                G.g(k.a());
                            }
                            cwknVar2.g(str2, str3);
                            G.g(k.a());
                        }
                        return G.f();
                    }
                }, dege.a);
            }
        }, dege.a);
    }
}
